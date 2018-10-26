#src/test/resources/features/hotels/english/GuestUser.feature
Feature: Guest user functionality on Hotels 
  
	
Background:
	Given I am on login page of Hotels
#@flight_healthcheck
Scenario Outline: Validate if the user can book on Hotels
	 When I go to Rehlat Home page
     When I can click on hotel link
     When I can enter Hotel city name
     |cityName		|<cityName>|
     When I can select CheckIn Date and CheckOut Date
     When I can select the hotel traveller Details
     |rooms		|<rooms>|
     Examples:
	|userName	|cityName|rooms	|
	|******		|MCT	 |4		|
	
	
@flight_healthcheck
Scenario Outline: Validate the duplicate names
	 When I go to Rehlat Home page
     When I can click on hotel link
     When I can enter Hotel city name and verify duplicate names
     |cityName		|<cityName>|
    
     Examples:
	|userName	|cityName|
	|******		|GIA 	 |
	|******		| DME  	 |
	|******		| MUC  	 |
	|******		|  Oslo   	 |
	|******		|ParisAll  	 |
	|******		|Paris-Orly(West)  	 |
	|******		|Prag  	 |
	|******		|Pristina	 |
	|******		|Rome-Fiumicino  	 |
	|******		|Samsun  	 |
	|******		|Sanliurfa   	 |
	|******		|Sarajevo  	 |
	|******		|Sinop  	 |
	|******		|Sivas  	 |
	