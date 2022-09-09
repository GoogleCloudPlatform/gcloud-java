// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface MysqlSslConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.MysqlSslConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input only. PEM-encoded private key associated with the Client Certificate.
   * If this field is used then the 'client_certificate' and the
   * 'ca_certificate' fields are mandatory.
   * </pre>
   *
   * <code>string client_key = 11 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The clientKey.
   */
  java.lang.String getClientKey();
  /**
   * <pre>
   * Input only. PEM-encoded private key associated with the Client Certificate.
   * If this field is used then the 'client_certificate' and the
   * 'ca_certificate' fields are mandatory.
   * </pre>
   *
   * <code>string client_key = 11 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The bytes for clientKey.
   */
  com.google.protobuf.ByteString
      getClientKeyBytes();

  /**
   * <pre>
   * Output only. Indicates whether the client_key field is set.
   * </pre>
   *
   * <code>bool client_key_set = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientKeySet.
   */
  boolean getClientKeySet();

  /**
   * <pre>
   * Input only. PEM-encoded certificate that will be used by the replica to
   * authenticate against the source database server. If this field is used
   * then the 'client_key' and the 'ca_certificate' fields are mandatory.
   * </pre>
   *
   * <code>string client_certificate = 13 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The clientCertificate.
   */
  java.lang.String getClientCertificate();
  /**
   * <pre>
   * Input only. PEM-encoded certificate that will be used by the replica to
   * authenticate against the source database server. If this field is used
   * then the 'client_key' and the 'ca_certificate' fields are mandatory.
   * </pre>
   *
   * <code>string client_certificate = 13 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The bytes for clientCertificate.
   */
  com.google.protobuf.ByteString
      getClientCertificateBytes();

  /**
   * <pre>
   * Output only. Indicates whether the client_certificate field is set.
   * </pre>
   *
   * <code>bool client_certificate_set = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientCertificateSet.
   */
  boolean getClientCertificateSet();

  /**
   * <pre>
   * Input only. PEM-encoded certificate of the CA that signed the source database
   * server's certificate.
   * </pre>
   *
   * <code>string ca_certificate = 15 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The caCertificate.
   */
  java.lang.String getCaCertificate();
  /**
   * <pre>
   * Input only. PEM-encoded certificate of the CA that signed the source database
   * server's certificate.
   * </pre>
   *
   * <code>string ca_certificate = 15 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The bytes for caCertificate.
   */
  com.google.protobuf.ByteString
      getCaCertificateBytes();

  /**
   * <pre>
   * Output only. Indicates whether the ca_certificate field is set.
   * </pre>
   *
   * <code>bool ca_certificate_set = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The caCertificateSet.
   */
  boolean getCaCertificateSet();
}
