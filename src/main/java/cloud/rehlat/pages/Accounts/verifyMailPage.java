package cloud.rehlat.pages.Accounts;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cloud.rehlat.utils.MailUtils;
import cloud.rehlat.utils.PageUtils;



public class verifyMailPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	private MailUtils mailUtils;
	
	public verifyMailPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		this.mailUtils = new MailUtils();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(css = "input[name='otp']")
	private WebElement txtRecoveryCode;
	@FindBy(css = "div.login-form-segment button.ui.button.white")
	private WebElement btnSendBackupCodeToMail;
	@FindBy(css = "button.primary.button")
	private WebElement btnSubmit;

	/**
	 * This method is used to click on send backup code to mail button
	 */
	public void clickSendBackupCodeToMail() {
		pageUtils.waitForElementToLoad(driver, btnSendBackupCodeToMail);
		pageUtils.clickElement(driver, btnSendBackupCodeToMail);
	}

	/**
	 * This method is used to click on send backup code to mail button
	 */
	public void clickSubmit() {
		pageUtils.clickElement(driver, btnSubmit);
	}

	/**
	 * This method is used to enter the recovery code sent to email
	 * so that the user with 2fa activated can login to Canopy
	 */
	public void enterRecoveryCode(String recoveryCode) {
		pageUtils.sendKeysAfterClearingElement(driver, txtRecoveryCode, recoveryCode);
	}

	/**
	 * This method is used to go to open gmail in new tab
	 * and click on the backup recovery code email
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	public String goToRecoveryCodeMail() throws MessagingException, IOException {
		String expectedMailSubject = getSubjectLineForBackupCodeMail();
		String mailBody = mailUtils.fetchEmail(expectedMailSubject);
		String recoveryCode = mailUtils.readMailAndGetRecoveryCode(mailBody);
		System.out.println("recovery code obtained is: "+recoveryCode );
		return recoveryCode;
	}
	
	/**
	 * This method is used to find the subject line for the recovery code mail
	 * @return String
	 */
	private String getSubjectLineForBackupCodeMail() {
		String subjectLine = null;
		String url = System.getProperty("url");
		
			subjectLine = "Rehlat Account";
		
		return subjectLine;
	}
	
	

	
	
}
