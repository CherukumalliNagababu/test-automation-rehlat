#src/test/resources/features/flight/Pegasus.feature
Feature: Pegasus functonality
 
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: get the From And To city Names in Pegasus Airline
	 When I can go to pegasusPage and Get From And to city Names
    
    
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|