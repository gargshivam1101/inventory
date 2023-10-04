package inventory.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: InventoryRecord.proto")
public final class inventoryGrpc {

  private inventoryGrpc() {}

  public static final String SERVICE_NAME = "inventory.inventory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<inventory.grpc.SearchByIDRequest,
      inventory.grpc.InventoryRecord> getSearchByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByID",
      requestType = inventory.grpc.SearchByIDRequest.class,
      responseType = inventory.grpc.InventoryRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventory.grpc.SearchByIDRequest,
      inventory.grpc.InventoryRecord> getSearchByIDMethod() {
    io.grpc.MethodDescriptor<inventory.grpc.SearchByIDRequest, inventory.grpc.InventoryRecord> getSearchByIDMethod;
    if ((getSearchByIDMethod = inventoryGrpc.getSearchByIDMethod) == null) {
      synchronized (inventoryGrpc.class) {
        if ((getSearchByIDMethod = inventoryGrpc.getSearchByIDMethod) == null) {
          inventoryGrpc.getSearchByIDMethod = getSearchByIDMethod = 
              io.grpc.MethodDescriptor.<inventory.grpc.SearchByIDRequest, inventory.grpc.InventoryRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.inventory", "searchByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.SearchByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.InventoryRecord.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMethodDescriptorSupplier("searchByID"))
                  .build();
          }
        }
     }
     return getSearchByIDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static inventoryStub newStub(io.grpc.Channel channel) {
    return new inventoryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static inventoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new inventoryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static inventoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new inventoryFutureStub(channel);
  }

  /**
   */
  public static abstract class inventoryImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchByID(inventory.grpc.SearchByIDRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecord> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByIDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                inventory.grpc.SearchByIDRequest,
                inventory.grpc.InventoryRecord>(
                  this, METHODID_SEARCH_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class inventoryStub extends io.grpc.stub.AbstractStub<inventoryStub> {
    private inventoryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryStub(channel, callOptions);
    }

    /**
     */
    public void searchByID(inventory.grpc.SearchByIDRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecord> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class inventoryBlockingStub extends io.grpc.stub.AbstractStub<inventoryBlockingStub> {
    private inventoryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public inventory.grpc.InventoryRecord searchByID(inventory.grpc.SearchByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchByIDMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class inventoryFutureStub extends io.grpc.stub.AbstractStub<inventoryFutureStub> {
    private inventoryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventory.grpc.InventoryRecord> searchByID(
        inventory.grpc.SearchByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final inventoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(inventoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_BY_ID:
          serviceImpl.searchByID((inventory.grpc.SearchByIDRequest) request,
              (io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecord>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class inventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    inventoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return inventory.grpc.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("inventory");
    }
  }

  private static final class inventoryFileDescriptorSupplier
      extends inventoryBaseDescriptorSupplier {
    inventoryFileDescriptorSupplier() {}
  }

  private static final class inventoryMethodDescriptorSupplier
      extends inventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    inventoryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (inventoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new inventoryFileDescriptorSupplier())
              .addMethod(getSearchByIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
