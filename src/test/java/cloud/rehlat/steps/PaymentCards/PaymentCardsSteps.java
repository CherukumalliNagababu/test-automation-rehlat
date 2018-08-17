package cloud.rehlat.steps.PaymentCards;

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

public class PaymentCardsSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	PaymentCardsPage paymentCardsPage = null;

	@Then("^I can navigative to payment page$")
	public void i_can_navigative_to_payment_page() throws Throwable {
		paymentCardsPage = FlightNavigation.headerText();

	}

	@When("^I can enter the card details$")
	public void i_can_enter_the_card_details(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		paymentCardsPage.selectCard(dataMap);
		Thread.sleep(15000);

	}

}
