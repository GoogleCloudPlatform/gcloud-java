// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation_spec_set.proto

package com.google.cloud.datalabeling.v1beta1;

public final class AnnotationSpecSetOuterClass {
  private AnnotationSpecSetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/datalabeling/v1beta1/anno"
          + "tation_spec_set.proto\022!google.cloud.data"
          + "labeling.v1beta1\032\034google/api/annotations"
          + ".proto\"\231\001\n\021AnnotationSpecSet\022\014\n\004name\030\001 \001"
          + "(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description\030"
          + "\003 \001(\t\022K\n\020annotation_specs\030\004 \003(\01321.google"
          + ".cloud.datalabeling.v1beta1.AnnotationSp"
          + "ec\";\n\016AnnotationSpec\022\024\n\014display_name\030\001 \001"
          + "(\t\022\023\n\013description\030\002 \001(\tBx\n%com.google.cl"
          + "oud.datalabeling.v1beta1P\001ZMgoogle.golan"
          + "g.org/genproto/googleapis/cloud/datalabe"
          + "ling/v1beta1;datalabelingb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "AnnotationSpecs",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
