#src/test/resources/features/flight/english/GuestUser.feature
Feature: Guest user functionality on Flights 
  As a User to be able to use Flights functionality
  I want to be able to successfully login to Flights
	
Background:
	Given I am on login page of Flights

#@flight_healthcheck
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Rehlat Home page
     When I go to select OneWay Radio button
     When I can enter From and To city names
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select date and traveller information
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page
     When I can verify add on check box
     |addOnBaggage|<addOnBaggage>|
     When I can enter email and coupon code and verify the show more details popUp
     |CouponCodeStatus|<CouponCodeStatus>|
     |EnterCoupon|<EnterCoupon>|
     When I can navigative to traveller Information page
     And I can enter Traveller details
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     And I can enter contact details and Click PaySecurel button
     Then I can navigative to payment page
    # And I can enter the card details
     |selectCard|<selectCard>|
    Examples:
	|userName	|selectCard	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|******		|KNET		|DXB		|MCT	|2		|1	  | 2    |NO			|NO              |		|
	
	
	@flight_healthcheck
    Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Rehlat Home page
     When I go to select OneWay Radio button
      Examples:
      |userName	|
      | ***     |
