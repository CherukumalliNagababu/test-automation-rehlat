package cloud.rehlat.utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.engine.EngineConstants;
import cucumber.api.java.Before;

public class BrowserUtils {
	public static WebDriver driver = null;
	public static String applicationUrl = null;
	public static String engineEnvironment = null;
	public static String TITLE_REHLAT_FLIGHT = null;
	public static String TITLE_REHLAT_HOTEL = null;
	public static String TITLE_REHLAT_DEAL = null;
	public static String TITLE_REHLAT_HOME = null;
	
	public static WebDriver getDriverInstance() {
		if (driver == null) {
			driver = launchBrowser();
		}
		return driver;
	}

	@Before
	public static void launchUrl() throws InterruptedException {
		launchBrowser();
		getApplicationUrl();
		driver.get(applicationUrl);
		driver.manage().window().maximize();
	}

	public static WebDriver launchBrowser() {
		String browser = System.getProperty("browser");
		if (browser.equalsIgnoreCase(BrowserConstants.CHROME)) {
			String userdir = System.getProperty("pathToDriver");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(userdir))
					.usingAnyFreePort().build();
			ChromeOptions options = new ChromeOptions();
			options.merge(capabilities);
			options.setHeadless(System.getProperty("headless", "false").equals("true"));
			options.addArguments("--window-size=1366,768");
			driver = new ChromeDriver(service, options);
			driver.manage().deleteAllCookies();
		}
		/*
		 * if(browser.equalsIgnoreCase(BrowserConstants.CHROME)) {
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--start-maximized");
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\jarfiles\\chromedriver.exe"); driver = new ChromeDriver(options);
		 * 
		 * 
		 * 
		 * 
		 * driver.manage().deleteAllCookies();
		 * 
		 * }
		 */

		return driver;
	}

	private static void getApplicationUrl() {
		String target = System.getProperty("target");
		String environment = System.getProperty("environment");
		String application = System.getProperty("application");

		if (target.equalsIgnoreCase(BrowserConstants.ENG)) {
			switch (application.toUpperCase()) {

			case "SA":
				// applicationUrl = System.getProperty("url");
				switch (environment) {
				case "PRD":
					TITLE_REHLAT_FLIGHT=EngineConstants.TITLE_REHLAT_SA_FLIGHT;
					TITLE_REHLAT_HOTEL=EngineConstants.TITLE_REHLAT_SA_HOTEL;
					TITLE_REHLAT_DEAL=EngineConstants.TITLE_REHLAT_SA_DEALS;
					TITLE_REHLAT_HOME=EngineConstants.TITLE_REHLAT_SA;
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_SA_PRD_URL;
					break;
				case "TST":
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ENG_SA_QA_TST_URL;
					break;
				case "STG":
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ENG_SA_STG_URL;
					break;

				default:
					applicationUrl = BrowserConstants.ENG_SA_PRD_URL;
					break;
				}
				break;

			case "EG":

				switch (environment) {
				case "PRD":
					TITLE_REHLAT_FLIGHT=EngineConstants.TITLE_REHLAT_EG_FLIGHT;
					TITLE_REHLAT_HOTEL=EngineConstants.TITLE_REHLAT_EG_HOTEL;
					TITLE_REHLAT_DEAL=EngineConstants.TITLE_REHLAT_EG_DEALS;
					TITLE_REHLAT_HOME=EngineConstants.TITLE_REHLAT_EG;
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_EG_PRD_URL;
					break;
				case "TST":
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ENG_EG_QA_TST_URL;
					break;
				case "STG":
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ENG_EG_STG_URL;
					break;

				default:
					applicationUrl = BrowserConstants.ENG_EG_PRD_URL;
					break;
				}
				break;

			case "AE":

				switch (environment) {
				case "PRD":
					TITLE_REHLAT_FLIGHT=EngineConstants.TITLE_REHLAT_AE_FLIGHT;
					TITLE_REHLAT_HOTEL=EngineConstants.TITLE_REHLAT_AE_HOTEL;
					TITLE_REHLAT_DEAL=EngineConstants.TITLE_REHLAT_AE_DEALS;
					TITLE_REHLAT_HOME=EngineConstants.TITLE_REHLAT_AE;
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_AE_PRD_URL;
					break;
				case "TST":
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ENG_AE_QA_TST_URL;
					break;
				case "STG":
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ENG_AE_STG_URL;
					break;

				default:
					applicationUrl = BrowserConstants.ENG_AE_PRD_URL;
					break;
				}
				break;
			case "COM":

				switch (environment) {
				case "PRD":
					TITLE_REHLAT_FLIGHT=EngineConstants.TITLE_REHLAT_COM_FLIGHT;
					TITLE_REHLAT_HOTEL=EngineConstants.TITLE_REHLAT_COM_HOTEL;
					TITLE_REHLAT_DEAL=EngineConstants.TITLE_REHLAT_COM_DEALS;
					TITLE_REHLAT_HOME=EngineConstants.TITLE_REHLAT_COM;
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_COM_PRD_URL;
					break;
				case "TST":
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.ENG_COM_QA_TST_URL;
					break;
				case "STG":
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.ENG_COM_STG_URL;
					break;

				default:
					applicationUrl = BrowserConstants.ENG_COM_PRD_URL;
					break;
				}
				break;
				
			}
		}
				
				else if (target.equalsIgnoreCase(BrowserConstants.ARB)) {
					switch (application.toUpperCase()) {

					case "SA":
						// applicationUrl = System.getProperty("url");
						switch (environment) {
						case "PRD":
							engineEnvironment = BrowserConstants.ENV_DEV;
							applicationUrl = BrowserConstants.ARB_SA_PRD_URL;
							break;
						case "TST":
							engineEnvironment = BrowserConstants.ENV_TST;
							applicationUrl = BrowserConstants.ARB_SA_QA_TST_URL;
							break;
						case "STG":
							engineEnvironment = BrowserConstants.ENV_STG;
							applicationUrl = BrowserConstants.ARB_SA_STG_URL;
							break;

						default:
							applicationUrl = BrowserConstants.ARB_SA_PRD_URL;
							break;
						}
						break;

					case "EG":

						switch (environment) {
						case "PRD":
							engineEnvironment = BrowserConstants.ENV_DEV;
							applicationUrl = BrowserConstants.ARB_EG_PRD_URL;
							break;
						case "TST":
							engineEnvironment = BrowserConstants.ENV_TST;
							applicationUrl = BrowserConstants.ARB_EG_QA_TST_URL;
							break;
						case "STG":
							engineEnvironment = BrowserConstants.ENV_STG;
							applicationUrl = BrowserConstants.ARB_EG_STG_URL;
							break;

						default:
							applicationUrl = BrowserConstants.ARB_EG_PRD_URL;
							break;
						}
						break;

					case "AE":

						switch (environment) {
						case "PRD":
							engineEnvironment = BrowserConstants.ENV_DEV;
							applicationUrl = BrowserConstants.ARB_AE_PRD_URL;
							break;
						case "TST":
							engineEnvironment = BrowserConstants.ENV_TST;
							applicationUrl = BrowserConstants.ARB_AE_QA_TST_URL;
							break;
						case "STG":
							engineEnvironment = BrowserConstants.ENV_STG;
							applicationUrl = BrowserConstants.ARB_AE_STG_URL;
							break;

						default:
							applicationUrl = BrowserConstants.ARB_AE_PRD_URL;
							break;
						}
						break;
					case "COM":

						switch (environment) {
						case "PRD":
							engineEnvironment = BrowserConstants.ENV_DEV;
							applicationUrl = BrowserConstants.ARB_COM_PRD_URL;
							break;
						case "TST":
							engineEnvironment = BrowserConstants.ENV_TST;
							applicationUrl = BrowserConstants.ARB_COM_QA_TST_URL;
							break;
						case "STG":
							engineEnvironment = BrowserConstants.ENV_STG;
							applicationUrl = BrowserConstants.ARB_COM_STG_URL;
							break;

						default:
							applicationUrl = BrowserConstants.ARB_COM_PRD_URL;
							break;
						}
						break;

			
				
			}
		}
	}
}
