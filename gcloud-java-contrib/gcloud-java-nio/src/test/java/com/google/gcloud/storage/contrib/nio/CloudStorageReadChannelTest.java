package com.google.gcloud.storage.contrib.nio;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import com.google.gcloud.ReadChannel;
import com.google.gcloud.storage.BlobId;
import com.google.gcloud.storage.BlobInfo;
import com.google.gcloud.storage.Storage;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;

/** Unit tests for {@link CloudStorageReadChannel}. */
@RunWith(JUnit4.class)
public class CloudStorageReadChannelTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  private CloudStorageReadChannel chan;

  private final Storage gcsStorage = mock(Storage.class);
  private final BlobId file = BlobId.of("enya", "rocks");
  private final BlobInfo metadata = BlobInfo.builder(file).size(42L).build();
  private final ReadChannel gcsChannel = mock(ReadChannel.class);

  /** Set up the mocks. **/
  @Before
  public void before() throws Exception {
    when(gcsStorage.get(file)).thenReturn(metadata);
    when(gcsStorage.reader(eq(file))).thenReturn(gcsChannel);
    when(gcsChannel.isOpen()).thenReturn(true);
    chan = CloudStorageReadChannel.create(gcsStorage, file, 0);
    verify(gcsStorage).get(eq(file));
    verify(gcsStorage).reader(eq(file));
  }

  @Test
  public void testRead() throws Exception {
    ByteBuffer buffer = ByteBuffer.allocate(1);
    when(gcsChannel.read(eq(buffer))).thenReturn(1);
    assertThat(chan.position()).isEqualTo(0L);
    assertThat(chan.read(buffer)).isEqualTo(1);
    assertThat(chan.position()).isEqualTo(1L);
    verify(gcsChannel).read(any(ByteBuffer.class));
    verify(gcsChannel, times(3)).isOpen();
    verifyNoMoreInteractions(gcsStorage, gcsChannel);
  }

  @Test
  public void testRead_whenClosed_throwsCce() throws Exception {
    when(gcsChannel.isOpen()).thenReturn(false);
    thrown.expect(ClosedChannelException.class);
    chan.read(ByteBuffer.allocate(1));
  }

  @Test
  public void testWrite_throwsNonWritableChannelException() throws Exception {
    thrown.expect(NonWritableChannelException.class);
    chan.write(ByteBuffer.allocate(1));
  }

  @Test
  public void testTruncate_throwsNonWritableChannelException() throws Exception {
    thrown.expect(NonWritableChannelException.class);
    chan.truncate(0);
  }

  @Test
  public void testIsOpen() throws Exception {
    when(gcsChannel.isOpen()).thenReturn(true).thenReturn(false);
    assertThat(chan.isOpen()).isTrue();
    chan.close();
    assertThat(chan.isOpen()).isFalse();
    verify(gcsChannel, times(2)).isOpen();
    verify(gcsChannel).close();
    verifyNoMoreInteractions(gcsStorage, gcsChannel);
  }

  @Test
  public void testSize() throws Exception {
    assertThat(chan.size()).isEqualTo(42L);
    verify(gcsChannel).isOpen();
    verifyZeroInteractions(gcsChannel);
    verifyNoMoreInteractions(gcsStorage);
  }

  @Test
  public void testSize_whenClosed_throwsCce() throws Exception {
    when(gcsChannel.isOpen()).thenReturn(false);
    thrown.expect(ClosedChannelException.class);
    chan.size();
  }

  @Test
  public void testPosition_whenClosed_throwsCce() throws Exception {
    when(gcsChannel.isOpen()).thenReturn(false);
    thrown.expect(ClosedChannelException.class);
    chan.position();
  }

  @Test
  public void testSetPosition_whenClosed_throwsCce() throws Exception {
    when(gcsChannel.isOpen()).thenReturn(false);
    thrown.expect(ClosedChannelException.class);
    chan.position(0);
  }

  @Test
  public void testClose_calledMultipleTimes_doesntThrowAnError() throws Exception {
    chan.close();
    chan.close();
    chan.close();
  }

  @Test
  public void testSetPosition() throws Exception {
    assertThat(chan.position()).isEqualTo(0L);
    assertThat(chan.size()).isEqualTo(42L);
    chan.position(1L);
    assertThat(chan.position()).isEqualTo(1L);
    assertThat(chan.size()).isEqualTo(42L);
    verify(gcsChannel).seek(1);
    verify(gcsChannel, times(5)).isOpen();
    verifyNoMoreInteractions(gcsStorage, gcsChannel);
  }

}
