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
// source: google/apps/script/type/gmail/gmail_addon_manifest.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.script.type.gmail;

public interface GmailAddOnManifestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.gmail.GmailAddOnManifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines an endpoint that will be executed in contexts that don't
   * match a declared contextual trigger. Any cards generated by this function
   * will always be available to the user, but may be eclipsed by contextual
   * content when this add-on declares more targeted triggers.
   *
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 14;</code>
   *
   * @return Whether the homepageTrigger field is set.
   */
  boolean hasHomepageTrigger();
  /**
   *
   *
   * <pre>
   * Defines an endpoint that will be executed in contexts that don't
   * match a declared contextual trigger. Any cards generated by this function
   * will always be available to the user, but may be eclipsed by contextual
   * content when this add-on declares more targeted triggers.
   *
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 14;</code>
   *
   * @return The homepageTrigger.
   */
  com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger();
  /**
   *
   *
   * <pre>
   * Defines an endpoint that will be executed in contexts that don't
   * match a declared contextual trigger. Any cards generated by this function
   * will always be available to the user, but may be eclipsed by contextual
   * content when this add-on declares more targeted triggers.
   *
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 14;</code>
   */
  com.google.apps.script.type.HomepageExtensionPointOrBuilder getHomepageTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Defines the set of conditions that trigger the add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.ContextualTrigger contextual_triggers = 3;</code>
   */
  java.util.List<com.google.apps.script.type.gmail.ContextualTrigger> getContextualTriggersList();
  /**
   *
   *
   * <pre>
   * Defines the set of conditions that trigger the add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.ContextualTrigger contextual_triggers = 3;</code>
   */
  com.google.apps.script.type.gmail.ContextualTrigger getContextualTriggers(int index);
  /**
   *
   *
   * <pre>
   * Defines the set of conditions that trigger the add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.ContextualTrigger contextual_triggers = 3;</code>
   */
  int getContextualTriggersCount();
  /**
   *
   *
   * <pre>
   * Defines the set of conditions that trigger the add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.ContextualTrigger contextual_triggers = 3;</code>
   */
  java.util.List<? extends com.google.apps.script.type.gmail.ContextualTriggerOrBuilder>
      getContextualTriggersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines the set of conditions that trigger the add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.ContextualTrigger contextual_triggers = 3;</code>
   */
  com.google.apps.script.type.gmail.ContextualTriggerOrBuilder getContextualTriggersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Defines set of [universal
   * actions](/gmail/add-ons/how-tos/universal-actions) for the add-on. The user
   * triggers universal actions from the add-on toolbar menu.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.UniversalAction universal_actions = 4;</code>
   */
  java.util.List<com.google.apps.script.type.gmail.UniversalAction> getUniversalActionsList();
  /**
   *
   *
   * <pre>
   * Defines set of [universal
   * actions](/gmail/add-ons/how-tos/universal-actions) for the add-on. The user
   * triggers universal actions from the add-on toolbar menu.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.UniversalAction universal_actions = 4;</code>
   */
  com.google.apps.script.type.gmail.UniversalAction getUniversalActions(int index);
  /**
   *
   *
   * <pre>
   * Defines set of [universal
   * actions](/gmail/add-ons/how-tos/universal-actions) for the add-on. The user
   * triggers universal actions from the add-on toolbar menu.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.UniversalAction universal_actions = 4;</code>
   */
  int getUniversalActionsCount();
  /**
   *
   *
   * <pre>
   * Defines set of [universal
   * actions](/gmail/add-ons/how-tos/universal-actions) for the add-on. The user
   * triggers universal actions from the add-on toolbar menu.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.UniversalAction universal_actions = 4;</code>
   */
  java.util.List<? extends com.google.apps.script.type.gmail.UniversalActionOrBuilder>
      getUniversalActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines set of [universal
   * actions](/gmail/add-ons/how-tos/universal-actions) for the add-on. The user
   * triggers universal actions from the add-on toolbar menu.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.gmail.UniversalAction universal_actions = 4;</code>
   */
  com.google.apps.script.type.gmail.UniversalActionOrBuilder getUniversalActionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Defines the compose time trigger for a compose time add-on. This is the
   * trigger that causes an add-on to take action when the user is composing an
   * email.
   * All compose time addons are required to have the
   * gmail.addons.current.action.compose scope even though it might not edit the
   * draft.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.ComposeTrigger compose_trigger = 12;</code>
   *
   * @return Whether the composeTrigger field is set.
   */
  boolean hasComposeTrigger();
  /**
   *
   *
   * <pre>
   * Defines the compose time trigger for a compose time add-on. This is the
   * trigger that causes an add-on to take action when the user is composing an
   * email.
   * All compose time addons are required to have the
   * gmail.addons.current.action.compose scope even though it might not edit the
   * draft.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.ComposeTrigger compose_trigger = 12;</code>
   *
   * @return The composeTrigger.
   */
  com.google.apps.script.type.gmail.ComposeTrigger getComposeTrigger();
  /**
   *
   *
   * <pre>
   * Defines the compose time trigger for a compose time add-on. This is the
   * trigger that causes an add-on to take action when the user is composing an
   * email.
   * All compose time addons are required to have the
   * gmail.addons.current.action.compose scope even though it might not edit the
   * draft.
   * </pre>
   *
   * <code>.google.apps.script.type.gmail.ComposeTrigger compose_trigger = 12;</code>
   */
  com.google.apps.script.type.gmail.ComposeTriggerOrBuilder getComposeTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of an endpoint that verifies that the add-on has
   * all the required third-party authorizations, by probing the third-party
   * APIs. If the probe fails, the function should throw an exception to
   * initiate the authorization flow. This function is called before each
   * invocation of the add-on, in order to ensure a smooth user experience.
   * </pre>
   *
   * <code>string authorization_check_function = 7;</code>
   *
   * @return The authorizationCheckFunction.
   */
  java.lang.String getAuthorizationCheckFunction();
  /**
   *
   *
   * <pre>
   * The name of an endpoint that verifies that the add-on has
   * all the required third-party authorizations, by probing the third-party
   * APIs. If the probe fails, the function should throw an exception to
   * initiate the authorization flow. This function is called before each
   * invocation of the add-on, in order to ensure a smooth user experience.
   * </pre>
   *
   * <code>string authorization_check_function = 7;</code>
   *
   * @return The bytes for authorizationCheckFunction.
   */
  com.google.protobuf.ByteString getAuthorizationCheckFunctionBytes();
}
