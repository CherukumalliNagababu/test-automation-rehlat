package cloud.rehlat.steps.discount_codes;

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
import cloud.rehlat.pages.PaymentCards.PaymentCardsPage;
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.discount_codes.DiscountsPage;

public class DiscountsSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	DiscountsPage discountsPage = null;

	
	@When("^I go to select OneWay Radio button using for discounts$")
	public void i_go_to_select_oneway_radio_button_using_for_discounts() throws Throwable {

		discountsPage = FlightNavigation.clickOneWayUsingExcel();
		Thread.sleep(2000);
	}
	@When("^I can enter From and To city names using excel sheet$")
	public void i_can_enter_from_and_to_city_names_using_excel_sheet() throws Throwable {
		
		discountsPage.readExcel();
		

	}

}
