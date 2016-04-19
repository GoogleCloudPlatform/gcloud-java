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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.gcloud.compute.NetworkConfiguration.Type;

import org.junit.Test;

import java.util.List;

public class SubnetNetworkConfigurationTest {

  private static final Boolean AUTO_CREATE_SUBNETWORKS = true;
  private static final List<SubnetworkId> SUBNETWORKS = ImmutableList.of(
      SubnetworkId.of("project", "region", "subnetwork1"),
      SubnetworkId.of("project", "region", "subnetwork2"));
  private static final SubnetNetworkConfiguration NETWORK_CONFIGURATION =
      new SubnetNetworkConfiguration(AUTO_CREATE_SUBNETWORKS, SUBNETWORKS);

  @Test
  public void testConstructor() {
    assertEquals(AUTO_CREATE_SUBNETWORKS, NETWORK_CONFIGURATION.autoCreateSubnetworks());
    assertEquals(Type.SUBNET, NETWORK_CONFIGURATION.type());
    assertEquals(SUBNETWORKS, NETWORK_CONFIGURATION.subnetworks());
    assertEquals(Type.SUBNET, NETWORK_CONFIGURATION.type());
    SubnetNetworkConfiguration networkConfiguration =
        new SubnetNetworkConfiguration(AUTO_CREATE_SUBNETWORKS, null);
    assertEquals(Type.SUBNET, networkConfiguration.type());
    assertEquals(AUTO_CREATE_SUBNETWORKS, networkConfiguration.autoCreateSubnetworks());
    assertNull(networkConfiguration.subnetworks());
  }

  @Test
  public void testToAndFromPb() {
    assertTrue(NetworkConfiguration.fromPb(NETWORK_CONFIGURATION.toPb())
        instanceof SubnetNetworkConfiguration);
    compareNetworkConfiguration(NETWORK_CONFIGURATION,
        NetworkConfiguration.<SubnetNetworkConfiguration>fromPb(NETWORK_CONFIGURATION.toPb()));
    SubnetNetworkConfiguration networkConfiguration =
        new SubnetNetworkConfiguration(AUTO_CREATE_SUBNETWORKS, null);
    assertTrue(NetworkConfiguration.fromPb(networkConfiguration.toPb())
        instanceof SubnetNetworkConfiguration);
    compareNetworkConfiguration(networkConfiguration,
        NetworkConfiguration.<SubnetNetworkConfiguration>fromPb(networkConfiguration.toPb()));
  }

  @Test
  public void testOf() {
    SubnetNetworkConfiguration configuration =
        SubnetNetworkConfiguration.of(AUTO_CREATE_SUBNETWORKS);
    assertEquals(AUTO_CREATE_SUBNETWORKS, configuration.autoCreateSubnetworks());
    assertNull(configuration.subnetworks());
    assertEquals(Type.SUBNET, configuration.type());
  }

  private void compareNetworkConfiguration(SubnetNetworkConfiguration expected,
      SubnetNetworkConfiguration value) {
    assertEquals(expected, value);
    assertEquals(expected.autoCreateSubnetworks(), value.autoCreateSubnetworks());
    assertEquals(expected.subnetworks(), value.subnetworks());
    assertEquals(expected.type(), value.type());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
