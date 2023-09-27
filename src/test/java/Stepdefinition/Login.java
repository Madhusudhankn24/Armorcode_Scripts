package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Login_elements;
import pageobject.objects;

public class Login 
{

	public static WebDriver driver;
	public Login_elements le;
	public  objects obj;
	public static WebDriverWait wait;
	String uname ="punith.tg@3ktechnologies.com";
	String pwd = "pUnI@0804";

	@Given("open the ChromeBrowser")
	public void open_the_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		le=new Login_elements(driver);
	}

	@When("enter the url")
	public void enter_the_url() 
	{
		driver.get(le.URL);
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() 
	{
		le.logo_verify();
		le.login_txt_verify();
	}

	@Given("click on Sign in using Google")
	public void click_on_sign_in_using_google() 
	{}
	@When("Enter valid credential")
	public void enter_valid_credential() 
	{}

	@Then("user should landed on dashboard")
	public void user_should_landed_on_dashboard()
	{
		le.Dashboard_verify();
	}

	@Given("click on Sign in using Microsoft")
	public void click_on_sign_in_using_microsoft() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		le=new Login_elements(driver);
		le.microsoft_login_button();
	}
	@When("Enter valid credential in microsoft")
	public void enter_valid_credential_in_microsoft()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		le.un_field();
		le.next_signin_btn();
		le.mspassword_field();
		driver.findElement(By.id("idSIButton9")).click();
	}
	@When("Do App veification")
	public void do_app_veification() throws InterruptedException 
	{
		WebElement id = driver.findElement(By.xpath("//div[@id='displayName']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(300));//wait
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println(id.getText());
		driver.findElement(By.id("KmsiCheckboxField")).click();
		driver.findElement(By.xpath("//div[@class='inline-block button-item ext-button-item']/input[@data-report-event='Signin_Submit']")).click();
	}


	@Given("click on profile dropdown")
	public void click_on_profile_dropdown() throws InterruptedException 
	{
		le=new Login_elements(driver);
		le.profile_downarrow();
	}

	@Given("click on logout")
	public void click_on_logout() 
	{
		le.logout_btn();
	}

	@Then("User should landed on Login page")
	public void user_should_landed_on_login_page() 
	{
		le=new Login_elements(driver);
		le.logo_verify();
		le.login_txt_verify();
		driver.manage().deleteAllCookies();
		driver.quit();

	}


}
