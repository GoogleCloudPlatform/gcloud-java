// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface EventConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.EventConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  java.util.List<java.lang.String> getAnnotationSpecSetsList();
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  int getAnnotationSpecSetsCount();
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  java.lang.String getAnnotationSpecSets(int index);
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  com.google.protobuf.ByteString getAnnotationSpecSetsBytes(int index);
}
