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
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1.provenance;

public interface CommandOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.provenance.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the command, as presented on the command line, or if the
   * command is packaged as a Docker container, as presented to `docker pull`.
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
   * Required. Name of the command, as presented on the command line, or if the
   * command is packaged as a Docker container, as presented to `docker pull`.
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
   * Environment variables set before running this command.
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @return A list containing the env.
   */
  java.util.List<java.lang.String> getEnvList();
  /**
   *
   *
   * <pre>
   * Environment variables set before running this command.
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @return The count of env.
   */
  int getEnvCount();
  /**
   *
   *
   * <pre>
   * Environment variables set before running this command.
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The env at the given index.
   */
  java.lang.String getEnv(int index);
  /**
   *
   *
   * <pre>
   * Environment variables set before running this command.
   * </pre>
   *
   * <code>repeated string env = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the env at the given index.
   */
  com.google.protobuf.ByteString getEnvBytes(int index);

  /**
   *
   *
   * <pre>
   * Command-line arguments used when executing this command.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return A list containing the args.
   */
  java.util.List<java.lang.String> getArgsList();
  /**
   *
   *
   * <pre>
   * Command-line arguments used when executing this command.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @return The count of args.
   */
  int getArgsCount();
  /**
   *
   *
   * <pre>
   * Command-line arguments used when executing this command.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   *
   *
   * <pre>
   * Command-line arguments used when executing this command.
   * </pre>
   *
   * <code>repeated string args = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString getArgsBytes(int index);

  /**
   *
   *
   * <pre>
   * Working directory (relative to project source root) used when running this
   * command.
   * </pre>
   *
   * <code>string dir = 4;</code>
   *
   * @return The dir.
   */
  java.lang.String getDir();
  /**
   *
   *
   * <pre>
   * Working directory (relative to project source root) used when running this
   * command.
   * </pre>
   *
   * <code>string dir = 4;</code>
   *
   * @return The bytes for dir.
   */
  com.google.protobuf.ByteString getDirBytes();

  /**
   *
   *
   * <pre>
   * Optional unique identifier for this command, used in wait_for to reference
   * this command as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Optional unique identifier for this command, used in wait_for to reference
   * this command as a dependency.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The ID(s) of the command(s) that this command depends on.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @return A list containing the waitFor.
   */
  java.util.List<java.lang.String> getWaitForList();
  /**
   *
   *
   * <pre>
   * The ID(s) of the command(s) that this command depends on.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @return The count of waitFor.
   */
  int getWaitForCount();
  /**
   *
   *
   * <pre>
   * The ID(s) of the command(s) that this command depends on.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The waitFor at the given index.
   */
  java.lang.String getWaitFor(int index);
  /**
   *
   *
   * <pre>
   * The ID(s) of the command(s) that this command depends on.
   * </pre>
   *
   * <code>repeated string wait_for = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the waitFor at the given index.
   */
  com.google.protobuf.ByteString getWaitForBytes(int index);
}
