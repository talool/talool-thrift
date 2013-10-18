/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#import <Foundation/Foundation.h>

#import "TProtocol.h"
#import "TApplicationException.h"
#import "TProtocolUtil.h"
#import "TProcessor.h"
#import "TObjective-C.h"


#import "Error.h"

@implementation TServiceException_t

- (id) init
{
  return [super initWithName: @"TServiceException_t" reason: @"unknown" userInfo: nil];
}

- (id) initWithErrorCode: (int32_t) errorCode message: (NSString *) message
{
  self = [self init];
  __errorCode = errorCode;
  __errorCode_isset = YES;
  __message = [message retain_stub];
  __message_isset = YES;
  return self;
}

- (id) initWithCoder: (NSCoder *) decoder
{
  self = [super initWithCoder: decoder];
  if ([decoder containsValueForKey: @"errorCode"])
  {
    __errorCode = [decoder decodeInt32ForKey: @"errorCode"];
    __errorCode_isset = YES;
  }
  if ([decoder containsValueForKey: @"message"])
  {
    __message = [[decoder decodeObjectForKey: @"message"] retain_stub];
    __message_isset = YES;
  }
  return self;
}

- (void) encodeWithCoder: (NSCoder *) encoder
{
  [super encodeWithCoder: encoder];
  if (__errorCode_isset)
  {
    [encoder encodeInt32: __errorCode forKey: @"errorCode"];
  }
  if (__message_isset)
  {
    [encoder encodeObject: __message forKey: @"message"];
  }
}

- (void) dealloc
{
  [__message release_stub];
  [super dealloc_stub];
}

- (int32_t) errorCode {
  return __errorCode;
}

- (void) setErrorCode: (int32_t) errorCode {
  __errorCode = errorCode;
  __errorCode_isset = YES;
}

- (BOOL) errorCodeIsSet {
  return __errorCode_isset;
}

- (void) unsetErrorCode {
  __errorCode_isset = NO;
}

- (NSString *) message {
  return [[__message retain_stub] autorelease_stub];
}

- (void) setMessage: (NSString *) message {
  [message retain_stub];
  [__message release_stub];
  __message = message;
  __message_isset = YES;
}

- (BOOL) messageIsSet {
  return __message_isset;
}

- (void) unsetMessage {
  [__message release_stub];
  __message = nil;
  __message_isset = NO;
}

- (void) read: (id <TProtocol>) inProtocol
{
  NSString * fieldName;
  int fieldType;
  int fieldID;

  [inProtocol readStructBeginReturningName: NULL];
  while (true)
  {
    [inProtocol readFieldBeginReturningName: &fieldName type: &fieldType fieldID: &fieldID];
    if (fieldType == TType_STOP) { 
      break;
    }
    switch (fieldID)
    {
      case 1:
        if (fieldType == TType_I32) {
          int32_t fieldValue = [inProtocol readI32];
          [self setErrorCode: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      case 2:
        if (fieldType == TType_STRING) {
          NSString * fieldValue = [inProtocol readString];
          [self setMessage: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      default:
        [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        break;
    }
    [inProtocol readFieldEnd];
  }
  [inProtocol readStructEnd];
}

- (void) write: (id <TProtocol>) outProtocol {
  [outProtocol writeStructBeginWithName: @"TServiceException_t"];
  if (__errorCode_isset) {
    [outProtocol writeFieldBeginWithName: @"errorCode" type: TType_I32 fieldID: 1];
    [outProtocol writeI32: __errorCode];
    [outProtocol writeFieldEnd];
  }
  if (__message_isset) {
    if (__message != nil) {
      [outProtocol writeFieldBeginWithName: @"message" type: TType_STRING fieldID: 2];
      [outProtocol writeString: __message];
      [outProtocol writeFieldEnd];
    }
  }
  [outProtocol writeFieldStop];
  [outProtocol writeStructEnd];
}

- (NSString *) description {
  NSMutableString * ms = [NSMutableString stringWithString: @"TServiceException_t("];
  [ms appendString: @"errorCode:"];
  [ms appendFormat: @"%i", __errorCode];
  [ms appendString: @",message:"];
  [ms appendFormat: @"\"%@\"", __message];
  [ms appendString: @")"];
  return [NSString stringWithString: ms];
}

@end

@implementation TUserException_t

- (id) init
{
  return [super initWithName: @"TUserException_t" reason: @"unknown" userInfo: nil];
}

- (id) initWithErrorCode: (int32_t) errorCode param: (NSString *) param
{
  self = [self init];
  __errorCode = errorCode;
  __errorCode_isset = YES;
  __param = [param retain_stub];
  __param_isset = YES;
  return self;
}

- (id) initWithCoder: (NSCoder *) decoder
{
  self = [super initWithCoder: decoder];
  if ([decoder containsValueForKey: @"errorCode"])
  {
    __errorCode = [decoder decodeInt32ForKey: @"errorCode"];
    __errorCode_isset = YES;
  }
  if ([decoder containsValueForKey: @"param"])
  {
    __param = [[decoder decodeObjectForKey: @"param"] retain_stub];
    __param_isset = YES;
  }
  return self;
}

- (void) encodeWithCoder: (NSCoder *) encoder
{
  [super encodeWithCoder: encoder];
  if (__errorCode_isset)
  {
    [encoder encodeInt32: __errorCode forKey: @"errorCode"];
  }
  if (__param_isset)
  {
    [encoder encodeObject: __param forKey: @"param"];
  }
}

- (void) dealloc
{
  [__param release_stub];
  [super dealloc_stub];
}

- (int32_t) errorCode {
  return __errorCode;
}

- (void) setErrorCode: (int32_t) errorCode {
  __errorCode = errorCode;
  __errorCode_isset = YES;
}

- (BOOL) errorCodeIsSet {
  return __errorCode_isset;
}

- (void) unsetErrorCode {
  __errorCode_isset = NO;
}

- (NSString *) param {
  return [[__param retain_stub] autorelease_stub];
}

- (void) setParam: (NSString *) param {
  [param retain_stub];
  [__param release_stub];
  __param = param;
  __param_isset = YES;
}

- (BOOL) paramIsSet {
  return __param_isset;
}

- (void) unsetParam {
  [__param release_stub];
  __param = nil;
  __param_isset = NO;
}

- (void) read: (id <TProtocol>) inProtocol
{
  NSString * fieldName;
  int fieldType;
  int fieldID;

  [inProtocol readStructBeginReturningName: NULL];
  while (true)
  {
    [inProtocol readFieldBeginReturningName: &fieldName type: &fieldType fieldID: &fieldID];
    if (fieldType == TType_STOP) { 
      break;
    }
    switch (fieldID)
    {
      case 1:
        if (fieldType == TType_I32) {
          int32_t fieldValue = [inProtocol readI32];
          [self setErrorCode: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      case 2:
        if (fieldType == TType_STRING) {
          NSString * fieldValue = [inProtocol readString];
          [self setParam: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      default:
        [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        break;
    }
    [inProtocol readFieldEnd];
  }
  [inProtocol readStructEnd];
}

- (void) write: (id <TProtocol>) outProtocol {
  [outProtocol writeStructBeginWithName: @"TUserException_t"];
  if (__errorCode_isset) {
    [outProtocol writeFieldBeginWithName: @"errorCode" type: TType_I32 fieldID: 1];
    [outProtocol writeI32: __errorCode];
    [outProtocol writeFieldEnd];
  }
  if (__param_isset) {
    if (__param != nil) {
      [outProtocol writeFieldBeginWithName: @"param" type: TType_STRING fieldID: 2];
      [outProtocol writeString: __param];
      [outProtocol writeFieldEnd];
    }
  }
  [outProtocol writeFieldStop];
  [outProtocol writeStructEnd];
}

- (NSString *) description {
  NSMutableString * ms = [NSMutableString stringWithString: @"TUserException_t("];
  [ms appendString: @"errorCode:"];
  [ms appendFormat: @"%i", __errorCode];
  [ms appendString: @",param:"];
  [ms appendFormat: @"\"%@\"", __param];
  [ms appendString: @")"];
  return [NSString stringWithString: ms];
}

@end

@implementation TNotFoundException_t

- (id) init
{
  return [super initWithName: @"TNotFoundException_t" reason: @"unknown" userInfo: nil];
}

- (id) initWithIdentifier: (NSString *) identifier key: (NSString *) key
{
  self = [self init];
  __identifier = [identifier retain_stub];
  __identifier_isset = YES;
  __key = [key retain_stub];
  __key_isset = YES;
  return self;
}

- (id) initWithCoder: (NSCoder *) decoder
{
  self = [super initWithCoder: decoder];
  if ([decoder containsValueForKey: @"identifier"])
  {
    __identifier = [[decoder decodeObjectForKey: @"identifier"] retain_stub];
    __identifier_isset = YES;
  }
  if ([decoder containsValueForKey: @"key"])
  {
    __key = [[decoder decodeObjectForKey: @"key"] retain_stub];
    __key_isset = YES;
  }
  return self;
}

- (void) encodeWithCoder: (NSCoder *) encoder
{
  [super encodeWithCoder: encoder];
  if (__identifier_isset)
  {
    [encoder encodeObject: __identifier forKey: @"identifier"];
  }
  if (__key_isset)
  {
    [encoder encodeObject: __key forKey: @"key"];
  }
}

- (void) dealloc
{
  [__identifier release_stub];
  [__key release_stub];
  [super dealloc_stub];
}

- (NSString *) identifier {
  return [[__identifier retain_stub] autorelease_stub];
}

- (void) setIdentifier: (NSString *) identifier {
  [identifier retain_stub];
  [__identifier release_stub];
  __identifier = identifier;
  __identifier_isset = YES;
}

- (BOOL) identifierIsSet {
  return __identifier_isset;
}

- (void) unsetIdentifier {
  [__identifier release_stub];
  __identifier = nil;
  __identifier_isset = NO;
}

- (NSString *) key {
  return [[__key retain_stub] autorelease_stub];
}

- (void) setKey: (NSString *) key {
  [key retain_stub];
  [__key release_stub];
  __key = key;
  __key_isset = YES;
}

- (BOOL) keyIsSet {
  return __key_isset;
}

- (void) unsetKey {
  [__key release_stub];
  __key = nil;
  __key_isset = NO;
}

- (void) read: (id <TProtocol>) inProtocol
{
  NSString * fieldName;
  int fieldType;
  int fieldID;

  [inProtocol readStructBeginReturningName: NULL];
  while (true)
  {
    [inProtocol readFieldBeginReturningName: &fieldName type: &fieldType fieldID: &fieldID];
    if (fieldType == TType_STOP) { 
      break;
    }
    switch (fieldID)
    {
      case 1:
        if (fieldType == TType_STRING) {
          NSString * fieldValue = [inProtocol readString];
          [self setIdentifier: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      case 2:
        if (fieldType == TType_STRING) {
          NSString * fieldValue = [inProtocol readString];
          [self setKey: fieldValue];
        } else { 
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      default:
        [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        break;
    }
    [inProtocol readFieldEnd];
  }
  [inProtocol readStructEnd];
}

- (void) write: (id <TProtocol>) outProtocol {
  [outProtocol writeStructBeginWithName: @"TNotFoundException_t"];
  if (__identifier_isset) {
    if (__identifier != nil) {
      [outProtocol writeFieldBeginWithName: @"identifier" type: TType_STRING fieldID: 1];
      [outProtocol writeString: __identifier];
      [outProtocol writeFieldEnd];
    }
  }
  if (__key_isset) {
    if (__key != nil) {
      [outProtocol writeFieldBeginWithName: @"key" type: TType_STRING fieldID: 2];
      [outProtocol writeString: __key];
      [outProtocol writeFieldEnd];
    }
  }
  [outProtocol writeFieldStop];
  [outProtocol writeStructEnd];
}

- (NSString *) description {
  NSMutableString * ms = [NSMutableString stringWithString: @"TNotFoundException_t("];
  [ms appendString: @"identifier:"];
  [ms appendFormat: @"\"%@\"", __identifier];
  [ms appendString: @",key:"];
  [ms appendFormat: @"\"%@\"", __key];
  [ms appendString: @")"];
  return [NSString stringWithString: ms];
}

@end


@implementation ErrorConstants
+ (void) initialize {
}
@end
