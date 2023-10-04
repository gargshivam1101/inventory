package inventory.server;

import java.io.IOException;
import inventory.service.InventoryService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    Server server  = ServerBuilder.forPort(9090).addService(new InventoryService()).build();
    
    server.start();
    
    System.out.println("Server started at " + server.getPort());
    server.awaitTermination();
  }
}
