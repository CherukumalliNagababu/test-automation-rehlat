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



public class AirarabiaAirwaysPage {
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

	public AirarabiaAirwaysPage(WebDriver driver) {

		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//div[@class='search_field form_flying_from']//input[@name='flying-from']")
	private WebElement btnFlyFrom;
	@FindBy(xpath = ".//*[@id='tabs-flights']/div/div[1]/div/form/div[1]/div/div[3]/ul/li/a")
	private List<WebElement> numOfCountries;
	@FindBy(xpath = ".//*[@id='tabs-flights']/div/div[1]/div/form/div[1]/div/div[4]/ul/li")
	private List<WebElement> numOfCities;
	
	
	public void numOfCountries() throws InterruptedException, IOException, WriteException {
		pageUtils.clickElement(driver, btnFlyFrom);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		System.out.println("Number Of Countries In Current Page:" + numOfCountries.size());
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		for(WebElement we:numOfCountries)
		{
			we.getText();
			System.out.println(we.getText());
		}
		
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/AA_Results.xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		
		for (int i = 0; i <1 ; i++) {
			
			String link[] = new String[numOfCountries.size()];
			int i9 = 0;
			
			for (WebElement e : numOfCountries) {
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

		
	
	
	public void getResults() throws IOException, BiffException, RowsExceededException, WriteException, InterruptedException
	{
		/*pageUtils.clickElement(driver, btnFlyFrom);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		System.out.println("Number Of Countries In Current Page:" + numOfCountries.size());
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);*/
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/AA_Results.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Results");

		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+
				"/src/main/resources/cloud/Rehlat/documents/Flights/AA_All_Data_Results.xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results1", 0);
		for (int i = 0; i <s.getRows(); i++) {
			for (int j = 0; j <s.getColumns(); j++) {
				 Label  l1 = new Label(j, i, s.getCell(j, i).getContents());
				/*if(i==s.getRows()){
					if(j==s.getColumns()-1){
						 l1 = new Label(j, i, s.getCell(j, i).getContents());
						 
					}
					
				}
				else
				{
					 l1 = new Label(j, i, s.getCell(j, i).getContents());
				}*/
				ws.addCell(l1);
				System.out.println("rows:"+i);
				System.out.println("rows:"+j);

			}
		}
		
		for (int i = 0; i < s.getRows(); i++) {
			
			String linkElement=s.getCell(0, i).getContents();
			driver.findElement(By.linkText(linkElement)).click();
			
			
			pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL_ENGINE);
			String link[] = new String[numOfCities.size()];
			int i9 =0;
			int i6=2;
			System.out.println("i6:"+i6);
			for (WebElement e : numOfCities) {
				System.out.println(numOfCities.size());
				String text=e.getText();
				System.out.println(text);
				String afterReplace=text.trim();
				link[i9] = afterReplace;
				link[i9]=link[i9].trim();
				link[i9]=link[i9].replaceAll("\\s", "");
				
				 Label l3 = new Label(i6, i, link[i9]);
					ws.addCell(l3);
				
				/*if(link[i9].isEmpty())
				{
					Label l2 = new Label(i6-i, i, link[i9]);
					ws.addCell(l2);
				}*/
				//else{
				/*try{
				if(numOfCities.size()>0){
					for(int count =0 ; count < numOfCities.size(); count++){
						int k = i;
						
						 Label l3 = new Label(i6-i, k, link[i9]);
							ws.addCell(l3);
							 k++;
							 
					}
				}
				}
				catch(Exception e1)
				 {
					Label l2 = new Label(i6, i, link[i9]);
					ws.addCell(l2);
				}
							//}
*/				System.out.println(link[i9]);
				i6++;
				i9++;
				
				
			}
			 
			

		}

		wwb.write();
		wwb.close();

	}
	
	
	
}

	
		
	



	
	
	

	
	
	
	
	
	
	
	



