/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The test result for a test case and an agent environment.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.cx.v3.TestResult}
 */
public enum TestResult implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. Should never be used.
   * </pre>
   *
   * <code>TEST_RESULT_UNSPECIFIED = 0;</code>
   */
  TEST_RESULT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The test passed.
   * </pre>
   *
   * <code>PASSED = 1;</code>
   */
  PASSED(1),
  /**
   *
   *
   * <pre>
   * The test did not pass.
   * </pre>
   *
   * <code>FAILED = 2;</code>
   */
  FAILED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. Should never be used.
   * </pre>
   *
   * <code>TEST_RESULT_UNSPECIFIED = 0;</code>
   */
  public static final int TEST_RESULT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The test passed.
   * </pre>
   *
   * <code>PASSED = 1;</code>
   */
  public static final int PASSED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The test did not pass.
   * </pre>
   *
   * <code>FAILED = 2;</code>
   */
  public static final int FAILED_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestResult valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TestResult forNumber(int value) {
    switch (value) {
      case 0:
        return TEST_RESULT_UNSPECIFIED;
      case 1:
        return PASSED;
      case 2:
        return FAILED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestResult> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TestResult> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TestResult>() {
        public TestResult findValueByNumber(int number) {
          return TestResult.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.TestCaseProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TestResult[] VALUES = values();

  public static TestResult valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestResult(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3.TestResult)
}
