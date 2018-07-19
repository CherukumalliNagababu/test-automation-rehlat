package cloud.rehlat.pages.engine.arabic;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.pages.Accounts.GmailPage;
import cloud.rehlat.pages.Trips.BookNowPage;
import cloud.rehlat.pages.Trips.BookingSummaryPage;
import cloud.rehlat.pages.Trips.OneWayTripPage;
import cloud.rehlat.pages.Trips.TravellerInformationPage;
import cloud.rehlat.pages.Trips.Arabic.BookNowArabicPage;
import cloud.rehlat.pages.Trips.Arabic.BookingSummaryArabicPage;
import cloud.rehlat.pages.Trips.Arabic.OneWayTripArabicPage;
import cloud.rehlat.pages.Trips.Arabic.TravellerInformationArabicPage;
import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;

public class FlightNavigationArabic {
	private WebDriver driver;
	private PageUtils pageUtils;
	
	public FlightNavigationArabic(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	@FindBy(css=".ros_Header_theme_acc_txt")
	private  WebElement btnmouse;
	@FindBy(linkText="Sign In")
	private  WebElement btnSignIn;
	
	@FindBy(css="#customBtn")
	private WebElement btnGmail;
	
	@FindBy(id="radio_1")
	private WebElement radioOneWay;
	@FindBy(xpath=".//*[@id='resetAll']")
	private WebElement linkAllResetInBookNow;
	@FindBy(css="h4.panel-title")
	private WebElement txtlabel;
	@FindBy(css="span.pax_type")
	private WebElement txtValue;
	
	
	
	/**
	 * This method is used to open the mouseover of login
	 */
	public  void LoginbuttonmouseOver() {
		pageUtils.mouseAction(driver, btnmouse);
	}
	/**
	 * This method is used to navigate to the Sign in  Page
	 
	 */
	public  void clicksignbtn() {
		pageUtils.clickElement(driver, btnSignIn);
		
	}
	
	public  GmailPage clickgmail() {
		pageUtils.clickElement(driver, btnGmail);
		return new GmailPage(driver);
	}
	
	public  OneWayTripArabicPage clickOneWayArabic() {
		pageUtils.clickElement(driver, radioOneWay);
		return new OneWayTripArabicPage(driver);
	}
	public  OneWayTripPage clickOneWay() {
		pageUtils.clickElement(driver, radioOneWay);
		return new OneWayTripPage(driver);
	}
	
	public  BookNowPage clickAllReset() {
		pageUtils.clickElement(driver, linkAllResetInBookNow);
		return new BookNowPage(driver);
	}
	public  BookNowArabicPage clickAllResetArabic() {
		pageUtils.clickElement(driver, linkAllResetInBookNow);
		return new BookNowArabicPage(driver);
	}
	
	public  BookingSummaryPage getText() throws InterruptedException {
		
		String text=pageUtils.getTextOfElement(driver, txtlabel);
		System.out.println(text);
		return new BookingSummaryPage(driver);
	}
	public  BookingSummaryArabicPage getTextArabic() {
		String text=pageUtils.getTextOfElement(driver, txtlabel);
		System.out.println(text);
		return new BookingSummaryArabicPage(driver);
	}
	
	public  TravellerInformationArabicPage getTextValue() {
		String text=pageUtils.getTextOfElement(driver, txtValue);
		System.out.println(text);
		return new TravellerInformationArabicPage(driver);
	}
	//All menu items
	@FindBy(xpath=".//*[@id='menu']") 
	private WebElement Allmenu;  	
	
	//Elements for File Data Extraction menu-items
	@FindBy(css="i.fa-file-pdf-o") 
	private WebElement lnkFileDataExtraction;  				//sa, cu, rm, pa
	@FindBy(css="a[href='/Stashboard/StashboardSummary']") 
	private WebElement lnkSubMenuStashboardSummary; 				//sa, rm
	@FindBy(css="a[href='/Parse/PdfAnonymizer']") 
	private WebElement lnkSubMenuPdfAnonymizer; 					//sa, rm
	@FindBy(css="a[href='/Parse/#mainParser']") 
	private WebElement lnkSubMenuParsing;							//sa, cu, rm, pa
	@FindBy(css="a[href='/Parse/Export']") 
	private WebElement lnkSubMenuExportToExcel;					//sa, cu, rm, pa
	@FindBy(css="a[href='/Stashboard/']") 
	private WebElement lnkSubMenuStashboard;						//sa, rm
	
	//Elements for Data Upload menu-items
	@FindBy(css="i.fa-upload") 
	private WebElement lnkDataUpload; 						//sa, cu, rm, pa
	@FindBy(css="a[href='/Normalization/']") 
	private WebElement lnkSubMenuRecentSesssion;					//sa, cu, rm, pa
	@FindBy(css="a[href='/Normalization/ProcessParsedFiles']") 
	private WebElement lnkSubMenuProcessParsedFiles;				//sa, cu, rm, pa
	@FindBy(css="a[href='/Normalization/ContinuePendingProcessing']") 
	private WebElement lnkSubMenuContinuePendingProcessing;		//sa, cu, rm, pa
	@FindBy(css="li.k-state-active a[href='/Normalization/ManualEnter']") 
	private WebElement lnkSubMenuManualTransaction;				//sa, cu, rm, pa
	@FindBy(css="a[href='/SimpleTransactions/SimpleTransactions']") 
	private WebElement lnkSubMenuSimpleTransaction;				//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/CanopyUlUpload']") 
	private WebElement lnkSubMenuCanopyUlFileUpload;				//sa, cu, rm, pa
	
	//Elements for Net Asset Value menu-items
	@FindBy(css="i.fa-calculator") 
	private WebElement lnkNetAssetValue; 					//sa, cu, rm, pa
	@FindBy(css="a[href='/Manage/#eod_operation']") 
	private WebElement lnkSubMenuNavCalculation;					//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/Portfolios']") 
	private WebElement lnkSubMenuNavHistory;						//sa, cu, rm, pa
	
	//Elements for Transactions menu-items
	@FindBy(css="i.fa-table") 
	private WebElement lnkTransactions; 					//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/Blotters']") 
	private WebElement lnkSubMenuTransactionsBlotter;				//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/PreProcessBlotters']") 
	private WebElement lnkSubMenuPreProcessedTransactions;			//sa, rm
	
	//Elements for Securities menu-items
	@FindBy(css="i.fa-line-chart") 
	private WebElement lnkSecurities; 						//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/SecuritySearch']") 
	private WebElement lnkSubMenuSearch;							//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/FundEtfSearch']") 
	private WebElement lnkSubMenuFundEtfSearch;					//sa, rm
	@FindBy(css="a[href='/Import/#bloombergImport']") 
	private WebElement lnkSubMenuSecurityDataImport;				//sa, cu, rm, pa
	@FindBy(css="a[href='/ManualSecurity/ManualSecurityCreation']") 
	private WebElement lnkSubMenuManualSecurityCreation;			//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/SecurityPriceSearch']") 
	private WebElement lnkSubMenuSecurityPrices;					//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/AssetHolders']") 
	private WebElement lnkSubMenuSecurityHolders;					//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/SecurityExposures']") 
	private WebElement lnkSubMenuExposures;						//sa, cu, rm
	@FindBy(css="a[href='/ControlRoom/BankSecurityMapping']") 
	private WebElement lnkSubMenuBankSecurityMapping;				//sa, rm
	@FindBy(css="a[href='/ControlRoom/BulkSecurityMapping']") 
	private WebElement lnkSubMenuBulkSecurityMapping;				//sa, rm
	@FindBy(css="a[href='/ControlRoom/CustomizedIndexRule']") 
	private WebElement lnkSubMenuCIXPriceRule;						//sa, rm
	
	//Elements for User Accounts menu-items
	@FindBy(css="i.fa-users") 
	private WebElement lnkUserAccounts; 					//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/Users']") 
	private WebElement lnkSubMenuAccounts;						    //sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/Accounts']") 
	private WebElement lnkSubMenuCcyAccounts;						//sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/HoldingsPerUser']") 
	private WebElement lnkSubMenuAccountHoldings;                  //sa, cu, rm, pa
	@FindBy(css="a[href='/ControlRoom/Groups']") 
	private WebElement lnkSubMenuGroups;                           //sa, cu, rm, pa
	@FindBy(css="a[href='/Normalization/MapAccounts']") 
	private WebElement lnkSubMenuCcyAccountMappings;				//sa, cu, rm, pa
	
	//Elements for Reports menu-items
	@FindBy(css="i.fa-pie-chart")
	private WebElement lnkReports;							//sa, cu, rm, pa
	@FindBy(css="a[href='/Reporting/Manage']")
	private WebElement lnkSubMenuReportsTemplatesDesign;			//sa, cu, rm, pa
	@FindBy(css="a[href='/Reporting/Generate']")
	private WebElement lnkSubMenuReportsGeneration;				//sa, cu, rm, pa
	
	//Elements apart from the menu items
	@FindBy(css="button#toggleMenu")
	private WebElement btnToggle;
	@FindBy(css="span#lnkName")
	private WebElement lblUsername;
	@FindBy(css="i.fa-caret-down")
	private WebElement drpMenu;
	@FindBy(css="h2.text-center")
	private WebElement lblDefaultEnginePageHeading;
	
	//Elements for Admin
	@FindBy(css="i.fa.fa-list-ul")
	private WebElement AdminToggle;
	
	@FindBy(xpath="//li[@id='menu_pb_active']/ul/li/a/span")
	private WebElement btnConsistencyCheckNew;
	
	@FindBy(css="input.k-input")
	private WebElement dropAccount;
	
	/**
	 * This method is used to open the sub-menu of File Data Extraction
	 */
	public void clickMainMenuFileDataExtraction() {
		pageUtils.clickElement(driver, lnkFileDataExtraction);
	}
	
	/**
	 * This method is used to navigate to the Stashboard Summary Page
	 * @return StashboardSummaryPage
	 */
/*	public StashboardSummaryPage clickSubMenuStashboardSummary() {
		pageUtils.clickElement(driver, lnkSubMenuAccounts);
		return new StashboardSummaryPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Pdf AnonymizerPage Page
	 * @return PdfAnonymizerPage
	 *//*
	public PdfAnonymizerPage clickSubMenuPdfAnonymizer() {
		pageUtils.clickElement(driver, lnkSubMenuPdfAnonymizer);
		return new PdfAnonymizerPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Parsing Page
	 * @return ParsingPage
	 *//*
	public ParsingPage clickSubMenuParsing() {
		pageUtils.clickElement(driver, lnkSubMenuParsing);
		return new ParsingPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the ExportToExcel Page
	 * @return ExportToExcelPage
	 *//*
	public ExportToExcelPage clickSubMenuExportToExcel() {
		pageUtils.clickElement(driver, lnkSubMenuExportToExcel);
		return new ExportToExcelPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Stashboard Page
	 * @return StashboardPage
	 *//*
	public StashboardPage clickSubMenuStashboard() {
		pageUtils.clickElement(driver, lnkSubMenuStashboard);
		return new StashboardPage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of Data Upload
	 *//*
	public void clickMainMenuDataUpload() {
		pageUtils.clickElement(driver, lnkDataUpload);
	}
	
	*//**
	 * This method is used to navigate to the RecentSession Page
	 * @return RecentSessionPage
	 *//*
	public RecentSessionPage clickSubMenuRecentSession() {
		pageUtils.clickElement(driver, lnkSubMenuRecentSesssion);
		return new RecentSessionPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the ProcessParsedFiles Page
	 * @return ProcessParsedFilesPage
	 *//*
	public ProcessParsedFilesPage clickSubMenuProcessParsedFiles() {
		pageUtils.clickElement(driver, lnkSubMenuProcessParsedFiles);
		return new ProcessParsedFilesPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the ContinuePendingProcessing Page
	 * @return ContinuePendingProcessingPage
	 *//*
	public ContinuePendingProcessingPage clickSubMenuContinuePendingProcessing() {
		pageUtils.clickElement(driver, lnkSubMenuContinuePendingProcessing);
		return new ContinuePendingProcessingPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the ManualTransaction Page
	 * @return ManualTransactionPage
	 *//*
	public ManualTransactionPage clickSubMenuManualTransaction() {
		pageUtils.clickElement(driver, lnkSubMenuManualTransaction);
		return new ManualTransactionPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the SimpleTransactionPage Page
	 * @return SimpleTransactionPage
	 *//*
	public SimpleTransactionPage clickSubMenuSimpleTransaction() {
		pageUtils.clickElement(driver, lnkSubMenuSimpleTransaction);
		return new SimpleTransactionPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Canopy UL file upload Page
	 * @return CanopyUlFileUploadPage
	 *//*
	public CanopyUlFileUploadPage clickSubMenuCanopyUlFileUpload() {
		pageUtils.clickElement(driver, lnkSubMenuCanopyUlFileUpload);
		return new CanopyUlFileUploadPage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of Net Asset Value
	 *//*
	public void clickMainMenuNetAssetValue() {
		pageUtils.clickElement(driver, lnkNetAssetValue);
	}
	
	*//**
	 * This method is used to navigate to the NAV Calculation Page
	 * @return NavCalculationPage
	 *//*
	public NavCalculationPage clickSubMenuNavCalculation() {
		pageUtils.clickElement(driver, lnkSubMenuNavCalculation);
		return new NavCalculationPage(driver);
	}
	
	public navowncal clickSubMenuNavCalculation1() {
		pageUtils.clickElement(driver, lnkSubMenuNavCalculation);
		return new navowncal(driver);
	}
	
	*//**
	 * This method is used to navigate to the NAV History Page
	 * @return NavHistoryPage
	 *//*
	public NavHistoryPage clickSubMenuNavHistory() {
		pageUtils.clickElement(driver, lnkSubMenuNavHistory);
		return new NavHistoryPage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of Transactions
	 *//*
	public void clickMainMenuTransactions() {
		pageUtils.clickElement(driver, lnkTransactions);
	}
	
	*//**
	 * This method is used to navigate to the Transaction Blotter Page
	 * @return TransactionsBlotterPage
	 *//*
	public TransactionsBlotterPage clickSubMenuTransactionsBlotter() {
		pageUtils.clickElement(driver, lnkSubMenuTransactionsBlotter);
		return new TransactionsBlotterPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Pre-processed transactions Page
	 * @return PreProcessedTransactionsPage
	 *//*
	public PreProcessedTransactionsPage clickSubMenuPreProcessedTransactions() {
		pageUtils.clickElement(driver, lnkSubMenuPreProcessedTransactions);
		return new PreProcessedTransactionsPage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of Securities
	 *//*
	public void clickMainMenuSecurities() {
		pageUtils.clickElement(driver, lnkSecurities);
	}
	
	*//**
	 * This method is used to navigate to the Search Page
	 * @return SearchPage
	 *//*
	public SearchPage clickSubMenuSearchSecurities() {
		pageUtils.clickElement(driver, lnkSubMenuSearch);
		return new SearchPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Fund Etf Search Page
	 * @return FundEtfSearchPage
	 *//*
	public FundEtfSearchPage clickSubMenuFundEtfSearch() {
		pageUtils.clickElement(driver, lnkSubMenuFundEtfSearch);
		return new FundEtfSearchPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Security Data Import Page
	 * @return SecurityDataImportPage
	 *//*
	public SecurityDataImportPage clickSubMenuSecurityDataImport() {
		pageUtils.clickElement(driver, lnkSubMenuSecurityDataImport);
		return new SecurityDataImportPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Manual Security Creation Page
	 * @return ManualSecurityCreationPage
	 *//*
	public ManualSecurityCreationPage clickSubMenuManualSecurityCreation() {
		pageUtils.clickElement(driver, lnkSubMenuManualSecurityCreation);
		return new ManualSecurityCreationPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Security Prices Page
	 * @return SecurityPricesPage
	 *//*
	public SecurityPricesPage clickSubMenuSecurityPrices() {
		pageUtils.clickElement(driver, lnkSubMenuSecurityPrices);
		return new SecurityPricesPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Security Holders Page
	 * @return SecurityHoldersPage
	 *//*
	public SecurityHoldersPage clickSubMenuSecurityHolders() {
		pageUtils.clickElement(driver, lnkSubMenuSecurityHolders);
		return new SecurityHoldersPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Exposures Page
	 * @return ExposuresPage
	 *//*
	public ExposuresPage clickSubMenuExposures() {
		pageUtils.clickElement(driver, lnkSubMenuExposures);
		return new ExposuresPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Bank Security Mapping Page
	 * @return BankSecurityMappingPage
	 *//*
	public BankSecurityMappingPage clickSubMenuBankSecurityMapping() {
		pageUtils.clickElement(driver, lnkSubMenuBankSecurityMapping);
		return new BankSecurityMappingPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Bulk Security Mapping Page
	 * @return BulkSecurityMappingPage
	 *//*
	public BulkSecurityMappingPage clickSubMenuBulkSecurityMapping() {
		pageUtils.clickElement(driver, lnkSubMenuBulkSecurityMapping);
		return new BulkSecurityMappingPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Bulk Security Mapping Page
	 * @return CixPriceRulePage
	 *//*
	public CixPriceRulePage clickSubMenuCixPriceRule() {
		pageUtils.clickElement(driver, lnkSubMenuCIXPriceRule);
		return new CixPriceRulePage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of User Accounts
	 *//*
	public void clickMainMenuUserAccounts() {
		pageUtils.clickElement(driver, lnkUserAccounts);
	}
	
	*//**
	 * This method is used to navigate to the Accounts Page
	 * @return AccountsPage
	 *//*
	public AccountsPage clickSubMenuAccounts() {
		pageUtils.clickElement(driver, lnkSubMenuAccounts);
		return new AccountsPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Currency Accounts Page
	 * @return CcyAccountsPage
	 *//*
	public CcyAccountsPage clickSubMenuCcyAccounts() {
		pageUtils.clickElement(driver, lnkSubMenuCcyAccounts);
		return new CcyAccountsPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Account Holdings Page
	 * @return AccountHoldingsPage
	 *//*
	public AccountHoldingsPage clickSubMenuAccountHoldings() {
		pageUtils.clickElement(driver, lnkSubMenuAccountHoldings);
		return new AccountHoldingsPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the GroupsPage Page
	 * @return GroupsPage
	 *//*
	public GroupsPage clickSubMenuGroups() {
		pageUtils.clickElement(driver, lnkSubMenuGroups);
		return new GroupsPage(driver);
	}
	
	*//**
	 * This method is used to open the sub-menu of Reports
	 *//*
	public void clickMainMenuReports() {
		pageUtils.clickElement(driver, lnkReports);
	}
	
	*//**
	 * This method is used to navigate to the Reports Templates Design Page
	 * @return ReportsTemplatesDesignPage
	 *//*
	public ReportsTemplatesDesignPage clickSubMenuReportsTemplatesDesign() {
		pageUtils.clickElement(driver, lnkSubMenuReportsTemplatesDesign);
		return new ReportsTemplatesDesignPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Reports Generation Page
	 * @return ReportsGenerationPage
	 *//*
	public ReportsGenerationPage clickSubMenuReportsGeneration() {
		pageUtils.clickElement(driver, lnkSubMenuReportsGeneration);
		return new ReportsGenerationPage(driver);
	}
	
	
	*//**
	 * This method is used to navigate to the Admin Page
	 * @return ConsistencyCheckNewPage
	 *//*
	public ConsistencyCheckNewPage clickAdmin() {
		pageUtils.clickElement(driver, AdminToggle);
		return new ConsistencyCheckNewPage(driver);
	}
	
	*//**
	 * This method is used to navigate to the Admin submenu Page
	 * @return ConsistencyCheckNewPage
	 *//*
	public ConsistencyCheckNewPage clickConsitencySubmenu() {
		pageUtils.clickElement(driver, btnConsistencyCheckNew);
		return new ConsistencyCheckNewPage(driver);
	}
	
	public void lisiofwebelements()
	{
		pageUtils.PrintListOfWebElements(Allmenu, "li");
	}*/
	
}
