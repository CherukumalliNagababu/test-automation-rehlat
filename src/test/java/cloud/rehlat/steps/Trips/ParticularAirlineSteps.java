package cloud.rehlat.steps.Trips;
import org.openqa.selenium.WebDriver;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.ParticularAirlinePage;


public class ParticularAirlineSteps extends StepUtils{
	
    WebDriver driver = BrowserUtils.getDriverInstance(); 
    FlightNavigation FlightNavigation = FlightLoginSteps.FlightNavigation;
    ParticularAirlinePage particularAirlinePage = null;
    @When("^I can verify text and select the filter Airlines$")
    public void i_can_verify_text_and_select_filter_airlines() throws Throwable {
    	particularAirlinePage=new ParticularAirlinePage(driver);
    	particularAirlinePage.airLineShowMoreLink();
    	particularAirlinePage.SelectAirline("flynas");
    	particularAirlinePage.filter("Low to high");
        
    }
    @When("^I can verify price details in flightdetails Pop up page Airlines$")
    public void i_can_verify_price_details_in_flight_details_popUp_page_airlines() throws Throwable {
        
    	particularAirlinePage.flightDetailsPopUp_OneWay();
    	particularAirlinePage.clickOnPopUpClose();
    	particularAirlinePage.numberOfFlights();
    	particularAirlinePage.clickOnBookNow_One_Way();
        
    }
    
}