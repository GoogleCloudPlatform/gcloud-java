/*
 * Copyright 2019 Google LLC
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

/**
 * A client to Google Cloud Memorystore for Redis API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================ CloudRedisClient ================
 *
 * <p>Service Description: Configures and manages Cloud Memorystore for Redis instances
 *
 * <p>Google Cloud Memorystore for Redis v1beta1
 *
 * <p>The `redis.googleapis.com` service implements the Google Cloud Memorystore for Redis API and
 * defines the following resource model for managing Redis instances: &#42; The service works with a
 * collection of cloud projects, named: `/projects/&#42;` &#42; Each project has a collection of
 * available locations, named: `/locations/&#42;` &#42; Each location has a collection of Redis
 * instances, named: `/instances/&#42;` &#42; As such, Redis instances are resources of the form:
 * `/projects/{project_id}/locations/{location_id}/instances/{instance_id}`
 *
 * <p>Note that location_id must be refering to a GCP `region`; for example: &#42;
 * `projects/redpepper-1290/locations/us-central1/instances/my-redis`
 *
 * <p>Sample for CloudRedisClient:
 *
 * <pre>
 * <code>
 * try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
 *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
 *   Instance response = cloudRedisClient.getInstance(name);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.redis.v1beta1;
