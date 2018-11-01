// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

public final class TextToSpeechProto {
  private TextToSpeechProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/texttospeech/v1beta1/clou" +
      "d_tts.proto\022!google.cloud.texttospeech.v" +
      "1beta1\032\034google/api/annotations.proto\"*\n\021" +
      "ListVoicesRequest\022\025\n\rlanguage_code\030\001 \001(\t" +
      "\"N\n\022ListVoicesResponse\0228\n\006voices\030\001 \003(\0132(" +
      ".google.cloud.texttospeech.v1beta1.Voice" +
      "\"\231\001\n\005Voice\022\026\n\016language_codes\030\001 \003(\t\022\014\n\004na" +
      "me\030\002 \001(\t\022G\n\013ssml_gender\030\003 \001(\01622.google.c" +
      "loud.texttospeech.v1beta1.SsmlVoiceGende" +
      "r\022!\n\031natural_sample_rate_hertz\030\004 \001(\005\"\351\001\n" +
      "\027SynthesizeSpeechRequest\022@\n\005input\030\001 \001(\0132" +
      "1.google.cloud.texttospeech.v1beta1.Synt" +
      "hesisInput\022F\n\005voice\030\002 \001(\01327.google.cloud" +
      ".texttospeech.v1beta1.VoiceSelectionPara" +
      "ms\022D\n\014audio_config\030\003 \001(\0132..google.cloud." +
      "texttospeech.v1beta1.AudioConfig\"@\n\016Synt" +
      "hesisInput\022\016\n\004text\030\001 \001(\tH\000\022\016\n\004ssml\030\002 \001(\t" +
      "H\000B\016\n\014input_source\"\204\001\n\024VoiceSelectionPar" +
      "ams\022\025\n\rlanguage_code\030\001 \001(\t\022\014\n\004name\030\002 \001(\t" +
      "\022G\n\013ssml_gender\030\003 \001(\01622.google.cloud.tex" +
      "ttospeech.v1beta1.SsmlVoiceGender\"\314\001\n\013Au" +
      "dioConfig\022H\n\016audio_encoding\030\001 \001(\01620.goog" +
      "le.cloud.texttospeech.v1beta1.AudioEncod" +
      "ing\022\025\n\rspeaking_rate\030\002 \001(\001\022\r\n\005pitch\030\003 \001(" +
      "\001\022\026\n\016volume_gain_db\030\004 \001(\001\022\031\n\021sample_rate" +
      "_hertz\030\005 \001(\005\022\032\n\022effects_profile_id\030\006 \003(\t" +
      "\"1\n\030SynthesizeSpeechResponse\022\025\n\raudio_co" +
      "ntent\030\001 \001(\014*W\n\017SsmlVoiceGender\022!\n\035SSML_V" +
      "OICE_GENDER_UNSPECIFIED\020\000\022\010\n\004MALE\020\001\022\n\n\006F" +
      "EMALE\020\002\022\013\n\007NEUTRAL\020\003*T\n\rAudioEncoding\022\036\n" +
      "\032AUDIO_ENCODING_UNSPECIFIED\020\000\022\014\n\010LINEAR1" +
      "6\020\001\022\007\n\003MP3\020\002\022\014\n\010OGG_OPUS\020\0032\326\002\n\014TextToSpe" +
      "ech\022\222\001\n\nListVoices\0224.google.cloud.textto" +
      "speech.v1beta1.ListVoicesRequest\0325.googl" +
      "e.cloud.texttospeech.v1beta1.ListVoicesR" +
      "esponse\"\027\202\323\344\223\002\021\022\017/v1beta1/voices\022\260\001\n\020Syn" +
      "thesizeSpeech\022:.google.cloud.texttospeec" +
      "h.v1beta1.SynthesizeSpeechRequest\032;.goog" +
      "le.cloud.texttospeech.v1beta1.Synthesize" +
      "SpeechResponse\"#\202\323\344\223\002\035\"\030/v1beta1/text:sy" +
      "nthesize:\001*B\216\001\n%com.google.cloud.texttos" +
      "peech.v1beta1B\021TextToSpeechProtoP\001ZMgoog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "texttospeech/v1beta1;texttospeech\370\001\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor,
        new java.lang.String[] { "LanguageCode", });
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor,
        new java.lang.String[] { "Voices", });
    internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor,
        new java.lang.String[] { "LanguageCodes", "Name", "SsmlGender", "NaturalSampleRateHertz", });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor,
        new java.lang.String[] { "Input", "Voice", "AudioConfig", });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor,
        new java.lang.String[] { "Text", "Ssml", "InputSource", });
    internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor,
        new java.lang.String[] { "LanguageCode", "Name", "SsmlGender", });
    internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SpeakingRate", "Pitch", "VolumeGainDb", "SampleRateHertz", "EffectsProfileId", });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor,
        new java.lang.String[] { "AudioContent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
