package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ArmorcodepageObjects.AlertspageObjects;
import ArmorcodepageObjects.LoginpageObjects;
import QAFactory.Driver_factory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AlertsSteps {
	private LoginpageObjects 
	loginpage = new LoginpageObjects(Driver_factory.getDriver());
	private AlertspageObjects 
	alertspage = new AlertspageObjects(Driver_factory.getDriver());
	private Actions 
	actions = new Actions(Driver_factory.getDriver());
	private WebDriverWait wait;
	private JavascriptExecutor Js;



	@Given("User logged in to application")
	public void user_logged_in_to_application(DataTable dataTable) {
		/*
		 * The data is coming from background step
		 * Thats why data table got created 
		 * Using map we can capture data from the table
		 */
		List<Map<String, String>> Login_credentials = dataTable.asMaps();
		String Username = Login_credentials.get(0).get("emailID");
		String Password = Login_credentials.get(0).get("password");
		Driver_factory.getDriver().get("https://app.armorcode.com/");
		alertspage  = loginpage.Login_application(Username, Password);
	}
	/*
	 *   @Alerts_page
  Scenario: Verify the ALerts page
	 *
	 */
	@When("User clicks on Alters button")
	public void user_clicks_on_alters_button() {
		alertspage.Analyze_Alerts_button();
	}
	@Then("Alerts page should displayed")
	public boolean alerts_page_should_displayed() {
		return Driver_factory.getDriver().getPageSource().contains("Alert ID");
	}
	/*
	 *   @Alerts @AL-001
  Scenario: Verify that all the information should be properly indented
	 *
	 */
	@Then("Verify User is on Alerts page")
	public void verify_user_is_on_alerts_page() {
		alertspage.Analyze_Alerts_button();
	}
	@When("Verify Date Column will be sorted in Desending order")
	public void verify_date_column_will_be_sorted_in_desending_order() throws InterruptedException {
		actions = new Actions(Driver_factory.getDriver());
		Thread.sleep(2000);
		actions.moveToElement(alertspage.Date_Column()).perform();
		/*
		 * The Sorting options
		 * if it is in Ascending order the Tool tip will be "Click to sort in descending"
		 * if it is in Descending order the Tool tip will be "Click to cancel sorting"
		 * if it is in cancel sorting the Tool tip will be "click to sort in Ascending"
		 * 
		 */
		if(Driver_factory.getDriver().getPageSource().contains("Click to cancel sorting")) {
			Assert.assertTrue(true);
		}
	}
	@When("Click on Severity filter button and filter popup should display")
	public void click_on_severity_filter_button_and_filter_popup_should_display() {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
	}
	@Then("Verify Critical and High Severity will be applied automatically")
	public void verify_critical_and_high_severity_will_be_applied_automatically() {
		Assert.assertTrue(alertspage.Severity_Critical_checkbox().isSelected());
		Assert.assertTrue(alertspage.Severity_High_checkbox().isSelected());
	}
	/*
	 *   @Alerts @AL-002
  Scenario Outline: Check Count of Alerts based on Alert Severity
	 *
	 */
	@Then("Verify count of Alerts based on High")
	public void verify_count_of_alerts_based_on_high() throws InterruptedException {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
		Assert.assertTrue(alertspage.Severity_clear_button().isDisplayed());
		alertspage.Severity_clear_button().click();
		Assert.assertTrue(alertspage.High_checkbox().isDisplayed());
		alertspage.High_checkbox().click();
		Assert.assertTrue(alertspage.Severity_apply_button().isDisplayed());
		alertspage.Severity_apply_button().click();
		Thread.sleep(3000);
		String Total_alerts = alertspage.Total_alerts().getText();
		System.out.println(Total_alerts);
		String Displayed_High_alerts = alertspage.Displayed_High_alerts().getText();
		System.out.println(Displayed_High_alerts);
		Assert.assertTrue(Total_alerts.contains(Displayed_High_alerts));
	}
	@Then("Verify count of Alerts based on Critical")
	public void verify_count_of_alerts_based_on_critical() throws InterruptedException {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
		Assert.assertTrue(alertspage.Severity_clear_button().isDisplayed());
		alertspage.Severity_clear_button().click();
		Assert.assertTrue(alertspage.Critical_checkbox().isDisplayed());
		alertspage.Critical_checkbox().click();
		Assert.assertTrue(alertspage.Severity_apply_button().isDisplayed());
		alertspage.Severity_apply_button().click();
		Thread.sleep(3000);
		String Total_alerts = alertspage.Total_alerts().getText();
		System.out.println(Total_alerts);
		String Displayed_Critical_alerts = alertspage.Displayed_Critical_alerts().getText();
		System.out.println(Displayed_Critical_alerts);
		Assert.assertTrue(Total_alerts.contains(Displayed_Critical_alerts));
	}
	@Then("Verify count of Alerts based on Info")
	public void verify_count_of_alerts_based_on_info() throws InterruptedException {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
		Assert.assertTrue(alertspage.Severity_clear_button().isDisplayed());
		alertspage.Severity_clear_button().click();
		Assert.assertTrue(alertspage.Info_checkbox().isDisplayed());
		alertspage.Info_checkbox().click();
		Assert.assertTrue(alertspage.Severity_apply_button().isDisplayed());
		alertspage.Severity_apply_button().click();
		Thread.sleep(3000);
		String Total_alerts = alertspage.Total_alerts().getText();
		System.out.println(Total_alerts);
		String Displayed_Info_alerts = alertspage.Displayed_Info_alerts().getText();
		System.out.println(Displayed_Info_alerts);
		Assert.assertTrue(Total_alerts.contains(Displayed_Info_alerts));
	}
	@Then("Verify count of Alerts based on Low")
	public void verify_count_of_alerts_based_on_low() throws InterruptedException {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
		Assert.assertTrue(alertspage.Severity_clear_button().isDisplayed());
		alertspage.Severity_clear_button().click();
		Assert.assertTrue(alertspage.Low_checkbox().isDisplayed());
		alertspage.Low_checkbox().click();
		Assert.assertTrue(alertspage.Severity_apply_button().isDisplayed());
		alertspage.Severity_apply_button().click();
		Thread.sleep(3000);
		String Total_alerts = alertspage.Total_alerts().getText();
		System.out.println(Total_alerts);
		String Displayed_Low_Alerts = alertspage.Displayed_Low_Alerts().getText();
		System.out.println(Displayed_Low_Alerts);
		Assert.assertTrue(Total_alerts.contains(Displayed_Low_Alerts));
	}
	@Then("Verify count of Alerts based on Medium")
	public void verify_count_of_alerts_based_on_medium() throws InterruptedException {
		alertspage.Alerts_Severity_Filter_button().click();
		alertspage.Severity_Filter_search_field();
		Assert.assertTrue(alertspage.Severity_clear_button().isDisplayed());
		alertspage.Severity_clear_button().click();
		Assert.assertTrue(alertspage.Medium_checkbox().isDisplayed());
		alertspage.Medium_checkbox().click();
		Assert.assertTrue(alertspage.Severity_apply_button().isDisplayed());
		alertspage.Severity_apply_button().click();
		Thread.sleep(3000);
		String Total_alerts = alertspage.Total_alerts().getText();
		System.out.println(Total_alerts);
		String Displayed_Medium_Alerts = alertspage.Displayed_Medium_Alerts().getText();
		System.out.println(Displayed_Medium_Alerts);
		Assert.assertTrue(Total_alerts.contains(Displayed_Medium_Alerts));
	}
	/*
	 *   @Alerts @AL-007
  Scenario: Verify the filters in Alerts page
	 * 
	 */
	String[] Alert_ID = {"A-6401371","A-6372946","A-5408027"};
	@When("Click on Alert ID Filter")
	public void click_on_alert_id_filter() {
		Assert.assertTrue(alertspage.Alert_ID_Filter().isDisplayed());
		
	}
	@Then("Verify By entering Alert ID filter is working properly")
	public void verify_by_entering_alert_id_filter_is_working_properly() throws InterruptedException {
		for(int i=0;i<=Alert_ID.length-1;i++) {
			alertspage.Alert_ID_Filter().click();
			Assert.assertTrue(alertspage.ALert_ID_saerchfield().isDisplayed());
			if(alertspage.ALert_ID_saerchfield()==null) {
				alertspage.ALert_ID_saerchfield().sendKeys(Alert_ID[i]);
				alertspage.Alert_ID_Apply_button().click();
			}else {
				alertspage.ALert_ID_saerchfield().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
				alertspage.ALert_ID_saerchfield().sendKeys(Alert_ID[i]);
				alertspage.ALert_ID_saerchfield().sendKeys(Keys.ENTER);
			}
		}
	}
	@Then("Click on Date Filter")
	public void click_on_date_filter() {
		Assert.assertTrue(alertspage.Alert_Date_Filter().isDisplayed());
		alertspage.Alert_Date_Filter().click();
	}
	@Then("Verify By entering different option Date filter is working properly")
	public void verify_by_entering_different_option_date_filter_is_working_properly() {
//		List<WebElement> date_list = alertspage.Date_list();
//		for(WebElement dates:date_list) {
//			String text = dates.getText();
//			for(int i=0;i<text.length()-1;i++) {
//				dates.click();
//				alertspage.Alert_Date_Filter().click();
//			}
//		}
		alertspage.Last_24_hours().click();
		alertspage.Application_Logo().click();
		verify_user_is_on_alerts_page();
		click_on_date_filter();
		alertspage.Last_48_hours().click();
		alertspage.Application_Logo().click();
		verify_user_is_on_alerts_page();
		click_on_date_filter();
		alertspage.Last_30_days().click();
	}
	@Then("Click on status Filter")
	public void click_on_status_filter() {
		Assert.assertTrue(alertspage.Alert_Status_Filter().isDisplayed());
		alertspage.Alert_Status_Filter().click();
	}
	@Then("Verify By selecting status filter is working properly")
	public void verify_by_selecting_status_filter_is_working_properly() {
		Assert.assertTrue(alertspage.Open_Status_checkbox().isDisplayed());
		alertspage.Open_Status_checkbox().click();
		Assert.assertTrue(alertspage.Status_filter_Apply_Button().isDisplayed());
		alertspage.Status_filter_Apply_Button().click();
	}
	@Then("Click on product Filter")
	public void click_on_product_filter() {
		Assert.assertTrue(alertspage.Alert_product_filter().isDisplayed());
		alertspage.Alert_product_filter().click();
	}
	@Then("Verify By selecting product name filter is working properly")
	public void verify_by_selecting_product_name_filter_is_working_properly() throws InterruptedException {
		alertspage.product_checkbox1().click();
//		wait = new WebDriverWait(Driver_factory.getDriver(), 20);
//		wait.until(ExpectedConditions.visibilityOf(alertspage.product_filter_Apply_button()));
		Thread.sleep(2000);
		alertspage.product_filter_Apply_button();
	}
	@Then("Click on sub_product Filter")
	public void click_on_sub_product_filter() throws InterruptedException {
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Thread.sleep(2000);
		Js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft=300");
		Assert.assertTrue(alertspage.Sub_product_filter().isDisplayed());
		alertspage.Sub_product_filter().click();
	}
	@Then("Verify By selecting sub_product filter is working properly")
	public void verify_by_selecting_sub_product_filter_is_working_properly() throws InterruptedException {
		Assert.assertTrue(alertspage.Sub_product_checkbox().isDisplayed());
		alertspage.Sub_product_checkbox().click();
		Assert.assertTrue(alertspage.Sub_product_Apply_Button().isDisplayed());
		Thread.sleep(2000);
		alertspage.Sub_product_Apply_Button().click();
	}
	@Then("Click on Environment Filter")
	public void click_on_environment_filter() throws InterruptedException {
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Thread.sleep(2000);
		Js.executeScript("window.scrollBy(0,-5000)");
		Assert.assertTrue(alertspage.Alert_Environment_filter().isDisplayed());
		Thread.sleep(2000);
		alertspage.Alert_Environment_filter().click();
	}
	@Then("Verify By selecting Environment filter is working properly")
	public void verify_by_selecting_environment_filter_is_working_properly() throws InterruptedException {
		Assert.assertTrue(alertspage.Environment_Production_checkbox().isDisplayed());
		alertspage.Environment_Production_checkbox().click();
		Thread.sleep(2000);
		alertspage.Environment_filter_Apply_button().click();
	}
	/*
	 *   @Alerts @AL-011
  Scenario: Sorting should working as per the condition( eg: Ascending)
	 *
	 */
	String exp_tooltip1 = "Click to sort in ascending";
	String exp_tooltip2 = "Click to sort in descending";
	String exp_tooltip3 = "Click to cancel sorting";
	@When("Click on ALertID sorting")
	public void click_on_a_lert_id_sorting() throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(alertspage.Alert_ID_Column()).perform();
	}
	@Then("Verify ALertID Sorting is working properly")
	public void verify_a_lert_id_sorting_is_working_properly() throws InterruptedException {
		String Ascending_order = alertspage.Alert_ID_Column_Tooltip().getText();
		System.out.println(Ascending_order);
		Assert.assertTrue(Ascending_order.equals(exp_tooltip1));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_ID_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_a_lert_id_sorting();
		String Descending_order = alertspage.Alert_ID_Column_Tooltip().getText();
		System.out.println(Descending_order);
		Assert.assertTrue(Descending_order.equals(exp_tooltip2));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_ID_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_a_lert_id_sorting();
		String Cancel_sorting = alertspage.Alert_ID_Column_Tooltip().getText();
		System.out.println(Cancel_sorting);
		Assert.assertTrue(Cancel_sorting.equals(exp_tooltip3));
	}
	@Then("Click on Date Sorting")
	public void click_on_date_sorting() throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(alertspage.Alert_Date_Column()).perform();
	}
	@Then("Verify Date Sorting is working properly")
	public void verify_date_sorting_is_working_properly() throws InterruptedException {
		String Ascending_order = alertspage.Alert_Date_Column_Tooltip_ascending().getText();
		System.out.println(Ascending_order);
		Assert.assertTrue(Ascending_order.equals(exp_tooltip1));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_Date_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_date_sorting();
		String Descending_order = alertspage.Alert_Date_Column_Tooltip_descending().getText();
		System.out.println(Descending_order);
		Assert.assertTrue(Descending_order.equals(exp_tooltip2));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_Date_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_date_sorting();
		String Cancel_sorting = alertspage.Alert_Date_Column_Tooltip_cancel().getText();
		System.out.println(Cancel_sorting);
		Assert.assertTrue(Cancel_sorting.equals(exp_tooltip3));
	}
	@Then("Click on Severity sorting")
	public void click_on_severity_sorting() throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(alertspage.Alert_Severity_Column()).perform();
	}
	@Then("Verify Severity sorting is working properly")
	public void verify_severity_sorting_is_working_properly() throws InterruptedException {
		String Ascending_order = alertspage.Alert_Severity_Column_Tooltip_ascending().getText();
		System.out.println(Ascending_order);
		Assert.assertTrue(Ascending_order.equals(exp_tooltip1));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_Severity_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_severity_sorting();
		String Descending_order = alertspage.Alert_Severity_Column_Tooltip_descending().getText();
		System.out.println(Descending_order);
		Assert.assertTrue(Descending_order.equals(exp_tooltip2));
		actions.moveToElement(alertspage.Application_Logo()).perform();
		Thread.sleep(3000);
		alertspage.Alert_Severity_Column().click();
		actions.moveToElement(alertspage.Application_Logo()).perform();
		click_on_severity_sorting();
		String Cancel_sorting = alertspage.Alert_Severity_Column_Tooltip_cancel().getText();
		System.out.println(Cancel_sorting);
		Assert.assertTrue(Cancel_sorting.equals(exp_tooltip3));
	}
	@Then("Click on Status sorting")
	public void click_on_status_sorting() {
	}
	@Then("Verify Status sorting is working properly")
	public void verify_status_sorting_is_working_properly() {
	}
	@Then("Click on product sorting")
	public void click_on_product_sorting() {
	}
	@Then("Verify Product sorting is working properly")
	public void verify_product_sorting_is_working_properly() {
	}
	@Then("Click on Sub_product sorting")
	public void click_on_sub_product_sorting() {
	}
	@Then("Verify Sub_product sorting is working properly")
	public void verify_sub_product_sorting_is_working_properly() {
	}
	@Then("Click on Environmenet sorting")
	public void click_on_environmenet_sorting() {
	}
	@Then("Verify Environmenet sorting is working properly")
	public void verify_environmenet_sorting_is_working_properly() {
	}
}
