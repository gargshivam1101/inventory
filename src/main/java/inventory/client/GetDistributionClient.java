package inventory.client;

import java.io.IOException;
import inventory.grpc.DistributionRequest;
import inventory.grpc.PercentileValue;
import inventory.grpc.inventoryGrpc;
import inventory.grpc.inventoryGrpc.inventoryBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GetDistributionClient {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
    
    inventoryBlockingStub inventoryStub = inventoryGrpc.newBlockingStub(channel);
    DistributionRequest request =
        DistributionRequest.newBuilder().setKeyName("QTY").setPercentile(50).build();
    PercentileValue resp = inventoryStub.getDistribution(request);
    
    System.out.println(resp);
  }
}
