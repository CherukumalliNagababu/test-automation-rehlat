package cloud.rehlat.pages.Hotels.english;

import java.util.List;
import java.util.Map;

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
	@FindBy(xpath = "//div[@class='fa fa-chevron-right']")
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

	/**
	 * This method is used to Click on Done button
	 */
	public void clickOnDone()
	{
		pageUtils.clickElement(driver, btnDone);
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
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
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
}
