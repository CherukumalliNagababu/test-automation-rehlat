#src/test/resources/features/flight/AirArabia.feature
Feature: AirArabia functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Airarabia Home page 
     And I can go to Airarabiaairways Page 
     Then I can search the results airarabia
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|