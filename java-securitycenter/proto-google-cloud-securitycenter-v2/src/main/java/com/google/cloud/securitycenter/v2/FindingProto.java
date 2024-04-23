/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v2/finding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public final class FindingProto {
  private FindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Finding_SourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Finding_SourcePropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Finding_ExternalSystemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Finding_ExternalSystemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Finding_ContactsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Finding_ContactsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/securitycenter/v2/finding"
          + ".proto\022\036google.cloud.securitycenter.v2\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032+google/cloud/securit"
          + "ycenter/v2/access.proto\0320google/cloud/se"
          + "curitycenter/v2/application.proto\0324googl"
          + "e/cloud/securitycenter/v2/attack_exposur"
          + "e.proto\032=google/cloud/securitycenter/v2/"
          + "backup_disaster_recovery.proto\032;google/c"
          + "loud/securitycenter/v2/cloud_dlp_data_pr"
          + "ofile.proto\0329google/cloud/securitycenter"
          + "/v2/cloud_dlp_inspection.proto\032/google/c"
          + "loud/securitycenter/v2/compliance.proto\032"
          + "/google/cloud/securitycenter/v2/connecti"
          + "on.proto\0324google/cloud/securitycenter/v2"
          + "/contact_details.proto\032.google/cloud/sec"
          + "uritycenter/v2/container.proto\032-google/c"
          + "loud/securitycenter/v2/database.proto\0321g"
          + "oogle/cloud/securitycenter/v2/exfiltrati"
          + "on.proto\0324google/cloud/securitycenter/v2"
          + "/external_system.proto\032)google/cloud/sec"
          + "uritycenter/v2/file.proto\0320google/cloud/"
          + "securitycenter/v2/iam_binding.proto\032.goo"
          + "gle/cloud/securitycenter/v2/indicator.pr"
          + "oto\0323google/cloud/securitycenter/v2/kern"
          + "el_rootkit.proto\032/google/cloud/securityc"
          + "enter/v2/kubernetes.proto\0322google/cloud/"
          + "securitycenter/v2/load_balancer.proto\032.g"
          + "oogle/cloud/securitycenter/v2/log_entry."
          + "proto\0321google/cloud/securitycenter/v2/mi"
          + "tre_attack.proto\032/google/cloud/securityc"
          + "enter/v2/org_policy.proto\032,google/cloud/"
          + "securitycenter/v2/process.proto\0323google/"
          + "cloud/securitycenter/v2/security_marks.p"
          + "roto\0325google/cloud/securitycenter/v2/sec"
          + "urity_posture.proto\0322google/cloud/securi"
          + "tycenter/v2/vulnerability.proto\032\034google/"
          + "protobuf/struct.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\206\035\n\007Finding\022\014\n\004name\030\001 \001(\t"
          + "\022\033\n\016canonical_name\030\002 \001(\tB\003\340A\003\022\016\n\006parent\030"
          + "\003 \001(\t\022\032\n\rresource_name\030\004 \001(\tB\003\340A\005\022A\n\005sta"
          + "te\030\006 \001(\0162-.google.cloud.securitycenter.v"
          + "2.Finding.StateB\003\340A\003\022\025\n\010category\030\007 \001(\tB\003"
          + "\340A\005\022\024\n\014external_uri\030\010 \001(\t\022X\n\021source_prop"
          + "erties\030\t \003(\0132=.google.cloud.securitycent"
          + "er.v2.Finding.SourcePropertiesEntry\022J\n\016s"
          + "ecurity_marks\030\n \001(\0132-.google.cloud.secur"
          + "itycenter.v2.SecurityMarksB\003\340A\003\022.\n\nevent"
          + "_time\030\013 \001(\0132\032.google.protobuf.Timestamp\022"
          + "4\n\013create_time\030\014 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\022B\n\010severity\030\016 \001(\01620.google"
          + ".cloud.securitycenter.v2.Finding.Severit"
          + "y\022:\n\004mute\030\017 \001(\0162,.google.cloud.securityc"
          + "enter.v2.Finding.Mute\022K\n\rfinding_class\030\020"
          + " \001(\01624.google.cloud.securitycenter.v2.Fi"
          + "nding.FindingClass\022<\n\tindicator\030\021 \001(\0132)."
          + "google.cloud.securitycenter.v2.Indicator"
          + "\022D\n\rvulnerability\030\022 \001(\0132-.google.cloud.s"
          + "ecuritycenter.v2.Vulnerability\0229\n\020mute_u"
          + "pdate_time\030\023 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022[\n\020external_systems\030\024 \003(\0132<.go"
          + "ogle.cloud.securitycenter.v2.Finding.Ext"
          + "ernalSystemsEntryB\003\340A\003\022A\n\014mitre_attack\030\025"
          + " \001(\0132+.google.cloud.securitycenter.v2.Mi"
          + "treAttack\0226\n\006access\030\026 \001(\0132&.google.cloud"
          + ".securitycenter.v2.Access\022?\n\013connections"
          + "\030\027 \003(\0132*.google.cloud.securitycenter.v2."
          + "Connection\022\026\n\016mute_initiator\030\030 \001(\t\022:\n\tpr"
          + "ocesses\030\031 \003(\0132\'.google.cloud.securitycen"
          + "ter.v2.Process\022L\n\010contacts\030\032 \003(\01325.googl"
          + "e.cloud.securitycenter.v2.Finding.Contac"
          + "tsEntryB\003\340A\003\022?\n\013compliances\030\033 \003(\0132*.goog"
          + "le.cloud.securitycenter.v2.Compliance\022 \n"
          + "\023parent_display_name\030\035 \001(\tB\003\340A\003\022\023\n\013descr"
          + "iption\030\036 \001(\t\022B\n\014exfiltration\030\037 \001(\0132,.goo"
          + "gle.cloud.securitycenter.v2.Exfiltration"
          + "\022@\n\014iam_bindings\030  \003(\0132*.google.cloud.se"
          + "curitycenter.v2.IamBinding\022\022\n\nnext_steps"
          + "\030! \001(\t\022\023\n\013module_name\030\" \001(\t\022=\n\ncontainer"
          + "s\030# \003(\0132).google.cloud.securitycenter.v2"
          + ".Container\022>\n\nkubernetes\030$ \001(\0132*.google."
          + "cloud.securitycenter.v2.Kubernetes\022:\n\010da"
          + "tabase\030% \001(\0132(.google.cloud.securitycent"
          + "er.v2.Database\022G\n\017attack_exposure\030& \001(\0132"
          + "..google.cloud.securitycenter.v2.AttackE"
          + "xposure\0223\n\005files\030\' \003(\0132$.google.cloud.se"
          + "curitycenter.v2.File\022P\n\024cloud_dlp_inspec"
          + "tion\030( \001(\01322.google.cloud.securitycenter"
          + ".v2.CloudDlpInspection\022S\n\026cloud_dlp_data"
          + "_profile\030) \001(\01323.google.cloud.securityce"
          + "nter.v2.CloudDlpDataProfile\022E\n\016kernel_ro"
          + "otkit\030* \001(\0132-.google.cloud.securitycente"
          + "r.v2.KernelRootkit\022?\n\014org_policies\030+ \003(\013"
          + "2).google.cloud.securitycenter.v2.OrgPol"
          + "icy\022@\n\013application\030- \001(\0132+.google.cloud."
          + "securitycenter.v2.Application\022X\n\030backup_"
          + "disaster_recovery\030/ \001(\01326.google.cloud.s"
          + "ecuritycenter.v2.BackupDisasterRecovery\022"
          + "I\n\020security_posture\0300 \001(\0132/.google.cloud"
          + ".securitycenter.v2.SecurityPosture\022=\n\013lo"
          + "g_entries\0301 \003(\0132(.google.cloud.securityc"
          + "enter.v2.LogEntry\022D\n\016load_balancers\0302 \003("
          + "\0132,.google.cloud.securitycenter.v2.LoadB"
          + "alancer\032O\n\025SourcePropertiesEntry\022\013\n\003key\030"
          + "\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf.V"
          + "alue:\0028\001\032f\n\024ExternalSystemsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022=\n\005value\030\002 \001(\0132..google.cloud.secu"
          + "ritycenter.v2.ExternalSystem:\0028\001\032_\n\rCont"
          + "actsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132.."
          + "google.cloud.securitycenter.v2.ContactDe"
          + "tails:\0028\001\"8\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\n\n\006ACTIVE\020\001\022\014\n\010INACTIVE\020\002\"Q\n\010Severity\022"
          + "\030\n\024SEVERITY_UNSPECIFIED\020\000\022\014\n\010CRITICAL\020\001\022"
          + "\010\n\004HIGH\020\002\022\n\n\006MEDIUM\020\003\022\007\n\003LOW\020\004\"C\n\004Mute\022\024"
          + "\n\020MUTE_UNSPECIFIED\020\000\022\t\n\005MUTED\020\001\022\013\n\007UNMUT"
          + "ED\020\002\022\r\n\tUNDEFINED\020\003\"\231\001\n\014FindingClass\022\035\n\031"
          + "FINDING_CLASS_UNSPECIFIED\020\000\022\n\n\006THREAT\020\001\022"
          + "\021\n\rVULNERABILITY\020\002\022\024\n\020MISCONFIGURATION\020\003"
          + "\022\017\n\013OBSERVATION\020\004\022\r\n\tSCC_ERROR\020\005\022\025\n\021POST"
          + "URE_VIOLATION\020\006:\335\003\352A\331\003\n%securitycenter.g"
          + "oogleapis.com/Finding\022@organizations/{or"
          + "ganization}/sources/{source}/findings/{f"
          + "inding}\022Uorganizations/{organization}/so"
          + "urces/{source}/locations/{location}/find"
          + "ings/{finding}\0224folders/{folder}/sources"
          + "/{source}/findings/{finding}\022Ifolders/{f"
          + "older}/sources/{source}/locations/{locat"
          + "ion}/findings/{finding}\0226projects/{proje"
          + "ct}/sources/{source}/findings/{finding}\022"
          + "Kprojects/{project}/sources/{source}/loc"
          + "ations/{location}/findings/{finding}*\010fi"
          + "ndings2\007findingB\346\001\n\"com.google.cloud.sec"
          + "uritycenter.v2B\014FindingProtoP\001ZJcloud.go"
          + "ogle.com/go/securitycenter/apiv2/securit"
          + "ycenterpb;securitycenterpb\252\002\036Google.Clou"
          + "d.SecurityCenter.V2\312\002\036Google\\Cloud\\Secur"
          + "ityCenter\\V2\352\002!Google::Cloud::SecurityCe"
          + "nter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.AccessProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ApplicationProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.AttackExposureProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.BackupDisasterRecoveryProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.CloudDlpDataProfileProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.CloudDlpInspectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ComplianceProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ConnectionProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ContactDetailsProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ContainerProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.DatabaseProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ExfiltrationProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ExternalSystemProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.FileProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.IamBindingProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.IndicatorProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.KernelRootkitProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.KubernetesProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.LoadBalancerProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.LogEntryProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.MitreAttackProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.OrgPolicyProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ProcessProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.SecurityMarksProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.SecurityPostureProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.VulnerabilityProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "CanonicalName",
              "Parent",
              "ResourceName",
              "State",
              "Category",
              "ExternalUri",
              "SourceProperties",
              "SecurityMarks",
              "EventTime",
              "CreateTime",
              "Severity",
              "Mute",
              "FindingClass",
              "Indicator",
              "Vulnerability",
              "MuteUpdateTime",
              "ExternalSystems",
              "MitreAttack",
              "Access",
              "Connections",
              "MuteInitiator",
              "Processes",
              "Contacts",
              "Compliances",
              "ParentDisplayName",
              "Description",
              "Exfiltration",
              "IamBindings",
              "NextSteps",
              "ModuleName",
              "Containers",
              "Kubernetes",
              "Database",
              "AttackExposure",
              "Files",
              "CloudDlpInspection",
              "CloudDlpDataProfile",
              "KernelRootkit",
              "OrgPolicies",
              "Application",
              "BackupDisasterRecovery",
              "SecurityPosture",
              "LogEntries",
              "LoadBalancers",
            });
    internal_static_google_cloud_securitycenter_v2_Finding_SourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v2_Finding_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Finding_SourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Finding_SourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v2_Finding_ExternalSystemsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v2_Finding_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_Finding_ExternalSystemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Finding_ExternalSystemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v2_Finding_ContactsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v2_Finding_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_v2_Finding_ContactsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Finding_ContactsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v2.AccessProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ApplicationProto.getDescriptor();
    com.google.cloud.securitycenter.v2.AttackExposureProto.getDescriptor();
    com.google.cloud.securitycenter.v2.BackupDisasterRecoveryProto.getDescriptor();
    com.google.cloud.securitycenter.v2.CloudDlpDataProfileProto.getDescriptor();
    com.google.cloud.securitycenter.v2.CloudDlpInspectionProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ComplianceProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ConnectionProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ContactDetailsProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ContainerProto.getDescriptor();
    com.google.cloud.securitycenter.v2.DatabaseProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ExfiltrationProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ExternalSystemProto.getDescriptor();
    com.google.cloud.securitycenter.v2.FileProto.getDescriptor();
    com.google.cloud.securitycenter.v2.IamBindingProto.getDescriptor();
    com.google.cloud.securitycenter.v2.IndicatorProto.getDescriptor();
    com.google.cloud.securitycenter.v2.KernelRootkitProto.getDescriptor();
    com.google.cloud.securitycenter.v2.KubernetesProto.getDescriptor();
    com.google.cloud.securitycenter.v2.LoadBalancerProto.getDescriptor();
    com.google.cloud.securitycenter.v2.LogEntryProto.getDescriptor();
    com.google.cloud.securitycenter.v2.MitreAttackProto.getDescriptor();
    com.google.cloud.securitycenter.v2.OrgPolicyProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ProcessProto.getDescriptor();
    com.google.cloud.securitycenter.v2.SecurityMarksProto.getDescriptor();
    com.google.cloud.securitycenter.v2.SecurityPostureProto.getDescriptor();
    com.google.cloud.securitycenter.v2.VulnerabilityProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
