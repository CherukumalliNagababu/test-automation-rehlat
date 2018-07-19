package cloud.rehlat.pages.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.utils.PageUtils;

public class Page {

	public WebDriver driver;
	private PageUtils pageUtils;

	public Page(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(css="a[data-test-canopy='navbar-username-text']") 
	private WebElement lblUsername;
	@FindBy(css="h3[data-test-canopy='page-heading']") 
	private WebElement lblDashboardHeading;

	@FindBy(css="a[data-test-canopy='more-menu-link']") 
	private WebElement lnkMore;
	@FindBy(css="a[data-test-canopy='navbar-logout-link']")
	private WebElement lnkLogout;
//Engine
	@FindBy(css="a.dropdown-toggle") 
	private WebElement lnkMoreEngine;
	@FindBy(xpath="//a[contains(@href, '/Account/LogOff')]")
	private WebElement engineLogOut;
	
	//Loaders on page
	@FindBy(css="div.ui.active.inverted.dimmer")
	private List<WebElement> lstDivActiveLoaders;
	@FindBy(css="div.ui.large.text.loader")
	private WebElement divLargeLoader; //We are retrieving your data generic loader
	@FindBy(css="div.ui.active.inverted.dimmer>div.ui.big.text.loader")
	private List<WebElement> lstDivBigLoaders;

	//Chat support option related elements
	//@FindBy(css="iframe[name='intercom-launcher-discovery-frame']")
	@FindBy(css="iframe[data-test-canopy='intercom-frame']")
	private WebElement ifrIntercomButton;
	@FindBy(css="div.intercom-avatar.intercom-avatar-initial")
	private List<WebElement> divIntercomButton;
	@FindBy(css="iframe[name='intercom-messenger-frame']")
	private WebElement ifrIntercomMessenger;
	@FindBy(css="button.intercom-composer-send-button")
	private WebElement btnSendMessage;
	@FindBy(css="div.intercom-comment-container.intercom-comment-container-user")
	private List<WebElement> lstDivIntercomUserMessage;

	/**
	 * This method is used to check if the table has data or not
	 * @param driver
	 * @param element
	 * @return
	 * @throws InterruptedException 
	 */
	public boolean isTableDataPresent(WebDriver driver, WebElement element) throws InterruptedException {
		boolean status = false;
		waitForElementToLoad(driver, element);
		//waitForFixedTime(BrowserConstants.WAIT_SMALL);
		List<WebElement> lstTableData = new ArrayList<>();
		lstTableData = element.findElements(By.tagName("tr"));
		System.out.println("list size:"+lstTableData.size());

		for(WebElement ele:lstTableData) {
			System.out.println(ele.getText());
		}
		if(lstTableData.size() != 0) {
			status = true;
		}
		return status;
	}

	/**
	 * This method is used to check if the specified chart elements are present
	 * @throws InterruptedException 
	 * @return boolean
	 */
	public boolean arePageElementsPresent(List<WebElement> lstElement, int size) {
		boolean status = false;
		waitForAllElementsToLoad(driver, lstElement);
		System.out.println("chart size:"+lstElement.size());
		if(lstElement != null) {
			if(size !=0 ) {
				if(lstElement.size() == size) {
					status = true;
				}
			} else {
				if(lstElement.size() > size) {
					status = true;
				}
			}
		}
		return status;
	}

	/**
	 * This method is used to check if the table has data or not
	 * @param driver
	 * @param element
	 * @return
	 * @throws InterruptedException 
	 */
	public List<WebElement> fetchDataFromTableRows(WebDriver driver, WebElement element) throws InterruptedException {
		List<WebElement> lstTableData = new ArrayList<>();
		lstTableData = element.findElements(By.tagName("td"));
		System.out.println("list size:"+lstTableData.size());
		return lstTableData;
	}

	/**
	 * This method gives the username on the Page
	 * @return String
	 */
	public String getUsername() {
		String actualUsername = getTextOfElement(driver, lblUsername);
		return actualUsername;
	}

	/**
	 * This method gives the dashboard label heading on the Dashboard Page
	 * @return String
	 */
	public String getDashboardLabelHeading() {
		//waitForElementToLoad(driver, lblDashboardHeading); --- optimization
		String dashboardLabel = getTextOfElement(driver, lblDashboardHeading);
		return dashboardLabel;
	}

	/**
	 * This method gives the text of the specified WebElement using PageUtils method
	 * @param WebElement
	 * @return String
	 */
	public String getTextOfElement(WebDriver driver, WebElement element) {
		String elementText = pageUtils.getTextOfElement(driver, element);
		return elementText;
	}

	/**
	 * This method clicks the specified WebElement using PageUtils method
	 * @param WebElement
	 * @param element
	 * @throws InterruptedException 
	 */
	public void clickElement(WebDriver driver, WebElement element) {
		pageUtils.clickElement(driver, element);
	}

	/**
	 * This method clicks the specified link to navigate in the application using PageUtils method
	 * @param WebElement
	 * @param element
	 * @throws InterruptedException 
	 */
	public void clickLinkForNavigation(WebDriver driver, WebElement element, String oldUrl) throws InterruptedException {
		pageUtils.clickLinkForNavigation(driver, element, oldUrl);
	}


	/**
	 * This method clicks the specified WebElement coordinates using PageUtils method
	 * @param driver
	 * @param element
	 */
	public void clickElementCoordinates(WebDriver driver, WebElement element) {
		pageUtils.clickElementCoordinates(driver, element);
	}

	/**
	 * This method clicks the specified WebElement with Actions class using PageUtils method
	 * @param driver
	 * @param element
	 */
	public void clickElementUsingActions(WebDriver driver, WebElement element) {
		pageUtils.clickElementUsingActions(driver, element);
	}

	/**
	 * This method gets the current url of page using PageUtils method
	 * @param WebDriver
	 * return String
	 * @throws InterruptedException 
	 */
	public String getCurrentUrlOfPage(WebDriver driver) throws InterruptedException {
		String currentUrl = pageUtils.getCurrentUrlOfPage(driver);
		return currentUrl;
	}

	/**
	 * This method sends the keys to the element using PageUtils method
	 * @param element
	 * @param text
	 * @throws InterruptedException 
	 */
	public void sendKeysAfterClearingElement(WebDriver driver, WebElement element, String text) throws InterruptedException {
		pageUtils.sendKeysAfterClearingElement(driver, element, text);
	}

	/**
	 * This method is used to see if element is displayed using PageUtils method
	 * @param element
	 * @return boolean
	 */
	public boolean isElementDisplayed(WebDriver driver, WebElement element) {
		boolean status = pageUtils.isElementDisplayed(driver, element);
		return status;
	}

	/**
	 * This method waits for the specified element to load using PageUtils method
	 * @param element
	 */
	public void waitForElementToLoad(WebDriver driver, WebElement element) {
		pageUtils.waitForElementToLoad(driver, element);
	}

	/**
	 * This method waits for the element list to load using PageUtils method
	 * @param element
	 */
	public void waitForAllElementsToLoad(WebDriver driver, List<WebElement> element) {
		pageUtils.waitForAllElementsToLoad(driver, element);
	}


	/**
	 * This method is used to get the username corresponding to the user role
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	protected String getUsernameForRole(String userRole, String loginType) {
		String username = null;

		if(loginType==null) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				username = DataConstants.USERNAME_SA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				username = DataConstants.USERNAME_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				username = DataConstants.USERNAME_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				username = DataConstants.USERNAME_RM;
			} 
		} else {
			if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				username = DataConstants.USERNAME_INVALID;
			} else if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				username = DataConstants.USERNAME_CU;			// giving a valid CU username for invalid password scenario
			}
		}

		return username;
	}

	/**
	 * This method is used to get the password corresponding to the user
	 * @param userRole
	 * @param loginType
	 * @return String
	 */
	protected String getPasswordForRole(String userRole, String loginType) {
		String password = null;

		if(loginType==null) {
			if(userRole.equalsIgnoreCase(DataConstants.ROLE_SUPER_ADMIN)) {
				password = DataConstants.PASSWORD_SA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_PARTNER_ADMIN)) {
				password = DataConstants.PASSWORD_PA;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_CUSTOMER)) {
				password = DataConstants.PASSWORD_CU;
			} else if(userRole.equalsIgnoreCase(DataConstants.ROLE_RELATIONSHIP_MANAGER)) {
				password = DataConstants.PASSWORD_RM;
			}	
		} else {
			if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_USER)) {
				password = DataConstants.PASSWORD_CU;									// giving a valid CU password for invalid user scenario
			} else if(loginType.equalsIgnoreCase(DataConstants.LOGINTYPE_INVALID_PASSWORD)) {
				password = DataConstants.PASSWORD_INVALID;			
			}
		}

		return password;
	}

	/**
	 * This method waits for page load using page utils method
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		pageUtils.waitForPageLoad(driver);
	}


	/**
	 * This method refreshes the page using page utils method
	 * @param driver
	 */
	public void refreshPage(WebDriver driver) {
		pageUtils.refreshPage(driver);
	}

	/**
	 * This method is used to wait for fixed time
	 * @throws InterruptedException
	 */
	public void waitForFixedTime(String duration) throws InterruptedException {
		pageUtils.waitForFixedTime(duration);
	}

	/**
	 * This method is used to wait for fixed time
	 */
	public void sendEnterKey(WebDriver driver, WebElement element) {
		pageUtils.sendEnterKey(driver,element);
	}

	/**
	 * This method is used to move to iFrame and type in the message on the chat support messenger
	 * @return
	 * @throws InterruptedException 
	 */
	public boolean writeMessageOnIntercom(Map<String, String> dataMap) throws InterruptedException {
		waitForFixedTime(BrowserConstants.WAIT_SMALL);
		waitForElementToLoad(driver, ifrIntercomButton);
		String message = dataMap.get("message");
		boolean status = false;
		driver.switchTo().frame(ifrIntercomButton);
		List<WebElement> divIntercomButton = driver.findElements(By.cssSelector("div#intercom-container>div>div>div>div>div"));//By.cssSelector("div.intercom-avatar.intercom-avatar-initial"));
		System.out.println("divIntercomFrame1:"+divIntercomButton);
		System.out.println("divIntercomFrame1 size:"+divIntercomButton.size());
		System.out.println("divIntercomFrame:"+divIntercomButton);
		divIntercomButton.get(0).click();
		driver.switchTo().defaultContent();
		System.out.println("ifrIntercomMessenger::"+ifrIntercomMessenger);
		driver.switchTo().frame(ifrIntercomMessenger);
		List<WebElement> btnNewConversation = driver.findElements(By.cssSelector("button.new-conversation-button.new-conversation-button__fixed"));
		System.out.println("btnNewConverstaion"+btnNewConversation.size());
		if(btnNewConversation!=null && btnNewConversation.size()>0) {
			clickElement(driver, btnNewConversation.get(0));
		}
		WebElement txtMessage = driver.findElement(By.tagName("textarea"));
		sendKeysAfterClearingElement(driver, txtMessage, message);
		clickElement(driver, btnSendMessage);
		waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		System.out.println("user messages : "+lstDivIntercomUserMessage);
		System.out.println("user messages : "+lstDivIntercomUserMessage.size());
		if(lstDivIntercomUserMessage!=null && lstDivIntercomUserMessage.size()>0) {
			status = true;
		}
		driver.switchTo().defaultContent();
		return status;
	}

	/**
	 * This method is used to see if element is disappeared using PageUtils method
	 * @param element
	 * @return boolean
	 */
	public boolean isElementDisappeared(WebDriver driver, WebElement element) {
		boolean status = pageUtils.waitForElementToDisappear(driver, element);
		return status;
	}

	/**
	 * This method is used to hover over the more menu in visulizer
	 */
	public void hoverOnMoreMenu() {
		pageUtils.clickElementUsingActions(driver, lnkMore);
	}
	

	/**
	 * This method is used to hover over the more menu  in Engine
	 */
	public void engineHoverOnMoreMenu() {
		pageUtils.clickElementUsingActions(driver, lnkMoreEngine);
	}
	
	/**
	 * This method is used to click on the logout in Engine
	 */
	public void clickOnEngineLogout() {
		pageUtils.clickElement(driver, engineLogOut);
	}
	/**
	 * This method is used to click on the logout
	 */
	public void clickOnLogout() {
		pageUtils.clickElement(driver, lnkLogout);
	}
}
