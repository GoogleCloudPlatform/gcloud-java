// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

public interface ListAssetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.ListAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the organization assets should belong to. Its format is
   * "organizations/[organization_id], folders/[folder_id], or
   * projects/[project_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of the organization assets should belong to. Its format is
   * "organizations/[organization_id], folders/[folder_id], or
   * projects/[project_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Expression that defines the filter to apply across assets.
   * The expression is a list of zero or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. The fields map to those
   * defined in the Asset resource. Examples include:
   * * name
   * * security_center_properties.resource_name
   * * resource_properties.a_property
   * * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * The following are the allowed field and operator combinations:
   * * name: `=`
   * * update_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `update_time = "2019-06-10T16:07:18-07:00"`
   *     `update_time = 1560208038000`
   * * create_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `create_time = "2019-06-10T16:07:18-07:00"`
   *     `create_time = 1560208038000`
   * * iam_policy.policy_blob: `=`, `:`
   * * resource_properties: `=`, `:`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   * * security_marks.marks: `=`, `:`
   * * security_center_properties.resource_name: `=`, `:`
   * * security_center_properties.resource_display_name: `=`, `:`
   * * security_center_properties.resource_type: `=`, `:`
   * * security_center_properties.resource_parent: `=`, `:`
   * * security_center_properties.resource_parent_display_name: `=`, `:`
   * * security_center_properties.resource_project: `=`, `:`
   * * security_center_properties.resource_project_display_name: `=`, `:`
   * * security_center_properties.resource_owners: `=`, `:`
   * For example, `resource_properties.size = 100` is a valid filter string.
   * Use a partial match on the empty string to filter based on a property
   * existing: `resource_properties.my_property : ""`
   * Use a negated partial match on the empty string to filter based on a
   * property not existing: `-resource_properties.my_property : ""`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Expression that defines the filter to apply across assets.
   * The expression is a list of zero or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. The fields map to those
   * defined in the Asset resource. Examples include:
   * * name
   * * security_center_properties.resource_name
   * * resource_properties.a_property
   * * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * The following are the allowed field and operator combinations:
   * * name: `=`
   * * update_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `update_time = "2019-06-10T16:07:18-07:00"`
   *     `update_time = 1560208038000`
   * * create_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     `create_time = "2019-06-10T16:07:18-07:00"`
   *     `create_time = 1560208038000`
   * * iam_policy.policy_blob: `=`, `:`
   * * resource_properties: `=`, `:`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   * * security_marks.marks: `=`, `:`
   * * security_center_properties.resource_name: `=`, `:`
   * * security_center_properties.resource_display_name: `=`, `:`
   * * security_center_properties.resource_type: `=`, `:`
   * * security_center_properties.resource_parent: `=`, `:`
   * * security_center_properties.resource_parent_display_name: `=`, `:`
   * * security_center_properties.resource_project: `=`, `:`
   * * security_center_properties.resource_project_display_name: `=`, `:`
   * * security_center_properties.resource_owners: `=`, `:`
   * For example, `resource_properties.size = 100` is a valid filter string.
   * Use a partial match on the empty string to filter based on a property
   * existing: `resource_properties.my_property : ""`
   * Use a negated partial match on the empty string to filter based on a
   * property not existing: `-resource_properties.my_property : ""`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,resource_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,resource_properties.a_property" and "
   * name     desc  ,   resource_properties.a_property  " are equivalent.
   * The following fields are supported:
   * name
   * update_time
   * resource_properties
   * security_marks.marks
   * security_center_properties.resource_name
   * security_center_properties.resource_display_name
   * security_center_properties.resource_parent
   * security_center_properties.resource_parent_display_name
   * security_center_properties.resource_project
   * security_center_properties.resource_project_display_name
   * security_center_properties.resource_type
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,resource_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,resource_properties.a_property" and "
   * name     desc  ,   resource_properties.a_property  " are equivalent.
   * The following fields are supported:
   * name
   * update_time
   * resource_properties
   * security_marks.marks
   * security_center_properties.resource_name
   * security_center_properties.resource_display_name
   * security_center_properties.resource_parent
   * security_center_properties.resource_parent_display_name
   * security_center_properties.resource_project
   * security_center_properties.resource_project_display_name
   * security_center_properties.resource_type
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Time used as a reference point when filtering assets. The filter is limited
   * to assets existing at the supplied time and their values are those at that
   * specific time. Absence of this field will default to the API's version of
   * NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   * <pre>
   * Time used as a reference point when filtering assets. The filter is limited
   * to assets existing at the supplied time and their values are those at that
   * specific time. Absence of this field will default to the API's version of
   * NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * Time used as a reference point when filtering assets. The filter is limited
   * to assets existing at the supplied time and their values are those at that
   * specific time. Absence of this field will default to the API's version of
   * NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   * <pre>
   * When compare_duration is set, the ListAssetsResult's "state_change"
   * attribute is updated to indicate whether the asset was added, removed, or
   * remained present during the compare_duration period of time that precedes
   * the read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence of the asset at the
   * two points in time. Intermediate state changes between the two times don't
   * affect the result. For example, the results aren't affected if the asset is
   * removed and re-created again.
   * Possible "state_change" values when compare_duration is specified:
   * * "ADDED":   indicates that the asset was not present at the start of
   *                compare_duration, but present at read_time.
   * * "REMOVED": indicates that the asset was present at the start of
   *                compare_duration, but not present at read_time.
   * * "ACTIVE":  indicates that the asset was present at both the
   *                start and the end of the time period defined by
   *                compare_duration and read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all assets present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   * @return Whether the compareDuration field is set.
   */
  boolean hasCompareDuration();
  /**
   * <pre>
   * When compare_duration is set, the ListAssetsResult's "state_change"
   * attribute is updated to indicate whether the asset was added, removed, or
   * remained present during the compare_duration period of time that precedes
   * the read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence of the asset at the
   * two points in time. Intermediate state changes between the two times don't
   * affect the result. For example, the results aren't affected if the asset is
   * removed and re-created again.
   * Possible "state_change" values when compare_duration is specified:
   * * "ADDED":   indicates that the asset was not present at the start of
   *                compare_duration, but present at read_time.
   * * "REMOVED": indicates that the asset was present at the start of
   *                compare_duration, but not present at read_time.
   * * "ACTIVE":  indicates that the asset was present at both the
   *                start and the end of the time period defined by
   *                compare_duration and read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all assets present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   * @return The compareDuration.
   */
  com.google.protobuf.Duration getCompareDuration();
  /**
   * <pre>
   * When compare_duration is set, the ListAssetsResult's "state_change"
   * attribute is updated to indicate whether the asset was added, removed, or
   * remained present during the compare_duration period of time that precedes
   * the read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence of the asset at the
   * two points in time. Intermediate state changes between the two times don't
   * affect the result. For example, the results aren't affected if the asset is
   * removed and re-created again.
   * Possible "state_change" values when compare_duration is specified:
   * * "ADDED":   indicates that the asset was not present at the start of
   *                compare_duration, but present at read_time.
   * * "REMOVED": indicates that the asset was present at the start of
   *                compare_duration, but not present at read_time.
   * * "ACTIVE":  indicates that the asset was present at both the
   *                start and the end of the time period defined by
   *                compare_duration and read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all assets present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getCompareDurationOrBuilder();

  /**
   * <pre>
   * A field mask to specify the ListAssetsResult fields to be listed in the
   * response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7;</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * A field mask to specify the ListAssetsResult fields to be listed in the
   * response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7;</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * A field mask to specify the ListAssetsResult fields to be listed in the
   * response.
   * An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * The value returned by the last `ListAssetsResponse`; indicates
   * that this is a continuation of a prior `ListAssets` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 8;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last `ListAssetsResponse`; indicates
   * that this is a continuation of a prior `ListAssets` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 8;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 9;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
