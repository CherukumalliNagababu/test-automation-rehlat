package cloud.rehlat.steps.Trips;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.Trips.RoundTripPage;

public class RoundTripSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	RoundTripPage roundTripPage = null;

	
	
	
	
	@When("^I go to select Round Radio button$")
	public void i_go_to_select_round() throws Throwable {
		FlightNavigation=new FlightNavigation(driver);
		roundTripPage = FlightNavigation.clickRound();
		Thread.sleep(2000);
	}

	@When("^I can enter From and To city names RoundTrip$")
	public void i_can_enter_from_and_to_city_names_roundtrip(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		roundTripPage.enterFromAndToCityNames(dataMap);

	}

	@When("^I can select date and traveller information RoundTrip$")
	public void i_can_select_date_and_traveller_details_roundtrip(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		roundTripPage.selectmonth();
		roundTripPage.selectDate();
		roundTripPage.selectmonth1();
		roundTripPage.selectDate1();
		roundTripPage.selectTravellerDetails(dataMap);
		roundTripPage.clickSearch();

	}
	/*
	 * @When("^I can verify text and select the filter$") public void
	 * i_can_verify_text_and_select_filter() throws Throwable {
	 * OneWayTripPage.verifyText(); OneWayTripPage.filter("Low to high");
	 * 
	 * }
	 */

}
