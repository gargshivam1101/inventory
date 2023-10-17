// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryRecord.proto

package inventory.grpc;

/**
 * Protobuf type {@code inventory.UpdateRequest}
 */
public  final class UpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inventory.UpdateRequest)
    UpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRequest.newBuilder() to construct.
  private UpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRequest() {
    keyName_ = "";
    keyValue_ = "";
    valName_ = "";
    valValNew_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateRequest(
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

            keyValue_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            valName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            valValNew_ = s;
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
    return inventory.grpc.Inventory.internal_static_inventory_UpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return inventory.grpc.Inventory.internal_static_inventory_UpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            inventory.grpc.UpdateRequest.class, inventory.grpc.UpdateRequest.Builder.class);
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

  public static final int KEY_VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyValue_;
  /**
   * <code>string Key_Value = 2;</code>
   */
  public java.lang.String getKeyValue() {
    java.lang.Object ref = keyValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyValue_ = s;
      return s;
    }
  }
  /**
   * <code>string Key_Value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyValueBytes() {
    java.lang.Object ref = keyValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VAL_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object valName_;
  /**
   * <code>string Val_Name = 3;</code>
   */
  public java.lang.String getValName() {
    java.lang.Object ref = valName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valName_ = s;
      return s;
    }
  }
  /**
   * <code>string Val_Name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getValNameBytes() {
    java.lang.Object ref = valName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VAL_VAL_NEW_FIELD_NUMBER = 4;
  private volatile java.lang.Object valValNew_;
  /**
   * <code>string Val_Val_New = 4;</code>
   */
  public java.lang.String getValValNew() {
    java.lang.Object ref = valValNew_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valValNew_ = s;
      return s;
    }
  }
  /**
   * <code>string Val_Val_New = 4;</code>
   */
  public com.google.protobuf.ByteString
      getValValNewBytes() {
    java.lang.Object ref = valValNew_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valValNew_ = b;
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
    if (!getKeyValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyValue_);
    }
    if (!getValNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, valName_);
    }
    if (!getValValNewBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, valValNew_);
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
    if (!getKeyValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyValue_);
    }
    if (!getValNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, valName_);
    }
    if (!getValValNewBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, valValNew_);
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
    if (!(obj instanceof inventory.grpc.UpdateRequest)) {
      return super.equals(obj);
    }
    inventory.grpc.UpdateRequest other = (inventory.grpc.UpdateRequest) obj;

    boolean result = true;
    result = result && getKeyName()
        .equals(other.getKeyName());
    result = result && getKeyValue()
        .equals(other.getKeyValue());
    result = result && getValName()
        .equals(other.getValName());
    result = result && getValValNew()
        .equals(other.getValValNew());
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
    hash = (37 * hash) + KEY_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getKeyValue().hashCode();
    hash = (37 * hash) + VAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getValName().hashCode();
    hash = (37 * hash) + VAL_VAL_NEW_FIELD_NUMBER;
    hash = (53 * hash) + getValValNew().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static inventory.grpc.UpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.UpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static inventory.grpc.UpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static inventory.grpc.UpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static inventory.grpc.UpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static inventory.grpc.UpdateRequest parseFrom(
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
  public static Builder newBuilder(inventory.grpc.UpdateRequest prototype) {
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
   * Protobuf type {@code inventory.UpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inventory.UpdateRequest)
      inventory.grpc.UpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return inventory.grpc.Inventory.internal_static_inventory_UpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return inventory.grpc.Inventory.internal_static_inventory_UpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              inventory.grpc.UpdateRequest.class, inventory.grpc.UpdateRequest.Builder.class);
    }

    // Construct using inventory.grpc.UpdateRequest.newBuilder()
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

      keyValue_ = "";

      valName_ = "";

      valValNew_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return inventory.grpc.Inventory.internal_static_inventory_UpdateRequest_descriptor;
    }

    @java.lang.Override
    public inventory.grpc.UpdateRequest getDefaultInstanceForType() {
      return inventory.grpc.UpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public inventory.grpc.UpdateRequest build() {
      inventory.grpc.UpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public inventory.grpc.UpdateRequest buildPartial() {
      inventory.grpc.UpdateRequest result = new inventory.grpc.UpdateRequest(this);
      result.keyName_ = keyName_;
      result.keyValue_ = keyValue_;
      result.valName_ = valName_;
      result.valValNew_ = valValNew_;
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
      if (other instanceof inventory.grpc.UpdateRequest) {
        return mergeFrom((inventory.grpc.UpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(inventory.grpc.UpdateRequest other) {
      if (other == inventory.grpc.UpdateRequest.getDefaultInstance()) return this;
      if (!other.getKeyName().isEmpty()) {
        keyName_ = other.keyName_;
        onChanged();
      }
      if (!other.getKeyValue().isEmpty()) {
        keyValue_ = other.keyValue_;
        onChanged();
      }
      if (!other.getValName().isEmpty()) {
        valName_ = other.valName_;
        onChanged();
      }
      if (!other.getValValNew().isEmpty()) {
        valValNew_ = other.valValNew_;
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
      inventory.grpc.UpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (inventory.grpc.UpdateRequest) e.getUnfinishedMessage();
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

    private java.lang.Object keyValue_ = "";
    /**
     * <code>string Key_Value = 2;</code>
     */
    public java.lang.String getKeyValue() {
      java.lang.Object ref = keyValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Key_Value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyValueBytes() {
      java.lang.Object ref = keyValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Key_Value = 2;</code>
     */
    public Builder setKeyValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value = 2;</code>
     */
    public Builder clearKeyValue() {
      
      keyValue_ = getDefaultInstance().getKeyValue();
      onChanged();
      return this;
    }
    /**
     * <code>string Key_Value = 2;</code>
     */
    public Builder setKeyValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyValue_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object valName_ = "";
    /**
     * <code>string Val_Name = 3;</code>
     */
    public java.lang.String getValName() {
      java.lang.Object ref = valName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Val_Name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getValNameBytes() {
      java.lang.Object ref = valName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Val_Name = 3;</code>
     */
    public Builder setValName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Val_Name = 3;</code>
     */
    public Builder clearValName() {
      
      valName_ = getDefaultInstance().getValName();
      onChanged();
      return this;
    }
    /**
     * <code>string Val_Name = 3;</code>
     */
    public Builder setValNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object valValNew_ = "";
    /**
     * <code>string Val_Val_New = 4;</code>
     */
    public java.lang.String getValValNew() {
      java.lang.Object ref = valValNew_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valValNew_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Val_Val_New = 4;</code>
     */
    public com.google.protobuf.ByteString
        getValValNewBytes() {
      java.lang.Object ref = valValNew_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valValNew_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Val_Val_New = 4;</code>
     */
    public Builder setValValNew(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valValNew_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Val_Val_New = 4;</code>
     */
    public Builder clearValValNew() {
      
      valValNew_ = getDefaultInstance().getValValNew();
      onChanged();
      return this;
    }
    /**
     * <code>string Val_Val_New = 4;</code>
     */
    public Builder setValValNewBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valValNew_ = value;
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


    // @@protoc_insertion_point(builder_scope:inventory.UpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:inventory.UpdateRequest)
  private static final inventory.grpc.UpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new inventory.grpc.UpdateRequest();
  }

  public static inventory.grpc.UpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRequest>() {
    @java.lang.Override
    public UpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public inventory.grpc.UpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
