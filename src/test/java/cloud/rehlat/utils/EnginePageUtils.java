package cloud.rehlat.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.constants.engine.EngineConstants;

public class EnginePageUtils {
	WebElement we;
	String count;
	private static EnginePageUtils enginePageUtilsInstance = new EnginePageUtils();

	private EnginePageUtils() {
	}

	public static EnginePageUtils getInstance() {
		if (enginePageUtilsInstance == null) {
			enginePageUtilsInstance = new EnginePageUtils();
		}
		return enginePageUtilsInstance;
	}

	/**
	 * This method waits for the specified element to load
	 * 
	 * @param element
	 */
	public void waitForElementToLoad(WebDriver driver, WebElement element) {
		long timeoutInSeconds = 65;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to check if the element is displayed
	 * 
	 * @param driver
	 * @param element
	 * @return boolean
	 */
	public boolean isElementDisplayed(WebDriver driver, WebElement element) {
		boolean status = false;
		waitForElementToLoad(driver, element);
		status = element.isDisplayed();
		return status;
	}

	
	public boolean validateListOfItems(WebDriver driver, List<WebElement> element,String list[]) {
		boolean status = false;
			
	    String[] exp = list; 
			
			int count = 0;
			List<WebElement> options = element;
		    for (WebElement we : options) {
		        for (int i = 0; i < exp.length; i++) {
		        	
		        	
		        	
		      
		            if (we.getText().equals(exp[i])) {
		                count++;
		                System.out.println(we.getText()+"::"+"matched");
		               
		            }
		    		}
		        
		        
		    }
		 if (count == exp.length) {
		        System.out.println(""+count+":matched");
		
		    } else {
		    	Assert.assertTrue("ENGINE: DOES NOT MATCH", status);
		        System.out.println(" ACTUAL MENU DOES NOT MATCH WITH EXPECTED MENU LIST ");
		    }
			return status;
			        

		}
	public void PrintListOfWebElements(WebDriver driver, List<WebElement> element) {
		long timeoutInSeconds = 65;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		
		List<WebElement> we = element;
		 int sizeoftheelement=we.size();
		  count = Integer.toString(sizeoftheelement);
		 
		System.out.println("Size of the Menus::" + we.size());
		for (WebElement e : we) {
			System.out.println(e.getText());
			
		}
	}
	
	public boolean PageTopCount(WebDriver driver, WebElement element) {
		isElementDisplayed(driver, element);
		String result = element.getText();
		String str = result.trim();
		String[] splited = str.split(" ");
		String TotalCount = splited[4];
		System.out.println("TotalCount:"+TotalCount);
		System.out.println("Count:"+count);
		boolean status = false;
		if(TotalCount.equals(count))
		{
			System.out.println("ENGINE: THE TABLE ROWS SIZE AND TOP OF THE PAGE COUNT BOTH ARE MATCHING");
			
		}
		else
		{
			Assert.assertTrue("ENGINE: THE TABLE ROWS SIZE AND TOP OF THE PAGE COUNT SHOULD NOT BE SAME", status);
		}
		return status;
	}
	
	
	/**
	 * This method perform mouseOver the specified WebElement
	 * 
	 * @param WebElement
	 */
	public void mouseAction(WebDriver driver,WebElement element, String text)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.sendKeys(text);
		actions.build().perform();
	}
	
	
	/**
	 * This method is used for file upload
	 */
	public void fileUpload(WebDriver driver,WebElement element, String filePath) {
		isElementDisplayed(driver, element);
		WebElement fileInput =element ;
	   fileInput.sendKeys(filePath);
	}
	
	public void DragAndDrop(WebDriver driver, String columnName, WebElement dstElement) throws InterruptedException {
		isElementDisplayed(driver, dstElement);
		String w1 = "//a[@class='k-link'][contains(text(),'%s')]";
		String fullXpath = String.format(w1, columnName);
		//System.out.println(fullXpath);
		WebElement to = driver.findElement(By.xpath(fullXpath));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(to, dstElement).build().perform();

	}

	
public void verifyTheTableIsDisplayed(WebDriver driver, WebElement element) {
		
		boolean status = false; 
		if("Transaction".equals(element.getText()))
		{
	  Assert.assertEquals("Transaction", element.getText());
		}
		else
		{
	  Assert.assertTrue("ENGINE: THE TABLE IS NOT DISPLAYED", status);
		
		}
       
	}

public void Splitthevalues(String GetTextfromWeb, String ExceptedAccount) {
	String result = GetTextfromWeb;
	System.out.println("result"+result);
	String str = result.trim();
	String[] splited = str.split(":");
	String Accountname = splited[0];
	System.out.println(Accountname);
	
	
	boolean status = false;
	if (ExceptedAccount.equals(Accountname)) {
		status = ExceptedAccount.equals(Accountname);
		System.out.println("BOTH ACCOUNT NAMES ARE MATCHING");
	}

	else {
		Assert.assertTrue("ENGINE: THE INVALID ACCOUNT NAME IS  DISPLAYED", status);
	}
}
}
