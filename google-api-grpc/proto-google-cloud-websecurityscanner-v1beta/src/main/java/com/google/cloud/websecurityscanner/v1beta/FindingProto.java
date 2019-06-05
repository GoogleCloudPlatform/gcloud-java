// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/finding.proto

package com.google.cloud.websecurityscanner.v1beta;

public final class FindingProto {
  private FindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_Finding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/websecurityscanner/v1beta"
          + "/finding.proto\022&google.cloud.websecurity"
          + "scanner.v1beta\032\034google/api/annotations.p"
          + "roto\032:google/cloud/websecurityscanner/v1"
          + "beta/finding_addon.proto\"\242\005\n\007Finding\022\014\n\004"
          + "name\030\001 \001(\t\022\024\n\014finding_type\030\002 \001(\t\022\023\n\013http"
          + "_method\030\003 \001(\t\022\022\n\nfuzzed_url\030\004 \001(\t\022\014\n\004bod"
          + "y\030\005 \001(\t\022\023\n\013description\030\006 \001(\t\022\030\n\020reproduc"
          + "tion_url\030\007 \001(\t\022\021\n\tframe_url\030\010 \001(\t\022\021\n\tfin"
          + "al_url\030\t \001(\t\022\023\n\013tracking_id\030\n \001(\t\022:\n\004for"
          + "m\030\020 \001(\0132,.google.cloud.websecurityscanne"
          + "r.v1beta.Form\022Q\n\020outdated_library\030\013 \001(\0132"
          + "7.google.cloud.websecurityscanner.v1beta"
          + ".OutdatedLibrary\022U\n\022violating_resource\030\014"
          + " \001(\01329.google.cloud.websecurityscanner.v"
          + "1beta.ViolatingResource\022U\n\022vulnerable_he"
          + "aders\030\017 \001(\01329.google.cloud.websecuritysc"
          + "anner.v1beta.VulnerableHeaders\022[\n\025vulner"
          + "able_parameters\030\r \001(\0132<.google.cloud.web"
          + "securityscanner.v1beta.VulnerableParamet"
          + "ers\0228\n\003xss\030\016 \001(\0132+.google.cloud.websecur"
          + "ityscanner.v1beta.XssB\277\001\n*com.google.clo"
          + "ud.websecurityscanner.v1betaB\014FindingPro"
          + "toP\001ZXgoogle.golang.org/genproto/googlea"
          + "pis/cloud/websecurityscanner/v1beta;webs"
          + "ecurityscanner\312\002&Google\\Cloud\\WebSecurit"
          + "yScanner\\V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.cloud.websecurityscanner.v1beta.FindingAddonProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1beta_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "FindingType",
              "HttpMethod",
              "FuzzedUrl",
              "Body",
              "Description",
              "ReproductionUrl",
              "FrameUrl",
              "FinalUrl",
              "TrackingId",
              "Form",
              "OutdatedLibrary",
              "ViolatingResource",
              "VulnerableHeaders",
              "VulnerableParameters",
              "Xss",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1beta.FindingAddonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
