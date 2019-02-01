#src/test/resources/features/flight/english/SelectAirline.feature
Feature: Select Particulat Airline functionality on Flights 
 
    
Background:
    Given I am on login page of Flights
@flight_healthcheck 
Scenario Outline: Validate if the user can select Particular Airline
     When I go to Rehlat Home page
     When I go to select Round Radio button
     When I can enter From and To city names RoundTrip
     |fromCity      |<fromCity>|
     |toCity        |<toCity>|
     When I can select date and traveller information RoundTrip
     |adults|<adults>|
     |childs|<childs>|
     |infant|<infant>|
     When I can verify text and select the filter Airlines
     When I can verify price details in flightdetails Pop up page Airlines
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
    |selectCard	|fromCity   |toCity |adults|childs|infant|addOnBaggage|CouponCodeStatus|EnterCoupon|
    |CreditCard|DXB        |HYD    |1      |0    | 0    |NO            |NO              |      |
    |CreditCard|DXB        |HYD    |1      |1    | 1    |NO            |NO              |      |
    |CreditCard|DXB        |HYD   |2      |1    | 1    |NO            |NO              |      |
    |CreditCard|DXB        |HYD    |2      |1    | 2    |NO            |NO              |      |
    |CreditCard|DXB        |HYD    |3      |1    | 2    |NO            |NO              |      |
    |CreditCard|DXB        |HYD    |3      |2    | 2    |NO            |NO              |      |
    |CreditCard|DXB        |HYD    |3      |2    | 2    |NO            |NO              |      |
	|CreditCard|DXB        |HYD    |3      |3    | 2    |NO            |NO              |      |
	|CreditCard|DXB        |HYD    |3      |3    | 3    |NO            |NO              |      |
	|CreditCard|DXB        |HYD    |4      |2    | 2    |NO            |NO              |      |
	|CreditCard|DXB        |HYD    |4      |3    | 1    |NO            |NO              |      |
	|CreditCard|DXB        |HYD    |4      |4    | 1    |NO            |NO              |      |