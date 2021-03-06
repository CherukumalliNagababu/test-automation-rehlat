package cloud.rehlat;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
/*@CucumberOptions(
		features = "src/test/resources/features/flight/english/OneWay.feature",
				tags = {"@flight_healthcheck"},
						plugin = {"pretty", "html:target/reports"}
		) */

@CucumberOptions( 

features = "src/test/resources/features/hotels/english/GuestUser.feature",

		//features=DataConstants.featurePath,	
tags = {"@flight_healthcheck" }, 

format = { "pretty", "html:Reports/cukes", "json:Reports/cukes/cucumber.json",
				"junit:Reports/cukes/junit.xml" })

public class RunnerHotels extends AbstractTestNGCucumberTests {
	// public class Runner2 {

	/*@BeforeClass
	public static void setUp() {
		System.setProperty("browser", System.getProperty("browser", "chrome"));
		System.setProperty("pathToDriver", System.getProperty("pathToDriver", "D:\\jarfiles\\chromedriver.exe"));
		System.setProperty("foreground", System.getProperty("foreground", "false"));
		System.setProperty("target", System.getProperty("target", "ENG"));
		System.setProperty("environment", System.getProperty("environment", "PRD"));
		System.setProperty("application", System.getProperty("application", "SA"));
		System.setProperty("url", System.getProperty("url", "https://www.rehlat.com.sa/en/"));
		System.setProperty("headless", "true1");
	}*/
}
