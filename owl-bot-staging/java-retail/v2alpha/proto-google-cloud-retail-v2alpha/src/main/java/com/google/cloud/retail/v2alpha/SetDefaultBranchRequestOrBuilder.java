// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

public interface SetDefaultBranchRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.SetDefaultBranchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full resource name of the catalog, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The catalog.
   */
  java.lang.String getCatalog();
  /**
   * <pre>
   * Full resource name of the catalog, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for catalog.
   */
  com.google.protobuf.ByteString
      getCatalogBytes();

  /**
   * <pre>
   * The final component of the resource name of a branch.
   * This field must be one of "0", "1" or "2". Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * If there are no sufficient active products in the targeted branch and
   * [force][google.cloud.retail.v2alpha.SetDefaultBranchRequest.force] is not
   * set, a FAILED_PRECONDITION error is returned.
   * </pre>
   *
   * <code>string branch_id = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The branchId.
   */
  java.lang.String getBranchId();
  /**
   * <pre>
   * The final component of the resource name of a branch.
   * This field must be one of "0", "1" or "2". Otherwise, an INVALID_ARGUMENT
   * error is returned.
   * If there are no sufficient active products in the targeted branch and
   * [force][google.cloud.retail.v2alpha.SetDefaultBranchRequest.force] is not
   * set, a FAILED_PRECONDITION error is returned.
   * </pre>
   *
   * <code>string branch_id = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for branchId.
   */
  com.google.protobuf.ByteString
      getBranchIdBytes();

  /**
   * <pre>
   * Some note on this request, this can be retrieved by
   * [CatalogService.GetDefaultBranch][google.cloud.retail.v2alpha.CatalogService.GetDefaultBranch]
   * before next valid default branch set occurs.
   * This field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The note.
   */
  java.lang.String getNote();
  /**
   * <pre>
   * Some note on this request, this can be retrieved by
   * [CatalogService.GetDefaultBranch][google.cloud.retail.v2alpha.CatalogService.GetDefaultBranch]
   * before next valid default branch set occurs.
   * This field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The bytes for note.
   */
  com.google.protobuf.ByteString
      getNoteBytes();

  /**
   * <pre>
   * If set to true, it permits switching to a branch with
   * [branch_id][google.cloud.retail.v2alpha.SetDefaultBranchRequest.branch_id]
   * even if it has no sufficient active products.
   * </pre>
   *
   * <code>bool force = 4;</code>
   * @return The force.
   */
  boolean getForce();
}
