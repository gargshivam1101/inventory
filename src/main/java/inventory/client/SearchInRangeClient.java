package inventory.client;

import java.io.IOException;
import inventory.grpc.InventoryRecords;
import inventory.grpc.SearchInRangeRequest;
import inventory.grpc.SearchRequest;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SearchInRangeClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("3.80.109.141", 9090).usePlaintext().build();
    
    inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
    
    SearchInRangeRequest request = SearchInRangeRequest.newBuilder().setKeyName("COST")
        .setKeyValueStart("7").setKeyValueEnd("13").build();
    InventoryRecords resp = inventoryStub.searchInRange(request);
    System.out.println(resp);
  }
}
