package QAFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_factory {
	
	public WebDriver driver;
	/*
	 * To perform parallel execution we have to use thread local
	 */
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();  //Thread local driver having the instanceof WebDriver
	/*
	 * Initialize webdriver with thread local
	 */
	public WebDriver init_Driver(String browser) {     //---> Initialize browser
		System.out.println("Browser value is "+browser);
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			/*
			 * Thread local driver have get and set method and
			 * new Chromedriver will be set with thread local
			 */
			tlDriver.set(new ChromeDriver()); 
			/*
			 * Thread local will create a driver copy for specific thread
			 * When we set automatically chrome driver will be set with the Thread local driver
			 */
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver()); 
		}else if(browser.equals("safari")) {
			tlDriver.set(new SafariDriver()); 
		}else {
			System.out.println("Enter valid browser value");
		}
		/*
		 * To initialize should return webdriver
		 */
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return getDriver();
	}
	/*...
	 * Immediately after initializing the webdriver with thread loacal
	 * we have to get the driver also so we have to create a method for that
	 */
	public static WebDriver getDriver() {
		return tlDriver.get();
		/*
		 * If we write tldriver.get method 
		 * it will return the thread local instance line-16
		 * In thread local we have initialized chrome firefox and safari drivers 
		 * it will get that drivers
		 */
	}
}
