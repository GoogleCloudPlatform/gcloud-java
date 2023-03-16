// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface EntityTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.EntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the entity type.
   * Required for
   * [EntityTypes.UpdateEntityType][google.cloud.dialogflow.cx.v3.EntityTypes.UpdateEntityType].
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique identifier of the entity type.
   * Required for
   * [EntityTypes.UpdateEntityType][google.cloud.dialogflow.cx.v3.EntityTypes.UpdateEntityType].
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The human-readable name of the entity type, unique within the
   * agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The human-readable name of the entity type, unique within the
   * agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType.Kind kind = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType.Kind kind = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The kind.
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.Kind getKind();

  /**
   * <pre>
   * Indicates whether the entity type can be automatically expanded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType.AutoExpansionMode auto_expansion_mode = 4;</code>
   * @return The enum numeric value on the wire for autoExpansionMode.
   */
  int getAutoExpansionModeValue();
  /**
   * <pre>
   * Indicates whether the entity type can be automatically expanded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType.AutoExpansionMode auto_expansion_mode = 4;</code>
   * @return The autoExpansionMode.
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.AutoExpansionMode getAutoExpansionMode();

  /**
   * <pre>
   * The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.Entity entities = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.EntityType.Entity> 
      getEntitiesList();
  /**
   * <pre>
   * The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.Entity entities = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.Entity getEntities(int index);
  /**
   * <pre>
   * The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.Entity entities = 5;</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.Entity entities = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.EntityType.EntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.Entity entities = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.EntityOrBuilder getEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Collection of exceptional words and phrases that shouldn't be matched.
   * For example, if you have a size entity type with entry `giant`(an
   * adjective), you might consider adding `giants`(a noun) as an exclusion.
   * If the kind of entity type is `KIND_MAP`, then the phrases specified by
   * entities and excluded phrases should be mutually exclusive.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase excluded_phrases = 6;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase> 
      getExcludedPhrasesList();
  /**
   * <pre>
   * Collection of exceptional words and phrases that shouldn't be matched.
   * For example, if you have a size entity type with entry `giant`(an
   * adjective), you might consider adding `giants`(a noun) as an exclusion.
   * If the kind of entity type is `KIND_MAP`, then the phrases specified by
   * entities and excluded phrases should be mutually exclusive.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase excluded_phrases = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase getExcludedPhrases(int index);
  /**
   * <pre>
   * Collection of exceptional words and phrases that shouldn't be matched.
   * For example, if you have a size entity type with entry `giant`(an
   * adjective), you might consider adding `giants`(a noun) as an exclusion.
   * If the kind of entity type is `KIND_MAP`, then the phrases specified by
   * entities and excluded phrases should be mutually exclusive.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase excluded_phrases = 6;</code>
   */
  int getExcludedPhrasesCount();
  /**
   * <pre>
   * Collection of exceptional words and phrases that shouldn't be matched.
   * For example, if you have a size entity type with entry `giant`(an
   * adjective), you might consider adding `giants`(a noun) as an exclusion.
   * If the kind of entity type is `KIND_MAP`, then the phrases specified by
   * entities and excluded phrases should be mutually exclusive.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase excluded_phrases = 6;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhraseOrBuilder> 
      getExcludedPhrasesOrBuilderList();
  /**
   * <pre>
   * Collection of exceptional words and phrases that shouldn't be matched.
   * For example, if you have a size entity type with entry `giant`(an
   * adjective), you might consider adding `giants`(a noun) as an exclusion.
   * If the kind of entity type is `KIND_MAP`, then the phrases specified by
   * entities and excluded phrases should be mutually exclusive.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase excluded_phrases = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhraseOrBuilder getExcludedPhrasesOrBuilder(
      int index);

  /**
   * <pre>
   * Enables fuzzy entity extraction during classification.
   * </pre>
   *
   * <code>bool enable_fuzzy_extraction = 7;</code>
   * @return The enableFuzzyExtraction.
   */
  boolean getEnableFuzzyExtraction();

  /**
   * <pre>
   * Indicates whether parameters of the entity type should be redacted in log.
   * If redaction is enabled, page parameters and intent parameters referring to
   * the entity type will be replaced by parameter name when logging.
   * </pre>
   *
   * <code>bool redact = 9;</code>
   * @return The redact.
   */
  boolean getRedact();
}
