// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

/**
 *
 *
 * <pre>
 * Layer holds metadata specific to a layer of a Docker image.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.image.Layer}
 */
public final class Layer extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.image.Layer)
    LayerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Layer.newBuilder() to construct.
  private Layer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Layer() {
    directive_ = 0;
    arguments_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Layer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Layer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              directive_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              arguments_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Layer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.image.Image
        .internal_static_grafeas_v1beta1_image_Layer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.image.Layer.class, io.grafeas.v1beta1.image.Layer.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Instructions from Dockerfile.
   * </pre>
   *
   * Protobuf enum {@code grafeas.v1beta1.image.Layer.Directive}
   */
  public enum Directive implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value for unsupported/missing directive.
     * </pre>
     *
     * <code>DIRECTIVE_UNSPECIFIED = 0;</code>
     */
    DIRECTIVE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#maintainer
     * </pre>
     *
     * <code>MAINTAINER = 1;</code>
     */
    MAINTAINER(1),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#run
     * </pre>
     *
     * <code>RUN = 2;</code>
     */
    RUN(2),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#cmd
     * </pre>
     *
     * <code>CMD = 3;</code>
     */
    CMD(3),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#label
     * </pre>
     *
     * <code>LABEL = 4;</code>
     */
    LABEL(4),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#expose
     * </pre>
     *
     * <code>EXPOSE = 5;</code>
     */
    EXPOSE(5),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#env
     * </pre>
     *
     * <code>ENV = 6;</code>
     */
    ENV(6),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#add
     * </pre>
     *
     * <code>ADD = 7;</code>
     */
    ADD(7),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#copy
     * </pre>
     *
     * <code>COPY = 8;</code>
     */
    COPY(8),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#entrypoint
     * </pre>
     *
     * <code>ENTRYPOINT = 9;</code>
     */
    ENTRYPOINT(9),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#volume
     * </pre>
     *
     * <code>VOLUME = 10;</code>
     */
    VOLUME(10),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#user
     * </pre>
     *
     * <code>USER = 11;</code>
     */
    USER(11),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#workdir
     * </pre>
     *
     * <code>WORKDIR = 12;</code>
     */
    WORKDIR(12),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#arg
     * </pre>
     *
     * <code>ARG = 13;</code>
     */
    ARG(13),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#onbuild
     * </pre>
     *
     * <code>ONBUILD = 14;</code>
     */
    ONBUILD(14),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#stopsignal
     * </pre>
     *
     * <code>STOPSIGNAL = 15;</code>
     */
    STOPSIGNAL(15),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#healthcheck
     * </pre>
     *
     * <code>HEALTHCHECK = 16;</code>
     */
    HEALTHCHECK(16),
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#shell
     * </pre>
     *
     * <code>SHELL = 17;</code>
     */
    SHELL(17),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value for unsupported/missing directive.
     * </pre>
     *
     * <code>DIRECTIVE_UNSPECIFIED = 0;</code>
     */
    public static final int DIRECTIVE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#maintainer
     * </pre>
     *
     * <code>MAINTAINER = 1;</code>
     */
    public static final int MAINTAINER_VALUE = 1;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#run
     * </pre>
     *
     * <code>RUN = 2;</code>
     */
    public static final int RUN_VALUE = 2;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#cmd
     * </pre>
     *
     * <code>CMD = 3;</code>
     */
    public static final int CMD_VALUE = 3;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#label
     * </pre>
     *
     * <code>LABEL = 4;</code>
     */
    public static final int LABEL_VALUE = 4;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#expose
     * </pre>
     *
     * <code>EXPOSE = 5;</code>
     */
    public static final int EXPOSE_VALUE = 5;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#env
     * </pre>
     *
     * <code>ENV = 6;</code>
     */
    public static final int ENV_VALUE = 6;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#add
     * </pre>
     *
     * <code>ADD = 7;</code>
     */
    public static final int ADD_VALUE = 7;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#copy
     * </pre>
     *
     * <code>COPY = 8;</code>
     */
    public static final int COPY_VALUE = 8;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#entrypoint
     * </pre>
     *
     * <code>ENTRYPOINT = 9;</code>
     */
    public static final int ENTRYPOINT_VALUE = 9;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#volume
     * </pre>
     *
     * <code>VOLUME = 10;</code>
     */
    public static final int VOLUME_VALUE = 10;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#user
     * </pre>
     *
     * <code>USER = 11;</code>
     */
    public static final int USER_VALUE = 11;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#workdir
     * </pre>
     *
     * <code>WORKDIR = 12;</code>
     */
    public static final int WORKDIR_VALUE = 12;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#arg
     * </pre>
     *
     * <code>ARG = 13;</code>
     */
    public static final int ARG_VALUE = 13;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#onbuild
     * </pre>
     *
     * <code>ONBUILD = 14;</code>
     */
    public static final int ONBUILD_VALUE = 14;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#stopsignal
     * </pre>
     *
     * <code>STOPSIGNAL = 15;</code>
     */
    public static final int STOPSIGNAL_VALUE = 15;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#healthcheck
     * </pre>
     *
     * <code>HEALTHCHECK = 16;</code>
     */
    public static final int HEALTHCHECK_VALUE = 16;
    /**
     *
     *
     * <pre>
     * https://docs.docker.com/reference/builder/#shell
     * </pre>
     *
     * <code>SHELL = 17;</code>
     */
    public static final int SHELL_VALUE = 17;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static Directive valueOf(int value) {
      return forNumber(value);
    }

    public static Directive forNumber(int value) {
      switch (value) {
        case 0:
          return DIRECTIVE_UNSPECIFIED;
        case 1:
          return MAINTAINER;
        case 2:
          return RUN;
        case 3:
          return CMD;
        case 4:
          return LABEL;
        case 5:
          return EXPOSE;
        case 6:
          return ENV;
        case 7:
          return ADD;
        case 8:
          return COPY;
        case 9:
          return ENTRYPOINT;
        case 10:
          return VOLUME;
        case 11:
          return USER;
        case 12:
          return WORKDIR;
        case 13:
          return ARG;
        case 14:
          return ONBUILD;
        case 15:
          return STOPSIGNAL;
        case 16:
          return HEALTHCHECK;
        case 17:
          return SHELL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Directive> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Directive> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Directive>() {
          public Directive findValueByNumber(int number) {
            return Directive.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return io.grafeas.v1beta1.image.Layer.getDescriptor().getEnumTypes().get(0);
    }

    private static final Directive[] VALUES = values();

    public static Directive valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Directive(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grafeas.v1beta1.image.Layer.Directive)
  }

  public static final int DIRECTIVE_FIELD_NUMBER = 1;
  private int directive_;
  /**
   *
   *
   * <pre>
   * The recovered Dockerfile directive used to construct this layer.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
   */
  public int getDirectiveValue() {
    return directive_;
  }
  /**
   *
   *
   * <pre>
   * The recovered Dockerfile directive used to construct this layer.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
   */
  public io.grafeas.v1beta1.image.Layer.Directive getDirective() {
    @SuppressWarnings("deprecation")
    io.grafeas.v1beta1.image.Layer.Directive result =
        io.grafeas.v1beta1.image.Layer.Directive.valueOf(directive_);
    return result == null ? io.grafeas.v1beta1.image.Layer.Directive.UNRECOGNIZED : result;
  }

  public static final int ARGUMENTS_FIELD_NUMBER = 2;
  private volatile java.lang.Object arguments_;
  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   */
  public java.lang.String getArguments() {
    java.lang.Object ref = arguments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arguments_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   */
  public com.google.protobuf.ByteString getArgumentsBytes() {
    java.lang.Object ref = arguments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      arguments_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (directive_ != io.grafeas.v1beta1.image.Layer.Directive.DIRECTIVE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, directive_);
    }
    if (!getArgumentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, arguments_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (directive_ != io.grafeas.v1beta1.image.Layer.Directive.DIRECTIVE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, directive_);
    }
    if (!getArgumentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, arguments_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1beta1.image.Layer)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.image.Layer other = (io.grafeas.v1beta1.image.Layer) obj;

    if (directive_ != other.directive_) return false;
    if (!getArguments().equals(other.getArguments())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DIRECTIVE_FIELD_NUMBER;
    hash = (53 * hash) + directive_;
    hash = (37 * hash) + ARGUMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getArguments().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.image.Layer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.image.Layer parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.image.Layer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1beta1.image.Layer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Layer holds metadata specific to a layer of a Docker image.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.image.Layer}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.image.Layer)
      io.grafeas.v1beta1.image.LayerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Layer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.image.Image
          .internal_static_grafeas_v1beta1_image_Layer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.image.Layer.class, io.grafeas.v1beta1.image.Layer.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.image.Layer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      directive_ = 0;

      arguments_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Layer_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.image.Layer getDefaultInstanceForType() {
      return io.grafeas.v1beta1.image.Layer.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.image.Layer build() {
      io.grafeas.v1beta1.image.Layer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.image.Layer buildPartial() {
      io.grafeas.v1beta1.image.Layer result = new io.grafeas.v1beta1.image.Layer(this);
      result.directive_ = directive_;
      result.arguments_ = arguments_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.image.Layer) {
        return mergeFrom((io.grafeas.v1beta1.image.Layer) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.image.Layer other) {
      if (other == io.grafeas.v1beta1.image.Layer.getDefaultInstance()) return this;
      if (other.directive_ != 0) {
        setDirectiveValue(other.getDirectiveValue());
      }
      if (!other.getArguments().isEmpty()) {
        arguments_ = other.arguments_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1beta1.image.Layer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.image.Layer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int directive_ = 0;
    /**
     *
     *
     * <pre>
     * The recovered Dockerfile directive used to construct this layer.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
     */
    public int getDirectiveValue() {
      return directive_;
    }
    /**
     *
     *
     * <pre>
     * The recovered Dockerfile directive used to construct this layer.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
     */
    public Builder setDirectiveValue(int value) {
      directive_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered Dockerfile directive used to construct this layer.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
     */
    public io.grafeas.v1beta1.image.Layer.Directive getDirective() {
      @SuppressWarnings("deprecation")
      io.grafeas.v1beta1.image.Layer.Directive result =
          io.grafeas.v1beta1.image.Layer.Directive.valueOf(directive_);
      return result == null ? io.grafeas.v1beta1.image.Layer.Directive.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The recovered Dockerfile directive used to construct this layer.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
     */
    public Builder setDirective(io.grafeas.v1beta1.image.Layer.Directive value) {
      if (value == null) {
        throw new NullPointerException();
      }

      directive_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered Dockerfile directive used to construct this layer.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
     */
    public Builder clearDirective() {

      directive_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object arguments_ = "";
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     */
    public java.lang.String getArguments() {
      java.lang.Object ref = arguments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arguments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     */
    public com.google.protobuf.ByteString getArgumentsBytes() {
      java.lang.Object ref = arguments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        arguments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     */
    public Builder setArguments(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      arguments_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     */
    public Builder clearArguments() {

      arguments_ = getDefaultInstance().getArguments();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     */
    public Builder setArgumentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      arguments_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.image.Layer)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.image.Layer)
  private static final io.grafeas.v1beta1.image.Layer DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.image.Layer();
  }

  public static io.grafeas.v1beta1.image.Layer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Layer> PARSER =
      new com.google.protobuf.AbstractParser<Layer>() {
        @java.lang.Override
        public Layer parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Layer(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Layer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Layer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.image.Layer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
