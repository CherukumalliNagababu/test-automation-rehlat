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
import cloud.rehlat.pages.Trips.TravellerInformationPage;
import cloud.rehlat.pages.Trips.Arabic.TravellerInformationArabicPage;

public class TravellerInformationArabicSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigationArabic FlightNavigationArabic = FlightLoginStepsArabic.FlightNavigationArabic;
	TravellerInformationArabicPage travellerInformationArabicPage = null;

	@When("^I can navigative to traveller Information arabic page$")
	public void i_go_navigative_traveller_information_arabic_page() throws Throwable {

		travellerInformationArabicPage = FlightNavigationArabic.getTextValue();
		Thread.sleep(2000);
	}

	@When("^I can enter Traveller arabic details$")
	public void i_can_enter_Traveller_arabic_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		travellerInformationArabicPage.adultDetails(dataMap);
		travellerInformationArabicPage.childDetails(dataMap);
		travellerInformationArabicPage.infantsDetails(dataMap);
		Thread.sleep(5000);

	}

	@When("^I can enter contact details and Click PaySecurel button in arabic page$")
	public void i_can_enter_contact_details_and_click_on_paysecurely_button_in_arabic_page() throws Throwable {
		travellerInformationArabicPage.enterContactDetails();
		travellerInformationArabicPage.clickOnPaySecurely();
		
	}
	
}
