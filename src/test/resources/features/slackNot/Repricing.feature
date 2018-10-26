#src/test/resources/features/slackNot/Repricing.feature
Feature: AirArabia functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate the repricing details
	 When I can go to call center and get the data
     And I can send repricing html report
     Examples:
	|userName	|passWord	|
	|******		|****** 	|