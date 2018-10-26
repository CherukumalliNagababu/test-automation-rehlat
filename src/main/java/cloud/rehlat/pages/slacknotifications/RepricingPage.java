package cloud.rehlat.pages.slacknotifications;

import java.util.List;
import java.util.Map;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.HashSet;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class RepricingPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String totalname;
	String totalprice;
	protected static int Com_RP_Wego;
	protected static int Com_RP_b2c;
	protected static int Com_RP_MobIos;
	protected static int Com_RP_MobAnd;
	protected static int Com_RP_skyscan;
	protected static int Com_RP_Dhrehlat;
	protected static int Com_RP_Aviasa;
	protected static int Com_RP_Kayak;
	protected static int Com_RP_Dohop;
	protected static int Com_RP_Farecompare;
	protected static int Com_RP_Shoogloo;

	protected static int Com_CP_Wego;
	protected static int Com_CP_b2c;
	protected static int Com_CP_MobIos;
	protected static int Com_CP_MobAnd;
	protected static int Com_CP_skyscan;
	protected static int Com_CP_Dhrehlat;
	protected static int Com_CP_Aviasa;
	protected static int Com_CP_Kayak;
	protected static int Com_CP_Dohop;
	protected static int Com_CP_Farecompare;
	protected static int Com_CP_Shoogloo;

	protected static int Com_TH_Wego;
	protected static int Com_TH_b2c;
	protected static int Com_TH_MobIos;
	protected static int Com_TH_MobAnd;
	protected static int Com_TH_skyscan;
	protected static int Com_TH_Dhrehlat;
	protected static int Com_TH_Aviasa;
	protected static int Com_TH_Kayak;
	protected static int Com_TH_Dohop;
	protected static int Com_TH_Farecompare;
	protected static int Com_TH_Shoogloo;

	// sa
	protected static int SA_RP_Wego;
	protected static int SA_RP_b2c;
	protected static int SA_RP_MobIos;
	protected static int SA_RP_MobAnd;
	protected static int SA_RP_skyscan;
	protected static int SA_RP_Dhrehlat;
	protected static int SA_RP_Aviasa;
	protected static int SA_RP_Kayak;
	protected static int SA_RP_Dohop;
	protected static int SA_RP_Farecompare;
	protected static int SA_RP_Shoogloo;

	protected static int SA_RP_Repricing_Total;
	protected static int SA_RP_Other_Repricingtotal;
	protected static int SA_SD_SoldOut_Total;
	protected static int SA_SD_Other_SoldOutstotal;
	protected static int SA_CN_CancelledTotal;
	protected static int SA_CN_Other_CancelledTotal;
	protected static int SA_TH_Transactionhold_total;
	protected static int SA_TH_Other_TransactionholdTotal;

	protected static int SA_CP_Wego;
	protected static int SA_CP_b2c;
	protected static int SA_CP_MobIos;
	protected static int SA_CP_MobAnd;
	protected static int SA_CP_skyscan;
	protected static int SA_CP_Dhrehlat;
	protected static int SA_CP_Aviasa;
	protected static int SA_CP_Kayak;
	protected static int SA_CP_Dohop;
	protected static int SA_CP_Farecompare;
	protected static int SA_CP_Shoogloo;

	protected static int SA_TH_Wego;
	protected static int SA_TH_b2c;
	protected static int SA_TH_MobIos;
	protected static int SA_TH_MobAnd;
	protected static int SA_TH_skyscan;
	protected static int SA_TH_Dhrehlat;
	protected static int SA_TH_Aviasa;
	protected static int SA_TH_Kayak;
	protected static int SA_TH_Dohop;
	protected static int SA_TH_Farecompare;
	protected static int SA_TH_Shoogloo;

	// AE
	protected static int AE_RP_Wego;
	protected static int AE_RP_b2c;
	protected static int AE_RP_MobIos;
	protected static int AE_RP_MobAnd;
	protected static int AE_RP_skyscan;
	protected static int AE_RP_Dhrehlat;
	protected static int AE_RP_Aviasa;
	protected static int AE_RP_Kayak;
	protected static int AE_RP_Dohop;
	protected static int AE_RP_Farecompare;
	protected static int AE_RP_Shoogloo;

	protected static int AE_RP_Repricing_Total;
	protected static int AE_RP_Other_Repricingtotal;
	protected static int AE_SD_SoldOut_Total;
	protected static int AE_SD_Other_SoldOutstotal;
	protected static int AE_CN_CancelledTotal;
	protected static int AE_CN_Other_CancelledTotal;
	protected static int AE_TH_Transactionhold_total;
	protected static int AE_TH_Other_TransactionholdTotal;

	protected static int AE_CP_Wego;
	protected static int AE_CP_b2c;
	protected static int AE_CP_MobIos;
	protected static int AE_CP_MobAnd;
	protected static int AE_CP_skyscan;
	protected static int AE_CP_Dhrehlat;
	protected static int AE_CP_Aviasa;
	protected static int AE_CP_Kayak;
	protected static int AE_CP_Dohop;
	protected static int AE_CP_Farecompare;
	protected static int AE_CP_Shoogloo;

	protected static int AE_TH_Wego;
	protected static int AE_TH_b2c;
	protected static int AE_TH_MobIos;
	protected static int AE_TH_MobAnd;
	protected static int AE_TH_skyscan;
	protected static int AE_TH_Dhrehlat;
	protected static int AE_TH_Aviasa;
	protected static int AE_TH_Kayak;
	protected static int AE_TH_Dohop;
	protected static int AE_TH_Farecompare;
	protected static int AE_TH_Shoogloo;

	// Eg

	protected static int EG_RP_Wego;
	protected static int EG_RP_b2c;
	protected static int EG_RP_MobIos;
	protected static int EG_RP_MobAnd;
	protected static int EG_RP_skyscan;
	protected static int EG_RP_Dhrehlat;
	protected static int EG_RP_Aviasa;
	protected static int EG_RP_Kayak;
	protected static int EG_RP_Dohop;
	protected static int EG_RP_Farecompare;
	protected static int EG_RP_Shoogloo;

	protected static int EG_RP_Repricing_Total;
	protected static int EG_RP_Other_Repricingtotal;
	protected static int EG_SD_SoldOut_Total;
	protected static int EG_SD_Other_SoldOutstotal;
	protected static int EG_CN_CancelledTotal;
	protected static int EG_CN_Other_CancelledTotal;
	protected static int EG_TH_Transactionhold_total;

	protected static int EG_CP_Wego;
	protected static int EG_CP_b2c;
	protected static int EG_CP_MobIos;
	protected static int EG_CP_MobAnd;
	protected static int EG_CP_skyscan;
	protected static int EG_CP_Dhrehlat;
	protected static int EG_CP_Aviasa;
	protected static int EG_CP_Kayak;
	protected static int EG_CP_Dohop;
	protected static int EG_CP_Farecompare;
	protected static int EG_CP_Shoogloo;

	protected static int EG_TH_Wego;
	protected static int EG_TH_b2c;
	protected static int EG_TH_MobIos;
	protected static int EG_TH_MobAnd;
	protected static int EG_TH_skyscan;
	protected static int EG_TH_Dhrehlat;
	protected static int EG_TH_Aviasa;
	protected static int EG_TH_Kayak;
	protected static int EG_TH_Dohop;
	protected static int EG_TH_Farecompare;
	protected static int EG_TH_Shoogloo;

	protected static int EG_CP_conformation_pending_Total;
	protected static int EG_CP_Other_conformation_pending;
	protected static int EG_TH_Other_TransactionholdTotal;

	protected static int AE_CP_conformation_pending_Total;
	protected static int AE_CP_Other_conformation_pending;

	protected static int SA_CP_conformation_pending_Total;
	protected static int SA_CP_Other_conformation_pending;

	protected  static int Com_RP_Repricing_Total;
	protected static int Com_RP_Other_Repricingtotal;
	protected static int Com_TS_Transaction_Total;
	protected static int Com_TS_Other_TrancationSuccessfull;
	protected static int Com_CP_conformation_pending_Total;
	protected static int Com_CP_Other_conformation_pending;

	protected static int Com_TH_Transactionhold_total;
	protected static int Com_Other_TH_Transactionhold_total;

	public RepricingPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	// login
	@FindBy(xpath = "td")
	private WebElement td_values;
	@FindBy(id = "Email")
	private WebElement txtEmail;
	@FindBy(id = "Password")
	private WebElement txtPassword;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement btnLogin;

	//
	// Log out Call center
	@FindBy(xpath = "//li[@id='myDisplay']/a")
	private WebElement clkUserName;
	@FindBy(linkText = "Log Out")
	private WebElement lnkLogout;

	@FindBy(id = "DisablePagination")
	private WebElement chkDisablePagination;
	@FindBy(id = "IsRepriced")
	private WebElement chkIsRepriced;
	@FindBy(id = "fltFromdatepicker")
	private WebElement clkFromdatepicker;
	@FindBy(xpath = "//table[@class=' table-condensed']//tbody/tr/td[@class='day']")
	private List<WebElement> selectFromdatepicker;
	@FindBy(id = "fltTodatepicker")
	private WebElement clkTodatepicker;
	@FindBy(xpath = "//table[@class=' table-condensed']//tbody/tr/td[@class='active day']")
	private List<WebElement> listActivateDate;
	@FindBy(id = "status")
	private WebElement drpBookingStatus;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement btnSearch;
	@FindBy(xpath = "//div[@id='searchresults']/div/div/div[2]")
	private WebElement flightResultsCountText;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]")
	private List<WebElement> totalTableSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']")
	private List<WebElement> wegoSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']")
	private List<WebElement> b2cSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']")
	private List<WebElement> mobIosSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']")
	private List<WebElement> mobAppSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']")
	private List<WebElement> skyscnSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']")
	private List<WebElement> dhrehlatSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']")
	private List<WebElement> aviasalesSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']")
	private List<WebElement> kayakSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']")
	private List<WebElement> dohopSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']")
	private List<WebElement> fareCompareSize;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']")
	private List<WebElement> shooglooSize;

	@FindBy(xpath = "//th[2]")
	private WebElement calenderText;
	@FindBy(xpath = "//div[3]/table/tbody/tr/td/span")
	private List<WebElement> yearsList;
	@FindBy(xpath = "//span")
	private List<WebElement> monthList;

	public void LoginCallCenter() throws InterruptedException {
		pageUtils.sendKeysAfterClearingElement(driver, txtEmail, "Sreenivas.bodige@rehlat.com");
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, "Rehlat@2020");
		pageUtils.clickElement(driver, btnLogin);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}

	public void logOut() throws InterruptedException {
		pageUtils.clickElement(driver, clkUserName);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, lnkLogout);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	}

	public void select_FromDate() throws InterruptedException {
		String currentDate = DataUtils.YesterdayDate("dd MMM yyyy");
		System.out.println("Excepted Date:" + currentDate);
		String currentDate1 = DataUtils.YesterdayDate("d");
		System.out.println("Excepted Date:" + currentDate1);
		String currentMonth = DataUtils.YesterdayDate("MMMM");
		System.out.println("Excepted Date:" + currentMonth);
		String currentMonth1 = DataUtils.YesterdayDate("MMM");
		System.out.println("Excepted Date:" + currentMonth1);
		String currentYear = DataUtils.YesterdayDate("yyyy");
		System.out.println("Excepted Date:" + currentYear);
		pageUtils.clickElement(driver, clkFromdatepicker);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		String s = pageUtils.getTextOfElement(driver, calenderText);
		System.out.println(s);
		String month = s.split(" ")[0];
		System.out.println(month);
		String sp1 = s.split(" ")[1];
		System.out.println(sp1);

		// Year matching or not
		if (sp1.equals(currentYear)) {

		} else {
			pageUtils.clickElement(driver, calenderText);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			pageUtils.clickElement(driver, calenderText);
			for (WebElement e : yearsList) {
				if (e.getText().equals(currentYear)) {
					e.click();
					break;
				}
			}
			for (WebElement e : monthList) {
				if (e.getText().equals(currentMonth1)) {
					e.click();
					break;
				}
			}

		}

		// Month Matching or not
		if (month.equals(currentMonth)) {

		} else {
			pageUtils.clickElement(driver, calenderText);
			for (WebElement e : monthList) {
				if (e.getText().equals(currentMonth1)) {
					e.click();
					break;
				}
			}
		}

		for (WebElement e12 : selectFromdatepicker) {
			System.out.println(e12.getText());

			String ele = e12.getText();

			if (ele.equalsIgnoreCase(currentDate1)) {
				e12.click();

				break;
			}
		}
	}

	public void select_ToDate() throws InterruptedException {
		String currentDate = DataUtils.getDateInSpecifiedFormat("dd MMM yyyy");
		System.out.println("Excepted Date:" + currentDate);
		String currentDate1 = DataUtils.getDateInSpecifiedFormat("d");
		System.out.println("Excepted Date:" + currentDate1);
		String currentMonth = DataUtils.getDateInSpecifiedFormat("MMMM");
		System.out.println("Excepted Date:" + currentMonth);
		String currentMonth1 = DataUtils.getDateInSpecifiedFormat("MMM");
		System.out.println("Excepted Date:" + currentMonth1);
		String currentYear = DataUtils.getDateInSpecifiedFormat("yyyy");
		System.out.println("Excepted Date:" + currentYear);
		pageUtils.clickElement(driver, clkTodatepicker);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		String s = pageUtils.getTextOfElement(driver, calenderText);
		System.out.println(s);
		String month = s.split(" ")[0];
		System.out.println(month);
		String sp1 = s.split(" ")[1];
		System.out.println(sp1);

		// Year matching or not
		if (sp1.equals(currentYear)) {

		} else {
			pageUtils.clickElement(driver, calenderText);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			pageUtils.clickElement(driver, calenderText);
			for (WebElement e : yearsList) {
				if (e.getText().equals(currentYear)) {
					e.click();
					break;
				}
			}
			for (WebElement e : monthList) {
				if (e.getText().equals(currentMonth1)) {
					e.click();
					break;
				}
			}

		}

		// Month Matching or not
		if (month.equals(currentMonth)) {

		} else {
			pageUtils.clickElement(driver, calenderText);
			for (WebElement e : monthList) {
				if (e.getText().equals(currentMonth1)) {
					e.click();
					break;
				}
			}
		}

		for (WebElement e12 : listActivateDate) {
			System.out.println(e12.getText());

			String ele = e12.getText();

			if (ele.equalsIgnoreCase(currentDate1)) {
				e12.click();

				break;
			}
		}
	}

	public void repricing_com() throws InterruptedException {
		driver.get("http://callcenter.rehlat.com/");
		LoginCallCenter();

		WebElement checkbox = chkDisablePagination;

		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Already Check Box is selected");
		}

		WebElement isReprice = chkIsRepriced;
		if (!isReprice.isSelected())
			isReprice.click();
		else {
			System.out.println("Aleredy IsRepriced Check Box is selected");
		}

		select_FromDate();

		select_ToDate();
		pageUtils.selectByIndexNumber(drpBookingStatus, 13);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String Rcount = flightResultsCountText.getText();
		System.out.println(Rcount);
		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(Rcount)) {
			System.out.println("Repricing Count = 0");
			Com_RP_Wego = 0;
			Com_RP_b2c = 0;
			Com_RP_MobIos = 0;
			Com_RP_MobAnd = 0;
			Com_RP_skyscan = 0;

			Com_RP_Dhrehlat = 0;
			Com_RP_Aviasa = 0;
			Com_RP_Kayak = 0;

			Com_RP_Dohop = 0;
			Com_RP_Farecompare = 0;
			Com_RP_Shoogloo = 0;

			int TotalValue = Com_RP_Wego + Com_RP_b2c + Com_RP_MobIos + Com_RP_MobAnd + Com_RP_skyscan + Com_RP_Dhrehlat
					+ Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare + Com_RP_Shoogloo;

			Com_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + Com_RP_Repricing_Total);

			int Other = Com_RP_Dhrehlat + Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare
					+ Com_RP_Shoogloo;

			Com_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + Com_RP_Other_Repricingtotal);

		} else {
			else_statement(Com_RP_Wego, Com_RP_b2c, Com_RP_MobAnd, Com_RP_MobIos, Com_RP_skyscan, Com_RP_Dhrehlat,
					Com_RP_Aviasa, Com_RP_Kayak, Com_RP_Dohop, Com_RP_Farecompare, Com_RP_Shoogloo);

			int TotalValue = Com_RP_Wego + Com_RP_b2c + Com_RP_MobIos + Com_RP_MobAnd + Com_RP_skyscan + Com_RP_Dhrehlat
					+ Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare + Com_RP_Shoogloo;

			Com_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + Com_RP_Repricing_Total);

			int Other = Com_RP_Dhrehlat + Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare
					+ Com_RP_Shoogloo;

			Com_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + Com_RP_Other_Repricingtotal);

		}

		pageUtils.selectByIndexNumber(drpBookingStatus, 4);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String count = flightResultsCountText.getText();
		System.out.println(count);
		String R1str = count.trim();
		String[] R1splited = R1str.split("\\:");
		System.out.println("No of Results Count" + R1splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(count)) {
			System.out.println("Repricing Count = 0");
			Com_CP_Wego = 0;
			Com_CP_b2c = 0;
			Com_CP_MobIos = 0;
			Com_CP_MobAnd = 0;
			Com_CP_skyscan = 0;

			Com_CP_Dhrehlat = 0;
			Com_CP_Aviasa = 0;
			Com_CP_Kayak = 0;

			Com_CP_Dohop = 0;
			Com_CP_Farecompare = 0;
			Com_CP_Shoogloo = 0;

			int TotalValue = Com_CP_Wego + Com_CP_b2c + Com_CP_MobIos + Com_CP_skyscan + Com_CP_MobAnd + Com_CP_Dhrehlat
					+ Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare + Com_CP_Shoogloo;

			Com_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + Com_CP_conformation_pending_Total);

			int Other = Com_CP_Dhrehlat + Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare
					+ Com_CP_Shoogloo;

			Com_CP_Other_conformation_pending = Other;
			System.out
					.println(" Others domains Confirmation Pending total :::----" + Com_CP_Other_conformation_pending);

		} else {
			else_statement(Com_CP_Wego, Com_CP_b2c, Com_CP_MobAnd, Com_CP_MobIos, Com_CP_skyscan, Com_CP_Dhrehlat,
					Com_CP_Aviasa, Com_CP_Kayak, Com_CP_Dohop, Com_CP_Farecompare, Com_CP_Shoogloo);

			int TotalValue = Com_CP_Wego + Com_CP_b2c + Com_CP_MobIos + Com_CP_skyscan + Com_CP_MobAnd + Com_CP_Dhrehlat
					+ Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare + Com_CP_Shoogloo;

			Com_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + Com_CP_conformation_pending_Total);

			int Other = Com_CP_Dhrehlat + Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare
					+ Com_CP_Shoogloo;

			Com_CP_Other_conformation_pending = Other;
			System.out
					.println(" Others domains Confirmation Pending total :::----" + Com_CP_Other_conformation_pending);

		}
		pageUtils.selectByIndexNumber(drpBookingStatus, 1);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String countt = flightResultsCountText.getText();
		System.out.println(countt);
		String R2str = countt.trim();
		String[] R2splited = R2str.split("\\:");
		System.out.println("No of Results Count" + R2splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(countt)) {
			System.out.println("Repricing Count = 0");
			Com_TH_Wego = 0;
			Com_TH_b2c = 0;
			Com_TH_MobIos = 0;
			Com_TH_MobAnd = 0;
			Com_TH_skyscan = 0;

			Com_TH_Dhrehlat = 0;
			Com_TH_Aviasa = 0;
			Com_TH_Kayak = 0;

			Com_TH_Dohop = 0;
			Com_TH_Farecompare = 0;
			Com_TH_Shoogloo = 0;
			int TotalValue = Com_TH_Wego + Com_TH_b2c + Com_TH_MobIos + Com_TH_MobAnd + Com_TH_skyscan + Com_TH_Dhrehlat
					+ Com_TH_Aviasa + Com_TH_Kayak + Com_TH_Dohop + Com_TH_Farecompare + Com_TH_Shoogloo;
			Com_TH_Transactionhold_total = TotalValue;

			int otherTotal = Com_TH_Dhrehlat + Com_TH_Aviasa + Com_TH_Kayak + Com_TH_Dohop + Com_TH_Farecompare
					+ Com_TH_Shoogloo;
			Com_Other_TH_Transactionhold_total = otherTotal;
			System.out.println("TransactionHold total:::----" + Com_Other_TH_Transactionhold_total);

			System.out.println("TransactionHold total:::----" + Com_TH_Transactionhold_total);
		} else {
			else_statement(Com_TH_Wego, Com_TH_b2c, Com_TH_MobAnd, Com_TH_MobIos, Com_TH_skyscan, Com_TH_Dhrehlat,
					Com_TH_Aviasa, Com_TH_Kayak, Com_TH_Dohop, Com_TH_Farecompare, Com_TH_Shoogloo);

			int TotalValue = Com_TH_Wego + Com_TH_b2c + Com_TH_MobIos + Com_TH_MobAnd + Com_TH_skyscan + Com_TH_Dhrehlat
					+ Com_TH_Aviasa + Com_TH_Kayak + Com_TH_Dohop + Com_TH_Farecompare + Com_TH_Shoogloo;
			Com_TH_Transactionhold_total = TotalValue;

			int otherTotal = Com_TH_Dhrehlat + Com_TH_Aviasa + Com_TH_Kayak + Com_TH_Dohop + Com_TH_Farecompare
					+ Com_TH_Shoogloo;
			Com_Other_TH_Transactionhold_total = otherTotal;
			System.out.println("TransactionHold total:::----" + Com_Other_TH_Transactionhold_total);

			System.out.println("TransactionHold total:::----" + Com_TH_Transactionhold_total);
		}
		logOut();
	}

	public void repricing_sa() throws InterruptedException {
		driver.get("http://sacallcenter.rehlat.com/");
		LoginCallCenter();

		WebElement checkbox = chkDisablePagination;

		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Already Check Box is selected");
		}

		WebElement isReprice = chkIsRepriced;
		if (!isReprice.isSelected())
			isReprice.click();
		else {
			System.out.println("Aleredy IsRepriced Check Box is selected");
		}

		select_FromDate();

		select_ToDate();
		pageUtils.selectByIndexNumber(drpBookingStatus, 13);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String Rcount = flightResultsCountText.getText();
		System.out.println(Rcount);
		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(Rcount)) {
			System.out.println("Repricing Count = 0");
			SA_RP_Wego = 0;
			SA_RP_b2c = 0;
			SA_RP_MobIos = 0;
			SA_RP_MobAnd = 0;
			SA_RP_skyscan = 0;

			SA_RP_Dhrehlat = 0;
			SA_RP_Aviasa = 0;
			SA_RP_Kayak = 0;

			SA_RP_Dohop = 0;
			SA_RP_Farecompare = 0;
			SA_RP_Shoogloo = 0;

			int TotalValue = SA_RP_Wego + SA_RP_b2c + SA_RP_MobIos + SA_RP_MobAnd + SA_RP_skyscan + SA_RP_Dhrehlat
					+ SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + SA_RP_Repricing_Total);

			int Other = SA_RP_Dhrehlat + SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + SA_RP_Other_Repricingtotal);

		} else {
			else_statement(SA_RP_Wego, SA_RP_b2c, SA_RP_MobAnd, SA_RP_MobIos, SA_RP_skyscan, SA_RP_Dhrehlat,
					SA_RP_Aviasa, SA_RP_Kayak, SA_RP_Dohop, SA_RP_Farecompare, SA_RP_Shoogloo);

			int TotalValue = SA_RP_Wego + SA_RP_b2c + SA_RP_MobIos + SA_RP_MobAnd + SA_RP_skyscan + SA_RP_Dhrehlat
					+ SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + SA_RP_Repricing_Total);

			int Other = SA_RP_Dhrehlat + SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + SA_RP_Other_Repricingtotal);

		}

		pageUtils.selectByIndexNumber(drpBookingStatus, 4);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String count = flightResultsCountText.getText();
		System.out.println(count);
		String R1str = count.trim();
		String[] R1splited = R1str.split("\\:");
		System.out.println("No of Results Count" + R1splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(count)) {
			System.out.println("Repricing Count = 0");
			SA_CP_Wego = 0;
			SA_CP_b2c = 0;
			SA_CP_MobIos = 0;
			SA_CP_MobAnd = 0;
			SA_CP_skyscan = 0;

			SA_CP_Dhrehlat = 0;
			SA_CP_Aviasa = 0;
			SA_CP_Kayak = 0;

			SA_CP_Dohop = 0;
			SA_CP_Farecompare = 0;
			SA_CP_Shoogloo = 0;

			int TotalValue = SA_CP_Wego + SA_CP_b2c + SA_CP_MobIos + SA_CP_skyscan + SA_CP_MobAnd + SA_CP_Dhrehlat
					+ SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + SA_CP_conformation_pending_Total);

			int Other = SA_CP_Dhrehlat + SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + SA_CP_Other_conformation_pending);

		} else {
			else_statement(SA_CP_Wego, SA_CP_b2c, SA_CP_MobAnd, SA_CP_MobIos, SA_CP_skyscan, SA_CP_Dhrehlat,
					SA_CP_Aviasa, SA_CP_Kayak, SA_CP_Dohop, SA_CP_Farecompare, SA_CP_Shoogloo);

			int TotalValue = SA_CP_Wego + SA_CP_b2c + SA_CP_MobIos + SA_CP_skyscan + SA_CP_MobAnd + SA_CP_Dhrehlat
					+ SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + SA_CP_conformation_pending_Total);

			int Other = SA_CP_Dhrehlat + SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + SA_CP_Other_conformation_pending);

		}
		pageUtils.selectByIndexNumber(drpBookingStatus, 1);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String countt = flightResultsCountText.getText();
		System.out.println(countt);
		String R2str = countt.trim();
		String[] R2splited = R2str.split("\\:");
		System.out.println("No of Results Count" + R2splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(countt)) {
			System.out.println("Repricing Count = 0");
			SA_TH_Wego = 0;
			SA_TH_b2c = 0;
			SA_TH_MobIos = 0;
			SA_TH_MobAnd = 0;
			SA_TH_skyscan = 0;

			SA_TH_Dhrehlat = 0;
			SA_TH_Aviasa = 0;
			SA_TH_Kayak = 0;

			SA_TH_Dohop = 0;
			SA_TH_Farecompare = 0;
			SA_TH_Shoogloo = 0;
			int TotalValue = SA_TH_Wego + SA_TH_b2c + SA_TH_MobIos + SA_TH_MobAnd + SA_TH_skyscan + SA_TH_Dhrehlat
					+ SA_TH_Aviasa + SA_TH_Kayak + SA_TH_Dohop + SA_TH_Farecompare + SA_TH_Shoogloo;
			SA_TH_Transactionhold_total = TotalValue;

			int otherTotal = SA_TH_Dhrehlat + SA_TH_Aviasa + SA_TH_Kayak + SA_TH_Dohop + SA_TH_Farecompare
					+ SA_TH_Shoogloo;
			SA_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + SA_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + SA_TH_Transactionhold_total);
		} else {
			else_statement(SA_TH_Wego, SA_TH_b2c, SA_TH_MobAnd, SA_TH_MobIos, SA_TH_skyscan, SA_TH_Dhrehlat,
					SA_TH_Aviasa, SA_TH_Kayak, SA_TH_Dohop, SA_TH_Farecompare, SA_TH_Shoogloo);

			int TotalValue = SA_TH_Wego + SA_TH_b2c + SA_TH_MobIos + SA_TH_MobAnd + SA_TH_skyscan + SA_TH_Dhrehlat
					+ SA_TH_Aviasa + SA_TH_Kayak + SA_TH_Dohop + SA_TH_Farecompare + SA_TH_Shoogloo;
			SA_TH_Transactionhold_total = TotalValue;

			int otherTotal = SA_TH_Dhrehlat + SA_TH_Aviasa + SA_TH_Kayak + SA_TH_Dohop + SA_TH_Farecompare
					+ SA_TH_Shoogloo;
			SA_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + SA_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + SA_TH_Transactionhold_total);
		}
		logOut();
	}

	public void repricing_ae() throws InterruptedException {
		driver.get("http://callcenter.rehlat.ae/");
		LoginCallCenter();

		WebElement checkbox = chkDisablePagination;

		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Already Check Box is selected");
		}

		WebElement isReprice = chkIsRepriced;
		if (!isReprice.isSelected())
			isReprice.click();
		else {
			System.out.println("Aleredy IsRepriced Check Box is selected");
		}

		select_FromDate();

		select_ToDate();
		pageUtils.selectByIndexNumber(drpBookingStatus, 13);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String Rcount = flightResultsCountText.getText();
		System.out.println(Rcount);
		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(Rcount)) {
			System.out.println("Repricing Count = 0");
			AE_RP_Wego = 0;
			AE_RP_b2c = 0;
			AE_RP_MobIos = 0;
			AE_RP_MobAnd = 0;
			AE_RP_skyscan = 0;

			AE_RP_Dhrehlat = 0;
			AE_RP_Aviasa = 0;
			AE_RP_Kayak = 0;

			AE_RP_Dohop = 0;
			AE_RP_Farecompare = 0;
			AE_RP_Shoogloo = 0;

			int TotalValue = AE_RP_Wego + AE_RP_b2c + AE_RP_MobIos + AE_RP_MobAnd + AE_RP_skyscan + AE_RP_Dhrehlat
					+ AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + AE_RP_Repricing_Total);

			int Other = AE_RP_Dhrehlat + AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + AE_RP_Other_Repricingtotal);

		} else {
			else_statement(AE_RP_Wego, AE_RP_b2c, AE_RP_MobAnd, AE_RP_MobIos, AE_RP_skyscan, AE_RP_Dhrehlat,
					AE_RP_Aviasa, AE_RP_Kayak, AE_RP_Dohop, AE_RP_Farecompare, AE_RP_Shoogloo);

			int TotalValue = AE_RP_Wego + AE_RP_b2c + AE_RP_MobIos + AE_RP_MobAnd + AE_RP_skyscan + AE_RP_Dhrehlat
					+ AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + AE_RP_Repricing_Total);

			int Other = AE_RP_Dhrehlat + AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + AE_RP_Other_Repricingtotal);

		}

		pageUtils.selectByIndexNumber(drpBookingStatus, 4);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String count = flightResultsCountText.getText();
		System.out.println(count);
		String R1str = count.trim();
		String[] R1splited = R1str.split("\\:");
		System.out.println("No of Results Count" + R1splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(count)) {
			System.out.println("Repricing Count = 0");
			AE_CP_Wego = 0;
			AE_CP_b2c = 0;
			AE_CP_MobIos = 0;
			AE_CP_MobAnd = 0;
			AE_CP_skyscan = 0;

			AE_CP_Dhrehlat = 0;
			AE_CP_Aviasa = 0;
			AE_CP_Kayak = 0;

			AE_CP_Dohop = 0;
			AE_CP_Farecompare = 0;
			AE_CP_Shoogloo = 0;

			int TotalValue = AE_CP_Wego + AE_CP_b2c + AE_CP_MobIos + AE_CP_skyscan + AE_CP_MobAnd + AE_CP_Dhrehlat
					+ AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + AE_CP_conformation_pending_Total);

			int Other = AE_CP_Dhrehlat + AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + AE_CP_Other_conformation_pending);

		} else {
			else_statement(AE_CP_Wego, AE_CP_b2c, AE_CP_MobAnd, AE_CP_MobIos, AE_CP_skyscan, AE_CP_Dhrehlat,
					AE_CP_Aviasa, AE_CP_Kayak, AE_CP_Dohop, AE_CP_Farecompare, AE_CP_Shoogloo);

			int TotalValue = AE_CP_Wego + AE_CP_b2c + AE_CP_MobIos + AE_CP_skyscan + AE_CP_MobAnd + AE_CP_Dhrehlat
					+ AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + AE_CP_conformation_pending_Total);

			int Other = AE_CP_Dhrehlat + AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + AE_CP_Other_conformation_pending);

		}
		pageUtils.selectByIndexNumber(drpBookingStatus, 1);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String countt = flightResultsCountText.getText();
		System.out.println(countt);
		String R2str = countt.trim();
		String[] R2splited = R2str.split("\\:");
		System.out.println("No of Results Count" + R2splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(countt)) {
			System.out.println("Repricing Count = 0");
			AE_TH_Wego = 0;
			AE_TH_b2c = 0;
			AE_TH_MobIos = 0;
			AE_TH_MobAnd = 0;
			AE_TH_skyscan = 0;

			AE_TH_Dhrehlat = 0;
			AE_TH_Aviasa = 0;
			AE_TH_Kayak = 0;

			AE_TH_Dohop = 0;
			AE_TH_Farecompare = 0;
			AE_TH_Shoogloo = 0;
			int TotalValue = AE_TH_Wego + AE_TH_b2c + AE_TH_MobIos + AE_TH_MobAnd + AE_TH_skyscan + AE_TH_Dhrehlat
					+ AE_TH_Aviasa + AE_TH_Kayak + AE_TH_Dohop + AE_TH_Farecompare + AE_TH_Shoogloo;
			AE_TH_Transactionhold_total = TotalValue;

			int otherTotal = AE_TH_Dhrehlat + AE_TH_Aviasa + AE_TH_Kayak + AE_TH_Dohop + AE_TH_Farecompare
					+ AE_TH_Shoogloo;
			AE_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + AE_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + AE_TH_Transactionhold_total);
		} else {
			else_statement(AE_TH_Wego, AE_TH_b2c, AE_TH_MobAnd, AE_TH_MobIos, AE_TH_skyscan, AE_TH_Dhrehlat,
					AE_TH_Aviasa, AE_TH_Kayak, AE_TH_Dohop, AE_TH_Farecompare, AE_TH_Shoogloo);

			int TotalValue = AE_TH_Wego + AE_TH_b2c + AE_TH_MobIos + AE_TH_MobAnd + AE_TH_skyscan + AE_TH_Dhrehlat
					+ AE_TH_Aviasa + AE_TH_Kayak + AE_TH_Dohop + AE_TH_Farecompare + AE_TH_Shoogloo;
			AE_TH_Transactionhold_total = TotalValue;

			int otherTotal = AE_TH_Dhrehlat + AE_TH_Aviasa + AE_TH_Kayak + AE_TH_Dohop + AE_TH_Farecompare
					+ AE_TH_Shoogloo;
			AE_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + AE_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + AE_TH_Transactionhold_total);
		}
		logOut();
	}

	public void repricing_eg() throws InterruptedException {
		driver.get("http://callcenter.rehlat.com.eg/");
		LoginCallCenter();

		WebElement checkbox = chkDisablePagination;

		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Already Check Box is selected");
		}

		WebElement isReprice = chkIsRepriced;
		if (!isReprice.isSelected())
			isReprice.click();
		else {
			System.out.println("Aleredy IsRepriced Check Box is selected");
		}

		select_FromDate();

		select_ToDate();
		pageUtils.selectByIndexNumber(drpBookingStatus, 13);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String Rcount = flightResultsCountText.getText();
		System.out.println(Rcount);
		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(Rcount)) {
			System.out.println("Repricing Count = 0");
			EG_RP_Wego = 0;
			EG_RP_b2c = 0;
			EG_RP_MobIos = 0;
			EG_RP_MobAnd = 0;
			EG_RP_skyscan = 0;

			EG_RP_Dhrehlat = 0;
			EG_RP_Aviasa = 0;
			EG_RP_Kayak = 0;

			EG_RP_Dohop = 0;
			EG_RP_Farecompare = 0;
			EG_RP_Shoogloo = 0;

			int TotalValue = EG_RP_Wego + EG_RP_b2c + EG_RP_MobIos + EG_RP_MobAnd + EG_RP_skyscan + EG_RP_Dhrehlat
					+ EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + EG_RP_Repricing_Total);

			int Other = EG_RP_Dhrehlat + EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + EG_RP_Other_Repricingtotal);

		} else {
			else_statement(EG_RP_Wego, EG_RP_b2c, EG_RP_MobAnd, EG_RP_MobIos, EG_RP_skyscan, EG_RP_Dhrehlat,
					EG_RP_Aviasa, EG_RP_Kayak, EG_RP_Dohop, EG_RP_Farecompare, EG_RP_Shoogloo);

			int TotalValue = EG_RP_Wego + EG_RP_b2c + EG_RP_MobIos + EG_RP_MobAnd + EG_RP_skyscan + EG_RP_Dhrehlat
					+ EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + EG_RP_Repricing_Total);

			int Other = EG_RP_Dhrehlat + EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + EG_RP_Other_Repricingtotal);

		}

		pageUtils.selectByIndexNumber(drpBookingStatus, 4);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String count = flightResultsCountText.getText();
		System.out.println(count);
		String R1str = count.trim();
		String[] R1splited = R1str.split("\\:");
		System.out.println("No of Results Count" + R1splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(count)) {
			System.out.println("Repricing Count = 0");
			EG_CP_Wego = 0;
			EG_CP_b2c = 0;
			EG_CP_MobIos = 0;
			EG_CP_MobAnd = 0;
			EG_CP_skyscan = 0;

			EG_CP_Dhrehlat = 0;
			EG_CP_Aviasa = 0;
			EG_CP_Kayak = 0;

			EG_CP_Dohop = 0;
			EG_CP_Farecompare = 0;
			EG_CP_Shoogloo = 0;

			int TotalValue = EG_CP_Wego + EG_CP_b2c + EG_CP_MobIos + EG_CP_skyscan + EG_CP_MobAnd + EG_CP_Dhrehlat
					+ EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + EG_CP_conformation_pending_Total);

			int Other = EG_CP_Dhrehlat + EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + EG_CP_Other_conformation_pending);

		} else {
			else_statement(EG_CP_Wego, EG_CP_b2c, EG_CP_MobAnd, EG_CP_MobIos, EG_CP_skyscan, EG_CP_Dhrehlat,
					EG_CP_Aviasa, EG_CP_Kayak, EG_CP_Dohop, EG_CP_Farecompare, EG_CP_Shoogloo);

			int TotalValue = EG_CP_Wego + EG_CP_b2c + EG_CP_MobIos + EG_CP_skyscan + EG_CP_MobAnd + EG_CP_Dhrehlat
					+ EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + EG_CP_conformation_pending_Total);

			int Other = EG_CP_Dhrehlat + EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + EG_CP_Other_conformation_pending);

		}
		pageUtils.selectByIndexNumber(drpBookingStatus, 1);
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.isElementDisplayed(driver, flightResultsCountText);
		String countt = flightResultsCountText.getText();
		System.out.println(countt);
		String R2str = countt.trim();
		String[] R2splited = R2str.split("\\:");
		System.out.println("No of Results Count" + R2splited[1]);
		Thread.sleep(1000);

		if ("Flight Search Results : 0".equals(countt)) {
			System.out.println("Repricing Count = 0");
			EG_TH_Wego = 0;
			EG_TH_b2c = 0;
			EG_TH_MobIos = 0;
			EG_TH_MobAnd = 0;
			EG_TH_skyscan = 0;

			EG_TH_Dhrehlat = 0;
			EG_TH_Aviasa = 0;
			EG_TH_Kayak = 0;

			EG_TH_Dohop = 0;
			EG_TH_Farecompare = 0;
			EG_TH_Shoogloo = 0;
			int TotalValue = EG_TH_Wego + EG_TH_b2c + EG_TH_MobIos + EG_TH_MobAnd + EG_TH_skyscan + EG_TH_Dhrehlat
					+ EG_TH_Aviasa + EG_TH_Kayak + EG_TH_Dohop + EG_TH_Farecompare + EG_TH_Shoogloo;
			EG_TH_Transactionhold_total = TotalValue;

			int otherTotal = EG_TH_Dhrehlat + EG_TH_Aviasa + EG_TH_Kayak + EG_TH_Dohop + EG_TH_Farecompare
					+ EG_TH_Shoogloo;
			EG_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + EG_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + EG_TH_Transactionhold_total);
		} else {
			else_statement(EG_TH_Wego, EG_TH_b2c, EG_TH_MobAnd, EG_TH_MobIos, EG_TH_skyscan, EG_TH_Dhrehlat,
					EG_TH_Aviasa, EG_TH_Kayak, EG_TH_Dohop, EG_TH_Farecompare, EG_TH_Shoogloo);

			int TotalValue = EG_TH_Wego + EG_TH_b2c + EG_TH_MobIos + EG_TH_MobAnd + EG_TH_skyscan + EG_TH_Dhrehlat
					+ EG_TH_Aviasa + EG_TH_Kayak + EG_TH_Dohop + EG_TH_Farecompare + EG_TH_Shoogloo;
			EG_TH_Transactionhold_total = TotalValue;

			int otherTotal = EG_TH_Dhrehlat + EG_TH_Aviasa + EG_TH_Kayak + EG_TH_Dohop + EG_TH_Farecompare
					+ EG_TH_Shoogloo;
			EG_TH_Other_TransactionholdTotal = otherTotal;
			System.out.println("TransactionHold total:::----" + EG_TH_Other_TransactionholdTotal);

			System.out.println("TransactionHold total:::----" + EG_TH_Transactionhold_total);
		}
		logOut();
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		// Store unique items in result.
		ArrayList<String> result = new ArrayList<>();

		// Record encountered Strings in HashSet.
		HashSet<String> set = new HashSet<>();

		// Loop over argument list.
		for (String item : list) {

			// If String is not in set, add it to the list and the set.
			if (!set.contains(item)) {
				result.add(item);
				set.add(item);
			}
		}
		return result;
	}

	public  void Wego_num(int value) {
		
		List<WebElement> SWEGO = wegoSize;
		System.out.println("No of WEGO :" + SWEGO.size());
		String Com_TS_Wego1 = String.format("%1s", SWEGO.size());
		value = Integer.parseInt(Com_TS_Wego1);
		

	}

	public void Wego_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
		
	}

	public void B2C_num(int value) {

		List<WebElement> b2c = b2cSize;
		System.out.println("No of B2C :" + b2c.size());
		String Com_TS_Wego1 = String.format("%1s", b2c.size());
		value = Integer.parseInt(Com_TS_Wego1);
		System.out.println("value:"+value);

	}

	public void B2C_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void MOBIOS_num(int value) {

		List<WebElement> mobIos = mobIosSize;
		System.out.println("No of MOBIOS :" + mobIos.size());
		String Com_TS_Wego1 = String.format("%1s", mobIos.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void MOBIOS_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void MOBAPP_num(int value) {

		List<WebElement> mobApp = mobAppSize;
		System.out.println("No of MOBAPP :" + mobApp.size());
		String Com_TS_Wego1 = String.format("%1s", mobApp.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void MOBAPP_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void SKYSCN_num(int value) {

		List<WebElement> skyscn = skyscnSize;
		System.out.println("No of SKYSCN :" + skyscn.size());
		String Com_TS_Wego1 = String.format("%1s", skyscn.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void SKYSCN_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void DHREHLAT_num(int value) {

		List<WebElement> dhrehlat = dhrehlatSize;
		System.out.println("No of DHREHLAT :" + dhrehlat.size());
		String Com_TS_Wego1 = String.format("%1s", dhrehlat.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void DHREHLAT_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void AVIASALES_num(int value) {

		List<WebElement> avia = aviasalesSize;
		System.out.println("No of AVIASALES :" + avia.size());
		String Com_TS_Wego1 = String.format("%1s", avia.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void AVIASALES_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void KAYAK_num(int value) {

		List<WebElement> kayak = kayakSize;
		System.out.println("No of KAYAK :" + kayak.size());
		String Com_TS_Wego1 = String.format("%1s", kayak.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void KAYAK_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void DOHOP_num(int value) {

		List<WebElement> dohop = dohopSize;
		System.out.println("No of DOHOP :" + dohop.size());
		String Com_TS_Wego1 = String.format("%1s", dohop.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void DOHOP_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void FARECOMPARE_num(int value) {

		List<WebElement> farecom = fareCompareSize;
		System.out.println("No of FARECOMPARE :" + farecom.size());
		String Com_TS_Wego1 = String.format("%1s", farecom.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void FARECOMPARE_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void SHOOGLOO_num(int value) {

		List<WebElement> shoogloo = shooglooSize;
		System.out.println("No of SHOOGLOO :" + shoogloo.size());
		String Com_TS_Wego1 = String.format("%1s", shoogloo.size());
		value = Integer.parseInt(Com_TS_Wego1);

	}

	public void SHOOGLOO_null(int value) {
		String Com_TS_Wego1 = String.format("%1s", 0);
		value = Integer.parseInt(Com_TS_Wego1);
	}

	public void else_statement(int we, int b2c, int android, int ios, int sky, int dhr, int avi, int kay, int doh,
			int fare, int sho) throws InterruptedException {
		List<WebElement> WE1 = totalTableSize;
		System.out.println("Total Number of Repricing:" + WE1.size());
		Thread.sleep(2000);

		ArrayList<String> list = new ArrayList<>();

		for (WebElement element1 : WE1) {
			list.add(element1.getText());
		}
		ArrayList<String> unique = removeDuplicates(list);
		System.out.println("unique:" + unique.size());
		for (String element : unique) {
			System.out.println("element:" + element);

			String number = element;
			for (int j = 0; j < unique.size(); j++) {
				switch (number) {
				case "WEGO":
					if (element.equals("WEGO")) {
						Wego_num(we);
						System.out.println("we:"+we);

					} else {
						Wego_null(we);
					}
					break;
				case "B2C":
					if (element.equals("B2C")) {
						B2C_num(b2c);

					} else {
						B2C_null(b2c);
					}
					break;
				case "MOBIOS":
					if (element.equals("MOBIOS")) {
						MOBIOS_num(ios);

					} else {
						MOBIOS_null(ios);
					}
					break;
				case "MOBAPP":
					if (element.equals("MOBAPP")) {
						MOBAPP_num(android);

					} else {
						MOBAPP_null(android);
					}
					break;
				case "SKYSCN":
					if (element.equals("SKYSCN")) {
						SKYSCN_num(sky);

					} else {
						SKYSCN_null(sky);
					}
					break;
				case "DHREHLAT":
					if (element.equals("DHREHLAT")) {
						DHREHLAT_num(dhr);

					} else {
						DHREHLAT_null(dhr);
					}
					break;
				case "AVIASALES":
					if (element.equals("AVIASALES")) {
						AVIASALES_num(avi);

					} else {
						AVIASALES_null(avi);
					}
					break;
				case "KAYAK":
					if (element.equals("KAYAK")) {
						KAYAK_num(kay);

					} else {
						KAYAK_null(kay);
					}
					break;
				case "DOHOP":
					if (element.equals("DOHOP")) {
						DOHOP_num(doh);

					} else {
						DOHOP_null(doh);
					}
					break;
				case "FARECOMPARE":
					if (element.equals("FARECOMPARE")) {
						FARECOMPARE_num(fare);

					} else {
						FARECOMPARE_null(fare);
					}
					break;
				case "SHOOGLOO":
					if (element.equals("SHOOGLOO")) {
						FARECOMPARE_num(sho);

					} else {
						FARECOMPARE_null(sho);
					}
					break;
				default:
					System.out.println("NO DATA FOUND");

				}
			}
		}
	}

	

}
