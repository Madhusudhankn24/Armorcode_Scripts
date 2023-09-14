package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_armorcode.dashboardpageobject;
import pom_armorcode.subproductobject;
public class dashboard {
	public static WebDriver driver;
	public static WebDriver wait;	
   public  dashboardpageobject dashboard;

	@Given("login to armorcode appliction")
	public void login_to_armorcode_appliction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.armorcode.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dashboard=new dashboardpageobject(driver);

		dashboard.microsoft();
		dashboard.eamil();
		Thread.sleep(1000);
		dashboard.pwd().sendKeys("Manu@1234");			
		dashboard.click();
		dashboard.yes();
	}

	@And("click on dashboard dropdown")
	public void click_on_dashboard_dropdown() {
	   dashboard.dropdown();
	}

	@When("select all bu option in dropdown")
	public void select_all_bu_option_in_dropdown() {
	  dashboard.allbu();
	}

	@When("check product page all data should be displayed")
	public void check_product_page_all_data_should_be_displayed() {
	  dashboard.product();
	}

	@When("click staging option")
	public void click_staging_option() {
	  dashboard.staging();
	}

	@Then("check staging all data should be displayed")
	public void check_staging_all_data_should_be_displayed() {
	   dashboard.staging_data();
	}
//Scenario2
	
	@When("click on sevrity dropown")
	public void click_on_sevrity_dropown() {
		dashboard=new dashboardpageobject(driver);
		dashboard.production();
	    dashboard.severity();
	}

	@When("select critial option and click apply button")
	public void select_critial_option_and_click_apply_button() {
		
	    dashboard.critical();
	    dashboard.apply_button();
	}
	@When("slect high option and click apply button")
	public void slect_high_option_and_click_apply_button() throws InterruptedException {
		dashboard.severity();
		Thread.sleep(2000);
		dashboard.high();
		
		dashboard.critical();
		
	   dashboard.apply_button();
	}
	@When("select medium and click apply button")
	public void select_medium_and_click_apply_button() {
		dashboard.severity();
		dashboard.high();
		dashboard.medium_cheskbox();
	    dashboard.apply_button();
	}

	@When("selct low  and click apply")
	public void selct_low_and_click_apply() {
		dashboard.severity();
		dashboard.medium_cheskbox();
		dashboard.low_checkbox();
	    dashboard.apply_button();
	}

	@When("click on status dropdow")
	public void click_on_status_dropdow() {
	   
	}

	@When("select optionn click apply")
	public void select_optionn_click_apply() {
	 
	}

	@When("click source dropdown button")
	public void click_source_dropdown_button() {
	  
	}

	@When("select dependency option apply")
	public void select_dependency_option_apply() {
	    
	}

	@When("select custom and apply")
	public void select_custom_and_apply() {
	   
	}

	@When("slect zap and apply")
	public void slect_zap_and_apply() {
	    
	}


}
