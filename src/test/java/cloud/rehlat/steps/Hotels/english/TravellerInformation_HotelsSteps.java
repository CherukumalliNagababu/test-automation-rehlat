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
import cloud.rehlat.pages.Hotels.english.TravellerInformation_HotelsPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class TravellerInformation_HotelsSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	TravellerInformation_HotelsPage travellerInformation_HotelsPage = null;
	
	
	@When("^I can enter hotel Traveller details$")
	public void i_can_enter_hotel_Traveller_details(DataTable dataTable) throws Throwable {
		travellerInformation_HotelsPage=new TravellerInformation_HotelsPage(driver);
		Map<String, String> dataMap = getDataAsMap(dataTable);
		travellerInformation_HotelsPage.adultDetails(dataMap);
		
	}

}
