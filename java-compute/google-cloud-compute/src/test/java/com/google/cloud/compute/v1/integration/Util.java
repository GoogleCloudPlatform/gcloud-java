package com.google.cloud.compute.v1.integration;

import static com.google.cloud.compute.v1.integration.BaseTest.COMPUTE_PREFIX;

import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressesClient;
import com.google.cloud.compute.v1.DeleteInstanceRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstancesClient;
import com.google.cloud.compute.v1.InstancesClient.ListPagedResponse;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Util {

  // Cleans existing test resources if any.
  private static final int DELETION_THRESHOLD_TIME_HOURS = 24;

  /** Bring down any instances that are older than 24 hours */
  public static void cleanUpComputeInstances(
      InstancesClient instancesClient, String project, String zone) {
    ListPagedResponse listPagedResponse = instancesClient.list(project, zone);
    for (Instance instance : listPagedResponse.iterateAll()) {
      if (isCreatedBeforeThresholdTime(
          ZonedDateTime.parse(instance.getCreationTimestamp()).toInstant())
          && instance.getName().startsWith(BaseTest.COMPUTE_PREFIX)) {
        instancesClient.deleteAsync(
            DeleteInstanceRequest.newBuilder()
                .setInstance(instance.getName())
                .setProject(project)
                .setZone(zone)
                .build());
      }
    }
  }

  /** Bring down any addresses that are older than 24 hours */
  public static void cleanUpComputeAddresses(AddressesClient addressesClient, String project,
      String zone) {
    AddressesClient.ListPagedResponse listPagedResponse = addressesClient.list(project, zone);
    for (Address address : listPagedResponse.iterateAll()) {
      if (isCreatedBeforeThresholdTime(address.getCreationTimestamp()) && address.getName()
          .startsWith(COMPUTE_PREFIX)) {
        addressesClient.deleteAsync(project, zone, address.getName());
      }
    }
  }

  private static boolean isCreatedBeforeThresholdTime(Instant instant) {
    return instant.isBefore(Instant.now().minus(DELETION_THRESHOLD_TIME_HOURS, ChronoUnit.HOURS));
  }

  private static boolean isCreatedBeforeThresholdTime(String timestamp) {
    return OffsetDateTime.parse(timestamp)
        .toInstant()
        .isBefore(Instant.now().minus(DELETION_THRESHOLD_TIME_HOURS, ChronoUnit.HOURS));
  }
}
