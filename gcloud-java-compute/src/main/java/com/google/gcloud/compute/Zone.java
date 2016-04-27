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

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/**
 * A Google Compute Engine zone.
 *
 * @see <a href="https://cloud.google.com/compute/docs/zones">Region and Zones</a>
 */
public class Zone implements Serializable {

  static final Function<com.google.api.services.compute.model.Zone, Zone> FROM_PB_FUNCTION =
      new Function<com.google.api.services.compute.model.Zone, Zone>() {
        @Override
        public Zone apply(com.google.api.services.compute.model.Zone pb) {
          return Zone.fromPb(pb);
        }
      };
  static final Function<Zone, com.google.api.services.compute.model.Zone> TO_PB_FUNCTION =
      new Function<Zone, com.google.api.services.compute.model.Zone>() {
        @Override
        public com.google.api.services.compute.model.Zone apply(Zone region) {
          return region.toPb();
        }
      };

  private static final long serialVersionUID = 6113636504417213010L;
  private static final DateTimeFormatter TIMESTAMP_FORMATTER = ISODateTimeFormat.dateTime();

  private final ZoneId zoneId;
  private final String generatedId;
  private final Long creationTimestamp;
  private final String description;
  private final Status status;
  private final RegionId region;
  private final DeprecationStatus<ZoneId> deprecationStatus;

  /**
   * Status of the region.
   */
  public enum Status {
    UP,
    DOWN
  }

  static final class Builder {

    private ZoneId zoneId;
    private String generatedId;
    private Long creationTimestamp;
    private String description;

    private Status status;
    private RegionId region;
    private DeprecationStatus<ZoneId> deprecationStatus;

    private Builder() {}

    Builder zoneId(ZoneId zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    Builder generatedId(String generatedId) {
      this.generatedId = generatedId;
      return this;
    }

    Builder creationTimestamp(Long creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    Builder description(String description) {
      this.description = description;
      return this;
    }

    Builder status(Status status) {
      this.status = status;
      return this;
    }

    Builder region(RegionId region) {
      this.region = region;
      return this;
    }

    Builder deprecationStatus(DeprecationStatus<ZoneId> deprecationStatus) {
      this.deprecationStatus = deprecationStatus;
      return this;
    }

    Zone build() {
      return new Zone(this);
    }
  }

  private Zone(Builder builder) {
    this.zoneId = builder.zoneId;
    this.generatedId = builder.generatedId;
    this.creationTimestamp = builder.creationTimestamp;
    this.description = builder.description;
    this.status = builder.status;
    this.region = builder.region;
    this.deprecationStatus = builder.deprecationStatus;
  }

  /**
   * Returns the zone's identity.
   */
  public ZoneId zoneId() {
    return zoneId;
  }

  /**
   * Returns the creation timestamp in milliseconds since epoch.
   */
  public Long creationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Returns an optional textual description of the zone.
   */
  public String description() {
    return description;
  }

  /**
   * Returns the service-generated unique identifier for the zone.
   */
  public String generatedId() {
    return generatedId;
  }

  /**
   * Returns the status of the zone.
   */
  public Status status() {
    return status;
  }

  /**
   * Returns the identity of the region that hosts the zone.
   */
  public RegionId region() {
    return region;
  }

  /**
   * Returns the deprecation status of the zone. If {@link DeprecationStatus#status()} is either
   * {@link DeprecationStatus.Status#DELETED} or {@link DeprecationStatus.Status#OBSOLETE} the zone
   * should not be used. Returns {@code null} if the zone is not deprecated.
   */
  public DeprecationStatus<ZoneId> deprecationStatus() {
    return deprecationStatus;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("zoneId", zoneId)
        .add("generatedId", generatedId)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("status", status)
        .add("region", region)
        .add("deprecationStatus", deprecationStatus)
        .toString();
  }

  @Override
  public final int hashCode() {
    return Objects.hash(zoneId);
  }

  @Override
  public final boolean equals(Object obj) {
    return obj instanceof Zone && Objects.equals(toPb(), ((Zone) obj).toPb());
  }

  com.google.api.services.compute.model.Zone toPb() {
    com.google.api.services.compute.model.Zone zonePb =
        new com.google.api.services.compute.model.Zone();
    if (generatedId != null) {
      zonePb.setId(new BigInteger(generatedId));
    }
    if (creationTimestamp != null) {
      zonePb.setCreationTimestamp(TIMESTAMP_FORMATTER.print(creationTimestamp));
    }
    zonePb.setName(zoneId.zone());
    zonePb.setDescription(description);
    zonePb.setSelfLink(zoneId.selfLink());
    if (status != null) {
      zonePb.setStatus(status.name());
    }
    if (region != null) {
      zonePb.setRegion(region.selfLink());
    }
    if (deprecationStatus != null) {
      zonePb.setDeprecated(deprecationStatus.toPb());
    }
    return zonePb;
  }

  static Builder builder() {
    return new Builder();
  }

  static Zone fromPb(com.google.api.services.compute.model.Zone zonePb) {
    Builder builder = builder();
    builder.zoneId(ZoneId.fromUrl(zonePb.getSelfLink()));
    if (zonePb.getId() != null) {
      builder.generatedId(zonePb.getId().toString());
    }
    if (zonePb.getCreationTimestamp() != null) {
      builder.creationTimestamp(TIMESTAMP_FORMATTER.parseMillis(zonePb.getCreationTimestamp()));
    }
    builder.description(zonePb.getDescription());
    if (zonePb.getStatus() != null) {
      builder.status(Status.valueOf(zonePb.getStatus()));
    }
    if (zonePb.getRegion() != null) {
      builder.region(RegionId.fromUrl(zonePb.getRegion()));
    }
    if (zonePb.getDeprecated() != null) {
      builder.deprecationStatus(
          DeprecationStatus.fromPb(zonePb.getDeprecated(), ZoneId.FROM_URL_FUNCTION));
    }
    return builder.build();
  }
}
