package cloud.rehlat.pages.Hotels.english;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class SearchHotelPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String userAccount;
	String SelectedFromCity;
	String SelectedToCity;

	public SearchHotelPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(linkText = "Hotels")
	private WebElement btnHotel;
	@FindBy(css = "#autHotelSearchTxtId")
	private WebElement txtHotelSerchBox;
	@FindBy(id = "CheckInHotelDatePicker")
	private WebElement btnCheckInDate;
	@FindBy(id = "CheckOutHotelDatePicker")
	private WebElement btnCheckOutDate;
	////div[@class='fa fa-chevron-right']
	@FindBy(xpath = ".//*[@id='hotelsForm']/div[3]/div/div[1]/div/div/div[2]/div[2]/div[1]/div[3]/div[2]")
	private WebElement btnDateIcon;
	@FindBy(xpath = ".//*[@id='hotelsForm']/div/div/div/div/div[1]/div[2]//table/tbody/tr/td")
	private List<WebElement> allDates;
	@FindBy(id = "dropdownMenu2")
	private WebElement btndropDown;
	@FindBy(xpath = "//a[contains(text(),'+ Add Room')]")
	private WebElement btnAddrooms;

	@FindBy(xpath = "//div[@id='Room_1']/div/div/div[3]/div/select")
	private WebElement selectAdults_room1;
	@FindBy(xpath = "//div[@id='Room_1']/div/div[2]/div[3]/div/select")
	private WebElement selectChilds_room1;
	@FindBy(xpath = "//div[@id='Room_1']/div/div[3]/div[3]/div/select")
	private WebElement selectChild1_age_room1;
	@FindBy(xpath = "//div[@id='Room_1']/div/div[4]/div[3]/div/select")
	private WebElement selectChild2_age_room1;

	@FindBy(xpath = "//div[@id='Room_2']/div/div/div[3]/div/select")
	private WebElement selectAdults_room2;
	@FindBy(xpath = "//div[@id='Room_2']/div/div[2]/div[3]/div/select")
	private WebElement selectChilds_room2;
	@FindBy(xpath = "//div[@id='Room_2']/div/div[3]/div[3]/div/select")
	private WebElement selectChild1_age_room2;
	@FindBy(xpath = "//div[@id='Room_2']/div/div[4]/div[3]/div/select")
	private WebElement selectChild2_age_room2;

	@FindBy(xpath = "//div[@id='Room_3']/div/div/div[3]/div/select")
	private WebElement selectAdults_room3;
	@FindBy(xpath = "//div[@id='Room_3']/div/div[2]/div[3]/div/select")
	private WebElement selectChilds_room3;
	@FindBy(xpath = "//div[@id='Room_3']/div/div[3]/div[3]/div/select")
	private WebElement selectChild1_age_room3;
	@FindBy(xpath = "//div[@id='Room_3']/div/div[4]/div[3]/div/select")
	private WebElement selectChild2_age_room3;

	@FindBy(xpath = "//div[@id='Room_4']/div/div/div[3]/div/select")
	private WebElement selectAdults_room4;
	@FindBy(xpath = "//div[@id='Room_4']/div/div[2]/div[3]/div/select")
	private WebElement selectChilds_room4;
	@FindBy(xpath = "//div[@id='Room_4']/div/div[3]/div[3]/div/select")
	private WebElement selectChild1_age_room4;
	@FindBy(xpath = "//div[@id='Room_4']/div/div[4]/div[3]/div/select")
	private WebElement selectChild2_age_room4;

	@FindBy(xpath = "//div[@id='Room_5']/div/div/div[3]/div/select")
	private WebElement selectAdults_room5;
	@FindBy(xpath = "//div[@id='Room_5']/div/div[2]/div[3]/div/select")
	private WebElement selectChilds_room5;
	@FindBy(xpath = "//div[@id='Room_5']/div/div[3]/div[3]/div/select")
	private WebElement selectChild1_age_room5;
	@FindBy(xpath = "//div[@id='Room_5']/div/div[4]/div[3]/div/select")
	private WebElement selectChild2_age_room5;

	@FindBy(xpath = "(//a[contains(text(),'Done')])[2]")
	private WebElement btnDone;
	@FindBy(id = "btnSearchNewHomePage")
	private WebElement btnSearch;

	@FindBy(xpath = ".//*[@id='ul-0']/li")
	private List<WebElement> listCityNames;
	
	@FindBy(xpath = ".//*[@id='hotelsFound']")
	private WebElement numOfHoteslText;
	@FindBy(linkText = "Book Now")
	private WebElement btnBookNow;
	@FindBy(xpath = ".//*[@id='selectedRoomPrice']")
	private WebElement getPriceTop;
	@FindBy(xpath = "//div[@id='pricesticky']//div[2]/span[2]")
	private WebElement getPriceBelow;
	
	@FindBy(xpath = "//div[@class='hotelMain_CheckIn']/span[2]")
	private WebElement getCheckInDate;
	@FindBy(xpath = "//div[@class='hotelMain_CheckOut']/span[2]")
	private WebElement getCheckOutDate;
	@FindBy(xpath = "//div[@class='hotelMain_roomPrice']/div[2]")
	private WebElement getPriceQB;
	@FindBy(linkText = "Quick Book")
	private WebElement btnQuickBook;
	@FindBy(xpath = "//div[@id='pricesticky']/span")
	private WebElement btnBookNowBelow;
	
	@FindBy(id = "CheckInDatePicker")
	private WebElement checkInDateSearch;
	@FindBy(id = "CheckOutDatePicker")
	private WebElement CheckOutDatePickerSearch;
	
	@FindBy(xpath = "//tr/td[2]/span/span")
	private WebElement finalAmount;
	@FindBy(xpath = "//div/div/table/tbody/tr/td[2]/span/a/div/img")
	private WebElement finalAmountInfo;
	@FindBy(css = "button.close.btn_Close")
	private WebElement btnClosePopUp;
	
	//pop up Details
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[1]/div/div/span[2]")
	private WebElement roomChargesText;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[1]/div/div/span[1]/span")
	private WebElement roomChargesValue;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[2]/div/div/span[1]")
	private WebElement discountText;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[2]/div/div/span[2]/span")
	private WebElement discountValue;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[3]/div/div/span[1]")
	private WebElement karamPointText;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[3]/div/div/span[2]/span")
	private WebElement karamPointValue;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[4]/div/div/span[1]")
	private WebElement paybleAmountText;
	@FindBy(xpath = ".//*[@id='myPriceBreakUpModal']/div[2]/div/div[2]/div/div[4]/div/div/span[2]")
	private WebElement paybleAmountValue;
	@FindBy(xpath = ".//*[@id='txtCoupon']")
	private WebElement txtCoupon;
	@FindBy(xpath = "//button[@class='codeapply']")
	private WebElement btnApply;
	
	
	
	
	/**
	 * This method is used to Click on Quick Book button
	 * @throws InterruptedException 
	 */
	public void clickOnQuickBook() throws InterruptedException
	{
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		pageUtils.clickElement(driver, btnQuickBook);
	}
	/**
	 * This method is used to Click on  Book now below button
	 * @throws InterruptedException 
	 */
	public void clickOnBookNowBelow() throws InterruptedException
	{
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		pageUtils.clickElement(driver, btnBookNowBelow);
	}
	/**
	 * This method is used to verify the price
	 * @throws InterruptedException 
	 */
	public boolean verifyPrice() throws InterruptedException
	{
		boolean status=false;
		String topPrice=pageUtils.getTextOfElement(driver, getPriceTop);
		System.out.println("Top Price:"+topPrice);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		String qbPrice=pageUtils.getTextOfElement(driver, getPriceQB);
		System.out.println("QB Price:"+qbPrice);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		String belowPrice=pageUtils.getTextOfElement(driver, getPriceBelow);
		System.out.println("Below Price:"+belowPrice);
		if(topPrice.equals(belowPrice))
		{
			System.out.println("Both Price Values Are matching");
			status=true;
			
		}
		else
		{
			System.out.println("Both Price Values Are Not matching");
			Assert.assertTrue("Both Price Values Are Not matching", status);
			status=false;
		}
		return status;
	}
	/**
	 * This method is used to verify the CheckIn And CheckOutDates
	 * @throws InterruptedException 
	 */
	public boolean verifyCheckInAndCheckOutDates() throws InterruptedException
	{
		boolean status=false;
		String checkInSearch=checkInDateSearch.getAttribute("value");
		System.out.println("Check In Date:"+checkInSearch);
		String checkInMonth=checkInSearch.split(" ")[1];
		System.out.println("checkIn Month:"+checkInMonth);
		String checkOutSearch=CheckOutDatePickerSearch.getAttribute("value");
		System.out.println("Check Out Date:"+checkOutSearch);
		String checkOutMonth=checkOutSearch.split(" ")[1];
		System.out.println("checkOut Month:"+checkOutMonth);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		String getcheckIn=pageUtils.getTextOfElement(driver, getCheckInDate);
		System.out.println("Get The Check In Date:"+getcheckIn);
		String getcheckInMonth=getcheckIn.split("-")[1];
		System.out.println("getcheckIn Month:"+getcheckInMonth);
		String AftergetcheckIn=getcheckIn.replaceAll("-", " ");
		AftergetcheckIn=AftergetcheckIn.replaceAll(getcheckInMonth, checkInMonth);
		System.out.println("After replace CheckIn Date:"+AftergetcheckIn);
		String getcheckOut=pageUtils.getTextOfElement(driver, getCheckOutDate);
		System.out.println("Get The Check Out Date:"+getcheckOut);
		String getcheckOutMonth=getcheckOut.split("-")[1];
		System.out.println("getcheckOut Month:"+getcheckOutMonth);
		String AftergetcheckOut=getcheckOut.replaceAll("-", " ");
		AftergetcheckOut=AftergetcheckOut.replaceAll(getcheckOutMonth, checkOutMonth);
		System.out.println("After replace CheckOut Date:"+AftergetcheckOut);
		if(checkInSearch.equals(AftergetcheckIn))
		{
			System.out.println("Check In Dates are  Matching");
			status=true;
		}
		else
		{
			System.out.println("Check In Dates are Not Matching");
			Assert.assertTrue("Check In Dates are Not Matching", status);
			status=false;
		}
		
		if(checkOutSearch.equals(AftergetcheckOut))
		{
			System.out.println("Check Out Dates are  Matching");
			status=true;
		}
		else
		{
			System.out.println("Check Out Dates are Not Matching");
			Assert.assertTrue("Check Out Dates are Not Matching", status);
			status=false;
		}
		return status;
		
	}
	
	/**
	 * This method is used to Click on BookNow button
	 * @return 
	 */
	public boolean clickOnBookNow()
	{
		boolean status = false;
		try {
		String s=pageUtils.getTextOfElement(driver, numOfHoteslText);
		System.out.println(s);
		pageUtils.clickElement(driver, btnBookNow);
		pageUtils.switchWindows(driver);
		status = true;
	} catch (Exception e) {
		System.out.println("EXCEPTION OCCURRED: " + e.getMessage());
		e.printStackTrace();
		status = false;
	}
	return status;
	}
	/**
	 * this method is used to click on Hotel link in home page
	 * 
	 * @return
	 */
	public SearchHotelPage clickHotelLink() throws InterruptedException {
		pageUtils.clickElement(driver, btnHotel);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		
		
		return new SearchHotelPage(driver);

	}
	/**
	 * This method is used to Click on Done button
	 */
	public void clickOnDone()
	{
		pageUtils.clickElement(driver, btnDone);
	}
	
	/**
	 * This method is used to get the Dates
	 */
	public void getTheDates()
	{
		
	}
	
	/**
	 * This method is used to Click on Search button
	 */
	public void clickOnSearch()
	{
		pageUtils.clickElement(driver, btnSearch);
	}
	/**
	 * This method is used to enter city name
	 * 
	 * @param dataMap
	 * @throws InterruptedException
	 */
	public void enterHotelCityName(Map<String, String> dataMap) throws InterruptedException {
		String cityName = dataMap.get("cityName");
		pageUtils.sendKeysAfterClearingElement(driver, txtHotelSerchBox, cityName);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		txtHotelSerchBox.sendKeys(Keys.TAB);
		String userSelectFromValue = txtHotelSerchBox.getAttribute("value");
		String[] getTextFrom = DataUtils.splitString(userSelectFromValue, " ");
		SelectedFromCity = getTextFrom[0];
	}

	/**
	 * this method is used Select CheckIn month
	 * 
	 * @throws InterruptedException
	 */
	public void selectCheckInmonth() throws InterruptedException {
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnCheckInDate);
		for (int i = 0; i < 1; i++) {
			pageUtils.clickElement(driver, btnDateIcon);
		}
	}

	/**
	 * this method is used Select CheckIn date @throws
	 */
	public void selectCheckInDate() {

		List<WebElement> li = allDates;
		for (WebElement we : li) {
			String st = we.getText();
			if (st.equalsIgnoreCase(DataConstants.USER_SELECT_CHECK_IN_DATE)) {
				we.click();
				break;
			}
		}
	}

	/**
	 * this method is used Select CheckOut month
	 * 
	 * @throws InterruptedException
	 */
	public void selectCheckOutmonth() throws InterruptedException {
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
		pageUtils.clickElement(driver, btnCheckOutDate);
		for (int i = 0; i < 0; i++) {
			pageUtils.clickElement(driver, btnDateIcon);
		}
	}

	/**
	 * this method is used Select CheckOut date @throws
	 */
	public void selectCheckOutDate() {

		List<WebElement> li = allDates;
		for (WebElement we : li) {
			String st = we.getText();
			if (st.equalsIgnoreCase(DataConstants.USER_SELECT_CHECK_OUT_DATE)) {
				we.click();
				break;
			}
		}
	}

	/**
	 * This method is used to enter the Room1 details
	 * @param Adults
	 * @param Childs
	 * @param Child1_age
	 * @param Child2_age
	 */
	public void enterRoom_1_Details() {
		int Adult = Integer.parseInt(DataConstants.R1_NUM_ADULTS);
		int child = Integer.parseInt(DataConstants.R1_NUM_CHILDS);
		pageUtils.selectByIndexNumber(selectAdults_room1, Adult - 1);
		pageUtils.selectByIndexNumber(selectChilds_room1, child);

		try {
			if("1".equals(DataConstants.R1_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R1_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room1, child1_age);
			}
			else if("2".equals(DataConstants.R1_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R1_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room1, child1_age);
				int child2_age = Integer.parseInt(DataConstants.R1_CHILDS2_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room1, child2_age);
			}

		} catch (Exception e) {

		}

	}
	
	/**
	 * This method is used to enter the Room2 details
	 * @param Adults
	 * @param Childs
	 * @param Child1_age
	 * @param Child2_age
	 */
	public void enterRoom_2_Details() {
		int Adult = Integer.parseInt(DataConstants.R2_NUM_ADULTS);
		int child = Integer.parseInt(DataConstants.R2_NUM_CHILDS);
		pageUtils.selectByIndexNumber(selectAdults_room2, Adult - 1);
		pageUtils.selectByIndexNumber(selectChilds_room2, child);

		try {
			if("1".equals(DataConstants.R2_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R2_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room2, child1_age);
			}
			else if("2".equals(DataConstants.R2_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R2_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room2, child1_age);
				int child2_age = Integer.parseInt(DataConstants.R2_CHILDS2_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room2, child2_age);
			}

		} catch (Exception e) {

		}

	}
	
	/**
	 * This method is used to enter the Room3 details
	 * @param Adults
	 * @param Childs
	 * @param Child1_age
	 * @param Child2_age
	 */
	public void enterRoom_3_Details() {
		int Adult = Integer.parseInt(DataConstants.R3_NUM_ADULTS);
		int child = Integer.parseInt(DataConstants.R3_NUM_CHILDS);
		pageUtils.selectByIndexNumber(selectAdults_room3, Adult - 1);
		pageUtils.selectByIndexNumber(selectChilds_room3, child);

		try {
			if("1".equals(DataConstants.R3_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R3_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room3, child1_age);
			}
			else if("2".equals(DataConstants.R3_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R3_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room3, child1_age);
				int child2_age = Integer.parseInt(DataConstants.R3_CHILDS2_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room3, child2_age);
			}

		} catch (Exception e) {

		}

	}

	/**
	 * This method is used to enter the Room4 details
	 * @param Adults
	 * @param Childs
	 * @param Child1_age
	 * @param Child2_age
	 */
	public void enterRoom_4_Details() {
		int Adult = Integer.parseInt(DataConstants.R4_NUM_ADULTS);
		int child = Integer.parseInt(DataConstants.R4_NUM_CHILDS);
		pageUtils.selectByIndexNumber(selectAdults_room4, Adult - 1);
		pageUtils.selectByIndexNumber(selectChilds_room4, child);

		try {
			if("1".equals(DataConstants.R4_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R4_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room4, child1_age);
			}
			else if("2".equals(DataConstants.R4_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R4_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room4, child1_age);
				int child2_age = Integer.parseInt(DataConstants.R4_CHILDS2_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room4, child2_age);
			}

		} catch (Exception e) {

		}

	}

	/**
	 * This method is used to enter the Room5 details
	 * @param Adults
	 * @param Childs
	 * @param Child1_age
	 * @param Child2_age
	 */
	public void enterRoom_5_Details() {
		int Adult = Integer.parseInt(DataConstants.R5_NUM_ADULTS);
		int child = Integer.parseInt(DataConstants.R5_NUM_CHILDS);
		pageUtils.selectByIndexNumber(selectAdults_room5, Adult - 1);
		pageUtils.selectByIndexNumber(selectChilds_room5, child);

		try {
			if("1".equals(DataConstants.R5_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R5_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room5, child1_age);
			}
			else if("2".equals(DataConstants.R5_NUM_CHILDS))
			{
				int child1_age = Integer.parseInt(DataConstants.R5_CHILDS1_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room5, child1_age);
				int child2_age = Integer.parseInt(DataConstants.R5_CHILDS2_AGE);
				pageUtils.selectByIndexNumber(selectChild1_age_room5, child2_age);
			}

		} catch (Exception e) {

		}

	}
	
	/**
	 * This method is used to enter the details 
	 * @param rooms
	 */
	public void addRooms(String rooms)
	{
		System.out.println("Number of room :"+rooms);
		if("1".equals(rooms))
		{
			
			enterRoom_1_Details();
			
		}
		else if("2".equals(rooms))
		{
			enterRoom_1_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_2_Details();
			
		}
		else if("3".equals(rooms))
		{
			enterRoom_1_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_2_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_3_Details();
		}
		else if("4".equals(rooms))
		{
			enterRoom_1_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_2_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_3_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_4_Details();
		}
		else if("5".equals(rooms))
		{
			enterRoom_1_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_2_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_3_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_4_Details();
			pageUtils.clickElement(driver, btnAddrooms);
			enterRoom_5_Details();
			
		}
	}
	
	/**
	 * This method is used to select number of Rooms from feature file
	 * @param dataMap
	 * @return 
	 * @throws InterruptedException
	 */
	public boolean enterDetails(Map<String, String> dataMap) throws InterruptedException
	{
		boolean status = false;
		try {
		String numofRooms = dataMap.get("rooms");
		System.out.println(numofRooms);
		pageUtils.clickElement(driver, btndropDown);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		addRooms(numofRooms);
		status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}
	
	
	/**
	 * This method is used to enter city name
	 * 
	 * @param dataMap
	 * @throws InterruptedException
	 */
	public void enterHotelCityName_Duplicate(Map<String, String> dataMap) throws InterruptedException {
		String cityName = dataMap.get("cityName");
		pageUtils.sendKeysAfterClearingElement(driver, txtHotelSerchBox, cityName);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		//txtHotelSerchBox.sendKeys(Keys.TAB);
		for(WebElement e:listCityNames)
		{
			String s=e.getText();
			System.out.println(s);
		}
		
		
		List<WebElement> WE1 = listCityNames;
		System.out.println("Total Number :" + WE1.size());
		Thread.sleep(2000);

		ArrayList<String> list = new ArrayList<>();

		for (WebElement element1 : WE1) {
			list.add(element1.getText());
		}
		Set<String> duplicateElements=new HashSet<>();
		
		Collections.sort(list);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1).equals(list.get(i))){
				duplicateElements.add(list.get(i));
			}
		}
		System.out.println("Duplicate Elements : "+duplicateElements);
		
		
		
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
		
		
}
