#src/test/resources/features/flight/emirates.feature
Feature: emirates functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I can go to emirate Page
     
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|
