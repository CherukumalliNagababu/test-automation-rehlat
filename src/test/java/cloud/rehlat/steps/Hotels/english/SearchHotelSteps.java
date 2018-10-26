package cloud.rehlat.steps.Hotels.english;

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
import cloud.rehlat.pages.Hotels.english.SearchHotelPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class SearchHotelSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	SearchHotelPage searchHotelPage = null;
	@When("^I can click on hotel link$")
	public void i_can_click_on_hotel_link() throws Throwable {
		searchHotelPage=new SearchHotelPage(driver);
		//searchHotelPage = FlightNavigation.clickHotelLink();
		searchHotelPage.clickHotelLink();
		Thread.sleep(2000);
	}
	@When("^I can enter Hotel city name$")
	public void i_can_enter_Hotel_city_name(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		searchHotelPage.enterHotelCityName(dataMap);

	}
	@When("^I can select CheckIn Date and CheckOut Date$")
	public void i_can_select_CheckIn_date_and_CheckOut_date() throws Throwable {
		searchHotelPage.selectCheckInmonth();
		searchHotelPage.selectCheckInDate();
		searchHotelPage.selectCheckOutmonth();
		searchHotelPage.selectCheckOutDate();
	}
	@When("^I can select the hotel traveller Details$")
	public void i_can_select_the_hotel_traveller_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		boolean status=searchHotelPage.enterDetails(dataMap);
		searchHotelPage.clickOnDone();
		searchHotelPage.clickOnSearch();
		Assert.assertTrue("HOTEL: ERROR OCCURRED WHILE ENTERING THE TRAVELLER DETAILS -> HOTEL SEARCH PAGE", status);
	}

	
	@When("^I can enter Hotel city name and verify duplicate names$")
	public void i_can_enter_Hotel_city_name_and_verify_duplicate_names(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		searchHotelPage.enterHotelCityName_Duplicate(dataMap);
		

	}
}
