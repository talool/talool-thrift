########################################################

namespace java com.talool.api.thrift

enum ErrorCode_t {
	UNKNOWN=0,
	VALID_EMAIL_REQUIRED=100,
	PASS_REQUIRED=101,
    PASS_CONFIRM_MUST_MATCH=102,
	PASS_RESET_CODE_REQUIRED=103,
	PASS_RESET_CODE_EXPIRED=104,
	PASS_RESET_CODE_INVALID=105,
	EMAIL_ALREADY_TAKEN=1000,
	INVALID_USERNAME_OR_PASSWORD=1001,
	CUSTOMER_DOES_NOT_OWN_DEAL=1002,
	DEAL_ALREADY_REDEEMED=1003,
	GIFTING_NOT_ALLOWED1=1004,
	CUSTOMER_NOT_FOUND=1005,
	EMAIL_REQUIRED=1006,
	MAIL_TEMPLATE_NOT_FOUND=2004,
	ACTIVIATION_CODE_NOT_FOUND=3000,
	ACTIVIATION_CODE_ALREADY_ACTIVATED=3001
}

exception TServiceException_t {
  1: required ErrorCode_t errorCode,
  2: optional string message;
}

exception TUserException_t {
  1: required ErrorCode_t errorCode,
  2: optional string param;
}

exception TNotFoundException_t {
  1: required string identifier,
  2: required string key;
}

