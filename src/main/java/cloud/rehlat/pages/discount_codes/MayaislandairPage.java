package cloud.rehlat.pages.discount_codes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cloud.rehlat.constants.common.BrowserConstants;

import cloud.rehlat.utils.PageUtils;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class MayaislandairPage {
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
	Label l2;

	public MayaislandairPage(WebDriver driver) {

		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='search-container']/div[1]/div/form/div[2]/div/div/div[1]/div[3]/div/div/div[2]/popup-content/core-linked-list/div[2]/div[1]/div")
	private List<WebElement> listOfValues;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement bookTrip;
	@FindBy(xpath = ".//*[@id='search-container']/div[1]/div/form/div[2]/div/div/div[1]/div[3]/div/div/div[2]/popup-content/core-linked-list/div[1]/div/div[1]")
	private WebElement backto;
	@FindBy(xpath = "//div/div/div/label/span/span")
	private WebElement showAll;
	
	@FindBy(name = "origin")
	private WebElement txtFlyFrom;
	@FindBy(xpath = "//div[4]/a/img")
	private WebElement toClick;
	@FindBy(xpath = ".//*[@id='onlineBookingorigion_flexselect_dropdown']/ul/li[1]")
	private WebElement fromDrpClick;
	@FindBy(id = "close-drawer-link")
	private WebElement close;
	
	public void getValues() throws IOException, RowsExceededException, WriteException, InterruptedException
	{
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		//pageUtils.scrollDown(driver);
		pageUtils.clickElement(driver, bookTrip);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, backto);
		//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		//pageUtils.clickElement(driver, showAll);
		//pageUtils.clickElement(driver, btnFlyFrom);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
		//driver.switchTo().frame(driver.findElement(By.id("AirlineBooking")));
		//Select s=new Select(driver.findElement(By.id("drpSelect")));
		//List <WebElement> elementCount = s.getOptions();
		 //int iSize = elementCount.size();
		 //System.out.println("Size:"+iSize);
		for(WebElement e:listOfValues)
		{
			String st1=e.getAttribute("value");
			System.out.println(st1);
			String st=e.getText();
			System.out.println(st);
		}
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/RA.xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		
		for (int i = 0; i <1 ; i++) {
			
			String link[] = new String[listOfValues.size()];
			int i9 = 0;
			
			for (WebElement e : listOfValues) {
				link[i9] = e.getText();
				 Label l2 = new Label(i, i9, link[i9]);
				ws.addCell(l2);
				//System.out.println(link[i9]);
				/*driver.findElement(By.linkText(e.getText())).click();
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
				
				for (int i2 = 0; i2 <1 ; i2++) {
			
				String cityNames[] = new String[numOfCities.size()];
				int i99 = 0;
				int i6=2;
				for (WebElement city : numOfCities) {
					cityNames[i99] = city.getText();
					 Label l22 = new Label(i6, i2, cityNames[i99]);
						ws.addCell(l22);
						i99++;
						
				}
				}*/
				
				
				
				i9++;
				
				
			}
			
			
			

		}

		wwb.write();
		wwb.close();

	}
	
	public void searchResults()
			throws InterruptedException, IOException, BiffException, RowsExceededException, WriteException {
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_MEDIUM);
		//pageUtils.sendKeysAfterClearingElement(driver, bookTrip, "Singapore (SIN)");
		//driver.findElement(By.linkText("Continue")).click();
		//pageUtils.sendKeysAfterClearingElement(driver, bookTrip, "Singapore (SIN)");
		//pageUtils.waitForFixedTime(BrowserConstants.WAIT_MEDIUM);
		//pageUtils.scrollDown(driver);
		//pageUtils.clickElement(driver, bookTrip);
		
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/naga1.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Results");

		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/EJ_Results.xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		for (int i = 0; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				Label l1 = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(l1);

			}
		}
		for (int i = 1; i < s.getRows(); i++) {
			//bookTrip.clear();
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
			//pageUtils.clickElement(driver, bookTrip);
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
			pageUtils.sendKeysAfterClearingElement(driver, txtFlyFrom, s.getCell(0, i).getContents());
			//Thread.sleep(5000);
			//driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
			
			System.out.println("--------------------------------------------");
			System.out.println(s.getCell(0, i).getContents());
			System.out.println("--------------------------------------------");
			// System.out.println(s.getCell(0,i).getContents());
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			//bookTrip.sendKeys(Keys.ARROW_DOWN);
			txtFlyFrom.sendKeys(Keys.ENTER);
			//driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			//pageUtils.clickElement(driver, fromDrpClick);
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
			pageUtils.clickElement(driver, toClick);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			pageUtils.clickElement(driver, showAll);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			
			//txtFlyFrom.sendKeys(Keys.ARROW_DOWN);
			//txtFlyFrom.sendKeys(Keys.ENTER);
			//pageUtils.clickElement(driver, btnDestion);
			
			
			/*for(int n=1;n<960;n++)
			{
				WebElement e=driver.findElement(By.xpath(".//*[@id='panel0']/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li[" + n + "]/div"));
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
				e.sendKeys(Keys.ARROW_DOWN);
			}*/
			
			String link[] = new String[listOfValues.size()];
			
			int i9 = 0;
			int i6=2;
			for (WebElement e : listOfValues) {
				link[i9] = e.getText();
				 Label l2 = new Label(i6, i, link[i9]);
				ws.addCell(l2);
				//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
				//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL1);
				System.out.println(link[i9]);
				i9++;
				i6++;
				
			}
			pageUtils.clickElement(driver, close);
			//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		}

		wwb.write();
		wwb.close();

	}
	
}
