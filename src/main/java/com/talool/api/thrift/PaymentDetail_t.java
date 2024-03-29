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

public class PaymentDetail_t implements org.apache.thrift.TBase<PaymentDetail_t, PaymentDetail_t._Fields>, java.io.Serializable, Cloneable, Comparable<PaymentDetail_t> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PaymentDetail_t");

  private static final org.apache.thrift.protocol.TField ENCRYPTED_FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("encryptedFields", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField CARD_FIELD_DESC = new org.apache.thrift.protocol.TField("card", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PAYMENT_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("paymentMetadata", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField SAVE_CARD_FIELD_DESC = new org.apache.thrift.protocol.TField("saveCard", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PaymentDetail_tStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PaymentDetail_tTupleSchemeFactory());
  }

  public boolean encryptedFields; // required
  public Card_t card; // required
  public Map<String,String> paymentMetadata; // optional
  public boolean saveCard; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENCRYPTED_FIELDS((short)1, "encryptedFields"),
    CARD((short)2, "card"),
    PAYMENT_METADATA((short)3, "paymentMetadata"),
    SAVE_CARD((short)4, "saveCard");

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
        case 1: // ENCRYPTED_FIELDS
          return ENCRYPTED_FIELDS;
        case 2: // CARD
          return CARD;
        case 3: // PAYMENT_METADATA
          return PAYMENT_METADATA;
        case 4: // SAVE_CARD
          return SAVE_CARD;
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
  private static final int __ENCRYPTEDFIELDS_ISSET_ID = 0;
  private static final int __SAVECARD_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PAYMENT_METADATA,_Fields.SAVE_CARD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENCRYPTED_FIELDS, new org.apache.thrift.meta_data.FieldMetaData("encryptedFields", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CARD, new org.apache.thrift.meta_data.FieldMetaData("card", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Card_t.class)));
    tmpMap.put(_Fields.PAYMENT_METADATA, new org.apache.thrift.meta_data.FieldMetaData("paymentMetadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SAVE_CARD, new org.apache.thrift.meta_data.FieldMetaData("saveCard", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PaymentDetail_t.class, metaDataMap);
  }

  public PaymentDetail_t() {
  }

  public PaymentDetail_t(
    boolean encryptedFields,
    Card_t card)
  {
    this();
    this.encryptedFields = encryptedFields;
    setEncryptedFieldsIsSet(true);
    this.card = card;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaymentDetail_t(PaymentDetail_t other) {
    __isset_bitfield = other.__isset_bitfield;
    this.encryptedFields = other.encryptedFields;
    if (other.isSetCard()) {
      this.card = new Card_t(other.card);
    }
    if (other.isSetPaymentMetadata()) {
      Map<String,String> __this__paymentMetadata = new HashMap<String,String>(other.paymentMetadata);
      this.paymentMetadata = __this__paymentMetadata;
    }
    this.saveCard = other.saveCard;
  }

  public PaymentDetail_t deepCopy() {
    return new PaymentDetail_t(this);
  }

  public void clear() {
    setEncryptedFieldsIsSet(false);
    this.encryptedFields = false;
    this.card = null;
    this.paymentMetadata = null;
    setSaveCardIsSet(false);
    this.saveCard = false;
  }

  public boolean isEncryptedFields() {
    return this.encryptedFields;
  }

  public PaymentDetail_t setEncryptedFields(boolean encryptedFields) {
    this.encryptedFields = encryptedFields;
    setEncryptedFieldsIsSet(true);
    return this;
  }

  public void unsetEncryptedFields() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENCRYPTEDFIELDS_ISSET_ID);
  }

  /** Returns true if field encryptedFields is set (has been assigned a value) and false otherwise */
  public boolean isSetEncryptedFields() {
    return EncodingUtils.testBit(__isset_bitfield, __ENCRYPTEDFIELDS_ISSET_ID);
  }

  public void setEncryptedFieldsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENCRYPTEDFIELDS_ISSET_ID, value);
  }

  public Card_t getCard() {
    return this.card;
  }

  public PaymentDetail_t setCard(Card_t card) {
    this.card = card;
    return this;
  }

  public void unsetCard() {
    this.card = null;
  }

  /** Returns true if field card is set (has been assigned a value) and false otherwise */
  public boolean isSetCard() {
    return this.card != null;
  }

  public void setCardIsSet(boolean value) {
    if (!value) {
      this.card = null;
    }
  }

  public int getPaymentMetadataSize() {
    return (this.paymentMetadata == null) ? 0 : this.paymentMetadata.size();
  }

  public void putToPaymentMetadata(String key, String val) {
    if (this.paymentMetadata == null) {
      this.paymentMetadata = new HashMap<String,String>();
    }
    this.paymentMetadata.put(key, val);
  }

  public Map<String,String> getPaymentMetadata() {
    return this.paymentMetadata;
  }

  public PaymentDetail_t setPaymentMetadata(Map<String,String> paymentMetadata) {
    this.paymentMetadata = paymentMetadata;
    return this;
  }

  public void unsetPaymentMetadata() {
    this.paymentMetadata = null;
  }

  /** Returns true if field paymentMetadata is set (has been assigned a value) and false otherwise */
  public boolean isSetPaymentMetadata() {
    return this.paymentMetadata != null;
  }

  public void setPaymentMetadataIsSet(boolean value) {
    if (!value) {
      this.paymentMetadata = null;
    }
  }

  public boolean isSaveCard() {
    return this.saveCard;
  }

  public PaymentDetail_t setSaveCard(boolean saveCard) {
    this.saveCard = saveCard;
    setSaveCardIsSet(true);
    return this;
  }

  public void unsetSaveCard() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SAVECARD_ISSET_ID);
  }

  /** Returns true if field saveCard is set (has been assigned a value) and false otherwise */
  public boolean isSetSaveCard() {
    return EncodingUtils.testBit(__isset_bitfield, __SAVECARD_ISSET_ID);
  }

  public void setSaveCardIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SAVECARD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENCRYPTED_FIELDS:
      if (value == null) {
        unsetEncryptedFields();
      } else {
        setEncryptedFields((Boolean)value);
      }
      break;

    case CARD:
      if (value == null) {
        unsetCard();
      } else {
        setCard((Card_t)value);
      }
      break;

    case PAYMENT_METADATA:
      if (value == null) {
        unsetPaymentMetadata();
      } else {
        setPaymentMetadata((Map<String,String>)value);
      }
      break;

    case SAVE_CARD:
      if (value == null) {
        unsetSaveCard();
      } else {
        setSaveCard((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENCRYPTED_FIELDS:
      return Boolean.valueOf(isEncryptedFields());

    case CARD:
      return getCard();

    case PAYMENT_METADATA:
      return getPaymentMetadata();

    case SAVE_CARD:
      return Boolean.valueOf(isSaveCard());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENCRYPTED_FIELDS:
      return isSetEncryptedFields();
    case CARD:
      return isSetCard();
    case PAYMENT_METADATA:
      return isSetPaymentMetadata();
    case SAVE_CARD:
      return isSetSaveCard();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaymentDetail_t)
      return this.equals((PaymentDetail_t)that);
    return false;
  }

  public boolean equals(PaymentDetail_t that) {
    if (that == null)
      return false;

    boolean this_present_encryptedFields = true;
    boolean that_present_encryptedFields = true;
    if (this_present_encryptedFields || that_present_encryptedFields) {
      if (!(this_present_encryptedFields && that_present_encryptedFields))
        return false;
      if (this.encryptedFields != that.encryptedFields)
        return false;
    }

    boolean this_present_card = true && this.isSetCard();
    boolean that_present_card = true && that.isSetCard();
    if (this_present_card || that_present_card) {
      if (!(this_present_card && that_present_card))
        return false;
      if (!this.card.equals(that.card))
        return false;
    }

    boolean this_present_paymentMetadata = true && this.isSetPaymentMetadata();
    boolean that_present_paymentMetadata = true && that.isSetPaymentMetadata();
    if (this_present_paymentMetadata || that_present_paymentMetadata) {
      if (!(this_present_paymentMetadata && that_present_paymentMetadata))
        return false;
      if (!this.paymentMetadata.equals(that.paymentMetadata))
        return false;
    }

    boolean this_present_saveCard = true && this.isSetSaveCard();
    boolean that_present_saveCard = true && that.isSetSaveCard();
    if (this_present_saveCard || that_present_saveCard) {
      if (!(this_present_saveCard && that_present_saveCard))
        return false;
      if (this.saveCard != that.saveCard)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PaymentDetail_t other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEncryptedFields()).compareTo(other.isSetEncryptedFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncryptedFields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encryptedFields, other.encryptedFields);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCard()).compareTo(other.isSetCard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCard()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.card, other.card);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPaymentMetadata()).compareTo(other.isSetPaymentMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaymentMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paymentMetadata, other.paymentMetadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSaveCard()).compareTo(other.isSetSaveCard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSaveCard()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.saveCard, other.saveCard);
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
    StringBuilder sb = new StringBuilder("PaymentDetail_t(");
    boolean first = true;

    sb.append("encryptedFields:");
    sb.append(this.encryptedFields);
    first = false;
    if (!first) sb.append(", ");
    sb.append("card:");
    if (this.card == null) {
      sb.append("null");
    } else {
      sb.append(this.card);
    }
    first = false;
    if (isSetPaymentMetadata()) {
      if (!first) sb.append(", ");
      sb.append("paymentMetadata:");
      if (this.paymentMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.paymentMetadata);
      }
      first = false;
    }
    if (isSetSaveCard()) {
      if (!first) sb.append(", ");
      sb.append("saveCard:");
      sb.append(this.saveCard);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'encryptedFields' because it's a primitive and you chose the non-beans generator.
    if (card == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'card' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (card != null) {
      card.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class PaymentDetail_tStandardSchemeFactory implements SchemeFactory {
    public PaymentDetail_tStandardScheme getScheme() {
      return new PaymentDetail_tStandardScheme();
    }
  }

  private static class PaymentDetail_tStandardScheme extends StandardScheme<PaymentDetail_t> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PaymentDetail_t struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENCRYPTED_FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.encryptedFields = iprot.readBool();
              struct.setEncryptedFieldsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CARD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.card = new Card_t();
              struct.card.read(iprot);
              struct.setCardIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAYMENT_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.paymentMetadata = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2;
                  String _val3;
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.paymentMetadata.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setPaymentMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SAVE_CARD
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.saveCard = iprot.readBool();
              struct.setSaveCardIsSet(true);
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
      if (!struct.isSetEncryptedFields()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'encryptedFields' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PaymentDetail_t struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ENCRYPTED_FIELDS_FIELD_DESC);
      oprot.writeBool(struct.encryptedFields);
      oprot.writeFieldEnd();
      if (struct.card != null) {
        oprot.writeFieldBegin(CARD_FIELD_DESC);
        struct.card.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.paymentMetadata != null) {
        if (struct.isSetPaymentMetadata()) {
          oprot.writeFieldBegin(PAYMENT_METADATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.paymentMetadata.size()));
            for (Map.Entry<String, String> _iter4 : struct.paymentMetadata.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSaveCard()) {
        oprot.writeFieldBegin(SAVE_CARD_FIELD_DESC);
        oprot.writeBool(struct.saveCard);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaymentDetail_tTupleSchemeFactory implements SchemeFactory {
    public PaymentDetail_tTupleScheme getScheme() {
      return new PaymentDetail_tTupleScheme();
    }
  }

  private static class PaymentDetail_tTupleScheme extends TupleScheme<PaymentDetail_t> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PaymentDetail_t struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.encryptedFields);
      struct.card.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPaymentMetadata()) {
        optionals.set(0);
      }
      if (struct.isSetSaveCard()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPaymentMetadata()) {
        {
          oprot.writeI32(struct.paymentMetadata.size());
          for (Map.Entry<String, String> _iter5 : struct.paymentMetadata.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
      if (struct.isSetSaveCard()) {
        oprot.writeBool(struct.saveCard);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PaymentDetail_t struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.encryptedFields = iprot.readBool();
      struct.setEncryptedFieldsIsSet(true);
      struct.card = new Card_t();
      struct.card.read(iprot);
      struct.setCardIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.paymentMetadata = new HashMap<String,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8;
            String _val9;
            _key8 = iprot.readString();
            _val9 = iprot.readString();
            struct.paymentMetadata.put(_key8, _val9);
          }
        }
        struct.setPaymentMetadataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.saveCard = iprot.readBool();
        struct.setSaveCardIsSet(true);
      }
    }
  }

}

