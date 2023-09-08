// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

public interface GenerateUploadUrlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.GenerateUploadUrlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   * @return The uploadUrl.
   */
  java.lang.String getUploadUrl();
  /**
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   * @return The bytes for uploadUrl.
   */
  com.google.protobuf.ByteString
      getUploadUrlBytes();

  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   * @return Whether the storageSource field is set.
   */
  boolean hasStorageSource();
  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   * @return The storageSource.
   */
  com.google.cloud.functions.v2alpha.StorageSource getStorageSource();
  /**
   * <pre>
   * The location of the source code in the upload bucket.
   *
   * Once the archive is uploaded using the `upload_url` use this field to
   * set the `function.build_config.source.storage_source`
   * during CreateFunction and UpdateFunction.
   *
   * Generation defaults to 0, as Cloud Storage provides a new generation only
   * upon uploading a new object or version of an object.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StorageSource storage_source = 2;</code>
   */
  com.google.cloud.functions.v2alpha.StorageSourceOrBuilder getStorageSourceOrBuilder();
}
