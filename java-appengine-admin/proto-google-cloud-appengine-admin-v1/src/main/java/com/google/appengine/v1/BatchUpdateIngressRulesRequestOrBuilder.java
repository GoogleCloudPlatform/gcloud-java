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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface BatchUpdateIngressRulesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.BatchUpdateIngressRulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the Firewall collection to set.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the Firewall collection to set.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 2;</code>
   */
  java.util.List<com.google.appengine.v1.firewall.FirewallRule> getIngressRulesList();
  /**
   *
   *
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 2;</code>
   */
  com.google.appengine.v1.firewall.FirewallRule getIngressRules(int index);
  /**
   *
   *
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 2;</code>
   */
  int getIngressRulesCount();
  /**
   *
   *
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 2;</code>
   */
  java.util.List<? extends com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
      getIngressRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 2;</code>
   */
  com.google.appengine.v1.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(int index);
}
