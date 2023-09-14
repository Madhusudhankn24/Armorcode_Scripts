package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_armorcode.loginpagerobject;


public class armorcodelogin
{
	public static WebDriver driver;
	 public loginpagerobject le;
	  
	@Given("open the browser")
	public void open_the_browser() {
		le=new loginpagerobject(driver);
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(le.URL);
	}

	@When("log in to Armorcode application")
	public void log_in_to_armorcode_application() throws InterruptedException {
		le=new loginpagerobject(driver);
        le.microsoft_login_button();
        le.un_field();
        le.next_signin_btn();
        le.mspassword_field();
        WebElement nextele = le.next_btn;
        driver.findElement(By.id("idSIButton9")).click();
       Thread.sleep(10000);
        driver.findElement(By.id("idSIButton9")).click();
        System.out.println("PUNITH LOGIN Sucessfully....:-");
	}






}
