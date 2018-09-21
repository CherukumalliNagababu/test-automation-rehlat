package cloud.rehlat.pages.discount_codes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.constants.engine.EngineConstants;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.TravellerInformationPage;
import cloud.rehlat.utils.BrowserUtils;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;
import cucumber.api.DataTable;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class DiscountsPage{
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;
	String SelectedFromCity;
	String SelectedToCity;
	String firstName;
	String middleName;
	String lastName;
	WritableWorkbook wwb;
	WritableSheet ws;
	public DiscountsPage(WebDriver driver) {
		
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	
	@FindBy(id = "autoFlyingFrom1")
	private WebElement txtFlyFrom;
	@FindBy(id = "autoFlyingTo1")
	private WebElement txtFlyTo;
	@FindBy(id = "Fromdated1")
	private WebElement btnDateFrom;
	@FindBy(xpath = "//div[@class='fa fa-chevron-right']")
	private WebElement dateIconBtnFrom;
	@FindBy(xpath = ".//*[@id='flightForm']/div/div/div/div/div[1]/div[2]//table/tbody/tr/td")
	private List<WebElement> allDates;
	@FindBy(id = "dropdownMenu1")
	private WebElement drpTraveler;
	@FindBy(css = "span.add")
	private WebElement clickAdultIncrement;
	@FindBy(xpath = "//div[2]/div/span/span[2]")
	private WebElement clickChildIncrement;
	@FindBy(xpath = "//div[3]/div/span/span[2]")
	private WebElement clickInfantsIncrement;
	@FindBy(xpath = "//a[contains(text(),'Done')]")
	private WebElement btnTravellerDone;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::button[1]")
	private WebElement btnSearch;
	@FindBy(xpath = "//div[2]/div/div/div[2]/button")
	private WebElement btnBookNowFirst;
	@FindBy(id = "FirstPaxEmailAddress")
	private WebElement txtEmail;
	@FindBy(id = "couponcode")
	private WebElement txtCouponCode;
	@FindBy(xpath = "//a[contains(text(),'Apply')]")
	private WebElement btnApply;
	@FindBy(css = "#compactButtonDesk")
	private WebElement btnContinueBooking;
	// Adult 1 with passport
		@FindBy(css = "select[name=\"Pax[0].Gender\"]")
		private WebElement drpAdultG1;
		@FindBy(css = "#Adult_FirstName1")
		private WebElement txtAdultfirstName1;
		@FindBy(css = "#Adult_LastName1")
		private WebElement txtAdultLastName1;
		@FindBy(css = "#AdultDate0")
		private WebElement drpAdultDate1;
		@FindBy(css = "#AdultMonth0")
		private WebElement drpAdultMonth1;
		@FindBy(css = "#AdultYear0")
		private WebElement drpAdultYear1;
		@FindBy(name = "Pax[0].PassportNo")
		private WebElement txtAdultPassportNum1;
		@FindBy(css = "#Adult_Nationality_0")
		private WebElement drpAdultnationality1;
		@FindBy(css = "#Adult_IssuingCountryCode_0")
		private WebElement drpAdultIssuing1;
		@FindBy(css = "#PassAdultDate0")
		private WebElement drpAdultExpDate1;
		@FindBy(css = "#PassAdultMonth0")
		private WebElement drpAdultExpMonth1;
		@FindBy(css = "#PassAdultYear0")
		private WebElement drpAdultExpYear1;
		
		@FindBy(id = "Child_Gender1")
		private WebElement drpChildG1;
		@FindBy(id = "Child_FirstName1")
		private WebElement txtChildFirstName1;
		@FindBy(id = "Child_MiddleName1")
		private WebElement txtChildMiddleName1;
		@FindBy(id = "Child_LastName1")
		private WebElement txtChildLastName1;
		@FindBy(id = "ChildDate1")
		private WebElement drpChildDate1;
		@FindBy(id = "ChildMonth1")
		private WebElement drpChildMonth1;
		@FindBy(id = "ChildYear1")
		private WebElement drpChildYear1;
		@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
		private WebElement txtChildPassportNum1;
		@FindBy(id = "Child_Nationality_0")
		private WebElement drpChildnationality1;
		@FindBy(id = "Child_IssuingCountryCode_0")
		private WebElement drpChildIssuing1;
		@FindBy(id = "PassChildDate1")
		private WebElement drpChildExpDate1;
		@FindBy(id = "PassChildMonth1")
		private WebElement drpChildExpMonth1;
		@FindBy(id = "PasschildYear1")
		private WebElement drpChildExpYear1;
		@FindBy(css = "select[name=\"Pax[1].Gender\"]")
		private WebElement drpInfantG1;
		@FindBy(id = "Infant_FirstName1")
		private WebElement txtInfantFirstName1;
		@FindBy(id = "Infant_MiddleName1")
		private WebElement txtInfantMiddleName1;
		@FindBy(id = "Infant_LastName1")
		private WebElement txtInfantLastName1;
		@FindBy(id = "InfantDate1")
		private WebElement drpInfantDate1;
		@FindBy(id = "InfantMonth1")
		private WebElement drpInfantMonth1;
		@FindBy(id = "InfantYear1")
		private WebElement drpInfantYear1;
		@FindBy(name = "Pax[1].PassportNo")
		private WebElement txtInfantPassportNum1;
		@FindBy(id = "Infant_Nationality_0")
		private WebElement drpInfantnationality1;
		@FindBy(id = "Infant_IssuingCountryCode_0")
		private WebElement drpInfantIssuing1;
		@FindBy(id = "PassInfantDate1")
		private WebElement drpInfantExpDate1;
		@FindBy(id = "PassInfantMonth1")
		private WebElement drpInfantExpMonth1;
		@FindBy(id = "PassInfantYear1")
		private WebElement drpInfantExpYear1;
		
		@FindBy(css = "select[name=\"Pax[2].Gender\"]")
		private WebElement drpInfantG2;
		@FindBy(id = "Infant_FirstName2")
		private WebElement txtInfantFirstName2;
		@FindBy(id = "Infant_MiddleName2")
		private WebElement txtInfantMiddleName2;
		@FindBy(id = "Infant_LastName2")
		private WebElement txtInfantLastName2;
		@FindBy(id = "InfantDate2")
		private WebElement drpInfantDate2;
		@FindBy(id = "InfantMonth2")
		private WebElement drpInfantMonth2;
		@FindBy(id = "InfantYear2")
		private WebElement drpInfantYear2;
		@FindBy(name = "Pax[2].PassportNo")
		private WebElement txtInfantPassportNum2;
		@FindBy(id = "Infant_Nationality_1")
		private WebElement drpInfantnationality2;
		@FindBy(id = "Infant_IssuingCountryCode_1")
		private WebElement drpInfantIssuing2;
		@FindBy(id = "PassInfantDate2")
		private WebElement drpInfantExpDate2;
		@FindBy(id = "PassInfantMonth2")
		private WebElement drpInfantExpMonth2;
		@FindBy(id = "PassInfantYear2")
		private WebElement drpInfantExpYear2;
		
		@FindBy(id = "PhonenumberTraveller")
		private WebElement txtPhoneNumber;
		@FindBy(css = "#btnMakepayment")
		private WebElement btnPaySecurely;
		// payment page
		@FindBy(xpath = ".//*[@id='container']/div/div/div[1]/a/h4")
		private WebElement paymentHeaderText;
		@FindBy(xpath = ".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/span[1]/a")
		private WebElement lnkAirLineShomeMore;
		@FindBy(xpath = ".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr/td[2]")
		private List<WebElement> airLineNames;
		@FindBy(xpath = ".//*[@id='container']/div[2]/div[1]/div/div/div[1]/div/span")
		private WebElement NFRF;
		
		@FindBy(id="radio_1")
		private WebElement radioOneWay;
		
		//call center
		@FindBy(id="Email")
		private WebElement txtEmailCallCenter;
		@FindBy(id="Password")
		private WebElement txtPwdCallCenter;
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement btnLoginCallcenter;
		@FindBy(id="DisablePagination")
		private WebElement chkDisablePagination;
		@FindBy(xpath="//input[@value='Search']")
		private WebElement btnSearchCallcenter;
		@FindBy(xpath="//div[@id='searchresults']/div/div/div[2]")
		private WebElement getFlightResultsText;
		@FindBy(xpath=".//*[@id='searchresults']/div/div[2]/table/tbody[1]/tr/td[12]/a")
		private WebElement lnkViewFirst;
		@FindBy(linkText="Payment Summary")
		private WebElement lnkPaymentSummary;
		@FindBy(xpath=".//*[@id='divPopupPayment']/div[2]/div/div[2]/span")
		private WebElement markDownText;
		@FindBy(xpath=".//*[@id='searchresults']/div/div[2]/table/tbody[1]/tr/td[1]")
		private WebElement bookingId;
		@FindBy(xpath=".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]")
		private List<WebElement> bookingIdS;
		@FindBy(xpath=".//*[@id='ul-4']/li/md-autocomplete-parent-scope/div/span/strong[@class='ng-binding']")
		private List<WebElement> fromCityes;
		@FindBy(xpath=".//*[@id='ul-5']/li/md-autocomplete-parent-scope/div/span/strong")
		private List<WebElement> toCityes;
		
		
		public void noFlightResutsFound()
		{
			try{
			String text=pageUtils.getTextOfElement(driver, NFRF);
			if(text.equals("NO FLIGHTS RESULTS FOUND !!!"))
			{
				System.out.println("NO FLIGHTS RESULTS FOUND");
			}
			}
			catch(Exception e)
			{
				
			}
		}
		
		public void airLineShowMoreLink() throws InterruptedException
		{
			pageUtils.scrollDown(driver);
			try{
				if(lnkAirLineShomeMore.isDisplayed()){
			pageUtils.clickElement(driver, lnkAirLineShomeMore);
				}
			}
			catch(Exception e)
			{
				
			}
			//airLineName("Emirates");
			
		}
		
		public  void SelectAirline(String value) throws InterruptedException, RowsExceededException, WriteException
		{
			
			for (int i = 1; i < airLineNames.size(); i++) {
				String test = driver.findElement(By.xpath(".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr[" + i + "]/td[2]")).getText();
				System.out.println("AirLine Name:" + test);
				
				
				
				if (value.equals(test)) {
					System.out.println("value:"+value);
					WebElement e = driver.findElement(By.xpath(".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr[" + i + "]/td[1]"));
				  e.click();
				  Label l2=new Label(6,i,"");
				  ws.addCell(l2);
				  pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
				  break;
				}
				else
				{
					 Label l2=new Label(6,i,"No Airlines Found");
					  ws.addCell(l2);
				}
					
		
		}
			
		}
		public void airLineName(String value)
		{
			for (WebElement we : airLineNames) {
				if (we.getText().equals(value)) {
					we.click();
					break;
				}
			}
		}
	/**
	 * this method is used Select month
	 * 
	 * @throws InterruptedException
	 */
	public void selectmonth() throws InterruptedException {
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnDateFrom);
		for (int i = 0; i < 0; i++) {
			pageUtils.clickElement(driver, dateIconBtnFrom);
		}
	}

	/**
	 * this method is used Select date @throws
	 */
	public void selectDate() {

		List<WebElement> li = allDates;
		for (WebElement we : li) {
			String st = we.getText();
			if (st.equalsIgnoreCase(DataConstants.USER_SELECT_DATE)) {
				we.click();
				break;
			}
		}
	}
	/**
	 * This method is used to select number of traveler details
	 * 
	 * @param dataMap
	 * @throws InterruptedException
	 */
	public void selectTravellerDetails() throws InterruptedException {

		String numofAdults = "1";
		String numofChilds = "1";
		String numofInfants = "1";

		pageUtils.clickElement(driver, drpTraveler);

		int Adult = Integer.parseInt(numofAdults);

		for (int i = 0; i < Adult - 1; i++) {
			pageUtils.clickElement(driver, clickAdultIncrement);
		}

		/*int Child = Integer.parseInt(numofChilds);

		for (int i = 0; i < Child; i++) {
			pageUtils.clickElement(driver, clickChildIncrement);
		}
		int infant = Integer.parseInt(numofInfants);

		for (int i = 0; i < infant; i++) {
			pageUtils.clickElement(driver, clickInfantsIncrement);
		}*/
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnTravellerDone);
	}

	/**
	 * This method is used to Click on Search button
	 * 
	 * @throws InterruptedException
	 */
	public void clickSearch() throws InterruptedException {
		pageUtils.clickElement(driver, btnSearch);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	}
	/**
	 * This method is used to Click On Book now Top Button
	 */
	public void clickOnBookNow() {
		pageUtils.clickElement(driver, btnBookNowFirst);
	}
	/**
	 * this method is used to enter email id
	 */
	public void enterEmail() {
		pageUtils.sendKeysAfterClearingElement(driver, txtEmail, "naga.ch199@gmail.com");
	}
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
	public void randomNames() {
		firstName = TestDataUtils.getFirstName();
		middleName = TestDataUtils.getMiddleName();
		lastName = TestDataUtils.getlastName();
	}
	public void adult1() {
		pageUtils.selectByVisibleText(drpAdultG1, "Male");
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName1, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName1, lastName);

		try {
			if (drpAdultDate1.isDisplayed())
				pageUtils.selectByVisibleText(drpAdultDate1, "12");
			pageUtils.selectByVisibleText(drpAdultMonth1, "May");
			pageUtils.selectByVisibleText(drpAdultYear1, "1999");
			adult_passport1();

		} catch (Exception e) {
			//System.out.println("Exception:" + e.getMessage());
		}
	}
	public void adult_passport1() {
		try {
			if (txtAdultPassportNum1.isDisplayed()) {
				pageUtils.sendKeysToElement(driver, txtAdultPassportNum1, "243535");
				pageUtils.selectByVisibleText(drpAdultnationality1, "India");
				pageUtils.selectByVisibleText(drpAdultIssuing1, "India");
				pageUtils.selectByVisibleText(drpAdultExpDate1, "15");
				pageUtils.selectByVisibleText(drpAdultExpMonth1, "Jun");
				pageUtils.selectByVisibleText(drpAdultExpYear1, "2027");
			}
		} catch (Exception e) {

		}
	}
	public void child()
	{
		pageUtils.selectByVisibleText(drpChildG1, "Male");
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
		AdultNumber1_CompareToChild();
	}
	public void AdultNumber1_CompareToChild() {

		pageUtils.selectByVisibleText(drpChildDate1, "12");
		pageUtils.selectByVisibleText(drpChildMonth1, "May");
		pageUtils.selectByVisibleText(drpChildYear1, "2008");
		AdultNumber1_passportexpiry();

	}

	public void AdultNumber1_passportexpiry() {
		try {
			if (drpChildExpDate1.isDisplayed()) {
				pageUtils.selectByVisibleText(drpChildExpDate1, "15");
				pageUtils.selectByVisibleText(drpChildExpMonth1, "Jun");
				pageUtils.selectByVisibleText(drpChildExpYear1, "2027");
			}
		} catch (Exception e) {

		}
	}
	public void Infant()
	{
		randomNames();
		pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, lastName);
		AdultChildNumber2_CompareToInfant();
	}
	
	public void AdultChildNumber2_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG2, "Male");
		pageUtils.selectByVisibleText(drpInfantDate2, "12");
		pageUtils.selectByVisibleText(drpInfantMonth2, "May");
		pageUtils.selectByVisibleText(drpInfantYear2, "2017");
		infant2_passport();
	}

	public void infant2_passport() {
		try {
			if (txtInfantPassportNum2.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum2, "456789123");

				pageUtils.selectByVisibleText(drpInfantExpDate2, "12");
				pageUtils.selectByVisibleText(drpInfantExpMonth2, "May");
				pageUtils.selectByVisibleText(drpInfantExpYear2, "2025");
			}
		} catch (Exception e) {

		}
	}
	
	public void callCenter(int i,String markDownCode) throws InterruptedException, RowsExceededException, WriteException, IOException
	{
	driver.manage().deleteAllCookies();
	driver.get("http://stageaecallcenter.rehlat.ae/");
	pageUtils.sendKeysAfterClearingElement(driver, txtEmailCallCenter, "agent@rehlat.com");
	pageUtils.sendKeysAfterClearingElement(driver, txtPwdCallCenter, "123789");
	pageUtils.clickElement(driver, btnLoginCallcenter);
	pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	//Open on Com
	/*WebElement checkbox = chkDisablePagination;
	if (!checkbox.isSelected()){
		checkbox.click();
	}
	else
	{
		System.out.println("Alerdy Check Box is selected");
	}*/
	
	pageUtils.clickElement(driver,btnSearchCallcenter);
	pageUtils.isElementDisplayed(driver, getFlightResultsText);
	 String bookinId=pageUtils.getTextOfElement(driver, bookingId);
	 System.out.println(bookinId);
	  Label l3=new Label(6,i,bookinId);
	  ws.addCell(l3);
	  //****************************
	 /* for (int i2 = 1; i2 < bookingIdS.size(); i2++) {
			String test = driver.findElement(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody[" + i2 + "]/tr/td[1]")).getText();
			System.out.println("Booking Id:" + test);
			
			
			
			if (bookinId.equals(test)) {
				System.out.println("value:"+bookinId);
				WebElement e = driver.findElement(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody[" + i2 + "]/tr/td[12]/a"));
			  e.click();

			  break;
			}
			
				
	  }*/
	  //********************************
	pageUtils.clickElement(driver, lnkViewFirst);
	pageUtils.switchWindows(driver);
	pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	pageUtils.scrollDown(driver);
	pageUtils.isElementDisplayed(driver, lnkPaymentSummary);
	pageUtils.clickElement(driver, lnkPaymentSummary);
	pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
	String getTheValue = pageUtils.getTextOfElement(driver, markDownText);
	System.out.println(getTheValue);
	
	String getCode = getTheValue.split(" ")[16];
	System.out.println("getDate:"+getCode);
	
	 Label l2=new Label(7,i,getCode);
	  ws.addCell(l2);
	  System.out.println("markDownCode::"+markDownCode);
	  if(getCode.equals(markDownCode))
	  {
		
		  Label lc=new Label(8,i,"PASS");
		  ws.addCell(lc);
	  }
	  else
	  {
		  Label lc=new Label(8,i,"FAIL");
		  ws.addCell(lc);
	  }
	  
	  driver.close();
	 pageUtils.switchToParentWindow(driver);
	
	
	}
	
	public void fromCity(String cityCode) throws InterruptedException
	{
		System.out.println("****************************"+cityCode);
		for (int i = 1; i <=fromCityes.size(); i++) {
	
		WebElement test = driver.findElement(By.xpath(".//*[@id='ul-4']/li[" + i + "]/md-autocomplete-parent-scope/div/span/strong[@class='ng-binding']"));
		String a=test.getText();
		String afterSpaceRemove=a.replaceAll("\\s+","");
		System.out.println("afterSpaceRemove:" + afterSpaceRemove);
		try{
		if (cityCode.equals(afterSpaceRemove)) {
			System.out.println("fromCityCode:"+cityCode);
			WebElement e = driver.findElement(By.xpath(".//*[@id='ul-4']/li[" + i + "]/md-autocomplete-parent-scope/div"));
		  e.click();
		  break;
	}
		}
		catch(Exception e)
		{
			
		}
		}
	}
	public void toCity(String cityCode) throws InterruptedException
	{
		for (int i = 1; i <= toCityes.size(); i++) {
			
			WebElement test = driver.findElement(By.xpath(".//*[@id='ul-5']/li[" + i + "]/md-autocomplete-parent-scope/div/span/strong[@class='ng-binding']"));
			String a=test.getText();
			String afterSpaceRemove=a.replaceAll("\\s+","");
			System.out.println("afterSpaceRemove:" + afterSpaceRemove);
			
			if (cityCode.equals(afterSpaceRemove)) {
				System.out.println("toCityCode:"+cityCode);
				WebElement e = driver.findElement(By.xpath(".//*[@id='ul-5']/li[" + i + "]/md-autocomplete-parent-scope/div"));
			  e.click();
			  break;
		}
			}
	}
	
	public void readExcel () throws IOException, InterruptedException, BiffException, RowsExceededException, WriteException{
		
	   
		
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/MarkDowns_18th Sep.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet s=wb.getSheet("Sheet1");
		
		FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/MarkdownResults.xls");
		 wwb=Workbook.createWorkbook(fo);
		ws=wwb.createSheet("Results",0);
		for (int i = 0; i < s.getRows(); i++) {
		    for (int j = 0; j < s.getColumns(); j++) {
		    Label l1 = new Label(j, i, s.getCell(j, i).getContents());
		    Label lid=new Label(6,0,"BOOKING ID");
		    Label lmark=new Label(7,0,"Markdown_as_Per_Callcenter");
		    Label lres=new Label(8,0,"RESULT");
		    ws.addCell(lid);
		    ws.addCell(lmark);
		    ws.addCell(lres);
		    ws.addCell(l1);
		    
		   }
	}
		for(int i=1;i<s.getRows();i++)
		{
			  pageUtils.sendKeysAfterClearingElement(driver, txtFlyFrom, s.getCell(1,i).getContents());
			  System.out.println(s.getCell(1,i).getContents());
			  pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			  fromCity(s.getCell(1,i).getContents());
			
				
				pageUtils.sendKeysAfterClearingElement(driver, txtFlyTo, s.getCell(2,i).getContents());
				 System.out.println(s.getCell(2,i).getContents());
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
				toCity(s.getCell(2,i).getContents());
				
				
				
				clickSearch();
				try{
					//String text=pageUtils.getTextOfElement(driver, NFRF);
					//System.out.println(text);
					if(NFRF.getText().equals("NO FLIGHTS RESULTS FOUND !!!"))
					{
						System.out.println("NO FLIGHTS RESULTS FOUND");
						 Label l2=new Label(6,i,"NO FLIGHTS RESULTS FOUND");
						  ws.addCell(l2);
						  
						 String test= System.getProperty("application", "AE");
							System.out.println(test);
							if(test.equals("AE"))
							{
								driver.manage().deleteAllCookies();
								driver.get(BrowserConstants.ENG_AE_STG_URL);
								
							}

							String stg=System.getProperty("environment", "STG");
							if(stg.equals("STG"))
							{
							driver.switchTo().alert().sendKeys("ros@965");
							driver.switchTo().alert().accept();
							pageUtils.isElementDisplayed(driver, radioOneWay);
							pageUtils.clickElement(driver, radioOneWay);
							}
					}
					
					}
					catch(Exception e)
					{
						airLineShowMoreLink();
						
						

						for (int i1 = 1; i1 < airLineNames.size(); i1++) {
							String test = driver.findElement(By.xpath(".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr[" + i1 + "]/td[2]")).getText();
							System.out.println("AirLine Name:" + test);
							
							String s1=s.getCell(3,i).getContents();
							System.out.println("naga:"+s1);
							
							if (s.getCell(3,i).getContents().equalsIgnoreCase(test)) {
								System.out.println("value:"+s.getCell(3,i).getContents());
								WebElement e1 = driver.findElement(By.xpath(".//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr[" + i1 + "]/td[1]"));
							  e1.click();
							  
							  pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
							  
							    clickOnBookNow();
								enterEmail();
								clickContinueBooking();
								adult1();
								pageUtils.sendKeysAfterClearingElement(driver, txtPhoneNumber, DataConstants.USER_PHONE_NUMBER);
								pageUtils.clickElement(driver, btnPaySecurely);
								
								//pageUtils.waitForElementTextToBe(driver, paymentHeaderText, "PAYMENT");
								 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_LONG);
								 Label l2=new Label(6,i,"Working Fine");
								  ws.addCell(l2);
								
								  callCenter(i,s.getCell(0,i).getContents());
								
								 
							  break;
							}
							else if(s.getCell(3,i).getContents().isEmpty()) {
								System.out.println("******************");
								
								  
								    clickOnBookNow();
									enterEmail();
									clickContinueBooking();
									adult1();
									pageUtils.sendKeysAfterClearingElement(driver, txtPhoneNumber, DataConstants.USER_PHONE_NUMBER);
									pageUtils.clickElement(driver, btnPaySecurely);
									
									//pageUtils.waitForElementTextToBe(driver, paymentHeaderText, "PAYMENT");
									 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_LONG);
									 Label l2=new Label(6,i,"Working Fine");
									  ws.addCell(l2);
									
									  callCenter(i,s.getCell(0,i).getContents());
									
								
							}
							else
							{
								 Label l2=new Label(6,i,"No Airlines Found");
								  ws.addCell(l2);
								  
								
							}
							 
						}
						
						/*SelectAirline(s.getCell(3,i).getContents());
						
						
						System.out.println("Select airline name:"+s.getCell(3,i).getContents());
						clickOnBookNow();
						enterEmail();
						clickContinueBooking();
						adult1();
						pageUtils.sendKeysAfterClearingElement(driver, txtPhoneNumber, DataConstants.USER_PHONE_NUMBER);
						pageUtils.clickElement(driver, btnPaySecurely);
						
						//pageUtils.waitForElementTextToBe(driver, paymentHeaderText, "PAYMENT");
						 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_LONG);
						
						 
						 String test= System.getProperty("application", "COM");
						System.out.println(test);
						if(test.equals("COM"))
						{
							driver.manage().deleteAllCookies();
							driver.get(BrowserConstants.ENG_COM_STG_URL);
							
						}

						String stg=System.getProperty("environment", "STG");
						if(stg.equals("STG"))
						{
						driver.switchTo().alert().sendKeys("ros@965");
						driver.switchTo().alert().accept();
						pageUtils.isElementDisplayed(driver, radioOneWay);
						pageUtils.clickElement(driver, radioOneWay);
						}
						 
					
				*/
							
							 String test1= System.getProperty("application", "AE");
								System.out.println(test1);
								if(test1.equals("AE"))
								{
									driver.manage().deleteAllCookies();
									driver.get(BrowserConstants.ENG_AE_STG_URL);
									
								}

								String stg=System.getProperty("environment", "STG");
								if(stg.equals("STG"))
								{
								driver.switchTo().alert().sendKeys("ros@965");
								driver.switchTo().alert().accept();
								pageUtils.isElementDisplayed(driver, radioOneWay);
								pageUtils.clickElement(driver, radioOneWay);
								}
					}
				
				
				
		}
			
		
		wwb.write();
	     wwb.close();
	   

	}
	

	
	

}
