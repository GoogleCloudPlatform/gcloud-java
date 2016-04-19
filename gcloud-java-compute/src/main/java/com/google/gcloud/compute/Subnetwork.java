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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.gcloud.compute.Compute.OperationOption;
import com.google.gcloud.compute.Compute.SubnetworkOption;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

/**
 * A Google Compute Engine Subnetwork. Subnetworks segments your cloud network IP space into
 * subnetworks. Subnetwork prefixes can be automatically allocated, or you can create a custom
 * topology. Objects of this class are immutable. To get a {@code Subnetwork} object with the most
 * recent information use {@link #reload}. {@code Subnetwork} adds a layer of service-related
 * functionality over {@link SubnetworkInfo}.
 *
 * @see <a href="https://cloud.google.com/compute/docs/subnetworks">Subnetworks</a>
 */
public class Subnetwork extends SubnetworkInfo {

  private static final long serialVersionUID = 8608280908101278096L;

  private final ComputeOptions options;
  private transient Compute compute;

  /**
   * A builder for {@code Subnetwork} objects.
   */
  public static class Builder extends SubnetworkInfo.Builder {

    private final Compute compute;
    private final SubnetworkInfo.BuilderImpl infoBuilder;

    Builder(Compute compute, SubnetworkId subnetworkId, NetworkId networkId, String ipRange) {
      this.compute = compute;
      this.infoBuilder = new SubnetworkInfo.BuilderImpl(subnetworkId, networkId, ipRange);
      this.infoBuilder.subnetworkId(subnetworkId);
      this.infoBuilder.network(networkId);
      this.infoBuilder.ipRange(ipRange);
    }

    Builder(Subnetwork subnetwork) {
      this.compute = subnetwork.compute;
      this.infoBuilder = new SubnetworkInfo.BuilderImpl(subnetwork);
    }

    @Override
    Builder id(String id) {
      infoBuilder.id(id);
      return this;
    }

    @Override
    Builder creationTimestamp(Long creationTimestamp) {
      infoBuilder.creationTimestamp(creationTimestamp);
      return this;
    }

    @Override
    public Builder subnetworkId(SubnetworkId subnetworkId) {
      infoBuilder.subnetworkId(subnetworkId);
      return this;
    }

    @Override
    public Builder description(String description) {
      infoBuilder.description(description);
      return this;
    }

    @Override
    Builder gatewayAddress(String gatewayAddress) {
      infoBuilder.gatewayAddress(gatewayAddress);
      return this;
    }

    @Override
    public Builder network(NetworkId network) {
      infoBuilder.network(network);
      return this;
    }

    @Override
    public Builder ipRange(String ipRange) {
      infoBuilder.ipRange(ipRange);
      return this;
    }

    @Override
    public Subnetwork build() {
      return new Subnetwork(compute, infoBuilder);
    }
  }

  Subnetwork(Compute compute, SubnetworkInfo.BuilderImpl infoBuilder) {
    super(infoBuilder);
    this.compute = checkNotNull(compute);
    this.options = compute.options();
  }

  /**
   * Checks if this subnetwork exists.
   *
   * @return {@code true} if this subnetwork exists, {@code false} otherwise
   * @throws ComputeException upon failure
   */
  public boolean exists() {
    return reload(SubnetworkOption.fields()) != null;
  }

  /**
   * Fetches current subnetwork' latest information. Returns {@code null} if the subnetwork does not
   * exist.
   *
   * @param options subnetwork options
   * @return an {@code Subnetwork} object with latest information or {@code null} if not found
   * @throws ComputeException upon failure
   */
  public Subnetwork reload(SubnetworkOption... options) {
    return compute.get(subnetworkId(), options);
  }

  /**
   * Deletes this subnetwork. If this subnetwork was auto-generated deletion will fail.
   *
   * @return an operation object if delete request was successfully sent, {@code null} if the
   *     subnetwork was not found
   * @throws ComputeException upon failure
   */
  public Operation delete(OperationOption... options) {
    return compute.delete(subnetworkId(), options);
  }

  /**
   * Returns the subnetwork's {@code Compute} object used to issue requests.
   */
  public Compute compute() {
    return compute;
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public final boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || !obj.getClass().equals(Subnetwork.class)) {
      return false;
    }
    Subnetwork other = (Subnetwork) obj;
    return Objects.equals(toPb(), other.toPb()) && Objects.equals(options, other.options);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(super.hashCode(), options);
  }

  private void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
    input.defaultReadObject();
    this.compute = options.service();
  }

  static Subnetwork fromPb(Compute compute,
      com.google.api.services.compute.model.Subnetwork subnetworkPb) {
    return new Subnetwork(compute, new SubnetworkInfo.BuilderImpl(subnetworkPb));
  }
}
