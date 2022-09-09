// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface DataExchangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.DataExchange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the data exchange.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the data exchange.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Human-readable display name of the data exchange. The display name must
   * contain only Unicode letters, numbers (0-9), underscores (_), dashes (-),
   * spaces ( ), ampersands (&amp;) and must not start or end with spaces.
   * Default value is an empty string.
   * Max length: 63 bytes.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. Human-readable display name of the data exchange. The display name must
   * contain only Unicode letters, numbers (0-9), underscores (_), dashes (-),
   * spaces ( ), ampersands (&amp;) and must not start or end with spaces.
   * Default value is an empty string.
   * Max length: 63 bytes.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Optional. Description of the data exchange. The description must not contain Unicode
   * non-characters as well as C0 and C1 control codes except tabs (HT),
   * new lines (LF), carriage returns (CR), and page breaks (FF).
   * Default value is an empty string.
   * Max length: 2000 bytes.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the data exchange. The description must not contain Unicode
   * non-characters as well as C0 and C1 control codes except tabs (HT),
   * new lines (LF), carriage returns (CR), and page breaks (FF).
   * Default value is an empty string.
   * Max length: 2000 bytes.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. Email or URL of the primary point of contact of the data exchange.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The primaryContact.
   */
  java.lang.String getPrimaryContact();
  /**
   * <pre>
   * Optional. Email or URL of the primary point of contact of the data exchange.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for primaryContact.
   */
  com.google.protobuf.ByteString
      getPrimaryContactBytes();

  /**
   * <pre>
   * Optional. Documentation describing the data exchange.
   * </pre>
   *
   * <code>string documentation = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The documentation.
   */
  java.lang.String getDocumentation();
  /**
   * <pre>
   * Optional. Documentation describing the data exchange.
   * </pre>
   *
   * <code>string documentation = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for documentation.
   */
  com.google.protobuf.ByteString
      getDocumentationBytes();

  /**
   * <pre>
   * Output only. Number of listings contained in the data exchange.
   * </pre>
   *
   * <code>int32 listing_count = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The listingCount.
   */
  int getListingCount();

  /**
   * <pre>
   * Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB
   * Expected image dimensions are 512x512 pixels, however the API only
   * performs validation on size of the encoded data.
   * Note: For byte fields, the content of the fields are base64-encoded (which
   * increases the size of the data by 33-36%) when using JSON on the wire.
   * </pre>
   *
   * <code>bytes icon = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The icon.
   */
  com.google.protobuf.ByteString getIcon();
}
