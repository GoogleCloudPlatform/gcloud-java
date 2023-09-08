// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

public interface GetMappingRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.GetMappingRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the mapping rule resource to get.
   * Example: conversionWorkspaces/123/mappingRules/rule123
   *
   * In order to retrieve a previous revision of the mapping rule, also provide
   * the revision ID.
   * Example:
   * conversionWorkspace/123/mappingRules/rule123&#64;c7cfa2a8c7cfa2a8c7cfa2a8c7cfa2a8
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the mapping rule resource to get.
   * Example: conversionWorkspaces/123/mappingRules/rule123
   *
   * In order to retrieve a previous revision of the mapping rule, also provide
   * the revision ID.
   * Example:
   * conversionWorkspace/123/mappingRules/rule123&#64;c7cfa2a8c7cfa2a8c7cfa2a8c7cfa2a8
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
