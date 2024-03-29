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

public class Merchant_t implements org.apache.thrift.TBase<Merchant_t, Merchant_t._Fields>, java.io.Serializable, Cloneable, Comparable<Merchant_t> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Merchant_t");

  private static final org.apache.thrift.protocol.TField MERCHANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("merchantId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Merchant_tStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Merchant_tTupleSchemeFactory());
  }

  public String merchantId; // optional
  public String name; // required
  public Category_t category; // optional
  public List<MerchantLocation_t> locations; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MERCHANT_ID((short)1, "merchantId"),
    NAME((short)2, "name"),
    CATEGORY((short)3, "category"),
    LOCATIONS((short)4, "locations");

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
        case 1: // MERCHANT_ID
          return MERCHANT_ID;
        case 2: // NAME
          return NAME;
        case 3: // CATEGORY
          return CATEGORY;
        case 4: // LOCATIONS
          return LOCATIONS;
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
  private _Fields optionals[] = {_Fields.MERCHANT_ID,_Fields.CATEGORY,_Fields.LOCATIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MERCHANT_ID, new org.apache.thrift.meta_data.FieldMetaData("merchantId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Category_t.class)));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MerchantLocation_t.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Merchant_t.class, metaDataMap);
  }

  public Merchant_t() {
  }

  public Merchant_t(
    String name)
  {
    this();
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Merchant_t(Merchant_t other) {
    if (other.isSetMerchantId()) {
      this.merchantId = other.merchantId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCategory()) {
      this.category = new Category_t(other.category);
    }
    if (other.isSetLocations()) {
      List<MerchantLocation_t> __this__locations = new ArrayList<MerchantLocation_t>(other.locations.size());
      for (MerchantLocation_t other_element : other.locations) {
        __this__locations.add(new MerchantLocation_t(other_element));
      }
      this.locations = __this__locations;
    }
  }

  public Merchant_t deepCopy() {
    return new Merchant_t(this);
  }

  public void clear() {
    this.merchantId = null;
    this.name = null;
    this.category = null;
    this.locations = null;
  }

  public String getMerchantId() {
    return this.merchantId;
  }

  public Merchant_t setMerchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  public void unsetMerchantId() {
    this.merchantId = null;
  }

  /** Returns true if field merchantId is set (has been assigned a value) and false otherwise */
  public boolean isSetMerchantId() {
    return this.merchantId != null;
  }

  public void setMerchantIdIsSet(boolean value) {
    if (!value) {
      this.merchantId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Merchant_t setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public Category_t getCategory() {
    return this.category;
  }

  public Merchant_t setCategory(Category_t category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  public java.util.Iterator<MerchantLocation_t> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(MerchantLocation_t elem) {
    if (this.locations == null) {
      this.locations = new ArrayList<MerchantLocation_t>();
    }
    this.locations.add(elem);
  }

  public List<MerchantLocation_t> getLocations() {
    return this.locations;
  }

  public Merchant_t setLocations(List<MerchantLocation_t> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MERCHANT_ID:
      if (value == null) {
        unsetMerchantId();
      } else {
        setMerchantId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((Category_t)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((List<MerchantLocation_t>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MERCHANT_ID:
      return getMerchantId();

    case NAME:
      return getName();

    case CATEGORY:
      return getCategory();

    case LOCATIONS:
      return getLocations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MERCHANT_ID:
      return isSetMerchantId();
    case NAME:
      return isSetName();
    case CATEGORY:
      return isSetCategory();
    case LOCATIONS:
      return isSetLocations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Merchant_t)
      return this.equals((Merchant_t)that);
    return false;
  }

  public boolean equals(Merchant_t that) {
    if (that == null)
      return false;

    boolean this_present_merchantId = true && this.isSetMerchantId();
    boolean that_present_merchantId = true && that.isSetMerchantId();
    if (this_present_merchantId || that_present_merchantId) {
      if (!(this_present_merchantId && that_present_merchantId))
        return false;
      if (!this.merchantId.equals(that.merchantId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Merchant_t other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMerchantId()).compareTo(other.isSetMerchantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMerchantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.merchantId, other.merchantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(other.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, other.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocations()).compareTo(other.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, other.locations);
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
    StringBuilder sb = new StringBuilder("Merchant_t(");
    boolean first = true;

    if (isSetMerchantId()) {
      sb.append("merchantId:");
      if (this.merchantId == null) {
        sb.append("null");
      } else {
        sb.append(this.merchantId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetCategory()) {
      if (!first) sb.append(", ");
      sb.append("category:");
      if (this.category == null) {
        sb.append("null");
      } else {
        sb.append(this.category);
      }
      first = false;
    }
    if (isSetLocations()) {
      if (!first) sb.append(", ");
      sb.append("locations:");
      if (this.locations == null) {
        sb.append("null");
      } else {
        sb.append(this.locations);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (category != null) {
      category.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class Merchant_tStandardSchemeFactory implements SchemeFactory {
    public Merchant_tStandardScheme getScheme() {
      return new Merchant_tStandardScheme();
    }
  }

  private static class Merchant_tStandardScheme extends StandardScheme<Merchant_t> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Merchant_t struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MERCHANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.merchantId = iprot.readString();
              struct.setMerchantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.category = new Category_t();
              struct.category.read(iprot);
              struct.setCategoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list10 = iprot.readListBegin();
                struct.locations = new ArrayList<MerchantLocation_t>(_list10.size);
                for (int _i11 = 0; _i11 < _list10.size; ++_i11)
                {
                  MerchantLocation_t _elem12;
                  _elem12 = new MerchantLocation_t();
                  _elem12.read(iprot);
                  struct.locations.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Merchant_t struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.merchantId != null) {
        if (struct.isSetMerchantId()) {
          oprot.writeFieldBegin(MERCHANT_ID_FIELD_DESC);
          oprot.writeString(struct.merchantId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.category != null) {
        if (struct.isSetCategory()) {
          oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
          struct.category.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.locations != null) {
        if (struct.isSetLocations()) {
          oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locations.size()));
            for (MerchantLocation_t _iter13 : struct.locations)
            {
              _iter13.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Merchant_tTupleSchemeFactory implements SchemeFactory {
    public Merchant_tTupleScheme getScheme() {
      return new Merchant_tTupleScheme();
    }
  }

  private static class Merchant_tTupleScheme extends TupleScheme<Merchant_t> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Merchant_t struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      BitSet optionals = new BitSet();
      if (struct.isSetMerchantId()) {
        optionals.set(0);
      }
      if (struct.isSetCategory()) {
        optionals.set(1);
      }
      if (struct.isSetLocations()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMerchantId()) {
        oprot.writeString(struct.merchantId);
      }
      if (struct.isSetCategory()) {
        struct.category.write(oprot);
      }
      if (struct.isSetLocations()) {
        {
          oprot.writeI32(struct.locations.size());
          for (MerchantLocation_t _iter14 : struct.locations)
          {
            _iter14.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Merchant_t struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.merchantId = iprot.readString();
        struct.setMerchantIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.category = new Category_t();
        struct.category.read(iprot);
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.locations = new ArrayList<MerchantLocation_t>(_list15.size);
          for (int _i16 = 0; _i16 < _list15.size; ++_i16)
          {
            MerchantLocation_t _elem17;
            _elem17 = new MerchantLocation_t();
            _elem17.read(iprot);
            struct.locations.add(_elem17);
          }
        }
        struct.setLocationsIsSet(true);
      }
    }
  }

}

