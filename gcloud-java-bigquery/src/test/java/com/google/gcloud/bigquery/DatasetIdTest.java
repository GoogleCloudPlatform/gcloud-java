/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.bigquery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DatasetIdTest {

  private static final DatasetId DATASET = DatasetId.of("dataset");
  private static final DatasetId DATASET_COMPLETE = DatasetId.of("project", "dataset");

  @Test
  public void testOf() {
    assertEquals(null, DATASET.project());
    assertEquals("dataset", DATASET.dataset());
    assertEquals("project", DATASET_COMPLETE.project());
    assertEquals("dataset", DATASET_COMPLETE.dataset());
  }

  @Test
  public void testEquals() {
    compareDatasetIds(DATASET, DatasetId.of("dataset"));
    compareDatasetIds(DATASET_COMPLETE, DatasetId.of("project", "dataset"));
  }

  @Test
  public void testToPbAndFromPb() {
    compareDatasetIds(DATASET, DatasetId.fromPb(DATASET.toPb()));
    compareDatasetIds(DATASET_COMPLETE, DatasetId.fromPb(DATASET_COMPLETE.toPb()));
  }

  @Test
  public void testSetProjectId() {
    assertEquals(DATASET_COMPLETE, DATASET.setProjectId("project"));
  }

  private void compareDatasetIds(DatasetId expected, DatasetId value) {
    assertEquals(expected, value);
    assertEquals(expected.project(), value.project());
    assertEquals(expected.dataset(), value.dataset());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
