package cloud.rehlat.steps.discount_codes;


import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.discount_codes.JazeeraairwaysPage;
import cloud.rehlat.pages.discount_codes.MayaislandairPage;
import cloud.rehlat.pages.discount_codes.emiratesPage;

public class MayaislandairSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	MayaislandairPage mayaislandairPage = null;

	
	@When("^I can go to Mayaislandair Page$")
	public void i_can_go_to_emiratepage() throws Throwable {
		mayaislandairPage=new MayaislandairPage(driver);
		mayaislandairPage.getValues();
		//mayaislandairPage.searchResults();
		
	}

}
