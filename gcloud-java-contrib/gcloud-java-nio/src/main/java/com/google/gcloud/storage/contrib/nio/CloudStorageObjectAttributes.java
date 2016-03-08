package com.google.gcloud.storage.contrib.nio;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.gcloud.storage.contrib.nio.CloudStorageFileSystem.FILE_TIME_UNKNOWN;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.gcloud.storage.Acl;
import com.google.gcloud.storage.BlobInfo;

import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

/**
 * Metadata for a Google Cloud Storage file.
 */
@Immutable
final class CloudStorageObjectAttributes implements CloudStorageFileAttributes {

  @Nonnull private final BlobInfo info;

  CloudStorageObjectAttributes(BlobInfo info) {
    this.info = checkNotNull(info);
  }

  @Override
  public long size() {
    return info.size();
  }

  @Override
  public FileTime creationTime() {
    if (info.updateTime() == null) {
      return FILE_TIME_UNKNOWN;
    }
    return FileTime.fromMillis(info.updateTime());
  }

  @Override
  public FileTime lastModifiedTime() {
    return creationTime();
  }

  @Override
  public Optional<String> etag() {
    return Optional.fromNullable(info.etag());
  }

  @Override
  public Optional<String> mimeType() {
    return Optional.fromNullable(info.contentType());
  }

  @Override
  public Optional<List<Acl>> acl() {
    return Optional.fromNullable(info.acl());
  }

  @Override
  public Optional<String> cacheControl() {
    return Optional.fromNullable(info.cacheControl());
  }

  @Override
  public Optional<String> contentEncoding() {
    return Optional.fromNullable(info.contentEncoding());
  }

  @Override
  public Optional<String> contentDisposition() {
    return Optional.fromNullable(info.contentDisposition());
  }

  @Override
  public ImmutableMap<String, String> userMetadata() {
    if (null == info.metadata()) {
      return ImmutableMap.of();
    }
    return ImmutableMap.copyOf(info.metadata());
  }

  @Override
  public boolean isDirectory() {
    return false;
  }

  @Override
  public boolean isOther() {
    return false;
  }

  @Override
  public boolean isRegularFile() {
    return true;
  }

  @Override
  public boolean isSymbolicLink() {
    return false;
  }

  @Override
  public FileTime lastAccessTime() {
    return FILE_TIME_UNKNOWN;
  }

  @Override
  public Object fileKey() {
    return info.id();
  }

  @Override
  public boolean equals(Object other) {
    return this == other
        || other instanceof CloudStorageObjectAttributes
            && Objects.equals(info, ((CloudStorageObjectAttributes) other).info);
  }

  @Override
  public int hashCode() {
    return info.hashCode();
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("info", info).toString();
  }
}
