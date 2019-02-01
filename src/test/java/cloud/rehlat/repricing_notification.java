package cloud.rehlat;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)


@CucumberOptions( 
features = "src/test/resources/features/slackNot/Repricing.feature",

tags = {"@flight_healthcheck" }, 

format = { "pretty", "html:Reports/cukes", "json:Reports/cukes/cucumber.json",
				"junit:Reports/cukes/junit.xml" })

public class repricing_notification extends AbstractTestNGCucumberTests {
	
}
