package cloud.rehlat.steps.Trips.Arabic;

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
import cloud.rehlat.pages.engine.arabic.FlightNavigationArabic;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.steps.engine.arabic.FlightLoginStepsArabic;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.Arabic.OneWayTripArabicPage;

public class OneWayTripArabicSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigationArabic FlightNavigationArabic = FlightLoginStepsArabic.FlightNavigationArabic;
	OneWayTripArabicPage OneWayTripArabicPage = null;

	@When("^I go to select OneWay Arabic Radio button$")
	public void i_go_to_select_oneway_Arabic() throws Throwable {

		OneWayTripArabicPage = FlightNavigationArabic.clickOneWayArabic();
		Thread.sleep(2000);
	}

	@When("^I can enter Arabic From and To city names$")
	public void i_can_enter_Arabic_from_and_to_city_names(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		OneWayTripArabicPage.enterFromCityAndToCity(dataMap);

	}

	@When("^I can select Arabic date and traveller information$")
	public void i_can_select_Arabic_date_and_traveller_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		OneWayTripArabicPage.selectmonth();
		OneWayTripArabicPage.selectDate();
		OneWayTripArabicPage.selectTravellerDetails(dataMap);
		OneWayTripArabicPage.clickSearch();

	}
	/*
	 * @When("^I can verify text and select the filter$") public void
	 * i_can_verify_text_and_select_filter() throws Throwable {
	 * OneWayTripPage.verifyText(); OneWayTripPage.filter("Low to high");
	 * 
	 * }
	 */

}
