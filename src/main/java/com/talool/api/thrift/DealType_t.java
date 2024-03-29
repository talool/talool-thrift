/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.talool.api.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DealType_t implements org.apache.thrift.TEnum {
  PAID_BOOK(0),
  FREE_BOOK(1),
  PAID_DEAL(2),
  FREE_DEAL(3);

  private final int value;

  private DealType_t(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static DealType_t findByValue(int value) { 
    switch (value) {
      case 0:
        return PAID_BOOK;
      case 1:
        return FREE_BOOK;
      case 2:
        return PAID_DEAL;
      case 3:
        return FREE_DEAL;
      default:
        return null;
    }
  }
}
