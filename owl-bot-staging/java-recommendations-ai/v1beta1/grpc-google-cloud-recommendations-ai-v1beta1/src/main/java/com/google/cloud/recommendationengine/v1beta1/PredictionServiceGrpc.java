package com.google.cloud.recommendationengine.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for making recommendation prediction.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/recommendationengine/v1beta1/prediction_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PredictionServiceGrpc {

  private PredictionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.cloud.recommendationengine.v1beta1.PredictionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.recommendationengine.v1beta1.PredictRequest,
      com.google.cloud.recommendationengine.v1beta1.PredictResponse> getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = com.google.cloud.recommendationengine.v1beta1.PredictRequest.class,
      responseType = com.google.cloud.recommendationengine.v1beta1.PredictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.recommendationengine.v1beta1.PredictRequest,
      com.google.cloud.recommendationengine.v1beta1.PredictResponse> getPredictMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.recommendationengine.v1beta1.PredictRequest, com.google.cloud.recommendationengine.v1beta1.PredictResponse> getPredictMethod;
    if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
          PredictionServiceGrpc.getPredictMethod = getPredictMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.recommendationengine.v1beta1.PredictRequest, com.google.cloud.recommendationengine.v1beta1.PredictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.recommendationengine.v1beta1.PredictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.recommendationengine.v1beta1.PredictResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Predict"))
              .build();
        }
      }
    }
    return getPredictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub>() {
        @java.lang.Override
        public PredictionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceStub(channel, callOptions);
        }
      };
    return PredictionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub>() {
        @java.lang.Override
        public PredictionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceBlockingStub(channel, callOptions);
        }
      };
    return PredictionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub>() {
        @java.lang.Override
        public PredictionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceFutureStub(channel, callOptions);
        }
      };
    return PredictionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for making recommendation prediction.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Makes a recommendation prediction. If using API Key based authentication,
     * the API Key must be registered using the
     * [PredictionApiKeyRegistry][google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry]
     * service. [Learn more](/recommendations-ai/docs/setting-up#register-key).
     * </pre>
     */
    default void predict(com.google.cloud.recommendationengine.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.recommendationengine.v1beta1.PredictResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PredictionService.
   * <pre>
   * Service for making recommendation prediction.
   * </pre>
   */
  public static abstract class PredictionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PredictionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PredictionService.
   * <pre>
   * Service for making recommendation prediction.
   * </pre>
   */
  public static final class PredictionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PredictionServiceStub> {
    private PredictionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Makes a recommendation prediction. If using API Key based authentication,
     * the API Key must be registered using the
     * [PredictionApiKeyRegistry][google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry]
     * service. [Learn more](/recommendations-ai/docs/setting-up#register-key).
     * </pre>
     */
    public void predict(com.google.cloud.recommendationengine.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.recommendationengine.v1beta1.PredictResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PredictionService.
   * <pre>
   * Service for making recommendation prediction.
   * </pre>
   */
  public static final class PredictionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictionServiceBlockingStub> {
    private PredictionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Makes a recommendation prediction. If using API Key based authentication,
     * the API Key must be registered using the
     * [PredictionApiKeyRegistry][google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry]
     * service. [Learn more](/recommendations-ai/docs/setting-up#register-key).
     * </pre>
     */
    public com.google.cloud.recommendationengine.v1beta1.PredictResponse predict(com.google.cloud.recommendationengine.v1beta1.PredictRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PredictionService.
   * <pre>
   * Service for making recommendation prediction.
   * </pre>
   */
  public static final class PredictionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictionServiceFutureStub> {
    private PredictionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Makes a recommendation prediction. If using API Key based authentication,
     * the API Key must be registered using the
     * [PredictionApiKeyRegistry][google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry]
     * service. [Learn more](/recommendations-ai/docs/setting-up#register-key).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.recommendationengine.v1beta1.PredictResponse> predict(
        com.google.cloud.recommendationengine.v1beta1.PredictRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict((com.google.cloud.recommendationengine.v1beta1.PredictRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.recommendationengine.v1beta1.PredictResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPredictMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.recommendationengine.v1beta1.PredictRequest,
              com.google.cloud.recommendationengine.v1beta1.PredictResponse>(
                service, METHODID_PREDICT)))
        .build();
  }

  private static abstract class PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.PredictionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionService");
    }
  }

  private static final class PredictionServiceFileDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier {
    PredictionServiceFileDescriptorSupplier() {}
  }

  private static final class PredictionServiceMethodDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PredictionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PredictionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictionServiceFileDescriptorSupplier())
              .addMethod(getPredictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
