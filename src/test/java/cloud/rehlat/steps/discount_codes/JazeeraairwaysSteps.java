package cloud.rehlat.steps.discount_codes;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.discount_codes.JazeeraairwaysPage;

public class JazeeraairwaysSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	JazeeraairwaysPage jazeeraairwaysPage = null;

	
	@When("^I can go to jazeeraairways Page$")
	public void i_can_go_to_jazeeraairways() throws Throwable {

		jazeeraairwaysPage = FlightNavigation.clickOneWayjazeera();
		Thread.sleep(2000);
	}
	
	@When("^I can search the results$")
	public void i_can_search_the_results() throws Throwable {

		jazeeraairwaysPage.searchResults();
		Thread.sleep(2000);
	}
	

}
