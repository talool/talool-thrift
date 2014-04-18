########################################################
#
# Talool Customer Service API
#
########################################################
namespace java com.talool.api.thrift

include "Error.thrift"
include "Core.thrift"
include "Activity.thrift"
include "Payment.thrift"

const string CTOKEN_NAME = 'ctok'

struct CTokenAccess_t {
  1: required Core.Customer_t customer,
  2: required string token;
}

struct CTokenAccessResponse_t {
  1: optional CTokenAccess_t tokenAccess;
}

struct DealOfferGeoSummariesResponse_t {
  1: optional list<Core.DealOfferGeoSummary_t> dealOfferGeoSummaries;
  2: required bool fallbackResponse;
}

struct MerchantsResponse_t {
  1: optional list<Core.Merchant_t> merchants;
}

struct ValidateCodeResponse_t {
  1: required bool valid;
  2: optional string codeType;
}

struct EmailBodyResponse_t {
  1: optional string emailBody;
}

service CustomerService_t {

   CTokenAccess_t createAccount(1:Core.Customer_t customer,2:string password) throws (1:Core.ServiceException_t error);
  
   CTokenAccess_t authenticate(1:string email,2:string password) throws (1:Core.ServiceException_t error);
   
   bool customerEmailExists(1:string email) throws (1:Core.ServiceException_t error);
     
   void addSocialAccount(1:Core.SocialAccount_t socialAccount) throws (1:Core.ServiceException_t error);
   
   void removeSocialAccount(1:Core.SocialNetwork_t socialNetwork) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getMerchantAcquires(1:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getMerchantAcquiresWithLocation(1:Core.SearchOptions_t searchOptions,2:Core.Location_t location) throws (1:Core.ServiceException_t error);
    
   list<Core.Merchant_t> getMerchantAcquiresByCategory(1:i32 categoryId,2:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
      
   list<Core.DealAcquire_t> getDealAcquires(1:string merchantId,2:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
      
   string redeem(1:string dealAcquireId,2:Core.Location_t location) throws (1:Core.ServiceException_t error);
   
   list<Core.DealOffer_t> getDealOffers() throws (1:Core.ServiceException_t error);
  
   void activateCode(1:string dealOfferid, 2:string code) throws (1:Core.ServiceException_t error);
   
   Core.DealOffer_t getDealOffer(1:string dealOfferId) throws (1:Core.ServiceException_t error);
   
   list<Core.Deal_t> getDealsByDealOfferId(1:string dealOfferId,2:Core.SearchOptions_t searchOptions) 
    throws (1:Core.ServiceException_t error);
   
   void purchaseDealOffer(1:string dealOfferId) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getMerchantsWithin(1:Core.Location_t location, 2:i32 maxMiles, 
   											3:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);

   void addFavoriteMerchant(1:string merchantId) throws (1:Core.ServiceException_t error);
   
   void removeFavoriteMerchant(1:string merchantId) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getFavoriteMerchants(1:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);

   list<Core.Category_t> getCategories() throws (1:Core.ServiceException_t error);
   
   # Gift methods
   
   string giftToFacebook(1:string dealAcquireId,2:string facebookId,3:string receipientName) throws (1:Core.ServiceException_t error);
   
   string giftToEmail(1:string dealAcquireId,2:string email,3:string receipientName) throws (1:Core.ServiceException_t error);
   
   Core.Gift_t getGift(1:string giftId) throws (1:Core.ServiceException_t error);
   
   Core.DealAcquire_t acceptGift(1:string giftId) throws (1:Core.ServiceException_t error);
   
   void rejectGift(1:string giftId) throws (1:Core.ServiceException_t error);
   
   # activities
   list<Activity.Activity_t> getActivities(1:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
   
   list<Activity.Activity_t> getMessages(1:Core.SearchOptions_t searchOptions,2:Core.Location_t location) throws (1:Core.ServiceException_t error);
      
   void activityAction(1:string activityId) throws (1:Core.ServiceException_t error);
   
   #### begin next version protocol stuff ###
   
   void sendResetPasswordEmail(1:string email) 
   	throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
   CTokenAccess_t resetPassword(1:string customerId,2:string resetPasswordCode,3:string newPassword) 
   	throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
   # purchases
   
   # deprecated purchaseByCard() and purchaseWithCard
   Payment.TransactionResult_t purchaseByCard(1:string dealOfferId, 2:Payment.PaymentDetail_t paymentDetail) 
  	 throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
    # deprecated purchaseByCode() use purchaseWithCode
   Payment.TransactionResult_t purchaseByCode(1:string dealOfferId, 2:string paymentCode) 
     throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
   CTokenAccessResponse_t loginFacebook(1:string facebookId,2:string facebookAccessToken) throws (1:Error.TServiceException_t error);
   
   DealOfferGeoSummariesResponse_t getDealOfferGeoSummariesWithin(1:Core.Location_t location, 2:i32 maxMiles, 
        3:Core.SearchOptions_t searchOptions,4:Core.SearchOptions_t fallbackSearchOptions) throws (1:Error.TServiceException_t error);
        
   MerchantsResponse_t getMerchantsByDealOfferId(1:string dealOfferId,2:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
        
   # support for merchant codes (a.k.a school codes)
   ValidateCodeResponse_t validateCode(1:string code,2:string dealOfferId) throws (1:Error.TServiceException_t error);
   
   Payment.TransactionResult_t purchaseWithCard(1:string dealOfferId,2:Payment.PaymentDetail_t paymentDetail,3:map<string,string> paymentProperties) 
  	 throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
   Payment.TransactionResult_t purchaseWithCode(1:string dealOfferId, 2:string paymentCode,3:map<string,string> paymentProperties) 
     throws (1:Error.TServiceException_t serviceException,2:Error.TUserException_t userException,3:Error.TNotFoundException_t notFoundException);
   
   EmailBodyResponse_t getEmailBody(1:string templateId, 2:string entityId) throws (1:Error.TServiceException_t error);

}