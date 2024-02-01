// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schedule.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ScheduleProto {
  private ScheduleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Schedule_RunResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Schedule_RunResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/aiplatform/v1/schedule.pr" +
      "oto\022\032google.cloud.aiplatform.v1\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\0321google/cloud/aiplatform/v1/" +
      "pipeline_service.proto\032\037google/protobuf/" +
      "timestamp.proto\"\225\t\n\010Schedule\022\016\n\004cron\030\n \001" +
      "(\tH\000\022[\n\033create_pipeline_job_request\030\016 \001(" +
      "\01324.google.cloud.aiplatform.v1.CreatePip" +
      "elineJobRequestH\001\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\032\n" +
      "\014display_name\030\002 \001(\tB\004\342A\001\002\0224\n\nstart_time\030" +
      "\003 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\001\022" +
      "2\n\010end_time\030\004 \001(\0132\032.google.protobuf.Time" +
      "stampB\004\342A\001\001\022\033\n\rmax_run_count\030\020 \001(\003B\004\342A\001\001" +
      "\022\037\n\021started_run_count\030\021 \001(\003B\004\342A\001\003\022?\n\005sta" +
      "te\030\005 \001(\0162*.google.cloud.aiplatform.v1.Sc" +
      "hedule.StateB\004\342A\001\003\0225\n\013create_time\030\006 \001(\0132" +
      "\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013upd" +
      "ate_time\030\023 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\004\342A\001\003\0227\n\rnext_run_time\030\007 \001(\0132\032.google" +
      ".protobuf.TimestampB\004\342A\001\003\0229\n\017last_pause_" +
      "time\030\010 \001(\0132\032.google.protobuf.TimestampB\004" +
      "\342A\001\003\022:\n\020last_resume_time\030\t \001(\0132\032.google." +
      "protobuf.TimestampB\004\342A\001\003\022&\n\030max_concurre" +
      "nt_run_count\030\013 \001(\003B\004\342A\001\002\022\034\n\016allow_queuei" +
      "ng\030\014 \001(\010B\004\342A\001\001\022\026\n\010catch_up\030\r \001(\010B\004\342A\001\003\022[" +
      "\n\033last_scheduled_run_response\030\022 \001(\01320.go" +
      "ogle.cloud.aiplatform.v1.Schedule.RunRes" +
      "ponseB\004\342A\001\003\032[\n\013RunResponse\0226\n\022scheduled_" +
      "run_time\030\001 \001(\0132\032.google.protobuf.Timesta" +
      "mp\022\024\n\014run_response\030\002 \001(\t\"E\n\005State\022\025\n\021STA" +
      "TE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006PAUSED\020\002" +
      "\022\r\n\tCOMPLETED\020\003:e\352Ab\n\"aiplatform.googlea" +
      "pis.com/Schedule\022<projects/{project}/loc" +
      "ations/{location}/schedules/{schedule}B\024" +
      "\n\022time_specificationB\t\n\007requestB\313\001\n\036com." +
      "google.cloud.aiplatform.v1B\rScheduleProt" +
      "oP\001Z>cloud.google.com/go/aiplatform/apiv" +
      "1/aiplatformpb;aiplatformpb\252\002\032Google.Clo" +
      "ud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfo" +
      "rm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.PipelineServiceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Schedule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Schedule_descriptor,
        new java.lang.String[] { "Cron", "CreatePipelineJobRequest", "Name", "DisplayName", "StartTime", "EndTime", "MaxRunCount", "StartedRunCount", "State", "CreateTime", "UpdateTime", "NextRunTime", "LastPauseTime", "LastResumeTime", "MaxConcurrentRunCount", "AllowQueueing", "CatchUp", "LastScheduledRunResponse", "TimeSpecification", "Request", });
    internal_static_google_cloud_aiplatform_v1_Schedule_RunResponse_descriptor =
      internal_static_google_cloud_aiplatform_v1_Schedule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Schedule_RunResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Schedule_RunResponse_descriptor,
        new java.lang.String[] { "ScheduledRunTime", "RunResponse", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
