package cloud.rehlat.pages.engine;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.pages.Accounts.GmailPage;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class FlightLoginPage {
	
	private WebDriver driver;
	private PageUtils pageUtils;
	
	public FlightLoginPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	@FindBy(linkText="Flights")
	private  WebElement getText;
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="Sign Up")
	private  WebElement btnSignUp;
	
	@FindBy(css="#identifierId")
	private WebElement txtUsername;
	@FindBy(xpath="//div[@id='identifierNext']/div[2]")
	private WebElement btnNextuser;
	@FindBy(css="input[name='password']")
	private WebElement txtPassword;
	@FindBy(xpath="//div[@id='passwordNext']/div[2]")
	private WebElement btnNextpass;
	
	@FindBy(linkText="Plan")
	private  WebElement JgetText;
	@FindBy(xpath="//h3")
	private  WebElement JSgetText;
	
	@FindBy(xpath="//div[@id='search_tabs']/div/div/div/ul/li/a")
	private  WebElement AAgetText;
	
	@FindBy(id="Email")
	private  WebElement txtGet;
	
	/**
	 * This method is used to enter the login credentials of the user on Engine
	 * @param dataMap
	 * @throws InterruptedException 
	 */
	public void enterCredentials(Map<String, String> dataMap) throws InterruptedException {
		String userRole = dataMap.get("userRole");
		String loginType = dataMap.get("loginType");
		String username = TestDataUtils.getUsernameForRole(userRole, loginType);
		String password = TestDataUtils.getPasswordForRole(userRole, loginType);
		//pageUtils.waitForElementToLoad(driver, txtUsername);
		//pageUtils.waitForElementToLoad(driver, txtPassword);
		pageUtils.sendKeysAfterClearingElement(driver, txtUsername, username);
		pageUtils.clickElement(driver, btnNextuser);
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, password);
		pageUtils.clickElement(driver, btnNextpass);
	}
	/**
	 * this method is used to mouse over action in home page
	 * @return
	 */
	
	public  FlightNavigation LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
		return new FlightNavigation(driver) ;
	}
	/**
	 * this method is used to click on SignUp 
	 * @return
	 */
	public  FlightNavigation clicksignUpbtn() throws InterruptedException {
		pageUtils.clickElement(driver, btnSignUp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		return new FlightNavigation(driver) ;
	
	}
	/**
	 * this method is used to get the text in home page
	 * @return
	 */
	public  FlightNavigation Homepage() {
		pageUtils.getTextOfElement(driver, getText);
		return new FlightNavigation(driver) ;
	}
	public  FlightNavigation JHomepage() {
		pageUtils.getTextOfElement(driver, JgetText);
		return new FlightNavigation(driver) ;
	}
	public  FlightNavigation JSHomepage() {
		pageUtils.getTextOfElement(driver, JSgetText);
		return new FlightNavigation(driver) ;
	}
	
	public  FlightNavigation AAHomepage() {
		pageUtils.getTextOfElement(driver,AAgetText);
		return new FlightNavigation(driver) ;
	}
	
	public  FlightNavigation CallCenter() {
		pageUtils.getTextOfElement(driver,txtGet);
		return new FlightNavigation(driver) ;
	}
}
