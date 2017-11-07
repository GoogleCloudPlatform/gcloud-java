/*
 * Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.cloud.notification;

import com.google.api.core.BetaApi;
import com.google.cloud.Service;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.List;

/**
 * An interface for Pub/Sub Notifications in Google Cloud Storage.
 *
 * @see <a href="https://cloud.google.com/storage/docs/pubsub-notifications">Google Cloud Pub/Sub Notifications for Storage</a>
 */
public interface Notification extends Service<StorageOptions> {
  @BetaApi
  boolean deleteNotification(String bucket, String notification);

  @BetaApi
  List<NotificationInfo> listNotifications(String bucket);

  @BetaApi
  NotificationInfo createNotification(String bucket, NotificationInfo notification);
}
