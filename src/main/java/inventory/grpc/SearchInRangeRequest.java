// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryRecord.proto

package inventory.grpc;

/**
 * Protobuf type {@code inventory.SearchInRangeRequest}
 */
public  final class SearchInRangeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inventory.SearchInRangeRequest)
    SearchInRangeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchInRangeRequest.newBuilder() to construct.
  private SearchInRangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchInRangeRequest() {
    keyName_ = "";
    keyValueStart_ = "";
    keyValueEnd_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchInRangeRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            keyName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            keyValueStart_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            keyValueEnd_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return inventory.grpc.Inventory.internal_static_inventory_SearchInRangeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return inventory.grpc.Inventory.internal_static_inventory_SearchInRangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            inventory.grpc.SearchInRangeRequest.class, inventory.grpc.SearchInRangeRequest.Builder.class);
  }

  public static final int KEY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object keyName_;
  /**
   * <code>string Key_Name = 1;</code>
   */
  public java.lang.String getKeyName() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyName_ = s;
      return s;
    }
  }
  /**
   * <code>string Key_Name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getKeyNameBytes() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_VALUE_START_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyValueStart_;
  /**
   * <code>string Key_Value_start = 2;</code>
   */
  public java.lang.String getKeyValueStart() {
    java.lang.Object ref = keyValueStart_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyValueStart_ = s;
      return s;
    }
  }
  /**
   * <code>string Key_Value_start = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyValueStartBytes() {
    java.lang.Object ref = keyValueStart_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyValueStart_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_VALUE_END_FIELD_NUMBER = 3;
  private volatile java.lang.Object keyValueEnd_;
  /**
   * <code>string Key_Value_end = 3;</code>
   */
  public java.lang.String getKeyValueEnd() {
    java.lang.Object ref = keyValueEnd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyValueEnd_ = s;
      return s;
    }
  }
  /**
   * <code>string Key_Value_end = 3;</code>
   */
  public com.google.protobuf.ByteString
      getKeyValueEndBytes() {
    java.lang.Object ref = keyValueEnd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyValueEnd_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getKeyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyName_);
    }
    if (!getKeyValueStartBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyValueStart_);
    }
    if (!getKeyValueEndBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keyValueEnd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyName_);
    }
    if (!getKeyValueStartBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyValueStart_);
    }
    if (!getKeyValueEndBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keyValueEnd_);
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
    if (!(obj instanceof inventory.grpc.SearchInRangeRequest)) {
      return super.equals(obj);
    }
    inventory.grpc.SearchInRangeRequest other = (inventory.grpc.SearchInRangeRequest) obj;

    boolean result = true;
    result = result && getKeyName()
        .equals(other.getKeyName());
    result = result && getKeyValueStart()
        .equals(other.getKeyValueStart());
    result = result && getKeyValueEnd()
        .equals(other.getKeyValueEnd());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKeyName().hashCode();
    hash = (37 * hash) + KEY_VALUE_START_FIELD_NUMBER;
    hash = (53 * hash) + getKeyValueStart().hashCode();
    hash = (37 * hash) + KEY_VALUE_END_FIELD_NUMBER;
    hash = (53 * hash) + getKeyValueEnd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static inventory.grpc.SearchInRangeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static inventory.grpc.SearchInRangeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static inventory.grpc.SearchInRangeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static inventory.grpc.SearchInRangeRequest parseFrom(
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
  public static Builder newBuilder(inventory.grpc.SearchInRangeRequest prototype) {
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
   * Protobuf type {@code inventory.SearchInRangeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inventory.SearchInRangeRequest)
      inventory.grpc.SearchInRangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return inventory.grpc.Inventory.internal_static_inventory_SearchInRangeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return inventory.grpc.Inventory.internal_static_inventory_SearchInRangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              inventory.grpc.SearchInRangeRequest.class, inventory.grpc.SearchInRangeRequest.Builder.class);
    }

    // Construct using inventory.grpc.SearchInRangeRequest.newBuilder()
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
      keyName_ = "";

      keyValueStart_ = "";

      keyValueEnd_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return inventory.grpc.Inventory.internal_static_inventory_SearchInRangeRequest_descriptor;
    }

    @java.lang.Override
    public inventory.grpc.SearchInRangeRequest getDefaultInstanceForType() {
      return inventory.grpc.SearchInRangeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public inventory.grpc.SearchInRangeRequest build() {
      inventory.grpc.SearchInRangeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public inventory.grpc.SearchInRangeRequest buildPartial() {
      inventory.grpc.SearchInRangeRequest result = new inventory.grpc.SearchInRangeRequest(this);
      result.keyName_ = keyName_;
      result.keyValueStart_ = keyValueStart_;
      result.keyValueEnd_ = keyValueEnd_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof inventory.grpc.SearchInRangeRequest) {
        return mergeFrom((inventory.grpc.SearchInRangeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(inventory.grpc.SearchInRangeRequest other) {
      if (other == inventory.grpc.SearchInRangeRequest.getDefaultInstance()) return this;
      if (!other.getKeyName().isEmpty()) {
        keyName_ = other.keyName_;
        onChanged();
      }
      if (!other.getKeyValueStart().isEmpty()) {
        keyValueStart_ = other.keyValueStart_;
        onChanged();
      }
      if (!other.getKeyValueEnd().isEmpty()) {
        keyValueEnd_ = other.keyValueEnd_;
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
      inventory.grpc.SearchInRangeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (inventory.grpc.SearchInRangeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object keyName_ = "";
    /**
     * <code>string Key_Name = 1;</code>
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Key_Name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Key_Name = 1;</code>
     */
    public Builder setKeyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Name = 1;</code>
     */
    public Builder clearKeyName() {
      
      keyName_ = getDefaultInstance().getKeyName();
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Name = 1;</code>
     */
    public Builder setKeyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object keyValueStart_ = "";
    /**
     * <code>string Key_Value_start = 2;</code>
     */
    public java.lang.String getKeyValueStart() {
      java.lang.Object ref = keyValueStart_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyValueStart_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Key_Value_start = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyValueStartBytes() {
      java.lang.Object ref = keyValueStart_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyValueStart_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Key_Value_start = 2;</code>
     */
    public Builder setKeyValueStart(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyValueStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value_start = 2;</code>
     */
    public Builder clearKeyValueStart() {
      
      keyValueStart_ = getDefaultInstance().getKeyValueStart();
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value_start = 2;</code>
     */
    public Builder setKeyValueStartBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyValueStart_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object keyValueEnd_ = "";
    /**
     * <code>string Key_Value_end = 3;</code>
     */
    public java.lang.String getKeyValueEnd() {
      java.lang.Object ref = keyValueEnd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyValueEnd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Key_Value_end = 3;</code>
     */
    public com.google.protobuf.ByteString
        getKeyValueEndBytes() {
      java.lang.Object ref = keyValueEnd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyValueEnd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Key_Value_end = 3;</code>
     */
    public Builder setKeyValueEnd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyValueEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value_end = 3;</code>
     */
    public Builder clearKeyValueEnd() {
      
      keyValueEnd_ = getDefaultInstance().getKeyValueEnd();
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value_end = 3;</code>
     */
    public Builder setKeyValueEndBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyValueEnd_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:inventory.SearchInRangeRequest)
  }

  // @@protoc_insertion_point(class_scope:inventory.SearchInRangeRequest)
  private static final inventory.grpc.SearchInRangeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new inventory.grpc.SearchInRangeRequest();
  }

  public static inventory.grpc.SearchInRangeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchInRangeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchInRangeRequest>() {
    @java.lang.Override
    public SearchInRangeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchInRangeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchInRangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchInRangeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public inventory.grpc.SearchInRangeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
