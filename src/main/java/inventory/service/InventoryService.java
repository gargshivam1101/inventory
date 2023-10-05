package inventory.service;

import java.util.Map;
import inventory.grpc.InventoryRecord;
import inventory.grpc.SearchByIDRequest;
import inventory.grpc.inventoryGrpc.inventoryImplBase;
import inventory.utils.ExcelUtils;
import io.grpc.stub.StreamObserver;

public class InventoryService extends inventoryImplBase {
  
  @Override
  public void searchByID(SearchByIDRequest request,
      StreamObserver<InventoryRecord> responseObserver) {
    System.out.println("Fn called for SKU " + request.getSKU());
    // perform the searching
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
    if ("1.0".equalsIgnoreCase(record.get("REORDER"))) {
      resp.setREORDER(true);
    } else {
      resp.setREORDER(false);
    }
    
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  }
}
