package cloud.rehlat.steps.engine;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import cloud.rehlat.pages.engine.FlightLoginPage;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;

public class FlightLoginSteps extends StepUtils{

	WebDriver driver = BrowserUtils.getDriverInstance();   
	FlightLoginPage FlightLoginPage = null;
	
	public static FlightNavigation FlightNavigation = null;
	
	
	@Given("^I am on login page of Flights$")
	public void i_am_on_login_page_of_Flight() throws Throwable {
		FlightLoginPage = new FlightLoginPage(driver);
	}
	
	@When("^I go to Rehlat Home page$")
	public void i_go_to_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.Homepage();
	}
	
	@Then("^I can navigate to Rehlat Home page successfully$")
	public void i_can_navigate_to_Rehlat_home_page_successfully() throws Throwable {
		String expectedTitle = BrowserUtils.TITLE_REHLAT_HOME;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("ENGINE: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO REHLAT   -> REHLAT HOME PAGE", status);	
	}
	@Then("^I can navigate to Flight Home page successfully$")
	public void i_can_navigate_to_Flight_home_page_successfully() throws Throwable {
		FlightNavigation.clickFlightLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_FLIGHT;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("ENGINE: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO FLIGHT  -> FLIGHT PAGE", status);	
	}
	
	@Then("^I can navigate to Hotel Home page successfully$")
	public void i_can_navigate_to_Hotel_home_page_successfully() throws Throwable {
		FlightNavigation.clickHotelLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_HOTEL;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("ENGINE: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO HOTEL  -> HOTEL PAGE", status);	
	}
	@Then("^I can navigate to Deal Home page successfully$")
	public void i_can_navigate_to_Deal_home_page_successfully() throws Throwable {
		FlightNavigation.clickDealLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_DEAL;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("ENGINE: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO DEAL  -> DEAL PAGE", status);	
	}
	@When("^I go to signUp button$")
	public void i_go_to_mouseover_clickSignUpIn() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.LoginbuttonmouseOver();
		FlightNavigation=FlightLoginPage.clicksignUpbtn();
		
		
		
	}
	
	
	
	
}
