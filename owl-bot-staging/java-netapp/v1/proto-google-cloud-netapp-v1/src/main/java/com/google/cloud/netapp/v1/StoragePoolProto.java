// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/storage_pool.proto

package com.google.cloud.netapp.v1;

public final class StoragePoolProto {
  private StoragePoolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_StoragePool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_StoragePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/netapp/v1/storage_pool.pr" +
      "oto\022\026google.cloud.netapp.v1\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032#google/cloud/netapp/v1/common.p" +
      "roto\032 google/protobuf/field_mask.proto\032\037" +
      "google/protobuf/timestamp.proto\"Q\n\025GetSt" +
      "oragePoolRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n" +
      "!netapp.googleapis.com/StoragePool\"\236\001\n\027L" +
      "istStoragePoolsRequest\022:\n\006parent\030\001 \001(\tB*" +
      "\342A\001\002\372A#\022!netapp.googleapis.com/StoragePo" +
      "ol\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(" +
      "\t\022\020\n\010order_by\030\004 \001(\t\022\016\n\006filter\030\005 \001(\t\"\204\001\n\030" +
      "ListStoragePoolsResponse\022:\n\rstorage_pool" +
      "s\030\001 \003(\0132#.google.cloud.netapp.v1.Storage" +
      "Pool\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreach" +
      "able\030\003 \003(\t\"\266\001\n\030CreateStoragePoolRequest\022" +
      ":\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\022!netapp.googlea" +
      "pis.com/StoragePool\022\035\n\017storage_pool_id\030\002" +
      " \001(\tB\004\342A\001\002\022?\n\014storage_pool\030\003 \001(\0132#.googl" +
      "e.cloud.netapp.v1.StoragePoolB\004\342A\001\002\"\222\001\n\030" +
      "UpdateStoragePoolRequest\0225\n\013update_mask\030" +
      "\001 \001(\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\022" +
      "?\n\014storage_pool\030\002 \001(\0132#.google.cloud.net" +
      "app.v1.StoragePoolB\004\342A\001\002\"T\n\030DeleteStorag" +
      "ePoolRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n!net" +
      "app.googleapis.com/StoragePool\"\260\010\n\013Stora" +
      "gePool\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022A\n\rservice_le" +
      "vel\030\002 \001(\0162$.google.cloud.netapp.v1.Servi" +
      "ceLevelB\004\342A\001\002\022\032\n\014capacity_gib\030\003 \001(\003B\004\342A\001" +
      "\002\022!\n\023volume_capacity_gib\030\004 \001(\003B\004\342A\001\003\022\032\n\014" +
      "volume_count\030\005 \001(\005B\004\342A\001\003\022>\n\005state\030\006 \001(\0162" +
      ").google.cloud.netapp.v1.StoragePool.Sta" +
      "teB\004\342A\001\003\022\033\n\rstate_details\030\007 \001(\tB\004\342A\001\003\0225\n" +
      "\013create_time\030\010 \001(\0132\032.google.protobuf.Tim" +
      "estampB\004\342A\001\003\022\023\n\013description\030\t \001(\t\022?\n\006lab" +
      "els\030\n \003(\0132/.google.cloud.netapp.v1.Stora" +
      "gePool.LabelsEntry\0228\n\007network\030\013 \001(\tB\'\342A\001" +
      "\002\372A \n\036compute.googleapis.com/Network\022D\n\020" +
      "active_directory\030\014 \001(\tB*\372A\'\n%netapp.goog" +
      "leapis.com/ActiveDirectory\0228\n\nkms_config" +
      "\030\r \001(\tB$\372A!\n\037netapp.googleapis.com/KmsCo" +
      "nfig\022\024\n\014ldap_enabled\030\016 \001(\010\022\021\n\tpsa_range\030" +
      "\017 \001(\t\022E\n\017encryption_type\030\020 \001(\0162&.google." +
      "cloud.netapp.v1.EncryptionTypeB\004\342A\001\003\022(\n\025" +
      "global_access_allowed\030\021 \001(\010B\004\342A\001\001H\000\210\001\001\032-" +
      "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001\"{\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n" +
      "\005READY\020\001\022\014\n\010CREATING\020\002\022\014\n\010DELETING\020\003\022\014\n\010" +
      "UPDATING\020\004\022\r\n\tRESTORING\020\005\022\014\n\010DISABLED\020\006\022" +
      "\t\n\005ERROR\020\007:k\352Ah\n!netapp.googleapis.com/S" +
      "toragePool\022Cprojects/{project}/locations" +
      "/{location}/storagePools/{storage_pool}B" +
      "\030\n\026_global_access_allowedB\262\001\n\032com.google" +
      ".cloud.netapp.v1B\020StoragePoolProtoP\001Z2cl" +
      "oud.google.com/go/netapp/apiv1/netapppb;" +
      "netapppb\252\002\026Google.Cloud.NetApp.V1\312\002\026Goog" +
      "le\\Cloud\\NetApp\\V1\352\002\031Google::Cloud::NetA" +
      "pp::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.netapp.v1.CommonProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "OrderBy", "Filter", });
    internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor,
        new java.lang.String[] { "StoragePools", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor,
        new java.lang.String[] { "Parent", "StoragePoolId", "StoragePool", });
    internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "StoragePool", });
    internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_netapp_v1_StoragePool_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_StoragePool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_StoragePool_descriptor,
        new java.lang.String[] { "Name", "ServiceLevel", "CapacityGib", "VolumeCapacityGib", "VolumeCount", "State", "StateDetails", "CreateTime", "Description", "Labels", "Network", "ActiveDirectory", "KmsConfig", "LdapEnabled", "PsaRange", "EncryptionType", "GlobalAccessAllowed", "GlobalAccessAllowed", });
    internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor =
      internal_static_google_cloud_netapp_v1_StoragePool_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.netapp.v1.CommonProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
