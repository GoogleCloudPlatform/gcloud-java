package com.google.cloud.examples.storage.snippets;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.HmacKey;
import com.google.cloud.storage.HmacKey.HmacKeyMetadata;
import com.google.cloud.storage.HmacKey.HmacKeyState;
import com.google.cloud.storage.ServiceAccount;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.testing.RemoteStorageHelper;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ITStorageHmacKeySnippets {
  private static final Logger log = Logger.getLogger(ITStorageSnippets.class.getName());
  private static final String HMAC_KEY_TEST_SERVICE_ACCOUNT =
      System.getenv("HMAC_KEY_SAMPLES_SERVICE_ACCOUNT");

  private static Storage storage;
  private static StorageSnippets storageSnippets;

  @BeforeClass
  public static void beforeClass() {
    RemoteStorageHelper helper = RemoteStorageHelper.create();
    storage = helper.getOptions().getService();
    storageSnippets = new StorageSnippets(storage);
  }

  @Before
  public void before() {
    cleanUpHmacKeys(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));
  }

  private static void cleanUpHmacKeys(ServiceAccount serviceAccount) {
    Page<HmacKeyMetadata> page =
        storage.listHmacKeys(Storage.ListHmacKeysOption.serviceAccount(serviceAccount));
    for (HmacKeyMetadata metadata : page.iterateAll()) {
      if (metadata.getState() == HmacKeyState.ACTIVE) {
        storage.updateHmacKeyState(metadata, HmacKeyState.INACTIVE);
      }
      storage.deleteHmacKey(metadata);
    }
  }

  @Test
  public void testCreateHmacKey() {
    HmacKey hmacKey = storageSnippets.createHmacKey(HMAC_KEY_TEST_SERVICE_ACCOUNT);
    assertNotNull(hmacKey);
  }

  @Test
  public void testGetHmacKey() {
    HmacKey hmacKey = storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));

    HmacKeyMetadata metadata = storageSnippets.getHmacKey(hmacKey.getMetadata().getAccessId());
    assertNotNull(metadata);
  }

  @Test
  public void testActivateHmacKey() {
    HmacKey hmacKey = storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));
    HmacKeyMetadata metadata =
        storage.updateHmacKeyState(hmacKey.getMetadata(), HmacKeyState.INACTIVE);

    HmacKeyMetadata newMetadata = storageSnippets.activateHmacKey(metadata.getAccessId());
    assertEquals(newMetadata.getState(), HmacKeyState.ACTIVE);
  }

  @Test
  public void testDeactivateHmacKey() {
    HmacKey hmacKey = storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));

    HmacKeyMetadata metadata =
        storageSnippets.deactivateHmacKey(hmacKey.getMetadata().getAccessId());
    assertEquals(metadata.getState(), HmacKeyState.INACTIVE);
  }

  @Test
  public void testDeleteHmacKey() {
    HmacKey hmacKey = storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));
    HmacKeyMetadata metadata =
        storage.updateHmacKeyState(hmacKey.getMetadata(), HmacKeyState.INACTIVE);

    storageSnippets.deleteHmacKey(metadata.getAccessId());
  }

  @Test
  public void testListHmacKeys() {
    // Create 2 HMAC keys
    storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));
    storage.createHmacKey(ServiceAccount.of(HMAC_KEY_TEST_SERVICE_ACCOUNT));

    Page<HmacKeyMetadata> page = storageSnippets.listHmacKeys(HMAC_KEY_TEST_SERVICE_ACCOUNT);
    List<HmacKeyMetadata> items = new ArrayList<HmacKeyMetadata>();

    for (HmacKeyMetadata metadata : page.iterateAll()) items.add(metadata);

    assertEquals(2, items.size());
  }
}
