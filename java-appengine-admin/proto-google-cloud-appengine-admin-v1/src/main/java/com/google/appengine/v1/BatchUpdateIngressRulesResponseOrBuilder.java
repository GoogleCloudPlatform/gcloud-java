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

public interface BatchUpdateIngressRulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.BatchUpdateIngressRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  java.util.List<com.google.appengine.v1.firewall.FirewallRule> getIngressRulesList();
  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  com.google.appengine.v1.firewall.FirewallRule getIngressRules(int index);
  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  int getIngressRulesCount();
  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  java.util.List<? extends com.google.appengine.v1.firewall.FirewallRuleOrBuilder>
      getIngressRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  com.google.appengine.v1.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(int index);
}
