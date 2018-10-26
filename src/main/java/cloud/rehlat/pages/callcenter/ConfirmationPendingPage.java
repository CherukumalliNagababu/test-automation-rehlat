package cloud.rehlat.pages.callcenter;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.utils.DataUtils;
import cloud.rehlat.utils.PageUtils;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class ConfirmationPendingPage {
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

	public ConfirmationPendingPage(WebDriver driver) {

		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "DisablePagination")
	private WebElement chkDisablePagination;
	@FindBy(id = "fltFromdatepicker")
	private WebElement clkFromdatepicker;
	@FindBy(xpath = "//table[@class=' table-condensed']//tbody/tr/td[@class='day']")
	private List<WebElement> selectFromdatepicker;
	@FindBy(id = "fltTodatepicker")
	private WebElement clkTodatepicker;
	@FindBy(xpath = "//table[@class=' table-condensed']//tbody/tr/td[@class='day']")
	private List<WebElement> selectTodatepicker;
	@FindBy(id = "status")
	private WebElement drpBookingStatus;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//div[@id='searchresults']/div/div/div[2]")
	private WebElement flightResultsCountText;
	
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr")
	private List<WebElement> table_tr;
	@FindBy(xpath = ".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td")
	private List<WebElement> table_td;
	
	@FindBy(xpath = "td")
	private WebElement td_values;
	@FindBy(id = "Email")
	private WebElement txtEmail;
	@FindBy(id = "Password")
	private WebElement txtPassword;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement btnLogin;
	//Log out Call center
	@FindBy(xpath = "//li[@id='myDisplay']/a")
	private WebElement clkUserName;
	@FindBy(linkText = "Log Out")
	private WebElement lnkLogout;
	
	@FindBy(xpath = "//th[2]")
	private WebElement calenderText;
	@FindBy(xpath = "//div[3]/table/tbody/tr/td/span")
	private List<WebElement> yearsList;
	@FindBy(xpath = "//span")
	private List<WebElement> monthList;
	
	public void LoginCallCenter() throws InterruptedException
	{
		pageUtils.sendKeysAfterClearingElement(driver, txtEmail, "Sreenivas.bodige@rehlat.com");
		pageUtils.sendKeysAfterClearingElement(driver, txtPassword, "Rehlat@2020");
		pageUtils.clickElement(driver, btnLogin);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL);
	}
	public void logOut() throws InterruptedException
	{
		pageUtils.clickElement(driver, clkUserName);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.clickElement(driver, lnkLogout);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
	}
	
	
	public void select_FromDate() throws InterruptedException {
		String currentDate = DataUtils.DaybeforeYesterdayDate("dd MMM yyyy");
		System.out.println("Excepted Date:" + currentDate);
		String currentDate1 = DataUtils.DaybeforeYesterdayDate("d");
		System.out.println("Excepted Date:" + currentDate1);
		String currentMonth = DataUtils.DaybeforeYesterdayDate("MMMM");
		System.out.println("Excepted Date:" + currentMonth);
		String currentMonth1 = DataUtils.DaybeforeYesterdayDate("MMM");
		System.out.println("Excepted Date:" + currentMonth1);
		String currentYear = DataUtils.DaybeforeYesterdayDate("yyyy");
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

		for (WebElement e12 : selectFromdatepicker) {
			System.out.println(e12.getText());

			String ele = e12.getText();

			if (ele.equalsIgnoreCase(currentDate1)) {
				e12.click();

				break;
			}
		}
	}
	
public void confirmationReports_com() throws InterruptedException, IOException, RowsExceededException, WriteException
	{
		FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/ConfirmationPendingReports_Com.xls");
		 wwb=Workbook.createWorkbook(fo);
		ws=wwb.createSheet("Results",0);
		
		driver.get("http://callcenter.rehlat.com/");
		
		LoginCallCenter();
		WebElement checkbox = chkDisablePagination;
		
		if (!checkbox.isSelected())
			checkbox.click();
		else
		{
			System.out.println("Already Check Box is selected");
		}
		
		select_FromDate();
  
		select_ToDate();
		
		//pageUtils.clickElement(driver, clkFromdatepicker);
		
	/*	String CurrentUrl=driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
		System.out.println("Current Url"+urldomain[1]);
		String[] urldomain1 = urldomain[1].split("\\/");
		System.out.println("Domain Name::"+urldomain1[0]);
		
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		 Calendar cal2 = Calendar.getInstance();
	  	   DateFormat dateFormat2 = new SimpleDateFormat("d-M-yyyy");
	  	   
	  	 cal2.add(Calendar.DATE, -2);
	  	   System.out.println("Yesterday's date was "+dateFormat2.format(cal2.getTime()));  
	  	  String st2=dateFormat2.format(cal2.getTime());
	  	   String[] spliteddate2 = st2.split("-");
	  	   System.out.println("Split the Date::"+spliteddate2[0]);
	  	 
	  	 Calendar cal = Calendar.getInstance();
	  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
	  	   
	  	   cal.add(Calendar.DATE, -1);
	  	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
	  	  String st=dateFormat.format(cal.getTime());
	  	   String[] spliteddate = st.split("-");
	  	   System.out.println("Split the Date::"+spliteddate[0]);
	  	   
	  	   
	  	   
		
	  	 for (WebElement e12 : selectFromdatepicker) {
				System.out.println(e12.getText());
			

				String ele = e12.getText();
				

				if (ele.equalsIgnoreCase(spliteddate2[0])) {
					e12.click();
					
					break;
				}
		
		
	}
	  	 
	  	pageUtils.clickElement(driver, clkTodatepicker); 
	  	 for (WebElement e12 : selectTodatepicker) {
				System.out.println(e12.getText());
				

				String ele = e12.getText();
				

				if (ele.equalsIgnoreCase(spliteddate[0])) {
					e12.click();
				
					break;
				}
	  	 }
		*/
	  	 pageUtils.selectByIndexNumber(drpBookingStatus, 4);
	  	 pageUtils.clickElement(driver, btnSearch);
	  	 pageUtils.isElementDisplayed(driver, flightResultsCountText);
	  	String Rcount=flightResultsCountText.getText();
		System.out.println(Rcount);
		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count"+Rsplited[1]);
		Thread.sleep(1000);
		
		
		if("Flight Search Results : 0".equals(Rcount))
		{
			System.out.println("Repricing Count = 0");
			addCellData();
	      
		}
		else
		{
			addCellData();
			
			
			int row_num,col_num;
		    row_num=1;
		    for(WebElement trElement : table_tr)
		    {
		        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
		        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
		        col_num=1;
		        for(WebElement tdElement : td_collection)
		        {
		        	
		        	
		        	 Label ll2=new Label(col_num,row_num,tdElement.getText());
					  ws.addCell(ll2);
		            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
		            col_num++;
		            
		            
		            
		        }
		        row_num++;
		    }
		}
		wwb.write();
	     wwb.close();
	     
	     logOut();
	     
	}
public void confirmationReports_SA() throws InterruptedException, IOException, RowsExceededException, WriteException
{
	FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/ConfirmationPendingReports_SA.xls");
	 wwb=Workbook.createWorkbook(fo);
	ws=wwb.createSheet("Results",0);
	
	driver.get("http://sacallcenter.rehlat.com/");
	
	LoginCallCenter();
	WebElement checkbox = chkDisablePagination;
	
	if (!checkbox.isSelected())
		checkbox.click();
	else
	{
		System.out.println("Already Check Box is selected");
	}
	select_FromDate();
	select_ToDate();
  	 pageUtils.selectByIndexNumber(drpBookingStatus, 4);
  	 pageUtils.clickElement(driver, btnSearch);
  	 pageUtils.isElementDisplayed(driver, flightResultsCountText);
  	String Rcount=flightResultsCountText.getText();
	System.out.println(Rcount);
	//ExcelUtils.lable(0, 0,count);
	
	String Rstr = Rcount.trim();
	String[] Rsplited = Rstr.split("\\:");
	System.out.println("No of Results Count"+Rsplited[1]);
	Thread.sleep(1000);
	
	
	if("Flight Search Results : 0".equals(Rcount))
	{
		System.out.println("Repricing Count = 0");
		addCellData();
	}
	else
	{
		addCellData();
		int row_num,col_num;
	    row_num=1;
	    for(WebElement trElement : table_tr)
	    {
	        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
	        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
	        col_num=1;
	        for(WebElement tdElement : td_collection)
	        {
	        	
	        	
	        	 Label ll2=new Label(col_num,row_num,tdElement.getText());
				  ws.addCell(ll2);
	            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
	            col_num++;
	            
	            
	            
	        }
	        row_num++;
	    }
	}
	wwb.write();
     wwb.close();
     logOut();
}
public void confirmationReports_AE() throws InterruptedException, IOException, RowsExceededException, WriteException
{
	FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/ConfirmationPendingReports_AE.xls");
	 wwb=Workbook.createWorkbook(fo);
	ws=wwb.createSheet("Results",0);
	
	driver.get("http://callcenter.rehlat.ae/");
	
	LoginCallCenter();
	WebElement checkbox = chkDisablePagination;
	
	if (!checkbox.isSelected())
		checkbox.click();
	else
	{
		System.out.println("Already Check Box is selected");
	}

	select_FromDate();
	select_ToDate();
	
  	 pageUtils.selectByIndexNumber(drpBookingStatus, 4);
  	 pageUtils.clickElement(driver, btnSearch);
  	 pageUtils.isElementDisplayed(driver, flightResultsCountText);
  	String Rcount=flightResultsCountText.getText();
	System.out.println(Rcount);
	//ExcelUtils.lable(0, 0,count);
	
	String Rstr = Rcount.trim();
	String[] Rsplited = Rstr.split("\\:");
	System.out.println("No of Results Count"+Rsplited[1]);
	Thread.sleep(1000);
	
	
	if("Flight Search Results : 0".equals(Rcount))
	{
		System.out.println("Repricing Count = 0");
		addCellData();
	}
	else
	{

		addCellData();
		int row_num,col_num;
	    row_num=1;
	    for(WebElement trElement : table_tr)
	    {
	        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
	        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
	        col_num=1;
	        for(WebElement tdElement : td_collection)
	        {
	        	
	        	
	        	 Label ll2=new Label(col_num,row_num,tdElement.getText());
				  ws.addCell(ll2);
	            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
	            col_num++;
	            
	            
	            
	        }
	        row_num++;
	    }
	}
	wwb.write();
     wwb.close();
     logOut();
}
public void confirmationReports_EG() throws InterruptedException, IOException, RowsExceededException, WriteException
{
	FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/cloud/Rehlat/documents/Flights/ConfirmationPendingReports_EG.xls");
	 wwb=Workbook.createWorkbook(fo);
	ws=wwb.createSheet("Results",0);
	
	driver.get("http://callcenter.rehlat.com.eg/");
	
	LoginCallCenter();
	WebElement checkbox = chkDisablePagination;
	
	if (!checkbox.isSelected())
		checkbox.click();
	else
	{
		System.out.println("Already Check Box is selected");
	}

	select_FromDate();
	select_ToDate();
  	 pageUtils.selectByIndexNumber(drpBookingStatus, 4);
  	 pageUtils.clickElement(driver, btnSearch);
  	 pageUtils.isElementDisplayed(driver, flightResultsCountText);
  	String Rcount=flightResultsCountText.getText();
	System.out.println(Rcount);
	//ExcelUtils.lable(0, 0,count);
	
	String Rstr = Rcount.trim();
	String[] Rsplited = Rstr.split("\\:");
	System.out.println("No of Results Count"+Rsplited[1]);
	Thread.sleep(1000);
	
	
	if("Flight Search Results : 0".equals(Rcount))
	{
		System.out.println("Repricing Count = 0");
		addCellData();
      
	}
	else
	{
		addCellData();
		int row_num,col_num;
	    row_num=1;
	    for(WebElement trElement : table_tr)
	    {
	        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
	        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
	        col_num=1;
	        for(WebElement tdElement : td_collection)
	        {
	        	
	        	
	        	 Label ll2=new Label(col_num,row_num,tdElement.getText());
				  ws.addCell(ll2);
	            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
	            col_num++;
	            
	            
	            
	        }
	        row_num++;
	    }
	}
	wwb.write();
     wwb.close();
     logOut();
     
}

public void addCellData() throws RowsExceededException, WriteException
{
	 Label l1=new Label(1,0,"Booking Id");
	 Label l2=new Label(2,0,"Trip Type");
	 Label l3=new Label(3,0,"Pax Name");
	 Label l4=new Label(4,0,"Status");
	 Label l5=new Label(5,0,"Payment Status");
	 Label l6=new Label(6,0,"Reprice");
	 Label l7=new Label(7,0,"Supplier ");
	 Label l8=new Label(8,0,"PNR");
	 Label l9=new Label(9,0,"Booking Date");
	 Label l10=new Label(10,0,"Amount");
	 Label l11=new Label(11,0,"Client");
	 ws.addCell(l1);
	 ws.addCell(l2);
	 ws.addCell(l3);
	 ws.addCell(l4);
	 ws.addCell(l5);
	 ws.addCell(l6);
	 ws.addCell(l7);
	 ws.addCell(l8);
	 ws.addCell(l9);
	 ws.addCell(l10);
	 ws.addCell(l11);
}

public void mailGenaration() throws EmailException
{
	System.out.println("Started");
	 //StringBuilder htmlStringBuilder=new StringBuilder();
	 HtmlEmail email = new HtmlEmail();
	//Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	email.setSubject(""+DataUtils.DaybeforeYesterdayDate("dd-MMM-yyyy")+" "+"To"+" "+ DataUtils.YesterdayDate("dd-MMM-yyyy")+"  Confirmation Pending Reports");
	System.out.println("2");
	File file_com=new File("D:\\WorkSpacess\\OctWorkSpace\\test-automation-rehlat\\src\\main\\resources\\cloud\\Rehlat\\documents\\Flights\\ConfirmationPendingReports_Com.xls");
	email.attach(file_com);
	File file_Sa=new File("D:\\WorkSpacess\\OctWorkSpace\\test-automation-rehlat\\src\\main\\resources\\cloud\\Rehlat\\documents\\Flights\\ConfirmationPendingReports_SA.xls");
	email.attach(file_Sa);
	File file_Eg=new File("D:\\WorkSpacess\\OctWorkSpace\\test-automation-rehlat\\src\\main\\resources\\cloud\\Rehlat\\documents\\Flights\\ConfirmationPendingReports_EG.xls");
	email.attach(file_Eg);
	File file_Ae=new File("D:\\WorkSpacess\\OctWorkSpace\\test-automation-rehlat\\src\\main\\resources\\cloud\\Rehlat\\documents\\Flights\\ConfirmationPendingReports_AE.xls");
	email.attach(file_Ae);
    //email.addTo("sreenivas.bodige@rehlat.com");
    email.addTo("naga.ch199@gmail.com");
  
	
	System.out.println("3");
	email.send();
	System.out.println("END");

	
}
}

