package cloud.rehlat.steps.discount_codes;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.discount_codes.AirarabiaAirwaysPage;
import cloud.rehlat.pages.discount_codes.PegasusPage;

public class PegasusSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	PegasusPage pegasusPage = null;

	
	@When("^I can go to pegasusPage and Get From And to city Names$")
	public void i_can_go_to_pegasusPage_and_get_from_and_to_city_names() throws Throwable {
		pegasusPage=new PegasusPage(driver);
		pegasusPage.getValues();
		pegasusPage.getResults();
		
	}
}