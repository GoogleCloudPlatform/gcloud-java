// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/tls.proto

package com.google.cloud.networksecurity.v1beta1;

public interface ValidationCAOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.ValidationCA)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   * @return Whether the grpcEndpoint field is set.
   */
  boolean hasGrpcEndpoint();
  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   * @return The grpcEndpoint.
   */
  com.google.cloud.networksecurity.v1beta1.GrpcEndpoint getGrpcEndpoint();
  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   */
  com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder getGrpcEndpointOrBuilder();

  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   * @return Whether the certificateProviderInstance field is set.
   */
  boolean hasCertificateProviderInstance();
  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   * @return The certificateProviderInstance.
   */
  com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance getCertificateProviderInstance();
  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   */
  com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder getCertificateProviderInstanceOrBuilder();

  public com.google.cloud.networksecurity.v1beta1.ValidationCA.TypeCase getTypeCase();
}
