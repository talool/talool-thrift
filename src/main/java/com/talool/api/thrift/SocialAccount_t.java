/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.talool.api.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocialAccount_t implements org.apache.thrift.TBase<SocialAccount_t, SocialAccount_t._Fields>, java.io.Serializable, Cloneable, Comparable<SocialAccount_t> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SocialAccount_t");

  private static final org.apache.thrift.protocol.TField SOCIAL_NETWORK_FIELD_DESC = new org.apache.thrift.protocol.TField("socialNetwork", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LOGIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("loginId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CREATED_FIELD_DESC = new org.apache.thrift.protocol.TField("created", org.apache.thrift.protocol.TType.I64, (short)20);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SocialAccount_tStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SocialAccount_tTupleSchemeFactory());
  }

  /**
   * 
   * @see SocialNetwork_t
   */
  public SocialNetwork_t socialNetwork; // required
  public String loginId; // required
  public long created; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see SocialNetwork_t
     */
    SOCIAL_NETWORK((short)1, "socialNetwork"),
    LOGIN_ID((short)2, "loginId"),
    CREATED((short)20, "created");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SOCIAL_NETWORK
          return SOCIAL_NETWORK;
        case 2: // LOGIN_ID
          return LOGIN_ID;
        case 20: // CREATED
          return CREATED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CREATED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOCIAL_NETWORK, new org.apache.thrift.meta_data.FieldMetaData("socialNetwork", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SocialNetwork_t.class)));
    tmpMap.put(_Fields.LOGIN_ID, new org.apache.thrift.meta_data.FieldMetaData("loginId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED, new org.apache.thrift.meta_data.FieldMetaData("created", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Timestamp")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SocialAccount_t.class, metaDataMap);
  }

  public SocialAccount_t() {
  }

  public SocialAccount_t(
    SocialNetwork_t socialNetwork,
    String loginId)
  {
    this();
    this.socialNetwork = socialNetwork;
    this.loginId = loginId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SocialAccount_t(SocialAccount_t other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSocialNetwork()) {
      this.socialNetwork = other.socialNetwork;
    }
    if (other.isSetLoginId()) {
      this.loginId = other.loginId;
    }
    this.created = other.created;
  }

  public SocialAccount_t deepCopy() {
    return new SocialAccount_t(this);
  }

  public void clear() {
    this.socialNetwork = null;
    this.loginId = null;
    setCreatedIsSet(false);
    this.created = 0;
  }

  /**
   * 
   * @see SocialNetwork_t
   */
  public SocialNetwork_t getSocialNetwork() {
    return this.socialNetwork;
  }

  /**
   * 
   * @see SocialNetwork_t
   */
  public SocialAccount_t setSocialNetwork(SocialNetwork_t socialNetwork) {
    this.socialNetwork = socialNetwork;
    return this;
  }

  public void unsetSocialNetwork() {
    this.socialNetwork = null;
  }

  /** Returns true if field socialNetwork is set (has been assigned a value) and false otherwise */
  public boolean isSetSocialNetwork() {
    return this.socialNetwork != null;
  }

  public void setSocialNetworkIsSet(boolean value) {
    if (!value) {
      this.socialNetwork = null;
    }
  }

  public String getLoginId() {
    return this.loginId;
  }

  public SocialAccount_t setLoginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  public void unsetLoginId() {
    this.loginId = null;
  }

  /** Returns true if field loginId is set (has been assigned a value) and false otherwise */
  public boolean isSetLoginId() {
    return this.loginId != null;
  }

  public void setLoginIdIsSet(boolean value) {
    if (!value) {
      this.loginId = null;
    }
  }

  public long getCreated() {
    return this.created;
  }

  public SocialAccount_t setCreated(long created) {
    this.created = created;
    setCreatedIsSet(true);
    return this;
  }

  public void unsetCreated() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATED_ISSET_ID);
  }

  /** Returns true if field created is set (has been assigned a value) and false otherwise */
  public boolean isSetCreated() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATED_ISSET_ID);
  }

  public void setCreatedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOCIAL_NETWORK:
      if (value == null) {
        unsetSocialNetwork();
      } else {
        setSocialNetwork((SocialNetwork_t)value);
      }
      break;

    case LOGIN_ID:
      if (value == null) {
        unsetLoginId();
      } else {
        setLoginId((String)value);
      }
      break;

    case CREATED:
      if (value == null) {
        unsetCreated();
      } else {
        setCreated((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOCIAL_NETWORK:
      return getSocialNetwork();

    case LOGIN_ID:
      return getLoginId();

    case CREATED:
      return Long.valueOf(getCreated());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOCIAL_NETWORK:
      return isSetSocialNetwork();
    case LOGIN_ID:
      return isSetLoginId();
    case CREATED:
      return isSetCreated();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SocialAccount_t)
      return this.equals((SocialAccount_t)that);
    return false;
  }

  public boolean equals(SocialAccount_t that) {
    if (that == null)
      return false;

    boolean this_present_socialNetwork = true && this.isSetSocialNetwork();
    boolean that_present_socialNetwork = true && that.isSetSocialNetwork();
    if (this_present_socialNetwork || that_present_socialNetwork) {
      if (!(this_present_socialNetwork && that_present_socialNetwork))
        return false;
      if (!this.socialNetwork.equals(that.socialNetwork))
        return false;
    }

    boolean this_present_loginId = true && this.isSetLoginId();
    boolean that_present_loginId = true && that.isSetLoginId();
    if (this_present_loginId || that_present_loginId) {
      if (!(this_present_loginId && that_present_loginId))
        return false;
      if (!this.loginId.equals(that.loginId))
        return false;
    }

    boolean this_present_created = true && this.isSetCreated();
    boolean that_present_created = true && that.isSetCreated();
    if (this_present_created || that_present_created) {
      if (!(this_present_created && that_present_created))
        return false;
      if (this.created != that.created)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SocialAccount_t other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSocialNetwork()).compareTo(other.isSetSocialNetwork());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSocialNetwork()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.socialNetwork, other.socialNetwork);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoginId()).compareTo(other.isSetLoginId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoginId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loginId, other.loginId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreated()).compareTo(other.isSetCreated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.created, other.created);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SocialAccount_t(");
    boolean first = true;

    sb.append("socialNetwork:");
    if (this.socialNetwork == null) {
      sb.append("null");
    } else {
      sb.append(this.socialNetwork);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("loginId:");
    if (this.loginId == null) {
      sb.append("null");
    } else {
      sb.append(this.loginId);
    }
    first = false;
    if (isSetCreated()) {
      if (!first) sb.append(", ");
      sb.append("created:");
      sb.append(this.created);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (socialNetwork == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'socialNetwork' was not present! Struct: " + toString());
    }
    if (loginId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'loginId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class SocialAccount_tStandardSchemeFactory implements SchemeFactory {
    public SocialAccount_tStandardScheme getScheme() {
      return new SocialAccount_tStandardScheme();
    }
  }

  private static class SocialAccount_tStandardScheme extends StandardScheme<SocialAccount_t> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SocialAccount_t struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOCIAL_NETWORK
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.socialNetwork = SocialNetwork_t.findByValue(iprot.readI32());
              struct.setSocialNetworkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOGIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.loginId = iprot.readString();
              struct.setLoginIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // CREATED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.created = iprot.readI64();
              struct.setCreatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SocialAccount_t struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.socialNetwork != null) {
        oprot.writeFieldBegin(SOCIAL_NETWORK_FIELD_DESC);
        oprot.writeI32(struct.socialNetwork.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.loginId != null) {
        oprot.writeFieldBegin(LOGIN_ID_FIELD_DESC);
        oprot.writeString(struct.loginId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreated()) {
        oprot.writeFieldBegin(CREATED_FIELD_DESC);
        oprot.writeI64(struct.created);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SocialAccount_tTupleSchemeFactory implements SchemeFactory {
    public SocialAccount_tTupleScheme getScheme() {
      return new SocialAccount_tTupleScheme();
    }
  }

  private static class SocialAccount_tTupleScheme extends TupleScheme<SocialAccount_t> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SocialAccount_t struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.socialNetwork.getValue());
      oprot.writeString(struct.loginId);
      BitSet optionals = new BitSet();
      if (struct.isSetCreated()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCreated()) {
        oprot.writeI64(struct.created);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SocialAccount_t struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.socialNetwork = SocialNetwork_t.findByValue(iprot.readI32());
      struct.setSocialNetworkIsSet(true);
      struct.loginId = iprot.readString();
      struct.setLoginIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.created = iprot.readI64();
        struct.setCreatedIsSet(true);
      }
    }
  }

}

