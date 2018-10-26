package cloud.rehlat.pages.discount_codes;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;



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

public class jazeeraairwaysServicesPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	

	public jazeeraairwaysServicesPage(WebDriver driver) {

		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(name = "mStationCode")
	private WebElement txtFlyFrom;
	@FindBy(xpath = "//input[@value='Invoke']")
	private WebElement btnInvoke;
	
}
