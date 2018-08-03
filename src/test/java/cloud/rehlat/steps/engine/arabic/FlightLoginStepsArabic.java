package cloud.rehlat.steps.engine.arabic;
import org.openqa.selenium.WebDriver;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.arabic.FlightLoginPageArabic;
import cloud.rehlat.pages.engine.arabic.FlightNavigationArabic;

public class FlightLoginStepsArabic extends StepUtils {

	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightLoginPageArabic flightLoginPageArabic = null;

	public static FlightNavigationArabic FlightNavigationArabic = null;

	@Given("^I am on login page of Flights Arabic$")
	public void i_am_on_login_page_of_Flight() throws Throwable {
		flightLoginPageArabic = new FlightLoginPageArabic(driver);
	}

	@When("^I go to Rehlat Home page arabic$")
	public void i_go_to_Rehlat_Home_page_arabic() throws InterruptedException {
		FlightNavigationArabic = flightLoginPageArabic.Homepage();
	}

	@When("^I go to sign button arabic$")
	public void i_go_to_mouseover_clickSignIn() throws InterruptedException {
		FlightNavigationArabic = flightLoginPageArabic.LoginbuttonmouseOver();
		FlightNavigationArabic = flightLoginPageArabic.clicksignbtn();

	}

}
