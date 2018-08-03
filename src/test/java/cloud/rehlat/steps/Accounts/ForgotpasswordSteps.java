package cloud.rehlat.steps.Accounts;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.googlecode.totallylazy.Characters.parameters;

import cloud.rehlat.pages.engine.FlightLoginPage;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.Accounts.ForgotpasswordPage;
import cloud.rehlat.pages.Accounts.GmailPage;

public class ForgotpasswordSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	ForgotpasswordPage forgotpasswordPage = null;

	@When("^I can navigative to SignIn page$")
	public void i_can_navigative_to_login_page() throws Throwable {
		forgotpasswordPage = FlightNavigation.LoginmouseOver();
		forgotpasswordPage.clickOnSignIn();
	}
	@And("^I can enter the email and featch the OTP Through Mail$")
	public void i_can_enter_email_and_get_the_otp_through_mail() throws Throwable {
		forgotpasswordPage.enterEmail();
		forgotpasswordPage.clickOnForgotPassword();
		forgotpasswordPage.verificationFor2fa();

	}
	@And("^I can enter password details and click on login$")
	public void i_can_enter_password_details_and_click_on_login() throws Throwable {
		forgotpasswordPage.enterforgotPwdDetails();
	}
	@Then("^I can logout the account$")
	public void i_can_logout_the_account() throws Throwable {
		forgotpasswordPage.LogOut();
		Thread.sleep(5000);
	}

}
