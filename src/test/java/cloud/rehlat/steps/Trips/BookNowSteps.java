package cloud.rehlat.steps.Trips;

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
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class BookNowSteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	BookNowPage BookNowPage = null;

	@When("^I can verify text and select the filter$")
	public void i_can_verify_text_and_select_filter() throws Throwable {
		BookNowPage=FlightNavigation.clickAllReset();
		BookNowPage.filter("Low to high");
		
	}
	@When("^I can verify price details in flightdetails Pop up page$")
	public void i_can_verify_price_details_in_flight_details_popUp_page() throws Throwable {
		
		BookNowPage.flightDetailsPopUp();
		BookNowPage.clickOnPopUpClose();
		BookNowPage.numberOfFlights();
		BookNowPage.clickOnBookNow();
		
	}


}
