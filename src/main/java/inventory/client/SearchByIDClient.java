package inventory.client;

import java.io.IOException;
import inventory.grpc.InventoryRecord;
import inventory.grpc.SearchByIDRequest;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SearchByIDClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("3.80.109.141", 9090).usePlaintext().build();
    
    inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
     SearchByIDRequest request = SearchByIDRequest.newBuilder().setSKU("PW98762").build();
     InventoryRecord resp = inventoryStub.searchByID(request);
    
    System.out.println(resp);
  }
}
