package cloud.rehlat.pages.Trips.Arabic;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class BookNowArabicPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;
	String SelectedFromCity;
	String SelectedToCity;

	public BookNowArabicPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(linkText = "السعر")
	private WebElement btnPrice;
	@FindBy(linkText = "من الأدنى إلى الأعلى")
	private WebElement priceLowToHigh;
	@FindBy(linkText = "من الأعلى إلى الأدنى ")
	private WebElement priceHighToLow;
	@FindBy(linkText = "تفاصيل الرحلة")
	private WebElement linkFlightDetailsTop;
	@FindBy(linkText = "سياسة التذكرة")
	private WebElement btnFarerulesPopUp;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[2]/td")
	private WebElement txtOfAdultName;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[3]/td")
	private WebElement txtOfChildName;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[4]/td")
	private WebElement txtOfInfantsName;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[5]/td")
	private WebElement txtOftaxname;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[5]/td[2]")
	private WebElement txtOfTotalValue;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[6]/td")
	private WebElement txtOfPriceName;
	@FindBy(xpath = "//div[@id='fareRulesPop1']/div/div/div[2]/table/tbody/tr[6]/td[2]")
	private WebElement txtOfPriceValue;
	@FindBy(linkText = "معلومات الأمتعة")
	private WebElement btnBaggageInformation;
	@FindBy(xpath = "//img[contains(@src,'/Content/images/close-icon.png')]")
	private WebElement iconPopUpClose;
	@FindBy(xpath = "//div[2]/div/div/div[2]/button")
	private WebElement btnBookNowFirst;
	@FindBy(xpath = "//div[2]/div/div/div[2]/button")
	private List<WebElement> numberOfFlights;

	/**
	 * This method is used to filter the value(Hight to low OR Low to High) in
	 * book now page
	 * 
	 * @param pricefilter
	 */

	public void filter(String pricefilter) {
		pageUtils.clickElement(driver, btnPrice);
		if ("من الأدنى إلى الأعلى".equalsIgnoreCase(pricefilter)) {
			pageUtils.clickElement(driver, priceLowToHigh);
		} else if ("من الأعلى إلى الأدنى ".equalsIgnoreCase(pricefilter)) {
			pageUtils.clickElement(driver, priceHighToLow);
		}
	}

	/**
	 * This method is used to get the details in flight Details PopUp page
	 * 
	 * @throws InterruptedException
	 */
	public void flightDetailsPopUp() throws InterruptedException {
		pageUtils.clickElement(driver, linkFlightDetailsTop);
		pageUtils.clickElement(driver, btnFarerulesPopUp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnBaggageInformation);
	}

	/**
	 * This method is used to close the flight Details PopUp page
	 */
	public void clickOnPopUpClose() {
		pageUtils.clickElement(driver, iconPopUpClose);
	}

	/**
	 * this method is used to get the number of flights available in book now
	 * page
	 * 
	 * @throws InterruptedException
	 */
	public void numberOfFlights() throws InterruptedException {
		List<WebElement> currentpage = numberOfFlights;
		System.out.println("Number Of Flights In Current Page:" + currentpage.size());
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	}

	/**
	 * This method is used to Click On Book now Top Button
	 */
	public void clickOnBookNow() {
		pageUtils.clickElement(driver, btnBookNowFirst);
	}
}
