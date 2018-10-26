package cloud.rehlat.steps.slacknotifications;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;

import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.pages.slacknotifications.RepricingPage;
import cloud.rehlat.pages.slacknotifications.Repricing_Html_Report;
import cloud.rehlat.steps.engine.FlightLoginSteps;


public class RepricingSteps extends StepUtils {
	WebDriver driver = BrowserUtils.getDriverInstance();
	FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
	RepricingPage repricingPage = null;
	Repricing_Html_Report repricing_Html_Report=null;
	@When("^I can go to call center and get the data$")
	public void i_can_go_to_call_center_and_get_the_data() throws Throwable {
		repricingPage= new RepricingPage(driver);
		repricingPage.repricing_com();
		repricingPage.repricing_sa();
		repricingPage.repricing_ae();
		repricingPage.repricing_eg();
		
	}
	@When("^I can send repricing html report$")
	public void i_can_send_repricing_html_report() throws Throwable {
		repricing_Html_Report= new Repricing_Html_Report(driver);
		repricing_Html_Report.html_report();
	
		
	}

	
}
