package cloud.rehlat.steps.engine;



import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.constants.engine.EngineConstants;
import cloud.rehlat.pages.engine.FlightLoginPage;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.StepUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cloud.rehlat.pages.engine.FlightNavigation;

public class FlightLoginSteps extends StepUtils{
	public static final String SA = null;
	
	protected static String userRole;
	WebDriver driver = BrowserUtils.getDriverInstance();   
	FlightLoginPage FlightLoginPage = null;
	
	public static FlightNavigation FlightNavigation = null;
	
	
	@Given("^I am on login page of Flights$")
	public void i_am_on_login_page_of_Flight() throws Throwable {
		FlightLoginPage = new FlightLoginPage(driver);
	}
	@Given("^I am on login page of Hotels$")
	public void i_am_on_login_page_of_Hotels() throws Throwable {
		FlightLoginPage = new FlightLoginPage(driver);
	}
	
	@When("^I go to Rehlat Home page$")
	public void i_go_to_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.Homepage();
	}
	@When("^I go to Jazeera Home page$")
	public void i_go_to_jazeera_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.JHomepage();
	}
	@When("^I go to Jazeera Services Home page$")
	public void i_go_to_jazeera_Services_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.JSHomepage();
	}
	@When("^I go to Airarabia Home page$")
	public void i_go_to_airarabia_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.AAHomepage();
	}
	@When("^I go to call center Home page$")
	public void i_go_to_call_center_Home_page() throws InterruptedException
	{
		FlightNavigation=FlightLoginPage.CallCenter();
	}
	
	@Then("^I can navigate to Rehlat Home page successfully$")
	public void i_can_navigate_to_Rehlat_home_page_successfully() throws Throwable {
		String expectedTitle = BrowserUtils.TITLE_REHLAT_HOME;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("REHLAT: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO REHLAT   -> REHLAT HOME PAGE", status);	
	}
	@Then("^I can navigate to Flight Home page successfully$")
	public void i_can_navigate_to_Flight_home_page_successfully() throws Throwable {
		FlightNavigation.clickFlightLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_FLIGHT;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("REHLAT: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO FLIGHT  -> FLIGHT PAGE", status);	
	}
	
	@Then("^I can navigate to Hotel Home page successfully$")
	public void i_can_navigate_to_Hotel_home_page_successfully() throws Throwable {
		FlightNavigation.clickHotelLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_HOTEL;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("REHLAT: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO HOTEL  -> HOTEL PAGE", status);	
	}
	@Then("^I can navigate to Deal Home page successfully$")
	public void i_can_navigate_to_Deal_home_page_successfully() throws Throwable {
		FlightNavigation.clickDealLink();
		String expectedTitle = BrowserUtils.TITLE_REHLAT_DEAL;
		String actualTitle = driver.getTitle();
		System.out.println("actualTitle: "+actualTitle);
		System.out.println("expectedTitle: "+expectedTitle);
		boolean status = actualTitle.equals(expectedTitle);
		Assert.assertTrue("REHLAT: THE USER HAS NOT SUCCESSFULLY NAVIGATED TO DEAL  -> DEAL PAGE", status);	
	}
	@When("^I go to signUp button$")
	public void i_go_to_mouseover_clickSignUpIn() throws InterruptedException
	{
		FlightNavigation=new FlightNavigation(driver);
		FlightNavigation=FlightLoginPage.LoginbuttonmouseOver();
		FlightNavigation=FlightLoginPage.clicksignUpbtn();
		
		
		
	}
	
	
	@When("^I am launching the url$")
	public void i_launching_the_url(DataTable dataTable) throws Throwable {
		Map<String, String> dataMap = getDataAsMap(dataTable);
		 userRole = dataMap.get("userRole");
		 String env = dataMap.get("environment");
		 if(env.equalsIgnoreCase(DataConstants.ENV_PRD)){
		if (userRole.equalsIgnoreCase(DataConstants.ROLE_SA)) {
			
			
			 driver.get(BrowserConstants.ENG_SA_PRD_URL);
		
		} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_COM)) {
			 driver.get(BrowserConstants.ENG_COM_PRD_URL);
			
		}
		else if (userRole.equalsIgnoreCase(DataConstants.ROLE_AE)) {
			 driver.get(BrowserConstants.ENG_AE_PRD_URL);
			
		} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EG)) {
			
			 driver.get(BrowserConstants.ENG_EG_PRD_URL);
		} 
	}
		 else if(env.equalsIgnoreCase(DataConstants.ENV_STG)){
			 if (userRole.equalsIgnoreCase(DataConstants.ROLE_SA)) {
					
					
				 driver.get(BrowserConstants.ENG_SA_STG_URL);
				 driver.switchTo().alert().sendKeys("ros@965");
					driver.switchTo().alert().accept();
			
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_COM)) {
				 driver.get(BrowserConstants.ENG_COM_STG_URL);
				 driver.switchTo().alert().sendKeys("ros@965");
					driver.switchTo().alert().accept();
				
			}
			else if (userRole.equalsIgnoreCase(DataConstants.ROLE_AE)) {
				 driver.get(BrowserConstants.ENG_AE_STG_URL);
				 driver.switchTo().alert().sendKeys("ros@965");
					driver.switchTo().alert().accept();
				
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EG)) {
				
				 driver.get(BrowserConstants.ENG_EG_STG_URL);
				 driver.switchTo().alert().sendKeys("ros@965");
					driver.switchTo().alert().accept();
			}  
		 }
		 else if(env.equalsIgnoreCase(DataConstants.ENV_TST)){
			
			 if (userRole.equalsIgnoreCase(DataConstants.ROLE_SA)) {
					
					
				 driver.get(BrowserConstants.ENG_SA_QA_TST_URL);
			
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_COM)) {
				 driver.get(BrowserConstants.ENG_COM_QA_TST_URL);
				
			}
			else if (userRole.equalsIgnoreCase(DataConstants.ROLE_AE)) {
				 driver.get(BrowserConstants.ENG_AE_QA_TST_URL);
				
			} else if (userRole.equalsIgnoreCase(DataConstants.ROLE_EG)) {
				
				 driver.get(BrowserConstants.ENG_EG_QA_TST_URL);
			}  
		 }
	}
	
	
}
