#src/test/resources/features/flight/english/ForgotPwd.feature
Feature: forgotpassword functionality
  As a User to be able to use Flights functionality
  I want to be able to successfully login to Flights
	
Background:
	Given I am on login page of Flights

@flight_healthcheck 
Scenario Outline: Validate if the user can forgotpassword
	 When I go to Rehlat Home page
	 Then I can navigative to SignIn page
	 And I can enter the email and featch the OTP Through Mail
	 When I can enter password details and click on login
	 Then I can logout the account
     
     
     Examples:
     |User|
     |**|