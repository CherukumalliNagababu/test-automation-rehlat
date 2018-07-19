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
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.Arabic.BookNowArabicPage;

public class BookNowArabicSteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigationArabic FlightNavigationArabic = FlightLoginStepsArabic.FlightNavigationArabic;
	BookNowArabicPage bookNowArabicPage = null;

	@When("^I can verify text and select the arabic filter$")
	public void i_can_verify_text_and_select_filter() throws Throwable {
		bookNowArabicPage=FlightNavigationArabic.clickAllResetArabic();
		bookNowArabicPage.filter("من الأدنى إلى الأعلى");
		
	}
	@When("^I can verify popUp and number of flights in current page$")
	public void I_can_verify_popUp_and_number_of_flights_in_current_page() throws Throwable {
		
		bookNowArabicPage.flightDetailsPopUp();
		bookNowArabicPage.clickOnPopUpClose();
		bookNowArabicPage.numberOfFlights();
		bookNowArabicPage.clickOnBookNow();
		
	}


}
