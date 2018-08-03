package cloud.rehlat.pages.engine.arabic;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.pages.Accounts.GmailPage;
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.TravellerInformationPage;
import cloud.rehlat.pages.Trips.Arabic.BookNowArabicPage;
import cloud.rehlat.pages.Trips.Arabic.BookingSummaryArabicPage;
import cloud.rehlat.pages.Trips.Arabic.OneWayTripArabicPage;
import cloud.rehlat.pages.Trips.Arabic.TravellerInformationArabicPage;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class FlightNavigationArabic {
	private WebDriver driver;
	private PageUtils pageUtils;
	
	public FlightNavigationArabic(WebDriver driver) {
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
	
	
	
	/**
	 * This method is used to open the mouseover of login
	 */
	public  void LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
	}
	/**
	 * This method is used to click on the Sign In
	 
	 */
	public  void clicksignbtn() {
		pageUtils.clickElement(driver, btnSignIn);
		
	}
	/**
	 * This method is used to click on the gmail
	 
	 */
	public  GmailPage clickgmail() {
		pageUtils.clickElement(driver, btnGmail);
		return new GmailPage(driver);
	}
	
	/**
	 * This method is used to click on OneWay radio button
	 
	 */
	public  OneWayTripArabicPage clickOneWayArabic() {
		pageUtils.clickElement(driver, radioOneWay);
		return new OneWayTripArabicPage(driver);
	}
	
	
	/**
	 * this method is used to click on AllRest link in book now page
	 * @return
	 */
	
	public  BookNowArabicPage clickAllResetArabic() {
		pageUtils.clickElement(driver, linkAllResetInBookNow);
		return new BookNowArabicPage(driver);
	}
	/**
	 * this method is used to get the text in booking summary page
	 * @return
	 */
	
	public  BookingSummaryArabicPage getTextArabic() {
		String text=pageUtils.getTextOfElement(driver, txtlabel);
		System.out.println(text);
		return new BookingSummaryArabicPage(driver);
	}
	/**
	 * this method is used to get the text in TravellerInformation  page
	 * @return
	 */
	public  TravellerInformationArabicPage getTextValue() {
		String text=pageUtils.getTextOfElement(driver, txtValue);
		System.out.println(text);
		return new TravellerInformationArabicPage(driver);
	}

	
}
