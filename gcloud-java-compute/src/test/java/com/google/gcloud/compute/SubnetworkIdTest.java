/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.gcloud.compute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SubnetworkIdTest {

  private static final String PROJECT = "project";
  private static final String REGION = "region";
  private static final String NAME = "subnet";
  private static final String URL =
      "https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnet";

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testOf() {
    SubnetworkId subnetworkId = SubnetworkId.of(PROJECT, REGION, NAME);
    assertEquals(PROJECT, subnetworkId.project());
    assertEquals(REGION, subnetworkId.region());
    assertEquals(NAME, subnetworkId.subnetwork());
    assertEquals(URL, subnetworkId.selfLink());
    subnetworkId = SubnetworkId.of(REGION, NAME);
    assertNull(subnetworkId.project());
    assertEquals(REGION, subnetworkId.region());
    assertEquals(NAME, subnetworkId.subnetwork());
    subnetworkId = SubnetworkId.of(RegionId.of(PROJECT, REGION), NAME);
    assertEquals(PROJECT, subnetworkId.project());
    assertEquals(REGION, subnetworkId.region());
    assertEquals(NAME, subnetworkId.subnetwork());
  }

  @Test
  public void testToAndFromUrl() {
    SubnetworkId subnetworkId = SubnetworkId.of(PROJECT, REGION, NAME);
    compareSubnetworkId(subnetworkId, SubnetworkId.fromUrl(subnetworkId.selfLink()));
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("notMatchingUrl is not a valid subnetwork URL");
    SubnetworkId.fromUrl("notMatchingUrl");
  }

  @Test
  public void testSetProjectId() {
    SubnetworkId subnetworkId = SubnetworkId.of(PROJECT, REGION, NAME);
    assertSame(subnetworkId, subnetworkId.setProjectId(PROJECT));
    compareSubnetworkId(subnetworkId, SubnetworkId.of(REGION, NAME).setProjectId(PROJECT));
  }

  @Test
  public void testMatchesUrl() {
    assertTrue(SubnetworkId.matchesUrl(SubnetworkId.of(PROJECT, REGION, NAME).selfLink()));
    assertFalse(SubnetworkId.matchesUrl("notMatchingUrl"));
  }

  private void compareSubnetworkId(SubnetworkId expected, SubnetworkId value) {
    assertEquals(expected, value);
    assertEquals(expected.project(), expected.project());
    assertEquals(expected.region(), expected.region());
    assertEquals(expected.subnetwork(), expected.subnetwork());
    assertEquals(expected.selfLink(), expected.selfLink());
    assertEquals(expected.hashCode(), expected.hashCode());
  }
}
