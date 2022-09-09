// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface UpdateOccurrenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.UpdateOccurrenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The occurrence.
   */
  io.grafeas.v1.Occurrence getOccurrence();
  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.grafeas.v1.Occurrence occurrence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
