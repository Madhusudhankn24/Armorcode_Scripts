package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Alerts_Elements;
import pageobject.Elements_scans;
import pageobject.objects;

public class Alerts 
{
	public static WebDriver driver;
	public  WebDriverWait wait;
	String uname ="punith.tg@3ktechnologies.com";
	String pwd = "pUnI@0804";
	public Alerts_Elements ale;
	public  objects obj;
	//public Elements_scans ele;
	
	
	
	@Given("open the Chrome application2")
	public void open_the_chrome_application() 
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}
	@When("login to Armorcode2")
	public void login_to_armorcode() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.navigate().to("https://app.armorcode.com/#/login");
		wait.withTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='Sign in using Microsoft']")).click();
		obj = new objects(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		driver.findElement(By.name("loginfmt")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@ id='idSIButton9'and @type='submit']")).click();
		driver.findElement(By.name("passwd")).sendKeys(pwd);
		obj.SignIn_Button();
		Thread.sleep(5000);
		obj = new objects(driver);
		Thread.sleep(2000);
		obj.SignIn_Button();
	}
	
	
	@Given("click on Alerts tab")
	public void click_on_alerts_tab() 
	{
		 ale=new Alerts_Elements(driver);
	    ale.alerts_tab_btn();
	}

	@When("alert page should be displayed")
	public void alert_page_should_be_displayed() 
	{
	   ale.alert_text();
	}

	@Then("date field should be sorted in descending order")
	public void date_field_should_be_sorted_in_descending_order() 
	{
	    ale.date_down_sortbutton();
	}

	@Then("Critical and High Severity will be applied automatically")
	public void critical_and_high_severity_will_be_applied_automatically()
	{
	  ale.Sevirity_filter_btn();
	  ale.critical_filterdd_option();
	  ale.high_filterdd_option();
	}

	@When("click on severity filter apply critical Severity and click Apply")
	public void click_on_severity_filter_apply_critical_severity_and_click_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("critical counting should be same in header and in total records")
	public void critical_counting_should_be_same_in_header_and_in_total_records() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on severity filter apply High Severity and click Apply")
	public void click_on_severity_filter_apply_high_severity_and_click_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("High counting should be same in header and in total records")
	public void high_counting_should_be_same_in_header_and_in_total_records() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on severity filter apply medium Severity and click Apply")
	public void click_on_severity_filter_apply_medium_severity_and_click_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("medium counting should be same in header and in total records")
	public void medium_counting_should_be_same_in_header_and_in_total_records() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on severity filter apply low Severity and click Apply")
	public void click_on_severity_filter_apply_low_severity_and_click_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("low counting should be same in header and in total records")
	public void low_counting_should_be_same_in_header_and_in_total_records() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on severity filter apply info Severity and click Apply")
	public void click_on_severity_filter_apply_info_severity_and_click_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("info counting should be same in header and in total records")
	public void info_counting_should_be_same_in_header_and_in_total_records() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Alert_id filter enter alert id and  click on apply")
	public void click_on_alert_id_filter_enter_alert_id_and_click_on_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Alert id should be filtered")
	public void alert_id_should_be_filtered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on product filter click on product and  click on apply")
	public void click_on_product_filter_click_on_product_and_click_on_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("same product alerts should be displayed")
	public void same_product_alerts_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on sub_product filter click on product and  click on apply")
	public void click_on_sub_product_filter_click_on_product_and_click_on_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("same sub_product alerts should be displayed")
	public void same_sub_product_alerts_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on environment filter click on environment and  click on apply")
	public void click_on_environment_filter_click_on_environment_and_click_on_apply() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("same environment alerts should be displayed")
	public void same_environment_alerts_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Ascending sorting")
	public void click_on_ascending_sorting() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("result should be displayed in ascending order")
	public void result_should_be_displayed_in_ascending_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on descending sorting")
	public void click_on_descending_sorting() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("result should be displayed in descending order")
	public void result_should_be_displayed_in_descending_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on cancel sorting")
	public void click_on_cancel_sorting() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("sorting should be disabled random order should be applied")
	public void sorting_should_be_disabled_random_order_should_be_applied() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
