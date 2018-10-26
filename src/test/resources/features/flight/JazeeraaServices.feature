#src/test/resources/features/flight/jazeeraaServices.feature
Feature: Jazeeraa functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Jazeera Services Home page
     And I can go to jazeeraairwaysServicesPage Page
    
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|
