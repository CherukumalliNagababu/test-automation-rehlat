package cloud.rehlat.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.Parameters;

import cloud.rehlat.constants.common.DataConstants;
import cloud.rehlat.constants.common.BrowserConstants;
import cloud.rehlat.constants.engine.EngineConstants;
import cloud.rehlat.steps.engine.FlightLoginSteps;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import java.net.URL.*;
import java.util.HashMap;
import java.util.Map;

public class BrowserUtils  {
	 static int totalScenarios = 0;
	 static int scenariosCompleted = 0;
	public static WebDriver driver = null;
	public static String applicationUrl = null;
	public static String engineEnvironment = null;
	public static String TITLE_REHLAT_FLIGHT = null;
	public static String TITLE_REHLAT_HOTEL = null;
	public static String TITLE_REHLAT_DEAL = null;
	public static String TITLE_REHLAT_HOME = null;
	 private static boolean hasInitialized = false;
	 public static final String USERNAME = "nagababu13";
	    public static final String AUTOMATE_KEY = "kcYwURMAiCo9FTJAH7rJ";
	    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	 private static void initializeSystemProperties() {
		 totalScenarios = Integer.parseInt(System.getProperty("totalScenarios", "0"));
		 System.setProperty("browser", System.getProperty("browser", "chrome"));
			System.setProperty("pathToDriver", System.getProperty("pathToDriver", "D:\\jarfiles\\chromedriver.exe"));
			System.setProperty("foreground", System.getProperty("foreground", "false"));
			System.setProperty("target", System.getProperty("target", "ENG"));
			//System.setProperty("domain", System.getProperty("domain", "Flights"));
			System.setProperty("environment", System.getProperty("environment", "PRD"));
			System.setProperty("application", System.getProperty("application", "SA"));
			System.setProperty("url", System.getProperty("url", "https://www.rehlat.com.sa/en/"));
			System.setProperty("seleniumGridUrl", System.getProperty("seleniumGridUrl", "none"));
			//System.setProperty("seleniumGridUrl", System.getProperty("seleniumGridUrl", "http://192.168.1.230:4444/wd/hub"));
			System.setProperty("headless", "true1");
			
			
			System.setProperty("verbose", System.getProperty("verbose", "false"));

		    if (!hasInitialized) {
		        hasInitialized = true;
	           
	            System.out.printf(
	                    "[DEBUG] Using Flight documents path: %s\n",
	                   DataConstants.getDocumentPath("some-file.pdf"  )
	                   
	            );
	        }
	    }
	 
	
	 /**
	     * This method is used to return the browser instance
	     */
	    public static WebDriver getDriverInstance() {
	        if (driver == null) {
	            driver = launchBrowser(null);
	        }
	        return driver;
	    }
	 @Before
	    public static void launchUrl(Scenario scenario) {
	        launchBrowser(scenario);
	        applicationUrl = System.getProperty("url");
	        getApplicationUrl();
	        driver.get(applicationUrl);
	         driver.manage().window().maximize();
	         onload_alert();
	    
	        Cookie cookie = new Cookie("zaleniumMessage", scenario.getName());
	        driver.manage().addCookie(cookie);
	    }
	
	 /**
	     * Get the remote WebDriver instance
	     * @param capabilities Desired capabilities
	     * @param scenario Scenario info
	     * @return the driver or null
	     */
	    private static WebDriver getRemoteDriver(MutableCapabilities capabilities, Scenario scenario) {
	        String buildName = System.getProperty("buildName");
	        capabilities.setCapability("build",
	                buildName != null ? buildName :
	                System.getProperty("url") + " - " + System.getProperty("application")
	                
	        );
	        System.out.println(System.getProperty("url") + " - " + System.getProperty("application"));
	        capabilities.setCapability("name", scenario.getName());
	        System.out.println(scenario.getName());
	        String seleniumGridUrl = System.getProperty("seleniumGridUrl");
	        System.out.println(System.getProperty("seleniumGridUrl"));
	        System.out.printf("Using Browser: %s\n", capabilities.getBrowserName());
	        try {
	        	
	            return new RemoteWebDriver(new URL(seleniumGridUrl), capabilities);
	            
	        } catch (UnreachableBrowserException e) {
	            Assert.fail("UnreachableBrowserException: " + e.getMessage());
	        } catch (MalformedURLException e) {
	            Assert.fail("MalformedURLException: " + seleniumGridUrl);
	        } catch (WebDriverException e) {
	            Assert.fail("WebDriverException: " + e.getMessage());
	        }
	        return null;
	    }
	    
	    /**
	     * This method is used to launch the browser instance
	     */
	    private static WebDriver launchBrowser(Scenario scenario) {
	        initializeSystemProperties();
	        String browser = System.getProperty("browser");
	        String driverPath = System.getProperty("pathToDriver");
	        boolean useGrid = !System.getProperty("seleniumGridUrl").equals("none");


	        switch (browser.toLowerCase()) {
	            case BrowserConstants.CHROME: {
	                Map<String, Object> prefs = new HashMap<>();
	                prefs.put("download.default_directory", DataConstants.getDownloadsPath());
	                System.out.println("DataConstants.getDownloadsPath()::"+DataConstants.getDownloadsPath());
	                prefs.put("profile.default_content_settings.popups", 0);
	                prefs.put("download.prompt_for_download", false);
	                prefs.put("download.directory_upgrade", true);

	                ChromeOptions options = new ChromeOptions();
	                options.setExperimentalOption("prefs", prefs);
	                options.addArguments("--window-size=1366,768");

	                if (useGrid) {
	                    driver = getRemoteDriver(options, scenario);
	                } else {
	                    options.setHeadless(System.getProperty("headless", "false").equals("true"));
	                    ChromeDriverService service = new ChromeDriverService.Builder()
	                            .usingDriverExecutable(new File(driverPath))
	                            .usingAnyFreePort()
	                            .build();
	                    driver = new ChromeDriver(service, options);
	                }
	                break;
	            }
	            case BrowserConstants.FIREFOX: {
	                FirefoxOptions options = new FirefoxOptions();
	                FirefoxProfile profile = new FirefoxProfile();

	                // Reference: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Complete_list_of_MIME_types
	                String[] allowedMimeTypes = new String[]{
	                        "application/vnd.ms-excel", // .xls
	                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", // .xlsx
	                        "application/msword", // .doc
	                        "application/vnd.openxmlformats-officedocument.wordprocessingml.document", // .docx
	                        "application/vnd.ms-powerpoint", // .ppt
	                        "application/vnd.openxmlformats-officedocument.presentationml.presentation", // .pptx
	                        "text/csv", // .csv
	                        "application/pdf", // .pdf
	                        "text/plain" // .txt
	                };

	                profile.setPreference("browser.download.folderList", 2);
	                profile.setPreference("browser.download.manager.showWhenStarting", false);
	                profile.setPreference("browser.download.dir", DataConstants.getDownloadsPath());
	                profile.setPreference("browser.helperApps.neverAsk.saveToDisk", String.join(";", allowedMimeTypes));
	                profile.setPreference("browser.helperApps.alwaysAsk.force", false);
	                profile.setPreference( "browser.download.manager.showWhenStarting", false );
	                profile.setPreference( "pdfjs.disabled", true );

	                options.setProfile(profile);

	                if (useGrid) {
	                    driver = getRemoteDriver(options, scenario);
	                } else {
	                    options.addArguments("--headless");
	                    options.setBinary(driverPath);
	                    driver = new FirefoxDriver(options);
	                }
	                break;
	            }
	            case BrowserConstants.SAFARI: {
	                DesiredCapabilities capabilities = DesiredCapabilities.safari();

	                capabilities.setCapability("os", "OS X");
	                capabilities.setCapability("os_version", "High Sierra");
	                capabilities.setCapability("browser", "Safari");
	                capabilities.setCapability("browser_version", "11.1");
	                capabilities.setCapability("resolution", "1280x960");
	                capabilities.setCapability("browserstack.local", "true");
	                capabilities.setCapability("browserstack.timezone", "UTC");
	                capabilities.setCapability("browserstack.selenium_version", "3.6.0");
	                capabilities.setCapability("browserstack.safari.enablePopups", "true");
	                capabilities.setCapability("browserstack.safari.allowAllCookies", "true");

	                driver = getRemoteDriver(capabilities, scenario);
	                break;
	            }
	            case BrowserConstants.EDGE: {
	                DesiredCapabilities capabilities = DesiredCapabilities.edge();

	                capabilities.setCapability("os", "Windows");
	                capabilities.setCapability("os_version", "10");
	                capabilities.setCapability("browser", "Edge");
	                capabilities.setCapability("browser_version", "17.0");
	                capabilities.setCapability("resolution", "1366x768");
	                capabilities.setCapability("browserstack.local", "true");
	                capabilities.setCapability("browserstack.timezone", "UTC");
	                capabilities.setCapability("browserstack.selenium_version", "3.6.0");
	                capabilities.setCapability("browserstack.ie.enablePopups", "true");

	                driver = getRemoteDriver(capabilities, scenario);
	                break;
	            }
	            case BrowserConstants.IE: {
	                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

	                capabilities.setCapability("os", "Windows");
	                capabilities.setCapability("os_version", "10");
	                capabilities.setCapability("browser", "IE");
	                capabilities.setCapability("browser_version", "11.0");
	                capabilities.setCapability("resolution", "1366x768");
	                capabilities.setCapability("browserstack.local", "true");
	                capabilities.setCapability("browserstack.timezone", "UTC");
	                capabilities.setCapability("browserstack.selenium_version", "3.6.0");
	                capabilities.setCapability("browserstack.ie.enablePopups", "true");

	                driver = getRemoteDriver(capabilities, scenario);
	                break;
	            }
	            
	            case BrowserConstants.OPERA: {
	            	/*DesiredCapabilities capabilities = DesiredCapabilities.opera();
	    			System.out.println("operadriver");
	    			String userdir = System.getProperty("pathToDriver");
	    			
	    			String path = userdir;
	    			System.out.println("path::"+path);
	    			
	    	        OperaOptions options = new OperaOptions();
	    	        
	    	       
	    	        options.setBinary("C:\\Users\\Nagababu\\AppData\\Local\\Programs\\Opera\\57.0.3098.106_0\\opera.exe");
	    	        System.setProperty("webdriver.opera.driver",path);
	    	        
	    	        driver = getRemoteDriver(capabilities, scenario);*/
	            	
	            	System.out.println("operadriver");
	    			String userdir = System.getProperty("pathToDriver");
	    			
	    			String path = userdir;
	    	        OperaOptions options = new OperaOptions();
	    	        options.setBinary("C:\\Users\\Nagababu\\AppData\\Local\\Programs\\Opera\\57.0.3098.106_0\\opera.exe");
	    	        System.setProperty("webdriver.opera.driver",path);
	    	        driver = new OperaDriver(options);
	                break;
	    		  

	          
	            
	        }
	        }

	        assert driver != null;
	        driver.manage().deleteAllCookies();
	        return driver;
	    }

	  /*  public static WebDriver getDriverInstance() {
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
			onload_alert();
			
		}
	
	public static WebDriver launchBrowser()  {
		initializeSystemProperties();
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
			//options.addArguments("--window-size=1500,900");
			driver = new ChromeDriver(service, options);
			
			driver.manage().deleteAllCookies();
			
			//Chrome
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "62.0");
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browserstack.debug", "true");
			//caps.setCapability("browserstack.localIdentifier", "Test123");
			caps.setCapability("resolution", "1680x1050");
			 try {
				driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
			//IOS
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "iPhone");
		    caps.setCapability("device", "iPhone 8 Plus");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "11.0");
		    try {
				driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		if (browser.equalsIgnoreCase(BrowserConstants.OPERA)) {
			 
			System.out.println("operadriver");
			String userdir = System.getProperty("pathToDriver");
			
			String path = userdir;
	        OperaOptions options = new OperaOptions();
	        options.setBinary("C:\\Users\\Nagababu\\AppData\\Local\\Programs\\Opera\\57.0.3098.106_0\\opera.exe");
	        System.setProperty("webdriver.opera.driver",path);
	        driver = new OperaDriver(options);
		  

      
        
    }
		if (browser.equalsIgnoreCase(BrowserConstants.FIREFOX)) {
			 String userdir = System.getProperty("pathToDriver");
			System.setProperty("webdriver.firefox.marionette",userdir);
	     driver = new FirefoxDriver();
			
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Firefox");
		    caps.setCapability("browser_version", "65.0 beta");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		  	caps.setCapability("browserstack.debug", "true");
			caps.setCapability("resolution", "1680x1050");
			 try {
				driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		if (browser.equalsIgnoreCase(BrowserConstants.EDGE)) {
			//MicrosoftWebDriver
			 String userdir = System.getProperty("pathToDriver");
		  System.setProperty("webdriver.edge.driver",userdir); //put actual location
		 driver = new EdgeDriver();
		}
		if (browser.equalsIgnoreCase(BrowserConstants.IE)) {
			 String userdir = System.getProperty("pathToDriver");
		  System.setProperty("webdriver.ie.driver",userdir); //put actual location
		  driver = new InternetExplorerDriver();
		}
		
		
		
		  if(browser.equalsIgnoreCase(BrowserConstants.CHROME)) {
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("--start-maximized");
		 
		 System.setProperty("webdriver.chrome.driver",
		 "D:\\jarfiles\\chromedriver.exe"); driver = new ChromeDriver(options);
		
		
		
		 driver.manage().deleteAllCookies();
		 }
		  
		 


		return driver;
	}*/

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
			case "JZ":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_JZ_PRD_URL;
					break;
				
			}
				break;
			case "EM":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_EM_PRD_URL;
					break;
				
			}
				break;
				
			case "JZS":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_JZS_PRD_URL;
					break;
				
			}
				break;
			case "AA":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_AA_PRD_URL;
					break;
				
			}
				break;
			case "PGS":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_PGS_PRD_URL;
					break;
				
			}
				break;
			case "MY":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_MY_PRD_URL;
					break;
				
			}
				break;
			case "MEA":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_MEA_PRD_URL;
					break;
				
			}
				break;
			case "RJ":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_RJ_PRD_URL;
					break;
				
			}
				break;
			case "RB":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_RB_PRD_URL;
					break;
				
			}
				break;
			case "IG":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_IG_PRD_URL;
					break;
				
			}
				break;
			case "SJ":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_SJ_PRD_URL;
					break;
				
			}
				break;
			case "SC":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_SC_PRD_URL;
					break;
				
			}
				break;
			case "CE":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_CE_PRD_URL;
					break;
				
			}
				break;
			case "SW":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_SW_PRD_URL;
					break;
				
			}
				break;
			case "EJ":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_EJ_PRD_URL;
					break;
				
			}
				break;
			case "RA":

				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.ENG_RA_PRD_URL;
					break;
				
			}
				break;
		}
		}
		else if (target.equalsIgnoreCase(BrowserConstants.CC)) {
			switch (application.toUpperCase()) {

			case "SA":
				// applicationUrl = System.getProperty("url");
				switch (environment) {
				case "PRD":
					engineEnvironment = BrowserConstants.ENV_DEV;
					applicationUrl = BrowserConstants.CC_SA_PRD_URL;
					break;
				case "TST":
					engineEnvironment = BrowserConstants.ENV_TST;
					applicationUrl = BrowserConstants.CC_SA_QA_TST_URL;
					break;
				case "STG":
					engineEnvironment = BrowserConstants.ENV_STG;
					applicationUrl = BrowserConstants.CC_SA_STG_URL;
					break;

				default:
					applicationUrl = BrowserConstants.ARB_SA_PRD_URL;
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
	
	private static void onload_alert()
	{
		String stg=System.getProperty("environment", "STG");
		if(stg.equals("STG"))
		{
		driver.switchTo().alert().sendKeys("ros@965");
		driver.switchTo().alert().accept();
		}
		
	}
	
	
	
}
