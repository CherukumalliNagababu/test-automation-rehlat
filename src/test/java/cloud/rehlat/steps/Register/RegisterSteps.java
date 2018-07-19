package cloud.rehlat.steps.Register;

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
import cloud.rehlat.constants.engine.EngineConstants;
import cloud.rehlat.pages.Register.RegisterPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class RegisterSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	RegisterPage registerPage = null;

	@When("^I go to register page$")
	public void i_go_to_register_page() throws Throwable {
		registerPage = FlightNavigation.getTextOfRegister();
	}
	@When("^I create multiple register accounts$")
	public void i_create_multiple_register_accounts(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		registerPage.createMultipleRegisterAccounts(dataMap);
		
	}
}
