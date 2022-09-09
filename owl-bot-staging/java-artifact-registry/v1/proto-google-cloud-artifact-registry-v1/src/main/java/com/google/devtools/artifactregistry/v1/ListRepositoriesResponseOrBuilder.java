// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/repository.proto

package com.google.devtools.artifactregistry.v1;

public interface ListRepositoriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListRepositoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The repositories returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Repository repositories = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.Repository> 
      getRepositoriesList();
  /**
   * <pre>
   * The repositories returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Repository repositories = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.Repository getRepositories(int index);
  /**
   * <pre>
   * The repositories returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Repository repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   * <pre>
   * The repositories returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Repository repositories = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.RepositoryOrBuilder> 
      getRepositoriesOrBuilderList();
  /**
   * <pre>
   * The repositories returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Repository repositories = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.RepositoryOrBuilder getRepositoriesOrBuilder(
      int index);

  /**
   * <pre>
   * The token to retrieve the next page of repositories, or empty if there are
   * no more repositories to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The token to retrieve the next page of repositories, or empty if there are
   * no more repositories to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
