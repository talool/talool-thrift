########################################################
#
# Talool Core API Objects
#
########################################################

namespace java com.talool.api.thrift

typedef i64 Timestamp

const string METRIC_TOTAL_MERCHANTS = 'TotalMerchants'
const string METRIC_TOTAL_REDEMPTIONS = 'TotalRedemptions'
const string METRIC_TOTAL_DEALS = 'TotalDeals'
const string METRIC_TOTAL_ACQUIRES = 'TotalAcquires'

enum Sex_t { M,F,U }

enum SocialNetwork_t { Facebook, Twitter, Pinterest }

enum AcquireStatus_t {PURCHASED, REDEEMED, REJECTED_CUSTOMER_SHARE, REJECTED_MERCHANT_SHARE, 
 ACCEPTED_MERCHANT_SHARE, ACCEPTED_CUSTOMER_SHARE, PENDING_ACCEPT_MERCHANT_SHARE, PENDING_ACCEPT_CUSTOMER_SHARE }

enum DealType_t { PAID_BOOK, FREE_BOOK, PAID_DEAL, FREE_DEAL }

enum GiftStatus_t { PENDING, ACCEPTED, REJECTED, INVALIDATED }

exception ServiceException_t {
  1: required i32 errorCode,
  2: required string errorDesc
}


struct Category_t {
  1: required i32 categoryId;
  2: required string name;
}

struct Location_t {
  1: required double longitude;
  2: required double latitude;
}

struct SocialNetworkDetail_t {
  1: required SocialNetwork_t socalNetwork;
  2: required string name;
  3: required string website;
  4: optional string apiUrl;
}

struct SocialAccount_t {
  1: required SocialNetwork_t socialNetwork;
  2: required string loginId;
  20: optional Timestamp created;
}

struct Address_t {
  1: required string address1;
  2: optional string address2;
  3: required string city;
  4: required string stateProvinceCounty;
  6: optional string zip;
  7: optional string country;
}

struct MerchantLocation_t {
  1: optional i64 locationId;
  2: optional string name;
  3: optional string email;
  4: optional string websiteUrl;
  5: optional string logoUrl;
  6: optional string merchantImageUrl;
  7: optional string phone;
  8: optional Location_t location;
  9: required Address_t address;
  10: optional double distanceInMeters;
}

struct Customer_t {
  1: optional string customerId;
  2: required string firstName;
  3: required string lastName;
  4: required string email;
  6: optional Sex_t sex;
  7: optional Timestamp birthDate;
  8: optional map<SocialNetwork_t,SocialAccount_t> socialAccounts;
  9: optional Timestamp created;
  10: optional Timestamp updated;
}

struct Token_t {
 1: required string accountId;
 2: required string email;
 3: required Timestamp expires;
}

struct Merchant_t {
  1: optional string merchantId;
  2: required string name;
  3: optional Category_t category;
  4: optional list<MerchantLocation_t> locations;
}

struct Deal_t {
  1: required string dealId;
  2: required Merchant_t merchant;
  3: optional string dealOfferId;
  4: required string title;
  5: required string summary;
  6: optional string details;
  7: optional string code;
  8: optional string imageUrl;
  9: optional Timestamp expires;
  10: optional Timestamp created;
  11: optional Timestamp updated;
}

struct DealOffer_t {
  1: required string dealOfferId;
  2: required Merchant_t merchant;
  3: required DealType_t dealType;
  4: required string title;
  5: optional string summary;
  6: optional string code;
  7: optional string imageUrl;
  8: optional string locationName;
  9: optional double price;
  10: optional Timestamp expires;
  11: optional string dealOfferMerchantLogo;
  12: optional string dealOfferBackgroundImage;
  13: optional map<string,string> properties;
}

struct SearchOptions_t {
  1: required bool ascending;
  2: required string sortProperty;
  3: required i32 maxResults;
  4: required i32 page;
}

struct GiftDetail_t {
  1: required string giftId;
  2: required Timestamp giftedTime;
  3: optional string fromName;
  4: optional string fromEmail;
  5: optional string toName;
  6: optional string toEmail;
}

struct DealAcquire_t {
  1: optional string dealAcquireId;
  2: required Deal_t deal;
  3: optional AcquireStatus_t status; 
  5: optional Timestamp redeemed;
  6: optional Timestamp created;
  7: optional Timestamp updated;
  8: optional string redemptionCode;
  9: optional GiftDetail_t giftDetail;
}

struct Gift_t {
  1: required string giftId;
  2: required Deal_t deal;
  3: required Customer_t fromCustomer; 
  4: required Timestamp created;
  5: optional GiftStatus_t giftStatus;
}

struct DealOfferGeoSummary_t {
  1: required DealOffer_t dealOffer;
  2: optional double distanceInMeters;
  3: optional double closestMerchantInMeters;
  4: optional map<string,double> doubleMetrics;
  5: optional map<string,i64> longMetrics;
}







