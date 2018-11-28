#src/test/resources/features/flight/english/PRD/RoundTripAllDomains.feature
Feature: Round Trip All Domains functionality- PRD
 
	
Background:
	Given I am on login page of Flights
	

@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in Round Trip for COM Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	 |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select Round Radio button
     When I can enter From and To city names RoundTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select date and traveller information RoundTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Round Trip
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
	|COM	|PRD			|LON		|HYD	|2		|1	  | 1    |NO			|NO              |		|
	
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in Round Trip for SA Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select Round Radio button
     When I can enter From and To city names RoundTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select date and traveller information RoundTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Round Trip
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
	|userRole	|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|SA			|PRD			|LON		|HYD	|2		|1	  | 1    |NO			|NO              |		|
	
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in Round Trip for AE Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select Round Radio button
     When I can enter From and To city names RoundTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select date and traveller information RoundTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Round Trip
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
	|userRole	|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|AE			|PRD			|LON		|HYD	|2		|1	  | 1    |NO			|NO              |		|
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in Round Trip for EG Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select Round Radio button
     When I can enter From and To city names RoundTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     When I can select date and traveller information RoundTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Round Trip
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
	|userRole	|environment	|fromCity	|toCity	|adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|EG			|PRD				|LON		|HYD	|2		|1	  | 1    |NO			|NO              |		|