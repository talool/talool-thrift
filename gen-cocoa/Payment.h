/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#import <Foundation/Foundation.h>

#import "TProtocol.h"
#import "TApplicationException.h"
#import "TProtocolException.h"
#import "TProtocolUtil.h"
#import "TProcessor.h"
#import "TObjective-C.h"
#import "TBase.h"

#import "Core.h"

@interface Card_t : NSObject <TBase, NSCoding> {
  NSString * __accountNumber;
  NSString * __expirationMonth;
  NSString * __expirationYear;
  NSString * __securityCode;
  NSString * __zipCode;

  BOOL __accountNumber_isset;
  BOOL __expirationMonth_isset;
  BOOL __expirationYear_isset;
  BOOL __securityCode_isset;
  BOOL __zipCode_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=accountNumber, setter=setAccountNumber:) NSString * accountNumber;
@property (nonatomic, retain, getter=expirationMonth, setter=setExpirationMonth:) NSString * expirationMonth;
@property (nonatomic, retain, getter=expirationYear, setter=setExpirationYear:) NSString * expirationYear;
@property (nonatomic, retain, getter=securityCode, setter=setSecurityCode:) NSString * securityCode;
@property (nonatomic, retain, getter=zipCode, setter=setZipCode:) NSString * zipCode;
#endif

- (id) init;
- (id) initWithAccountNumber: (NSString *) accountNumber expirationMonth: (NSString *) expirationMonth expirationYear: (NSString *) expirationYear securityCode: (NSString *) securityCode zipCode: (NSString *) zipCode;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSString *) accountNumber;
- (void) setAccountNumber: (NSString *) accountNumber;
#endif
- (BOOL) accountNumberIsSet;

#if !__has_feature(objc_arc)
- (NSString *) expirationMonth;
- (void) setExpirationMonth: (NSString *) expirationMonth;
#endif
- (BOOL) expirationMonthIsSet;

#if !__has_feature(objc_arc)
- (NSString *) expirationYear;
- (void) setExpirationYear: (NSString *) expirationYear;
#endif
- (BOOL) expirationYearIsSet;

#if !__has_feature(objc_arc)
- (NSString *) securityCode;
- (void) setSecurityCode: (NSString *) securityCode;
#endif
- (BOOL) securityCodeIsSet;

#if !__has_feature(objc_arc)
- (NSString *) zipCode;
- (void) setZipCode: (NSString *) zipCode;
#endif
- (BOOL) zipCodeIsSet;

@end

@interface PaymentDetail_t : NSObject <TBase, NSCoding> {
  BOOL __encryptedFields;
  Card_t * __card;
  NSMutableDictionary * __paymentMetadata;
  BOOL __saveCard;

  BOOL __encryptedFields_isset;
  BOOL __card_isset;
  BOOL __paymentMetadata_isset;
  BOOL __saveCard_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=encryptedFields, setter=setEncryptedFields:) BOOL encryptedFields;
@property (nonatomic, retain, getter=card, setter=setCard:) Card_t * card;
@property (nonatomic, retain, getter=paymentMetadata, setter=setPaymentMetadata:) NSMutableDictionary * paymentMetadata;
@property (nonatomic, getter=saveCard, setter=setSaveCard:) BOOL saveCard;
#endif

- (id) init;
- (id) initWithEncryptedFields: (BOOL) encryptedFields card: (Card_t *) card paymentMetadata: (NSMutableDictionary *) paymentMetadata saveCard: (BOOL) saveCard;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (BOOL) encryptedFields;
- (void) setEncryptedFields: (BOOL) encryptedFields;
#endif
- (BOOL) encryptedFieldsIsSet;

#if !__has_feature(objc_arc)
- (Card_t *) card;
- (void) setCard: (Card_t *) card;
#endif
- (BOOL) cardIsSet;

#if !__has_feature(objc_arc)
- (NSMutableDictionary *) paymentMetadata;
- (void) setPaymentMetadata: (NSMutableDictionary *) paymentMetadata;
#endif
- (BOOL) paymentMetadataIsSet;

#if !__has_feature(objc_arc)
- (BOOL) saveCard;
- (void) setSaveCard: (BOOL) saveCard;
#endif
- (BOOL) saveCardIsSet;

@end

@interface TransactionResult_t : NSObject <TBase, NSCoding> {
  BOOL __success;
  NSString * __message;

  BOOL __success_isset;
  BOOL __message_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=success, setter=setSuccess:) BOOL success;
@property (nonatomic, retain, getter=message, setter=setMessage:) NSString * message;
#endif

- (id) init;
- (id) initWithSuccess: (BOOL) success message: (NSString *) message;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (BOOL) success;
- (void) setSuccess: (BOOL) success;
#endif
- (BOOL) successIsSet;

#if !__has_feature(objc_arc)
- (NSString *) message;
- (void) setMessage: (NSString *) message;
#endif
- (BOOL) messageIsSet;

@end

@interface PaymentConstants : NSObject {
}
@end
