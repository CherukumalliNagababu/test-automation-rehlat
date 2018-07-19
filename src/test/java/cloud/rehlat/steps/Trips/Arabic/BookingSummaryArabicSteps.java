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
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.Arabic.BookingSummaryArabicPage;

public class BookingSummaryArabicSteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigationArabic FlightNavigationArabic = FlightLoginStepsArabic.FlightNavigationArabic;
	BookingSummaryArabicPage bookingSummaryArabicPage = null;

	@When("^I can verify add oncheck box in arabic$")
	public void i_can_verify_add_check_box_in_arabic(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		System.out.println("addon");
		bookingSummaryArabicPage=FlightNavigationArabic.getTextArabic();
		bookingSummaryArabicPage.clickAddOnBaggage(dataMap);
		Thread.sleep(10000);
		
	}
	@When("^I can enter email and coupon code and verify the show more details popUp in Arabic$")
	public void i_can_enter_email_and_coupon_code_and_verify_show_more_details_popUp_in_arabic(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		bookingSummaryArabicPage.enterEmail();
		bookingSummaryArabicPage.couponCode(dataMap);
		bookingSummaryArabicPage.verifyShowMoreDetails();
		bookingSummaryArabicPage.clickContinueBooking();
		
		
	}


}
