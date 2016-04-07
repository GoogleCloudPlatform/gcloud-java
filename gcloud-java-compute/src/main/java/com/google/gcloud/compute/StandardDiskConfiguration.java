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

import com.google.api.services.compute.model.Disk;

import java.util.Objects;

/**
 * A Google Compute Engine standard persistent disk configuration. This class allows users to create
 * a disk given its type and size.
 *
 * @see <a href="https://cloud.google.com/compute/docs/disks/">Block Storage</a>
 */
public class StandardDiskConfiguration extends DiskConfiguration {

  private static final long serialVersionUID = -6974045909359567054L;

  /**
   * A builder for {@code StandardDiskConfiguration} objects.
   */
  public static class Builder
      extends DiskConfiguration.Builder<StandardDiskConfiguration, Builder> {

    private Builder() {
      super(Type.STANDARD);
    }

    private Builder(StandardDiskConfiguration configuration) {
      super(configuration);
    }

    private Builder(Disk diskPb) {
      super(Type.STANDARD, diskPb);
    }

    /**
     * Sets the size of the persistent disk, in GB. If not set, 500GB is used.
     */
    @Override
    public Builder sizeGb(Long sizeGb) {
      super.sizeGb(sizeGb);
      return this;
    }

    /**
     * Creates a {@code StandardDiskConfiguration} object.
     */
    @Override
    public StandardDiskConfiguration build() {
      return new StandardDiskConfiguration(this);
    }
  }

  private StandardDiskConfiguration(Builder builder) {
    super(builder);
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(baseHashCode());
  }

  @Override
  public final boolean equals(Object obj) {
    return obj instanceof StandardDiskConfiguration && baseEquals((StandardDiskConfiguration) obj);
  }

  @Override
  StandardDiskConfiguration setProjectId(String projectId) {
    if (diskType() == null || diskType().project() != null) {
      return this;
    }
    return toBuilder().diskType(diskType().setProjectId(projectId)).build();
  }

  /**
   * Returns a builder for a {@code StandardDiskConfiguration} object.
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Returns a {@code StandardDiskConfiguration} object given the disk type.
   */
  public static StandardDiskConfiguration of(DiskTypeId diskType) {
    return builder().diskType(diskType).build();
  }

  /**
   * Returns a {@code StandardDiskConfiguration} object given the disk size in GB.
   */
  public static StandardDiskConfiguration of(long sizeGb) {
    return builder().sizeGb(sizeGb).build();
  }

  /**
   * Returns a {@code StandardDiskConfiguration} object given the disk type and size in GB.
   */
  public static StandardDiskConfiguration of(DiskTypeId diskType, long sizeGb) {
    return builder().diskType(diskType).sizeGb(sizeGb).build();
  }

  @SuppressWarnings("unchecked")
  static StandardDiskConfiguration fromPb(Disk diskPb) {
    return new Builder(diskPb).build();
  }
}
