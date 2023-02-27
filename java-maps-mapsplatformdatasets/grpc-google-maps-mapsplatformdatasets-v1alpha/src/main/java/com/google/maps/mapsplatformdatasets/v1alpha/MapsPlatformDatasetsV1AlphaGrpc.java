/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.maps.mapsplatformdatasets.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service definition for the Maps Platform Datasets API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments =
        "Source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets_alpha_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MapsPlatformDatasetsV1AlphaGrpc {

  private MapsPlatformDatasetsV1AlphaGrpc() {}

  public static final String SERVICE_NAME =
      "google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsV1Alpha";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest.class,
      responseType = com.google.maps.mapsplatformdatasets.v1alpha.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest,
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        getCreateDatasetMethod;
    if ((getCreateDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getCreateDatasetMethod) == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getCreateDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getCreateDatasetMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getCreateDatasetMethod =
              getCreateDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest,
                          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.Dataset
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier("CreateDataset"))
                      .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getUpdateDatasetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDatasetMetadata",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.class,
      responseType = com.google.maps.mapsplatformdatasets.v1alpha.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getUpdateDatasetMetadataMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest,
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        getUpdateDatasetMetadataMethod;
    if ((getUpdateDatasetMetadataMethod =
            MapsPlatformDatasetsV1AlphaGrpc.getUpdateDatasetMetadataMethod)
        == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getUpdateDatasetMetadataMethod =
                MapsPlatformDatasetsV1AlphaGrpc.getUpdateDatasetMetadataMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getUpdateDatasetMetadataMethod =
              getUpdateDatasetMetadataMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest,
                          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateDatasetMetadata"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha
                                  .UpdateDatasetMetadataRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.Dataset
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier(
                              "UpdateDatasetMetadata"))
                      .build();
        }
      }
    }
    return getUpdateDatasetMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest.class,
      responseType = com.google.maps.mapsplatformdatasets.v1alpha.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
      getGetDatasetMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest,
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        getGetDatasetMethod;
    if ((getGetDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getGetDatasetMethod) == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getGetDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getGetDatasetMethod) == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getGetDatasetMethod =
              getGetDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest,
                          com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.Dataset
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier("GetDataset"))
                      .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
      getListDatasetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasetVersions",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest.class,
      responseType = com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
      getListDatasetVersionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest,
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
        getListDatasetVersionsMethod;
    if ((getListDatasetVersionsMethod =
            MapsPlatformDatasetsV1AlphaGrpc.getListDatasetVersionsMethod)
        == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getListDatasetVersionsMethod =
                MapsPlatformDatasetsV1AlphaGrpc.getListDatasetVersionsMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getListDatasetVersionsMethod =
              getListDatasetVersionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest,
                          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListDatasetVersions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha
                                  .ListDatasetVersionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha
                                  .ListDatasetVersionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier(
                              "ListDatasetVersions"))
                      .build();
        }
      }
    }
    return getListDatasetVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
      getListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasets",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest.class,
      responseType = com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest,
          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
      getListDatasetsMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest,
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
        getListDatasetsMethod;
    if ((getListDatasetsMethod = MapsPlatformDatasetsV1AlphaGrpc.getListDatasetsMethod) == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getListDatasetsMethod = MapsPlatformDatasetsV1AlphaGrpc.getListDatasetsMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getListDatasetsMethod =
              getListDatasetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest,
                          com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier("ListDatasets"))
                      .build();
        }
      }
    }
    return getListDatasetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest,
          com.google.protobuf.Empty>
      getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest,
          com.google.protobuf.Empty>
      getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest,
            com.google.protobuf.Empty>
        getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetMethod) == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getDeleteDatasetMethod = MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetMethod =
              getDeleteDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier("DeleteDataset"))
                      .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest,
          com.google.protobuf.Empty>
      getDeleteDatasetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDatasetVersion",
      requestType = com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest,
          com.google.protobuf.Empty>
      getDeleteDatasetVersionMethod() {
    io.grpc.MethodDescriptor<
            com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest,
            com.google.protobuf.Empty>
        getDeleteDatasetVersionMethod;
    if ((getDeleteDatasetVersionMethod =
            MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetVersionMethod)
        == null) {
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        if ((getDeleteDatasetVersionMethod =
                MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetVersionMethod)
            == null) {
          MapsPlatformDatasetsV1AlphaGrpc.getDeleteDatasetVersionMethod =
              getDeleteDatasetVersionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteDatasetVersion"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.maps.mapsplatformdatasets.v1alpha
                                  .DeleteDatasetVersionRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier(
                              "DeleteDatasetVersion"))
                      .build();
        }
      }
    }
    return getDeleteDatasetVersionMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static MapsPlatformDatasetsV1AlphaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaStub>() {
          @java.lang.Override
          public MapsPlatformDatasetsV1AlphaStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MapsPlatformDatasetsV1AlphaStub(channel, callOptions);
          }
        };
    return MapsPlatformDatasetsV1AlphaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapsPlatformDatasetsV1AlphaBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaBlockingStub>() {
          @java.lang.Override
          public MapsPlatformDatasetsV1AlphaBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MapsPlatformDatasetsV1AlphaBlockingStub(channel, callOptions);
          }
        };
    return MapsPlatformDatasetsV1AlphaBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static MapsPlatformDatasetsV1AlphaFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MapsPlatformDatasetsV1AlphaFutureStub>() {
          @java.lang.Override
          public MapsPlatformDatasetsV1AlphaFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MapsPlatformDatasetsV1AlphaFutureStub(channel, callOptions);
          }
        };
    return MapsPlatformDatasetsV1AlphaFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service definition for the Maps Platform Datasets API.
   * </pre>
   */
  public abstract static class MapsPlatformDatasetsV1AlphaImplBase
      implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Create a new dataset for the specified project.
     * </pre>
     */
    public void createDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateDatasetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update the metadata for the dataset. To update the data use: UploadDataset.
     * </pre>
     */
    public void updateDatasetMetadata(
        com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateDatasetMetadataMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get the published or latest version of the dataset.
     * </pre>
     */
    public void getDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List all the versions of a dataset.
     * </pre>
     */
    public void listDatasetVersions(
        com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListDatasetVersionsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List all the datasets for the specified project.
     * </pre>
     */
    public void listDatasets(
        com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListDatasetsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete the specified dataset and optionally all its corresponding
     * versions.
     * </pre>
     */
    public void deleteDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteDatasetMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete a specific version of the dataset.
     * </pre>
     */
    public void deleteDatasetVersion(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteDatasetVersionMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateDatasetMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest,
                      com.google.maps.mapsplatformdatasets.v1alpha.Dataset>(
                      this, METHODID_CREATE_DATASET)))
          .addMethod(
              getUpdateDatasetMetadataMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest,
                      com.google.maps.mapsplatformdatasets.v1alpha.Dataset>(
                      this, METHODID_UPDATE_DATASET_METADATA)))
          .addMethod(
              getGetDatasetMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest,
                      com.google.maps.mapsplatformdatasets.v1alpha.Dataset>(
                      this, METHODID_GET_DATASET)))
          .addMethod(
              getListDatasetVersionsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest,
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>(
                      this, METHODID_LIST_DATASET_VERSIONS)))
          .addMethod(
              getListDatasetsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest,
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>(
                      this, METHODID_LIST_DATASETS)))
          .addMethod(
              getDeleteDatasetMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_DATASET)))
          .addMethod(
              getDeleteDatasetVersionMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_DATASET_VERSION)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Service definition for the Maps Platform Datasets API.
   * </pre>
   */
  public static final class MapsPlatformDatasetsV1AlphaStub
      extends io.grpc.stub.AbstractAsyncStub<MapsPlatformDatasetsV1AlphaStub> {
    private MapsPlatformDatasetsV1AlphaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapsPlatformDatasetsV1AlphaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapsPlatformDatasetsV1AlphaStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create a new dataset for the specified project.
     * </pre>
     */
    public void createDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Update the metadata for the dataset. To update the data use: UploadDataset.
     * </pre>
     */
    public void updateDatasetMetadata(
        com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetMetadataMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Get the published or latest version of the dataset.
     * </pre>
     */
    public void getDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List all the versions of a dataset.
     * </pre>
     */
    public void listDatasetVersions(
        com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetVersionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * List all the datasets for the specified project.
     * </pre>
     */
    public void listDatasets(
        com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete the specified dataset and optionally all its corresponding
     * versions.
     * </pre>
     */
    public void deleteDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Delete a specific version of the dataset.
     * </pre>
     */
    public void deleteDatasetVersion(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetVersionMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Service definition for the Maps Platform Datasets API.
   * </pre>
   */
  public static final class MapsPlatformDatasetsV1AlphaBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MapsPlatformDatasetsV1AlphaBlockingStub> {
    private MapsPlatformDatasetsV1AlphaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapsPlatformDatasetsV1AlphaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapsPlatformDatasetsV1AlphaBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create a new dataset for the specified project.
     * </pre>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.Dataset createDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Update the metadata for the dataset. To update the data use: UploadDataset.
     * </pre>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.Dataset updateDatasetMetadata(
        com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetMetadataMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Get the published or latest version of the dataset.
     * </pre>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.Dataset getDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * List all the versions of a dataset.
     * </pre>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse
        listDatasetVersions(
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetVersionsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * List all the datasets for the specified project.
     * </pre>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse listDatasets(
        com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDatasetsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Delete the specified dataset and optionally all its corresponding
     * versions.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Delete a specific version of the dataset.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDatasetVersion(
        com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Service definition for the Maps Platform Datasets API.
   * </pre>
   */
  public static final class MapsPlatformDatasetsV1AlphaFutureStub
      extends io.grpc.stub.AbstractFutureStub<MapsPlatformDatasetsV1AlphaFutureStub> {
    private MapsPlatformDatasetsV1AlphaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapsPlatformDatasetsV1AlphaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapsPlatformDatasetsV1AlphaFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Create a new dataset for the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        createDataset(com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Update the metadata for the dataset. To update the data use: UploadDataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        updateDatasetMetadata(
            com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetMetadataMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Get the published or latest version of the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset>
        getDataset(com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * List all the versions of a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>
        listDatasetVersions(
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetVersionsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * List all the datasets for the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>
        listDatasets(com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Delete the specified dataset and optionally all its corresponding
     * versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteDataset(com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Delete a specific version of the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteDatasetVersion(
            com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_UPDATE_DATASET_METADATA = 1;
  private static final int METHODID_GET_DATASET = 2;
  private static final int METHODID_LIST_DATASET_VERSIONS = 3;
  private static final int METHODID_LIST_DATASETS = 4;
  private static final int METHODID_DELETE_DATASET = 5;
  private static final int METHODID_DELETE_DATASET_VERSION = 6;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapsPlatformDatasetsV1AlphaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapsPlatformDatasetsV1AlphaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset(
              (com.google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>)
                  responseObserver);
          break;
        case METHODID_UPDATE_DATASET_METADATA:
          serviceImpl.updateDatasetMetadata(
              (com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>)
                  responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset(
              (com.google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.maps.mapsplatformdatasets.v1alpha.Dataset>)
                  responseObserver);
          break;
        case METHODID_LIST_DATASET_VERSIONS:
          serviceImpl.listDatasetVersions(
              (com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets(
              (com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.maps.mapsplatformdatasets.v1alpha.ListDatasetsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset(
              (com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DATASET_VERSION:
          serviceImpl.deleteDatasetVersion(
              (com.google.maps.mapsplatformdatasets.v1alpha.DeleteDatasetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class MapsPlatformDatasetsV1AlphaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapsPlatformDatasetsV1AlphaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsV1AlphaServiceProto
          .getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MapsPlatformDatasetsV1Alpha");
    }
  }

  private static final class MapsPlatformDatasetsV1AlphaFileDescriptorSupplier
      extends MapsPlatformDatasetsV1AlphaBaseDescriptorSupplier {
    MapsPlatformDatasetsV1AlphaFileDescriptorSupplier() {}
  }

  private static final class MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier
      extends MapsPlatformDatasetsV1AlphaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapsPlatformDatasetsV1AlphaMethodDescriptorSupplier(String methodName) {
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
      synchronized (MapsPlatformDatasetsV1AlphaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new MapsPlatformDatasetsV1AlphaFileDescriptorSupplier())
                      .addMethod(getCreateDatasetMethod())
                      .addMethod(getUpdateDatasetMetadataMethod())
                      .addMethod(getGetDatasetMethod())
                      .addMethod(getListDatasetVersionsMethod())
                      .addMethod(getListDatasetsMethod())
                      .addMethod(getDeleteDatasetMethod())
                      .addMethod(getDeleteDatasetVersionMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
