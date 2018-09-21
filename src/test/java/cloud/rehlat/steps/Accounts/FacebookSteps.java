package cloud.rehlat.steps.Accounts;

import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.Accounts.FacebookPage;
import cloud.rehlat.pages.engine.FlightNavigation;

import cloud.rehlat.steps.engine.FlightLoginSteps;
public class FacebookSteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	FacebookPage facebookPage = null;

	/*@When("^I go to facebook account$")
	public void i_go_to_Admin_main_menu() throws Throwable {
		FacebookPage=FlightNavigation.clickgmail();
		Thread.sleep(2000);
	}*/

	
	@When("^I go to login facebook account$")
	public void i_go_to_login_facebook_account() throws Throwable {
		
		facebookPage=FlightNavigation.clickfacebook();
		facebookPage.enterFacebookCredentials();
	}
	
}
