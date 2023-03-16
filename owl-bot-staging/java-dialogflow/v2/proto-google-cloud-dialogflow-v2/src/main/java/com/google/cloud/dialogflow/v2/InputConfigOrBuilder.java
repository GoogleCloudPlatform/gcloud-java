// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

public interface InputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud Storage URI has the form gs://&lt;Google Cloud Storage bucket
   * name&gt;//agent*.json. Wildcards are allowed and will be expanded into all
   * matched JSON files, which will be read as one conversation per file.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 1;</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * The Cloud Storage URI has the form gs://&lt;Google Cloud Storage bucket
   * name&gt;//agent*.json. Wildcards are allowed and will be expanded into all
   * matched JSON files, which will be read as one conversation per file.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 1;</code>
   * @return The gcsSource.
   */
  com.google.cloud.dialogflow.v2.GcsSources getGcsSource();
  /**
   * <pre>
   * The Cloud Storage URI has the form gs://&lt;Google Cloud Storage bucket
   * name&gt;//agent*.json. Wildcards are allowed and will be expanded into all
   * matched JSON files, which will be read as one conversation per file.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 1;</code>
   */
  com.google.cloud.dialogflow.v2.GcsSourcesOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.dialogflow.v2.InputConfig.SourceCase getSourceCase();
}
