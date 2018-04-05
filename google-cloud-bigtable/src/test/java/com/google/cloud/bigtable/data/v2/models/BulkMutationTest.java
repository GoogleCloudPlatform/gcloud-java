/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.bigtable.data.v2.models;

import com.google.bigtable.v2.MutateRowsRequest;
import com.google.bigtable.v2.MutateRowsRequest.Entry;
import com.google.bigtable.v2.Mutation.SetCell;
import com.google.bigtable.v2.TableName;
import com.google.cloud.bigtable.data.v2.internal.RequestContext;
import com.google.common.truth.Truth;
import com.google.protobuf.ByteString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BulkMutationTest {
  private static final InstanceName INSTANCE_NAME =
      InstanceName.of("fake-project", "fake-instance");
  private static final String APP_PROFILE = "fake-profile";
  private static final RequestContext REQUEST_CONTEXT =
      RequestContext.create(INSTANCE_NAME, APP_PROFILE);

  @Test
  public void test() {
    BulkMutation m =
        BulkMutation.create("fake-table")
            .add(
                "key-a",
                Mutation.create()
                    .setCell("fake-family1", "fake-qualifier1", 1_000, "fake-value1")
                    .setCell("fake-family2", "fake-qualifier2", 2_000, "fake-value2"))
            .add(
                ByteString.copyFromUtf8("key-b"),
                Mutation.create().setCell("fake-family3", "fake-qualifier3", 3_000, "fake-value3"));

    MutateRowsRequest actual = m.toProto(REQUEST_CONTEXT);
    Truth.assertThat(actual)
        .isEqualTo(
            MutateRowsRequest.newBuilder()
                .setTableName(
                    TableName.format(
                        INSTANCE_NAME.getProject(), INSTANCE_NAME.getInstance(), "fake-table"))
                .setAppProfileId(APP_PROFILE)
                .addEntries(
                    Entry.newBuilder()
                        .setRowKey(ByteString.copyFromUtf8("key-a"))
                        .addMutations(
                            com.google.bigtable.v2.Mutation.newBuilder()
                                .setSetCell(
                                    SetCell.newBuilder()
                                        .setFamilyName("fake-family1")
                                        .setColumnQualifier(
                                            ByteString.copyFromUtf8("fake-qualifier1"))
                                        .setTimestampMicros(1_000)
                                        .setValue(ByteString.copyFromUtf8("fake-value1"))))
                        .addMutations(
                            com.google.bigtable.v2.Mutation.newBuilder()
                                .setSetCell(
                                    SetCell.newBuilder()
                                        .setFamilyName("fake-family2")
                                        .setColumnQualifier(
                                            ByteString.copyFromUtf8("fake-qualifier2"))
                                        .setTimestampMicros(2_000)
                                        .setValue(ByteString.copyFromUtf8("fake-value2")))))
                .addEntries(
                    Entry.newBuilder()
                        .setRowKey(ByteString.copyFromUtf8("key-b"))
                        .addMutations(
                            com.google.bigtable.v2.Mutation.newBuilder()
                                .setSetCell(
                                    SetCell.newBuilder()
                                        .setFamilyName("fake-family3")
                                        .setColumnQualifier(
                                            ByteString.copyFromUtf8("fake-qualifier3"))
                                        .setTimestampMicros(3_000)
                                        .setValue(ByteString.copyFromUtf8("fake-value3")))))
                .build());
  }
}
