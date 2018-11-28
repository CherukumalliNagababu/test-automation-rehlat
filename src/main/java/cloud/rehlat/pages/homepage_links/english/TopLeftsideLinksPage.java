package cloud.rehlat.pages.homepage_links.english;



import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.utils.PageUtils;


public class TopLeftsideLinksPage {
	public WebDriver driver;
	private PageUtils pageUtils;

	public TopLeftsideLinksPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	

	@FindBy(linkText="Flights")
	private WebElement btnFlight;
	@FindBy(linkText="Hotels")
	private WebElement btnHotel;
	@FindBy(linkText="Deals")
	private WebElement btnDeals;
	@FindBy(linkText="Active deals")
	private WebElement geTextActivedeals;
	@FindBy(xpath="//a[contains(text(),'Inspirations')]")
	private WebElement btnInspirations;
	@FindBy(linkText="Home")
	private WebElement geTextHome;
	@FindBy(id="radio_1")
	private WebElement radioOneWay;
	@FindBy(xpath="//h2")
	private WebElement Hotel_Text;
	
	//Right side
	
	@FindBy(xpath="//div/li")
	private WebElement lnkReferEarn;
	@FindBy(xpath="//h1")
	private WebElement referGetText;
	@FindBy(css=".header_gl_sel")
	private  WebElement btnmouse;
	@FindBy(xpath="//ul[@class='dropdown-menu ros_Dropdown']/div[1]/div[1]")
	private WebElement changeLanguageGetText;
	@FindBy(xpath="//ul[@class='dropdown-menu ros_Dropdown']/div[2]/div[1]")
	private WebElement changeCountryGetText;
	@FindBy(xpath="//ul[@class='dropdown-menu ros_Dropdown']/div[3]/div[1]")
	private WebElement changeCurrencyGetText;
	@FindBy(linkText="Help")
	private WebElement lnkHelp;
	@FindBy(linkText="FAQS")
	private WebElement lnkFAQs;
	@FindBy(css="div.cityName")
	private WebElement getTextOfFAQ;
	@FindBy(linkText="KARAM T&C")
	private WebElement lnkKaramTC;
	@FindBy(css="div.text-center.gokrmftr-title")
	private WebElement getTextOfKaram;
	@FindBy(xpath="(//li[@id='tabContactUs']/a/span)[2]")
	private WebElement lnkCallus;
	@FindBy(css="h2.support_header_title")
	private WebElement getTextOfCallUs;
	
	
	public boolean checkTheRightSideLinks() throws InterruptedException
	{ 
		boolean status=false;
		pageUtils.clickElement(driver, lnkReferEarn);
		pageUtils.switchWindows(driver);
		String text=pageUtils.getTextOfElement(driver, referGetText);
		if("REFER YOUR FRIENDS".equals(text))
		{
			System.out.println("REFER YOUR FRIENDS Link Working Fine");
			status = true;
		}
		else
		{
			Assert.assertTrue("REFER YOUR FRIENDS Link Not working ", status);
			status = false;
		}
		driver.close();
		pageUtils.switchToParentWindow(driver);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		 pageUtils.mouseAction(driver, btnmouse); 
		 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		 String text1=pageUtils.getTextOfElement(driver, changeLanguageGetText);
		
		if("CHANGE LANGUAGE".equals(text1))
		{
			System.out.println("CHANGE LANGUAGE TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("CHANGE LANGUAGE TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		 String text2=pageUtils.getTextOfElement(driver, changeCountryGetText);
		
		if("CHANGE COUNTRY".equals(text2))
		{
			System.out.println("CHANGE COUNTRY TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("CHANGE COUNTRY TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		String text3=pageUtils.getTextOfElement(driver, changeCurrencyGetText);
		
		if("CHANGE CURRENCY".equals(text3))
		{
			System.out.println("CHANGE CURRENCY TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("CHANGE CURRENCY TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		
		pageUtils.mouseAction(driver, lnkHelp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		pageUtils.clickElement(driver, lnkFAQs);
		String FaqText=pageUtils.getTextOfElement(driver, getTextOfFAQ);
		
		if("FAQs".equals(FaqText))
		{
			System.out.println("FAQS TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("FAQS TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		pageUtils.mouseAction(driver, lnkHelp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		pageUtils.clickElement(driver, lnkKaramTC);
		String KaramText=pageUtils.getTextOfElement(driver, getTextOfKaram);
		
		if("KARAM FEATURES".equals(KaramText))
		{
			System.out.println("KARAM FEATURES TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("KARAM FEATURES TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		pageUtils.mouseAction(driver, lnkHelp);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		pageUtils.clickElement(driver, lnkCallus);
		String CallUsText=pageUtils.getTextOfElement(driver, getTextOfCallUs);
		
		if("HOW CAN WE HELP YOU?".equals(CallUsText))
		{
			System.out.println("HOW CAN WE HELP YOU? TEXT IS DISPLAYED .....WORKING FINE");
			status = true;
		}
		else
		{
			Assert.assertTrue("HOW CAN WE HELP YOU? TEXT IS NOT DISPLAYED ..... ERROR", status);
			status = false;
		}
		
		
		return status;
	}
	public boolean checkTheLeftSideLinks() throws InterruptedException
	{ 
		boolean status=false;
		pageUtils.clickElement(driver, btnFlight);
		String text=pageUtils.getTextOfElement(driver, radioOneWay);
		
		if("One Way".equals(text))
		{
			System.out.println("Flights Link Working Fine");
			status = true;
		}
		else
		{
			Assert.assertTrue("Flights Link Not working ", status);
			status = false;
		}
		pageUtils.clickElement(driver, btnHotel);
		String text1=pageUtils.getTextOfElement(driver, Hotel_Text);
		
		if("Book Domestic & International Hotels".equals(text1))
		{
			System.out.println("Hotels Link Working Fine");
			status = true;
		}
		else
		{
			Assert.assertTrue("Hotels Link Not working ", status);
			status = false;
		}
		pageUtils.clickElement(driver, btnDeals);
		String text2=pageUtils.getTextOfElement(driver, geTextActivedeals);
		
		if("Active deals".equals(text2))
		{
			System.out.println("Deals Link Working Fine");
			status = true;
		}
		else
		{
			Assert.assertTrue("Deals Link Not working ", status);
			status = false;
		}
		pageUtils.clickElement(driver, btnInspirations);
		pageUtils.switchWindows(driver);
		 pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);
		driver.navigate().refresh();
		String text3=pageUtils.getTextOfElement(driver, geTextHome);
		
		if("Home".equals(text3))
		{
			System.out.println("Inspirations Link Working Fine");
			status = true;
		}
		else
		{
			Assert.assertTrue("Inspirations Link Not working ", status);
			status = false;
		}
		driver.close();
		pageUtils.switchToParentWindow(driver);
		return status;
		
	}

}
