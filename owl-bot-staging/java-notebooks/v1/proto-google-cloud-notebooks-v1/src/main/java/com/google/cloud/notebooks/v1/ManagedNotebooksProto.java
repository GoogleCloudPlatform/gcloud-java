// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

public final class ManagedNotebooksProto {
  private ManagedNotebooksProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/notebooks/v1/managed_serv" +
      "ice.proto\022\031google.cloud.notebooks.v1\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\0321google/" +
      "cloud/notebooks/v1/diagnostic_config.pro" +
      "to\032%google/cloud/notebooks/v1/event.prot" +
      "o\032\'google/cloud/notebooks/v1/runtime.pro" +
      "to\032#google/longrunning/operations.proto\032" +
      " google/protobuf/field_mask.proto\032\037googl" +
      "e/protobuf/timestamp.proto\"w\n\023ListRuntim" +
      "esRequest\0229\n\006parent\030\001 \001(\tB)\342A\001\002\372A\"\022 note" +
      "books.googleapis.com/Runtime\022\021\n\tpage_siz" +
      "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"z\n\024ListRunti" +
      "mesResponse\0224\n\010runtimes\030\001 \003(\0132\".google.c" +
      "loud.notebooks.v1.Runtime\022\027\n\017next_page_t" +
      "oken\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"L\n\021GetRu" +
      "ntimeRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n not" +
      "ebooks.googleapis.com/Runtime\"\272\001\n\024Create" +
      "RuntimeRequest\0229\n\006parent\030\001 \001(\tB)\342A\001\002\372A\"\n" +
      " notebooks.googleapis.com/Runtime\022\030\n\nrun" +
      "time_id\030\002 \001(\tB\004\342A\001\002\0229\n\007runtime\030\003 \001(\0132\".g" +
      "oogle.cloud.notebooks.v1.RuntimeB\004\342A\001\002\022\022" +
      "\n\nrequest_id\030\004 \001(\t\"c\n\024DeleteRuntimeReque" +
      "st\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n notebooks.goo" +
      "gleapis.com/Runtime\022\022\n\nrequest_id\030\002 \001(\t\"" +
      "=\n\023StartRuntimeRequest\022\022\n\004name\030\001 \001(\tB\004\342A" +
      "\001\002\022\022\n\nrequest_id\030\002 \001(\t\"<\n\022StopRuntimeReq" +
      "uest\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\022\n\nrequest_id\030\002" +
      " \001(\t\"\245\001\n\024SwitchRuntimeRequest\022\022\n\004name\030\001 " +
      "\001(\tB\004\342A\001\002\022\024\n\014machine_type\030\002 \001(\t\022O\n\022accel" +
      "erator_config\030\003 \001(\01323.google.cloud.noteb" +
      "ooks.v1.RuntimeAcceleratorConfig\022\022\n\nrequ" +
      "est_id\030\004 \001(\t\"=\n\023ResetRuntimeRequest\022\022\n\004n" +
      "ame\030\001 \001(\tB\004\342A\001\002\022\022\n\nrequest_id\030\002 \001(\t\"?\n\025U" +
      "pgradeRuntimeRequest\022\022\n\004name\030\001 \001(\tB\004\342A\001\002" +
      "\022\022\n\nrequest_id\030\002 \001(\t\"\240\001\n\031ReportRuntimeEv" +
      "entRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n noteb" +
      "ooks.googleapis.com/Runtime\022\023\n\005vm_id\030\002 \001" +
      "(\tB\004\342A\001\002\0225\n\005event\030\003 \001(\0132 .google.cloud.n" +
      "otebooks.v1.EventB\004\342A\001\002\"\234\001\n\024UpdateRuntim" +
      "eRequest\0229\n\007runtime\030\001 \001(\0132\".google.cloud" +
      ".notebooks.v1.RuntimeB\004\342A\001\002\0225\n\013update_ma" +
      "sk\030\002 \001(\0132\032.google.protobuf.FieldMaskB\004\342A" +
      "\001\002\022\022\n\nrequest_id\030\003 \001(\t\"r\n\"RefreshRuntime" +
      "TokenInternalRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002" +
      "\372A\"\n notebooks.googleapis.com/Runtime\022\023\n" +
      "\005vm_id\030\002 \001(\tB\004\342A\001\002\"r\n#RefreshRuntimeToke" +
      "nInternalResponse\022\024\n\014access_token\030\001 \001(\t\022" +
      "5\n\013expire_time\030\002 \001(\0132\032.google.protobuf.T" +
      "imestampB\004\342A\001\003\"\237\001\n\026DiagnoseRuntimeReques" +
      "t\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n notebooks.goog" +
      "leapis.com/Runtime\022L\n\021diagnostic_config\030" +
      "\002 \001(\0132+.google.cloud.notebooks.v1.Diagno" +
      "sticConfigB\004\342A\001\0022\322\025\n\026ManagedNotebookServ" +
      "ice\022\256\001\n\014ListRuntimes\022..google.cloud.note" +
      "books.v1.ListRuntimesRequest\032/.google.cl" +
      "oud.notebooks.v1.ListRuntimesResponse\"=\332" +
      "A\006parent\202\323\344\223\002.\022,/v1/{parent=projects/*/l" +
      "ocations/*}/runtimes\022\233\001\n\nGetRuntime\022,.go" +
      "ogle.cloud.notebooks.v1.GetRuntimeReques" +
      "t\032\".google.cloud.notebooks.v1.Runtime\";\332" +
      "A\004name\202\323\344\223\002.\022,/v1/{name=projects/*/locat" +
      "ions/*/runtimes/*}\022\331\001\n\rCreateRuntime\022/.g" +
      "oogle.cloud.notebooks.v1.CreateRuntimeRe" +
      "quest\032\035.google.longrunning.Operation\"x\312A" +
      "\034\n\007Runtime\022\021OperationMetadata\332A\031parent,r" +
      "untime_id,runtime\202\323\344\223\0027\",/v1/{parent=pro" +
      "jects/*/locations/*}/runtimes:\007runtime\022\333" +
      "\001\n\rUpdateRuntime\022/.google.cloud.notebook" +
      "s.v1.UpdateRuntimeRequest\032\035.google.longr" +
      "unning.Operation\"z\312A\034\n\007Runtime\022\021Operatio" +
      "nMetadata\332A\023runtime,update_mask\202\323\344\223\002?24/" +
      "v1/{runtime.name=projects/*/locations/*/" +
      "runtimes/*}:\007runtime\022\311\001\n\rDeleteRuntime\022/" +
      ".google.cloud.notebooks.v1.DeleteRuntime" +
      "Request\032\035.google.longrunning.Operation\"h" +
      "\312A*\n\025google.protobuf.Empty\022\021OperationMet" +
      "adata\332A\004name\202\323\344\223\002.*,/v1/{name=projects/*" +
      "/locations/*/runtimes/*}\022\302\001\n\014StartRuntim" +
      "e\022..google.cloud.notebooks.v1.StartRunti" +
      "meRequest\032\035.google.longrunning.Operation" +
      "\"c\312A\034\n\007Runtime\022\021OperationMetadata\332A\004name" +
      "\202\323\344\223\0027\"2/v1/{name=projects/*/locations/*" +
      "/runtimes/*}:start:\001*\022\277\001\n\013StopRuntime\022-." +
      "google.cloud.notebooks.v1.StopRuntimeReq" +
      "uest\032\035.google.longrunning.Operation\"b\312A\034" +
      "\n\007Runtime\022\021OperationMetadata\332A\004name\202\323\344\223\002" +
      "6\"1/v1/{name=projects/*/locations/*/runt" +
      "imes/*}:stop:\001*\022\305\001\n\rSwitchRuntime\022/.goog" +
      "le.cloud.notebooks.v1.SwitchRuntimeReque" +
      "st\032\035.google.longrunning.Operation\"d\312A\034\n\007" +
      "Runtime\022\021OperationMetadata\332A\004name\202\323\344\223\0028\"" +
      "3/v1/{name=projects/*/locations/*/runtim" +
      "es/*}:switch:\001*\022\302\001\n\014ResetRuntime\022..googl" +
      "e.cloud.notebooks.v1.ResetRuntimeRequest" +
      "\032\035.google.longrunning.Operation\"c\312A\034\n\007Ru" +
      "ntime\022\021OperationMetadata\332A\004name\202\323\344\223\0027\"2/" +
      "v1/{name=projects/*/locations/*/runtimes" +
      "/*}:reset:\001*\022\310\001\n\016UpgradeRuntime\0220.google" +
      ".cloud.notebooks.v1.UpgradeRuntimeReques" +
      "t\032\035.google.longrunning.Operation\"e\312A\034\n\007R" +
      "untime\022\021OperationMetadata\332A\004name\202\323\344\223\0029\"4" +
      "/v1/{name=projects/*/locations/*/runtime" +
      "s/*}:upgrade:\001*\022\324\001\n\022ReportRuntimeEvent\0224" +
      ".google.cloud.notebooks.v1.ReportRuntime" +
      "EventRequest\032\035.google.longrunning.Operat" +
      "ion\"i\312A\034\n\007Runtime\022\021OperationMetadata\332A\004n" +
      "ame\202\323\344\223\002=\"8/v1/{name=projects/*/location" +
      "s/*/runtimes/*}:reportEvent:\001*\022\376\001\n\033Refre" +
      "shRuntimeTokenInternal\022=.google.cloud.no" +
      "tebooks.v1.RefreshRuntimeTokenInternalRe" +
      "quest\032>.google.cloud.notebooks.v1.Refres" +
      "hRuntimeTokenInternalResponse\"`\332A\nname,v" +
      "m_id\202\323\344\223\002M\"H/v1/{name=projects/*/locatio" +
      "ns/*/runtimes/*}:refreshRuntimeTokenInte" +
      "rnal:\001*\022\335\001\n\017DiagnoseRuntime\0221.google.clo" +
      "ud.notebooks.v1.DiagnoseRuntimeRequest\032\035" +
      ".google.longrunning.Operation\"x\312A\034\n\007Runt" +
      "ime\022\021OperationMetadata\332A\026name,diagnostic" +
      "_config\202\323\344\223\002:\"5/v1/{name=projects/*/loca" +
      "tions/*/runtimes/*}:diagnose:\001*\032L\312A\030note" +
      "books.googleapis.com\322A.https://www.googl" +
      "eapis.com/auth/cloud-platformB\314\001\n\035com.go" +
      "ogle.cloud.notebooks.v1B\025ManagedNotebook" +
      "sProtoP\001Z;cloud.google.com/go/notebooks/" +
      "apiv1/notebookspb;notebookspb\252\002\031Google.C" +
      "loud.Notebooks.V1\312\002\031Google\\Cloud\\Noteboo" +
      "ks\\V1\352\002\034Google::Cloud::Notebooks::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.notebooks.v1.DiagnosticConfigProto.getDescriptor(),
          com.google.cloud.notebooks.v1.EventProto.getDescriptor(),
          com.google.cloud.notebooks.v1.RuntimeProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ListRuntimesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ListRuntimesResponse_descriptor,
        new java.lang.String[] { "Runtimes", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_GetRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor,
        new java.lang.String[] { "Parent", "RuntimeId", "Runtime", "RequestId", });
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_DeleteRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_StartRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_StopRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "MachineType", "AcceleratorConfig", "RequestId", });
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ResetRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_UpgradeRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "RequestId", });
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ReportRuntimeEventRequest_descriptor,
        new java.lang.String[] { "Name", "VmId", "Event", });
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_UpdateRuntimeRequest_descriptor,
        new java.lang.String[] { "Runtime", "UpdateMask", "RequestId", });
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalRequest_descriptor,
        new java.lang.String[] { "Name", "VmId", });
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_RefreshRuntimeTokenInternalResponse_descriptor,
        new java.lang.String[] { "AccessToken", "ExpireTime", });
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_DiagnoseRuntimeRequest_descriptor,
        new java.lang.String[] { "Name", "DiagnosticConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.notebooks.v1.DiagnosticConfigProto.getDescriptor();
    com.google.cloud.notebooks.v1.EventProto.getDescriptor();
    com.google.cloud.notebooks.v1.RuntimeProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
