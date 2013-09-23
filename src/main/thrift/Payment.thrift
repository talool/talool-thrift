########################################################
#
# Talool Activity API Objects
#
########################################################

namespace java com.talool.api.thrift

include "Core.thrift"

struct Card_t {
  1: required string accountNumber,
  2: required string expirationMonth,
  3: required string expirationYear,
  4: optional string securityCode,
  5: optional string zipCode;
}

struct PaymentDetail_t {
  1: required bool encryptedFields,
  2: required Card_t card,
  3: optional map<string,string> paymentMetadata,
  4: optional bool saveCard;
}

struct TransactionResult_t {
  1: required bool success,
  2: optional string message;
 }

