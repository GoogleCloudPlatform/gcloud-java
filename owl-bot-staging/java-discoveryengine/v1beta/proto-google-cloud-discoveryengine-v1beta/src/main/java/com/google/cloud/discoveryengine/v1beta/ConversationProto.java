// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/conversation.proto

package com.google.cloud.discoveryengine.v1beta;

public final class ConversationProto {
  private ConversationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_Conversation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Conversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_Reply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Reply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_Reply_Reference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Reply_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ConversationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConversationContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_TextInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_discoveryengine_v1beta_ConversationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ConversationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/discoveryengine/v1beta/co" +
      "nversation.proto\022#google.cloud.discovery" +
      "engine.v1beta\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\0328googl" +
      "e/cloud/discoveryengine/v1beta/search_se" +
      "rvice.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\201\005\n\014Conversation\022\022\n\004name\030\001 \001(\tB\004\342A\001" +
      "\005\022F\n\005state\030\002 \001(\01627.google.cloud.discover" +
      "yengine.v1beta.Conversation.State\022\026\n\016use" +
      "r_pseudo_id\030\003 \001(\t\022J\n\010messages\030\004 \003(\01328.go" +
      "ogle.cloud.discoveryengine.v1beta.Conver" +
      "sationMessage\0224\n\nstart_time\030\005 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\004\342A\001\003\0222\n\010end_time\030" +
      "\006 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\"" +
      ">\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\017\n\013IN_PR" +
      "OGRESS\020\001\022\r\n\tCOMPLETED\020\002:\206\002\352A\202\002\n+discover" +
      "yengine.googleapis.com/Conversation\022\\pro" +
      "jects/{project}/locations/{location}/dat" +
      "aStores/{data_store}/conversations/{conv" +
      "ersation}\022uprojects/{project}/locations/" +
      "{location}/collections/{collection}/data" +
      "Stores/{data_store}/conversations/{conve" +
      "rsation}\"\205\002\n\005Reply\022\021\n\005reply\030\001 \001(\tB\002\030\001\022L\n" +
      "\nreferences\030\002 \003(\01324.google.cloud.discove" +
      "ryengine.v1beta.Reply.ReferenceB\002\030\001\022L\n\007s" +
      "ummary\030\003 \001(\0132;.google.cloud.discoveryeng" +
      "ine.v1beta.SearchResponse.Summary\032M\n\tRef" +
      "erence\022\013\n\003uri\030\001 \001(\t\022\023\n\013anchor_text\030\002 \001(\t" +
      "\022\r\n\005start\030\003 \001(\005\022\013\n\003end\030\004 \001(\005:\002\030\001\"I\n\023Conv" +
      "ersationContext\022\031\n\021context_documents\030\001 \003" +
      "(\t\022\027\n\017active_document\030\002 \001(\t\"e\n\tTextInput" +
      "\022\r\n\005input\030\001 \001(\t\022I\n\007context\030\002 \001(\01328.googl" +
      "e.cloud.discoveryengine.v1beta.Conversat" +
      "ionContext\"\332\001\n\023ConversationMessage\022D\n\nus" +
      "er_input\030\001 \001(\0132..google.cloud.discoverye" +
      "ngine.v1beta.TextInputH\000\022;\n\005reply\030\002 \001(\0132" +
      "*.google.cloud.discoveryengine.v1beta.Re" +
      "plyH\000\0225\n\013create_time\030\003 \001(\0132\032.google.prot" +
      "obuf.TimestampB\004\342A\001\003B\t\n\007messageB\230\002\n\'com." +
      "google.cloud.discoveryengine.v1betaB\021Con" +
      "versationProtoP\001ZQcloud.google.com/go/di" +
      "scoveryengine/apiv1beta/discoveryenginep" +
      "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002#" +
      "Google.Cloud.DiscoveryEngine.V1Beta\312\002#Go" +
      "ogle\\Cloud\\DiscoveryEngine\\V1beta\352\002&Goog" +
      "le::Cloud::DiscoveryEngine::V1betab\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_discoveryengine_v1beta_Conversation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Conversation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_Conversation_descriptor,
        new java.lang.String[] { "Name", "State", "UserPseudoId", "Messages", "StartTime", "EndTime", });
    internal_static_google_cloud_discoveryengine_v1beta_Reply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_Reply_descriptor,
        new java.lang.String[] { "Reply", "References", "Summary", });
    internal_static_google_cloud_discoveryengine_v1beta_Reply_Reference_descriptor =
      internal_static_google_cloud_discoveryengine_v1beta_Reply_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Reply_Reference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_Reply_Reference_descriptor,
        new java.lang.String[] { "Uri", "AnchorText", "Start", "End", });
    internal_static_google_cloud_discoveryengine_v1beta_ConversationContext_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_ConversationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ConversationContext_descriptor,
        new java.lang.String[] { "ContextDocuments", "ActiveDocument", });
    internal_static_google_cloud_discoveryengine_v1beta_TextInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_TextInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_TextInput_descriptor,
        new java.lang.String[] { "Input", "Context", });
    internal_static_google_cloud_discoveryengine_v1beta_ConversationMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_ConversationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_discoveryengine_v1beta_ConversationMessage_descriptor,
        new java.lang.String[] { "UserInput", "Reply", "CreateTime", "Message", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
