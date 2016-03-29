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

package com.google.gcloud.storage.contrib.nio;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.auto.value.AutoValue;
import com.google.common.base.Strings;

import java.util.Map;

import javax.annotation.Nullable;

/**
 * Configuration for {@link CloudStorageFileSystem} instances.
 */
@AutoValue
public abstract class CloudStorageConfiguration {

  private static final CloudStorageConfiguration DEFAULT = builder().build();

  /**
   * Returns default GCS NIO configuration.
   */
  public static CloudStorageConfiguration getDefault() {
    return DEFAULT;
  }

  /**
   * Creates a new builder, initialized with the following settings:
   *
   * <ul>
   * <li>Performing I/O on paths with extra slashes, e.g. {@code a//b} will throw an error.
   * <li>The prefix slash on absolute paths will be removed when converting to an object name.
   * <li>Pseudo-directories are enabled, so any path with a trailing slash is a fake directory.
   * </ul>
   */
  public static Builder builder() {
    return new Builder();
  }

  abstract String workingDirectory();
  abstract boolean permitEmptyPathComponents();
  abstract boolean stripPrefixSlash();
  abstract boolean usePseudoDirectories();
  abstract int blockSize();

  /**
   * Builder for {@link CloudStorageConfiguration}.
   */
  public static final class Builder {

    private String workingDirectory = UnixPath.ROOT;
    private boolean permitEmptyPathComponents;
    private boolean stripPrefixSlash = true;
    private boolean usePseudoDirectories = true;
    private int blockSize = CloudStorageFileSystem.BLOCK_SIZE_DEFAULT;

    /**
     * Changes current working directory for new filesystem. This defaults to the root directory.
     * The working directory cannot be changed once it's been set. You'll need to create another
     * {@link CloudStorageFileSystem} object.
     *
     * @throws IllegalArgumentException if {@code path} is not absolute
     */
    public Builder workingDirectory(String path) {
      checkArgument(UnixPath.getPath(false, path).isAbsolute(), "not absolute: %s", path);
      workingDirectory = path;
      return this;
    }

    /**
     * Configures whether or not we should throw an exception when encountering object names
     * containing superfluous slashes, e.g. {@code a//b}.
     */
    public Builder permitEmptyPathComponents(boolean value) {
      permitEmptyPathComponents = value;
      return this;
    }

    /**
     * Configures if the '/' prefix on absolute object names should be removed before I/O.
     *
     * <p>If you disable this feature, please take into consideration that all paths created from a
     * URI will have the leading slash.
     */
    public Builder stripPrefixSlash(boolean value) {
      stripPrefixSlash = value;
      return this;
    }

    /**
     * Configures if paths with a trailing slash should be treated as fake directories.
     */
    public Builder usePseudoDirectories(boolean value) {
      usePseudoDirectories = value;
      return this;
    }

    /**
     * Sets the block size in bytes that should be used for each HTTP request to the API.
     *
     * <p>The default is {@value CloudStorageFileSystem#BLOCK_SIZE_DEFAULT}.
     */
    public Builder blockSize(int value) {
      blockSize = value;
      return this;
    }

    /**
     * Creates new instance without destroying builder.
     */
    public CloudStorageConfiguration build() {
      return new AutoValue_CloudStorageConfiguration(
          workingDirectory,
          permitEmptyPathComponents,
          stripPrefixSlash,
          usePseudoDirectories,
          blockSize);
    }

    Builder() {}
  }

  static CloudStorageConfiguration fromMap(@Nullable String workingDirectory, Map<String, ?> env) {
    Builder builder = builder();
    if (!Strings.isNullOrEmpty(workingDirectory)) {
      builder.workingDirectory(workingDirectory);
    }
    for (Map.Entry<String, ?> entry : env.entrySet()) {
      switch (entry.getKey()) {
        case "permitEmptyPathComponents":
          builder.permitEmptyPathComponents((Boolean) entry.getValue());
          break;
        case "stripPrefixSlash":
          builder.stripPrefixSlash((Boolean) entry.getValue());
          break;
        case "usePseudoDirectories":
          builder.usePseudoDirectories((Boolean) entry.getValue());
          break;
        case "blockSize":
          builder.blockSize((Integer) entry.getValue());
          break;
        default:
          throw new IllegalArgumentException(entry.getKey());
      }
    }
    return builder.build();
  }

  CloudStorageConfiguration() {}
}
