package appHooks;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import QAFactory.Driver_factory;
import TestRail.TestRailAccount;
import UtilityFiles.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/*
 * When we need certain pre-condiions 
 * launch the browser and pass URL
 * for that case we are using Hooks file
 * Its hooks responsitility to launch the browser
 */
public class ArmorcodeHooks {

	/*
	 * DriverFactory class having the init_driver method
	 * we need to create DriverFActory instance and call init_driver method
	 */
	private Driver_factory driverfactory;
	private WebDriver driver;
	private ConfigReader configREader;
	Properties prop;
	
	
	/*
	 * Driverfactory and webdriver are only specific to Hooks class
	 * give the access via creating public wrappers
	 */

	@Before(order = 1)
	public void launchBrowser() {
		/*
		 * To launch the browser i need perticular prop to get the property
		 */
		String Browser_name = prop.getProperty("browser");
		driverfactory = new Driver_factory();
		driver = driverfactory.init_Driver(Browser_name);
	}
	@Before(order = 0)
	public void getProperty() {
		/*
		 * we have to create instance of configREader to access
		 * init_prop()
		 */
		configREader = new ConfigReader();
		prop = configREader.init_prop(); 
		/*
		 * init_prop() will give properties and then 
		 * that propeties will stored in prop of properties type
		 */
	}
	@After(order = 0)
	public void Quit_browser() {
		driver.quit();
	}
	@After(order = 1)
	public void TakeScreenshots(Scenario scenario) {
		if(scenario.isFailed()) {
			Driver_factory.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			/*
			 * Take Screenshot
			 */
			String Screenshot_name = scenario.getName().replaceAll(" ","_");
			/*
			 * Typecast driver into Screenshot interface
			 */
			byte[] SourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(SourcePath, "image/png", Screenshot_name);
		}
	}
}
