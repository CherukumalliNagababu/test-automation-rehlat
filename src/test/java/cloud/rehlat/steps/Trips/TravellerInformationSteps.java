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

import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.TravellerInformationPage;

public class TravellerInformationSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	TravellerInformationPage travellerInformationPage = null;

	@When("^I can navigative to traveller Information page$")
	public void i_go_navigative_traveller_information_page() throws Throwable {
		FlightNavigation=new FlightNavigation(driver);
		travellerInformationPage = FlightNavigation.getTextValue();
		Thread.sleep(2000);
	}

	@When("^I can enter Traveller details$")
	public void i_can_enter_Traveller_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		travellerInformationPage.enterContactDetails();
    	travellerInformationPage.adultDetails(dataMap);
		travellerInformationPage.childDetails_test(dataMap);
		travellerInformationPage.infantsDetails(dataMap);
		Thread.sleep(5000);

	}

	@When("^I can enter contact details and Click PaySecurel button$")
	public void i_can_enter_contact_details_and_click_on_paysecurely_button() throws Throwable {
		
		travellerInformationPage.clickOnPaySecurely();
		
	}
	@When("^I can Un_Check the Online Check-in$")
	public void i_can_un_check_the_online_check_in() throws Throwable {
		travellerInformationPage.uncheck();
		
		
	}
	
	
}
