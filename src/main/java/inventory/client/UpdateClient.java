package inventory.client;

import java.io.IOException;
import inventory.grpc.UpdateRequest;
import inventory.grpc.UpdateResp;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UpdateClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("3.80.109.141", 9090).usePlaintext().build();
    
    inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
    
    UpdateRequest request = UpdateRequest.newBuilder().setKeyName("SKU")
        .setKeyValue("YE98767").setValName("DESCRIPTION").setValValNew("New Item").build();
    UpdateResp resp = inventoryStub.update(request);
    System.out.println(resp);
  }
}
