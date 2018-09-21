#src/test/resources/features/flight/discounts.feature
Feature: Guest user functionality on Flights 
  As a User to be able to use Flights functionality
  I want to be able to successfully login to Flights
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can book OneWay Trip
	 When I go to Rehlat Home page
     And I go to select OneWay Radio button using for discounts
     When I can enter From and To city names using excel sheet
     
     
     Examples:
	|userName	|passWord	|
	|******		|****** 	|
	