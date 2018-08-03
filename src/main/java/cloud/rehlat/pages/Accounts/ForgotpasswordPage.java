package cloud.rehlat.pages.Accounts;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;
import cloud.rehlat.utils.MailUtils;

public class ForgotpasswordPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	private MailUtils mailUtils;
	String userAccount;

	public ForgotpasswordPage(WebDriver driver) {
		this.driver = driver;
		this.mailUtils = MailUtils.getInstance();
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="Login")
	private  WebElement btnHomepageSignIn;
	@FindBy(id="EmailAddress")
	private  WebElement txtEmail;
	@FindBy(xpath=".//*[@id='form-login']/div[2]/div[2]/div/a/span")
	private  WebElement linkForgotPassWord;
	@FindBy(xpath="//form[@id='login-form-passwordchange']/div[2]/div/input")
	private  WebElement entercode;
	@FindBy(id="Passwordhome")
	private  WebElement txtPassWord;
	@FindBy(id="ConfirmPasswordhome")
	private  WebElement txtConfirmPassword;
	@FindBy(xpath="//div/div/div[2]/button")
	private  WebElement btnLogin;
	@FindBy(linkText="LOG OUT")
	private  WebElement btnLogOut;
	/**
	 * this method is used to click on sign In button in home page
	 * @throws InterruptedException
	 */
	public void  clickOnSignIn() throws InterruptedException {
		pageUtils.clickElement(driver, btnHomepageSignIn);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	/**
	 * this method is used to enter email
	 * @throws InterruptedException
	 */
	public void  enterEmail() throws InterruptedException {
		pageUtils.sendKeysAfterClearingElement(driver, txtEmail, DataConstants.FORGOT_MAIL_USERNAME);
	}
	/**
	 * This method is used to enter the otp based on mail
	 * @param recoveryCode
	 * @throws InterruptedException
	 */
	public void  enterRecoveryCode(String recoveryCode) throws InterruptedException {
		pageUtils.sendKeysAfterClearingElement(driver, entercode, recoveryCode);
	}
	/**
	 * Enter the forgot pwd details
	 * @throws InterruptedException
	 */
	public void enterforgotPwdDetails() throws InterruptedException
	{
		String pwd=TestDataUtils.getUniquePassword();
		pageUtils.sendKeysAfterClearingElement(driver, txtPassWord,pwd);
		pageUtils.sendKeysAfterClearingElement(driver, txtConfirmPassword, pwd);
		pageUtils.clickElement(driver, btnLogin);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	
	
	/**
	 * this method is used to click on logout
	 * @throws InterruptedException
	 */
	 public void LogOut() throws InterruptedException
	 {
		 pageUtils.mouseAction(driver, btnmouse); 
		 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		 pageUtils.clickElement(driver, btnLogOut);
	 }
	/**
	 * this method is used to Click on forgot password 
	 * @throws InterruptedException
	 */
	public void  clickOnForgotPassword() throws InterruptedException {
		pageUtils.clickElement(driver, linkForgotPassWord);
	}
	/**
	 * This method is used to complete the steps required for 2fa
	 * @throws IOException 
	 * @throws MessagingException 
	 * @throws InterruptedException 
	 */
	public void verificationFor2fa() throws MessagingException, IOException, InterruptedException {
		verifyMailPage engine2fa = new verifyMailPage(driver);
		String recoveryCode =engine2fa.goToRecoveryCodeMail();
		System.out.println("recoveryCode:"+recoveryCode);
		enterRecoveryCode(recoveryCode);
		
	}
}
