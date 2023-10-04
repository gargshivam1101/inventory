package inventory.service;

import inventory.grpc.InventoryRecord;
import inventory.grpc.SearchByIDRequest;
import inventory.grpc.inventoryGrpc.inventoryImplBase;
import io.grpc.stub.StreamObserver;

public class InventoryService extends inventoryImplBase {
  
  @Override
  public void searchByID(SearchByIDRequest request,
      StreamObserver<InventoryRecord> responseObserver) {
    System.out.println("Fn called for SKU " + request.getSKU());
    // perform the searching
    InventoryRecord.Builder resp = InventoryRecord.newBuilder();
    resp.setBIN("1");
    resp.setLOCATION("ON TOP");
    // set all resp and dont hardcode
    
    responseObserver.onNext(resp.build());
    responseObserver.onCompleted();
  } 
}
