/**
 * Autogenerated by Thrift Compiler (0.9.0)
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

public class Activity_t implements org.apache.thrift.TBase<Activity_t, Activity_t._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Activity_t");

  private static final org.apache.thrift.protocol.TField ACTIVITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("activityId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACTIVITY_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("activityDate", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SUBTITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("subtitle", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ICON_FIELD_DESC = new org.apache.thrift.protocol.TField("icon", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ACTIVITY_LINK_FIELD_DESC = new org.apache.thrift.protocol.TField("activityLink", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField ACTIVITY_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("activityEvent", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField ACTION_TAKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("actionTaken", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Activity_tStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Activity_tTupleSchemeFactory());
  }

  public String activityId; // optional
  public long activityDate; // required
  public String title; // optional
  public String subtitle; // optional
  public String icon; // optional
  public ActivityLink_t activityLink; // optional
  /**
   * 
   * @see ActivityEvent_t
   */
  public ActivityEvent_t activityEvent; // optional
  public boolean actionTaken; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTIVITY_ID((short)1, "activityId"),
    ACTIVITY_DATE((short)2, "activityDate"),
    TITLE((short)3, "title"),
    SUBTITLE((short)4, "subtitle"),
    ICON((short)5, "icon"),
    ACTIVITY_LINK((short)6, "activityLink"),
    /**
     * 
     * @see ActivityEvent_t
     */
    ACTIVITY_EVENT((short)7, "activityEvent"),
    ACTION_TAKEN((short)8, "actionTaken");

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
        case 1: // ACTIVITY_ID
          return ACTIVITY_ID;
        case 2: // ACTIVITY_DATE
          return ACTIVITY_DATE;
        case 3: // TITLE
          return TITLE;
        case 4: // SUBTITLE
          return SUBTITLE;
        case 5: // ICON
          return ICON;
        case 6: // ACTIVITY_LINK
          return ACTIVITY_LINK;
        case 7: // ACTIVITY_EVENT
          return ACTIVITY_EVENT;
        case 8: // ACTION_TAKEN
          return ACTION_TAKEN;
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
  private static final int __ACTIVITYDATE_ISSET_ID = 0;
  private static final int __ACTIONTAKEN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ACTIVITY_ID,_Fields.TITLE,_Fields.SUBTITLE,_Fields.ICON,_Fields.ACTIVITY_LINK,_Fields.ACTIVITY_EVENT,_Fields.ACTION_TAKEN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVITY_ID, new org.apache.thrift.meta_data.FieldMetaData("activityId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTIVITY_DATE, new org.apache.thrift.meta_data.FieldMetaData("activityDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Timestamp")));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBTITLE, new org.apache.thrift.meta_data.FieldMetaData("subtitle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ICON, new org.apache.thrift.meta_data.FieldMetaData("icon", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTIVITY_LINK, new org.apache.thrift.meta_data.FieldMetaData("activityLink", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ActivityLink_t.class)));
    tmpMap.put(_Fields.ACTIVITY_EVENT, new org.apache.thrift.meta_data.FieldMetaData("activityEvent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ActivityEvent_t.class)));
    tmpMap.put(_Fields.ACTION_TAKEN, new org.apache.thrift.meta_data.FieldMetaData("actionTaken", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Activity_t.class, metaDataMap);
  }

  public Activity_t() {
    this.actionTaken = false;

  }

  public Activity_t(
    long activityDate)
  {
    this();
    this.activityDate = activityDate;
    setActivityDateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Activity_t(Activity_t other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetActivityId()) {
      this.activityId = other.activityId;
    }
    this.activityDate = other.activityDate;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetSubtitle()) {
      this.subtitle = other.subtitle;
    }
    if (other.isSetIcon()) {
      this.icon = other.icon;
    }
    if (other.isSetActivityLink()) {
      this.activityLink = new ActivityLink_t(other.activityLink);
    }
    if (other.isSetActivityEvent()) {
      this.activityEvent = other.activityEvent;
    }
    this.actionTaken = other.actionTaken;
  }

  public Activity_t deepCopy() {
    return new Activity_t(this);
  }

  public void clear() {
    this.activityId = null;
    setActivityDateIsSet(false);
    this.activityDate = 0;
    this.title = null;
    this.subtitle = null;
    this.icon = null;
    this.activityLink = null;
    this.activityEvent = null;
    this.actionTaken = false;

  }

  public String getActivityId() {
    return this.activityId;
  }

  public Activity_t setActivityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  public void unsetActivityId() {
    this.activityId = null;
  }

  /** Returns true if field activityId is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityId() {
    return this.activityId != null;
  }

  public void setActivityIdIsSet(boolean value) {
    if (!value) {
      this.activityId = null;
    }
  }

  public long getActivityDate() {
    return this.activityDate;
  }

  public Activity_t setActivityDate(long activityDate) {
    this.activityDate = activityDate;
    setActivityDateIsSet(true);
    return this;
  }

  public void unsetActivityDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVITYDATE_ISSET_ID);
  }

  /** Returns true if field activityDate is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityDate() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVITYDATE_ISSET_ID);
  }

  public void setActivityDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVITYDATE_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public Activity_t setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getSubtitle() {
    return this.subtitle;
  }

  public Activity_t setSubtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  public void unsetSubtitle() {
    this.subtitle = null;
  }

  /** Returns true if field subtitle is set (has been assigned a value) and false otherwise */
  public boolean isSetSubtitle() {
    return this.subtitle != null;
  }

  public void setSubtitleIsSet(boolean value) {
    if (!value) {
      this.subtitle = null;
    }
  }

  public String getIcon() {
    return this.icon;
  }

  public Activity_t setIcon(String icon) {
    this.icon = icon;
    return this;
  }

  public void unsetIcon() {
    this.icon = null;
  }

  /** Returns true if field icon is set (has been assigned a value) and false otherwise */
  public boolean isSetIcon() {
    return this.icon != null;
  }

  public void setIconIsSet(boolean value) {
    if (!value) {
      this.icon = null;
    }
  }

  public ActivityLink_t getActivityLink() {
    return this.activityLink;
  }

  public Activity_t setActivityLink(ActivityLink_t activityLink) {
    this.activityLink = activityLink;
    return this;
  }

  public void unsetActivityLink() {
    this.activityLink = null;
  }

  /** Returns true if field activityLink is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityLink() {
    return this.activityLink != null;
  }

  public void setActivityLinkIsSet(boolean value) {
    if (!value) {
      this.activityLink = null;
    }
  }

  /**
   * 
   * @see ActivityEvent_t
   */
  public ActivityEvent_t getActivityEvent() {
    return this.activityEvent;
  }

  /**
   * 
   * @see ActivityEvent_t
   */
  public Activity_t setActivityEvent(ActivityEvent_t activityEvent) {
    this.activityEvent = activityEvent;
    return this;
  }

  public void unsetActivityEvent() {
    this.activityEvent = null;
  }

  /** Returns true if field activityEvent is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityEvent() {
    return this.activityEvent != null;
  }

  public void setActivityEventIsSet(boolean value) {
    if (!value) {
      this.activityEvent = null;
    }
  }

  public boolean isActionTaken() {
    return this.actionTaken;
  }

  public Activity_t setActionTaken(boolean actionTaken) {
    this.actionTaken = actionTaken;
    setActionTakenIsSet(true);
    return this;
  }

  public void unsetActionTaken() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIONTAKEN_ISSET_ID);
  }

  /** Returns true if field actionTaken is set (has been assigned a value) and false otherwise */
  public boolean isSetActionTaken() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIONTAKEN_ISSET_ID);
  }

  public void setActionTakenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIONTAKEN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVITY_ID:
      if (value == null) {
        unsetActivityId();
      } else {
        setActivityId((String)value);
      }
      break;

    case ACTIVITY_DATE:
      if (value == null) {
        unsetActivityDate();
      } else {
        setActivityDate((Long)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case SUBTITLE:
      if (value == null) {
        unsetSubtitle();
      } else {
        setSubtitle((String)value);
      }
      break;

    case ICON:
      if (value == null) {
        unsetIcon();
      } else {
        setIcon((String)value);
      }
      break;

    case ACTIVITY_LINK:
      if (value == null) {
        unsetActivityLink();
      } else {
        setActivityLink((ActivityLink_t)value);
      }
      break;

    case ACTIVITY_EVENT:
      if (value == null) {
        unsetActivityEvent();
      } else {
        setActivityEvent((ActivityEvent_t)value);
      }
      break;

    case ACTION_TAKEN:
      if (value == null) {
        unsetActionTaken();
      } else {
        setActionTaken((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVITY_ID:
      return getActivityId();

    case ACTIVITY_DATE:
      return Long.valueOf(getActivityDate());

    case TITLE:
      return getTitle();

    case SUBTITLE:
      return getSubtitle();

    case ICON:
      return getIcon();

    case ACTIVITY_LINK:
      return getActivityLink();

    case ACTIVITY_EVENT:
      return getActivityEvent();

    case ACTION_TAKEN:
      return Boolean.valueOf(isActionTaken());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVITY_ID:
      return isSetActivityId();
    case ACTIVITY_DATE:
      return isSetActivityDate();
    case TITLE:
      return isSetTitle();
    case SUBTITLE:
      return isSetSubtitle();
    case ICON:
      return isSetIcon();
    case ACTIVITY_LINK:
      return isSetActivityLink();
    case ACTIVITY_EVENT:
      return isSetActivityEvent();
    case ACTION_TAKEN:
      return isSetActionTaken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Activity_t)
      return this.equals((Activity_t)that);
    return false;
  }

  public boolean equals(Activity_t that) {
    if (that == null)
      return false;

    boolean this_present_activityId = true && this.isSetActivityId();
    boolean that_present_activityId = true && that.isSetActivityId();
    if (this_present_activityId || that_present_activityId) {
      if (!(this_present_activityId && that_present_activityId))
        return false;
      if (!this.activityId.equals(that.activityId))
        return false;
    }

    boolean this_present_activityDate = true;
    boolean that_present_activityDate = true;
    if (this_present_activityDate || that_present_activityDate) {
      if (!(this_present_activityDate && that_present_activityDate))
        return false;
      if (this.activityDate != that.activityDate)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_subtitle = true && this.isSetSubtitle();
    boolean that_present_subtitle = true && that.isSetSubtitle();
    if (this_present_subtitle || that_present_subtitle) {
      if (!(this_present_subtitle && that_present_subtitle))
        return false;
      if (!this.subtitle.equals(that.subtitle))
        return false;
    }

    boolean this_present_icon = true && this.isSetIcon();
    boolean that_present_icon = true && that.isSetIcon();
    if (this_present_icon || that_present_icon) {
      if (!(this_present_icon && that_present_icon))
        return false;
      if (!this.icon.equals(that.icon))
        return false;
    }

    boolean this_present_activityLink = true && this.isSetActivityLink();
    boolean that_present_activityLink = true && that.isSetActivityLink();
    if (this_present_activityLink || that_present_activityLink) {
      if (!(this_present_activityLink && that_present_activityLink))
        return false;
      if (!this.activityLink.equals(that.activityLink))
        return false;
    }

    boolean this_present_activityEvent = true && this.isSetActivityEvent();
    boolean that_present_activityEvent = true && that.isSetActivityEvent();
    if (this_present_activityEvent || that_present_activityEvent) {
      if (!(this_present_activityEvent && that_present_activityEvent))
        return false;
      if (!this.activityEvent.equals(that.activityEvent))
        return false;
    }

    boolean this_present_actionTaken = true && this.isSetActionTaken();
    boolean that_present_actionTaken = true && that.isSetActionTaken();
    if (this_present_actionTaken || that_present_actionTaken) {
      if (!(this_present_actionTaken && that_present_actionTaken))
        return false;
      if (this.actionTaken != that.actionTaken)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Activity_t other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Activity_t typedOther = (Activity_t)other;

    lastComparison = Boolean.valueOf(isSetActivityId()).compareTo(typedOther.isSetActivityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityId, typedOther.activityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActivityDate()).compareTo(typedOther.isSetActivityDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityDate, typedOther.activityDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(typedOther.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, typedOther.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubtitle()).compareTo(typedOther.isSetSubtitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubtitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subtitle, typedOther.subtitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIcon()).compareTo(typedOther.isSetIcon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.icon, typedOther.icon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActivityLink()).compareTo(typedOther.isSetActivityLink());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityLink()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityLink, typedOther.activityLink);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActivityEvent()).compareTo(typedOther.isSetActivityEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityEvent, typedOther.activityEvent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActionTaken()).compareTo(typedOther.isSetActionTaken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActionTaken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actionTaken, typedOther.actionTaken);
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
    StringBuilder sb = new StringBuilder("Activity_t(");
    boolean first = true;

    if (isSetActivityId()) {
      sb.append("activityId:");
      if (this.activityId == null) {
        sb.append("null");
      } else {
        sb.append(this.activityId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("activityDate:");
    sb.append(this.activityDate);
    first = false;
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetSubtitle()) {
      if (!first) sb.append(", ");
      sb.append("subtitle:");
      if (this.subtitle == null) {
        sb.append("null");
      } else {
        sb.append(this.subtitle);
      }
      first = false;
    }
    if (isSetIcon()) {
      if (!first) sb.append(", ");
      sb.append("icon:");
      if (this.icon == null) {
        sb.append("null");
      } else {
        sb.append(this.icon);
      }
      first = false;
    }
    if (isSetActivityLink()) {
      if (!first) sb.append(", ");
      sb.append("activityLink:");
      if (this.activityLink == null) {
        sb.append("null");
      } else {
        sb.append(this.activityLink);
      }
      first = false;
    }
    if (isSetActivityEvent()) {
      if (!first) sb.append(", ");
      sb.append("activityEvent:");
      if (this.activityEvent == null) {
        sb.append("null");
      } else {
        sb.append(this.activityEvent);
      }
      first = false;
    }
    if (isSetActionTaken()) {
      if (!first) sb.append(", ");
      sb.append("actionTaken:");
      sb.append(this.actionTaken);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'activityDate' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (activityLink != null) {
      activityLink.validate();
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

  private static class Activity_tStandardSchemeFactory implements SchemeFactory {
    public Activity_tStandardScheme getScheme() {
      return new Activity_tStandardScheme();
    }
  }

  private static class Activity_tStandardScheme extends StandardScheme<Activity_t> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Activity_t struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.activityId = iprot.readString();
              struct.setActivityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTIVITY_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.activityDate = iprot.readI64();
              struct.setActivityDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUBTITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subtitle = iprot.readString();
              struct.setSubtitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ICON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.icon = iprot.readString();
              struct.setIconIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ACTIVITY_LINK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.activityLink = new ActivityLink_t();
              struct.activityLink.read(iprot);
              struct.setActivityLinkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ACTIVITY_EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.activityEvent = ActivityEvent_t.findByValue(iprot.readI32());
              struct.setActivityEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ACTION_TAKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.actionTaken = iprot.readBool();
              struct.setActionTakenIsSet(true);
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
      if (!struct.isSetActivityDate()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'activityDate' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Activity_t struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.activityId != null) {
        if (struct.isSetActivityId()) {
          oprot.writeFieldBegin(ACTIVITY_ID_FIELD_DESC);
          oprot.writeString(struct.activityId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(ACTIVITY_DATE_FIELD_DESC);
      oprot.writeI64(struct.activityDate);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subtitle != null) {
        if (struct.isSetSubtitle()) {
          oprot.writeFieldBegin(SUBTITLE_FIELD_DESC);
          oprot.writeString(struct.subtitle);
          oprot.writeFieldEnd();
        }
      }
      if (struct.icon != null) {
        if (struct.isSetIcon()) {
          oprot.writeFieldBegin(ICON_FIELD_DESC);
          oprot.writeString(struct.icon);
          oprot.writeFieldEnd();
        }
      }
      if (struct.activityLink != null) {
        if (struct.isSetActivityLink()) {
          oprot.writeFieldBegin(ACTIVITY_LINK_FIELD_DESC);
          struct.activityLink.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.activityEvent != null) {
        if (struct.isSetActivityEvent()) {
          oprot.writeFieldBegin(ACTIVITY_EVENT_FIELD_DESC);
          oprot.writeI32(struct.activityEvent.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetActionTaken()) {
        oprot.writeFieldBegin(ACTION_TAKEN_FIELD_DESC);
        oprot.writeBool(struct.actionTaken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Activity_tTupleSchemeFactory implements SchemeFactory {
    public Activity_tTupleScheme getScheme() {
      return new Activity_tTupleScheme();
    }
  }

  private static class Activity_tTupleScheme extends TupleScheme<Activity_t> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Activity_t struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.activityDate);
      BitSet optionals = new BitSet();
      if (struct.isSetActivityId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetSubtitle()) {
        optionals.set(2);
      }
      if (struct.isSetIcon()) {
        optionals.set(3);
      }
      if (struct.isSetActivityLink()) {
        optionals.set(4);
      }
      if (struct.isSetActivityEvent()) {
        optionals.set(5);
      }
      if (struct.isSetActionTaken()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetActivityId()) {
        oprot.writeString(struct.activityId);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetSubtitle()) {
        oprot.writeString(struct.subtitle);
      }
      if (struct.isSetIcon()) {
        oprot.writeString(struct.icon);
      }
      if (struct.isSetActivityLink()) {
        struct.activityLink.write(oprot);
      }
      if (struct.isSetActivityEvent()) {
        oprot.writeI32(struct.activityEvent.getValue());
      }
      if (struct.isSetActionTaken()) {
        oprot.writeBool(struct.actionTaken);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Activity_t struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.activityDate = iprot.readI64();
      struct.setActivityDateIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.activityId = iprot.readString();
        struct.setActivityIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.subtitle = iprot.readString();
        struct.setSubtitleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.icon = iprot.readString();
        struct.setIconIsSet(true);
      }
      if (incoming.get(4)) {
        struct.activityLink = new ActivityLink_t();
        struct.activityLink.read(iprot);
        struct.setActivityLinkIsSet(true);
      }
      if (incoming.get(5)) {
        struct.activityEvent = ActivityEvent_t.findByValue(iprot.readI32());
        struct.setActivityEventIsSet(true);
      }
      if (incoming.get(6)) {
        struct.actionTaken = iprot.readBool();
        struct.setActionTakenIsSet(true);
      }
    }
  }

}

