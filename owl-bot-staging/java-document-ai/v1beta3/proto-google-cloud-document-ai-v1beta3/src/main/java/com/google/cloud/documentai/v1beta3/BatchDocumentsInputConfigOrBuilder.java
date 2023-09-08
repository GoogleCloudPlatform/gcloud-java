// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_io.proto

package com.google.cloud.documentai.v1beta3;

public interface BatchDocumentsInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   * @return Whether the gcsPrefix field is set.
   */
  boolean hasGcsPrefix();
  /**
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   * @return The gcsPrefix.
   */
  com.google.cloud.documentai.v1beta3.GcsPrefix getGcsPrefix();
  /**
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder getGcsPrefixOrBuilder();

  /**
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   * @return Whether the gcsDocuments field is set.
   */
  boolean hasGcsDocuments();
  /**
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   * @return The gcsDocuments.
   */
  com.google.cloud.documentai.v1beta3.GcsDocuments getGcsDocuments();
  /**
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   */
  com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder getGcsDocumentsOrBuilder();

  com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.SourceCase getSourceCase();
}
