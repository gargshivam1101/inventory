package inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import inventory.grpc.InventoryRecord;
import inventory.grpc.InventoryRecords;
import inventory.grpc.SearchByIDRequest;
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
      String uniqueKey = entry.getKey();
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
}
