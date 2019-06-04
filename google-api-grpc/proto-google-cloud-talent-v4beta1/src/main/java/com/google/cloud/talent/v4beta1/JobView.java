// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * An enum that specifies the job attributes that are returned in the
 * [MatchingJob.job][google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob.job]
 * or [ListJobsResponse.jobs][google.cloud.talent.v4beta1.ListJobsResponse.jobs]
 * fields.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.JobView}
 */
public enum JobView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>JOB_VIEW_UNSPECIFIED = 0;</code>
   */
  JOB_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A ID only view of job, with following attributes:
   * [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code].
   * </pre>
   *
   * <code>JOB_VIEW_ID_ONLY = 1;</code>
   */
  JOB_VIEW_ID_ONLY(1),
  /**
   *
   *
   * <pre>
   * A minimal view of the job, with the following attributes:
   * [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.title][google.cloud.talent.v4beta1.Job.title],
   * [Job.company][google.cloud.talent.v4beta1.Job.company],
   * [Job.DerivedInfo.locations][google.cloud.talent.v4beta1.Job.DerivedInfo.locations],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code].
   * </pre>
   *
   * <code>JOB_VIEW_MINIMAL = 2;</code>
   */
  JOB_VIEW_MINIMAL(2),
  /**
   *
   *
   * <pre>
   * A small view of the job, with the following attributes in the search
   * results: [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.title][google.cloud.talent.v4beta1.Job.title],
   * [Job.company][google.cloud.talent.v4beta1.Job.company],
   * [Job.DerivedInfo.locations][google.cloud.talent.v4beta1.Job.DerivedInfo.locations],
   * [Job.visibility][google.cloud.talent.v4beta1.Job.visibility],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code],
   * [Job.description][google.cloud.talent.v4beta1.Job.description].
   * </pre>
   *
   * <code>JOB_VIEW_SMALL = 3;</code>
   */
  JOB_VIEW_SMALL(3),
  /**
   *
   *
   * <pre>
   * All available attributes are included in the search results.
   * </pre>
   *
   * <code>JOB_VIEW_FULL = 4;</code>
   */
  JOB_VIEW_FULL(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>JOB_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int JOB_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A ID only view of job, with following attributes:
   * [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code].
   * </pre>
   *
   * <code>JOB_VIEW_ID_ONLY = 1;</code>
   */
  public static final int JOB_VIEW_ID_ONLY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A minimal view of the job, with the following attributes:
   * [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.title][google.cloud.talent.v4beta1.Job.title],
   * [Job.company][google.cloud.talent.v4beta1.Job.company],
   * [Job.DerivedInfo.locations][google.cloud.talent.v4beta1.Job.DerivedInfo.locations],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code].
   * </pre>
   *
   * <code>JOB_VIEW_MINIMAL = 2;</code>
   */
  public static final int JOB_VIEW_MINIMAL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A small view of the job, with the following attributes in the search
   * results: [Job.name][google.cloud.talent.v4beta1.Job.name],
   * [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id],
   * [Job.title][google.cloud.talent.v4beta1.Job.title],
   * [Job.company][google.cloud.talent.v4beta1.Job.company],
   * [Job.DerivedInfo.locations][google.cloud.talent.v4beta1.Job.DerivedInfo.locations],
   * [Job.visibility][google.cloud.talent.v4beta1.Job.visibility],
   * [Job.language_code][google.cloud.talent.v4beta1.Job.language_code],
   * [Job.description][google.cloud.talent.v4beta1.Job.description].
   * </pre>
   *
   * <code>JOB_VIEW_SMALL = 3;</code>
   */
  public static final int JOB_VIEW_SMALL_VALUE = 3;
  /**
   *
   *
   * <pre>
   * All available attributes are included in the search results.
   * </pre>
   *
   * <code>JOB_VIEW_FULL = 4;</code>
   */
  public static final int JOB_VIEW_FULL_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static JobView valueOf(int value) {
    return forNumber(value);
  }

  public static JobView forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_VIEW_UNSPECIFIED;
      case 1:
        return JOB_VIEW_ID_ONLY;
      case 2:
        return JOB_VIEW_MINIMAL;
      case 3:
        return JOB_VIEW_SMALL;
      case 4:
        return JOB_VIEW_FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobView>() {
        public JobView findValueByNumber(int number) {
          return JobView.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.JobServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final JobView[] VALUES = values();

  public static JobView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.JobView)
}
