#src/test/resources/features/callCenter/ConfirmationPending.feature
Feature: AirArabia functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to call center Home page
     And I can go to call center Page 
     Then I can login and validate the confirmation pending status
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|