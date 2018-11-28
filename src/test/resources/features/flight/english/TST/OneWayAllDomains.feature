#src/test/resources/features/flight/english/PRD/OneWayAllDomains.feature
Feature: Oneway Trip All Domains functionality - TST
	
Background:
	Given I am on login page of Flights
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in OneWay Trip for COM Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	
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
    Examples:
	|userRole|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|COM	|TST	|JED		|CAI	|2		|2	  | 2    |NO			|Yes              |MARHABA		|
	
@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in OneWay Trip for SA Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	 |environment|<environment>|
	 
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
    Examples:
	|userRole|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|SA		|TST	|JED		|CAI	|2		|2	  | 2    |NO			|Yes              |MARHABA		|
	
	
@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in OneWay Trip for AE Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	 |environment|<environment>|
	
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
    Examples:
	|userRole|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|AE		|TST	|JED		|CAI	|2		|2	  | 2    |NO			|Yes              |MARHABA		|
	
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in OneWay Trip for EG Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	 |environment|<environment>|
	 
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
    Examples:
	|userRole|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|EG		|TST	|JED		|CAI	|2		|2	  | 2    |NO			|Yes              |MARHABA		|