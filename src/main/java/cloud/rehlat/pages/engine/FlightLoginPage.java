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
	@FindBy(linkText="SIGN UP")
	private  WebElement btnSignIn;
	
	@FindBy(css="#identifierId")
	private WebElement txtUsername;
	@FindBy(xpath="//div[@id='identifierNext']/div[2]")
	private WebElement btnNextuser;
	@FindBy(css="input[name='password']")
	private WebElement txtPassword;
	@FindBy(xpath="//div[@id='passwordNext']/div[2]")
	private WebElement btnNextpass;
	
	
	
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
	
	public  FlightNavigation LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
		return new FlightNavigation(driver) ;
	}
	public  FlightNavigation clicksignbtn() throws InterruptedException {
		pageUtils.clickElement(driver, btnSignIn);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		return new FlightNavigation(driver) ;
		
	}
	public  FlightNavigation Homepage() {
		pageUtils.getTextOfElement(driver, getText);
		return new FlightNavigation(driver) ;
	}
	
	
}
