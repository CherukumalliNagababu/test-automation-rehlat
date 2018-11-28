#src/test/resources/features/flight/english/HomepageLinks.feature
Feature: HomepageLinks functionality
 
	Background:
	Given I am on login page of Flights
@flight_healthcheck
Scenario Outline: Validate if the user can verify the links
	 When I go to Rehlat Home page
	 When I can validate the top left side links
	 When I can validate the top Right side links
    
     
     Examples:
     |User|
     |**|