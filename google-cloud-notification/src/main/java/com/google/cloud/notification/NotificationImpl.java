package com.google.cloud.notification;

import static com.google.cloud.BaseService.EXCEPTION_HANDLER;
import static com.google.cloud.RetryHelper.runWithRetries;

import com.google.cloud.BaseService;
import com.google.cloud.RetryHelper.RetryHelperException;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageException;
import com.google.cloud.storage.StorageFactory;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.StorageOptions.DefaultStorageFactory;
import com.google.cloud.storage.spi.v1.StorageRpc;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by andrealin on 11/1/17.
 */
public class NotificationImpl extends BaseService<StorageOptions> implements Notification {

  private final StorageRpc storageRpc;
  private Storage storage;

  NotificationImpl(StorageOptions options) {
    super(options);
    storageRpc = options.getStorageRpcV1();
    storage = options.getService();
  }


  void setStorage(Storage storage) {
    this.storage = storage;
  }

  public static class DefaultNotificationFactory implements NotificationFactory {

    private static final StorageFactory INSTANCE = new StorageOptions.DefaultStorageFactory();

    @Override
    public Notification create(StorageOptions options) {
      return new NotificationImpl(options);
    }
  }

  @Override
  public Storage getStorageService() {
    return storage;
  }

  @Override
  public boolean deleteNotification(final String bucket, final String notification) {
    try {
      return runWithRetries(new Callable<Boolean>() {
        @Override
        public Boolean call() {
          return storageRpc.deleteNotification(bucket, notification);
        }
      }, getOptions().getRetrySettings(), EXCEPTION_HANDLER, getOptions().getClock());
    } catch (RetryHelperException e) {
      throw StorageException.translateAndThrow(e);
    }
  }

  @Override
  public List<NotificationInfo> listNotifications(final String bucket) {
    try {
      List<com.google.api.services.storage.model.Notification> answer = runWithRetries(new Callable<List<com.google.api.services.storage.model.Notification>>() {
        @Override
        public List<com.google.api.services.storage.model.Notification> call() {
          return storageRpc.listNotifications(bucket);
        }
      }, getOptions().getRetrySettings(), EXCEPTION_HANDLER, getOptions().getClock());
      if (answer == null) {
        return null;
      }
      return Lists.transform(answer, NotificationInfo.FROM_PB_FUNCTION);
    } catch (RetryHelperException e) {
      throw StorageException.translateAndThrow(e);
    }
  }

  @Override
  public NotificationInfo createNotification(final String bucket, NotificationInfo notification) {
    final com.google.api.services.storage.model.Notification notificationPb = notification.toPb();
    try {
      return NotificationInfo.fromPb(runWithRetries(new Callable<com.google.api.services.storage.model.Notification>() {
        @Override
        public com.google.api.services.storage.model.Notification call() {
          return storageRpc.createNotification(bucket, notificationPb);
        }
      }, getOptions().getRetrySettings(), EXCEPTION_HANDLER, getOptions().getClock()));
    } catch (RetryHelperException e) {
      throw StorageException.translateAndThrow(e);
    }
  }

}
