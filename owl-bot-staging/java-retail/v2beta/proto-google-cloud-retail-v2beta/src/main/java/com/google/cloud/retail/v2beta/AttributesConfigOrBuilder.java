// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

public interface AttributesConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.AttributesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. The fully qualified resource name of the attribute
   * config. Format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;&#47;attributesConfig`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Immutable. The fully qualified resource name of the attribute
   * config. Format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;&#47;attributesConfig`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Enable attribute(s) config at catalog level.
   * For example, indexable, dynamic_facetable, or searchable for each
   * attribute.
   *
   * The key is catalog attribute's name.
   * For example: `color`, `brands`, `attributes.custom_attribute`, such as
   * `attributes.xyz`.
   *
   * The maximum number of catalog attributes allowed in a request is 1000.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2beta.CatalogAttribute&gt; catalog_attributes = 2;</code>
   */
  int getCatalogAttributesCount();
  /**
   * <pre>
   * Enable attribute(s) config at catalog level.
   * For example, indexable, dynamic_facetable, or searchable for each
   * attribute.
   *
   * The key is catalog attribute's name.
   * For example: `color`, `brands`, `attributes.custom_attribute`, such as
   * `attributes.xyz`.
   *
   * The maximum number of catalog attributes allowed in a request is 1000.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2beta.CatalogAttribute&gt; catalog_attributes = 2;</code>
   */
  boolean containsCatalogAttributes(
      java.lang.String key);
  /**
   * Use {@link #getCatalogAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.retail.v2beta.CatalogAttribute>
  getCatalogAttributes();
  /**
   * <pre>
   * Enable attribute(s) config at catalog level.
   * For example, indexable, dynamic_facetable, or searchable for each
   * attribute.
   *
   * The key is catalog attribute's name.
   * For example: `color`, `brands`, `attributes.custom_attribute`, such as
   * `attributes.xyz`.
   *
   * The maximum number of catalog attributes allowed in a request is 1000.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2beta.CatalogAttribute&gt; catalog_attributes = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.retail.v2beta.CatalogAttribute>
  getCatalogAttributesMap();
  /**
   * <pre>
   * Enable attribute(s) config at catalog level.
   * For example, indexable, dynamic_facetable, or searchable for each
   * attribute.
   *
   * The key is catalog attribute's name.
   * For example: `color`, `brands`, `attributes.custom_attribute`, such as
   * `attributes.xyz`.
   *
   * The maximum number of catalog attributes allowed in a request is 1000.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2beta.CatalogAttribute&gt; catalog_attributes = 2;</code>
   */
  /* nullable */
com.google.cloud.retail.v2beta.CatalogAttribute getCatalogAttributesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.retail.v2beta.CatalogAttribute defaultValue);
  /**
   * <pre>
   * Enable attribute(s) config at catalog level.
   * For example, indexable, dynamic_facetable, or searchable for each
   * attribute.
   *
   * The key is catalog attribute's name.
   * For example: `color`, `brands`, `attributes.custom_attribute`, such as
   * `attributes.xyz`.
   *
   * The maximum number of catalog attributes allowed in a request is 1000.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2beta.CatalogAttribute&gt; catalog_attributes = 2;</code>
   */
  com.google.cloud.retail.v2beta.CatalogAttribute getCatalogAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. The
   * [AttributeConfigLevel][google.cloud.retail.v2beta.AttributeConfigLevel]
   * used for this catalog.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.AttributeConfigLevel attribute_config_level = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for attributeConfigLevel.
   */
  int getAttributeConfigLevelValue();
  /**
   * <pre>
   * Output only. The
   * [AttributeConfigLevel][google.cloud.retail.v2beta.AttributeConfigLevel]
   * used for this catalog.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.AttributeConfigLevel attribute_config_level = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The attributeConfigLevel.
   */
  com.google.cloud.retail.v2beta.AttributeConfigLevel getAttributeConfigLevel();
}
