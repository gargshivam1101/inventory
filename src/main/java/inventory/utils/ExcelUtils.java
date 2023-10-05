package inventory.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
  
  public static Map<String, Map<String, String>> readData() {
    try {
      FileInputStream excelFile = new FileInputStream(new File("tf02930030.xltm"));
      Workbook workbook = new XSSFWorkbook(excelFile);
      Sheet sheet = workbook.getSheetAt(0);
      
      Map<String, Map<String, String>> excelData = new HashMap<>();
      
      Row headerRow = sheet.getRow(3);
      FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
      
      for (Row row : sheet) {
        if (row.getRowNum() < 3) {
          continue; // Skip the header rows
        }
        
        Map<String, String> rowData = new HashMap<>();
        for (Cell cell : row) {
          int columnIndex = cell.getColumnIndex();
          String columnName = headerRow.getCell(columnIndex).getStringCellValue();
          String cellValue = "";
          
          switch (cell.getCellType()) {
            case STRING:
              cellValue = cell.getStringCellValue();
              break;
            case NUMERIC:
              if (DateUtil.isCellDateFormatted(cell)) {
                cellValue = cell.getDateCellValue().toString();
              } else {
                cellValue = String.valueOf(cell.getNumericCellValue());
              }
              break;
            case FORMULA:
              cellValue = evaluateFormulaCell(cell, formulaEvaluator);
              break;
            default:
              break;
          }
          rowData.put(columnName, cellValue);
        }
        
        String uniqueKey = rowData.get("SKU");
        excelData.put(uniqueKey, rowData);
      }
      
      workbook.close();
      
      // to retrieve data for a specific row:
      // Map<String, String> specificRow = excelData.get("UniqueKey");
      
      // To update a value in a specific row:
      // specificRow.put("ColumnName", "NewValue");
      
      for (Map.Entry<String, Map<String, String>> entry : excelData.entrySet()) {
        // iterate
        String uniqueKey = entry.getKey();
        Map<String, String> rowData = entry.getValue();
        System.out.println("key: " + uniqueKey + " and value: " + rowData);
      }
      return excelData;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
  private static String evaluateFormulaCell(Cell cell, FormulaEvaluator formulaEvaluator) {
    try {
      
      CellValue cellValue = formulaEvaluator.evaluate(cell);
      switch (cellValue.getCellType()) {
        case STRING:
          return cellValue.getStringValue();
        case NUMERIC:
          return String.valueOf(cellValue.getNumberValue());
        case BOOLEAN:
          return String.valueOf(cellValue.getBooleanValue());
        default:
          return "";
      }
    } catch (Exception e) {
      // TODO: LOCATION column not working
      return "";
    }
  }
}
