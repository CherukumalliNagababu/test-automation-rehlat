package cloud.rehlat.steps.Accounts;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cloud.rehlat.pages.engine.FlightLoginPage;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.Accounts.GmailPage;
public class GmailSteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	GmailPage GmailPage = null;

	/*@When("^I go to gmail account$")
	public void i_go_to_Admin_main_menu() throws Throwable {
		GmailPage=FlightNavigation.clickgmail();
		Thread.sleep(2000);
	}*/

	
	@When("^I go to login gmail account$")
	public void i_go_to_login_gmail_account() throws Throwable {
		
		GmailPage=FlightNavigation.clickgmail();
		GmailPage.enterGmailCredentials();
	}
	
}
