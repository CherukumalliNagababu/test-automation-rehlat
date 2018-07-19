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
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;

public class BookingSummarySteps extends StepUtils{
	WebDriver driver = BrowserUtils.getDriverInstance(); 
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	BookingSummaryPage bookingSummaryPage = null;

	@When("^I can verify add on check box$")
	public void i_can_verify_text_and_select_filter(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		System.out.println("addon");
		bookingSummaryPage=FlightNavigation.getText();
		bookingSummaryPage.clickAddOnBaggage(dataMap);
		
		
	}
	@When("^I can enter email and coupon code and verify the show more details popUp$")
	public void i_can_enter_email_and_coupon_code_and_verify_show_more_details_popUp(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		bookingSummaryPage.enterEmail();
		bookingSummaryPage.couponCode(dataMap);
		bookingSummaryPage.verifyShowMoreDetails();
		bookingSummaryPage.clickContinueBooking();
		
		
	}

}
