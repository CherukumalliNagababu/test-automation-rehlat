package cloud.rehlat;
import java.io.File;

import org.codehaus.plexus.util.Os;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/flight/arabic/GuestUser.feature",
		tags = {"@flight_healthcheck"},
		plugin = {"pretty", "html:target/cucumber1-reports/report.html"}
		 //plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"}
				//plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
				//plugin = {"html:target/site/report.html"},
		//monochrome = true
		) 
public class Runner {

	@BeforeClass
	public static void setUp() {
		System.setProperty("browser", System.getProperty("browser", "chrome"));
		System.setProperty("pathToDriver", System.getProperty("pathToDriver", "D:\\jarfiles\\chromedriver.exe"));
		System.setProperty("foreground", System.getProperty("foreground", "false"));
		System.setProperty("target", System.getProperty("target", "ARB"));
		System.setProperty("environment", System.getProperty("environment", "PRD"));
		System.setProperty("application", System.getProperty("application", "EG"));
		System.setProperty("url", System.getProperty("url", "https://www.rehlat.com.sa/en/"));
		System.setProperty("headless", "false");
	}
	
	
	
	/*@AfterClass
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("E:\\CucumberP1\\RehlatProject\\src\\test\\resources\\extent-config.xml"));
		Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("Operating System Type",System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Web App", "Online Traveller");
		Reporter.setTestRunnerOutput("Cucumber reporting using Extent Config");
	}*/
}
