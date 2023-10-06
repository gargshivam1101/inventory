package inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.stat.descriptive.rank.Percentile;
import inventory.grpc.DistributionRequest;
import inventory.grpc.InventoryRecord;
import inventory.grpc.InventoryRecords;
import inventory.grpc.PercentileValue;
import inventory.grpc.SearchByIDRequest;
import inventory.grpc.SearchInRangeRequest;
import inventory.grpc.SearchRequest;
import inventory.grpc.inventoryGrpc.inventoryImplBase;
import inventory.utils.ExcelUtils;
import io.grpc.stub.StreamObserver;

public class InventoryService extends inventoryImplBase {
  
  @Override
  public void searchByID(SearchByIDRequest request,
      StreamObserver<InventoryRecord> responseObserver) {
    System.out.println("Search by ID called for SKU " + request.getSKU());
    InventoryRecord.Builder resp = InventoryRecord.newBuilder();
    Map<String, Map<String, String>> data = ExcelUtils.readData();
    
    Map<String, String> record = data.get(request.getSKU());
    resp.setSKU(record.get("SKU"));
    resp.setDESCRIPTION(record.get("DESCRIPTION"));
    resp.setBIN(record.get("BIN #"));
    resp.setLOCATION(record.get("LOCATION"));
    resp.setUNIT(record.get("UNIT"));
    resp.setQTY(Float.parseFloat(record.get("QTY")));
    resp.setREORDERQTY(Float.parseFloat(record.get("REORDER QTY")));
    resp.setCOST(Float.parseFloat(record.get("COST")));
    resp.setINVENTORYVALUE(Float.parseFloat(record.get("INVENTORY VALUE")));
    resp.setREORDER("1.0".equalsIgnoreCase(record.get("REORDER")));
    
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  }
  
  
  @Override
  public void search(SearchRequest request, StreamObserver<InventoryRecords> responseObserver) {
    System.out.println("Search called according to key name " + request.getKeyName());
    
    
    InventoryRecords.Builder resp = InventoryRecords.newBuilder();
    Map<String, Map<String, String>> data = ExcelUtils.readData();
    List<InventoryRecord> respList = new ArrayList<InventoryRecord>();
    for (Map.Entry<String, Map<String, String>> entry : data.entrySet()) {
      Map<String, String> rowData = entry.getValue();
      
      if (request.getKeyValue().equalsIgnoreCase(rowData.get(request.getKeyName()))) {
        // this is the InventoryRecord which should be a part of our resp
        InventoryRecord inv = InventoryRecord.newBuilder()//
            .setSKU(rowData.get("SKU"))//
            .setDESCRIPTION(rowData.get("DESCRIPTION"))//
            .setBIN(rowData.get("BIN #"))//
            .setLOCATION(rowData.get("LOCATION"))//
            .setUNIT(rowData.get("UNIT"))//
            .setQTY(Float.parseFloat(rowData.get("QTY")))//
            .setREORDERQTY(Float.parseFloat(rowData.get("REORDER QTY")))//
            .setCOST(Float.parseFloat(rowData.get("COST")))//
            .setINVENTORYVALUE(Float.parseFloat(rowData.get("INVENTORY VALUE")))//
            .setREORDER("1.0".equalsIgnoreCase(rowData.get("REORDER")))//
            .build();
        respList.add(inv);
      }
    }
    resp.addAllRecords(respList);
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  }
  
  
  @Override
  public void searchInRange(SearchInRangeRequest request,
      StreamObserver<InventoryRecords> responseObserver) {
    System.out.println("Search in range called according to key name " + request.getKeyName());
    
    InventoryRecords.Builder resp = InventoryRecords.newBuilder();
    Map<String, Map<String, String>> data = ExcelUtils.readData();
    List<InventoryRecord> respList = new ArrayList<InventoryRecord>();
    for (Map.Entry<String, Map<String, String>> entry : data.entrySet()) {
      Map<String, String> rowData = entry.getValue();
      
      try {
        float actualValue = Float.parseFloat(rowData.get(request.getKeyName()));
        float lowerLimit = Float.parseFloat(request.getKeyValueStart());
        float upperLimit = Float.parseFloat(request.getKeyValueEnd());
        
        
        if (lowerLimit <= actualValue && actualValue <= upperLimit) {
          // this is the InventoryRecord which should be a part of our resp
          InventoryRecord inv = InventoryRecord.newBuilder()//
              .setSKU(rowData.get("SKU"))//
              .setDESCRIPTION(rowData.get("DESCRIPTION"))//
              .setBIN(rowData.get("BIN #"))//
              .setLOCATION(rowData.get("LOCATION"))//
              .setUNIT(rowData.get("UNIT"))//
              .setQTY(Float.parseFloat(rowData.get("QTY")))//
              .setREORDERQTY(Float.parseFloat(rowData.get("REORDER QTY")))//
              .setCOST(Float.parseFloat(rowData.get("COST")))//
              .setINVENTORYVALUE(Float.parseFloat(rowData.get("INVENTORY VALUE")))//
              .setREORDER("1.0".equalsIgnoreCase(rowData.get("REORDER")))//
              .build();
          respList.add(inv);
        }
      } catch (Exception e) {
        System.out.println("Incorrect input");
      }
    }
    resp.addAllRecords(respList);
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  }
  
  
  
  @Override
  public void getDistribution(DistributionRequest request,
      StreamObserver<PercentileValue> responseObserver) {
    System.out.println("Get distribution called according to key name " + request.getKeyName());
    
    PercentileValue.Builder resp = PercentileValue.newBuilder();
    Map<String, Map<String, String>> data = ExcelUtils.readData();
    
    // store whole data of that key name in a list
    List<Float> dataOfKey = new ArrayList<Float>();
    
    for (Map.Entry<String, Map<String, String>> entry : data.entrySet()) {
      try {
        Map<String, String> rowData = entry.getValue();
        String valueAsString = rowData.get(request.getKeyName());
        float valueAsFloat = Float.parseFloat(valueAsString);
        dataOfKey.add(valueAsFloat);
      } catch (Exception e) {
        System.out.println("The key selected doesnt have all values in correct format");
      }
    }
    double percentile = request.getPercentile();
    double[] arrayOfData = dataOfKey.stream().mapToDouble(Float::doubleValue).toArray();
    Percentile percentileCalculator = new Percentile(percentile);
    
    double percentileValue = percentileCalculator.evaluate(arrayOfData, percentile);
    resp.setPercentileValue((float) percentileValue);
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  }
  
}
