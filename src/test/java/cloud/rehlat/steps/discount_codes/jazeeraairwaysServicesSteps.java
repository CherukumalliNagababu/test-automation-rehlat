package cloud.rehlat.steps.discount_codes;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;

import cloud.rehlat.pages.discount_codes.jazeeraairwaysServicesPage;
public class jazeeraairwaysServicesSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	jazeeraairwaysServicesPage jazeeraairwaysServicesPage = null;

	
	@When("^I can go to jazeeraairwaysServicesPage Page$")
	public void i_can_go_to_jazeeraairwaysServicesPage() throws Throwable {

		jazeeraairwaysServicesPage = FlightNavigation.getTextOf();
		Thread.sleep(2000);
	}
	

}
