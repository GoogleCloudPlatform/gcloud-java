// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface CreateTagTemplateFieldRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project this template is in. Example:
   * "projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}".
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project this template is in. Example:
   * "projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}".
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field ids must be at least 1
   * character long and at most 128 characters long. Field ids must also be
   * unique to their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2;</code>
   */
  java.lang.String getTagTemplateFieldId();
  /**
   *
   *
   * <pre>
   * Required. The id of the tag template field to create.
   * Field ids can contain letters (both uppercase and lowercase), numbers
   * (0-9), underscores (_) and dashes (-). Field ids must be at least 1
   * character long and at most 128 characters long. Field ids must also be
   * unique to their template.
   * </pre>
   *
   * <code>string tag_template_field_id = 2;</code>
   */
  com.google.protobuf.ByteString getTagTemplateFieldIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3;</code>
   */
  boolean hasTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3;</code>
   */
  com.google.cloud.datacatalog.TagTemplateField getTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The tag template field to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplateField tag_template_field = 3;</code>
   */
  com.google.cloud.datacatalog.TagTemplateFieldOrBuilder getTagTemplateFieldOrBuilder();
}
