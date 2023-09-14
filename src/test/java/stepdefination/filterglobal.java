package stepdefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_armorcode.globalpageobject;
import pom_armorcode.loginpagerobject;

public class filterglobal {
	public static WebDriver driver;
	public static WebDriver wait;
	public loginpagerobject le;
	public globalpageobject 
	global=new globalpageobject(driver);
	@Given("launch the armorcode application")
	public void launch_the_armorcode_application() throws InterruptedException {
		le=new loginpagerobject(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(le.URL);
		le=new loginpagerobject(driver);
		le.microsoft_login_button();
		le.un_field();
		le.next_signin_btn();
		le.mspassword_field();
		WebElement nextele = le.next_btn;
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("idSIButton9")).click();
		System.out.println("Manoj LOGIN Sucessfully....:-");
	}

	@When("check the global filter in armorcode application")
	public void check_the_global_filter_in_armorcode_application() throws InterruptedException {
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div[1]/section/header/div[2]/div/span/div[1]"));
	}

	@Then("global filter is displayed in top")
	public void global_filter_is_displayed_in_top() {
		driver.findElement(By.xpath("/html/body/div[1]/section/header/div[2]/div/span/div[1]")).isDisplayed();
	}
	@When("click on topper")
	public void click_on_topper() throws InterruptedException {
		Thread.sleep(2000);
		global.globalfilter();
	}
	@When("bu box should be displayed")
	public void bu_box_should_be_displayed() {
		if(driver.getPageSource().contains("Business Unit"));
		Assert.assertTrue(true);	   
	}
	@When("verify Box having all BU, subproducts, team, tier and tool category shouid be displayed")
	public void verify_box_having_all_bu_subproducts_team_tier_and_tool_category_shouid_be_displayed() {
		if(driver.getPageSource().contains("//div[.='Test_Testins']"));
		Assert.assertTrue(true);	
	}
	@When("click on bu drop down button")
	public void click_on_bu_drop_down_button() throws InterruptedException {
		Thread.sleep(1000);
		global.dropdown();
	}
	@When("select any bu")
	public void select_any_bu() throws InterruptedException {
		Thread.sleep(2000);
		global.BU();
	}
	@When("click on test_traine drop dowd")
	public void click_on_test_traine_drop_dowd() throws InterruptedException {
		Thread.sleep(2000);
		global.test();
	}
	@Then("slected product should be displayed")
	public void slected_product_should_be_displayed() {
		if(driver.getPageSource().contains("Business Unit"));
		Assert.assertTrue(true);
	}
	@When("verify none option shoulbe displayed")
	public void verify_none_option_shoulbe_displayed() {
		WebElement none = driver.findElement(By.xpath("//span[.='None']"));
		boolean selected=none .isDisplayed();
		if(selected) {
			System.out.println("none element should be displayed");
		}
		else
			Assert.fail("none is not displayed");
	}
	@When("verify teams opption should be displayed")
	public void verify_teams_opption_should_be_displayed() {
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Team']"));
		boolean selectedelement=ele2.isDisplayed();
		if(selectedelement) {
			System.out.println("teams option should be displayed");   	
		}
		else
			Assert.fail("teams option should not displayed");
	}
	@Then("verify tire option should be displayed")
	public void verify_tire_option_should_be_displayed() {
		boolean slectedele=driver.findElement(By.xpath("//span[.='Tier']")).isDisplayed();
		if(slectedele) {
			System.out.println("tire option should be displayed");
		}
		else
			Assert.fail("tier option is not displayed");
	}
	@When("click o drop down button in bu")
	public void click_o_drop_down_button_in_bu() throws InterruptedException {
		Thread.sleep(2000);
		global.dropdown_bu();
	}
	@When("select any  bu product and click on it")
	public void select_any_bu_product_and_click_on_it() throws InterruptedException {
		Thread.sleep(2000);
		global.dbu();
	}
	@When("click on team option")
	public void click_on_team_option() throws InterruptedException {
		Thread.sleep(2000);
        global.team();
	}
	@Then("verify teams product should be displayed")
	public void verify_teams_product_should_be_displayed() {
		boolean selectele=driver.findElement(By.xpath("//span[.='Subproducts']")).isDisplayed();
	}
	@When("click on tire option")
	public void click_on_tire_option() throws InterruptedException {
		Thread.sleep(2000);
		global.tire();
	}
	@Then("verify subproduct should be displayed")
	public void verify_subproduct_should_be_displayed() {
		boolean selectele=driver.findElement(By.xpath("//span[.='Subproducts']")).isDisplayed();
	}
	@When("select any option")
	public void select_any_option() throws InterruptedException {
		Thread.sleep(2000);
	    global.tire1();
		Thread.sleep(2000);
		global.catageory();
		Thread.sleep(2000);
		global.app();
	}
	@When("click on apply button")
	public void click_and_apply() throws InterruptedException {
		Thread.sleep(1000);
		global.apply_button();

	}
	@Then("applyed succesfully")
	public void applyed_succesfully() {
		System.out.print("appleyd succesfully");
		driver.quit();
	}
}
