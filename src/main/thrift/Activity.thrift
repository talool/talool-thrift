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
AD
}

enum LinkType { MERCHANT, DEAL, DEAL_OFFER, GIFT, CUSTOMER, DEAL_ACQUIRE, MERCHANT_LOCATION, EXTERNAL } 

struct ActivityLink_t {
   1: required LinkType linkType;
   2: required string linkElement;
}

struct Activity_t {
  1: required Core.Timestamp activityDate;
  2: optional string title;
  3: optional string subtitle;
  4: optional string icon;
  5: optional ActivityLink_t activityLink;
  6: optional ActivityEvent_t activityEvent;
  7: optional bool closedState;
}


