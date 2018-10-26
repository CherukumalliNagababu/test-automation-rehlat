package cloud.rehlat.steps.callcenter;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.callcenter.ConfirmationPendingPage;

public class ConfirmationPendingSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	ConfirmationPendingPage confirmationPendingPage = null;

	
	@When("^I can go to call center Page$")
	public void i_can_go_to_call_center() throws Throwable {

		
		confirmationPendingPage=FlightNavigation.chkTextBox();
		
	}
	
	@When("^I can login and validate the confirmation pending status$")
	public void i_can_login_and_validate_the_confirmation_pending_status() throws Throwable {

		
		confirmationPendingPage.confirmationReports_com();
		confirmationPendingPage.confirmationReports_SA();
		confirmationPendingPage.confirmationReports_AE();
		confirmationPendingPage.confirmationReports_EG();
		confirmationPendingPage.mailGenaration();
		
	}

}
