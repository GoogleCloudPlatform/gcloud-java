// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/schema.proto

package com.google.cloud.discoveryengine.v1alpha;

public final class SchemaProto {
  private SchemaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1alpha_FieldConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_FieldConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/discoveryengine/v1alpha/s" +
      "chema.proto\022$google.cloud.discoveryengin" +
      "e.v1alpha\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032\034google/pr" +
      "otobuf/struct.proto\"\252\003\n\006Schema\0220\n\rstruct" +
      "_schema\030\002 \001(\0132\027.google.protobuf.StructH\000" +
      "\022\025\n\013json_schema\030\003 \001(\tH\000\022\022\n\004name\030\001 \001(\tB\004\342" +
      "A\001\005\022N\n\rfield_configs\030\004 \003(\01321.google.clou" +
      "d.discoveryengine.v1alpha.FieldConfigB\004\342" +
      "A\001\003:\350\001\352A\344\001\n%discoveryengine.googleapis.c" +
      "om/Schema\022Pprojects/{project}/locations/" +
      "{location}/dataStores/{data_store}/schem" +
      "as/{schema}\022iprojects/{project}/location" +
      "s/{location}/collections/{collection}/da" +
      "taStores/{data_store}/schemas/{schema}B\010" +
      "\n\006schema\"\365\013\n\013FieldConfig\022\030\n\nfield_path\030\001" +
      " \001(\tB\004\342A\001\002\022U\n\nfield_type\030\002 \001(\0162;.google." +
      "cloud.discoveryengine.v1alpha.FieldConfi" +
      "g.FieldTypeB\004\342A\001\003\022[\n\020indexable_option\030\003 " +
      "\001(\0162A.google.cloud.discoveryengine.v1alp" +
      "ha.FieldConfig.IndexableOption\022j\n\030dynami" +
      "c_facetable_option\030\004 \001(\0162H.google.cloud." +
      "discoveryengine.v1alpha.FieldConfig.Dyna" +
      "micFacetableOption\022]\n\021searchable_option\030" +
      "\005 \001(\0162B.google.cloud.discoveryengine.v1a" +
      "lpha.FieldConfig.SearchableOption\022_\n\022ret" +
      "rievable_option\030\006 \001(\0162C.google.cloud.dis" +
      "coveryengine.v1alpha.FieldConfig.Retriev" +
      "ableOption\022_\n\022completable_option\030\010 \001(\0162C" +
      ".google.cloud.discoveryengine.v1alpha.Fi" +
      "eldConfig.CompletableOption\022b\n\026recs_filt" +
      "erable_option\030\t \001(\0162B.google.cloud.disco" +
      "veryengine.v1alpha.FieldConfig.Filterabl" +
      "eOption\022\037\n\021key_property_type\030\007 \001(\tB\004\342A\001\003" +
      "\"v\n\tFieldType\022\032\n\026FIELD_TYPE_UNSPECIFIED\020" +
      "\000\022\n\n\006OBJECT\020\001\022\n\n\006STRING\020\002\022\n\n\006NUMBER\020\003\022\013\n" +
      "\007INTEGER\020\004\022\013\n\007BOOLEAN\020\005\022\017\n\013GEOLOCATION\020\006" +
      "\"b\n\017IndexableOption\022 \n\034INDEXABLE_OPTION_" +
      "UNSPECIFIED\020\000\022\025\n\021INDEXABLE_ENABLED\020\001\022\026\n\022" +
      "INDEXABLE_DISABLED\020\002\"\201\001\n\026DynamicFacetabl" +
      "eOption\022(\n$DYNAMIC_FACETABLE_OPTION_UNSP" +
      "ECIFIED\020\000\022\035\n\031DYNAMIC_FACETABLE_ENABLED\020\001" +
      "\022\036\n\032DYNAMIC_FACETABLE_DISABLED\020\002\"f\n\020Sear" +
      "chableOption\022!\n\035SEARCHABLE_OPTION_UNSPEC" +
      "IFIED\020\000\022\026\n\022SEARCHABLE_ENABLED\020\001\022\027\n\023SEARC" +
      "HABLE_DISABLED\020\002\"j\n\021RetrievableOption\022\"\n" +
      "\036RETRIEVABLE_OPTION_UNSPECIFIED\020\000\022\027\n\023RET" +
      "RIEVABLE_ENABLED\020\001\022\030\n\024RETRIEVABLE_DISABL" +
      "ED\020\002\"j\n\021CompletableOption\022\"\n\036COMPLETABLE" +
      "_OPTION_UNSPECIFIED\020\000\022\027\n\023COMPLETABLE_ENA" +
      "BLED\020\001\022\030\n\024COMPLETABLE_DISABLED\020\002\"f\n\020Filt" +
      "erableOption\022!\n\035FILTERABLE_OPTION_UNSPEC" +
      "IFIED\020\000\022\026\n\022FILTERABLE_ENABLED\020\001\022\027\n\023FILTE" +
      "RABLE_DISABLED\020\002B\227\002\n(com.google.cloud.di" +
      "scoveryengine.v1alphaB\013SchemaProtoP\001ZRcl" +
      "oud.google.com/go/discoveryengine/apiv1a" +
      "lpha/discoveryenginepb;discoveryenginepb" +
      "\242\002\017DISCOVERYENGINE\252\002$Google.Cloud.Discov" +
      "eryEngine.V1Alpha\312\002$Google\\Cloud\\Discove" +
      "ryEngine\\V1alpha\352\002\'Google::Cloud::Discov" +
      "eryEngine::V1alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1alpha_Schema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_Schema_descriptor,
        new java.lang.String[] { "StructSchema", "JsonSchema", "Name", "FieldConfigs", "Schema", });
    internal_static_google_cloud_discoveryengine_v1alpha_FieldConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_FieldConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1alpha_FieldConfig_descriptor,
        new java.lang.String[] { "FieldPath", "FieldType", "IndexableOption", "DynamicFacetableOption", "SearchableOption", "RetrievableOption", "CompletableOption", "RecsFilterableOption", "KeyPropertyType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
