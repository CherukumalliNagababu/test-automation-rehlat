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

public class BookingSummaryArabicPage {
	public WebDriver driver;
	private PageUtils pageUtils;

	public BookingSummaryArabicPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//input[@value='none']")
	private WebElement chkAddOnBaggage;
	@FindBy(xpath = "(//input[@value='none'])[2]")
	private WebElement chkAddOnOoredoo;
	@FindBy(xpath = "//p/span/span[2]")
	private WebElement addOnBaggagePrice;
	@FindBy(xpath = "//p/span[2]/span[2]")
	private WebElement addOnOoredooPrice;
	@FindBy(xpath = "//a[contains(text(),'تفاصيل السعر')]")
	private WebElement linkFareBreakup;
	// PopUp
	@FindBy(xpath = "//div[@class='fare_review_wrap']/div[1]/div/div[1]/span[1]")
	private WebElement getAdultName;
	@FindBy(xpath = "//div[@class='fare_review_wrap']/div[1]/div/div[1]/span[2]")
	private WebElement getAdultPrice;
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/span")
	private WebElement getChildName;
	@FindBy(xpath = "//div[@class='fare_review_info']/div[2]/span[@class='pull-right ng-binding']")
	private WebElement getChildPrice;
	@FindBy(xpath = "//div/div/div/div/div[2]/div/div/div/div[3]/span[1]")
	private WebElement getInfantName;
	@FindBy(xpath = "//div[2]/div/div/div/div[3]/span[2]")
	private WebElement getInfantPrice;
	@FindBy(xpath = "//div/div/div/div/div[2]/div/div[2]/div/div/span[1]")
	private WebElement getFareName;
	@FindBy(xpath = "//div[2]/div/div[2]/div/div/span[2]")
	private WebElement getFarePrice;
	@FindBy(xpath = "//div[2]/div/div[6]/div/div/span[1]")
	private WebElement getAddonBaggageName;
	@FindBy(xpath = "//div[2]/div/div[6]/div/div/span[2]")
	private WebElement getAddonBaggagePrice;
	@FindBy(xpath = "//div[@class='fare_review_wrap']/div[10]/div/div/span[1]")
	private WebElement getTotalName;
	@FindBy(xpath = "//div[@class='fare_review_wrap']/div[10]/div/div/span[2]")
	private WebElement getTotalPrice;
	@FindBy(id = "FirstPaxEmailAddress")
	private WebElement txtEmail;
	@FindBy(id = "couponcode")
	private WebElement txtCouponCode;
	@FindBy(xpath = "//a[contains(text(),'Apply')]")
	private WebElement btnApply;
	@FindBy(xpath = "//a[contains(text(),'عرض مزيد من التفاصيل')]")
	private WebElement linkShowMoreDetails;
	@FindBy(linkText = "سياسة التذكرة")
	private WebElement btnFarerulesPopUp;
	@FindBy(linkText = "معلومات الأمتعة")
	private WebElement btnBaggageInformation;
	@FindBy(css = "a.closeBtn > span > img")
	private WebElement iconPopUpClose;
	@FindBy(css = "#compactButtonDesk")
	private WebElement btnContinueBooking;
	@FindBy(css = "div.modal-header > button.close.btn_Close")
	private WebElement closePopUp;

	/**
	 * This method is used to click the ContinueBooking button
	 * 
	 * @return boolean
	 */
	public boolean clickContinueBooking() {
		boolean status = false;
		try {

			pageUtils.clickElement(driver, btnContinueBooking);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	/**
	 * this method is used to enter email id
	 */

	public void enterEmail() {
		pageUtils.sendKeysAfterClearingElement(driver, txtEmail, "naga.ch199@gmail.com");
	}

	/**
	 * this method is used to enter coupon code
	 * 
	 * @param dataMap
	 * @throws InterruptedException
	 */
	public void couponCode(Map<String, String> dataMap) throws InterruptedException {
		String CouponCode = dataMap.get("CouponCodeStatus");
		String EnterCoupon = dataMap.get("EnterCoupon");
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		if (CouponCode.equalsIgnoreCase("NO")) {
			System.out.println("There is no Coupon Code");
		} else {
			pageUtils.sendKeysAfterClearingElement(driver, txtCouponCode, EnterCoupon);

			pageUtils.clickElement(driver, btnApply);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		}
	}

	/**
	 * This method is used to click on the Show more details link in Booking
	 * summary page
	 */
	public void verifyShowMoreDetails() {
		pageUtils.clickElement(driver, linkShowMoreDetails);
		pageUtils.clickElement(driver, btnFarerulesPopUp);
		pageUtils.clickElement(driver, btnBaggageInformation);
		pageUtils.clickElement(driver, iconPopUpClose);

	}

	/**
	 * This method is used to select/de-select the Add-On Baggage checkbox
	 * depending on the input parameter
	 * 
	 * @param addOnBaggage
	 * @throws InterruptedException
	 */
	public void clickAddOnBaggage(Map<String, String> dataMap) throws InterruptedException {
		String addOnBaggage = dataMap.get("addOnBaggage");
		if (addOnBaggage.equalsIgnoreCase("NO")) {
			if (pageUtils.isElementSelected(driver, chkAddOnBaggage)) {
				pageUtils.clickElement(driver, chkAddOnBaggage);
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);

				withOutAddBaggageCheckbox();

			}
		} else {
			// !pageUtils.isElementSelected(driver, chkAddOnBaggage)
			if (pageUtils.isElementSelected(driver, chkAddOnBaggage)) {
				// pageUtils.clickElement(driver, chkAddOnBaggage);

				String Addon = pageUtils.getTextOfElement(driver, addOnBaggagePrice);
				System.out.println("Add-ons: baggage value is:" + Addon);
				addBaggageCheckbox();

			}
		}
	}

	/**
	 * This method is used to select/de-select the Add-On Ooredoo checkbox
	 * depending on the input parameter
	 * 
	 * @param addOnOoredoo
	 * @throws InterruptedException
	 */
	public void clickAddOnOoredoo(String addOnOoredoo) throws InterruptedException {
		if (addOnOoredoo.equalsIgnoreCase("NO")) {
			if (pageUtils.isElementSelected(driver, chkAddOnOoredoo)) {
				pageUtils.clickElement(driver, chkAddOnOoredoo);
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			}
		} else {
			if (!pageUtils.isElementSelected(driver, chkAddOnOoredoo)) {
				pageUtils.clickElement(driver, chkAddOnOoredoo);
				String Ooredoo = pageUtils.getTextOfElement(driver, addOnOoredooPrice);
				System.out.println("Add-ons: Ooredoo value is:" + Ooredoo);
			}
		}
	}

	public void validateBaggageAddOn(Map<String, String> dataMap) throws InterruptedException {

		String AddOnBaggage = dataMap.get("AddOnBaggage");
		clickAddOnBaggage(dataMap);

	}

	/**
	 * This method is used to get the details in fare break popUp page(while add
	 * the baggage checkbox)
	 * 
	 * @throws InterruptedException
	 */
	public void addBaggageCheckbox() throws InterruptedException {

		pageUtils.clickElement(driver, linkFareBreakup);
		System.out.println("--------------------PopUp Values With Baggage Add-on----------------------------");
		String adultname = pageUtils.getTextOfElement(driver, getAdultName);
		String childname = pageUtils.getTextOfElement(driver, getChildName);
		String infantname = pageUtils.getTextOfElement(driver, getInfantName);
		String farename = pageUtils.getTextOfElement(driver, getFareName);
		String baggagename = pageUtils.getTextOfElement(driver, getAddonBaggageName);
		String totalname = pageUtils.getTextOfElement(driver, getTotalName);

		String adultprice = pageUtils.getTextOfElement(driver, getAdultPrice);
		String childprice = pageUtils.getTextOfElement(driver, getChildPrice);
		String infantprice = pageUtils.getTextOfElement(driver, getInfantPrice);
		String fareprice = pageUtils.getTextOfElement(driver, getFarePrice);
		String baggageprice = pageUtils.getTextOfElement(driver, getAddonBaggagePrice);
		String totalprice = pageUtils.getTextOfElement(driver, getTotalPrice);

		System.out.println(adultname + "------------------------------------" + adultprice);
		System.out.println(childname + "------------------------------------" + childprice);
		System.out.println(infantname + "------------------------------------" + infantprice);
		System.out.println(farename + "----------------------------------------" + fareprice);
		System.out.println(baggagename + "--------------------------------" + baggageprice);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(totalname + "-----------------------------------" + totalprice);

	}

	/**
	 * This method is used to get the details in fare break popUp page(Without
	 * add checkbox)
	 * 
	 * @throws InterruptedException
	 */
	public void withOutAddBaggageCheckbox() throws InterruptedException {
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		pageUtils.clickElement(driver, linkFareBreakup);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		System.out.println("--------------------PopUp Values With Out Baggage Add-on----------------------------");
		String adultname = pageUtils.getTextOfElement(driver, getAdultName);
		String childname = pageUtils.getTextOfElement(driver, getChildName);
		String infantname = pageUtils.getTextOfElement(driver, getInfantName);
		String farename = pageUtils.getTextOfElement(driver, getFareName);
		// String baggagename = pageUtils.getTextOfElement(driver,
		// getAddonBaggageName);
		String totalname = pageUtils.getTextOfElement(driver, getTotalName);

		String adultprice = pageUtils.getTextOfElement(driver, getAdultPrice);
		String childprice = pageUtils.getTextOfElement(driver, getChildPrice);
		String infantprice = pageUtils.getTextOfElement(driver, getInfantPrice);
		String fareprice = pageUtils.getTextOfElement(driver, getFarePrice);
		// String baggageprice = pageUtils.getTextOfElement(driver,
		// getAddonBaggagePrice);
		String totalprice = pageUtils.getTextOfElement(driver, getTotalPrice);

		System.out.println(adultname + "------------------------------------" + adultprice);
		System.out.println(childname + "------------------------------------" + childprice);
		System.out.println(infantname + "------------------------------------" + infantprice);
		System.out.println(farename + "----------------------------------------" + fareprice);
		// System.out.println(baggagename + "---------------" + baggageprice);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(totalname + "-----------------------------------" + totalprice);
		pageUtils.clickElement(driver, closePopUp);

	}

}
