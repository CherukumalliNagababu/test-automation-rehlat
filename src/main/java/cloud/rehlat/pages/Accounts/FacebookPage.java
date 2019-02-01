package cloud.rehlat.pages.Accounts;

import java.io.IOException;
import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.PageUtils;


public class FacebookPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	
	String userAccount;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtUsername;
	@FindBy(id="pass")
	private WebElement txtPassword;
	@FindBy(id="u_0_0")
	private WebElement clickLogin;
	//@FindBy(name="_Continue_")
	//private WebElement btnContinue;
	
	
	/**
	 * This method is used to enter the Facebook details(login to Facebook)
	 * @throws InterruptedException
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	public void enterFacebookCredentials() throws InterruptedException, IOException {
	   
		pageUtils.switchWindows(driver);
		pageUtils.sendKeysAfterClearingElement(driver, txtUsername, DataConstants.FACEBOOK_USERNAME);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);

		
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, DataConstants.FACEBOOK_PASSWORD);
		pageUtils.clickElement(driver, clickLogin);
		//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		//pageUtils.doubleClickElement(driver, btnContinue);
		
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		pageUtils.switchToParentWindow(driver);
		pageUtils.refreshPage(driver);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		//verificationFor2fa();
		
	} 

	
	
	
	
	/**
	 * This method is used to complete the steps required for 2fa
	 * @throws IOException 
	 * @throws MessagingException 
	 
	public void verificationFor2fa() throws MessagingException, IOException {
		verifyMailPage engine2fa = new verifyMailPage(driver);
		engine2fa.clickSendBackupCodeToMail();
		String recoveryCode =engine2fa.goToRecoveryCodeMail();
		engine2fa.enterRecoveryCode(recoveryCode);
		engine2fa.clickSubmit();
	}*/
	
}
