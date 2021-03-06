package cloud.rehlat.pages.Trips.Arabic;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cloud.rehlat.constants.common.BrowserConstants;

import cloud.rehlat.utils.PageUtils;
import cloud.rehlat.utils.TestDataUtils;
import cloud.rehlat.constants.common.DataConstants;

public class TravellerInformationArabicPage {
	public WebDriver driver;
	private PageUtils pageUtils;
	String firstName;
	String middleName;
	String lastName;

	public TravellerInformationArabicPage(WebDriver driver) {
		this.driver = driver;
		this.pageUtils = PageUtils.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id = "countries")
	private WebElement btndrpClick;
	@FindBy(xpath = ".//*[@id='countries_child']/ul/li")
	private List<WebElement> drpCountry;
	@FindBy(id = "PhonenumberTraveller")
	private WebElement txtPhoneNumber;
	@FindBy(css = "#btnMakepayment2")
	private WebElement btnPaySecurely;

	// Adult 1 with passport
	@FindBy(css = "select[name=\"Pax[0].Gender\"]")
	private WebElement drpAdultG1;
	@FindBy(css = "#Adult_FirstName1")
	private WebElement txtAdultfirstName1;
	@FindBy(css = "#Adult_LastName1")
	private WebElement txtAdultLastName1;
	@FindBy(css = "#AdultDate0")
	private WebElement drpAdultDate1;
	@FindBy(css = "#AdultMonth0")
	private WebElement drpAdultMonth1;
	@FindBy(css = "#AdultYear0")
	private WebElement drpAdultYear1;
	@FindBy(css = "input[name=\"Pax[0].PassportNo\"]")
	private WebElement txtAdultPassportNum1;
	@FindBy(css = "#Adult_Nationality_0")
	private WebElement drpAdultnationality1;
	@FindBy(css = "#Adult_IssuingCountryCode_0")
	private WebElement drpAdultIssuing1;
	@FindBy(css = "#PassAdultDate0")
	private WebElement drpAdultExpDate1;
	@FindBy(css = "#PassAdultMonth0")
	private WebElement drpAdultExpMonth1;
	@FindBy(css = "#PassAdultYear0")
	private WebElement drpAdultExpYear1;
	// Adult 2 with passport
	@FindBy(css = "select[name=\"Pax[1].Gender\"]")
	private WebElement drpAdultG2;
	@FindBy(css = "#Adult_FirstName2")
	private WebElement txtAdultfirstName2;
	@FindBy(css = "#Adult_LastName2")
	private WebElement txtAdultLastName2;
	@FindBy(css = "#AdultDate1")
	private WebElement drpAdultDate2;
	@FindBy(css = "#AdultMonth1")
	private WebElement drpAdultMonth2;
	@FindBy(css = "#AdultYear1")
	private WebElement drpAdultYear2;
	@FindBy(css = "input[name=\"Pax[1].PassportNo\"]")
	private WebElement txtAdultPassportNum2;
	@FindBy(css = "#Adult_Nationality_1")
	private WebElement drpAdultnationality2;
	@FindBy(css = "#Adult_IssuingCountryCode_1")
	private WebElement drpAdultIssuing2;
	@FindBy(css = "#PassAdultDate1")
	private WebElement drpAdultExpDate2;
	@FindBy(css = "#PassAdultMonth1")
	private WebElement drpAdultExpMonth2;
	@FindBy(css = "#PassAdultYear1")
	private WebElement drpAdultExpYear2;

	// Adult 3 with passport
	@FindBy(css = "select[name=\"Pax[2].Gender\"]")
	private WebElement drpAdultG3;
	@FindBy(css = "#Adult_FirstName3")
	private WebElement txtAdultfirstName3;
	@FindBy(css = "#Adult_LastName3")
	private WebElement txtAdultLastName3;
	@FindBy(css = "#AdultDate2")
	private WebElement drpAdultDate3;
	@FindBy(css = "#AdultMonth2")
	private WebElement drpAdultMonth3;
	@FindBy(css = "#AdultYear2")
	private WebElement drpAdultYear3;
	@FindBy(css = "input[name=\"Pax[2].PassportNo\"]")
	private WebElement txtAdultPassportNum3;
	@FindBy(css = "#Adult_Nationality_2")
	private WebElement drpAdultnationality3;
	@FindBy(css = "#Adult_IssuingCountryCode_2")
	private WebElement drpAdultIssuing3;
	@FindBy(css = "#PassAdultDate2")
	private WebElement drpAdultExpDate3;
	@FindBy(css = "#PassAdultMonth2")
	private WebElement drpAdultExpMonth3;
	@FindBy(css = "#PassAdultYear2")
	private WebElement drpAdultExpYear3;

	// Adult 4 with passport
	@FindBy(css = "select[name=\"Pax[3].Gender\"]")
	private WebElement drpAdultG4;
	@FindBy(css = "#Adult_FirstName4")
	private WebElement txtAdultfirstName4;
	@FindBy(css = "#Adult_LastName4")
	private WebElement txtAdultLastName4;
	@FindBy(css = "#AdultDate3")
	private WebElement drpAdultDate4;
	@FindBy(css = "#AdultMonth3")
	private WebElement drpAdultMonth4;
	@FindBy(css = "#AdultYear3")
	private WebElement drpAdultYear4;
	@FindBy(css = "input[name=\"Pax[3].PassportNo\"]")
	private WebElement txtAdultPassportNum4;
	@FindBy(css = "#Adult_Nationality_3")
	private WebElement drpAdultnationality4;
	@FindBy(css = "#Adult_IssuingCountryCode_3")
	private WebElement drpAdultIssuing4;
	@FindBy(css = "#PassAdultDate3")
	private WebElement drpAdultExpDate4;
	@FindBy(css = "#PassAdultMonth3")
	private WebElement drpAdultExpMonth4;
	@FindBy(css = "#PassAdultYear3")
	private WebElement drpAdultExpYear4;

	// Adult 5 with passport
	@FindBy(css = "select[name=\"Pax[4].Gender\"]")
	private WebElement drpAdultG5;
	@FindBy(css = "#Adult_FirstName5")
	private WebElement txtAdultfirstName5;
	@FindBy(css = "#Adult_LastName5")
	private WebElement txtAdultLastName5;
	@FindBy(css = "#AdultDate4")
	private WebElement drpAdultDate5;
	@FindBy(css = "#AdultMonth4")
	private WebElement drpAdultMonth5;
	@FindBy(css = "#AdultYear4")
	private WebElement drpAdultYear5;
	@FindBy(css = "input[name=\"Pax[4].PassportNo\"]")
	private WebElement txtAdultPassportNum5;
	@FindBy(css = "#Adult_Nationality_4")
	private WebElement drpAdultnationality5;
	@FindBy(css = "#Adult_IssuingCountryCode_4")
	private WebElement drpAdultIssuing5;
	@FindBy(css = "#PassAdultDate4")
	private WebElement drpAdultExpDate5;
	@FindBy(css = "#PassAdultMonth4")
	private WebElement drpAdultExpMonth5;
	@FindBy(css = "#PassAdultYear4")
	private WebElement drpAdultExpYear5;

	// Adult 6 with passport
	@FindBy(css = "select[name=\"Pax[5].Gender\"]")
	private WebElement drpAdultG6;
	@FindBy(css = "#Adult_FirstName6")
	private WebElement txtAdultfirstName6;
	@FindBy(css = "#Adult_LastName6")
	private WebElement txtAdultLastName6;
	@FindBy(css = "#AdultDate5")
	private WebElement drpAdultDate6;
	@FindBy(css = "#AdultMonth5")
	private WebElement drpAdultMonth6;
	@FindBy(css = "#AdultYear5")
	private WebElement drpAdultYear6;
	@FindBy(css = "input[name=\"Pax[5].PassportNo\"]")
	private WebElement txtAdultPassportNum6;
	@FindBy(css = "#Adult_Nationality_5")
	private WebElement drpAdultnationality6;
	@FindBy(css = "#Adult_IssuingCountryCode_5")
	private WebElement drpAdultIssuing6;
	@FindBy(css = "#PassAdultDate5")
	private WebElement drpAdultExpDate6;
	@FindBy(css = "#PassAdultMonth5")
	private WebElement drpAdultExpMonth6;
	@FindBy(css = "#PassAdultYear5")
	private WebElement drpAdultExpYear6;

	// Adult 7 with passport
	@FindBy(css = "select[name=\"Pax[6].Gender\"]")
	private WebElement drpAdultG7;
	@FindBy(css = "#Adult_FirstName7")
	private WebElement txtAdultfirstName7;
	@FindBy(css = "#Adult_LastName7")
	private WebElement txtAdultLastName7;
	@FindBy(css = "#AdultDate6")
	private WebElement drpAdultDate7;
	@FindBy(css = "#AdultMonth6")
	private WebElement drpAdultMonth7;
	@FindBy(css = "#AdultYear6")
	private WebElement drpAdultYear7;
	@FindBy(css = "input[name=\"Pax[6].PassportNo\"]")
	private WebElement txtAdultPassportNum7;
	@FindBy(css = "#Adult_Nationality_6")
	private WebElement drpAdultnationality7;
	@FindBy(css = "#Adult_IssuingCountryCode_6")
	private WebElement drpAdultIssuing7;
	@FindBy(css = "#PassAdultDate6")
	private WebElement drpAdultExpDate7;
	@FindBy(css = "#PassAdultMonth6")
	private WebElement drpAdultExpMonth7;
	@FindBy(css = "#PassAdultYear6")
	private WebElement drpAdultExpYear7;

	// Adult 8 with passport
	@FindBy(css = "select[name=\"Pax[7].Gender\"]")
	private WebElement drpAdultG8;
	@FindBy(css = "#Adult_FirstName8")
	private WebElement txtAdultfirstName8;
	@FindBy(css = "#Adult_LastName8")
	private WebElement txtAdultLastName8;
	@FindBy(css = "#AdultDate7")
	private WebElement drpAdultDate8;
	@FindBy(css = "#AdultMonth7")
	private WebElement drpAdultMonth8;
	@FindBy(css = "#AdultYear7")
	private WebElement drpAdultYear8;
	@FindBy(css = "input[name=\"Pax[7].PassportNo\"]")
	private WebElement txtAdultPassportNum8;
	@FindBy(css = "#Adult_Nationality_7")
	private WebElement drpAdultnationality8;
	@FindBy(css = "#Adult_IssuingCountryCode_7")
	private WebElement drpAdultIssuing8;
	@FindBy(css = "#PassAdultDate7")
	private WebElement drpAdultExpDate8;
	@FindBy(css = "#PassAdultMonth7")
	private WebElement drpAdultExpMonth8;
	@FindBy(css = "#PassAdultYear7")
	private WebElement drpAdultExpYear8;

	// Adult 9 with passport
	@FindBy(css = "select[name=\"Pax[8].Gender\"]")
	private WebElement drpAdultG9;
	@FindBy(css = "#Adult_FirstName9")
	private WebElement txtAdultfirstName9;
	@FindBy(css = "#Adult_LastName9")
	private WebElement txtAdultLastName9;
	@FindBy(css = "#AdultDate8")
	private WebElement drpAdultDate9;
	@FindBy(css = "#AdultMonth8")
	private WebElement drpAdultMonth9;
	@FindBy(css = "#AdultYear8")
	private WebElement drpAdultYear9;
	@FindBy(css = "input[name=\"Pax[8].PassportNo\"]")
	private WebElement txtAdultPassportNum9;
	@FindBy(css = "#Adult_Nationality_8")
	private WebElement drpAdultnationality9;
	@FindBy(css = "#Adult_IssuingCountryCode_8")
	private WebElement drpAdultIssuing9;
	@FindBy(css = "#PassAdultDate8")
	private WebElement drpAdultExpDate9;
	@FindBy(css = "#PassAdultMonth8")
	private WebElement drpAdultExpMonth9;
	@FindBy(css = "#PassAdultYear8")
	private WebElement drpAdultExpYear9;

	// Child 1 with Passport

	@FindBy(id = "Child_Gender1")
	private WebElement drpChildG1;
	@FindBy(id = "Child_FirstName1")
	private WebElement txtChildFirstName1;
	@FindBy(id = "Child_MiddleName1")
	private WebElement txtChildMiddleName1;
	@FindBy(id = "Child_LastName1")
	private WebElement txtChildLastName1;
	@FindBy(id = "ChildDate1")
	private WebElement drpChildDate1;
	@FindBy(id = "ChildMonth1")
	private WebElement drpChildMonth1;
	@FindBy(id = "ChildYear1")
	private WebElement drpChildYear1;
	@FindBy(xpath = "//div[@id='ChildPass_0']/div[2]/div/input")
	private WebElement txtChildPassportNum1;
	@FindBy(id = "Children_Nationality_0")
	private WebElement drpChildnationality1;
	@FindBy(id = "Children_IssuingCountryCode_0")
	private WebElement drpChildIssuing1;
	@FindBy(id = "PassChildDate1")
	private WebElement drpChildExpDate1;
	@FindBy(id = "PassChildMonth1")
	private WebElement drpChildExpMonth1;
	@FindBy(id = "PasschildYear1")
	private WebElement drpChildExpYear1;

	// Child 2 with Passport

	@FindBy(id = "Child_Gender2")
	private WebElement drpChildG2;
	@FindBy(id = "Child_FirstName2")
	private WebElement txtChildFirstName2;
	@FindBy(id = "Child_MiddleName2")
	private WebElement txtChildMiddleName2;
	@FindBy(id = "Child_LastName2")
	private WebElement txtChildLastName2;
	@FindBy(id = "ChildDate2")
	private WebElement drpChildDate2;
	@FindBy(id = "ChildMonth2")
	private WebElement drpChildMonth2;
	@FindBy(id = "ChildYear2")
	private WebElement drpChildYear2;
	@FindBy(xpath = "//div[@id='ChildPass_1']/div[2]/div/input")
	private WebElement txtChildPassportNum2;
	@FindBy(id = "Children_Nationality_1")
	private WebElement drpChildnationality2;
	@FindBy(id = "Children_IssuingCountryCode_1")
	private WebElement drpChildIssuing2;
	@FindBy(id = "PassChildDate2")
	private WebElement drpChildExpDate2;
	@FindBy(id = "PassChildMonth2")
	private WebElement drpChildExpMonth2;
	@FindBy(id = "PasschildYear2")
	private WebElement drpChildExpYear2;

	// Child 3 with Passport

	@FindBy(id = "Child_Gender3")
	private WebElement drpChildG3;
	@FindBy(id = "Child_FirstName3")
	private WebElement txtChildFirstName3;
	@FindBy(id = "Child_MiddleName3")
	private WebElement txtChildMiddleName3;
	@FindBy(id = "Child_LastName3")
	private WebElement txtChildLastName3;
	@FindBy(id = "ChildDate3")
	private WebElement drpChildDate3;
	@FindBy(id = "ChildMonth3")
	private WebElement drpChildMonth3;
	@FindBy(id = "ChildYear3")
	private WebElement drpChildYear3;
	@FindBy(xpath = "//div[@id='ChildPass_2']/div[2]/div/input")
	private WebElement txtChildPassportNum3;
	@FindBy(id = "Children_Nationality_2")
	private WebElement drpChildnationality3;
	@FindBy(id = "Children_IssuingCountryCode_2")
	private WebElement drpChildIssuing3;
	@FindBy(id = "PassChildDate3")
	private WebElement drpChildExpDate3;
	@FindBy(id = "PassChildMonth3")
	private WebElement drpChildExpMonth3;
	@FindBy(id = "PasschildYear3")
	private WebElement drpChildExpYear3;

	// Child 4 with Passport

	@FindBy(id = "Child_Gender4")
	private WebElement drpChildG4;
	@FindBy(id = "Child_FirstName4")
	private WebElement txtChildFirstName4;
	@FindBy(id = "Child_MiddleName4")
	private WebElement txtChildMiddleName4;
	@FindBy(id = "Child_LastName4")
	private WebElement txtChildLastName4;
	@FindBy(id = "ChildDate4")
	private WebElement drpChildDate4;
	@FindBy(id = "ChildMonth4")
	private WebElement drpChildMonth4;
	@FindBy(id = "ChildYear4")
	private WebElement drpChildYear4;
	@FindBy(xpath = "//div[@id='ChildPass_3']/div[2]/div/input")
	private WebElement txtChildPassportNum4;
	@FindBy(id = "Children_Nationality_3")
	private WebElement drpChildnationality4;
	@FindBy(id = "Children_IssuingCountryCode_3")
	private WebElement drpChildIssuing4;
	@FindBy(id = "PassChildDate4")
	private WebElement drpChildExpDate4;
	@FindBy(id = "PassChildMonth4")
	private WebElement drpChildExpMonth4;
	@FindBy(id = "PasschildYear4")
	private WebElement drpChildExpYear4;

	// Child 5 with Passport

	@FindBy(id = "Child_Gender5")
	private WebElement drpChildG5;
	@FindBy(id = "Child_FirstName5")
	private WebElement txtChildFirstName5;
	@FindBy(id = "Child_MiddleName5")
	private WebElement txtChildMiddleName5;
	@FindBy(id = "Child_LastName5")
	private WebElement txtChildLastName5;
	@FindBy(id = "ChildDate5")
	private WebElement drpChildDate5;
	@FindBy(id = "ChildMonth5")
	private WebElement drpChildMonth5;
	@FindBy(id = "ChildYear5")
	private WebElement drpChildYear5;
	@FindBy(xpath = "//div[@id='ChildPass_4']/div[2]/div/input")
	private WebElement txtChildPassportNum5;
	@FindBy(id = "Children_Nationality_4")
	private WebElement drpChildnationality5;
	@FindBy(id = "Children_IssuingCountryCode_4")
	private WebElement drpChildIssuing5;
	@FindBy(id = "PassChildDate5")
	private WebElement drpChildExpDate5;
	@FindBy(id = "PassChildMonth5")
	private WebElement drpChildExpMonth5;
	@FindBy(id = "PasschildYear5")
	private WebElement drpChildExpYear5;

	// Child 6 with Passport

	@FindBy(id = "Child_Gender6")
	private WebElement drpChildG6;
	@FindBy(id = "Child_FirstName6")
	private WebElement txtChildFirstName6;
	@FindBy(id = "Child_MiddleName6")
	private WebElement txtChildMiddleName6;
	@FindBy(id = "Child_LastName6")
	private WebElement txtChildLastName6;
	@FindBy(id = "ChildDate6")
	private WebElement drpChildDate6;
	@FindBy(id = "ChildMonth6")
	private WebElement drpChildMonth6;
	@FindBy(id = "ChildYear6")
	private WebElement drpChildYear6;
	@FindBy(xpath = "//div[@id='ChildPass_5']/div[2]/div/input")
	private WebElement txtChildPassportNum6;
	@FindBy(id = "Children_Nationality_5")
	private WebElement drpChildnationality6;
	@FindBy(id = "Children_IssuingCountryCode_5")
	private WebElement drpChildIssuing6;
	@FindBy(id = "PassChildDate6")
	private WebElement drpChildExpDate6;
	@FindBy(id = "PassChildMonth6")
	private WebElement drpChildExpMonth6;
	@FindBy(id = "PasschildYear6")
	private WebElement drpChildExpYear6;

	// Child 7 with Passport

	@FindBy(id = "Child_Gender7")
	private WebElement drpChildG7;
	@FindBy(id = "Child_FirstName7")
	private WebElement txtChildFirstName7;
	@FindBy(id = "Child_MiddleName7")
	private WebElement txtChildMiddleName7;
	@FindBy(id = "Child_LastName7")
	private WebElement txtChildLastName7;
	@FindBy(id = "ChildDate7")
	private WebElement drpChildDate7;
	@FindBy(id = "ChildMonth7")
	private WebElement drpChildMonth7;
	@FindBy(id = "ChildYear7")
	private WebElement drpChildYear7;
	@FindBy(xpath = "//div[@id='ChildPass_6']/div[2]/div/input")
	private WebElement txtChildPassportNum7;
	@FindBy(id = "Children_Nationality_6")
	private WebElement drpChildnationality7;
	@FindBy(id = "Children_IssuingCountryCode_6")
	private WebElement drpChildIssuing7;
	@FindBy(id = "PassChildDate7")
	private WebElement drpChildExpDate7;
	@FindBy(id = "PassChildMonth7")
	private WebElement drpChildExpMonth7;
	@FindBy(id = "PasschildYear7")
	private WebElement drpChildExpYear7;

	// Child 8 with Passport

	@FindBy(id = "Child_Gender8")
	private WebElement drpChildG8;
	@FindBy(id = "Child_FirstName8")
	private WebElement txtChildFirstName8;
	@FindBy(id = "Child_MiddleName8")
	private WebElement txtChildMiddleName8;
	@FindBy(id = "Child_LastName8")
	private WebElement txtChildLastName8;
	@FindBy(id = "ChildDate8")
	private WebElement drpChildDate8;
	@FindBy(id = "ChildMonth8")
	private WebElement drpChildMonth8;
	@FindBy(id = "ChildYear8")
	private WebElement drpChildYear8;
	@FindBy(xpath = "//div[@id='ChildPass_7']/div[2]/div/input")
	private WebElement txtChildPassportNum8;
	@FindBy(id = "Children_Nationality_7")
	private WebElement drpChildnationality8;
	@FindBy(id = "Children_IssuingCountryCode_7")
	private WebElement drpChildIssuing8;
	@FindBy(id = "PassChildDate8")
	private WebElement drpChildExpDate8;
	@FindBy(id = "PassChildMonth8")
	private WebElement drpChildExpMonth8;
	@FindBy(id = "PasschildYear8")
	private WebElement drpChildExpYear8;

	// Infants 1 with Passport

	@FindBy(css = "select[name=\"Pax[1].Gender\"]")
	private WebElement drpInfantG1;
	@FindBy(id = "Infant_FirstName1")
	private WebElement txtInfantFirstName1;
	@FindBy(id = "Infant_MiddleName1")
	private WebElement txtInfantMiddleName1;
	@FindBy(id = "Infant_LastName1")
	private WebElement txtInfantLastName1;
	@FindBy(id = "InfantDate1")
	private WebElement drpInfantDate1;
	@FindBy(id = "InfantMonth1")
	private WebElement drpInfantMonth1;
	@FindBy(id = "InfantYear1")
	private WebElement drpInfantYear1;
	@FindBy(name = "Pax[1].PassportNo")
	private WebElement txtInfantPassportNum1;
	@FindBy(id = "Infant_Nationality_0")
	private WebElement drpInfantnationality1;
	@FindBy(id = "Infant_IssuingCountryCode_0")
	private WebElement drpInfantIssuing1;
	@FindBy(id = "PassInfantDate1")
	private WebElement drpInfantExpDate1;
	@FindBy(id = "PassInfantMonth1")
	private WebElement drpInfantExpMonth1;
	@FindBy(id = "PassInfantYear1")
	private WebElement drpInfantExpYear1;

	// Infants 2 with Passport

	@FindBy(css = "select[name=\"Pax[2].Gender\"]")
	private WebElement drpInfantG2;
	@FindBy(id = "Infant_FirstName2")
	private WebElement txtInfantFirstName2;
	@FindBy(id = "Infant_MiddleName2")
	private WebElement txtInfantMiddleName2;
	@FindBy(id = "Infant_LastName2")
	private WebElement txtInfantLastName2;
	@FindBy(id = "InfantDate2")
	private WebElement drpInfantDate2;
	@FindBy(id = "InfantMonth2")
	private WebElement drpInfantMonth2;
	@FindBy(id = "InfantYear2")
	private WebElement drpInfantYear2;
	@FindBy(name = "Pax[2].PassportNo")
	private WebElement txtInfantPassportNum2;
	@FindBy(id = "Infant_Nationality_1")
	private WebElement drpInfantnationality2;
	@FindBy(id = "Infant_IssuingCountryCode_1")
	private WebElement drpInfantIssuing2;
	@FindBy(id = "PassInfantDate2")
	private WebElement drpInfantExpDate2;
	@FindBy(id = "PassInfantMonth2")
	private WebElement drpInfantExpMonth2;
	@FindBy(id = "PassInfantYear2")
	private WebElement drpInfantExpYear2;

	// Infants 3 with Passport

	@FindBy(css = "select[name=\"Pax[3].Gender\"]")
	private WebElement drpInfantG3;
	@FindBy(id = "Infant_FirstName3")
	private WebElement txtInfantFirstName3;
	@FindBy(id = "Infant_MiddleName3")
	private WebElement txtInfantMiddleName3;
	@FindBy(id = "Infant_LastName3")
	private WebElement txtInfantLastName3;
	@FindBy(id = "InfantDate3")
	private WebElement drpInfantDate3;
	@FindBy(id = "InfantMonth3")
	private WebElement drpInfantMonth3;
	@FindBy(id = "InfantYear3")
	private WebElement drpInfantYear3;
	@FindBy(name = "Pax[3].PassportNo")
	private WebElement txtInfantPassportNum3;
	@FindBy(id = "Infant_Nationality_2")
	private WebElement drpInfantnationality3;
	@FindBy(id = "Infant_IssuingCountryCode_2")
	private WebElement drpInfantIssuing3;
	@FindBy(id = "PassInfantDate3")
	private WebElement drpInfantExpDate3;
	@FindBy(id = "PassInfantMonth3")
	private WebElement drpInfantExpMonth3;
	@FindBy(id = "PassInfantYear3")
	private WebElement drpInfantExpYear3;

	// Infants 4 with Passport

	@FindBy(css = "select[name=\"Pax[4].Gender\"]")
	private WebElement drpInfantG4;
	@FindBy(id = "Infant_FirstName4")
	private WebElement txtInfantFirstName4;
	@FindBy(id = "Infant_MiddleName4")
	private WebElement txtInfantMiddleName4;
	@FindBy(id = "Infant_LastName4")
	private WebElement txtInfantLastName4;
	@FindBy(id = "InfantDate4")
	private WebElement drpInfantDate4;
	@FindBy(id = "InfantMonth4")
	private WebElement drpInfantMonth4;
	@FindBy(id = "InfantYear4")
	private WebElement drpInfantYear4;
	@FindBy(name = "Pax[4].PassportNo")
	private WebElement txtInfantPassportNum4;
	@FindBy(id = "Infant_Nationality_3")
	private WebElement drpInfantnationality4;
	@FindBy(id = "Infant_IssuingCountryCode_3")
	private WebElement drpInfantIssuing4;
	@FindBy(id = "PassInfantDate4")
	private WebElement drpInfantExpDate4;
	@FindBy(id = "PassInfantMonth4")
	private WebElement drpInfantExpMonth4;
	@FindBy(id = "PassInfantYear4")
	private WebElement drpInfantExpYear4;

	// Infants 5 with Passport

	@FindBy(css = "select[name=\"Pax[5].Gender\"]")
	private WebElement drpInfantG5;
	@FindBy(id = "Infant_FirstName5")
	private WebElement txtInfantFirstName5;
	@FindBy(id = "Infant_MiddleName5")
	private WebElement txtInfantMiddleName5;
	@FindBy(id = "Infant_LastName5")
	private WebElement txtInfantLastName5;
	@FindBy(id = "InfantDate5")
	private WebElement drpInfantDate5;
	@FindBy(id = "InfantMonth5")
	private WebElement drpInfantMonth5;
	@FindBy(id = "InfantYear5")
	private WebElement drpInfantYear5;
	@FindBy(name = "Pax[5].PassportNo")
	private WebElement txtInfantPassportNum5;
	@FindBy(id = "Infant_Nationality_4")
	private WebElement drpInfantnationality5;
	@FindBy(id = "Infant_IssuingCountryCode_4")
	private WebElement drpInfantIssuing5;
	@FindBy(id = "PassInfantDate5")
	private WebElement drpInfantExpDate5;
	@FindBy(id = "PassInfantMonth5")
	private WebElement drpInfantExpMonth5;
	@FindBy(id = "PassInfantYear5")
	private WebElement drpInfantExpYear5;
	// Infants 6 with Passport

	@FindBy(css = "select[name=\"Pax[6].Gender\"]")
	private WebElement drpInfantG6;
	@FindBy(id = "Infant_FirstName6")
	private WebElement txtInfantFirstName6;
	@FindBy(id = "Infant_MiddleName6")
	private WebElement txtInfantMiddleName6;
	@FindBy(id = "Infant_LastName6")
	private WebElement txtInfantLastName6;
	@FindBy(id = "InfantDate6")
	private WebElement drpInfantDate6;
	@FindBy(id = "InfantMonth6")
	private WebElement drpInfantMonth6;
	@FindBy(id = "InfantYear6")
	private WebElement drpInfantYear6;
	@FindBy(name = "Pax[6].PassportNo")
	private WebElement txtInfantPassportNum6;
	@FindBy(id = "Infant_Nationality_5")
	private WebElement drpInfantnationality6;
	@FindBy(id = "Infant_IssuingCountryCode_5")
	private WebElement drpInfantIssuing6;
	@FindBy(id = "PassInfantDate6")
	private WebElement drpInfantExpDate6;
	@FindBy(id = "PassInfantMonth6")
	private WebElement drpInfantExpMonth6;
	@FindBy(id = "PassInfantYear6")
	private WebElement drpInfantExpYear6;

	// Infants 7 with Passport

	@FindBy(css = "select[name=\"Pax[7].Gender\"]")
	private WebElement drpInfantG7;
	@FindBy(id = "Infant_FirstName7")
	private WebElement txtInfantFirstName7;
	@FindBy(id = "Infant_MiddleName7")
	private WebElement txtInfantMiddleName7;
	@FindBy(id = "Infant_LastName7")
	private WebElement txtInfantLastName7;
	@FindBy(id = "InfantDate7")
	private WebElement drpInfantDate7;
	@FindBy(id = "InfantMonth7")
	private WebElement drpInfantMonth7;
	@FindBy(id = "InfantYear7")
	private WebElement drpInfantYear7;
	@FindBy(name = "Pax[7].PassportNo")
	private WebElement txtInfantPassportNum7;
	@FindBy(id = "Infant_Nationality_6")
	private WebElement drpInfantnationality7;
	@FindBy(id = "Infant_IssuingCountryCode_6")
	private WebElement drpInfantIssuing7;
	@FindBy(id = "PassInfantDate7")
	private WebElement drpInfantExpDate7;
	@FindBy(id = "PassInfantMonth7")
	private WebElement drpInfantExpMonth7;
	@FindBy(id = "PassInfantYear7")
	private WebElement drpInfantExpYear7;

	// Infants 8 with Passport

	@FindBy(css = "select[name=\"Pax[8].Gender\"]")
	private WebElement drpInfantG8;
	@FindBy(id = "Infant_FirstName8")
	private WebElement txtInfantFirstName8;
	@FindBy(id = "Infant_MiddleName8")
	private WebElement txtInfantMiddleName8;
	@FindBy(id = "Infant_LastName8")
	private WebElement txtInfantLastName8;
	@FindBy(id = "InfantDate8")
	private WebElement drpInfantDate8;
	@FindBy(id = "InfantMonth8")
	private WebElement drpInfantMonth8;
	@FindBy(id = "InfantYear8")
	private WebElement drpInfantYear8;
	@FindBy(name = "Pax[8].PassportNo")
	private WebElement txtInfantPassportNum8;
	@FindBy(id = "Infant_Nationality_7")
	private WebElement drpInfantnationality8;
	@FindBy(id = "Infant_IssuingCountryCode_7")
	private WebElement drpInfantIssuing8;
	@FindBy(id = "PassInfantDate8")
	private WebElement drpInfantExpDate8;
	@FindBy(id = "PassInfantMonth8")
	private WebElement drpInfantExpMonth8;
	@FindBy(id = "PassInfantYear8")
	private WebElement drpInfantExpYear8;

	public void infant_nation_issuingcountry1() {
		try {
			if (drpInfantnationality1.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality1, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing1, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry2() {
		try {
			if (drpInfantnationality2.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality2, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing2, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry3() {
		try {
			if (drpInfantnationality3.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality3, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing3, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry4() {
		try {
			if (drpInfantnationality4.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality4, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing4, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry5() {
		try {
			if (drpInfantnationality5.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality5, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing5, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry6() {
		try {
			if (drpInfantnationality6.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality6, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing6, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry7() {
		try {
			if (drpInfantnationality7.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality7, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing7, 5);
			}
		} catch (Exception e) {

		}
	}

	public void infant_nation_issuingcountry8() {
		try {
			if (drpInfantnationality8.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpInfantnationality8, 5);
				pageUtils.selectByIndexNumber(drpInfantIssuing8, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber1_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG1, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate1, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth1, 7);
		pageUtils.selectByIndexNumber(drpInfantYear1, 2);
		infant1_passport();

	}

	public void infant1_passport() {
		try {
			if (txtInfantPassportNum1.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum1, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate1, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth1, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear1, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber2_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG2, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate2, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth2, 7);
		pageUtils.selectByIndexNumber(drpInfantYear2, 2);
		infant2_passport();
	}

	public void infant2_passport() {
		try {
			if (txtInfantPassportNum2.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum2, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate2, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth2, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear2, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber3_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG3, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate3, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth3, 7);
		pageUtils.selectByIndexNumber(drpInfantYear3, 2);
		infant3_passport();

	}

	public void infant3_passport() {
		try {
			if (txtInfantPassportNum3.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum3, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate3, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth3, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear3, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber4_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG4, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate4, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth4, 7);
		pageUtils.selectByIndexNumber(drpInfantYear4, 2);
		infant4_passport();
	}

	public void infant4_passport() {
		try {
			if (txtInfantPassportNum4.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum4, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate4, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth4, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear4, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber5_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG5, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate5, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth5, 7);
		pageUtils.selectByIndexNumber(drpInfantYear5, 2);
		infant5_passport();
	}

	public void infant5_passport() {
		try {
			if (txtInfantPassportNum5.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum5, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate5, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth5, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear5, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber6_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG6, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate6, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth6, 7);
		pageUtils.selectByIndexNumber(drpInfantYear6, 2);
		infant6_passport();
	}

	public void infant6_passport() {
		try {
			if (txtInfantPassportNum6.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum6, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate6, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth6, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear6, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber7_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG7, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate7, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth7, 7);
		pageUtils.selectByIndexNumber(drpInfantYear7, 2);

		infant7_passport();
	}

	public void infant7_passport() {
		try {
			if (txtInfantPassportNum7.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum7, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate7, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth7, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear7, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultChildNumber8_CompareToInfant() {
		pageUtils.selectByVisibleText(drpInfantG8, "ذكر");
		pageUtils.selectByIndexNumber(drpInfantDate8, 15);
		pageUtils.selectByIndexNumber(drpInfantMonth8, 7);
		pageUtils.selectByIndexNumber(drpInfantYear8, 2);
		infant8_passport();
	}

	public void infant8_passport() {
		try {
			if (txtInfantPassportNum8.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtInfantPassportNum8, "456789123");

				pageUtils.selectByIndexNumber(drpInfantExpDate8, 12);
				pageUtils.selectByIndexNumber(drpInfantExpMonth8, 6);
				pageUtils.selectByIndexNumber(drpInfantExpYear8, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child1_passport() {
		try {
			if (txtChildPassportNum1.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum1, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality1, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing1, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child2_passport() {
		try {
			if (txtChildPassportNum2.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum2, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality2, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing2, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child3_passport() {
		try {
			if (txtChildPassportNum3.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum3, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality3, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing3, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child4_passport() {
		try {
			if (txtChildPassportNum4.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum4, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality4, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing4, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child5_passport() {
		try {
			if (txtChildPassportNum5.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum5, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality5, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing5, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child6_passport() {
		try {
			if (txtChildPassportNum6.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum6, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality6, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing6, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child7_passport() {
		try {
			if (txtChildPassportNum7.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum7, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality7, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing7, 5);
			}
		} catch (Exception e) {

		}
	}

	public void child8_passport() {
		try {
			if (txtChildPassportNum8.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtChildPassportNum8, "243535");
				pageUtils.selectByIndexNumber(drpChildnationality8, 5);
				pageUtils.selectByIndexNumber(drpChildIssuing8, 5);
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber1_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate1, 15);
		pageUtils.selectByIndexNumber(drpChildMonth1, 7);
		pageUtils.selectByIndexNumber(drpChildYear1, 5);
		AdultNumber1_passportexpiry();

	}

	public void AdultNumber1_passportexpiry() {
		try {
			if (drpChildExpDate1.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate1, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth1, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear1, 7);
			}
		} catch (Exception e) {

		}
	}

	

	public void AdultNumber2_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate2, 15);
		pageUtils.selectByIndexNumber(drpChildMonth2, 7);
		pageUtils.selectByIndexNumber(drpChildYear2, 5);

		AdultNumber2_passportexpiry();

	}

	public void AdultNumber2_passportexpiry() {
		try {
			if (drpChildExpDate2.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate2, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth2, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear2, 7);
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber3_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate3, 15);
		pageUtils.selectByIndexNumber(drpChildMonth3, 7);
		pageUtils.selectByIndexNumber(drpChildYear3, 5);
		AdultNumber3_passportexpiry();

	}

	public void AdultNumber3_passportexpiry() {
		try {
			if (drpChildExpDate3.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate3, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth3, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear3, 7);
			}
		} catch (Exception e) {

		}
	}


	public void AdultNumber4_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate4, 15);
		pageUtils.selectByIndexNumber(drpChildMonth4, 7);
		pageUtils.selectByIndexNumber(drpChildYear4, 5);
		AdultNumber4_passportexpiry();

	}

	public void AdultNumber4_passportexpiry() {
		try {
			if (drpChildExpDate4.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate4, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth4, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear4, 7);
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber5_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate5, 15);
		pageUtils.selectByIndexNumber(drpChildMonth5, 7);
		pageUtils.selectByIndexNumber(drpChildYear5, 5);

		AdultNumber5_passportexpiry();

	}

	public void AdultNumber5_passportexpiry() {
		try {
			if (drpChildExpDate5.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate5, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth5, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear5, 7);
			}
		} catch (Exception e) {

		}
	}


	public void AdultNumber6_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate6, 15);
		pageUtils.selectByIndexNumber(drpChildMonth6, 7);
		pageUtils.selectByIndexNumber(drpChildYear6, 5);
		AdultNumber6_passportexpiry();

	}

	public void AdultNumber6_passportexpiry() {
		try {
			if (drpChildExpDate6.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate6, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth6, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear6, 7);
			}
		} catch (Exception e) {

		}
	}


	public void AdultNumber7_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate7, 15);
		pageUtils.selectByIndexNumber(drpChildMonth7, 7);
		pageUtils.selectByIndexNumber(drpChildYear7, 5);
		AdultNumber7_passportexpiry();

	}

	public void AdultNumber7_passportexpiry() {

		try {
			if (drpChildExpDate7.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate7, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth7, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear7, 7);
			}
		} catch (Exception e) {

		}
	}

	public void AdultNumber8_CompareToChild() {

		pageUtils.selectByIndexNumber(drpChildDate8, 15);
		pageUtils.selectByIndexNumber(drpChildMonth8, 7);
		pageUtils.selectByIndexNumber(drpChildYear8, 5);
		AdultNumber8_passportexpiry();
	}

	public void AdultNumber8_passportexpiry() {

		try {
			if (drpChildExpDate8.isDisplayed()) {
				pageUtils.selectByIndexNumber(drpChildExpDate8, 10);
				pageUtils.selectByIndexNumber(drpChildExpMonth8, 5);
				pageUtils.selectByIndexNumber(drpChildExpYear8, 7);
			}
		} catch (Exception e) {

		}
	}

	public void infantsDetails(Map<String, String> dataMap) {
		String childnum = dataMap.get("childs");
		String adult = dataMap.get("adults");
		String infant = dataMap.get("infant");
		System.out.println("Infants valus:" + infant);
		Integer totalValue = Integer.parseInt(childnum) + Integer.parseInt(adult);
		System.out.println("totalValue:" + totalValue);
		String numberAsString = Integer.toString(totalValue);
		System.out.println(numberAsString);

		if ("1".equals(infant)) {
			// pageUtils.selectByVisibleText(drpInfantG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry1();
		}

		if ("2".equals(infant)) {
			// pageUtils.selectByVisibleText(drpInfantG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry1();
			// pageUtils.selectByVisibleText(drpInfantG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry2();
		}
		if ("3".equals(infant)) {
			// pageUtils.selectByVisibleText(drpInfantG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry1();
			// pageUtils.selectByVisibleText(drpInfantG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry2();
			// pageUtils.selectByVisibleText(drpInfantG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry3();
		}

		if ("4".equals(infant)) {
			// pageUtils.selectByVisibleText(drpInfantG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName1, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber1_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("8".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry1();
			// pageUtils.selectByVisibleText(drpInfantG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName2, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber2_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("7".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry2();
			// pageUtils.selectByVisibleText(drpInfantG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName3, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber3_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("6".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry3();
			// pageUtils.selectByVisibleText(drpInfantG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtInfantLastName4, lastName);
			if ("1".equals(numberAsString)) {
				AdultChildNumber4_CompareToInfant();
			} else if ("2".equals(numberAsString)) {
				AdultChildNumber5_CompareToInfant();
			} else if ("3".equals(numberAsString)) {
				AdultChildNumber6_CompareToInfant();
			} else if ("4".equals(numberAsString)) {
				AdultChildNumber7_CompareToInfant();
			} else if ("5".equals(numberAsString)) {
				AdultChildNumber8_CompareToInfant();
			}
			infant_nation_issuingcountry4();
		}

	}

	public void childDetails(Map<String, String> dataMap) {
		String childnum = dataMap.get("childs");
		String adult = dataMap.get("adults");

		if ("1".equals(childnum)) {

			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
		}

		// Child 2
		if ("2".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
		}

		// Child 3
		if ("3".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
		}

		// Child 4
		if ("4".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
			pageUtils.selectByVisibleText(drpChildG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child4_passport();
		}

		// Child 5
		if ("5".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
			pageUtils.selectByVisibleText(drpChildG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child4_passport();
			pageUtils.selectByVisibleText(drpChildG5, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, lastName);
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child5_passport();
		}

		// Child 6
		if ("6".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
			pageUtils.selectByVisibleText(drpChildG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child4_passport();
			pageUtils.selectByVisibleText(drpChildG5, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, lastName);
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child5_passport();
			pageUtils.selectByVisibleText(drpChildG6, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, lastName);
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child6_passport();
		}

		// Child 7
		if ("7".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
			pageUtils.selectByVisibleText(drpChildG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child4_passport();
			pageUtils.selectByVisibleText(drpChildG5, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, lastName);
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child5_passport();
			pageUtils.selectByVisibleText(drpChildG6, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, lastName);
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child6_passport();
			pageUtils.selectByVisibleText(drpChildG7, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, lastName);
			if ("1".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child7_passport();
		}

		// Child 8
		if ("8".equals(childnum)) {
			pageUtils.selectByVisibleText(drpChildG1, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName1, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName1, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName1, lastName);
			if ("1".equals(adult)) {
				AdultNumber1_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("8".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child1_passport();
			pageUtils.selectByVisibleText(drpChildG2, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);
			if ("1".equals(adult)) {
				AdultNumber2_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("7".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child2_passport();
			pageUtils.selectByVisibleText(drpChildG3, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);
			if ("1".equals(adult)) {
				AdultNumber3_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("6".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child3_passport();
			pageUtils.selectByVisibleText(drpChildG4, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);
			if ("1".equals(adult)) {
				AdultNumber4_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("5".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child4_passport();
			pageUtils.selectByVisibleText(drpChildG5, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, lastName);
			if ("1".equals(adult)) {
				AdultNumber5_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("4".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child5_passport();
			pageUtils.selectByVisibleText(drpChildG6, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, lastName);
			if ("1".equals(adult)) {
				AdultNumber6_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("3".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child6_passport();
			pageUtils.selectByVisibleText(drpChildG7, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, lastName);
			if ("1".equals(adult)) {
				AdultNumber7_CompareToChild();
			} else if ("2".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child7_passport();
			pageUtils.selectByVisibleText(drpChildG8, "ذكر");
			adultrandom();
			pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName8, firstName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName8, middleName);
			pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName8, lastName);
			if ("1".equals(adult)) {
				AdultNumber8_CompareToChild();
			}
			child8_passport();

		}

	}

	public void child2() {
		pageUtils.selectByVisibleText(drpChildG2, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName2, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName2, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName2, lastName);

		/*
		 * try { pageUtils.selectByVisibleText(drpChildDate2, 15);
		 * pageUtils.selectByVisibleText(drpChildMonth2, 7);
		 * pageUtils.selectByVisibleText(drpChildYear2, 5);
		 * 
		 * } catch (Exception e) {
		 * 
		 * } try { pageUtils.sendKeysAfterClearingElement(driver,
		 * txtChildPassportNum2, "243535");
		 * pageUtils.selectByVisibleText(drpChildnationality2, 10);
		 * pageUtils.selectByVisibleText(drpChildIssuing2, 10);
		 * pageUtils.selectByVisibleText(drpChildExpDate2, 9);
		 * pageUtils.selectByVisibleText(drpChildExpMonth2, 3);
		 * pageUtils.selectByVisibleText(drpChildExpYear2, 3); } catch
		 * (Exception e) {
		 * 
		 * }
		 */
	}

	public void child3() {
		pageUtils.selectByVisibleText(drpChildG3, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName3, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName3, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName3, lastName);

	}

	public void child4() {
		pageUtils.selectByVisibleText(drpChildG4, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName4, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName4, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName4, lastName);

	}

	public void child5() {
		pageUtils.selectByVisibleText(drpChildG5, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName5, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName5, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName5, lastName);

	}

	public void child6() {
		pageUtils.selectByVisibleText(drpChildG6, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName6, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName6, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName6, lastName);

	}

	public void child7() {
		pageUtils.selectByVisibleText(drpChildG7, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName7, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName7, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName7, lastName);

	}

	public void child8() {
		pageUtils.selectByVisibleText(drpChildG8, "ذكر");
		pageUtils.sendKeysAfterClearingElement(driver, txtChildFirstName8, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildMiddleName8, middleName);
		pageUtils.sendKeysAfterClearingElement(driver, txtChildLastName8, lastName);

	}

	public void adultDetails(Map<String, String> dataMap) {
		String numofAdults = dataMap.get("adults");
		if (numofAdults.equals("1")) {
			adult1();
		} else if (numofAdults.equals("2")) {
			adult1();
			adult2();
		} else if (numofAdults.equals("3")) {
			adult1();
			adult2();
			adult3();
		} else if (numofAdults.equals("4")) {
			adult1();
			adult2();
			adult3();
			adult4();
		} else if (numofAdults.equals("5")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
		} else if (numofAdults.equals("6")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
		} else if (numofAdults.equals("7")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
		} else if (numofAdults.equals("8")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
			adult8();
		} else if (numofAdults.equals("8")) {
			adult1();
			adult2();
			adult3();
			adult4();
			adult5();
			adult6();
			adult7();
			adult8();
			adult9();
		}
	}

	public void adult1() {
		pageUtils.selectByVisibleText(drpAdultG1, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName1, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName1, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate1, 2);
			pageUtils.selectByIndexNumber(drpAdultMonth1, 7);
			pageUtils.selectByIndexNumber(drpAdultYear1, 5);
			adult_passport1();
		} catch (Exception e) {

		}
	}

	public void adult_passport1() {
		try {
			if (txtAdultPassportNum1.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum1, "243535");
				pageUtils.selectByIndexNumber(drpAdultnationality1, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing1, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate1, 9);
				pageUtils.selectByIndexNumber(drpAdultExpMonth1, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear1, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult2() {
		pageUtils.selectByVisibleText(drpAdultG2, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName2, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName2, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate2, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth2, 7);
			pageUtils.selectByIndexNumber(drpAdultYear2, 5);
			adult_passport2();
		} catch (Exception e) {

		}
	}

	public void adult_passport2() {
		try {
			if (txtAdultPassportNum2.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum2, "243535");
				pageUtils.selectByIndexNumber(drpAdultnationality2, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing2, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate2, 9);
				pageUtils.selectByIndexNumber(drpAdultExpMonth2, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear2, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult3() {
		pageUtils.selectByVisibleText(drpAdultG3, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName3, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName3, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate3, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth3, 7);
			pageUtils.selectByIndexNumber(drpAdultYear3, 8);
			adult_passport3();
		} catch (Exception e) {

		}
	}

	public void adult_passport3() {
		try {
			if (txtAdultPassportNum3.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum3, "243535");
				pageUtils.selectByIndexNumber(drpAdultnationality3, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing3, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate3, 9);
				pageUtils.selectByIndexNumber(drpAdultExpMonth3, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear3, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult4() {
		pageUtils.selectByVisibleText(drpAdultG4, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName4, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName4, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate4, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth4, 7);
			pageUtils.selectByIndexNumber(drpAdultYear4, 8);
			adult_passport4();

		} catch (Exception e) {

		}
	}

	public void adult_passport4() {
		try {
			if (txtAdultPassportNum4.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum4, "243535");
				pageUtils.selectByIndexNumber(drpAdultnationality4, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing4, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate4, 9);
				pageUtils.selectByIndexNumber(drpAdultExpMonth4, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear4, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult5() {
		pageUtils.selectByVisibleText(drpAdultG5, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName5, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName5, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate5, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth5, 7);
			pageUtils.selectByIndexNumber(drpAdultYear5, 8);
			adult_passport5();
		} catch (Exception e) {

		}
	}

	public void adult_passport5() {
		try {
			if (txtAdultPassportNum5.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum5, "253535");
				pageUtils.selectByIndexNumber(drpAdultnationality5, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing5, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate5, 9);
				pageUtils.selectByIndexNumber(drpAdultExpMonth5, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear5, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult6() {
		pageUtils.selectByVisibleText(drpAdultG6, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName6, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName6, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate6, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth6, 7);
			pageUtils.selectByIndexNumber(drpAdultYear6, 8);
			adult_passport6();
		} catch (Exception e) {

		}
	}

	public void adult_passport6() {
		try {
			if (txtAdultPassportNum6.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum6, "263636");
				pageUtils.selectByIndexNumber(drpAdultnationality6, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing6, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate6, 10);
				pageUtils.selectByIndexNumber(drpAdultExpMonth6, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear6, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult7() {
		pageUtils.selectByVisibleText(drpAdultG7, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName7, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName7, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate7, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth7, 7);
			pageUtils.selectByIndexNumber(drpAdultYear7, 8);
			adult_passport7();
		} catch (Exception e) {

		}
	}

	public void adult_passport7() {
		try {
			if (txtAdultPassportNum7.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum7, "273737");
				pageUtils.selectByIndexNumber(drpAdultnationality7, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing7, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate7, 10);
				pageUtils.selectByIndexNumber(drpAdultExpMonth7, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear7, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult8() {
		pageUtils.selectByVisibleText(drpAdultG8, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName8, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName8, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate8, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth8, 7);
			pageUtils.selectByIndexNumber(drpAdultYear8, 8);
			adult_passport8();
		} catch (Exception e) {

		}
	}

	public void adult_passport8() {
		try {
			if (txtAdultPassportNum8.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum8, "283838");
				pageUtils.selectByIndexNumber(drpAdultnationality8, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing8, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate8, 10);
				pageUtils.selectByIndexNumber(drpAdultExpMonth8, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear8, 3);
			}
		} catch (Exception e) {

		}
	}

	public void adult9() {
		pageUtils.selectByVisibleText(drpAdultG9, "ذكر");
		adultrandom();
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultfirstName9, firstName);
		pageUtils.sendKeysAfterClearingElement(driver, txtAdultLastName9, lastName);

		try {
			pageUtils.selectByIndexNumber(drpAdultDate9, 15);
			pageUtils.selectByIndexNumber(drpAdultMonth9, 7);
			pageUtils.selectByIndexNumber(drpAdultYear9, 8);
			adult_passport9();
		} catch (Exception e) {

		}
	}

	public void adult_passport9() {
		try {
			if (txtAdultPassportNum9.isDisplayed()) {
				pageUtils.sendKeysAfterClearingElement(driver, txtAdultPassportNum9, "293939");
				pageUtils.selectByIndexNumber(drpAdultnationality9, 10);
				pageUtils.selectByIndexNumber(drpAdultIssuing9, 10);
				pageUtils.selectByIndexNumber(drpAdultExpDate9, 10);
				pageUtils.selectByIndexNumber(drpAdultExpMonth9, 3);
				pageUtils.selectByIndexNumber(drpAdultExpYear9, 3);
			}
		} catch (Exception e) {

		}
	}

	/**
	 * This method is used to enter Contact details
	 * 
	 * @throws Exception
	 */
	public void enterContactDetails() throws Exception {
		pageUtils.scrollDown(driver);
		pageUtils.clickElement(driver, btndrpClick);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_SMALL_ENGINE);
		pageUtils.selectCountry(drpCountry, "الهند(+91)");
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_VERY_SMALL);

		pageUtils.sendKeysAfterClearingElement(driver, txtPhoneNumber, DataConstants.USER_PHONE_NUMBER);
	}

	/**
	 * This method is used to click on PaySecurely button
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnPaySecurely() throws InterruptedException {
		pageUtils.clickElement(driver, btnPaySecurely);
		pageUtils.waitForFixedTime(BrowserConstants.WAIT_EXCEPTIONAL_CASES);
	}

	/**
	 * this method is used to generate random values for Adults,Child's,Infants
	 */
	public void adultrandom() {
		firstName = TestDataUtils.getFirstName();
		middleName = TestDataUtils.getMiddleName();
		lastName = TestDataUtils.getlastName();
	}

}
