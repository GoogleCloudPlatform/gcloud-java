// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/osconfig_service.proto

package com.google.cloud.osconfig.v1;

public final class OsConfigProto {
  private OsConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/osconfig/v1/osconfig_serv" +
      "ice.proto\022\030google.cloud.osconfig.v1\032\027goo" +
      "gle/api/client.proto\032\031google/api/resourc" +
      "e.proto\0320google/cloud/osconfig/v1/patch_" +
      "deployments.proto\032)google/cloud/osconfig" +
      "/v1/patch_jobs.proto\032\033google/protobuf/em" +
      "pty.proto\032\034google/api/annotations.proto2" +
      "\254\022\n\017OsConfigService\022\235\001\n\017ExecutePatchJob\022" +
      "0.google.cloud.osconfig.v1.ExecutePatchJ" +
      "obRequest\032\".google.cloud.osconfig.v1.Pat" +
      "chJob\"4\202\323\344\223\002.\")/v1/{parent=projects/*}/p" +
      "atchJobs:execute:\001*\022\221\001\n\013GetPatchJob\022,.go" +
      "ogle.cloud.osconfig.v1.GetPatchJobReques" +
      "t\032\".google.cloud.osconfig.v1.PatchJob\"0\332" +
      "A\004name\202\323\344\223\002#\022!/v1/{name=projects/*/patch" +
      "Jobs/*}\022\232\001\n\016CancelPatchJob\022/.google.clou" +
      "d.osconfig.v1.CancelPatchJobRequest\032\".go" +
      "ogle.cloud.osconfig.v1.PatchJob\"3\202\323\344\223\002-\"" +
      "(/v1/{name=projects/*/patchJobs/*}:cance" +
      "l:\001*\022\244\001\n\rListPatchJobs\022..google.cloud.os" +
      "config.v1.ListPatchJobsRequest\032/.google." +
      "cloud.osconfig.v1.ListPatchJobsResponse\"" +
      "2\332A\006parent\202\323\344\223\002#\022!/v1/{parent=projects/*" +
      "}/patchJobs\022\340\001\n\033ListPatchJobInstanceDeta" +
      "ils\022<.google.cloud.osconfig.v1.ListPatch" +
      "JobInstanceDetailsRequest\032=.google.cloud" +
      ".osconfig.v1.ListPatchJobInstanceDetails" +
      "Response\"D\332A\006parent\202\323\344\223\0025\0223/v1/{parent=p" +
      "rojects/*/patchJobs/*}/instanceDetails\022\354" +
      "\001\n\025CreatePatchDeployment\0226.google.cloud." +
      "osconfig.v1.CreatePatchDeploymentRequest" +
      "\032).google.cloud.osconfig.v1.PatchDeploym" +
      "ent\"p\332A+parent,patch_deployment,patch_de" +
      "ployment_id\202\323\344\223\002<\"(/v1/{parent=projects/" +
      "*}/patchDeployments:\020patch_deployment\022\255\001" +
      "\n\022GetPatchDeployment\0223.google.cloud.osco" +
      "nfig.v1.GetPatchDeploymentRequest\032).goog" +
      "le.cloud.osconfig.v1.PatchDeployment\"7\332A" +
      "\004name\202\323\344\223\002*\022(/v1/{name=projects/*/patchD" +
      "eployments/*}\022\300\001\n\024ListPatchDeployments\0225" +
      ".google.cloud.osconfig.v1.ListPatchDeplo" +
      "ymentsRequest\0326.google.cloud.osconfig.v1" +
      ".ListPatchDeploymentsResponse\"9\332A\006parent" +
      "\202\323\344\223\002*\022(/v1/{parent=projects/*}/patchDep" +
      "loyments\022\240\001\n\025DeletePatchDeployment\0226.goo" +
      "gle.cloud.osconfig.v1.DeletePatchDeploym" +
      "entRequest\032\026.google.protobuf.Empty\"7\332A\004n" +
      "ame\202\323\344\223\002**(/v1/{name=projects/*/patchDep" +
      "loyments/*}\022\356\001\n\025UpdatePatchDeployment\0226." +
      "google.cloud.osconfig.v1.UpdatePatchDepl" +
      "oymentRequest\032).google.cloud.osconfig.v1" +
      ".PatchDeployment\"r\332A\034patch_deployment,up" +
      "date_mask\202\323\344\223\002M29/v1/{patch_deployment.n" +
      "ame=projects/*/patchDeployments/*}:\020patc" +
      "h_deployment\022\272\001\n\024PausePatchDeployment\0225." +
      "google.cloud.osconfig.v1.PausePatchDeplo" +
      "ymentRequest\032).google.cloud.osconfig.v1." +
      "PatchDeployment\"@\332A\004name\202\323\344\223\0023\"./v1/{nam" +
      "e=projects/*/patchDeployments/*}:pause:\001" +
      "*\022\275\001\n\025ResumePatchDeployment\0226.google.clo" +
      "ud.osconfig.v1.ResumePatchDeploymentRequ" +
      "est\032).google.cloud.osconfig.v1.PatchDepl" +
      "oyment\"A\332A\004name\202\323\344\223\0024\"//v1/{name=project" +
      "s/*/patchDeployments/*}:resume:\001*\032K\312A\027os" +
      "config.googleapis.com\322A.https://www.goog" +
      "leapis.com/auth/cloud-platformB\324\002\n\034com.g" +
      "oogle.cloud.osconfig.v1B\rOsConfigProtoZ8" +
      "cloud.google.com/go/osconfig/apiv1/oscon" +
      "figpb;osconfigpb\252\002\030Google.Cloud.OsConfig" +
      ".V1\312\002\030Google\\Cloud\\OsConfig\\V1\352\002\033Google:" +
      ":Cloud::OsConfig::V1\352A\225\001\n\037compute.google" +
      "apis.com/Instance\0224projects/{project}/zo" +
      "nes/{zone}/instances/{instance}\022<project" +
      "s/{project}/locations/{location}/instanc" +
      "es/{instance}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.osconfig.v1.PatchDeployments.getDescriptor(),
          com.google.cloud.osconfig.v1.PatchJobs.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1.PatchDeployments.getDescriptor();
    com.google.cloud.osconfig.v1.PatchJobs.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
