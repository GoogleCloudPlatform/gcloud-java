// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/organizations.proto

package com.google.cloud.resourcemanager.v3;

public final class OrganizationsProto {
  private OrganizationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_Organization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_Organization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_GetOrganizationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_GetOrganizationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_DeleteOrganizationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_DeleteOrganizationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_resourcemanager_v3_UndeleteOrganizationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_resourcemanager_v3_UndeleteOrganizationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/resourcemanager/v3/organi" +
      "zations.proto\022\037google.cloud.resourcemana" +
      "ger.v3\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\036google/iam/v1/iam_policy.proto\032\032googl" +
      "e/iam/v1/policy.proto\032\037google/protobuf/t" +
      "imestamp.proto\"\213\004\n\014Organization\022\022\n\004name\030" +
      "\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\003\022" +
      "%\n\025directory_customer_id\030\003 \001(\tB\004\342A\001\005H\000\022H" +
      "\n\005state\030\004 \001(\01623.google.cloud.resourceman" +
      "ager.v3.Organization.StateB\004\342A\001\003\0225\n\013crea" +
      "te_time\030\005 \001(\0132\032.google.protobuf.Timestam" +
      "pB\004\342A\001\003\0225\n\013update_time\030\006 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\004\342A\001\003\0225\n\013delete_time\030\007 " +
      "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022\022\n" +
      "\004etag\030\010 \001(\tB\004\342A\001\003\"@\n\005State\022\025\n\021STATE_UNSP" +
      "ECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\024\n\020DELETE_REQUESTE" +
      "D\020\002:V\352AS\n0cloudresourcemanager.googleapi" +
      "s.com/Organization\022\034organizations/{organ" +
      "ization}R\001\001B\007\n\005owner\"a\n\026GetOrganizationR" +
      "equest\022G\n\004name\030\001 \001(\tB9\342A\001\002\372A2\n0cloudreso" +
      "urcemanager.googleapis.com/Organization\"" +
      "d\n\032SearchOrganizationsRequest\022\027\n\tpage_si" +
      "ze\030\001 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\002 \001(\tB\004\342A\001\001" +
      "\022\023\n\005query\030\003 \001(\tB\004\342A\001\001\"|\n\033SearchOrganizat" +
      "ionsResponse\022D\n\rorganizations\030\001 \003(\0132-.go" +
      "ogle.cloud.resourcemanager.v3.Organizati" +
      "on\022\027\n\017next_page_token\030\002 \001(\t\"\034\n\032DeleteOrg" +
      "anizationMetadata\"\036\n\034UndeleteOrganizatio" +
      "nMetadata2\345\007\n\rOrganizations\022\244\001\n\017GetOrgan" +
      "ization\0227.google.cloud.resourcemanager.v" +
      "3.GetOrganizationRequest\032-.google.cloud." +
      "resourcemanager.v3.Organization\")\332A\004name" +
      "\202\323\344\223\002\034\022\032/v3/{name=organizations/*}\022\272\001\n\023S" +
      "earchOrganizations\022;.google.cloud.resour" +
      "cemanager.v3.SearchOrganizationsRequest\032" +
      "<.google.cloud.resourcemanager.v3.Search" +
      "OrganizationsResponse\"(\332A\005query\202\323\344\223\002\032\022\030/" +
      "v3/organizations:search\022\214\001\n\014GetIamPolicy" +
      "\022\".google.iam.v1.GetIamPolicyRequest\032\025.g" +
      "oogle.iam.v1.Policy\"A\332A\010resource\202\323\344\223\0020\"+" +
      "/v3/{resource=organizations/*}:getIamPol" +
      "icy:\001*\022\214\001\n\014SetIamPolicy\022\".google.iam.v1." +
      "SetIamPolicyRequest\032\025.google.iam.v1.Poli" +
      "cy\"A\332A\010resource\202\323\344\223\0020\"+/v3/{resource=org" +
      "anizations/*}:setIamPolicy:\001*\022\276\001\n\022TestIa" +
      "mPermissions\022(.google.iam.v1.TestIamPerm" +
      "issionsRequest\032).google.iam.v1.TestIamPe" +
      "rmissionsResponse\"S\332A\024resource,permissio" +
      "ns\202\323\344\223\0026\"1/v3/{resource=organizations/*}" +
      ":testIamPermissions:\001*\032\220\001\312A#cloudresourc" +
      "emanager.googleapis.com\322Aghttps://www.go" +
      "ogleapis.com/auth/cloud-platform,https:/" +
      "/www.googleapis.com/auth/cloud-platform." +
      "read-onlyB\363\001\n#com.google.cloud.resourcem" +
      "anager.v3B\022OrganizationsProtoP\001ZMcloud.g" +
      "oogle.com/go/resourcemanager/apiv3/resou" +
      "rcemanagerpb;resourcemanagerpb\252\002\037Google." +
      "Cloud.ResourceManager.V3\312\002\037Google\\Cloud\\" +
      "ResourceManager\\V3\352\002\"Google::Cloud::Reso" +
      "urceManager::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_resourcemanager_v3_Organization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_resourcemanager_v3_Organization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_Organization_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DirectoryCustomerId", "State", "CreateTime", "UpdateTime", "DeleteTime", "Etag", "Owner", });
    internal_static_google_cloud_resourcemanager_v3_GetOrganizationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_resourcemanager_v3_GetOrganizationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_GetOrganizationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", "Query", });
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_SearchOrganizationsResponse_descriptor,
        new java.lang.String[] { "Organizations", "NextPageToken", });
    internal_static_google_cloud_resourcemanager_v3_DeleteOrganizationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_resourcemanager_v3_DeleteOrganizationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_DeleteOrganizationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_resourcemanager_v3_UndeleteOrganizationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_resourcemanager_v3_UndeleteOrganizationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_resourcemanager_v3_UndeleteOrganizationMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
