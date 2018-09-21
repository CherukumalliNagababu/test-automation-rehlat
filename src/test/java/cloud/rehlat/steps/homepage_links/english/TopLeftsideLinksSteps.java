package cloud.rehlat.steps.homepage_links.english;


import org.openqa.selenium.WebDriver;


import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.pages.homepage_links.english.TopLeftsideLinksPage;
import cloud.rehlat.steps.engine.FlightLoginSteps;


public class TopLeftsideLinksSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	TopLeftsideLinksPage topLeftsideLinksPage = null;

	@When("^I can get the value$")
	public void i_can_get_the_value() throws Throwable {
		topLeftsideLinksPage = FlightNavigation.getTheText();

	}
	@When("^I can validate the top left side links$")
	public void i_can_validate_the_top_left_side_links() throws Throwable {
		topLeftsideLinksPage.checkTheLeftSideLinks();
	}
	


}
