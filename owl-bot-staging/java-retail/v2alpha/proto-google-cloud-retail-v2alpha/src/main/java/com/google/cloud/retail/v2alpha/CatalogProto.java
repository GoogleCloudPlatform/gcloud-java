// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/catalog.proto

package com.google.cloud.retail.v2alpha;

public final class CatalogProto {
  private CatalogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CatalogAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompletionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_MerchantCenterFeedFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterFeedFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2alpha_Catalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Catalog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/retail/v2alpha/catalog.pr" +
      "oto\022\033google.cloud.retail.v2alpha\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032(google/cloud/retail/v2alph" +
      "a/common.proto\032/google/cloud/retail/v2al" +
      "pha/import_config.proto\"^\n\022ProductLevelC" +
      "onfig\022\036\n\026ingestion_product_type\030\001 \001(\t\022(\n" +
      " merchant_center_product_id_field\030\002 \001(\t\"" +
      "\307\n\n\020CatalogAttribute\022\021\n\003key\030\001 \001(\tB\004\342A\001\002\022" +
      "\024\n\006in_use\030\t \001(\010B\004\342A\001\003\022O\n\004type\030\n \001(\0162;.go" +
      "ogle.cloud.retail.v2alpha.CatalogAttribu" +
      "te.AttributeTypeB\004\342A\001\003\022W\n\020indexable_opti" +
      "on\030\005 \001(\0162=.google.cloud.retail.v2alpha.C" +
      "atalogAttribute.IndexableOption\022f\n\030dynam" +
      "ic_facetable_option\030\006 \001(\0162D.google.cloud" +
      ".retail.v2alpha.CatalogAttribute.Dynamic" +
      "FacetableOption\022Y\n\021searchable_option\030\007 \001" +
      "(\0162>.google.cloud.retail.v2alpha.Catalog" +
      "Attribute.SearchableOption\022e\n recommenda" +
      "tions_filtering_option\030\010 \001(\0162;.google.cl" +
      "oud.retail.v2alpha.RecommendationsFilter" +
      "ingOption\022d\n\027exact_searchable_option\030\013 \001" +
      "(\0162C.google.cloud.retail.v2alpha.Catalog" +
      "Attribute.ExactSearchableOption\022[\n\022retri" +
      "evable_option\030\014 \001(\0162?.google.cloud.retai" +
      "l.v2alpha.CatalogAttribute.RetrievableOp" +
      "tion\"8\n\rAttributeType\022\013\n\007UNKNOWN\020\000\022\013\n\007TE" +
      "XTUAL\020\001\022\r\n\tNUMERICAL\020\002\"b\n\017IndexableOptio" +
      "n\022 \n\034INDEXABLE_OPTION_UNSPECIFIED\020\000\022\025\n\021I" +
      "NDEXABLE_ENABLED\020\001\022\026\n\022INDEXABLE_DISABLED" +
      "\020\002\"\201\001\n\026DynamicFacetableOption\022(\n$DYNAMIC" +
      "_FACETABLE_OPTION_UNSPECIFIED\020\000\022\035\n\031DYNAM" +
      "IC_FACETABLE_ENABLED\020\001\022\036\n\032DYNAMIC_FACETA" +
      "BLE_DISABLED\020\002\"f\n\020SearchableOption\022!\n\035SE" +
      "ARCHABLE_OPTION_UNSPECIFIED\020\000\022\026\n\022SEARCHA" +
      "BLE_ENABLED\020\001\022\027\n\023SEARCHABLE_DISABLED\020\002\"}" +
      "\n\025ExactSearchableOption\022\'\n#EXACT_SEARCHA" +
      "BLE_OPTION_UNSPECIFIED\020\000\022\034\n\030EXACT_SEARCH" +
      "ABLE_ENABLED\020\001\022\035\n\031EXACT_SEARCHABLE_DISAB" +
      "LED\020\002\"j\n\021RetrievableOption\022\"\n\036RETRIEVABL" +
      "E_OPTION_UNSPECIFIED\020\000\022\027\n\023RETRIEVABLE_EN" +
      "ABLED\020\001\022\030\n\024RETRIEVABLE_DISABLED\020\002\"\305\003\n\020At" +
      "tributesConfig\022\023\n\004name\030\001 \001(\tB\005\342A\002\002\005\022`\n\022c" +
      "atalog_attributes\030\002 \003(\0132D.google.cloud.r" +
      "etail.v2alpha.AttributesConfig.CatalogAt" +
      "tributesEntry\022W\n\026attribute_config_level\030" +
      "\003 \001(\01621.google.cloud.retail.v2alpha.Attr" +
      "ibuteConfigLevelB\004\342A\001\003\032g\n\026CatalogAttribu" +
      "tesEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value\030\002 \001(\0132-.g" +
      "oogle.cloud.retail.v2alpha.CatalogAttrib" +
      "ute:\0028\001:x\352Au\n&retail.googleapis.com/Attr" +
      "ibutesConfig\022Kprojects/{project}/locatio" +
      "ns/{location}/catalogs/{catalog}/attribu" +
      "tesConfig\"\255\005\n\020CompletionConfig\022\023\n\004name\030\001" +
      " \001(\tB\005\342A\002\002\005\022\026\n\016matching_order\030\002 \001(\t\022\027\n\017m" +
      "ax_suggestions\030\003 \001(\005\022\031\n\021min_prefix_lengt" +
      "h\030\004 \001(\005\022\025\n\rauto_learning\030\013 \001(\010\022^\n\030sugges" +
      "tions_input_config\030\005 \001(\01326.google.cloud." +
      "retail.v2alpha.CompletionDataInputConfig" +
      "B\004\342A\001\003\022/\n!last_suggestions_import_operat" +
      "ion\030\006 \001(\tB\004\342A\001\003\022[\n\025denylist_input_config" +
      "\030\007 \001(\01326.google.cloud.retail.v2alpha.Com" +
      "pletionDataInputConfigB\004\342A\001\003\022,\n\036last_den" +
      "ylist_import_operation\030\010 \001(\tB\004\342A\001\003\022\\\n\026al" +
      "lowlist_input_config\030\t \001(\01326.google.clou" +
      "d.retail.v2alpha.CompletionDataInputConf" +
      "igB\004\342A\001\003\022-\n\037last_allowlist_import_operat" +
      "ion\030\n \001(\tB\004\342A\001\003:x\352Au\n&retail.googleapis." +
      "com/CompletionConfig\022Kprojects/{project}" +
      "/locations/{location}/catalogs/{catalog}" +
      "/completionConfig\"\331\001\n\022MerchantCenterLink" +
      "\022(\n\032merchant_center_account_id\030\001 \001(\003B\004\342A" +
      "\001\002\022\021\n\tbranch_id\030\002 \001(\t\022\024\n\014destinations\030\003 " +
      "\003(\t\022\023\n\013region_code\030\004 \001(\t\022\025\n\rlanguage_cod" +
      "e\030\005 \001(\t\022D\n\005feeds\030\006 \003(\01325.google.cloud.re" +
      "tail.v2alpha.MerchantCenterFeedFilter\"N\n" +
      "\030MerchantCenterFeedFilter\022\027\n\017primary_fee" +
      "d_id\030\001 \001(\003\022\031\n\021primary_feed_name\030\002 \001(\t\"]\n" +
      "\033MerchantCenterLinkingConfig\022>\n\005links\030\001 " +
      "\003(\0132/.google.cloud.retail.v2alpha.Mercha" +
      "ntCenterLink\"\322\002\n\007Catalog\022\023\n\004name\030\001 \001(\tB\005" +
      "\342A\002\002\005\022\033\n\014display_name\030\002 \001(\tB\005\342A\002\002\005\022S\n\024pr" +
      "oduct_level_config\030\004 \001(\0132/.google.cloud." +
      "retail.v2alpha.ProductLevelConfigB\004\342A\001\002\022" +
      "`\n\036merchant_center_linking_config\030\006 \001(\0132" +
      "8.google.cloud.retail.v2alpha.MerchantCe" +
      "nterLinkingConfig:^\352A[\n\035retail.googleapi" +
      "s.com/Catalog\022:projects/{project}/locati" +
      "ons/{location}/catalogs/{catalog}B\320\001\n\037co" +
      "m.google.cloud.retail.v2alphaB\014CatalogPr" +
      "otoP\001Z7cloud.google.com/go/retail/apiv2a" +
      "lpha/retailpb;retailpb\242\002\006RETAIL\252\002\033Google" +
      ".Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Ret" +
      "ail\\V2alpha\352\002\036Google::Cloud::Retail::V2a" +
      "lphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_ProductLevelConfig_descriptor,
        new java.lang.String[] { "IngestionProductType", "MerchantCenterProductIdField", });
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_CatalogAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_CatalogAttribute_descriptor,
        new java.lang.String[] { "Key", "InUse", "Type", "IndexableOption", "DynamicFacetableOption", "SearchableOption", "RecommendationsFilteringOption", "ExactSearchableOption", "RetrievableOption", });
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor,
        new java.lang.String[] { "Name", "CatalogAttributes", "AttributeConfigLevel", });
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor =
      internal_static_google_cloud_retail_v2alpha_AttributesConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_AttributesConfig_CatalogAttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_CompletionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_CompletionConfig_descriptor,
        new java.lang.String[] { "Name", "MatchingOrder", "MaxSuggestions", "MinPrefixLength", "AutoLearning", "SuggestionsInputConfig", "LastSuggestionsImportOperation", "DenylistInputConfig", "LastDenylistImportOperation", "AllowlistInputConfig", "LastAllowlistImportOperation", });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_MerchantCenterLink_descriptor,
        new java.lang.String[] { "MerchantCenterAccountId", "BranchId", "Destinations", "RegionCode", "LanguageCode", "Feeds", });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterFeedFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterFeedFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_MerchantCenterFeedFilter_descriptor,
        new java.lang.String[] { "PrimaryFeedId", "PrimaryFeedName", });
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_MerchantCenterLinkingConfig_descriptor,
        new java.lang.String[] { "Links", });
    internal_static_google_cloud_retail_v2alpha_Catalog_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2alpha_Catalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2alpha_Catalog_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ProductLevelConfig", "MerchantCenterLinkingConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ImportConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
