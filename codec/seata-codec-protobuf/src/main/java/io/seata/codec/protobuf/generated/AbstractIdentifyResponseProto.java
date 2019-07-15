// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractIdentifyResponse.proto

package io.seata.codec.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.AbstractIdentifyResponseProto}
 */
public  final class AbstractIdentifyResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.AbstractIdentifyResponseProto)
    AbstractIdentifyResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbstractIdentifyResponseProto.newBuilder() to construct.
  private AbstractIdentifyResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractIdentifyResponseProto() {
    version_ = "";
    extraData_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbstractIdentifyResponseProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder subBuilder = null;
            if (abstractResultMessage_ != null) {
              subBuilder = abstractResultMessage_.toBuilder();
            }
            abstractResultMessage_ = input.readMessage(io.seata.codec.protobuf.generated.AbstractResultMessageProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractResultMessage_);
              abstractResultMessage_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            extraData_ = s;
            break;
          }
          case 32: {

            identified_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.seata.codec.protobuf.generated.AbstractIdentifyResponse.internal_static_io_seata_protocol_protobuf_AbstractIdentifyResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.codec.protobuf.generated.AbstractIdentifyResponse.internal_static_io_seata_protocol_protobuf_AbstractIdentifyResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.class, io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.Builder.class);
  }

  public static final int ABSTRACTRESULTMESSAGE_FIELD_NUMBER = 1;
  private io.seata.codec.protobuf.generated.AbstractResultMessageProto abstractResultMessage_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  public boolean hasAbstractResultMessage() {
    return abstractResultMessage_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  public io.seata.codec.protobuf.generated.AbstractResultMessageProto getAbstractResultMessage() {
    return abstractResultMessage_ == null ? io.seata.codec.protobuf.generated.AbstractResultMessageProto.getDefaultInstance() : abstractResultMessage_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
   */
  public io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder getAbstractResultMessageOrBuilder() {
    return getAbstractResultMessage();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 2;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRADATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object extraData_;
  /**
   * <code>string extraData = 3;</code>
   */
  public java.lang.String getExtraData() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extraData_ = s;
      return s;
    }
  }
  /**
   * <code>string extraData = 3;</code>
   */
  public com.google.protobuf.ByteString
      getExtraDataBytes() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extraData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTIFIED_FIELD_NUMBER = 4;
  private boolean identified_;
  /**
   * <code>bool identified = 4;</code>
   */
  public boolean getIdentified() {
    return identified_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (abstractResultMessage_ != null) {
      output.writeMessage(1, getAbstractResultMessage());
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extraData_);
    }
    if (identified_ != false) {
      output.writeBool(4, identified_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractResultMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractResultMessage());
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, extraData_);
    }
    if (identified_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, identified_);
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
    if (!(obj instanceof io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto)) {
      return super.equals(obj);
    }
    io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto other = (io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto) obj;

    if (hasAbstractResultMessage() != other.hasAbstractResultMessage()) return false;
    if (hasAbstractResultMessage()) {
      if (!getAbstractResultMessage()
          .equals(other.getAbstractResultMessage())) return false;
    }
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (!getExtraData()
        .equals(other.getExtraData())) return false;
    if (getIdentified()
        != other.getIdentified()) return false;
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
    if (hasAbstractResultMessage()) {
      hash = (37 * hash) + ABSTRACTRESULTMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractResultMessage().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + EXTRADATA_FIELD_NUMBER;
    hash = (53 * hash) + getExtraData().hashCode();
    hash = (37 * hash) + IDENTIFIED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIdentified());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * PublishRequest is a publish request.
   * </pre>
   *
   * Protobuf type {@code io.seata.protocol.protobuf.AbstractIdentifyResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.AbstractIdentifyResponseProto)
      io.seata.codec.protobuf.generated.AbstractIdentifyResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.codec.protobuf.generated.AbstractIdentifyResponse.internal_static_io_seata_protocol_protobuf_AbstractIdentifyResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.codec.protobuf.generated.AbstractIdentifyResponse.internal_static_io_seata_protocol_protobuf_AbstractIdentifyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.class, io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.Builder.class);
    }

    // Construct using io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (abstractResultMessageBuilder_ == null) {
        abstractResultMessage_ = null;
      } else {
        abstractResultMessage_ = null;
        abstractResultMessageBuilder_ = null;
      }
      version_ = "";

      extraData_ = "";

      identified_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.codec.protobuf.generated.AbstractIdentifyResponse.internal_static_io_seata_protocol_protobuf_AbstractIdentifyResponseProto_descriptor;
    }

    @java.lang.Override
    public io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto getDefaultInstanceForType() {
      return io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto build() {
      io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto buildPartial() {
      io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto result = new io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto(this);
      if (abstractResultMessageBuilder_ == null) {
        result.abstractResultMessage_ = abstractResultMessage_;
      } else {
        result.abstractResultMessage_ = abstractResultMessageBuilder_.build();
      }
      result.version_ = version_;
      result.extraData_ = extraData_;
      result.identified_ = identified_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto) {
        return mergeFrom((io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto other) {
      if (other == io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto.getDefaultInstance()) return this;
      if (other.hasAbstractResultMessage()) {
        mergeAbstractResultMessage(other.getAbstractResultMessage());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.getExtraData().isEmpty()) {
        extraData_ = other.extraData_;
        onChanged();
      }
      if (other.getIdentified() != false) {
        setIdentified(other.getIdentified());
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
      io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.seata.codec.protobuf.generated.AbstractResultMessageProto abstractResultMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.codec.protobuf.generated.AbstractResultMessageProto, io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder, io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder> abstractResultMessageBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public boolean hasAbstractResultMessage() {
      return abstractResultMessageBuilder_ != null || abstractResultMessage_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public io.seata.codec.protobuf.generated.AbstractResultMessageProto getAbstractResultMessage() {
      if (abstractResultMessageBuilder_ == null) {
        return abstractResultMessage_ == null ? io.seata.codec.protobuf.generated.AbstractResultMessageProto.getDefaultInstance() : abstractResultMessage_;
      } else {
        return abstractResultMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public Builder setAbstractResultMessage(io.seata.codec.protobuf.generated.AbstractResultMessageProto value) {
      if (abstractResultMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractResultMessage_ = value;
        onChanged();
      } else {
        abstractResultMessageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public Builder setAbstractResultMessage(
        io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder builderForValue) {
      if (abstractResultMessageBuilder_ == null) {
        abstractResultMessage_ = builderForValue.build();
        onChanged();
      } else {
        abstractResultMessageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public Builder mergeAbstractResultMessage(io.seata.codec.protobuf.generated.AbstractResultMessageProto value) {
      if (abstractResultMessageBuilder_ == null) {
        if (abstractResultMessage_ != null) {
          abstractResultMessage_ =
            io.seata.codec.protobuf.generated.AbstractResultMessageProto.newBuilder(abstractResultMessage_).mergeFrom(value).buildPartial();
        } else {
          abstractResultMessage_ = value;
        }
        onChanged();
      } else {
        abstractResultMessageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public Builder clearAbstractResultMessage() {
      if (abstractResultMessageBuilder_ == null) {
        abstractResultMessage_ = null;
        onChanged();
      } else {
        abstractResultMessage_ = null;
        abstractResultMessageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder getAbstractResultMessageBuilder() {
      
      onChanged();
      return getAbstractResultMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    public io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder getAbstractResultMessageOrBuilder() {
      if (abstractResultMessageBuilder_ != null) {
        return abstractResultMessageBuilder_.getMessageOrBuilder();
      } else {
        return abstractResultMessage_ == null ?
            io.seata.codec.protobuf.generated.AbstractResultMessageProto.getDefaultInstance() : abstractResultMessage_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractResultMessageProto abstractResultMessage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.codec.protobuf.generated.AbstractResultMessageProto, io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder, io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder> 
        getAbstractResultMessageFieldBuilder() {
      if (abstractResultMessageBuilder_ == null) {
        abstractResultMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.seata.codec.protobuf.generated.AbstractResultMessageProto, io.seata.codec.protobuf.generated.AbstractResultMessageProto.Builder, io.seata.codec.protobuf.generated.AbstractResultMessageProtoOrBuilder>(
                getAbstractResultMessage(),
                getParentForChildren(),
                isClean());
        abstractResultMessage_ = null;
      }
      return abstractResultMessageBuilder_;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object extraData_ = "";
    /**
     * <code>string extraData = 3;</code>
     */
    public java.lang.String getExtraData() {
      java.lang.Object ref = extraData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      java.lang.Object ref = extraData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder setExtraData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extraData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder clearExtraData() {
      
      extraData_ = getDefaultInstance().getExtraData();
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 3;</code>
     */
    public Builder setExtraDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extraData_ = value;
      onChanged();
      return this;
    }

    private boolean identified_ ;
    /**
     * <code>bool identified = 4;</code>
     */
    public boolean getIdentified() {
      return identified_;
    }
    /**
     * <code>bool identified = 4;</code>
     */
    public Builder setIdentified(boolean value) {
      
      identified_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool identified = 4;</code>
     */
    public Builder clearIdentified() {
      
      identified_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.AbstractIdentifyResponseProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.AbstractIdentifyResponseProto)
  private static final io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto();
  }

  public static io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractIdentifyResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractIdentifyResponseProto>() {
    @java.lang.Override
    public AbstractIdentifyResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbstractIdentifyResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractIdentifyResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbstractIdentifyResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.seata.codec.protobuf.generated.AbstractIdentifyResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
