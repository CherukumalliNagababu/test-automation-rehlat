package cloud.rehlat.pages.Accounts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;


public class GmailPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(id="identifierId")
	private WebElement txtUsername;
	@FindBy(xpath="//div[@id='identifierNext']/div[2]")
	private WebElement btnUserNext;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(xpath="//div[@id='passwordNext']/div[2]")
	private WebElement btnPwdNext;
	
	public void enterGmailCredentials() throws InterruptedException {
	    
		pageUtils.switchWindows(driver);
		pageUtils.sendKeysAfterClearingElement(driver, txtUsername, DataConstants.GMAIL_USERNAME);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.doubleClickElement(driver, btnUserNext);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, DataConstants.GMAIL_PASSWORD);
		pageUtils.doubleClickElement(driver, btnPwdNext);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		pageUtils.switchToParentWindow(driver);
		pageUtils.refreshPage(driver);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		
		
	} 

}
