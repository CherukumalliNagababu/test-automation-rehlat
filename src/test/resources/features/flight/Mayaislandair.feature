#src/test/resources/features/flight/Mayaislandair.feature
Feature: Mayaislandair functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I can go to Mayaislandair Page
     
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|
