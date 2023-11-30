// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface ListCryptoKeysRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListCryptoKeysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing]
   * to list, in the format `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing]
   * to list, in the format `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Optional limit on the number of
   * [CryptoKeys][google.cloud.kms.v1.CryptoKey] to include in the response.
   * Further [CryptoKeys][google.cloud.kms.v1.CryptoKey] can subsequently be
   * obtained by including the
   * [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token]
   * in a subsequent request.  If unspecified, the server will pick an
   * appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. Optional pagination token, returned earlier via
   * [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. Optional pagination token, returned earlier via
   * [ListCryptoKeysResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeysResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The fields of the primary version to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView version_view = 4;</code>
   * @return The enum numeric value on the wire for versionView.
   */
  int getVersionViewValue();
  /**
   * <pre>
   * The fields of the primary version to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView version_view = 4;</code>
   * @return The versionView.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView getVersionView();

  /**
   * <pre>
   * Optional. Only include resources that match the filter in the response. For
   * more information, see
   * [Sorting and filtering list
   * results](https://cloud.google.com/kms/docs/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Only include resources that match the filter in the response. For
   * more information, see
   * [Sorting and filtering list
   * results](https://cloud.google.com/kms/docs/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. Specify how the results should be sorted. If not specified, the
   * results will be sorted in the default order. For more information, see
   * [Sorting and filtering list
   * results](https://cloud.google.com/kms/docs/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. Specify how the results should be sorted. If not specified, the
   * results will be sorted in the default order. For more information, see
   * [Sorting and filtering list
   * results](https://cloud.google.com/kms/docs/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
