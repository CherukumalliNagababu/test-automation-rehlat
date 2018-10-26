package cloud.rehlat.steps.discount_codes;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.discount_codes.AirarabiaAirwaysPage;

public class AirarabiaAirlinesSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	AirarabiaAirwaysPage airarabiaAirwaysPage = null;

	
	@When("^I can go to Airarabiaairways Page$")
	public void i_can_go_to_airarabiaairways() throws Throwable {

		airarabiaAirwaysPage = FlightNavigation.clickOneWayAirarabia();
		Thread.sleep(2000);
	}
	
	@When("^I can search the results airarabia$")
	public void i_can_search_the_results_airarabia() throws Throwable {

		airarabiaAirwaysPage.numOfCountries();
		airarabiaAirwaysPage.getResults();
		Thread.sleep(2000);
	}
	

}
