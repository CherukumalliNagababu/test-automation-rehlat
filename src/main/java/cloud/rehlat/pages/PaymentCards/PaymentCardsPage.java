package cloud.rehlat.pages.PaymentCards;

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

public class PaymentCardsPage {
	public WebDriver driver;
	private PageUtils pageUtils;

	public PaymentCardsPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	

	// Debit card
	@FindBy(xpath = "//a[contains(text(),'Debit Card')]")
	private WebElement btnDebitCard;
	@FindBy(id = "cardNumber_dc")
	private WebElement txt_D_CardNumber;
	@FindBy(id = "cardName_dc")
	private WebElement txt_D_CardName;
	@FindBy(id = "txtcvv_dc")
	private WebElement txt_D_CvvNumber;
	@FindBy(css = "div.select")
	private WebElement selectMonth_D;
	@FindBy(id = "ddlExpireYear_dc")
	private WebElement selectYear_D;
	@FindBy(css = "button.btn.pay_button")
	private WebElement btnPayNow_D;

	// credit card

	@FindBy(xpath = "//a[contains(text(),'Credit Card')]")
	private WebElement btnCreditCard;
	@FindBy(id = "cardNumber_cc")
	private WebElement txt_C_CardNumber;
	@FindBy(id = "cardName_cc")
	private WebElement txt_C_CardName;
	@FindBy(id = "txtcvv_cc")
	private WebElement txt_C_CvvNumber;
	@FindBy(id = "ddlExpireMonth_cc")
	private WebElement selectMonth_C;
	@FindBy(id = "ddlExpireYear_cc")
	private WebElement selectYear_C;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement btnPayNow_C;

	// MADA card
	@FindBy(xpath = "//a[contains(text(),'MADA')]")
	private WebElement btnMADA;
	@FindBy(id = "cardNumber_mada")
	private WebElement txt_MADA_CardNumber;
	@FindBy(xpath = "(//input[@name='cardholder_name'])[3]")
	private WebElement txt_MADA_CardName;
	@FindBy(id = "txtcvv_mada")
	private WebElement txt_MADA_CvvNumber;
	@FindBy(id = "ddlExpireMonth_mada")
	private WebElement selectMonth_MADA;
	@FindBy(id = "ddlExpireYear_mada")
	private WebElement selectYear_MADA;
	@FindBy(xpath = "(//button[@type='submit'])[4]")
	private WebElement btnPayNow_MADA;

	// Visa CheckOut Card
	@FindBy(xpath = "//a[contains(text(),'Visa Checkout')]")
	private WebElement btnVisaCheckout;
	@FindBy(xpath = "(//img[@alt='Visa Checkout'])[2]")
	private WebElement btnPayNow_Visa;

	// CASH U Card

	@FindBy(xpath = "//a[contains(text(),'Cash U')]")
	private WebElement btnCashU;
	@FindBy(css = "button.btn_ros.btn-Green-payment")
	private WebElement btnPayNow_CASHU;

	// KNET Card

	@FindBy(xpath = "//a[contains(text(),'KNET')]")
	private WebElement btnKNET;
	@FindBy(xpath = "//form/div/div/div[2]/button")
	private WebElement btnPayNow_Knet;

	// SADAD Card

	@FindBy(xpath = "//a[contains(text(),'SADAD')]")
	private WebElement btnSADAD;
	@FindBy(name = "olp_id")
	private WebElement txtOlpID;
	@FindBy(xpath = "//form/div/div/div/div[2]/button")
	private WebElement btnPayNow_Sadad;

	/**
	 * This method is used to enter debit card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterDebitCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnDebitCard);
		pageUtils.sendKeysAfterClearingElement(driver, txt_D_CardNumber, "1234567894564515");
		pageUtils.sendKeysAfterClearingElement(driver, txt_D_CardName, "nagababu");
		pageUtils.selectByIndexNumber(selectMonth_D, 2);
		pageUtils.selectByIndexNumber(selectYear_D, 3);
		pageUtils.sendKeysAfterClearingElement(driver, txt_D_CvvNumber, "235");
		pageUtils.clickElement(driver, btnPayNow_D);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to enter Creadit card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterCreditCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnCreditCard);
		pageUtils.sendKeysAfterClearingElement(driver, txt_C_CardNumber, "");
		pageUtils.sendKeysAfterClearingElement(driver, txt_C_CardName, "");
		pageUtils.selectByIndexNumber(selectMonth_C, 2);
		pageUtils.selectByIndexNumber(selectYear_C, 3);
		pageUtils.sendKeysAfterClearingElement(driver, txt_C_CvvNumber, "");
		pageUtils.clickElement(driver, btnPayNow_C);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to enter MADA card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterMadaCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnMADA);
		pageUtils.sendKeysAfterClearingElement(driver, txt_MADA_CardNumber, "");
		pageUtils.sendKeysAfterClearingElement(driver, txt_MADA_CardName, "");
		pageUtils.selectByIndexNumber(selectMonth_MADA, 2);
		pageUtils.selectByIndexNumber(selectYear_MADA, 3);
		pageUtils.sendKeysAfterClearingElement(driver, txt_MADA_CvvNumber, "");
		pageUtils.clickElement(driver, btnPayNow_MADA);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to enter VisaCheckout card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterVisaCheckoutCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnVisaCheckout);
		pageUtils.clickElement(driver, btnPayNow_Visa);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to enter Cash U card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterCashUCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnCashU);
		pageUtils.clickElement(driver, btnPayNow_CASHU);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to enter KNET card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterKnetCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnKNET);
		pageUtils.clickElement(driver, btnPayNow_Knet);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	
	/**
	 * This method is used to enter SADAD card details
	 * 
	 * @throws InterruptedException
	 */
	public void enterSadadCardDetails() throws InterruptedException {
		pageUtils.clickElement(driver, btnSADAD);
		pageUtils.sendKeysAfterClearingElement(driver, txtOlpID, "");
		pageUtils.clickElement(driver, btnPayNow_Sadad);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	/**
	 * This method is used to select card
	 * @param dataMap
	 * @throws InterruptedException
	 */
	
	public void selectCard(Map<String, String> dataMap) throws InterruptedException {
		String selectCard = dataMap.get("selectCard");
		if (selectCard.equalsIgnoreCase("Debitcard")) {
			System.out.println("Enter Debit card Details");
			enterDebitCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("CreditCard"))
		{
			System.out.println("Enter Credit card Details");
			enterCreditCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("CASHU"))
		{
			System.out.println("Enter CASHU card Details");
			enterCashUCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("KNET"))
		{
			System.out.println("Enter KNET card Details");
			enterKnetCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("MADA"))
		{
			enterMadaCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("SADAD"))
		{
			System.out.println("Enter SADAD card Details");
			enterSadadCardDetails();
		}
		else if(selectCard.equalsIgnoreCase("VishCheckout"))
		{
			System.out.println("Enter Vish Checkout card Details");
			enterVisaCheckoutCardDetails();
		}
	}
	

}
