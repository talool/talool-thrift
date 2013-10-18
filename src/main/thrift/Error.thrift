########################################################

namespace java com.talool.api.thrift

exception TServiceException_t {
  1: required i32 errorCode,
  2: optional string message;
}

exception TUserException_t {
  1: required i32 errorCode,
  2: optional string param;
}

exception TNotFoundException_t {
  1: required string identifier,
  2: required string key;
}

