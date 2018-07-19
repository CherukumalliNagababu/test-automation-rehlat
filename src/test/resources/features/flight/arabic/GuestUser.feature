#src/test/resources/features/arabic/GuestUser.feature
Feature: Test Flight login functionality
  As a User to be able to use Flights functionality
  I want to be able to successfully login to Flights
	
Background:
	Given I am on login page of Flights Arabic

@flight_healthcheck
Scenario Outline: Validate if the user for all roles can login successfully into Engine
	 When I go to Rehlat Home page arabic
     When I go to select OneWay Arabic Radio button
     When I can enter Arabic From and To city names
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select Arabic date and traveller information
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     And I can verify text and select the arabic filter
     And I can verify popUp and number of flights in current page
     And I can verify add oncheck box in arabic
      |addOnBaggage|<addOnBaggage>|
     When I can enter email and coupon code and verify the show more details popUp in Arabic
     |CouponCodeStatus|<CouponCodeStatus>|
     |EnterCoupon|<EnterCoupon>|
     When I can navigative to traveller Information arabic page
     And I can enter Traveller arabic details
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     And I can enter contact details and Click PaySecurel button in arabic page
    
    Examples:
	|userName	|passWord	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|******		|****** 	|JED		|CAI	|3		|2	  | 2    |NO			|NO              |		|
	
