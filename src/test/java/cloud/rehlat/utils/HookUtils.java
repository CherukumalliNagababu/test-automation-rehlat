package cloud.rehlat.utils;

import cucumber.api.java.Before;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import cloud.rehlat.pages.engine.Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HookUtils {
	
    
	
	
	
	
	private static List<String> loginLikePages = Arrays.asList("/login", "/forgot-password");

	private static String getCurrentPath() {
		try {
			URI url = new URI(BrowserUtils.driver.getCurrentUrl());
			String fragment = url.getFragment();
			return fragment != null ? fragment : url.getPath();
		} catch (URISyntaxException e) {
			return "/";
		}
	}

	private static boolean isOnLoginLikePage() {
		return loginLikePages.contains(getCurrentPath());
	}

	@Before
	public void logInfo(Scenario scenario) {
		if (BrowserUtils.totalScenarios > 0) {
			System.out.printf(
					"[STARTED][%d/%d] %s\n",
					BrowserUtils.scenariosCompleted,
					BrowserUtils.totalScenarios,
					scenario.getName()
			);
		} else {
			System.out.printf(
					"[STARTED] %s\n",
					scenario.getName()
			);
		}
	}

	/**
	 * This cucumber hook closes the browser after each scenario
	 * @throws IOException 
	 */
	@After
	public void cleanUp(Scenario scenario) throws IOException{
		Cookie cookie = new Cookie("zaleniumTestPassed", scenario.isFailed() ? "false" : "true");
		BrowserUtils.driver.manage().addCookie(cookie);
		
		if (BrowserUtils.totalScenarios > 0) {
			System.out.printf(
					"[COMPLETED][%d/%d][%s] %s\n",
					++BrowserUtils.scenariosCompleted,
					BrowserUtils.totalScenarios,
					scenario.getStatus().toUpperCase(),
					scenario.getName()
			);
		} else {
			System.out.printf(
					"[COMPLETED][%s] %s\n",
					scenario.getStatus().toUpperCase(),
					scenario.getName()
			);
		}
		//if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot)BrowserUtils.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			//File scrFile = ((TakesScreenshot)BrowserUtils.driver).getScreenshotAs(OutputType.FILE);
	       // FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/src/main/resources/ScreenShot/image_"+timestamp()+".png"));
			
			//}
		
		try {
			if(System.getProperty("application").equalsIgnoreCase("Flights")) {
				Page page = new Page(BrowserUtils.driver);
				page.hoverOnMoreMenu();
				page.clickOnLogout();
			}
			if(System.getProperty("application").equalsIgnoreCase("Hotels")) {
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
	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
