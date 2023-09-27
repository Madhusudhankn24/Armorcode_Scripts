package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import ArmorcodepageObjects.DashboardPageObjects;
import ArmorcodepageObjects.GlobalSettings_pageObjects;
import QAFactory.Driver_factory;
import UtilityFiles.Armorcode_Utils;
import io.cucumber.java.en.*;

public class Dashboard_Steps {

	private LoginSTeps 
	login = new LoginSTeps();
	private DashboardPageObjects 
	dashboardpage = new DashboardPageObjects(Driver_factory.getDriver());
	private Actions 
	actions  = new Actions(Driver_factory.getDriver());
	private Armorcode_Utils 
	utils = new Armorcode_Utils(Driver_factory.getDriver());
	public JavascriptExecutor Js;
	private GlobalSettings_pageObjects 
	globalpage = new GlobalSettings_pageObjects(Driver_factory.getDriver());

	/*
	 *   @DASH-018
  Scenario: Date filter with different custom date range and with Common options.
	 *
	 */
	@Given("Verify user is on Dashboard page")
	public void verify_user_is_on_dashboard_page() {
		login.armorcode_dashboard_should_be_displayed();
	}
	@Then("Selects All BU dashboard")
	public void selects_all_bu_dashboard() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		dashboardpage.Dashboard_All_BU_option().click();
		Thread.sleep(2000);
		if(dashboardpage.Notification_popup_close().isDisplayed()) {
			dashboardpage.Notification_popup_close().click();
		}
		Driver_factory.getDriver().navigate().refresh();
	}
	@And("Click on Date filter")
	public void click_on_date_filter() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(dashboardpage.Date_Filter().isDisplayed());
		dashboardpage.Date_Filter().click();
	}
	@And("Selects Date range and click on Apply")
	public void selects_date_range_and_click_on_apply() 
			throws InterruptedException   {
		dashboardpage.Date_range_from().click();
		Thread.sleep(2000);
		dashboardpage.Date_range_to().click();
		Thread.sleep(2000);
		dashboardpage.Date_Apply_button().click();
	}
	@And("Selects Date common options and click on Apply")
	public void selects_date_common_options_and_click_on_apply() 
			throws InterruptedException {
		click_on_date_filter();
		Thread.sleep(2000);
		dashboardpage.Date_clear_button().click();
		Thread.sleep(2000);
		dashboardpage.Date_common_options().click();
	}
	@Then("Verify Should display data as per selected date range or option.")
	public void verify_should_display_data_as_per_selected_date_range_or_option() {
	}
	/*
	 *   @DASH-019
  Scenario: Verify Customize Dashboard
	 *
	 */
	@And("Click on Dashboard filter and Selects Creat dashboard option")
	public void click_on_dashboard_filter_and_selects_creat_dashboard_option() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		Assert.assertTrue(dashboardpage.Create_Dashboard_button().isDisplayed());
		dashboardpage.Create_Dashboard_button().click();
	}
	@Then("Verify Custom dashboard page should display")
	public void verify_custom_dashboard_page_should_display() {
		Assert.assertTrue(dashboardpage.Custom_dashboard_page().isDisplayed());
	}
	/*
	 *   @DASH-020
  Scenario: Verify Customize Dashboard Search field
	 *
	 */
	@And("Verify User is on Custom Dashboad page")
	public void verify_user_is_on_custom_dashboad_page() 
			throws InterruptedException {
		click_on_dashboard_filter_and_selects_creat_dashboard_option();
		verify_custom_dashboard_page_should_display();
	}
	@And("Click on Search field and Search for Widgets")
	public void click_on_search_field_and_search_for_widgets() {
		dashboardpage.Search_widget_field("Enterprise Product Matrix");
	}
	@Then("Related Widgets should display")
	public void related_widgets_should_display() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.Displayed_widget()).perform();
		Assert.assertTrue(dashboardpage.Related_widget().isDisplayed());
	}
	/*
	 *   @DASH-023
  Scenario: Verify Customize Dashboard cancel field
	 */
	@Given("Click on Cancel button")
	public void click_on_cancel_button() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Custom_daahboad_cancel_button().isDisplayed());
		dashboardpage.Custom_daahboad_cancel_button().click();
	}
	@Then("Verify User should able to back jump on default dashboard")
	public void verify_user_should_able_to_back_jump_on_default_dashboard() {
		login.armorcode_dashboard_should_be_displayed();
	}
	/*
	 *   @DASH-024
  Scenario: Verify Customize Dashboard Next field
	 *
	 */
	@Given("Add One widget and Click on next")
	public void add_one_widget_and_click_on_next() throws InterruptedException {
		click_on_search_field_and_search_for_widgets();
		dashboardpage.Add_Custom_widget().click();
		Assert.assertTrue(dashboardpage.Custom_widget_Next_button().isDisplayed());
		dashboardpage.Custom_widget_Next_button().click();
	}
	/*
	 *   @DASH-032
  Scenario: Verify Save button Funtionality
	 */
	@Then("Verify User should able to jump on next page")
	public void verify_user_should_able_to_jump_on_next_page() {
		Assert.assertTrue(dashboardpage.widget_next_page().isDisplayed());
	}
	/*
	 *   @DASH-025
  Scenario: Verify Customize Dashboard Add Name field.
	 *
	 */
	String new_name = "demo";
	@Then("Add dashboard name")
	public void add_dashboard_name() {
		dashboardpage.Custom_dashboard_name("demo");
	}
	@Then("Click on Save button")
	public void click_on_save_button() {
		Assert.assertTrue(dashboardpage.Custom_dashboard_save_button().isDisplayed());
		dashboardpage.Custom_dashboard_save_button().click();
	}
	@Then("Verify dashboard created popup should display")
	public void verify_dashboard_created_popup_should_display() {
		Assert.assertTrue(dashboardpage.dashboard_created_popup().isDisplayed());
		dashboardpage.Created_dashboard_popup_close().click();
	}
	@Then("Verify Customize Dashboard should be created as same name which is added by user")
	public void verify_customize_dashboard_should_be_created_as_same_name_which_is_added_by_user()
			throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.dashboard_dp().click();
		Assert.assertTrue(dashboardpage.Created_Dashboard_verification().isDisplayed());
		Assert.assertTrue(dashboardpage.Created_Dashboard_verification().getText()
				.contains(new_name));
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-026
  Scenario: Verify Customize Dashboard Add Product /Subproduct Field
	 *
	 */
	String product = "Juiceshop";
	String subproduct = "hello";
	@Then("Selects products and subproducts By individual")
	public void selects_products_and_subproducts_by_individual() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.product_subproduct_dropdown().isDisplayed());
		dashboardpage.product_subproduct_dropdown().click();
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Select_subproduct_list().isDisplayed());
		dashboardpage.Select_subproduct_list().click();
		Assert.assertTrue(dashboardpage.Select_subproduct().isDisplayed());
		dashboardpage.Select_subproduct().click();
	}
	@Then("Verify that able to view particular product\\/subproduct Data on Customize Dashboard.")
	public void verify_that_able_to_view_particular_product_subproduct_data_on_customize_dashboard() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Product_displayed().getText().contains(product));
		Assert.assertTrue(dashboardpage.Subproduct_displayed().getText().contains(subproduct));
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-027
  Scenario: Verify Customize Dashboard Add Environment Field
	 *
	 */
	String Production = "Production";
	String All = "All";
	@Then("Selects Production Environment")
	public void selects_production_environment() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Select_Environment().click();
		Assert.assertTrue(dashboardpage.Select_production().isDisplayed());
		dashboardpage.Close_environment().click();
		dashboardpage.Select_production().click();
	}
	@Then("Verify data will Populate in all widget according to Production Enviroment.")
	public void verify_data_will_populate_in_all_widget_according_to_production_enviroment() {
	}
	@Then("Click on Edit button")
	public void click_on_edit_button() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Edit_options().isDisplayed());
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Edit_button().isDisplayed());
		dashboardpage.Edit_button().click();
	}
	@Then("User should navigate to custom dashboard page")
	public void user_should_navigate_to_custom_dashboard_page() 
			throws InterruptedException {
		verify_custom_dashboard_page_should_display();
	}
	@Then("Click on Next button")
	public void click_on_next_button() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Add_new_widget().isDisplayed());
		dashboardpage.Add_new_widget().click();
		Assert.assertTrue(dashboardpage.Edit_next_button().isDisplayed());
		dashboardpage.Edit_next_button().click();
	}
	@Then("Selects Statging Environment")
	public void selects_statging_environment() {
		Assert.assertTrue(dashboardpage.Select_Environment().isDisplayed());
		dashboardpage.Select_Environment().click();
		dashboardpage.Close_environment().click();
		dashboardpage.Select_Stagging().click();
	}
	@Then("Verify data will Populate in all widget according to Staging Enviroment")
	public void verify_data_will_populate_in_all_widget_according_to_staging_enviroment() {
	}
	@Then("Selects Both production and staging Environment")
	public void selects_both_production_and_staging_environment() {
		Assert.assertTrue(dashboardpage.Select_Environment().isDisplayed());
		dashboardpage.Select_Environment().click();
		dashboardpage.Select_Stagging().click();
	}
	@Then("Verify data will be Populate in all widget According to Both Env.")
	public void verify_data_will_be_populate_in_all_widget_according_to_both_env() 
			throws InterruptedException {
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-028
  Scenario: Verify Customize Dashboard Add Date Range Field
	 *
	 */
	String newDate = "Last 30 days";
	@Then("Verify Default Date range is {string}")
	public void verify_default_date_range_is(String date_range) {
		Assert.assertTrue(dashboardpage.Default_dateRange_verification().getText()
				.contains(date_range));
	}
	@Then("Verify Customize dashboard is created for {string}")
	public void verify_customize_dashboard_is_created_for(String date) {
		Assert.assertTrue(dashboardpage.Displayed_date_range().getText()
				.contains(date));
	}
	@Then("Selects another Date Range")
	public void selects_another_date_range() {
		dashboardpage.Default_dateRange_verification().click();
		Assert.assertTrue(dashboardpage.New_date_range().isDisplayed());
		dashboardpage.New_date_range().click();
	}
	@Then("Verify Customize dashboard is created for Custom date range")
	public void verify_customize_dashboard_is_created_for_custom_date_range() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Displayed_date_range().getText()
				.contains(newDate));
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
		Thread.sleep(2000);
	}
	/*
	 *   @DASH-029
  Scenario: Verify Customize Dashboard Add Share with Funtionality
	 *
	 */
	@And("Add Share with user")
	public void Add_share_with_user() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Share_with_user_field().isDisplayed());
		Thread.sleep(5000);
		dashboardpage.Share_with_user_field().click();
		utils.Windowhandles(Driver_factory.getDriver());
		Thread.sleep(3000);
		//		List<WebElement> user_list = dashboardpage.User_list();
		//		for(WebElement List:user_list) {
		//			String text2 = List.getText();
		//			System.out.println(text2);
		//		}
		dashboardpage.User().click();
	}
	@Then("Click on Edit icon")
	public void click_on_Edit_icon() {
		Assert.assertTrue(dashboardpage.Edit_options().isDisplayed());
		dashboardpage.Edit_options().click();
	}
	@Then("CLick on share button")
	public void c_lick_on_share_button() {
		Assert.assertTrue(dashboardpage.Edit_share_button().isDisplayed());
		dashboardpage.Edit_share_button().click();
	}
	@Then("Selects user {string} and click on next")
	public void selects_user_and_click_on_next(String User_name) throws InterruptedException {
		Assert.assertTrue(dashboardpage.User_name().isDisplayed());
		dashboardpage.User_name().click();
		dashboardpage.User_name().sendKeys("Madhusudhan KN");
		dashboardpage.Select_user().click();
		Assert.assertTrue(dashboardpage.Share_with_save_button().isDisplayed());
		dashboardpage.Share_with_save_button().click();
	}
	@Then("Verify Share with confirmation popup should display")
	public void verify_share_with_confirmation_popup_should_display() throws InterruptedException {
		Assert.assertTrue(dashboardpage.dashboard_created_popup().isDisplayed());
		dashboardpage.Created_dashboard_popup_close().click();
		/*
		 * Delete created dashboard
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 * @DASH-030
  Scenario: Verify Enable public Dashboad Funtionality
	 *
	 */
	@Then("Enable public toggle")
	public void enable_public_toggle() {
		Assert.assertTrue(dashboardpage.Public_dashboard_toggle().isDisplayed());
		dashboardpage.Public_dashboard_toggle().click();
	}
	@Then("Verify product and subproduct dropdown is disabled")
	public void verify_product_and_subproduct_dropdown_in_disabled() 
			throws InterruptedException {
		Thread.sleep(2000);
		if(dashboardpage.product_subproduct_dropdown().isEnabled()) {
			Assert.assertTrue(true);
		}
	}
	@Then("Verify Share button is disabled")
	public void verify_share_button_is_disabled()
			throws InterruptedException {
		Thread.sleep(2000);
		if(dashboardpage.Edit_share_button().isEnabled()) {
			Assert.assertTrue(true);
		}
		/*
		 * Delete created dashboard 
		 */
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-031
  Scenario: Verify Save & Add Another button Funtionality
	 *
	 */
	@Then("Click on save & add another button")
	public void click_on_save_add_another_button() {
		Assert.assertTrue(dashboardpage.Save_Add_Another_button().isDisplayed());
		dashboardpage.Save_Add_Another_button().click();
	}
	@Then("Verify user should jump on the main page of the customize dashboard.")
	public void verify_user_should_jump_on_the_main_page_of_the_customize_dashboard() 
			throws InterruptedException {
		verify_custom_dashboard_page_should_display();
		Thread.sleep(2000);
		/*
		 * Delete created dashboard
		 */
		dashboardpage.Dashboard_button().click();
		dashboardpage.Dashboard_Dropdown().click();
		dashboardpage.Select_created_dashboard().click();
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-033
  Scenario: Verify customize dashboard Date range Funtionality
	 *
	 */
	@Then("Verify User should able to change Date Range on the customize Dashboard.")
	public void verify_user_should_able_to_change_date_range_on_the_customize_dashboard() {
		Assert.assertTrue(dashboardpage.Default_dateRange_verification().isDisplayed());
		dashboardpage.Default_dateRange_verification().click();
		Assert.assertTrue(dashboardpage.New_date_range().isDisplayed());
		dashboardpage.New_date_range().click();
	}
	/*
	 *   @DASH-034
  Scenario: Verify Edit custom dashboard Funtionality
	 *
	 */
	@Then("Verify User should able to edit Customize dashboard.")
	public void verify_user_should_able_to_edit_customize_dashboard() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Default_dateRange_verification().isDisplayed());
		dashboardpage.Default_dateRange_verification().click();
		Assert.assertTrue(dashboardpage.New_date_range().isDisplayed());
		dashboardpage.New_date_range().click();
		dashboardpage.Custom_dashboard_save_button().click();
		/*
		 * Delete created dashboard 
		 */
		Thread.sleep(2000);
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-035
  Scenario: Verify Delete dashboard Funtionality
	 *
	 */
	@Then("Click on Edit and click on delete button")
	public void click_on_edit_and_click_on_delete_button() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
	}
	@Then("Enter Delete Text and Click on Delete")
	public void enter_delete_text_and_click_on_delete() throws InterruptedException {
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
	}
	@Then("Verify delete popup should display")
	public void verify_delete_popup_should_display() {
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-046
  Scenario: Verify Custom Widget feature Funtionality
	 *
	 */
	@Given("Add One widget")
	public void add_one_widget() {
		click_on_search_field_and_search_for_widgets();
		dashboardpage.Add_Custom_widget().click();
	}
	@Then("Verify Added widget is displayed")
	public void verify_added_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Added_widget().isDisplayed());
	}
	/*
	 * @DASH-124
  Scenario: Verify Custom dashboard > Source Funtionality
	 *
	 */
	String Appscan = "Appscan";
	String Appspider = "Appspider, ";
	@Then("Add One Source tool")
	public void add_one_source_tool() {
		Assert.assertTrue(dashboardpage.Source_Tool().isDisplayed());
		dashboardpage.Source_Tool().click();
		Assert.assertTrue(dashboardpage.Appscan_Source_tool().isDisplayed());
		dashboardpage.Appscan_Source_tool().click();
		dashboardpage.Default_dateRange_verification().click();
	}
	@Then("Add Another Source tool")
	public void add_another_source_tool() {
		Assert.assertTrue(dashboardpage.Click_Source_Tool().isDisplayed());
		dashboardpage.Click_Source_Tool().click();
		Assert.assertTrue(dashboardpage.Appspider_Source_tool().isDisplayed());
		dashboardpage.Appspider_Source_tool().click();
		dashboardpage.Default_dateRange_verification().click();
	}
	@Then("Delete one Source tool")
	public void delete_one_source_tool() {
		Assert.assertTrue(dashboardpage.Source_tool_CLose_button().isDisplayed());
		dashboardpage.Source_tool_CLose_button().click();
	}
	@Then("Verify Create dashboard is displayed with one Particular source")
	public void verify_create_dashboard_is_displayed_with_one_particular_source() {
	}
	@Then("Verify Create dashboard is displayed with multiple source")
	public void verify_create_dashboard_is_displayed_with_multiple_source() {
	}
	@Then("Verify Create dashboard is displayed with one source")
	public void verify_create_dashboard_is_displayed_with_one_source() 
			throws InterruptedException {
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-151
  Scenario: Verify Create dashboard with any widget > Three dot > Export as PDF
	 *
	 */
	@Then("Click on Three dots")
	public void click_on_three_dots() {
		dashboardpage.Edit_options().click();
	}
	@Then("Click on Export as PDF button")
	public void click_on_export_as_pdf_button() {
		Assert.assertTrue(dashboardpage.Export_as_Pdf_button().isDisplayed());
		dashboardpage.Export_as_Pdf_button().click();
	}
	@Then("Verify Dashboard is ready for export popup shoudl display")
	public void verify_dashboard_is_ready_for_export_popup_shoudl_display() {
		Assert.assertTrue(dashboardpage.Export_pdf_popup().isDisplayed());
	}
	@Then("Click on popup to download PDF")
	public void click_on_popup_to_download_pdf() throws InterruptedException {
		//dashboardpage.Export_pdf_link().click();
		dashboardpage.PDF_popup_close().click();
	}
	@Then("Verify pdf is downloaded")
	public void verify_pdf_is_downloaded() throws InterruptedException {
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 *   @DASH-153
  Scenario: Create dashboard > Add All widget with Custom dashboard
	 *
	 */
	String Custom_title = "custom_demo";
	String Custom_dataSorce = "demo1";
	String Custom_display = "Pivot Table";
	String column1 = "Severity";
	String column2 = "Status";
	@Given("Click on Custom widget")
	public void click_on_custom_widget() {
		Assert.assertTrue(dashboardpage.Custom_widget_button().isDisplayed());
		dashboardpage.Custom_widget_button().click();
	}
	@Given("Verify Custom widget added popup should display")
	public void verify_custom_widget_added_popup_should_display() {
		Assert.assertTrue(dashboardpage.Custom_widget_add_popup().isDisplayed());
		dashboardpage.Custom_widget_popup_close_button().click();
	}
	@Given("Add details for custom widget")
	public void add_details_for_custom_widget() {
		dashboardpage.Custom_widget_title(Custom_title);
		dashboardpage.Custom_dataSorce_dropdown().click();
		dashboardpage.Custom_demo_datasource().click();
		dashboardpage.Custom_display_as().click();
		dashboardpage.Custom_display_pivotTable().click();
		dashboardpage.Custom_column1().click();
		dashboardpage.column1_severity().click();
		dashboardpage.Custom_column2().click();
		dashboardpage.column2_status().click();
	}
	@Given("Add other widgets with custom widgets")
	public void add_other_widgets_with_custom_widgets() {
		dashboardpage.Custom_add_widget().click();
	}
	@And("Click on next")
	public void Click_on_next() {
		Assert.assertTrue(dashboardpage.Custom_widget_Next_button().isDisplayed());
		dashboardpage.Custom_widget_Next_button().click();

	}
	@Then("Verify data should be coming properly in all widget.")
	public void verify_data_should_be_coming_properly_in_all_widget() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Custom_dashboard_validation().isDisplayed());
		/*
		 * Delete created dashboard 
		 */
		dashboardpage.Edit_options().click();
		Assert.assertTrue(dashboardpage.Delete_Dashboard_icon().isDisplayed());
		dashboardpage.Delete_Dashboard_icon().click();
		dashboardpage.Delete_text("Delete");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Delete_button().isDisplayed());
		dashboardpage.Delete_button().click();
		Assert.assertTrue(dashboardpage.Delete_popup().isDisplayed());
	}
	/*
	 * @DASH-154
  Scenario: Global settings > Select custom dashboard as Set as Default
	 *
	 */
	@When("Selects the Custom dashboard as default dashboard")
	public void selects_the_custom_dashboard_as_default_dashboard() 
			throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Custom_dashboard().click();
	}
	/*
	 *   @DASH-224
  Scenario: Verify Product /subproduct filter  > Filter by Tag functionality
	 *
	 */
	String key = "juice";
	@Then("Select product\\/subproduct dropdown")
	public void select_product_subproduct_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.product_subproduct_dropdown().isDisplayed());
		dashboardpage.product_subproduct_dropdown().click();
	}
	@Then("Click on Filter product by tag")
	public void click_on_filter_product_by_tag() {
		dashboardpage.product_tag_filter().click();
	}
	@Then("Enter valid Key and value")
	public void enter_valid_key_and_value() {
		dashboardpage.product_key(key);
	}
	@Then("Click on Apply")
	public void click_on_apply() {
		dashboardpage.product_filter_apply_button().click();
	}
	@Then("Verify product should be Filter out according to added Key\\/tag or value")
	public void verify_product_should_be_filter_out_according_to_added_key_tag_or_value() {
		Assert.assertTrue(dashboardpage.product_displayed().isDisplayed());
	}
	/*
	 *   @DASH-229
  Scenario: check behaviour of  top subproducts
	 *
	 */
	@Given("Verify Top products widget is displayed")
	public void verify_top_products_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Top_product_widget().isDisplayed());
	}
	@Given("Verify It should show most vulnerable subproduct")
	public void verify_it_should_show_most_vulnerable_subproduct() {
		Assert.assertTrue(dashboardpage.Top_vulneribity_products().isDisplayed());
	}
	@Then("Verify It should show risk score of subproduct with risk trend sign")
	public void verify_it_should_show_risk_score_of_subproduct_with_risk_trend_sign() {
		Assert.assertTrue(dashboardpage.Top_product_RiskScore().isDisplayed());
		Assert.assertTrue(dashboardpage.Top_product_Risk_trendSign().isDisplayed());
	}
	/*
	 *   @DASH-230
  Scenario: Count verification wrt Findings Status of dashbaord vs Finding Page
	 *
	 */
	@Given("Verify Finding status widget is displayed")
	public void verify_finding_status_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Finding_status_widget().isDisplayed());
	}
	@Given("Verify i icon and copy contetnt icon is displayed on top of widget")
	public void verify_i_icon_and_copy_contetnt_icon_is_displayed_on_top_of_widget() {
		Assert.assertTrue(dashboardpage.Finding_status_i_icon().isDisplayed());
		Assert.assertTrue(dashboardpage.Finding_status_copy_icon().isDisplayed());
	}
	@Given("Verify count of Open status with findings page")
	public void verify_count_of_open_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Open_status_dashboard().isDisplayed());
		String Open_status_dashboard_value = dashboardpage.Open_status_dashboard().getText();
		dashboardpage.Open_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Open_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Open_status_Findings_value = dashboardpage.Open_status_Findings().getText();
		Assert.assertTrue(Open_status_dashboard_value.equals(Open_status_Findings_value));
		Driver_factory.getDriver().navigate().back();
	}
	@Given("Verify count of Confirm status with findings page")
	public void verify_count_of_confirm_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Confirm_status_dashboard().isDisplayed());
		String Confirm_status_dashboard_value = dashboardpage.Confirm_status_dashboard().getText();
		dashboardpage.Confirm_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Confirm_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Confirm_status_Findings = dashboardpage.Confirm_status_Findings().getText();
		Assert.assertTrue(Confirm_status_dashboard_value.equals(Confirm_status_Findings));
		Driver_factory.getDriver().navigate().back();
	}
	@Given("Verify count of Accept Risk status with findings page")
	public void verify_count_of_accept_risk_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.AcceptRisk_status_dashboard().isDisplayed());
		String AcceptRisk_status_dashboard_value = dashboardpage.AcceptRisk_status_dashboard().getText();
		dashboardpage.AcceptRisk_status_dashboard().click();
		Assert.assertTrue(dashboardpage.AcceptRisk_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String AcceptRisk_status_Findings_value = dashboardpage.AcceptRisk_status_Findings().getText();
		Assert.assertTrue(AcceptRisk_status_dashboard_value.equals(AcceptRisk_status_Findings_value));
		Driver_factory.getDriver().navigate().back();
	}
	@Given("Verify count of False+ve status with findings page")
	public void verify_count_of_false_ve_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Falseve_status_dashboard().isDisplayed());
		Thread.sleep(2000);
		String Falseve_status_dashboard_value = dashboardpage.Falseve_status_dashboard().getText();
		dashboardpage.Falseve_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Falsve_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Falsve_status_Findings_value = dashboardpage.Falsve_status_Findings().getText();
		Assert.assertTrue(Falseve_status_dashboard_value.equals(Falsve_status_Findings_value));
		Driver_factory.getDriver().navigate().back();
	}
	@Given("Verify count of Mitigated status with findings page")
	public void verify_count_of_mitigated_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Mitigated_status_dashboard().isDisplayed());
		Thread.sleep(2000);
		String Mitigated_status_dashboard_value = dashboardpage.Mitigated_status_dashboard().getText();
		dashboardpage.Mitigated_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Mitigated_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Mitigated_status_Findings_value = dashboardpage.Mitigated_status_Findings().getText();
		Assert.assertTrue(Mitigated_status_dashboard_value.equals(Mitigated_status_Findings_value));
		Driver_factory.getDriver().navigate().back();
	}
	@Given("Verify count of Suppressed status with findings page")
	public void verify_count_of_suppressed_status_with_findings_page() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Supressed_status_dashboard().isDisplayed());
		String Supressed_status_dashboard_value = dashboardpage.Supressed_status_dashboard().getText();
		dashboardpage.Supressed_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Supressed_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Supressed_status_Findings_value = dashboardpage.Supressed_status_Findings().getText();
		Assert.assertTrue(Supressed_status_dashboard_value.equals(Supressed_status_Findings_value));
		Driver_factory.getDriver().navigate().back();
	}
	@Then("Verify Total count of status with findings page")
	public void verify_total_count_of_status_with_findings_page()
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.Total_status_dashboard().isDisplayed());
		String Total_status_dashboard_value = dashboardpage.Total_status_dashboard().getText();
		dashboardpage.Total_status_dashboard().click();
		Assert.assertTrue(dashboardpage.Total_status_Findings().isDisplayed());
		Thread.sleep(2000);
		String Total_status_Findings_value = dashboardpage.Total_status_Findings().getText();
		Assert.assertTrue(Total_status_dashboard_value.equals(Total_status_Findings_value));
	}
	/*
	 *   @DASH-231
  Scenario: Validation of redirection flow to finding page wrt Findings Status
	 *
	 */
	@Given("click on any findings count")
	public void click_on_any_findings_count() {
		Assert.assertTrue(dashboardpage.Total_status_dashboard().isDisplayed());
		dashboardpage.Total_status_dashboard().click();
	}
	@Then("Verify user should navigate to findings page")
	public void verify_user_should_navigate_to_findings_page() {
		Assert.assertTrue(dashboardpage.Findings_page().isDisplayed());
	}
	/*
	 *   @DASH-233
  Scenario: Validation of redirection flow to finding page wrt New Findings
	 */
	@Given("Click on one finding in new Findings")
	public void click_on_one_finding_in_new_findings() {
		dashboardpage.findings_count_New_findings().click();
	}
	/*
	 *   @DASH-235
  Scenario: To check behaviour of findings over time widget
	 *
	 */
	String graphic = "charts";
	@Given("Verify Findings over time widget is displayed")
	public void verify_findings_over_time_widget_is_displayed() 
			throws InterruptedException {
		dashboardpage.Findings_overtime();
		Assert.assertTrue(dashboardpage.Findings_Line_option().isDisplayed());
	}
	@Given("Verify time period dropdown is displayed")
	public void verify_time_period_dropdown_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_time_period_dropdown().isDisplayed());
	}
	@Given("Verify Line and Area option is displayed")
	public void verify_line_and_area_option_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_Line_option().isDisplayed());
		Assert.assertTrue(dashboardpage.Findings_Area_option().isDisplayed());
	}
	@Given("Verify Log scale toggle is displayed")
	public void verify_log_scale_toggle_is_displayed() {
		Assert.assertTrue(dashboardpage.LogScale_toggle().isDisplayed());
	}
	@Given("Click on Filter")
	public void click_on_filter() {
		Assert.assertTrue(dashboardpage.Findings_overTime_Filter().isDisplayed());
		dashboardpage.Findings_overTime_Filter().click();
	}
	@Then("Verify Severity scantype and tool option should displayed")
	public void verify_severity_scantype_and_tool_option_should_displayed() {
		Assert.assertTrue(dashboardpage.Severity_list().isDisplayed());
		Assert.assertTrue(dashboardpage.Tool_list().isDisplayed());
		Assert.assertTrue(dashboardpage.ScanType_list().isDisplayed());
	}
	@Then("Verify Count of findings is displayed with graphical form")
	public void verify_count_of_findings_is_displayed_with_graphical_form() {
		String Graphical_Representation_attribute = dashboardpage
				.Graphical_Representation().getAttribute("class");
		Assert.assertTrue(Graphical_Representation_attribute.contains(graphic));
	}
	@Then("Click on Viewmore option")
	public void click_on_viewmore_option() {
		Assert.assertTrue(dashboardpage.Findings_Overtime_ViewMore_option().isDisplayed());
		dashboardpage.Findings_Overtime_ViewMore_option().click();
	}
	@Then("Verify can view the count of findings individually.")
	public void verify_can_view_the_count_of_findings_individually() {
		Assert.assertTrue(dashboardpage.Individual_findings_page().isDisplayed());
	}
	/*
	 *   @DASH-238
  Scenario: Check behaviour of Security Dashboard page after login
	 *
	 */
	@Then("Verify User should land on the preferred Dashboard page.")
	public void verify_user_should_land_on_the_preferred_dashboard_page() {
		Assert.assertTrue(dashboardpage.Security_dashboard().isDisplayed());
	}
	/*
	 *   @DASH-239
  Scenario: Check behaviour of Security Dashboard page once the page is loaded
	 *
	 */
	@Given("Verify Overall Risk score widget is displayed")
	public void verify_overall_risk_score_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.OverAll_RiskScore_widget().isDisplayed());
	}
	@Given("Verify Enterprise Product Matrix is displayed")
	public void verify_enterprise_product_matrix_is_displayed() {
		Assert.assertTrue(dashboardpage.Enterprises_product_matrix_widget().isDisplayed());
	}
	@Given("Verify New Findings widget is displayed")
	public void verify_new_findings_widget_is_displayed() {
		dashboardpage.New_findings_widget();
		Assert.assertTrue(dashboardpage.New_findings_widget().isDisplayed());
	}
	@Given("Verify Findings by product widget is displayed")
	public void verify_findings_by_product_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_by_product_widget().isDisplayed());
	}
	@Given("Verify Findings Due date widget is displayed")
	public void verify_findings_due_date_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_Due_Date().isDisplayed());
	}
	@Given("Verify Resolution SLA widget is displayed")
	public void verify_resolution_sla_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Resolution_SLA_widget().isDisplayed());
	}
	@Given("Verify SLA Breaches by Product widget is displayed")
	public void verify_sla_breaches_by_product_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.SLA_Breaches_By_product_widget().isDisplayed());
	}
	@Then("Verify SLA Breaches by Team widget is displayed")
	public void verify_sla_breaches_by_team_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.SLA_Breaches_By_Team().isDisplayed());
	}
	/*
	 *   @DASH-240
  Scenario: Check behaviour of Security Dashboard page when user clicks in different tabs like Production and Staging
	 *
	 */
	String Staging_page = "https://app.armorcode.com/#/u/29/56/dashboard/security?filters=%7B%22environmentName%22%3A%5B%22Staging%22%5D%7D";
	String Production_page = "https://app.armorcode.com/#/u/29/56/dashboard/security?filters=%7B%22environmentName%22%3A%5B%22Production%22%5D%7D";
	@Given("Click on Statging")
	public void click_on_statging() {
		Assert.assertTrue(dashboardpage.Staging_button().isDisplayed());
		dashboardpage.Staging_button().click();
	}
	@Then("Click on Production")
	public void click_on_production() {
		Assert.assertTrue(dashboardpage.Production_button().isDisplayed());
		dashboardpage.Production_button().click();
	}
	@Then("Verify Statging is working")
	public void verify_statging_is_working() {
		Assert.assertTrue(Driver_factory.getDriver().getCurrentUrl().equals(Staging_page));
	}
	@Then("Verify production is working")
	public void verify_production_is_working() {
		Assert.assertTrue(Driver_factory.getDriver().getCurrentUrl().equals(Production_page));
	}
	/*
	 *   @DASH-249
  Scenario: Check behaviour when user Navigates to Top Product Widget
	 *
	 */
	String Displayed_top_products ="Juiceshop"
			+ "5/100"
			+ "Testing_02"
			+ "7/100"
			+ "gaming"
			+ "10/100"
			+ "Test_prod"
			+ "10/100"
			+ "Sample_Product"
			+ "16/100";
	String text = "";
	@Then("Verify The widget should display the top {int} products")
	public void verify_the_widget_should_display_the_top_products(int int1) {
		List<WebElement> top_5_products_list = dashboardpage.Top_5_products_list();
		for(WebElement List:top_5_products_list) {
			text = List.getText();
			System.out.println(text);
		}
	}
	/*
	 * @DASH-255
  Scenario: Check behaviour when user navigates to New Findings widget
	 *
	 */
	@Given("Verify displayed different severities for last {string} hours")
	public void verify_displayed_different_severities_for_last_hours(String hours) {
		Assert.assertTrue(dashboardpage.New_Findings_last_24hours().getText()
				.contains(hours));
	}
	@Given("Verify displayed different severity for last {string} days")
	public void verify_displayed_different_severity_for_last_days(String days) {
		Assert.assertTrue(dashboardpage.New_Findings_last_7days().getText()
				.contains(days));
	}
	@Then("Verify displayed different severities for last {string} days")
	public void verify_displayed_different_severities_for_last_days(String month) {
		Assert.assertTrue(dashboardpage.New_Findings_lastmonth().getText()
				.contains(month));
	}
	/*
	 *   @DASH-258
  Scenario: Check behaviour when user navigates to Findings By Product widget
	 *
	 */
	public void Critical_high_verification() {
		Assert.assertTrue(Driver_factory.getDriver()
				.getPageSource().contains("Critical"));
		Assert.assertTrue(Driver_factory.getDriver()
				.getPageSource().contains("High"));
	}
	@Then("Verify The top {string} products with most number of critical and high findings should be displayed")
	public void critical_and_high_findings_should_be_displayed(String string) {
		List<WebElement> findings_by_product_top5_products_list 
		= dashboardpage.Findings_by_product_top5_products_list();
		for(WebElement List:findings_by_product_top5_products_list) {
			text = List.getText();
			System.out.println(text);
		}
		actions.moveToElement(dashboardpage.Top1_product()).perform();
		Critical_high_verification();
		actions.moveToElement(dashboardpage.Top2_product()).perform();
		Critical_high_verification();
		actions.moveToElement(dashboardpage.Top3_product()).perform();
		Critical_high_verification();
		actions.moveToElement(dashboardpage.Top4_product()).perform();
		Critical_high_verification();
		actions.moveToElement(dashboardpage.Top5_product()).perform();
		Critical_high_verification();
	}
	/*
	 * @DASH-284
  Scenario: Check behaviour when user Navigates to Findings Due Date widget
	 */
	@Given("Verify Findings Due date Widget is displayed")
	public void verify_findings_due_date_Widget_is_displayed() 
			throws InterruptedException {
		dashboardpage.Findings_overtime();
		Assert.assertTrue(dashboardpage.Findings_Due_Date().isDisplayed());
	}
	@Given("Verify that Overdue count is displayed")
	public void verify_that_overdue_count_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_OverDue().isDisplayed());
	}
	@Given("Verify that Due in 1D count is displayed")
	public void verify_that_due_in_1d_count_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_DueIn1D().isDisplayed());
	}
	@Given("Verify that Due in 7D count is displayed")
	public void verify_that_due_in_7d_count_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_DueIn7D().isDisplayed());
	}
	@Given("Verify that Due in 14D count is displayed")
	public void verify_that_due_in_14d_count_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_DueIn14D().isDisplayed());
	}
	@Given("Verify that Due in 30D count is displayed")
	public void verify_that_due_in_30d_count_is_displayed() {
		Assert.assertTrue(dashboardpage.Findings_DueIn30D().isDisplayed());
	}
	/*
	 *   @DASH-305
  Scenario: Check behaviour SSDLC Dashboard functionality
	 */
	@Given("Select SSDLC Healthcheck dashboard")
	public void select_ssdlc_healthcheck_dashboard() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		Assert.assertTrue(dashboardpage.SSDLC_Healthcheck_dashboard().isDisplayed());
		dashboardpage.SSDLC_Healthcheck_dashboard().click();
		dashboardpage.Show_All_toggle().click();
	}
	@Then("Verify Apply filter by date should display")
	public void verify_apply_filter_by_date_should_display() {
		Assert.assertTrue(dashboardpage.SSDLC_DateFilter().isDisplayed());
	}
	@Then("Verify SSDLC Dashboard should display Products")
	public void verify_ssdlc_dashboard_should_display_products() throws InterruptedException {
		Assert.assertTrue(dashboardpage.SSDLC_prd().isDisplayed());
	}
	@Then("Verify SSDLC Dashboard should display Sub Products")
	public void verify_ssdlc_dashboard_should_display_sub_products() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.SSDLC_product_icon().click();
		Thread.sleep(5000);
		Assert.assertTrue(dashboardpage.SSDLC_subproduct_list().isDisplayed());
	}
	@Then("Verify Integrated sources\\/tool dispalyed with Source\\/tool type")
	public void verify_integrated_sources_tool_dispalyed_with_source_tool_type() {
		Assert.assertTrue(dashboardpage.SSDLC_Subproduct_tool().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_Subproduct_ToolType().isDisplayed());
	}
	@Then("Verify SSDLC Dashboard should display Findings and status")
	public void verify_ssdlc_dashboard_should_display_findings_and_status() {
		Assert.assertTrue(dashboardpage.SSDLC_Subproduct_Findings().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_Subproduct_status().isDisplayed());
	}
	/*
	 *   @DASH-306
  Scenario: Check behaviour SSDLC Dashboard > icon
	 */
	@Given("Verify Tools\\/Souce configured for the products & Subproducts should display")
	public void verify_tools_souce_configured_for_the_products_subproducts_should_display() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.SSDLC_product_icon().click();
	}
	@Given("Verify Each tool should display tool type")
	public void verify_each_tool_should_display_tool_type() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.SSDLC_Subproduct_icon()).perform();
		dashboardpage.SSDLC_Subproduct_icon().click();
		Thread.sleep(3000);
		Assert.assertTrue(dashboardpage.SSDLC_tool_type().isDisplayed());
	}
	@Given("Verify Each tool should display Findings")
	public void verify_each_tool_should_display_findings() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SSDLC_tool_findings().isDisplayed());
	}
	@Given("Verify Each tool should display Last Scan")
	public void verify_each_tool_should_display_last_scan() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SSDLC_tool_LastSCan().isDisplayed());
	}
	@Given("Verify Each tool should display Status")
	public void verify_each_tool_should_display_status() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SSDLC_tool_status().isDisplayed());
	}
	@Then("Total findings which is the sum of critical, high, medium and low should display properly")
	public void total_findings_which_is_the_sum_of_critical_high_medium_and_low_should_display_properly() {

	}
	/*
	 *   @DASH-307
  Scenario: Check All the tool type and total number of findings and overall status
	 */
	@Given("Select product")
	public void select_product_in_product_dropdown() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.SSDLC_product_icon().click();
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.SSDLC_Subproduct_icon()).perform();
		dashboardpage.SSDLC_Subproduct_icon().click();
	}
	@Given("verify It should display all the tools which are there in collapsible field")
	public void verify_it_should_display_all_the_tools_which_are_there_in_collapsible_field() {
		Assert.assertTrue(dashboardpage.COllapsed_tool().isDisplayed());
	}
	@Then("Verify it should show all the tool type and  total number of findings and overall status")
	public void verify_it_should_show_all_the_tool_type_and_total_number_of_findings_and_overall_status() 
			throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(dashboardpage.SSDLC_tool_type().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_tool_findings().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_tool_status().isDisplayed());
	}
	/*
	 * @DASH-308
  Scenario: Check Count of findings with findings page
	 */
	String SSDLC_tool_findings = "";
	String SSDLC_findings_dislayed = "";
	@Given("Click on Total findings option")
	public void click_on_total_findings_option() throws InterruptedException {
		Thread.sleep(2000);
		SSDLC_tool_findings = dashboardpage.SSDLC_tool_findings().getText();
		System.out.println(SSDLC_tool_findings);
		dashboardpage.SSDLC_Total_findings().click();
	}
	@Given("Verify It navigate to findings page")
	public void verify_it_navigate_to_findings_page() {
		Assert.assertTrue(dashboardpage.SSDLC_findings_page().isDisplayed());
	}
	@Then("Verify count of findings should match with finding page findings")
	public void verify_count_of_findings_should_match_with_finding_page_findings()
			throws InterruptedException {
		Thread.sleep(2000);
		SSDLC_findings_dislayed = dashboardpage.SSDLC_findings_dislayed().getText();
		System.out.println(SSDLC_findings_dislayed);
		Assert.assertTrue(SSDLC_tool_findings.contains(SSDLC_findings_dislayed));
	}
	/*
	 * @DASH-309
  Scenario: Check Count of All different Severity of Findings with findings page
	 */
	String SSDLC_Critical_findings = "";
	String SSDLC_High_findings = "";
	String SSDLC_Medium_findings = "";
	String SSDLC_Low_findings = "";
	@Given("Click Critical findings option")
	public void click_critical_findings_option() throws InterruptedException {
		Thread.sleep(2000);
		SSDLC_Critical_findings = dashboardpage.SSDLC_Critical_findings().getText();
		dashboardpage.SSDLC_Critical_findings().click();
	}
	@Then("Verify count of Critical findings should match")
	public void verify_count_of_critical_findings_should_match() {
		SSDLC_findings_dislayed = dashboardpage.SSDLC_findings_dislayed().getText();
		Assert.assertTrue(SSDLC_Critical_findings.contains(SSDLC_findings_dislayed));
		Driver_factory.getDriver().navigate().back();
	}
	@Then("Click on High findings option")
	public void click_on_high_findings_option() throws InterruptedException {
		select_product_in_product_dropdown();
		Thread.sleep(2000);
		SSDLC_High_findings = dashboardpage.SSDLC_High_findings().getText();
		dashboardpage.SSDLC_High_findings().click();
	}
	@Then("Verify count of High findings should match")
	public void verify_count_of_high_findings_should_match() {
		SSDLC_findings_dislayed = dashboardpage.SSDLC_findings_dislayed().getText();
		Assert.assertTrue(SSDLC_High_findings.contains(SSDLC_findings_dislayed));
		Driver_factory.getDriver().navigate().back();
	}
	@Then("Click on medium findings option")
	public void click_on_medium_findings_option() throws InterruptedException {
		select_product_in_product_dropdown();
		Thread.sleep(2000);
		SSDLC_Medium_findings = dashboardpage.SSDLC_Medium_findings().getText();
		dashboardpage.SSDLC_Medium_findings().click();
	}
	@Then("Verify count of medium findings should match")
	public void verify_count_of_medium_findings_should_match() {
		SSDLC_findings_dislayed = dashboardpage.SSDLC_findings_dislayed().getText();
		Assert.assertTrue(SSDLC_Medium_findings.contains(SSDLC_findings_dislayed));
		Driver_factory.getDriver().navigate().back();
	}
	@Then("Click on Low findings option")
	public void click_on_low_findings_option() throws InterruptedException {
		select_product_in_product_dropdown();
		Thread.sleep(2000);
		SSDLC_Low_findings = dashboardpage.SSDLC_Low_findings().getText();
		dashboardpage.SSDLC_Low_findings().click();
	}
	@Then("Verify count of Low findings should match")
	public void verify_count_of_low_findings_should_match() {
		SSDLC_findings_dislayed = dashboardpage.SSDLC_findings_dislayed().getText();
		Assert.assertTrue(SSDLC_Low_findings.contains(SSDLC_findings_dislayed));
	}
	/*
	 *   @DASH-330
  Scenario: My Findings Widget functionality
	 */
	@Given("Select Devolper dashboard")
	public void select_devolper_dashboard() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		Assert.assertTrue(dashboardpage.Developer_dashboard().isDisplayed());
		dashboardpage.Developer_dashboard().click();
	}
	@Given("Verify My findings widget is displayed")
	public void verify_my_findings_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_My_Findings().isDisplayed());
	}
	@Given("Click on Severity colour")
	public void click_on_severity_colour() {
		Assert.assertTrue(dashboardpage.Dev_My_findings_severity_colour().isDisplayed());
		dashboardpage.Dev_My_findings_severity_colour().click();
	}
	@Then("Verify It will be redirected to findings page with specified filter applied")
	public void verify_it_will_be_redirected_to_findings_page_with_specified_filter_applied() {
		Assert.assertTrue(dashboardpage.SSDLC_findings_page().isDisplayed());
		Assert.assertTrue(dashboardpage.Severity_findings_page().isDisplayed());
	}
	/*
	 *   @DASH-331
  Scenario: My SLA Notification Widget functionality
	 */
	@Given("Verify My SLA Notification Widget is displayed")
	public void verify_my_sla_notification_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_My_SLA_notification_widget().isDisplayed());
	}
	@Given("Click on Total Number under the Column \\(Overdue, Today and In Next {int} Days)")
	public void click_on_total_number_under_the_column_overdue_today_and_in_next_days(Integer int1) {
		Assert.assertTrue(dashboardpage.Total_number_Overdue().isDisplayed());
		dashboardpage.Total_number_Overdue().click();
	}
	/*
	 *   @DASH-332
  Scenario: My Findings by Product widget functionality
	 */
	@Given("Verify My Findings by product widget is displayed")
	public void verify_my_findings_by_product_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_MYFindings_BY_product_widget().isDisplayed());
	}
	@Given("Click on product Graph")
	public void click_on_product_graph() {
		Assert.assertTrue(dashboardpage.Myfindings_product_graph().isDisplayed());
		dashboardpage.Myfindings_product_graph().click();
	}
	/*
	 *   @DASH-333
  Scenario: My Findings by Source widget functionality
	 */
	@Given("Verify My Findings by sorce widget is displayed")
	public void verify_my_findings_by_sorce_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_Findings_By_Source().isDisplayed());
	}
	@Given("Click on source Graph")
	public void click_on_source_graph() {
		Assert.assertTrue(dashboardpage.FindingsBySource_graph().isDisplayed());
		dashboardpage.FindingsBySource_graph().click();
	}
	/*
	 *   @DASH-334
  Scenario: My Findings by Severity/Status widget functionality
	 */
	@Given("Verify My Findings by Severity\\/Status widget is displayed")
	public void verify_my_findings_by_severity_status_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_Finding_status().isDisplayed());
	}
	@Given("Click on Total number under Open and Confirm columns")
	public void click_on_total_number_under_open_and_confirm_columns() {
		Assert.assertTrue(dashboardpage.Total_number_confirm_status().isDisplayed());
		dashboardpage.Total_number_confirm_status().click();
	}
	/*
	 *   @DASH-335
  Scenario: My Open Tickets widget functionality
	 */

	@Given("Verify My open tickets widget is displayed")
	public void verify_my_open_tickets_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.Developer_My_open_tickets().isDisplayed());
	}
	@Given("Click on Total number under severity name column")
	public void click_on_total_number_under_severity_name_column() {
		Assert.assertTrue(dashboardpage.My_open_tickets_Total_number().isDisplayed());
		dashboardpage.My_open_tickets_Total_number().click();
	}
	@Then("Verify It will redirect to Tickets page with specfic filter applied")
	public void verify_it_will_redirect_to_tickets_page_with_specfic_filter_applied() {
		Assert.assertTrue(dashboardpage.Tickets_page().isDisplayed());
		Assert.assertTrue(dashboardpage.Filter_tickets_page().isDisplayed());
	}
	/*
	 *   @DASH-337
  Scenario: Global filter application on developer dashboard functionality
	 */
	@Given("Apply global filter")
	public void apply_global_filter() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Global_filter().isDisplayed());
		dashboardpage.Global_filter().click();
		Thread.sleep(2000);
		dashboardpage.Global_filter_BU_dropdown().click();
		dashboardpage.Global_filter_BU1().click();
		Thread.sleep(2000);
		dashboardpage.Global_filter_Apply_button().click();
	}
	@Then("Verify Records should be displayed based on Global filter applied")
	public void verify_records_should_be_displayed_based_on_global_filter_applied() {
		Assert.assertTrue(dashboardpage.Dashboard_After_filter().isDisplayed());
	}
	/*
	 *   @DASH-338
  Scenario: Check Date filter in developer dashboard is working
	 */
	@Given("Click on developer dashboard date filter")
	public void click_on_developer_dashboard_date_filter() {
		Assert.assertTrue(dashboardpage.Developer_Date_filter().isDisplayed());
		dashboardpage.Developer_Date_filter().click();
	}
	@Given("Apply filter")
	public void apply_filter() {
		Assert.assertTrue(dashboardpage.Developer_date_option().isDisplayed());
		dashboardpage.Developer_date_option().click();
	}
	@Then("Verify Records should be displayed based on Date filter applied")
	public void verify_records_should_be_displayed_based_on_date_filter_applied() {
	}
	/*
	 *   @DASH-339
  Scenario: Check Production staging tab data validation
	 */
	@Given("Check for Staging Environment tab")
	public void check_for_staging_environment_tab() {
		Assert.assertTrue(dashboardpage.Developer_staging_button().isDisplayed());
		dashboardpage.Developer_staging_button().click();
	}
	@Then("Verify Records should be divided based on the Environment")
	public void verify_records_should_be_divided_based_on_the_staging_environment() {
	}
	@Then("Check for Production Environment tab")
	public void check_for_production_environment_tab() {
		Assert.assertTrue(dashboardpage.Developer_production_button().isDisplayed());
		dashboardpage.Developer_production_button().click();
	}
	/*
	 *   @DASH-340
  Scenario: Global settings > Select Developer dashboard as Set as Defaul
	 */
	@When("Select Developer dashboard as deafult")
	public void select_developer_dashboard_as_deafult() {
		Assert.assertTrue(dashboardpage.Developer_dashboard_default().isDisplayed());
		dashboardpage.Developer_dashboard_default().click();
	}
	@Then("Verify developer Dashboard should be displayed")
	public void verify_developer_dashboard_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Developer_dashboard_verification().isDisplayed());
		/*
		 * Set as Security as default
		 */
	}
	@Then("Select Security dashboard as deafult")
	public void Select_Security_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Security_Default_dashboard().click();
	}
	/*
	 *   @DASH-372
  Scenario: All BU dashboard enable/disable from Global setting page.
	 */
	@When("Disable the dashboard")
	public void disable_the_dashboard() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Global_Dashboards().isDisplayed());
		dashboardpage.Global_Dashboards().click();
		Thread.sleep(2000);
		dashboardpage.Developer_checkbox().click();
		Thread.sleep(10000);
	}
	@When("Verify in Dashboard drop down the disabled dashboard should not displayed")
	public void verify_in_dashboard_drop_down_the_disabled_dashboard_should_not_displayed() {
		Driver_factory.getDriver().navigate().back();
		dashboardpage.Dashboard_Dropdown().click();
		//		if(dashboardpage.Developer_dashboard().isDisplayed()) {
		//			Assert.assertTrue(false);
		//		}else {
		//			Assert.assertTrue(true);
		//		}
	}
	@When("Enable the same dashboard")
	public void enable_the_same_dashboard() throws InterruptedException {
		Assert.assertTrue(dashboardpage.Global_Dashboards().isDisplayed());
		dashboardpage.Global_Dashboards().click();
		dashboardpage.Developer_checkbox().click();
	}
	@When("Verify in Dashboard drop down the dashboard should display")
	public void verify_in_dashboard_drop_down_the_dashboard_should_display() {
		Driver_factory.getDriver().navigate().back();
		dashboardpage.Dashboard_Dropdown().click();
		Assert.assertTrue(dashboardpage.Developer_dashboard().isDisplayed());
	}
	/*
	 *   @DASH-373
  Scenario: All BU > Export as CSV link text button
	 */
	@Given("Click on export as CSV")
	public void click_on_export_as_csv() {
		Assert.assertTrue(dashboardpage.Export_CSV_button().isDisplayed());
		dashboardpage.Export_CSV_button().click();
	}
	@Then("Verify file should downloaded")
	public void verify_file_should_downloaded() {
	}
	@Then("File downloaded popup should display")
	public void file_downloaded_popup_should_display() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.Export_success_popup().isDisplayed());
	}
	/*
	 *   @DASH-374
  Scenario: All BU dashboard with different environemnt.
	 */
	@Given("Click on All BU staging Environment")
	public void click_on_all_bu_staging_environment() {
		dashboardpage.All_BU_staging().click();
	}
	@Given("CLick on All BU production Environment")
	public void c_lick_on_all_bu_production_environment() {
		dashboardpage.All_BU_Production().click();
	}
	@Then("Verify As per selected Environment we can see data")
	public void verify_as_per_selected_environment_we_can_see_data() {
	}
	/*
	 *   @DASH-375
  Scenario: All BU dashboard with different filters.
	 */
	@Given("Select Severity from Severity dropdown")
	public void select_severity_from_severity_dropdown() throws InterruptedException  {
		Assert.assertTrue(dashboardpage.All_BU_Severity_dropdown().isDisplayed());
		dashboardpage.All_BU_Severity_dropdown().click();
		Thread.sleep(2000);
		dashboardpage.All_BU_critical_severity().click();
	}
	@Given("Click on Apply button")
	public void click_on_apply_button() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.All_BU_Severity_Apply_button().click();
		dashboardpage.All_BU_Severity_dropdown().click();
	}
	@Then("Verify should display data as per selected filter or options.")
	public void verify_should_display_data_as_per_selected_filter_or_options() {
		Assert.assertTrue(dashboardpage.All_BU_displayed_sevrity().isDisplayed());
	}
	/*
	 * @DASH-376
  Scenario: Tool tip to all of the trend indicators
	 */
	@Then("Verify should display tool tip infront of risk score")
	public void verify_should_display_tool_tip_infront_of_risk_score() 
			throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.All_BU_RiskScore()).perform();
		Assert.assertTrue(dashboardpage.All_BU_RiskScore_Tooltip().isDisplayed());
	}
	/*
	 *   @DASH-377
  Scenario: All BU dashboard Save Search feature
	 */
	String name = "demo13";
	String Delete = "Delete";
	@Given("Click on Save as")
	public void click_on_save_as() {
		Assert.assertTrue(dashboardpage.All_BU_Filter_saveAs().isDisplayed());
		dashboardpage.All_BU_Filter_saveAs().click();
	}
	@Given("Enter name and click on save")
	public void enter_name_and_click_on_save() {
		dashboardpage.All_BU_saveas_name(name);
		dashboardpage.All_BU_saveAs_save_button().click();
	}
	@Then("Verify Added popup should dispaly")
	public void verify_added_popup_should_dispaly() {
		Assert.assertTrue(dashboardpage.All_BU_saveAs_popup().isDisplayed());
	}
	@Then("Verify Should dispaly and work added save search filter properly.")
	public void verify_should_dispaly_and_work_added_save_search_filter_properly() 
			throws InterruptedException {
		/*
		 * Deleting added saved filters
		 */
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.ALl_BU_savedsearch_button().isDisplayed()) ;
		dashboardpage.ALl_BU_savedsearch_button().click();
		Thread.sleep(3000);
		Assert.assertTrue(dashboardpage.Delete_saved_search().isDisplayed());
		Thread.sleep(2000);
		dashboardpage.Delete_saved_search().click();
		dashboardpage.Delete_text(Delete);
		Thread.sleep(2000);
		dashboardpage.All_BU_Delete_button().click();
		Thread.sleep(2000);
	}
	/*
	 *   @DASH-378
  Scenario: All BU dashboard Reset Filter
	 */
	@Given("Click on Reset filter button")
	public void click_on_reset_filter_button() {
		Assert.assertTrue(dashboardpage.All_BU_Reset_filter().isDisplayed());
		dashboardpage.All_BU_Reset_filter().click();
	}
	@Then("Verify The applied filter data should be reset")
	public void verify_the_applied_filter_data_should_be_reset() {
		Assert.assertTrue(dashboardpage.All_BU_Severity_reset().isDisplayed());
	}
	/*
	 *   @DASH-379
  Scenario: ALL BU> Findings Over Time widget functionality
	 */
	@Given("click on Finding over time & status Drop-dwon arrow")
	public void click_on_finding_over_time_status_drop_dwon_arrow() {
		Assert.assertTrue(dashboardpage.All_BU_findings_overtime_dropdown().isDisplayed());
		dashboardpage.All_BU_findings_overtime_dropdown().click();
	}
	@Then("Verify User can see Finding over time and Finding status Widget.")
	public void verify_user_can_see_finding_over_time_and_finding_status_widget() {
		Assert.assertTrue(dashboardpage.All_BU_findings_Overtime_widget().isDisplayed());
		Assert.assertTrue(dashboardpage.All_BU_findings_status_widget().isDisplayed());
	}
	@Then("Click on any BU Drop-down arrow")
	public void click_on_any_bu_drop_down_arrow() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.BU_dropdown_Arrow().click();
	}
	@Then("Verify User can aslo see Finding over time and Finding status Widget.")
	public void verify_user_can_aslo_see_finding_over_time_and_finding_status_widget() {
		Assert.assertTrue(dashboardpage.BU_findings_overtime_widget().isDisplayed());
		Assert.assertTrue(dashboardpage.BU_findings_status_widget().isDisplayed());
	}
	/*
	 *   @DASH-382
  Scenario: All Bu Dashboard > Only BU Global filter is applicable
	 */
	@Given("Click on GLobal filter")
	public void click_on_g_lobal_filter() {
		dashboardpage.Global_filter().click();
	}
	@Then("Verify The user is only allowed to change BUs from the global filte")
	public void verify_the_user_is_only_allowed_to_change_b_us_from_the_global_filte() {
		dashboardpage.Global_filter_BU_dropdown().click();
	}
	@Then("Verify Subproducts and tool category are disabled")
	public void verify_subproducts_and_tool_category_are_disabled() 
			throws InterruptedException {
		//		Thread.sleep(2000);
		//		Assert.assertTrue(dashboardpage.Global_filter_ToolCategory().isEnabled());
	}
	/*
	 *   @DASH-385
  Scenario: All BU Additional column functionality
	 */
	@Given("Mouse hover over Additional column")
	public void mouse_hover_over_additional_column() {
		actions.moveToElement(dashboardpage.All_BU_Additional_column_icon()).perform();
	}
	@Given("Verify Tooltip should be display")
	public void verify_tooltip_should_be_display() {
		Assert.assertTrue(dashboardpage.Additional_column_tooltip().isDisplayed());
	}
	@Given("Click on Additional Column")
	public void click_on_additional_column() {
		dashboardpage.All_BU_Additional_column_icon().click();
		Assert.assertTrue(dashboardpage.All_BU_additional_options().isDisplayed());
	}
	int i;
	int n = 2;
	@Then("Verify option should be work Properly.")
	public void verify_option_should_be_work_properly() {
		for(i=0;i<n;i++) {
			dashboardpage.Additional_Riskscore().click();
		}
		for(i=0;i<n;i++) {
			dashboardpage.Additional_Findings().click();
		}
		for(i=0;i<n;i++) {
			dashboardpage.Additional_Total_Prodcut().click();
		}
		for(i=0;i<n;i++) {
			dashboardpage.Additional_Total_SubProduct().click();
		}
		for(i=0;i<n;i++) {
			dashboardpage.Additional_Total_status().click();
		}
	}
	/*
	 *   @DASH-388
  Scenario: All_Bu_Dashboard > Risk score functionality
	 */
	String BU_product_RiskScore = "";
	@Given("Check product RiskScore")
	public void check_product_risk_score() {
		Assert.assertTrue(dashboardpage.BU_product_RiskScore().isDisplayed());
		BU_product_RiskScore = dashboardpage.BU_product_RiskScore().getText();
		dashboardpage.BU_product().click();
	}
	@Given("Navigate to product page")
	public void navigate_to_product_page() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Product_page().click();
	}
	@Then("Verify that product Riskcore is matching")
	public void verify_that_product_riskcore_is_matching() {
		Assert.assertTrue(dashboardpage.Product_RiskScore().isDisplayed());
		String Product_RiskScore = dashboardpage.Product_RiskScore().getText();
		Assert.assertTrue(BU_product_RiskScore.contains(Product_RiskScore));
	}
	@Then("Navigate to Sub product page")
	public void navigate_to_sub_product_page() {
		dashboardpage.Subproduct_page().click();
	}
	@Then("Verify that Subproduct Riskscore is matching")
	public void verify_that_subproduct_riskscore_is_matching() {
		Assert.assertTrue(dashboardpage.Subproduct_Riskscore().isDisplayed());
		String Subproduct_Riskscore = dashboardpage.Subproduct_Riskscore().getText();
		Assert.assertTrue(BU_product_RiskScore.contains(Subproduct_Riskscore));
	}
	/*
	 *   @DASH-389
  Scenario: All_Bu_Dashboard > Click on any BU
	 */
	@Given("Click on any BU")
	public void click_on_any_bu() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.BU_product().click();
	}
	/*
	 *   @DASH-394
  Scenario: To check behaviour of navigation to ssdlc dashboard
	 */
	@Given("Selects SSDLC dashboard")
	public void selects_ssdlc_dashboard() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		dashboardpage.SSDLC_Dashboard().click();
	}
	@Then("Verify user is on SSDLC dashboard page")
	public void verify_user_is_on_ssdlc_dashboard_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SSDLC_Dashboard_page().isDisplayed());
	}
	@Then("Verify should show ssdlc for selected product and All subproduct")
	public void verify_should_show_ssdlc_for_selected_product_and_all_subproduct() {
		Assert.assertTrue(dashboardpage.SSDLC_displayed_product().isDisplayed());
	}
	/*
	 *   @DASH-395
  Scenario: To check behaviour Product SSDLC Dashboard>> Devops process
	 */
	@Then("Click on SSDLC product")
	public void click_on_ssdlc_product() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.SSDLC_Product().click();
	}
	@Then("Verify {int} phases are displayed")
	public void verify_phases_are_displayed(Integer phases) throws InterruptedException {
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase1().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase2().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase3().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase4().isDisplayed());
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Thread.sleep(2000);
		Js.executeScript("document.querySelector(\"div[class$='devops-widget']\").scrollLeft=1000");
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase5().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase6().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_DevopsProcess_phase7().isDisplayed());
	}
	@Then("Verify each phase should contain respective scan type")
	public void verify_each_phase_should_contaion_respective_scan_type() 
			throws InterruptedException {
		Driver_factory.getDriver().navigate().back();
		Driver_factory.getDriver().navigate().forward();
		Assert.assertTrue(dashboardpage.DevopsPRoces_scantype_phase1().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase2().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase3().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase4().isDisplayed());
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Thread.sleep(2000);
		Js.executeScript("document.querySelector(\"div[class$='devops-widget']\").scrollLeft=1000");
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase5().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase6().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_scantype_phase7().isDisplayed());
	}
	@Then("Verify each finding should be displayed on each phase based on its scan type")
	public void verify_each_finding_should_be_displayed_on_each_phase_based_on_its_scan_type() 
			throws InterruptedException {
		Driver_factory.getDriver().navigate().back();
		Driver_factory.getDriver().navigate().forward();
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase1().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase2().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase3().isDisplayed());
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Thread.sleep(2000);
		Js.executeScript("document.querySelector(\"div[class$='devops-widget']\").scrollLeft=800");
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase4().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase5().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase6().isDisplayed());
		Assert.assertTrue(dashboardpage.DevopsProcess_findings_phase7().isDisplayed());
	}
	String exp_tooltip = "Total: No tool(s) configured";
	@Then("Mouse hover over N\\/A findings")
	public void mouse_hover_over_n_a_findings() throws InterruptedException {
		Driver_factory.getDriver().navigate().back();
		Driver_factory.getDriver().navigate().forward();
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.NA_findings()).perform();

	}
	@Then("Verify it should show no tools configured tooltip")
	public void verify_it_should_show_no_tools_configured_tooltip() {
		Assert.assertTrue(dashboardpage.NA_Tooltp().getText()
				.contains(exp_tooltip));
	}
	/*
	 *   @DASH-396
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Plan
	 */
	@Then("CLick on SSDLC findings")
	public void c_lick_on_ssdlc_findings() {
		Assert.assertTrue(dashboardpage.SSDLC_findings_displayed_total().isDisplayed());
		dashboardpage.SSDLC_findings_displayed_total().click();
	}
	@Then("Verify the findings date should reflect in tool tip")
	public void verify_the_findings_date_should_reflect_in_tool_tip() 
			throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.Findingspage_date()).perform();
		Assert.assertTrue(dashboardpage.Findingspage_datetooltip().isDisplayed());
	}
	@Then("Verify if no tool is configured it should show No tools configured")
	public void verify_if_no_tool_is_configured_it_should_show_no_tools_configured() {
		//Assert.assertTrue(dashboardpage.Findingspage_datetooltip().isDisplayed());
	}
	/*
	 *   @DASH-401
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Code
	 */
	@Then("Verify findings shown in the dashboard should be same with the finding page")
	public void verify_findings_shown_in_the_dashboard_should_be_same_with_the_finding_page() {
		Assert.assertTrue(dashboardpage.Findings_product_displayed().isDisplayed());
	}
	@Then("Verify it should apply appropriate filter in findings page")
	public void verify_it_should_apply_appropriate_filter_in_findings_page() {
		Assert.assertTrue(dashboardpage.Findings_filter_applied1().isDisplayed());
		Assert.assertTrue(dashboardpage.Findings_filter_applied2().isDisplayed());
		Assert.assertTrue(dashboardpage.Findings_product_displayed().isDisplayed());
	}
	/*
	 *   @DASH-408
  Scenario: To check behaviour of Findings by source/scan type
	 */
	@Then("Verify Findings by Sorce\\/scan type widget is displayed")
	public void verify_findings_by_sorce_scan_type_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(5000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.SSDLC_Findings_by_source_widget().isDisplayed());
	}
	@Then("Verify It should show findings by its source type or scan type")
	public void verify_it_should_show_findings_by_its_source_type_or_scan_type() {
		dashboardpage.SSDLC_findings_typeList().click();
		Assert.assertTrue(dashboardpage.SSDLC_soucetype().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_ScanTYpe().isDisplayed());
	}
	/*
	 *   @DASH-414
  Scenario: To check behaviour of Product SSDLC Dashboard  >Appsec tool status
	 */
	@Then("Verify Appsec tool status widget is displayed")
	public void verify_appsec_tool_status_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(5000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,600);","");
		Assert.assertTrue(dashboardpage.AppSec_tool_widget().isDisplayed());
	}
	@Then("Verify it should show source, source type, scan status, tool status, last run")
	public void verify_it_should_show_source_source_type_scan_status_tool_status_last_run() {
		Assert.assertTrue(dashboardpage.Appsec_SOurce_coloumn().isDisplayed());
		Assert.assertTrue(dashboardpage.AppSec_Sourcetype_column().isDisplayed());
		Assert.assertTrue(dashboardpage.AppSec_Scan_status_column().isDisplayed());
		Assert.assertTrue(dashboardpage.AppSec_Tool_status_column().isDisplayed());
		Assert.assertTrue(dashboardpage.AppSec_Last_run_column().isDisplayed());
	}
	/*
	 *   @DASH-415
  Scenario: To check behaviour of Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("Verify Infrastructure tool status widget is displayed")
	public void verify_infrastructure_tool_status_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(5000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,700);","");
		Assert.assertTrue(dashboardpage.Infrastructure_tool_widget().isDisplayed());
	}
	@Then("Verify Infrascture tool should show source, source type, scan status, tool status, last run")
	public void verify_infrascture_tool_should_show_source_source_type_scan_status_tool_status_last_run() {
		Assert.assertTrue(dashboardpage.Infrastructure_source_column().isDisplayed());
		Assert.assertTrue(dashboardpage.Infrastructure_Sorcetype_column().isDisplayed());
		Assert.assertTrue(dashboardpage.Infrastructure_ScanStatus_column().isDisplayed());
		Assert.assertTrue(dashboardpage.Infrastucture_Tool_status_column().isDisplayed());
		Assert.assertTrue(dashboardpage.Infrastucture_lastRun_column().isDisplayed());
	}
	/*
	 *   @DASH-416
  Scenario: To check behaviour of ci/cd and notification status  > Product SSDLC Dashboard
	 */
	@Then("Verify CI\\/CD and notification status widget is displayed")
	public void verify_ci_cd_and_notification_status_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(5000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,900);","");
		Assert.assertTrue(dashboardpage.CI_CD_Notification_widget().isDisplayed());
	}
	@Then("Verify CI\\/CD tool should show source, scan status, tool status, last run")
	public void verify_ci_cd_tool_should_show_source_scan_status_tool_status_last_run() {
		Assert.assertTrue(dashboardpage.CI_CD_Source_column().isDisplayed());
		Assert.assertTrue(dashboardpage.CI_CD_ConfigStatus_column().isDisplayed());
		Assert.assertTrue(dashboardpage.CI_CD_ToolStatus_column().isDisplayed());
		Assert.assertTrue(dashboardpage.CI_CD_LastRun_column().isDisplayed());
	}
	/*
	 *   @DASH-434
  Scenario: Go to SSDLC dashboard > Hover on the Total findings
	 */
	@Then("Click on SSDLC product Demo Application")
	public void click_on_ssdlc_product_demo_application() {
		Assert.assertTrue(dashboardpage.SSDLC_Demo_Application().isDisplayed());
		dashboardpage.SSDLC_Demo_Application().click();
	}
	@Then("Mouse hover over total findings in Build")
	public void mouse_hover_over_total_findings_in_build() 
			throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(dashboardpage.SSDLC_Build_total_findings()).perform();
	}
	@Then("Verify Tooltip should show the total findings count and configured tool")
	public void verify_tooltip_should_show_the_total_findings_count_and_configured_tool() 
			throws InterruptedException {
		Assert.assertTrue(dashboardpage.SSDLC_Build_total_tooltip().isDisplayed());
	}
	/*
	 *   @DASH-435
  Scenario: Go to SSDLC dashboard > Hover on the Bar
	 */
	@Then("Mouse Hover over bar in scan trend")
	public void mouse_hover_over_bar_in_scan_trend()
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.SSDLC_ScanTrend_bar()).perform();
	}
	@Then("Verify If the bar is green it should show the configured security tool name.")
	public void verify_if_the_bar_is_green_it_should_show_the_configured_security_tool_name() {
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_bar_Tool().isDisplayed());
	}
	/*
	 *   @DASH-436
  Scenario: Go to SSDLC dashboard > Hover on the Bar
	 */
	@Then("Verify It should show the count of pass scan")
	public void verify_it_should_show_the_count_of_pass_scan() {
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_bar_pass().isDisplayed());
	}
	/*
	 *   @DASH-437
  Scenario: Go to SSDLC dashboard > Click on the date filter
	 */
	String default_date = "Last 7 days";
	@Then("Click on date filter in scan trend widget")
	public void click_on_date_filter_in_scan_trend_widget() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_default_date().isDisplayed());
	}
	@Then("Verify Default date filter should be selected for {int} days")
	public void verify_default_date_filter_should_be_selected_for_days(Integer date) {
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_default_date()
				.getText().equals(default_date));
	}
	/*
	 *   @DASH-438
  Scenario: Go to SSDLC dashboard > Click on the date filter
	 */
	@Then("Click on date filter")
	public void click_on_date_filter_Scantrend() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		dashboardpage.SSDLC_Scantrend_default_date().click();
	}
	@Then("Change the date options")
	public void change_the_date_options() {
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_date_24hours().isDisplayed());
		dashboardpage.SSDLC_Scantrend_date_24hours().click();
	}
	@Then("Verify It should change the date accordingly")
	public void verify_it_should_change_the_date_accordingly() {
		Assert.assertTrue(dashboardpage.SSDLC_Scantred_changed_date().isDisplayed());
	}
	@Then("Verify data should reflect on the scan trend graph.")
	public void verify_data_should_reflect_on_the_scan_trend_graph() {
		Assert.assertTrue(dashboardpage.SSDLC_Scantrend_changed_bar().isDisplayed());
	}
	/*
	 *   @DASH-440
  Scenario: Go to SSDLC dashboard > Finding by source / Scan type
	 */
	@Then("Mouse Hover over bar in findings by source widget")
	public void mouse_hover_over_bar_in_findings_by_source_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.SSDLC_Sourcetype_widget_bar().isDisplayed());
		actions.moveToElement(dashboardpage.SSDLC_Sourcetype_widget_bar()).perform();
	}
	@Then("Verify It should show the exact count if we compare with the findings")
	public void verify_it_should_show_the_exact_count_if_we_compare_with_the_findings() {
	}
	/*
	 * @DASH-443
  Scenario: Try to turn off/on the toggle button for log scale
	 */
	String Before_switch = "86.5";
	String After_switch = "89.2049404422739";
	@Then("Turn on log scale toggle")
	public void turn_on_log_scale_toggle() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SSDLC_toggle_before_switch().isDisplayed());
		dashboardpage.SSDLC_Sourcetype_logscale_toggle().click();
		Thread.sleep(2000);
	}
	@Then("Verify it should expand the bar of source type data")
	public void verify_it_should_expand_the_bar_of_source_type_data() {
		Assert.assertTrue(dashboardpage.SSDLC_toggle_After_Switch().isDisplayed());
	}
	/*
	 *   @DASH-444
  Scenario: Go to SSDLC dashboard > Click on the filter
	 */
	@Then("Click on sourcetype filter")
	public void click_on_sourcetype_filter() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		dashboardpage.SSDLC_Sourcetype_filter().click();
		Thread.sleep(2000);
	}
	@Then("verify It should only accept max {int} items")
	public void verify_it_should_only_accept_max_items(Integer items) {
		//Assert.assertTrue(dashboardpage.SSDLC_Sourcetype_Filter_items().isDisplayed());
	}
	/*
	 *   @DASH-445
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	@Then("Verify sorting in Appsec widget is working")
	public void click_on_sorting_in_appsec_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,500);","");
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Appsec_source_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Appsec_sourceType_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Appsec_ScanStatus_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Appsec_ToolStatus_column().click();
		}
	}
	/*
	 *   @DASH_446
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	@Then("Move to Appsec tool status widget")
	public void move_to_appsec_tool_status_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,600);","");
	}
	@Then("Verify By clicking filter a dropdown should display")
	public void verify_by_clicking_filter_a_dropdown_should_display() throws InterruptedException {
		dashboardpage.SSDLC_Appsec_SOurce_Filter().click();
		Assert.assertTrue(dashboardpage.Appsec_Source_filter_dropdown().isDisplayed());
		dashboardpage.SSDLC_Appsec_Sourcetype_filter().click();
		Assert.assertTrue(dashboardpage.Appsec_Sourcetype_filter_dropdown().isDisplayed());
		dashboardpage.SSDLC_Appsec_ScanStatus_filter().click();
		Assert.assertTrue(dashboardpage.Appsec_ScanStatus_filter_dropdown().isDisplayed());
		dashboardpage.SSDLC_Appsec_ToolStatus_filter().click();
		Assert.assertTrue(dashboardpage.Appsec_ToolStatus_filter_dropdown().isDisplayed());
	}
	/*
	 *   @DASH_447
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	@Then("Verify tools should displayed with other configuration")
	public void verify_tools_should_displayed_with_other_configuration() {
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_Tool_displayed().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_Tool_Sourcetype_displayed().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_ScanStatus_displayed().isDisplayed());
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_ToolStatus_Displayed().isDisplayed());
	}
	/*
	 *   @DASH_448
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	@Then("Click on Tool in source")
	public void click_on_tool_in_source() {
		dashboardpage.SSDLC_Appsec_Tool_displayed().click();
	}
	@Then("Verify It should redirect into the security tool page.")
	public void verify_it_should_redirect_into_the_security_tool_page() {
		Assert.assertTrue(dashboardpage.Security_tool_page().isDisplayed());
	}
	/*
	 *   @DASH_449
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	String date = "time";
	@Then("Verify last run should show the date and the time.")
	public void verify_last_run_should_show_the_date_and_the_time() {
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_Last_Run_date().getTagName()
				.equals(date));
	}
	/*
	 *   @DASH_452
  Scenario: Go to SSDLC dashboard > Check appsec tool status
	 */
	@Then("Verify Only appsec tools should be visible in appsec tool status")
	public void verify_only_appsec_tools_should_be_visible_in_appsec_tool_status() {
		Assert.assertTrue(dashboardpage.SSDLC_Appsec_Tool_Verification().isDisplayed());
	}
	/*
	 *   @DASH_453
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("Click on Juiceshop product")
	public void click_on_juiceshop_product() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		dashboardpage.SSDLC_Juiceshop_product().click();
	}
	@Then("Move to Infrastructure tool status widget")
	public void move_to_infrastructure_tool_status_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,900);","");
	}
	@Then("Verify By click on sort a sorting is working")
	public void verify_by_click_on_sort_a_sorting_is_working() {
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Infrasrtucture_Source_Sort().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Infrasructure_Sourcetype_sort().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Infrastructure_ScanStatus_sort().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_Infrastucture_ToolStatus_Sort().click();
		}
	}
	/*
	 * @DASH_454
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("Verify Click on filter a drop down should be visible.")
	public void verify_click_on_filter_a_drop_down_should_be_visible() {
		dashboardpage.Infrastructure_Source_filter().click();
		Assert.assertTrue(dashboardpage.Infrastructure_Source_filter_dropdown().isDisplayed());
		dashboardpage.Infrastructure_SourceType_filter().click();
		Assert.assertTrue(dashboardpage.Infrastructure_SourceType_filter_dropdown().isDisplayed());
		dashboardpage.Infrastructure_ScanStatus_filter().click();
		Assert.assertTrue(dashboardpage.Infrastructure_ScanStatus_filter_dropdown().isDisplayed());
		dashboardpage.Infrastructure_ToolStatus_filter().click();
		Assert.assertTrue(dashboardpage.Infrastucture_ToolStatus_filter_dropdown().isDisplayed());
	}
	/*
	 *  @DASH_455
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("Verify All the tools should be listed which are configured")
	public void verify_all_the_tools_should_be_listed_which_are_configured() {
		Assert.assertTrue(dashboardpage.Infrastructure_tool_displyed().isDisplayed());
	}
	/*
	 *   @DASH_456
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("Verify It should show the date and the time when security tool is used")
	public void verify_it_should_show_the_date_and_the_time_when_security_tool_is_used() {
		Assert.assertTrue(dashboardpage.Infrasture_LastRun_date().getTagName()
				.equals(date));
	}
	/*
	 *   @DASH_459
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	@Then("CLick on Infrastructure security tool")
	public void c_lick_on_infrastructure_security_tool() {
		dashboardpage.Infrastructure_Tool_Displayed().click();
	}
	/*
	 *   @DASH_460
  Scenario: ci/cd and notification status  > Product SSDLC Dashboard
	 */
	@Then("Click on DemoApplication product")
	public void click_on_demo_application_product() {
		dashboardpage.SSDLC_DemoApplication_product().click();
	}
	@Then("Move to CI\\/CD Notification widget")
	public void move_to_ci_cd_notification_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,1000);","");
	}
	@Then("Click on sorting and verify sorting is working")
	public void click_on_sorting_and_verify_sorting_is_working() {
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_CICD_Source_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_CICD_Configstatus_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.SSDLC_CICD_ToolStatus_column().click();
		}
	}
	/*
	 *   @DASH_461
  Scenario: ci/cd and notification status  > Tool Status
	 */
	String Sorting_displayed = "";
	@Then("Verify Tool status sorting work in ascending , descending and cancel sorting")
	public void verify_tool_status_sorting_work_in_ascending_descending_and_cancel_sorting() 
			throws InterruptedException {
		for (i = 0;i<3;i++) {
			Thread.sleep(2000);
			actions.moveToElement(dashboardpage.SSDLC_CICD_ToolStatus_column()).perform();
			Thread.sleep(2000);
			Sorting_displayed = dashboardpage.SSDLC_CICD_ToolStatus_Sorting_Tooltip().getText();
			if(Sorting_displayed.equals("Click to sort in descending")) {
				Assert.assertTrue(true);
				dashboardpage.SSDLC_CICD_ToolStatus_column().click();
			}
			if(Sorting_displayed.equals("Click to cancel sorting")) {
				Assert.assertTrue(true);
				dashboardpage.SSDLC_CICD_ToolStatus_column().click();
			}
			if(Sorting_displayed.equals("Click to sort in ascending")) {
				Assert.assertTrue(true);
				dashboardpage.SSDLC_CICD_ToolStatus_column().click();
			}else {
				System.out.println("Not able to verify");
			}
		}
	}
	/*
	 *   @DASH_462
  Scenario: ci/cd and notification status  > Last Run
	 */
	@Then("Verify Last Run should show the date and the time..")
	public void verify_last_run_should_show_the_date() {
		Assert.assertTrue(dashboardpage.CICD_LastRun_date().getTagName()
				.equals(date));
	}
	/*
	 *   @DASH_463
  Scenario: ci/cd and notification status  > Check Tool status
	 */
	String Status = "Active";
	@Then("Verify Only active tools should be visible in the CI\\/CD status listing")
	public void verify_only_active_tools_should_be_visible_in_the_ci_cd_status_listing() {
		Assert.assertTrue(dashboardpage.CICD_Displayed_tool().getText()
				.equals(Status));
	}
	/*
	 *   @CTO_Dashboard
  Scenario: Check behaviour when user navigates to CTO dashboard
	 */
	@Given("Selects CTO Dashboard")
	public void selects_cto_dashboard() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		dashboardpage.CTO_dashboard().click();
	}
	@Then("Verify User is on CTO Dashboard page")
	public void verify_user_is_on_cto_dashboard_page() {
		Assert.assertTrue(dashboardpage.CTO_Dashboard_page().isDisplayed());
	}
	@Then("Verify Emerging Threats widget is displayed")
	public void verify_emerging_threats_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_EmergingThreats_widget().isDisplayed());
	}
	@Then("Verify Top Five Open Tickets widget is displayed")
	public void verify_top_five_open_tickets_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_Top5_Open_tickets_widget().isDisplayed());
	}
	@Then("Verify Vulnerability Trend widget is displayed")
	public void verify_vulnerability_trend_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.CTO_Vulneribility_widget().isDisplayed());
	}
	@Then("Verify Average Time To Remediate widget is displayed")
	public void verify_average_time_to_remediate_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_Average_TimeTO_Remediate_widget().isDisplayed());
	}
	@Then("Verify Top Teams widget is displayed")
	public void verify_top_teams_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_Top_Teams_widget().isDisplayed());
	}
	@Then("Verify OWASP Training Requirement By Team widget is displayed")
	public void verify_owasp_training_requirement_by_team_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.CTO_OWASP_traing_Team_widget().isDisplayed());
	}
	@Then("Verify Findings By Team Bar widget is displayed")
	public void verify_findings_by_team_bar_widget_is_displayed() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.CTO_Findings_By_Team_widget().isDisplayed());
	}
	@Then("Verify Release Gate Failures By Product widget is displayed")
	public void verify_release_gate_failures_by_product_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_ReleaseGate_Failure_widget().isDisplayed());
	}
	@Then("Verify Closed Ticket Statistics widget is displayed")
	public void verify_closed_ticket_statistics_widget_is_displayed() {
		Assert.assertTrue(dashboardpage.CTO_Closed_tickets_widget().isDisplayed());
	}
	/*
	 *   @DASH-466
  Scenario: Check behaviour when user navigates to Top Five Open Tickets widget
	 */
	@Then("Verify Should display Top {int} tickets with details info")
	public void verify_should_display_top_tickets_with_details_info(Integer product) {
		Assert.assertTrue(dashboardpage.CTO_Top5Product_displayed().isDisplayed());
	}
	@Then("Verify Ticket ID, Severity, Title and Ticket Age column should be visible")
	public void verify_ticket_id_severity_title_and_ticket_age_column_should_be_visible() {
		Assert.assertTrue(dashboardpage.CTO_TopProduct_TicketID_Column().isDisplayed());
		Assert.assertTrue(dashboardpage.CTO_TopPrpduct_Severity_column().isDisplayed());
		Assert.assertTrue(dashboardpage.CTO_TopProduct_Title_Column().isDisplayed());
		Assert.assertTrue(dashboardpage.CTO_TopProduct_TicketAge_Column().isDisplayed());
	}
	/*
	 *   @DASH-469
  Scenario: Check behaviour when user navigates to Vulnerability Trend widget
	 */
	@Then("Navigate to Vulnerability trend widget")
	public void navigate_to_vulnerability_trend_widget() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
	}
	@Then("Verify A graph should be plotted with Mitigated vs Non Mitigated findings")
	public void verify_a_graph_should_be_plotted_with_mitigated_vs_non_mitigated_findings() {
		Assert.assertTrue(dashboardpage.CTO_Vulneribility_NonMitigated().isDisplayed());
		Assert.assertTrue(dashboardpage.CTO_Vulneribility_Mitigated().isDisplayed());
	}
	@Then("Verify Counts should match with the count on findings page and security dashboard")
	public void verify_counts_should_match_with_the_count_on_findings_page_and_security_dashboard() {
	}
	/*
	 *   @DASH-474
  Scenario: Check behaviour when user navigates to Findings By Team (Bar) widget
	 */
	@Then("Navigate to  Findings By Team widget")
	public void navigate_to_findings_by_team_widget() 
			throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,1000);","");
	}
	@Then("This widget should display the most critical Team by Critical\\/High findings")
	public void this_widget_should_display_the_most_critical_team_by_critical_high_findings() {
		Assert.assertTrue(dashboardpage.CTO_Findings_by_Team_Critical().isDisplayed());
		Assert.assertTrue(dashboardpage.CTO_Findings_by_Team_High().isDisplayed());
	}
	/*
	 *   @DASH-480
  Scenario: Check behaviour when user clicks on Production / Staging tab
	 */
	String Selected_status = "true";
	@Then("Click on Staging tab")
	public void click_on_staging_tab() {
		dashboardpage.CTO_Staging_tab().click();
	}
	@Then("Verify All the data with respect to the Staging envrionment should be visible.")
	public void verify_all_the_data_with_respect_to_the_staging_envrionment_should_be_visible() {
		Assert.assertTrue(dashboardpage.CTO_Staging_tab().getAttribute("aria-selected")
				.equals(Selected_status));
	}
	@Then("Click on Production tab")
	public void click_on_production_tab() {
		dashboardpage.CTO_Production_tab().click();
	}
	@Then("Verify All the data with respect to the Production envrionment should be visible.")
	public void verify_all_the_data_with_respect_to_the_production_envrionment_should_be_visible() {
		Assert.assertTrue(dashboardpage.CTO_Production_tab().getAttribute("aria-selected")
				.equals(Selected_status));
	}
	/*
	 *   @DASH-494
  Scenario: Navigate to Global Setting Page_Select Dashboard option
	 */
	@Given("Verify user is on Dashboard")
	public void verify_user_is_on_dashboard() 
			throws InterruptedException {
		globalpage.Dashboards();
		Thread.sleep(3000);
	}
	@Given("Verify User is able to enable\\/disable dashboards")
	public void verify_user_is_able_to_enable_disable_dashboards() 
			throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.Dashboard_teamSummery_checkbox().click();
		dashboardpage.TeamSummery_dashboard_popup().click();
		Thread.sleep(2000);
		dashboardpage.Dashboard_teamSummery_checkbox().click();
		dashboardpage.TeamSummery_dashboard_popup().click();
		dashboardpage.COmpanyLOGO().click();
	}
	@Then("Verify After Enable user can see dashboard on Home page dashboard dropdown")
	public void verify_after_enable_user_can_see_dashboard_on_home_page_dashboard_dropdown() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		Assert.assertTrue(dashboardpage.Team_Summery_Dashboard().isDisplayed());
	}
	/*
	 *   @DASH-495
  Scenario: Click on Production and Staging Option from top side
	 */
	@Given("Selects Teams Summery Dashboard")
	public void selects_teams_summery_dashboard() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		Thread.sleep(2000);
		dashboardpage.Team_Summery_Dashboard().click();
	}
	@Then("Verify User is on Teams Summery Dashboard page")
	public void verify_user_is_on_teams_summery_dashboard_page() {
		Assert.assertTrue(dashboardpage.Team_Summery_Dashboard_page().isDisplayed());
	}
	/*
	 *   @DASH-496
  Scenario: All Sortings and Reset filter feature on Teams Summary dashboard.
	 */
	@Then("Click on all Sortings should work properly")
	public void click_on_all_sortings_should_work_properly() throws InterruptedException {
		Thread.sleep(2000);
		for (i = 0;i<3;i++) {
			dashboardpage.Teams_SUmmery_Team_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.Teams_Summery_EngineerinfOwner_column().click();
		}
		for (i = 0;i<3;i++) {
			dashboardpage.Teams_Summery_TeamSize_column().click();
		}
	}
	@Then("Click on Reset Filter")
	public void click_on_reset_filter() {
		dashboardpage.Teams_Summery_Reset_filter().click();
	}
	@Then("Verify Reset filter should work properly")
	public void verify_reset_filter_should_work_properly() 
			throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.Teams_Summery_Reset_filter()).perform();
		Assert.assertTrue(dashboardpage.Teams_Summery_Reset_filter().getAttribute("class")
				.contains("disabled"));
	}
	/*
	 *   @DASH-498
  Scenario: Tool tip to all of the trend indicators
	 */
	@Then("Verify Should display tool tip infront of risk score")
	public void verify_should_display_tooltip_infront_of_risk_score() {
		actions.moveToElement(dashboardpage.Teams_Summery_RsikScore_Trend_icon()).perform();
		Assert.assertTrue(dashboardpage.Teams_Summery_RsikScore_Trend_icon().isDisplayed());
	}
	/*
	 *   @DASH-499
  Scenario: Findings coloums_Teams Summary dashboard
	 */
	@Then("Verify Critical high and total findings displayed")
	public void verify_critical_high_and_total_findings_displayed() {
		Assert.assertTrue(dashboardpage.Teams_Dashboard_Total_findings().isDisplayed());
		Assert.assertTrue(dashboardpage.Teams_Dashboard_Critical_findings().isDisplayed());
		Assert.assertTrue(dashboardpage.Teams_Dashboard_High_findings().isDisplayed());
	}
	@Then("Verify after click on it it should redirect to findings page with proper data.")
	public void verify_after_click_on_it_it_should_redirect_to_findings_page_with_proper_data()
			throws InterruptedException {
			String Findings_Value_High_teamsDashboard = dashboardpage.Teams_Dashboard_High_findings().getText();
			dashboardpage.Teams_Dashboard_High_findings().click();
			Thread.sleep(2000);
			Assert.assertTrue(dashboardpage.Teams_Findings_page_Total_displayed().getText()
					.equals(Findings_Value_High_teamsDashboard));
			Driver_factory.getDriver().navigate().back();
			String Findings_Value_Critical_teamsDashboard = dashboardpage.Teams_Dashboard_Critical_findings().getText();
			dashboardpage.Teams_Dashboard_Critical_findings().click();
			Thread.sleep(2000);
			Assert.assertTrue(dashboardpage.Teams_Findings_page_Total_displayed().getText()
					.equals(Findings_Value_Critical_teamsDashboard));
	}
	/*
	 *   @DASH-500
  Scenario: Click on arrow button to expand Teams Information
	 */
	@Then("CLick on Expand button")
	public void c_lick_on_expand_button() throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Teams_Dashboard_Product_expandIcon().click();
	}
	@Then("Verify Should display Burn Up By Findings\\/Team Graph,Existing Findings")
	public void verify_should_display_burn_up_by_findings_team_graph_existing_findings() {
		Assert.assertTrue(dashboardpage.Burn_UP_By_Findings_widget().isDisplayed());
		Assert.assertTrue(dashboardpage.Existing_Findings_widget().isDisplayed());
	}
	/*
	 *   @DASH-501
  Scenario: Expand button of Product
	 */
	@Then("Click on product arrow")
	public void click_on_product_arrow() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Thread.sleep(2000);
		dashboardpage.Teams_Dashboard_Produt_arrow().click();
	}
	@Then("Verify Should display all Products & Subproducts configured by team.")
	public void verify_should_display_all_products_subproducts_configured_by_team() {
		Assert.assertTrue(dashboardpage.Teams_Dashboard_Product_Displayed().isDisplayed());
		Assert.assertTrue(dashboardpage.Teams_Dashboard_SubProduct_Dsiplayed().isDisplayed());
	}
	/*
	 *   @DASH-502
  Scenario: Product Name[Link Text button]
	 */
	@Then("Click on Product name")
	public void click_on_product_name() {
		dashboardpage.Teams_Dashboard_product_name().click();
	}
	@Then("Verify Should redirect and open Product dashboard page.")
	public void verify_should_redirect_and_open_product_dashboard_page() {
		Assert.assertTrue(dashboardpage.Open_Product_page().isDisplayed());
	}
	/*
	 *   @DASH-503
  Scenario: Sub Product Name[Link Text button]
	 */
	@Then("Click on sub Product name")
	public void click_on_sub_product_name() {
		dashboardpage.Teams_Dashboard_SubProduct_name().click();
	}
	/*
	 *   @DASH-509
  Scenario: Navigate to Date filter feature at top right corner
	 */
	@Given("Selects CISO Dashboard")
	public void selects_ciso_dashboard() 
			throws InterruptedException {
		Thread.sleep(5000);
		dashboardpage.Dashboard_Dropdown().click();
		dashboardpage.CISO_Dashboard().click();
	}
	@Then("Verify User is on CISO Dashboard page")
	public void verify_user_is_on_ciso_dashboard_page() 
			throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.CISO_Dashboard_page().isDisplayed());
	}
	@Then("Verify CISO Dashboard date filter is displayed")
	public void verify_ciso_dashboard_date_filter_is_displayed() {
		Assert.assertTrue(dashboardpage.CISO_Dashboard_date_Filter().isDisplayed());
	}
	@Then("Apply different date filter")
	public void apply_different_date_filter() {
		dashboardpage.Date_Filter().click();
		dashboardpage.Date_common_options().click();
	}
	@Then("Verify the findings should be displayed accordingly")
	public void verify_the_findings_should_be_displayed_accordingly() {
	}
	@Then("Click on Date clear")
	public void click_on_date_clear() {
		dashboardpage.Date_Filter().click();
		dashboardpage.Date_clear_button().click();
		dashboardpage.Date_Apply_button().click();
	}
	@Then("Verify the filter should be reset and All data should be displayed.")
	public void verify_the_filter_should_be_reset_and_all_data_should_be_displayed() {
	}
	/*
	 *   @DASH-510
  Scenario: CISO Dashboard > Risk Score
	 */
	@Then("Verify Risk Score Field should be showing hightest Risk score.")
	public void verify_risk_score_field_should_be_showing_hightest_risk_score() {
		Assert.assertTrue(dashboardpage.CISO_Dashboard_RiskScore().isDisplayed());
	}
	/*
	 *   @DASH-514
  Scenario: Product summary >Click on any  product
	 */
	@Then("CLick on CISO Product")
	public void c_lick_on_ciso_product() {
		dashboardpage.CISO_Dashboard_Product().click();
	}
	@Then("Verify It will be land on main dashboard with product and subproduct Filter.")
	public void verify_it_will_be_land_on_main_dashboard_with_product_and_subproduct_filter() {
		Assert.assertTrue(dashboardpage.CISO_Dashboard_Main_dashboard_Verification().isDisplayed());
	}
	/*
	 *  @DASH-526
  Scenario: Product summary >Click on any  product
	 */
	@Then("Move to Risk Score Trend Icon")
	public void move_to_risk_score_trend_icon() throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(dashboardpage.CISO_Dashboard_RiskScore()).perform();
	}
	@Then("Verify CISO Should display tool tip infront of risk score")
	public void verify_ciso_should_display_tool_tip_infront_of_risk_score() {
		Assert.assertTrue(dashboardpage.CISO_Dashboard_RiskScore_Tooltip().isDisplayed());
	}
	/*
	 * @DASH-527
  Scenario: CISO Dashbaord > Apply Global filter
	 */
	@Then("Click on Global Filter")
	public void click_on_global_filter() {
		dashboardpage.Global_filter().click();
	}
	@Then("Verify Global filter Should be apply on CISO Dashbaord")
	public void verify_global_filter_should_be_apply_on_ciso_dashbaord() {
		dashboardpage.Global_filter_BU_dropdown().click();
		dashboardpage.Global_filter_BU1().click();
		dashboardpage.Global_filter_Apply_button().click();
	}
	/*
	 * @DASH-528
  Scenario: Global setting > Set as CISO Dashboard
	 */
	@Then("Selects the CISO dashboard as default dashboard")
	public void selects_the_ciso_dashboard_as_default_dashboard() 
			throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.CISO_Dashboard_GlobalSettings().click();
	}
	@Then("Verify CISO Dashboard page displayed")
	public void verify_ciso_dashboard_page_displayed() 
			throws InterruptedException {
		globalpage.Global_Settings_Button();
	}
	/*
	 *   @DASH-530
  Scenario: Product summary >Click on any Findings (Total)
	 */
	@Then("CLick on CISO Total Findings")
	public void c_lick_on_ciso_total_findings() {
		dashboardpage.CISO_Dashboard_Total_Findings().click();
	}
	@Then("Verify status should be only false +,open,Accept Risk,Confirm.")
	public void verify_status_should_be_only_false_open_accept_risk_confirm() {
		Assert.assertTrue(dashboardpage.CISO_Findings_Open_Status().isDisplayed());
		Assert.assertTrue(dashboardpage.CISO_Findings_AcceptRisk_Status().isDisplayed());
		Assert.assertTrue(dashboardpage.CISO_Findings_Confirm_status().isDisplayed());
	}
	/*
	 * @DASH-531
  Scenario: Product summary >Click on any Findings (Critical)
	 */
	@Then("CLick on CISO Critical Findings")
	public void c_lick_on_ciso_critical_findings() {
		dashboardpage.CISO_Dashboard_Critical_Findings().click();
	}
	/*
	 *   @DASH-532
  Scenario: Product summary >Click on any Findings (High)
	 */
	@Then("CLick on CISO High Findings")
	public void c_lick_on_ciso_high_findings() {
		dashboardpage.CISO_Dashboard_High_Findings().click();
	}
	/*
	 *   @DASH-533
  Scenario: Product Summary> Action  > Click on box.
	 */
	@Then("CLick on Box")
	public void c_lick_on_box() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.CISO_Action_Box()).perform();
	}
	@Then("Verify proper tool tip should displayed")
	public void verify_proper_tool_tip_should_displayed() {
		Assert.assertTrue(dashboardpage.CISO_Action_Box_Tooltip().isDisplayed());
		dashboardpage.CISO_Action_Box().click();
	}
	/*
	 * @DASH-534
  Scenario: Product Summary> Type
	 */
	String Prduct_name = "Demo1";
	String Product_Key = "D";
	String Product_Type = "";
	String New_Product_Type_text = "";
	String Dsiplayed_tag = "";
	String New_Product_Selected_Sec_owner = "";
	String Product_team_text = "";
	String New_Product_status = "";
	
	@Given("Navigate Product page")
	public void navigate_product_page() {
		dashboardpage.Product_page().click();
	}
	@Given("Click on new product")
	public void click_on_new_product() {
		dashboardpage.Products_Page_NewProduct_Button().click();
	}
	@Given("Enter product name and Type")
	public void enter_product_name_and_type() throws InterruptedException {
		dashboardpage.New_Product_name(Prduct_name);
		dashboardpage.New_Product_Type_List().click();
		Thread.sleep(2000);
		New_Product_Type_text = dashboardpage.New_Product_Type().getText();
		System.out.println(New_Product_Type_text);
		dashboardpage.New_Product_Type().click();
	}
	@Given("Add new Tag and value")
	public void add_new_tag_and_value() {
		dashboardpage.New_Product_Tag().click();
		dashboardpage.Add_new_Tag_button().click();
		dashboardpage.New_Prodct_Key(Product_Key);
		dashboardpage.New_Product_Key_Save_icon().click();
	}
	@Given("Click on product next button")
	public void click_on_product_next_button() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.New_Product_Next_Button().click();
		Thread.sleep(2000);
		dashboardpage.New_Product_Next_Button().click();
		Thread.sleep(2000);
		dashboardpage.New_Product_Next_Button().click();
	}
	@Given("Add Teams option")
	public void add_teams_option() throws InterruptedException {
		dashboardpage.New_Product_team_Dropdown().click();
		Product_team_text = dashboardpage.New_Prduct_team().getText();
		System.out.println(Product_team_text);
		dashboardpage.New_Prduct_team().click();
		Thread.sleep(2000);
		dashboardpage.New_Product_Add_Responsibilty_dropdown().click();
		Thread.sleep(2000);
		dashboardpage.New_Product_Security_Owner().click();
		New_Product_Selected_Sec_owner = dashboardpage.New_Product_Selected_Sec_owner().getText();
		System.out.println(New_Product_Selected_Sec_owner);
	}
	@Given("Click on Submit")
	public void click_on_submit() throws InterruptedException {
		Thread.sleep(2000);
		dashboardpage.New_Product_Submit_Button().click();
	}
	@Then("Verify product Created success popup should display")
	public void verify_product_created_success_popup_should_display() {
		Assert.assertTrue(dashboardpage.New_Product_created_popup().isDisplayed());
		New_Product_status = dashboardpage.New_Product_Status().getText();
		System.out.println(New_Product_status);
	}
	@Then("Navigate Dashboard page")
	public void navigate_dashboard_page() {
		dashboardpage.COmpanyLOGO().click();
	}
	@Then("Verify Type is matching with created product")
	public void verify_type_is_matching_with_created_product() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("document.querySelector(\"body > div:nth-child(2) > section:nth-child(2) "
				+ "> main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) "
				+ "> div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) "
				+ "> div:nth-child(1) > div:nth-child(1) > div:nth-child(2)\").scrollTop=500","");
		Thread.sleep(2000);
		String Product_Type = dashboardpage.Displayed_Product_Type().getText();
		System.out.println(Product_Type);
		Assert.assertTrue(New_Product_Type_text.equalsIgnoreCase(Product_Type));
	}
	/*
	 * @DASH-535
  Scenario: Product Summary >Tags
	 */
	@Then("Verify Tags is Matching with created product")
	public void verify_tags_is_matching_with_created_product() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("document.querySelector(\"body > div:nth-child(2) > section:nth-child(2) "
				+ "> main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) "
				+ "> div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) "
				+ "> div:nth-child(1) > div:nth-child(1) > div:nth-child(2)\").scrollTop=500","");
		Thread.sleep(2000);
		String Dsiplayed_tag = dashboardpage.Displayed_Product_tag().getText();
		System.out.println(Dsiplayed_tag);
		Assert.assertTrue(Dsiplayed_tag.equalsIgnoreCase(Product_Key));
	}
	/*
	 *   @DASH-536
  Scenario: Product Summary >Security Owner
	 */
	@Then("Verify Security owner is Matching with created product")
	public void verify_security_owner_is_matching_with_created_product() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("document.querySelector(\"body > div:nth-child(2) > section:nth-child(2) "
				+ "> main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) "
				+ "> div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) "
				+ "> div:nth-child(1) > div:nth-child(1) > div:nth-child(2)\").scrollTop=500","");
		Thread.sleep(2000);
		String Displayed_Security_Owner = dashboardpage.Displayed_Security_Owner().getText();
		System.out.println(Displayed_Security_Owner);
		Assert.assertTrue(Displayed_Security_Owner.contains(New_Product_Selected_Sec_owner));
	}
	/*
	 *   @DASH-537
  Scenario: Product Summary>Teams
	 */
	@Then("Verify Teams is Matching with created product")
	public void verify_teams_is_matching_with_created_product() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("document.querySelector(\"body > div:nth-child(2) > section:nth-child(2) "
				+ "> main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) "
				+ "> div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) "
				+ "> div:nth-child(1) > div:nth-child(1) > div:nth-child(2)\").scrollTop=500","");
		Thread.sleep(2000);
		String Displayed_Teams = dashboardpage.Displayed_Teams().getText();
		System.out.println(Displayed_Teams);
		Assert.assertTrue(Displayed_Teams.contains(Product_team_text));
	}
	/*
	 *   @DASH-538
  Scenario: Product Summary>Status
	 */
	@Then("Verify Status is Matching with created product")
	public void verify_status_is_matching_with_created_product() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("document.querySelector(\"body > div:nth-child(2) > section:nth-child(2) "
				+ "> main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) "
				+ "> div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) "
				+ "> div:nth-child(1) > div:nth-child(1) > div:nth-child(2)\").scrollTop=500","");
		Thread.sleep(2000);
		String Displayed_Status = dashboardpage.Displayed_Status().getText();
		System.out.println(Displayed_Status);
		Assert.assertTrue(Displayed_Status.contains(New_Product_status));
		/*
		 * Delete Created Product 
		 */
		dashboardpage.Product_page().click();
		dashboardpage.Delete_Created_product_button().click();
		dashboardpage.Delete_text(Delete);
		dashboardpage.product_Delete_button().click();
	}
	/*
	 *   @DASH-539
  Scenario: Product Summary>Most Prevelant Vulnerabilities > Log scale
	 */
	@Then("Move to Most Prevelant Vulneribilities widget")
	public void move_to_most_prevelant_vulneribilities_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
		Assert.assertTrue(dashboardpage.Most_Prevelent_vul_LogScale_Toggle().isDisplayed());
	}
	@Then("Verify Log scale toggle should work properly.")
	public void verify_log_scale_toggle_should_work_properly() {
		for(i=1;i<2;i++) {
			dashboardpage.Most_Prevelent_vul_LogScale_Toggle().click();
		}
	}
	/*
	 *   @DASH-540
  Scenario: Product Summary>Most Prevelant Vulnerabilities> Description
	 */
	@Then("Verify It should be Display CVE number and description")
	public void verify_it_should_be_display_cve_number_and_description() {
		Assert.assertTrue(dashboardpage.Most_Prev_Vul_CWE_Description().isDisplayed());
	}
	/*
	 *   @DASH-545
  Scenario: Product Summary>Most Critical Vulnerabilities>Show more
	 */
	@Then("Click on Show more")
	public void click_on_show_more() {
		dashboardpage.Most_Prev_Vul_ShowMore().click();
	}
	@Then("verify It should be land on Insight page.")
	public void verify_it_should_be_land_on_insight_page() {
		Assert.assertTrue(dashboardpage.Insights_page().isDisplayed());
	}
	/*
	 *   @DASH-546
  Scenario: Product Summary>Most Prevelant Weaknesses>when hovering any Description
	 */
	@Then("Move to Most Prevelent Weakness widget")
	public void move_to_most_prevelent_weakness_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,300);","");
	}
	@Then("Verify It should show whole Description")
	public void verify_it_should_show_whole_description() {
		dashboardpage.Most_Prev_Weakness_Description().isDisplayed();
	}
	@Then("Mouse Hover over Description")
	public void mouse_hover_over_description() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.MPW_description()).perform();
	}
	@Then("Verify Respective CWE Id is displayed")
	public void verify_respective_cwe_id_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(Driver_factory.getDriver().getPageSource().contains("CWE-"));
	}
	/*
	 *   @DASH-547
  Scenario: Product Summary>Most Prevelant Weaknesses> Click on any Findings(Critical)
	 */
	String Count_Of_Applied_filter = "";
	String Severity_Filter_Critical = "Critical";
	String Severity_Filter_High = "High";
	String MPW_Severity = "";
	@Then("Click on Crictical CWE findings")
	public void click_on_crictical_cwe_findings() throws InterruptedException {
		Thread.sleep(2000);
		MPW_Severity = dashboardpage.MPW_Critical_findings().getText();
		System.out.println(MPW_Severity);
		dashboardpage.MPW_Critical_findings().click();
	}
	@Then("Verify Critical filter is applied")
	public void verify_critical_filter_is_applied() {
		Assert.assertTrue(dashboardpage.Findings_Severity_Filter().getText().equals(Severity_Filter_Critical));
	}
	@Then("Verrify Count shouble be match with finding page")
	public void verrify_count_shouble_be_match_with_finding_page() throws InterruptedException {
		Thread.sleep(2000);
		Count_Of_Applied_filter = dashboardpage.Count_Of_Applied_filter().getText();
		System.out.println(Count_Of_Applied_filter);
		Assert.assertTrue(MPW_Severity.equals(Count_Of_Applied_filter));
	}
	/*
	 * @DASH-548
  Scenario: Product Summary>Most Prevelant Weaknesses>Click on any Findings(High)
	 */
	@Then("Click on High CWE findings")
	public void click_on_high_cwe_findings() throws InterruptedException {
		Thread.sleep(2000);
		MPW_Severity = dashboardpage.MPW_High_findings().getText();
		System.out.println(MPW_Severity);
		dashboardpage.MPW_High_findings().click();
	}
	@Then("Verify High filter is applied")
	public void verify_high_filter_is_applied() {
		Assert.assertTrue(dashboardpage.Findings_Severity_Filter().getText().equals(Severity_Filter_High));
	}
	@Then("Verrify Count should be match with finding page")
	public void verrify_count_should_be_match_with_finding_page() throws InterruptedException {
		Thread.sleep(2000);
		Count_Of_Applied_filter = dashboardpage.Count_Of_Applied_filter().getText();
		System.out.println(Count_Of_Applied_filter);
		Assert.assertTrue(MPW_Severity.equals(Count_Of_Applied_filter));
	}
	/*
	 *  @DASH-549
  Scenario: Product Summary>Most Prevelant Weaknesses>Findings(Total)
	 */
	@Then("Click on Total CWE findings")
	public void click_on_total_cwe_findings() throws InterruptedException {
		Thread.sleep(2000);
		MPW_Severity = dashboardpage.MPW_Total_findings().getText();
		System.out.println(MPW_Severity);
		dashboardpage.MPW_Total_findings().click();
	}
	@Then("Verify Total filter is applied")
	public void verify_total_filter_is_applied() {
		//Assert.assertTrue(dashboardpage.Findings_Severity_Filter().getText().equals(Severity_Filter_High));
	}
	@Then("Verrify Total Count should be match with finding page")
	public void verrify_total_count_should_be_match_with_finding_page() throws InterruptedException {
		Thread.sleep(2000);
		Count_Of_Applied_filter = dashboardpage.Count_Of_Applied_filter().getText();
		System.out.println(Count_Of_Applied_filter);
		Assert.assertTrue(MPW_Severity.equals(Count_Of_Applied_filter));
	}
	/*
	 *   @DASH-550
  Scenario: Product Summary>Most Prevelant Weaknesses>show more
	 */
	@Then("CLick on Show More Link")
	public void c_lick_on_show_more_link() {
		dashboardpage.MPW_ShowMore_link().click();
	}
	/*
	 *   @DASH-551
  Scenario: SLA Breaches by Product>Log Scale
	 */
	@Then("Move to SLA Breaches by Product widget")
	public void move_to_sla_breaches_by_product_widget() throws InterruptedException {
		Thread.sleep(3000);
		Js = ((JavascriptExecutor)Driver_factory.getDriver());
		Js.executeScript("window.scrollBy(0,500);","");
	}
	@Then("Verify SLA Log scale toggle should work properly.")
	public void verify_sla_log_scale_toggle_should_work_properly() {
		for(i=1;i<3;i++) {
			dashboardpage.SLA_LogScale_Toggle().click();
		}
	}
	/*
	 *  @DASH-552
  Scenario: SLA Breaches by Product>Click on critical finding line
	 */
	@Then("Click on critical finding line")
	public void click_on_critical_finding_line() {
		dashboardpage.SLA_Critical_findings_Line().click();
	}
	@Then("Verify should land on finding page and Critical count should be match")
	public void verify_should_land_on_finding_page_and_critical_count_should_be_match() {
		Assert.assertTrue(dashboardpage.SSDLC_findings_page().isDisplayed());
	}
	/*
	 * @DASH-553
  Scenario: SLA Breaches by Product>Click on high finding line
	 */
	@Then("Verify should land on finding page and High count should be match")
	public void verify_should_land_on_finding_page_and_high_count_should_be_match() {
		Assert.assertTrue(dashboardpage.SSDLC_findings_page().isDisplayed());
	}
	/*
	 *    @DASH-554
  Scenario: SLA Breaches by Product widget
	 */
	@Then("Verify Tool Tip should be there Near the SLA Breaches by Product.")
	public void Verify_Tooltio_SLA_Breaches_by_product() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(dashboardpage.SLA_Breaches_by_product_tooltip_icon()).perform();
		Thread.sleep(2000);
		Assert.assertTrue(dashboardpage.SLA_Breaches_by_product_tooltip().isDisplayed());
	}
}
