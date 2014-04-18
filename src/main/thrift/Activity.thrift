########################################################
#
# Talool Activity API Objects
#
########################################################

namespace java com.talool.api.thrift

include "Core.thrift"

enum ActivityEvent_t {
UNKNOWN,
WELCOME, 
PURCHASE,
REDEEM,
REJECT_GIFT,
FACEBOOK_RECV_GIFT,
FACEBOOK_SEND_GIFT,
EMAIL_RECV_GIFT,
EMAIL_SEND_GIFT,
FRIEND_GIFT_ACCEPT,
FRIEND_GIFT_REJECT,
FRIEND_GIFT_REDEEM,
FRIEND_PURCHASE_DEAL_OFFER,
MERCHANT_REACH,
TALOOL_REACH,
AD,
FUNDRAISER_SUPPORT
}

enum LinkType { MERCHANT, DEAL, DEAL_OFFER, GIFT, CUSTOMER, DEAL_ACQUIRE, MERCHANT_LOCATION, EXTERNAL, EMAIL } 

struct ActivityLink_t {
   1: required LinkType linkType;
   2: required string linkElement;
   3: optional map<string,string> properties;
}

struct Activity_t {
  1: optional string activityId;
  2: required Core.Timestamp activityDate;
  3: optional string title;
  4: optional string subtitle;
  5: optional string icon;
  6: optional ActivityLink_t activityLink;
  7: optional ActivityEvent_t activityEvent;
  8: optional bool actionTaken = false;
}


