package cloud.rehlat;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions( features =
 * "src/test/resources/features/flight/english/OneWay.feature", tags =
 * {"@flight_healthcheck"}, plugin = {"pretty", "html:target/reports"} )
 */

@CucumberOptions(// features =
					// "src/test/resources/features/flight/jazeeraa.feature",
		features = "src/test/resources/features/flight/english/PRD",

		tags = { "@flight_healthcheck" },

		format = { "pretty", "html:Reports/cukes", "json:Reports/cukes/cucumber.json",
				"junit:Reports/cukes/junit.xml" })

public class RunnerAllDomains extends AbstractTestNGCucumberTests {

}
 