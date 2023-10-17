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

  private static volatile io.grpc.MethodDescriptor<inventory.grpc.SearchRequest,
      inventory.grpc.InventoryRecords> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = inventory.grpc.SearchRequest.class,
      responseType = inventory.grpc.InventoryRecords.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventory.grpc.SearchRequest,
      inventory.grpc.InventoryRecords> getSearchMethod() {
    io.grpc.MethodDescriptor<inventory.grpc.SearchRequest, inventory.grpc.InventoryRecords> getSearchMethod;
    if ((getSearchMethod = inventoryGrpc.getSearchMethod) == null) {
      synchronized (inventoryGrpc.class) {
        if ((getSearchMethod = inventoryGrpc.getSearchMethod) == null) {
          inventoryGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<inventory.grpc.SearchRequest, inventory.grpc.InventoryRecords>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.inventory", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.InventoryRecords.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventory.grpc.SearchInRangeRequest,
      inventory.grpc.InventoryRecords> getSearchInRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchInRange",
      requestType = inventory.grpc.SearchInRangeRequest.class,
      responseType = inventory.grpc.InventoryRecords.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventory.grpc.SearchInRangeRequest,
      inventory.grpc.InventoryRecords> getSearchInRangeMethod() {
    io.grpc.MethodDescriptor<inventory.grpc.SearchInRangeRequest, inventory.grpc.InventoryRecords> getSearchInRangeMethod;
    if ((getSearchInRangeMethod = inventoryGrpc.getSearchInRangeMethod) == null) {
      synchronized (inventoryGrpc.class) {
        if ((getSearchInRangeMethod = inventoryGrpc.getSearchInRangeMethod) == null) {
          inventoryGrpc.getSearchInRangeMethod = getSearchInRangeMethod = 
              io.grpc.MethodDescriptor.<inventory.grpc.SearchInRangeRequest, inventory.grpc.InventoryRecords>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.inventory", "searchInRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.SearchInRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.InventoryRecords.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMethodDescriptorSupplier("searchInRange"))
                  .build();
          }
        }
     }
     return getSearchInRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventory.grpc.DistributionRequest,
      inventory.grpc.PercentileValue> getGetDistributionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDistribution",
      requestType = inventory.grpc.DistributionRequest.class,
      responseType = inventory.grpc.PercentileValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventory.grpc.DistributionRequest,
      inventory.grpc.PercentileValue> getGetDistributionMethod() {
    io.grpc.MethodDescriptor<inventory.grpc.DistributionRequest, inventory.grpc.PercentileValue> getGetDistributionMethod;
    if ((getGetDistributionMethod = inventoryGrpc.getGetDistributionMethod) == null) {
      synchronized (inventoryGrpc.class) {
        if ((getGetDistributionMethod = inventoryGrpc.getGetDistributionMethod) == null) {
          inventoryGrpc.getGetDistributionMethod = getGetDistributionMethod = 
              io.grpc.MethodDescriptor.<inventory.grpc.DistributionRequest, inventory.grpc.PercentileValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.inventory", "getDistribution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.DistributionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.PercentileValue.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMethodDescriptorSupplier("getDistribution"))
                  .build();
          }
        }
     }
     return getGetDistributionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventory.grpc.UpdateRequest,
      inventory.grpc.UpdateResp> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = inventory.grpc.UpdateRequest.class,
      responseType = inventory.grpc.UpdateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventory.grpc.UpdateRequest,
      inventory.grpc.UpdateResp> getUpdateMethod() {
    io.grpc.MethodDescriptor<inventory.grpc.UpdateRequest, inventory.grpc.UpdateResp> getUpdateMethod;
    if ((getUpdateMethod = inventoryGrpc.getUpdateMethod) == null) {
      synchronized (inventoryGrpc.class) {
        if ((getUpdateMethod = inventoryGrpc.getUpdateMethod) == null) {
          inventoryGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<inventory.grpc.UpdateRequest, inventory.grpc.UpdateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.inventory", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventory.grpc.UpdateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
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

    /**
     */
    public void search(inventory.grpc.SearchRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchInRange(inventory.grpc.SearchInRangeRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchInRangeMethod(), responseObserver);
    }

    /**
     */
    public void getDistribution(inventory.grpc.DistributionRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.PercentileValue> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDistributionMethod(), responseObserver);
    }

    /**
     */
    public void update(inventory.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.UpdateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
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
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                inventory.grpc.SearchRequest,
                inventory.grpc.InventoryRecords>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchInRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                inventory.grpc.SearchInRangeRequest,
                inventory.grpc.InventoryRecords>(
                  this, METHODID_SEARCH_IN_RANGE)))
          .addMethod(
            getGetDistributionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                inventory.grpc.DistributionRequest,
                inventory.grpc.PercentileValue>(
                  this, METHODID_GET_DISTRIBUTION)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                inventory.grpc.UpdateRequest,
                inventory.grpc.UpdateResp>(
                  this, METHODID_UPDATE)))
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

    /**
     */
    public void search(inventory.grpc.SearchRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchInRange(inventory.grpc.SearchInRangeRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchInRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDistribution(inventory.grpc.DistributionRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.PercentileValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(inventory.grpc.UpdateRequest request,
        io.grpc.stub.StreamObserver<inventory.grpc.UpdateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public inventory.grpc.InventoryRecords search(inventory.grpc.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventory.grpc.InventoryRecords searchInRange(inventory.grpc.SearchInRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchInRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventory.grpc.PercentileValue getDistribution(inventory.grpc.DistributionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDistributionMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventory.grpc.UpdateResp update(inventory.grpc.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventory.grpc.InventoryRecords> search(
        inventory.grpc.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventory.grpc.InventoryRecords> searchInRange(
        inventory.grpc.SearchInRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchInRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventory.grpc.PercentileValue> getDistribution(
        inventory.grpc.DistributionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDistributionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventory.grpc.UpdateResp> update(
        inventory.grpc.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_BY_ID = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_SEARCH_IN_RANGE = 2;
  private static final int METHODID_GET_DISTRIBUTION = 3;
  private static final int METHODID_UPDATE = 4;

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
        case METHODID_SEARCH:
          serviceImpl.search((inventory.grpc.SearchRequest) request,
              (io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords>) responseObserver);
          break;
        case METHODID_SEARCH_IN_RANGE:
          serviceImpl.searchInRange((inventory.grpc.SearchInRangeRequest) request,
              (io.grpc.stub.StreamObserver<inventory.grpc.InventoryRecords>) responseObserver);
          break;
        case METHODID_GET_DISTRIBUTION:
          serviceImpl.getDistribution((inventory.grpc.DistributionRequest) request,
              (io.grpc.stub.StreamObserver<inventory.grpc.PercentileValue>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((inventory.grpc.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<inventory.grpc.UpdateResp>) responseObserver);
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
              .addMethod(getSearchMethod())
              .addMethod(getSearchInRangeMethod())
              .addMethod(getGetDistributionMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
