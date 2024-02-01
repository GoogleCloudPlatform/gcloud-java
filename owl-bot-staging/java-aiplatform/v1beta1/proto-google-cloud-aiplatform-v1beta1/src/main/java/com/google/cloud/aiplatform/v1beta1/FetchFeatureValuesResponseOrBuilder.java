// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface FetchFeatureValuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;</code>
   * @return Whether the keyValues field is set.
   */
  boolean hasKeyValues();
  /**
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;</code>
   * @return The keyValues.
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList getKeyValues();
  /**
   * <pre>
   * Feature values in KeyValue format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairList key_values = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FeatureNameValuePairListOrBuilder getKeyValuesOrBuilder();

  /**
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   * @return Whether the protoStruct field is set.
   */
  boolean hasProtoStruct();
  /**
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   * @return The protoStruct.
   */
  com.google.protobuf.Struct getProtoStruct();
  /**
   * <pre>
   * Feature values in proto Struct format.
   * </pre>
   *
   * <code>.google.protobuf.Struct proto_struct = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getProtoStructOrBuilder();

  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse.FormatCase getFormatCase();
}
