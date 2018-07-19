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
import cloud.rehlat.constants.engine.EngineConstants;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class OneWayTripSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	OneWayTripPage OneWayTripPage = null;

	
	
	
	
	@When("^I go to select OneWay Radio button$")
	public void i_go_to_select_oneway() throws Throwable {

		OneWayTripPage = FlightNavigation.clickOneWay();
		Thread.sleep(2000);
	}

	@When("^I can enter From and To city names$")
	public void i_can_enter_from_and_to_city_names(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		OneWayTripPage.enterFromAndToCityNames(dataMap);

	}

	@When("^I can select date and traveller information$")
	public void i_can_select_date_and_traveller_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		OneWayTripPage.selectmonth();
		OneWayTripPage.selectDate();
		OneWayTripPage.selectTravellerDetails(dataMap);
		OneWayTripPage.clickSearch();

	}
	/*
	 * @When("^I can verify text and select the filter$") public void
	 * i_can_verify_text_and_select_filter() throws Throwable {
	 * OneWayTripPage.verifyText(); OneWayTripPage.filter("Low to high");
	 * 
	 * }
	 */

}
