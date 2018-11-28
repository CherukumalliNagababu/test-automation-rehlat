package cloud.rehlat.pages.discount_codes;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

public class emiratesPage {
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

	public emiratesPage(WebDriver driver) {

		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//div/div/div/input")
	private WebElement txtFlyFrom;
	@FindBy(xpath = ".//*[@id='destination_holder']/li")
	private WebElement btnDestion;
	@FindBy(xpath = ".//*[@id='panel0']/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li/div/p")
	private List<WebElement> numOfRoutes;
	@FindBy(xpath = ".//*[@id='panel0']/div/div/div/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[2]/section/ol/li/div/p")
	private WebElement dxbClick;
	
	@FindBy(xpath = ".//*[@id='panel0']/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li[1]/div")
	private WebElement down;
	
	public void searchResults()
			throws InterruptedException, IOException, BiffException, RowsExceededException, WriteException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/EM.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Sheet1");

		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/EM_Results.xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		for (int i = 0; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				Label l1 = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(l1);

			}
		}
		for (int i = 1; i < s.getRows(); i++) {
			pageUtils.sendKeysAfterClearingElement(driver, txtFlyFrom, s.getCell(0, i).getContents());
			// System.out.println(s.getCell(0,i).getContents());
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
			pageUtils.clickElement(driver, dxbClick);
			//txtFlyFrom.sendKeys(Keys.ARROW_DOWN);
			//txtFlyFrom.sendKeys(Keys.ENTER);
			//pageUtils.clickElement(driver, btnDestion);
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
			
			for(int n=1;n<960;n++)
			{
				WebElement e=driver.findElement(By.xpath(".//*[@id='panel0']/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li[" + n + "]/div"));
				pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
				e.sendKeys(Keys.ARROW_DOWN);
			}
			
			String link[] = new String[numOfRoutes.size()];
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL1);
			int i9 = 0;
			int i6=2;
			for (WebElement e : numOfRoutes) {
				link[i9] = e.getText();
				 Label l2 = new Label(i, i6, link[i9]);
				ws.addCell(l2);
				//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
				//pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL1);
				System.out.println(link[i9]);
				i9++;
				i6++;
				
			}
			

		}

		wwb.write();
		wwb.close();

	}
	
	

}
