// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/annotation_payload.proto

package com.google.cloud.automl.v1beta1;

public interface AnnotationPayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.AnnotationPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationAnnotation translation = 2;</code>
   */
  boolean hasTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationAnnotation translation = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TranslationAnnotation getTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationAnnotation translation = 2;</code>
   */
  com.google.cloud.automl.v1beta1.TranslationAnnotationOrBuilder getTranslationOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationAnnotation classification = 3;</code>
   */
  boolean hasClassification();
  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationAnnotation classification = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationAnnotation getClassification();
  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationAnnotation classification = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationAnnotationOrBuilder
      getClassificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only . The resource ID of the annotation spec that
   * this annotation pertains to. The annotation spec comes from either an
   * ancestor dataset, or the dataset that was used to train the model in use.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   */
  java.lang.String getAnnotationSpecId();
  /**
   *
   *
   * <pre>
   * Output only . The resource ID of the annotation spec that
   * this annotation pertains to. The annotation spec comes from either an
   * ancestor dataset, or the dataset that was used to train the model in use.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   */
  com.google.protobuf.ByteString getAnnotationSpecIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The value of [AnnotationSpec.display_name][google.cloud.automl.v1beta1.AnnotationSpec.display_name] when the model
   * was trained. Because this field returns a value at model training time,
   * for different models trained using the same dataset, the returned value
   * could be different as model owner could update the display_name between
   * any two model training.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The value of [AnnotationSpec.display_name][google.cloud.automl.v1beta1.AnnotationSpec.display_name] when the model
   * was trained. Because this field returns a value at model training time,
   * for different models trained using the same dataset, the returned value
   * could be different as model owner could update the display_name between
   * any two model training.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  public com.google.cloud.automl.v1beta1.AnnotationPayload.DetailCase getDetailCase();
}
