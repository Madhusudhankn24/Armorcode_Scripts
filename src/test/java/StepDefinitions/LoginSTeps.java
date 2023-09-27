package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ArmorcodepageObjects.LoginpageObjects;
import QAFactory.Driver_factory;
import io.cucumber.java.en.*;

public class LoginSTeps {
	private LoginpageObjects 
	loginpage = new LoginpageObjects(Driver_factory.getDriver());

	@Given("Navigate to Armorcode portal")
	public void navigate_to_armorcode_portal() {
		Driver_factory.getDriver().get("https://app.armorcode.com/");
	}
	@Then("Verify that Login page is displayed")
	public boolean verify_that_login_page_is_displayed() {
		return Driver_factory.getDriver().getPageSource().contains("Login");
	}
	@When("User click on Sign in Using microsoft button")
	public void user_click_on_sign_in_using_microsoft_button() {
		loginpage.Microsoft_Button();
	}
	@Then("Sign in microsoft page should be displayed")
	public void sign_in_microsoft_page_should_be_displayed() {
		String Microsoft_Title = Driver_factory.getDriver().getTitle();
		Assert.assertTrue(Microsoft_Title.contains("Sign in to your account"));
	}
	@When("User enters existing microsoft id and click on next")
	public void user_enters_existing_microsoft_id_and_click_on_next() throws InterruptedException { 
		loginpage.EnterEmailID("madhusudhan.kv@3ktechnologies.com");
		Thread.sleep(5000);
		loginpage.CLick_Next_button();
	}
	@Then("Verify forgot passoword link should display")
	public void forgot_password_link_should_display() {
		Assert.assertTrue(loginpage.ForgotPwdLinkisDIsplayed());
	}
	@When("User enters password and click on next")
	public void user_enters_password_and_click_on_next() throws InterruptedException {
		loginpage.EnterPassword("Madhu@3ktech");
		Thread.sleep(5000);
		loginpage.CLick_Next_button();
	}
	@When("Click on yes in stay signed in page")
	public void click_on_yes_in_stay_signed_in_page() throws InterruptedException {
		Thread.sleep(10000);
		loginpage.CLick_Yes_button();
	}
	@Then("Armorcode dashboard should be displayed")
	public void armorcode_dashboard_should_be_displayed() {
		String loginPageTitle = loginpage.getLoginPageTitle();
		System.out.println("Login page title"+loginPageTitle);
		Assert.assertTrue(loginPageTitle.contains("ArmorCode Inc - Application Security Orchestration and Collaboration platform"));
		Driver_factory.getDriver().navigate().refresh();
	}
	@Then("Click on logout")
	public void click_on_logout() {
		WebElement Profile = Driver_factory.getDriver().findElement(By.xpath("//*[@id=\\\"root\\\"]/section/header/div[3]/div[5]/div"));
		Profile.click();
		loginpage.Click_logout_button();
	}
	@Then("Verify it should redirect to Login page")
	public boolean verify_it_should_redirect_to_login_page() {
		return Driver_factory.getDriver().getPageSource().contains("Login");
	}
}
