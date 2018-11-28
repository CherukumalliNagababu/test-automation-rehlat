#src/test/resources/features/flight/english/PRD/MultiCityAllDomains.feature
Feature: MultiCity All Domains functionality - PRD
 
	
Background:
	Given I am on login page of Flights
	

@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in MultiCity Trip for COM Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select MultiCity Radio button
     When I can enter From and To city names MultiCityTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     |fromCity1		|<fromCity1>|
     |toCity1		|<toCity1>|
     When I can select date and traveller information MultiCityTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Multi city
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
	|userRole|environment	|fromCity	|toCity	|fromCity1  |toCity1 |adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|COM	|PRD	|LON		|HYD	|HYD        |LON     |2		|1	  | 1    |NO			|NO              |		|
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in MultiCity Trip for SA Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select MultiCity Radio button
     When I can enter From and To city names MultiCityTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     |fromCity1		|<fromCity1>|
     |toCity1		|<toCity1>|
     When I can select date and traveller information MultiCityTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Multi city
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
	|userRole|environment	|fromCity	|toCity	|fromCity1  |toCity1 |adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|COM	|PRD	|LON		|HYD	|HYD        |LON     |2		|1	  | 1    |NO			|NO              |		|
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in MultiCity Trip for AE Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select MultiCity Radio button
     When I can enter From and To city names MultiCityTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     |fromCity1		|<fromCity1>|
     |toCity1		|<toCity1>|
     When I can select date and traveller information MultiCityTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Multi city
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
	|userRole|environment	|fromCity	|toCity	|fromCity1  |toCity1 |adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|AE			|PRD	|LON		|HYD	|HYD        |LON     |2		|1	  | 1    |NO			|NO              |		|
	
	@flight_healthcheck
Scenario Outline: Validate if the user can sigh-in gmail account and book the ticket in MultiCity Trip for EG Domain
	 When I am launching the url 
	 |userRole|<userRole>|
	  |environment|<environment>|
	 When I go to signUp button
	 When I go to login gmail account
     When I go to select MultiCity Radio button
     When I can enter From and To city names MultiCityTrip
     |fromCity		|<fromCity>|
     |toCity		|<toCity>|
     |fromCity1		|<fromCity1>|
     |toCity1		|<toCity1>|
     When I can select date and traveller information MultiCityTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter
     When I can verify price details in flightdetails Pop up page in Multi city
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
	|userRole|environment	|fromCity	|toCity	|fromCity1  |toCity1 |adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
	|EG		|PRD	|LON		|HYD	|HYD        |LON     |2		|1	  | 1    |NO			|NO              |		|