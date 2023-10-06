package inventory.client;

import java.io.IOException;
import inventory.grpc.InventoryRecords;
import inventory.grpc.SearchRequest;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SearchClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
    
    inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
    
    SearchRequest request =
        SearchRequest.newBuilder().setKeyName("BIN #").setKeyValue("T345").build();
    InventoryRecords resp = inventoryStub.search(request);
    System.out.println(resp);
  }
}
