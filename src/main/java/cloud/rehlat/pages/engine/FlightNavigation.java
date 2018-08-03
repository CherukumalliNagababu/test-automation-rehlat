package cloud.rehlat.pages.engine;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.pages.Accounts.ForgotpasswordPage;
import cloud.rehlat.pages.Accounts.GmailPage;
import cloud.rehlat.pages.Accounts.verifyMailPage;
import cloud.rehlat.pages.Hotels.english.SearchHotelPage;
import cloud.rehlat.pages.PaymentCards.PaymentCardsPage;
import cloud.rehlat.pages.Register.RegisterPage;
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.TravellerInformationPage;
import cloud.rehlat.pages.Trips.Arabic.BookNowArabicPage;
import cloud.rehlat.pages.Trips.Arabic.BookingSummaryArabicPage;
import cloud.rehlat.pages.Trips.Arabic.OneWayTripArabicPage;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class FlightNavigation {
	private WebDriver driver;
	private PageUtils pageUtils;
	
	public FlightNavigation(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="Sign In")
	private  WebElement btnSignIn;
	
	@FindBy(css="#customBtn")
	private WebElement btnGmail;
	
	@FindBy(id="radio_1")
	private WebElement radioOneWay;
	@FindBy(xpath=".//*[@id='resetAll']")
	private WebElement linkAllResetInBookNow;
	@FindBy(css="h4.panel-title")
	private WebElement txtlabel;
	@FindBy(css="span.pax_type")
	private WebElement txtValue;
	//header links
	@FindBy(linkText="Flights")
	private WebElement btnFlight;
	@FindBy(linkText="Hotels")
	private WebElement btnHotel;
	@FindBy(linkText="Deals")
	private WebElement btnDeals;
	@FindBy(xpath="//a[contains(text(),'Inspirations')]")
	private WebElement btnInspirations;
	//Register page
	@FindBy(xpath="//li[3]/a/div/span")
	private WebElement getTextRegister;
	//payment page
	@FindBy(xpath = "//div[@id='container']/div/div/div/a/h4")
	private WebElement paymentHeaderText;
	
	
	
	/**
	 * This method is used to open the mouse over of login
	 */
	public  void LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
	}
	/**
	 * This method is used to click on the Sign in  
	 
	 */
	public  void clicksignbtn() {
		pageUtils.clickElement(driver, btnSignIn);
		
	}
	/**
	 * this method is used to click on Flight link in home page
	 * @return
	 */
	public  void clickFlightLink() throws InterruptedException {
		pageUtils.clickElement(driver, btnFlight);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		
	}
	/**
	 * this method is used to click on Hotel link in home page
	 * @return
	 */
	public  SearchHotelPage clickHotelLink() throws InterruptedException {
		pageUtils.clickElement(driver, btnHotel);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		return new SearchHotelPage(driver);
		
	}
	/**
	 * this method is used to click on Deals link in home page
	 * @return
	 */
	public  void clickDealLink() throws InterruptedException {
		pageUtils.clickElement(driver, btnDeals);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		
	}
	/**
	 * this method is used to click on Inspritions link in home page
	 * @return
	 */
	public  void clickInspritionsLink() throws InterruptedException {
		pageUtils.clickElement(driver, btnInspirations);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		
	}
	/*public  RegisterPage getTextOfRegister() {
		String text=pageUtils.getTextOfElement(driver, getTextRegister);
		System.out.println(text);
		return new RegisterPage(driver);
	}*/
	
	/**
	 * this method is used to get the text in Register page
	 * @return
	 */
	public  RegisterPage getTextOfRegister() {
		String text=pageUtils.getTextOfElement(driver, getTextRegister);
		System.out.println(text);
		return new RegisterPage(driver);
	}
	/**
	 * this method is used to click on gmail button
	 * @return
	 */
	public  GmailPage clickgmail() {
		pageUtils.clickElement(driver, btnGmail);
		return new GmailPage(driver);
	}
	
	/**
	 * this method is used to click on Oneway Radio button
	 * @return
	 */
	public  OneWayTripPage clickOneWay() {
		pageUtils.clickElement(driver, radioOneWay);
		return new OneWayTripPage(driver);
	}
	/**
	 * this method is used to click on AllRest link in book now page
	 * @return
	 */
	public  BookNowPage clickAllReset() {
		pageUtils.clickElement(driver, linkAllResetInBookNow);
		return new BookNowPage(driver);
	}
	/**
	 * this method is used to get the text in booking summary page
	 * @return
	 */
	
	public  BookingSummaryPage getText() throws InterruptedException {
		
		String text=pageUtils.getTextOfElement(driver, txtlabel);
		System.out.println(text);
		return new BookingSummaryPage(driver);
	}
	
	/**
	 * this method is used to get the text in TravellerInformation  page
	 * @return
	 */
	public  TravellerInformationPage getTextValue() {
		String text=pageUtils.getTextOfElement(driver, txtValue);
		System.out.println(text);
		return new TravellerInformationPage(driver);
	}
	
	
	/**
	 * this method is used to get the text in Payment page
	 * @return
	 */
	public  PaymentCardsPage headerText()
	{
		String text=pageUtils.getTextOfElement(driver, paymentHeaderText);
		System.out.println(text);
		return new PaymentCardsPage(driver);
	}
	/**
	 * This method is used to open the mouse over of login
	 */
	public  ForgotpasswordPage LoginmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
		return new ForgotpasswordPage(driver);
	}
}
