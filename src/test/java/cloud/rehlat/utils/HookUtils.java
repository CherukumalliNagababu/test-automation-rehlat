package cloud.rehlat.utils;

import java.io.File;

import org.codehaus.plexus.util.Os;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.seleniumhq.jetty9.server.Authentication.User;



import cloud.rehlat.pages.engine.Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class HookUtils {

	/**
	 * This cucumber hook closes the browser after each scenario
	 */
	@After
	public void cleanUp(Scenario scenario) {
		//if (scenario.isFailed()) {
	         scenario.embed(((TakesScreenshot)BrowserUtils.driver).getScreenshotAs(OutputType.BYTES), "image/png");
	    //}
		
		
		try {
			if(System.getProperty("application").equalsIgnoreCase("VISUALIZER")) {
				Page page = new Page(BrowserUtils.driver);
				page.hoverOnMoreMenu();
				page.clickOnLogout();
			}
			if(System.getProperty("application").equalsIgnoreCase("ENGINE")) {
				Page page = new Page(BrowserUtils.driver);
				page.engineHoverOnMoreMenu();
				page.clickOnEngineLogout();
			}
		} catch(Exception e) {
			System.out.println("ERROR OCCURRED WHILE TRYING TO LOG OUT OF THE APPLICATION");
		}
		finally {
		    BrowserUtils.driver.close();
			BrowserUtils.driver.quit();
		}
	}
}
