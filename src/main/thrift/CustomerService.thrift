########################################################
#
# Talool Customer Service API
#
########################################################
namespace java com.talool.api.thrift

include "Core.thrift"
include "Activity.thrift"

const string CTOKEN_NAME = 'ctok'

struct CTokenAccess_t {
  1: required Core.Customer_t customer,
  2: required string token;
}

service CustomerService_t {

   CTokenAccess_t createAccount(1:Core.Customer_t customer,2:string password) throws (1:Core.ServiceException_t error);
  
   CTokenAccess_t authenticate(1:string email,2:string password) throws (1:Core.ServiceException_t error);
   
   bool customerEmailExists(1:string email) throws (1:Core.ServiceException_t error);
     
   void addSocialAccount(1:Core.SocialAccount_t socialAccount) throws (1:Core.ServiceException_t error);
   
   void removeSocialAccount(1:Core.SocialNetwork_t socialNetwork) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getMerchantAcquires(1:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
   
   list<Core.Merchant_t> getMerchantAcquiresByCategory(1:i32 categoryId,2:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
      
   list<Core.DealAcquire_t> getDealAcquires(1:string merchantId,2:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
      
   string redeem(1:string dealAcquireId,2:Core.Location_t location) throws (1:Core.ServiceException_t error);
   
   list<Core.DealOffer_t> getDealOffers() throws (1:Core.ServiceException_t error);
   
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
   
   list<Core.Gift_t> getGifts() throws (1:Core.ServiceException_t error);
   
   void acceptGift(1:string giftId) throws (1:Core.ServiceException_t error);
   
   void rejectGift(1:string giftId) throws (1:Core.ServiceException_t error);
   
   # activities
   list<Activity.Activity_t> getActivities(1:Core.SearchOptions_t searchOptions) throws (1:Core.ServiceException_t error);
   
   
   

}