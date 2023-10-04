package inventory.client;

import java.io.IOException;
import inventory.grpc.InventoryRecord;
import inventory.grpc.SearchByIDRequest;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
  ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

  inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
  SearchByIDRequest request = SearchByIDRequest.newBuilder().setSKU("1").build();
  InventoryRecord resp = inventoryStub.searchByID(request);
  System.out.println(resp);
  }
}
