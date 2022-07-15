// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

package com.google.cloud.networksecurity.v1beta1;

public final class AuthorizationPolicyProto {
  private AuthorizationPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/networksecurity/v1beta1/a" +
      "uthorization_policy.proto\022$google.cloud." +
      "networksecurity.v1beta1\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032 google/protobuf/field_mask.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\032\034google/a" +
      "pi/annotations.proto\"\317\t\n\023AuthorizationPo" +
      "licy\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\030\n\013description\030\002" +
      " \001(\tB\003\340A\001\0224\n\013create_time\030\003 \001(\0132\032.google." +
      "protobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004" +
      " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022Z\n" +
      "\006labels\030\005 \003(\0132E.google.cloud.networksecu" +
      "rity.v1beta1.AuthorizationPolicy.LabelsE" +
      "ntryB\003\340A\001\022U\n\006action\030\006 \001(\0162@.google.cloud" +
      ".networksecurity.v1beta1.AuthorizationPo" +
      "licy.ActionB\003\340A\002\022R\n\005rules\030\007 \003(\0132>.google" +
      ".cloud.networksecurity.v1beta1.Authoriza" +
      "tionPolicy.RuleB\003\340A\001\032\240\004\n\004Rule\022[\n\007sources" +
      "\030\001 \003(\0132E.google.cloud.networksecurity.v1" +
      "beta1.AuthorizationPolicy.Rule.SourceB\003\340" +
      "A\001\022e\n\014destinations\030\002 \003(\0132J.google.cloud." +
      "networksecurity.v1beta1.AuthorizationPol" +
      "icy.Rule.DestinationB\003\340A\001\0329\n\006Source\022\027\n\np" +
      "rincipals\030\001 \003(\tB\003\340A\001\022\026\n\tip_blocks\030\002 \003(\tB" +
      "\003\340A\001\032\230\002\n\013Destination\022\022\n\005hosts\030\001 \003(\tB\003\340A\002" +
      "\022\022\n\005ports\030\002 \003(\rB\003\340A\002\022\024\n\007methods\030\004 \003(\tB\003\340" +
      "A\001\022z\n\021http_header_match\030\005 \001(\0132Z.google.c" +
      "loud.networksecurity.v1beta1.Authorizati" +
      "onPolicy.Rule.Destination.HttpHeaderMatc" +
      "hB\003\340A\001\032O\n\017HttpHeaderMatch\022\032\n\013regex_match" +
      "\030\002 \001(\tB\003\340A\002H\000\022\030\n\013header_name\030\001 \001(\tB\003\340A\002B" +
      "\006\n\004type\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\001\"5\n\006Action\022\026\n\022ACTION_UNSPE" +
      "CIFIED\020\000\022\t\n\005ALLOW\020\001\022\010\n\004DENY\020\002:\216\001\352A\212\001\n2ne" +
      "tworksecurity.googleapis.com/Authorizati" +
      "onPolicy\022Tprojects/{project}/locations/{" +
      "location}/authorizationPolicies/{authori" +
      "zation_policy}\"\204\001\n ListAuthorizationPoli" +
      "ciesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!loc" +
      "ations.googleapis.com/Location\022\021\n\tpage_s" +
      "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\227\001\n!ListAu" +
      "thorizationPoliciesResponse\022Y\n\026authoriza" +
      "tion_policies\030\001 \003(\01329.google.cloud.netwo" +
      "rksecurity.v1beta1.AuthorizationPolicy\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"i\n\035GetAuthorizat" +
      "ionPolicyRequest\022H\n\004name\030\001 \001(\tB:\340A\002\372A4\n2" +
      "networksecurity.googleapis.com/Authoriza" +
      "tionPolicy\"\362\001\n CreateAuthorizationPolicy" +
      "Request\022J\n\006parent\030\001 \001(\tB:\340A\002\372A4\n2network" +
      "security.googleapis.com/AuthorizationPol" +
      "icy\022$\n\027authorization_policy_id\030\002 \001(\tB\003\340A" +
      "\002\022\\\n\024authorization_policy\030\003 \001(\01329.google" +
      ".cloud.networksecurity.v1beta1.Authoriza" +
      "tionPolicyB\003\340A\002\"\266\001\n UpdateAuthorizationP" +
      "olicyRequest\0224\n\013update_mask\030\001 \001(\0132\032.goog" +
      "le.protobuf.FieldMaskB\003\340A\001\022\\\n\024authorizat" +
      "ion_policy\030\002 \001(\01329.google.cloud.networks" +
      "ecurity.v1beta1.AuthorizationPolicyB\003\340A\002" +
      "\"l\n DeleteAuthorizationPolicyRequest\022H\n\004" +
      "name\030\001 \001(\tB:\340A\002\372A4\n2networksecurity.goog" +
      "leapis.com/AuthorizationPolicyB\223\002\n(com.g" +
      "oogle.cloud.networksecurity.v1beta1B\030Aut" +
      "horizationPolicyProtoP\001ZSgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/networksecu" +
      "rity/v1beta1;networksecurity\252\002$Google.Cl" +
      "oud.NetworkSecurity.V1Beta1\312\002$Google\\Clo" +
      "ud\\NetworkSecurity\\V1beta1\352\002\'Google::Clo" +
      "ud::NetworkSecurity::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor,
        new java.lang.String[] { "Name", "Description", "CreateTime", "UpdateTime", "Labels", "Action", "Rules", });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor =
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor,
        new java.lang.String[] { "Sources", "Destinations", });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor =
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor,
        new java.lang.String[] { "Principals", "IpBlocks", });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor =
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor,
        new java.lang.String[] { "Hosts", "Ports", "Methods", "HttpHeaderMatch", });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor =
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor,
        new java.lang.String[] { "RegexMatch", "HeaderName", "Type", });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor =
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor,
        new java.lang.String[] { "AuthorizationPolicies", "NextPageToken", });
    internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "AuthorizationPolicyId", "AuthorizationPolicy", });
    internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "AuthorizationPolicy", });
    internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
