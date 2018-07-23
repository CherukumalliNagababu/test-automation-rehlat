#src/test/resources/features/flight/english/RegisterAccounts.feature
Feature: Test Register functionality
  
	
Background:
	Given I am on login page of Flights
@flight_healthcheck
Scenario Outline: Validate if the user have create Register account successfully
	  When I go to Rehlat Home page
	 When I go to register page
	 When I create multiple register accounts
	 |numberOfAccountsCreated|<numberOfAccountsCreated>|
	 
	 Examples:
	|numberOfAccountsCreated|
	|	0					|