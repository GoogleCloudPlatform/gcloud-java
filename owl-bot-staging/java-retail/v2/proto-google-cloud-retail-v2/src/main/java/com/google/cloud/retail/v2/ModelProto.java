// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/model.proto

package com.google.cloud.retail.v2;

public final class ModelProto {
  private ModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Model_ServingConfigList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/retail/v2/model.proto\022\026go" +
      "ogle.cloud.retail.v2\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032#google/cloud/retail/v2/common.proto\032\037g" +
      "oogle/protobuf/timestamp.proto\"\261\n\n\005Model" +
      "\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\032\n\014display_name\030\002 \001" +
      "(\tB\004\342A\001\002\022I\n\016training_state\030\003 \001(\0162+.googl" +
      "e.cloud.retail.v2.Model.TrainingStateB\004\342" +
      "A\001\001\022G\n\rserving_state\030\004 \001(\0162*.google.clou" +
      "d.retail.v2.Model.ServingStateB\004\342A\001\003\0225\n\013" +
      "create_time\030\005 \001(\0132\032.google.protobuf.Time" +
      "stampB\004\342A\001\003\0225\n\013update_time\030\006 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\004\342A\001\003\022\022\n\004type\030\007 \001(\t" +
      "B\004\342A\001\002\022$\n\026optimization_objective\030\010 \001(\tB\004" +
      "\342A\001\001\022V\n\025periodic_tuning_state\030\013 \001(\01621.go" +
      "ogle.cloud.retail.v2.Model.PeriodicTunin" +
      "gStateB\004\342A\001\001\0228\n\016last_tune_time\030\014 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\004\342A\001\003\022\036\n\020tuning" +
      "_operation\030\017 \001(\tB\004\342A\001\003\022A\n\ndata_state\030\020 \001" +
      "(\0162\'.google.cloud.retail.v2.Model.DataSt" +
      "ateB\004\342A\001\003\022V\n\020filtering_option\030\022 \001(\01626.go" +
      "ogle.cloud.retail.v2.RecommendationsFilt" +
      "eringOptionB\004\342A\001\001\022S\n\024serving_config_list" +
      "s\030\023 \003(\0132/.google.cloud.retail.v2.Model.S" +
      "ervingConfigListB\004\342A\001\003\0325\n\021ServingConfigL" +
      "ist\022 \n\022serving_config_ids\030\001 \003(\tB\004\342A\001\001\"R\n" +
      "\014ServingState\022\035\n\031SERVING_STATE_UNSPECIFI" +
      "ED\020\000\022\014\n\010INACTIVE\020\001\022\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020" +
      "\003\"I\n\rTrainingState\022\036\n\032TRAINING_STATE_UNS" +
      "PECIFIED\020\000\022\n\n\006PAUSED\020\001\022\014\n\010TRAINING\020\002\"\220\001\n" +
      "\023PeriodicTuningState\022%\n!PERIODIC_TUNING_" +
      "STATE_UNSPECIFIED\020\000\022\034\n\030PERIODIC_TUNING_D" +
      "ISABLED\020\001\022\027\n\023ALL_TUNING_DISABLED\020\003\022\033\n\027PE" +
      "RIODIC_TUNING_ENABLED\020\002\"D\n\tDataState\022\032\n\026" +
      "DATA_STATE_UNSPECIFIED\020\000\022\013\n\007DATA_OK\020\001\022\016\n" +
      "\nDATA_ERROR\020\002:k\352Ah\n\033retail.googleapis.co" +
      "m/Model\022Iprojects/{project}/locations/{l" +
      "ocation}/catalogs/{catalog}/models/{mode" +
      "l}B\265\001\n\032com.google.cloud.retail.v2B\nModel" +
      "ProtoP\001Z2cloud.google.com/go/retail/apiv" +
      "2/retailpb;retailpb\242\002\006RETAIL\252\002\026Google.Cl" +
      "oud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002" +
      "\031Google::Cloud::Retail::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2_Model_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Model_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "TrainingState", "ServingState", "CreateTime", "UpdateTime", "Type", "OptimizationObjective", "PeriodicTuningState", "LastTuneTime", "TuningOperation", "DataState", "FilteringOption", "ServingConfigLists", });
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor =
      internal_static_google_cloud_retail_v2_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_Model_ServingConfigList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Model_ServingConfigList_descriptor,
        new java.lang.String[] { "ServingConfigIds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
