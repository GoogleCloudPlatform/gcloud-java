// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface GetVulnzOccurrencesSummaryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This contains the project Id for example: projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * This contains the project Id for example: projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
