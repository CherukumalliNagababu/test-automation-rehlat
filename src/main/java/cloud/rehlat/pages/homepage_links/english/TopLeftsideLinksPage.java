package cloud.rehlat.pages.homepage_links.english;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	@FindBy(xpath="//a[contains(text(),'Inspirations')]")
	private WebElement btnInspirations;
	@FindBy(id="radio_1")
	private WebElement radioOneWay;
	
	public void checkTheLeftSideLinks()
	{
		pageUtils.clickElement(driver, btnFlight);
		String text=pageUtils.getTextOfElement(driver, radioOneWay);
		System.out.println(text);
	}

}
