package cloud.rehlat.steps.Trips;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.Trips.MultiCityPage;

public class MultiCitySteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	MultiCityPage multiCityPage = null;

	
	
	
	
	@When("^I go to select MultiCity Radio button$")
	public void i_go_to_select_multicity() throws Throwable {
		FlightNavigation=new FlightNavigation(driver);
		multiCityPage = FlightNavigation.clickMutliCity();
		Thread.sleep(2000);
	}

	@When("^I can enter From and To city names MultiCityTrip$")
	public void i_can_enter_from_and_to_city_names_multicitytrip(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		multiCityPage.enterFromAndToCityNames(dataMap);

	}

	@When("^I can select date and traveller information MultiCityTrip$")
	public void i_can_select_date_and_traveller_details_multicitytrip(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
	/*	multiCityPage.selectmonth();
		multiCityPage.selectDate();
		multiCityPage.selectmonth1();
		multiCityPage.selectDate1();*/
		multiCityPage.selectTravellerDetails(dataMap);
		multiCityPage.clickSearch();

	}
	

}
