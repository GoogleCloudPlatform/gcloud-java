/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BargeInConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BargeInConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/v2beta1/audio_"
          + "config.proto\022\037google.cloud.dialogflow.v2"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\036google/protob"
          + "uf/duration.proto\"/\n\rSpeechContext\022\017\n\007ph"
          + "rases\030\001 \003(\t\022\r\n\005boost\030\002 \001(\002\"\222\001\n\016SpeechWor"
          + "dInfo\022\014\n\004word\030\003 \001(\t\022/\n\014start_offset\030\001 \001("
          + "\0132\031.google.protobuf.Duration\022-\n\nend_offs"
          + "et\030\002 \001(\0132\031.google.protobuf.Duration\022\022\n\nc"
          + "onfidence\030\004 \001(\002\"{\n\rBargeInConfig\0227\n\024no_b"
          + "arge_in_duration\030\001 \001(\0132\031.google.protobuf"
          + ".Duration\0221\n\016total_duration\030\002 \001(\0132\031.goog"
          + "le.protobuf.Duration\"\363\003\n\020InputAudioConfi"
          + "g\022F\n\016audio_encoding\030\001 \001(\0162..google.cloud"
          + ".dialogflow.v2beta1.AudioEncoding\022\031\n\021sam"
          + "ple_rate_hertz\030\002 \001(\005\022\025\n\rlanguage_code\030\003 "
          + "\001(\t\022\030\n\020enable_word_info\030\r \001(\010\022\030\n\014phrase_"
          + "hints\030\004 \003(\tB\002\030\001\022G\n\017speech_contexts\030\013 \003(\013"
          + "2..google.cloud.dialogflow.v2beta1.Speec"
          + "hContext\022\r\n\005model\030\007 \001(\t\022J\n\rmodel_variant"
          + "\030\n \001(\01623.google.cloud.dialogflow.v2beta1"
          + ".SpeechModelVariant\022\030\n\020single_utterance\030"
          + "\010 \001(\010\022*\n\"disable_no_speech_recognized_ev"
          + "ent\030\016 \001(\010\022G\n\017barge_in_config\030\017 \001(\0132..goo"
          + "gle.cloud.dialogflow.v2beta1.BargeInConf"
          + "ig\"k\n\024VoiceSelectionParams\022\014\n\004name\030\001 \001(\t"
          + "\022E\n\013ssml_gender\030\002 \001(\01620.google.cloud.dia"
          + "logflow.v2beta1.SsmlVoiceGender\"\270\001\n\026Synt"
          + "hesizeSpeechConfig\022\025\n\rspeaking_rate\030\001 \001("
          + "\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001(\001"
          + "\022\032\n\022effects_profile_id\030\005 \003(\t\022D\n\005voice\030\004 "
          + "\001(\01325.google.cloud.dialogflow.v2beta1.Vo"
          + "iceSelectionParams\"\334\001\n\021OutputAudioConfig"
          + "\022Q\n\016audio_encoding\030\001 \001(\01624.google.cloud."
          + "dialogflow.v2beta1.OutputAudioEncodingB\003"
          + "\340A\002\022\031\n\021sample_rate_hertz\030\002 \001(\005\022Y\n\030synthe"
          + "size_speech_config\030\003 \001(\01327.google.cloud."
          + "dialogflow.v2beta1.SynthesizeSpeechConfi"
          + "g\"Z\n\023TelephonyDtmfEvents\022C\n\013dtmf_events\030"
          + "\001 \003(\0162..google.cloud.dialogflow.v2beta1."
          + "TelephonyDtmf\"v\n\022SpeechToTextConfig\022Q\n\024s"
          + "peech_model_variant\030\001 \001(\01623.google.cloud"
          + ".dialogflow.v2beta1.SpeechModelVariant\022\r"
          + "\n\005model\030\002 \001(\t*\373\001\n\rAudioEncoding\022\036\n\032AUDIO"
          + "_ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_ENCODIN"
          + "G_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_FLAC\020\002\022\030"
          + "\n\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO_ENCODI"
          + "NG_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005\022\033\n\027A"
          + "UDIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO_ENCODI"
          + "NG_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022SpeechMod"
          + "elVariant\022$\n SPEECH_MODEL_VARIANT_UNSPEC"
          + "IFIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014USE_S"
          + "TANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017SsmlVoic"
          + "eGender\022!\n\035SSML_VOICE_GENDER_UNSPECIFIED"
          + "\020\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n\030SSML_V"
          + "OICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOICE_GENDE"
          + "R_NEUTRAL\020\003*\354\001\n\023OutputAudioEncoding\022%\n!O"
          + "UTPUT_AUDIO_ENCODING_UNSPECIFIED\020\000\022#\n\037OU"
          + "TPUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035\n\031OUTPU"
          + "T_AUDIO_ENCODING_MP3\020\002\022%\n!OUTPUT_AUDIO_E"
          + "NCODING_MP3_64_KBPS\020\004\022\"\n\036OUTPUT_AUDIO_EN"
          + "CODING_OGG_OPUS\020\003\022\037\n\033OUTPUT_AUDIO_ENCODI"
          + "NG_MULAW\020\005*\224\002\n\rTelephonyDtmf\022\036\n\032TELEPHON"
          + "Y_DTMF_UNSPECIFIED\020\000\022\014\n\010DTMF_ONE\020\001\022\014\n\010DT"
          + "MF_TWO\020\002\022\016\n\nDTMF_THREE\020\003\022\r\n\tDTMF_FOUR\020\004\022"
          + "\r\n\tDTMF_FIVE\020\005\022\014\n\010DTMF_SIX\020\006\022\016\n\nDTMF_SEV"
          + "EN\020\007\022\016\n\nDTMF_EIGHT\020\010\022\r\n\tDTMF_NINE\020\t\022\r\n\tD"
          + "TMF_ZERO\020\n\022\n\n\006DTMF_A\020\013\022\n\n\006DTMF_B\020\014\022\n\n\006DT"
          + "MF_C\020\r\022\n\n\006DTMF_D\020\016\022\r\n\tDTMF_STAR\020\017\022\016\n\nDTM"
          + "F_POUND\020\020B\345\002\n#com.google.cloud.dialogflo"
          + "w.v2beta1B\020AudioConfigProtoP\001ZCcloud.goo"
          + "gle.com/go/dialogflow/apiv2beta1/dialogf"
          + "lowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Clou"
          + "d.Dialogflow.V2Beta1\352AU\n\033automl.googleap"
          + "is.com/Model\0226projects/{project}/locatio"
          + "ns/{location}/models/{model}\352Ab\n\037speech."
          + "googleapis.com/PhraseSet\022?projects/{proj"
          + "ect}/locations/{location}/phraseSets/{ph"
          + "rase_set}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechContext_descriptor,
            new java.lang.String[] {
              "Phrases", "Boost",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BargeInConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_BargeInConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BargeInConfig_descriptor,
            new java.lang.String[] {
              "NoBargeInDuration", "TotalDuration",
            });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "EnableWordInfo",
              "PhraseHints",
              "SpeechContexts",
              "Model",
              "ModelVariant",
              "SingleUtterance",
              "DisableNoSpeechRecognizedEvent",
              "BargeInConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor,
            new java.lang.String[] {
              "DtmfEvents",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor,
            new java.lang.String[] {
              "SpeechModelVariant", "Model",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
