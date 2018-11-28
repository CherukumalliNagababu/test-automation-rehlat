package cloud.rehlat.pages.Register;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.pages.engine.FlightNavigation;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;


public class RegisterPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(id="FirstName_1")
	private WebElement txtFirstName;
	@FindBy(id="LastName_1")
	private WebElement txtLastName;
	@FindBy(id="homeEmail")
	private WebElement txtHomeMail;
	@FindBy(id="homePassword")
	private WebElement txtHomePwd;
	@FindBy(id="homeConfirmPassword")
	private WebElement txtHomeConfirmPwd;
	@FindBy(id="signUpBtn")
	private WebElement btnSignUp;
	
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="Sign Up")
	private  WebElement btnHomepageSignUp;
	@FindBy(xpath="//li[3]/a/div/span")
	private  WebElement getRegisteredName;
	@FindBy(linkText="LOG OUT")
	private  WebElement btnLogOut;
	
	/**
	 * This method is used to enter Register details 
	 * @return
	 * @throws InterruptedException
	 */
	
	public String enterRegisterDetails() throws InterruptedException
	{
		String firstName = TestDataUtils.getUniqueRegisterFirstName();
		String firstName1 = TestDataUtils.getUniqueRegisterFirstName();
		System.out.println(firstName +" "+firstName1);
		//String displayName = TestDataUtils.getUniqueDisplayName();
		String lastName  = TestDataUtils.getUniqueRegisterLastName();
		String email = TestDataUtils.getUniqueEmailId();
		String password = DataConstants.NEW_REGISTER_PASSWORD;
		
		pageUtils.sendKeysAfterClearingElement(driver, txtFirstName, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtLastName, lastName);
		pageUtils.sendKeysAfterClearingElement(driver, txtHomeMail, email);
		pageUtils.sendKeysAfterClearingElement(driver, txtHomePwd, password);
		//pageUtils.sendKeysAfterClearingElement(driver, txtHomeConfirmPwd, password);
		pageUtils.clickElement(driver, btnSignUp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		String strCreatedUser = pageUtils.getTextOfElement(driver, getRegisteredName);
		System.out.println("display Register account: " + strCreatedUser);
		return strCreatedUser;
		
	}
	/**
	 * this method is used to click on sign up button in home page
	 * @throws InterruptedException
	 */
	public void  clickOnSignUp() throws InterruptedException {
		pageUtils.mouseAction(driver, btnmouse);
		pageUtils.clickElement(driver, btnHomepageSignUp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	/**
	 * this method is used to click on logout
	 * @throws InterruptedException
	 */
	 public void signOut() throws InterruptedException
	 {
		 pageUtils.mouseAction(driver, btnmouse); 
		 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		 pageUtils.clickElement(driver, btnLogOut);
	 }
	
	/**
	 * This method is used to create multiple register accounts
	 * 
	 * @throws InterruptedException
	 */
	public void createMultipleRegisterAccounts(Map<String, String> dataMap) throws InterruptedException {
		String numberOfAccountsCreated = dataMap.get("numberOfAccountsCreated");
		
		int intNumberOfAccounts = Integer.parseInt(numberOfAccountsCreated);

		

		for (int count = 0; count < intNumberOfAccounts; count++) {
			clickOnSignUp();
			String registerAccountDetails = enterRegisterDetails();
			signOut();
			//clickAddParentAccount();
			//String parentAccountCode = enterParentAccountDetails();
			//clickCloseOnPopUpModal();
			
			if (count == 0) {
				TestDataUtils.firstRegisterAccount = registerAccountDetails;
				
			} else if (count == 1) {
				TestDataUtils.secondRegisterAccount = registerAccountDetails;
				
			}
			
		}
		
	}
}







