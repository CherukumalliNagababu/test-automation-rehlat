#src/test/resources/features/flight/jazeeraa.feature
Feature: Jazeeraa functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Jazeera Home page
     And I can go to jazeeraairways Page
     Then I can search the results
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|
