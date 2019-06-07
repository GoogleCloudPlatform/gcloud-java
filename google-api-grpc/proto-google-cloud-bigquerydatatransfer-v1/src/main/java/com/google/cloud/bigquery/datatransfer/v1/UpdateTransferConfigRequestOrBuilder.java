// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface UpdateTransferConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1;</code>
   */
  boolean hasTransferConfig();
  /**
   *
   *
   * <pre>
   * Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfig();
  /**
   *
   *
   * <pre>
   * Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * If it is provided, the transfer configuration will be associated with the
   * authorizing user.
   * In order to obtain authorization_code, please make a
   * request to
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=&lt;datatransferapiclientid&gt;&amp;scope=&lt;data_source_scopes&gt;&amp;redirect_uri=&lt;redirect_uri&gt;
   * * client_id should be OAuth client_id of BigQuery DTS API for the given
   *   data source returned by ListDataSources method.
   * * data_source_scopes are the scopes returned by ListDataSources method.
   * * redirect_uri is an optional parameter. If not specified, then
   *   authorization code is posted to the opener of authorization flow window.
   *   Otherwise it will be sent to the redirect uri. A special value of
   *   urn:ietf:wg:oauth:2.0:oob means that authorization code should be
   *   returned in the title bar of the browser, with the page text prompting
   *   the user to copy the code and paste it in the application.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   */
  java.lang.String getAuthorizationCode();
  /**
   *
   *
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * If it is provided, the transfer configuration will be associated with the
   * authorizing user.
   * In order to obtain authorization_code, please make a
   * request to
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=&lt;datatransferapiclientid&gt;&amp;scope=&lt;data_source_scopes&gt;&amp;redirect_uri=&lt;redirect_uri&gt;
   * * client_id should be OAuth client_id of BigQuery DTS API for the given
   *   data source returned by ListDataSources method.
   * * data_source_scopes are the scopes returned by ListDataSources method.
   * * redirect_uri is an optional parameter. If not specified, then
   *   authorization code is posted to the opener of authorization flow window.
   *   Otherwise it will be sent to the redirect uri. A special value of
   *   urn:ietf:wg:oauth:2.0:oob means that authorization code should be
   *   returned in the title bar of the browser, with the page text prompting
   *   the user to copy the code and paste it in the application.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   */
  com.google.protobuf.ByteString getAuthorizationCodeBytes();

  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional version info. If users want to find a very recent access token,
   * that is, immediately after approving access, users have to set the
   * version_info claim in the token request. To obtain the version_info, users
   * must use the “none+gsession” response type. which be return a
   * version_info back in the authorization response which be be put in a JWT
   * claim in the token request.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   */
  java.lang.String getVersionInfo();
  /**
   *
   *
   * <pre>
   * Optional version info. If users want to find a very recent access token,
   * that is, immediately after approving access, users have to set the
   * version_info claim in the token request. To obtain the version_info, users
   * must use the “none+gsession” response type. which be return a
   * version_info back in the authorization response which be be put in a JWT
   * claim in the token request.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   */
  com.google.protobuf.ByteString getVersionInfoBytes();
}
