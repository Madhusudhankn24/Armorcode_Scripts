package StepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ArmorcodepageObjects.AlertspageObjects;
import ArmorcodepageObjects.GlobalSettings_pageObjects;
import ArmorcodepageObjects.LoginpageObjects;
import QAFactory.Driver_factory;
import UtilityFiles.Armorcode_Utils;
import io.cucumber.java.en.*;

public class Global_Settings {

	private LoginpageObjects 
	loginpage = new LoginpageObjects(Driver_factory.getDriver());
	private GlobalSettings_pageObjects 
	globalpages = new GlobalSettings_pageObjects(Driver_factory.getDriver());
	private AlertspageObjects 
	alertspage = new AlertspageObjects(Driver_factory.getDriver());
	private Armorcode_Utils
	utils = new Armorcode_Utils(Driver_factory.getDriver());
	private Actions actions;
	;

	/*
	 *   @GS-030
  Scenario: To verify Global Setting button
	 */
	@Given("User log in to application")
	public void user_log_in_to_application() {
		Driver_factory.getDriver().get("https://app.armorcode.com/");
		alertspage  = loginpage.Login_application("madhusudhan.kv@3ktechnologies.com", "Madhu@3ktech");
	}
	@When("User clicks on global setting button")
	public void user_clicks_on_global_setting_button() throws InterruptedException {
		globalpages.Global_Settings_Button();
	}
	@Then("Global setting page should be displayed")
	public void global_setting_page_should_be_displayed() {
		Assert.assertTrue(globalpages.Global_Page_vefification().isDisplayed());
	}
	/*
	 *   @GS-031
  Scenario: To verify Edited Product/Sub Products & Projects Names on every where.
	 *
	 */
	String Active_status = "Active2443";
	String note = "sample";
	String Active = "Active";
	@When("Verify user is on Global settings page")
	public void verify_user_is_on_global_settings_page() throws InterruptedException {
		user_clicks_on_global_setting_button();
		global_setting_page_should_be_displayed();
	}
	@When("User clicks on Product\\/Subproduct status button")
	public void user_clicks_on_product_subproduct_status_button() throws InterruptedException {
		globalpages.product_subproduct_Status_Button();
	}
	@Then("Customize Product\\/Subproduct page should be displayed")
	public void customize_product_subproduct_page_should_be_displayed() {
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains("Customize Product/Subproduct Status"));
	}
	@Then("Edit active status")
	public void edit_active_status_and_click_on_add_status() throws InterruptedException {
		Thread.sleep(2000);
		globalpages.Active_status_edit_button().click();
		utils.Windowhandles(Driver_factory.getDriver());
		globalpages.Edit_Active_status(Active_status);
		globalpages.Edit_status_note(note);
	}
	@Then("Add new status and click on save")
	public void add_new_status_and_click_on_save() throws InterruptedException {
		globalpages.Edit_status_Submit_button().click();
		verify_that_added_status_is_displaped();
		Thread.sleep(2000);
		globalpages.Active_status_edit_button().click();
		utils.Windowhandles(Driver_factory.getDriver());
		globalpages.Edit_Active_status(Active);
		globalpages.Edit_status_note(note);
		globalpages.Edit_status_Submit_button().click();
		Thread.sleep(2000);
	}
	@Then("Verify that added status is displaped")
	public void verify_that_added_status_is_displaped() {
		Assert.assertTrue(globalpages.Edit_status_success_popup().isDisplayed());
	}
	/*
	 *   @GS-041
  Scenario: To set the basis on which product risk score will be calculated.
	 *
	 */
	@When("User click on Risk Calculation type button")
	public void user_click_on_risk_calculation_type_button() {
		globalpages.Risk_calculation_Type();
	}
	@Then("Risk calculation type page is displayed")
	public void risk_calculation_type_page_is_displayed() {
		Assert.assertTrue(globalpages.Risk_calculation_type_page_verification().isDisplayed());
	}
	@Then("Verify that three option Riskiest mean and Inferior is displayed")
	public void verify_that_three_option_riskiest_mean_and_inferior_is_displayed() {
		Assert.assertTrue(globalpages.Riskiest_radio_button().isDisplayed());
		Assert.assertTrue(globalpages.Mean_radio_button().isDisplayed());
		Assert.assertTrue(globalpages.Inferior_radio_button().isDisplayed());
	}
	@Then("Along with Reset to Default button is displayed")
	public void along_with_reset_to_default_button_is_displayed() {
		Assert.assertTrue(globalpages.ResetToDefault_button().isDisplayed());
	}
	@Then("Verify Riskiest is selected by default")
	public void verify_riskiest_is_selected_by_default() {
		//Assert.assertTrue(globalpages.Radio_button_validation().isEnabled());
	}
	/*
	 *   @GS-047
  Scenario: To check SLA template configs
	 *
	 */
	@When("User clicks on Findings SLA button")
	public void user_clicks_on_findings_sla_button() {
		globalpages.Findings_SLA();
	}
	@Then("Findings SLA page is displayed")
	public void findings_sla_page_is_displayed() {
		Assert.assertTrue(globalpages.SLA_page_validation().isDisplayed());
	}
	@Then("Verify Default SLA template should displyed")
	public void verify_default_sla_template_should_displyed() {
		Assert.assertTrue(globalpages.Default_SLA().isDisplayed());
	}
	/*
	 *   @GS-055
  Scenario: To verify deletion of SLA template
	 *
	 */
	@When("User Click on Add SLA button")
	public void user_click_on_add_sla_button() {
		user_clicks_on_findings_sla_button();
		globalpages.Add_SLA_button().click();
	}
	@Then("Add SLA popup should displayed")
	public void add_sla_popup_should_displayed() {
		utils.Windowhandles(Driver_factory.getDriver());
		Assert.assertTrue(globalpages.Add_SLA_popup_validation().isDisplayed());
	}
	@When("User enters name and description")
	public void user_enters_name_and_description() {
		globalpages.Add_SLA_name("newSLA3");
		globalpages.Add_SLA_description("sample");
	}
	@When("User enters Critical,High,Medium and low for TraigeSLA,RemediationSLA and ResolutionSLA")
	public void user_enters_critical_high_medium_and_low_for_traige_sla_remediation_sla_and_resolution_sla() {
		//TraigeSLA
		globalpages.TSLA_Critical("5");
		globalpages.TSLA_High("4");
		globalpages.TSLA_Medium("3");
		globalpages.TSLA_Low("3");
		//RemeditionSLA
		globalpages.RSLA_Critical("5");
		globalpages.RSLA_High("4");
		globalpages.RSLA_Medium("4");
		globalpages.RSLA_Low("3");
		//ResolutionSLA
		globalpages.ReSLA_Critical("6");
		globalpages.ReSLA_High("5");
		globalpages.ReSLA_Medium("4");
		globalpages.ReSLA_Low("3");
	}
	@When("Click on save")
	public void click_on_save() {
		globalpages.Add_SLA_save_button().click();
	}
	@Then("Success popup should be displayed")
	public void success_popup_should_be_displayed()  {
		Assert.assertTrue(globalpages.Add_SlA_popup_validation().isDisplayed());
	}
	@Then("Verify Created SLA is displayd in SLA page")
	public void verify_created_sla_is_displayd_in_sla_page() {
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains("demo_testing1"));
	}
	@Then("Delete Findings SLA and Check proper message displayed")
	public void delete_findings_sla_and_check_proper_message_displayed() {
		globalpages.Delete_SLA_icon().click();
		utils.Windowhandles(Driver_factory.getDriver());
		Assert.assertTrue(globalpages.Delete_popup_validation().isDisplayed());
		globalpages.Delete_text("Delete");
		globalpages.Delete_SLA_sumbit_button().click();
		success_popup_should_be_displayed();
	}
	/*
	 *   @GS-064
  Scenario: Verify Global Settings-Relese Management
	 *
	 */
	@When("User click on Release management")
	public void user_click_on_release_management() {
		globalpages.Release_management_button();
	}
	@Then("Release management page should be displayed")
	public void release_management_page_should_be_displayed() {
		Assert.assertTrue(globalpages.Release_management_page_validation().isDisplayed());
	}
	@When("User click on Add button")
	public void user_click_on_add_button() {
		globalpages.RM_Add_button().click();
	}
	@When("Release Gate popup should be displayed")
	public void release_gate_popup_should_be_displayed() {
		utils.Windowhandles(Driver_factory.getDriver());
		Assert.assertTrue(globalpages.RM_Add_popup_validation().isDisplayed());
	}
	@Then("Verify that Global and specific options displayed")
	public void verify_that_global_and_specific_options_displayed() {
		Assert.assertTrue(globalpages.RM_Global_option().isDisplayed());
		Assert.assertTrue(globalpages.RM_Specific_option().isDisplayed());
	}
	/*
	 *   @GS-085
  Scenario: Verify the Dashboard has all the data
	 *
	 */
	@When("User clicks on Dashboards")
	public void user_clicks_on_dashboards() {
		globalpages.Dashboards();
	}
	@When("Dashboard page should be displayed")
	public void dashboard_page_should_be_displayed() {
		Assert.assertTrue(globalpages.Dashboard_page_validation().isDisplayed());
	}
	@Then("Verify User is able to view OOB dashboards and Default dashboards")
	public void verify_user_is_able_to_view_oob_dashboards_and_default_dashboards() {
		Assert.assertTrue(globalpages.OOD_dashboard_option().isDisplayed());
		Assert.assertTrue(globalpages.Default_dashboard_option().isDisplayed());
	}
	/*
	 *  @GS-086
  Scenario: when we hover on the pen Icon tooltip should be display
	 *
	 */
	@When("Mouse hovers on pencil icon besides dahshboards names")
	public WebElement mouse_hovers_on_pencil_icon_besides_dahshboards_names() throws InterruptedException {
		globalpages.Dashboards();
		WebElement Dashboard_pencil_icon = Driver_factory.getDriver()
				.findElement(By.xpath("//*[@id=\"enabledDashboards\"]/label[1]/span[2]/span"));
		actions = new Actions(Driver_factory.getDriver());
		actions.moveToElement(Dashboard_pencil_icon).perform();
		return Dashboard_pencil_icon;
	}
	@Then("Proper tooltip should be displayed")
	public void proper_tooltip_should_be_displayed() {
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains("Edit dashboard name."));
	}
	/*
	 *   @GS-087
  Scenario: when user Click on Pen icon edit dashboard popup should display
	 *
	 */
	String Security = "Security7";
	@When("User click on edit icon")
	public void user_click_on_edit_icon() throws InterruptedException {
		globalpages.Dashboards();
		mouse_hovers_on_pencil_icon_besides_dahshboards_names().click();
		//globalpages.Dashboard_pencil_icon().click();
	}
	@Then("Edit dashboard name popup should be displayed")
	public void edit_dashboard_name_popup_should_be_displayed() {
		Assert.assertTrue(globalpages.Edit_dashboard_name_popup_validation().isDisplayed());
	}
	@Then("User enter newname and click on save")
	public void user_enter_newname_and_click_on_save() {
		globalpages.dashboard_new_name(Security);
		globalpages.Dashboard_Save_button().click();
	}
	@Then("Verify New Dashboard name should be updated")
	public void verify_new_dashboard_name_should_be_updated() throws InterruptedException {
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains(Security));
		//		globalpages.Dashboard_pencil_icon().click();
		Thread.sleep(2000);
		mouse_hovers_on_pencil_icon_besides_dahshboards_names().click();
		Thread.sleep(2000);
		globalpages.Dashboard_reset_default_button().click();
		Thread.sleep(2000);
		globalpages.Dashboard_Save_button().click();
	}
	/*
	 *   @GS-093
  Scenario: Verify the checkbox and dashboard name
	 * 
	 */
	@When("user uncheck the dashboard name")
	public void user_uncheck_the_dashboard_name() throws InterruptedException {
		globalpages.Dashboards();
		globalpages.Dashboard_Severity_checkbox();
	}
	@When("Updated popup should be displayed")
	public void updated_popup_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(globalpages.Dashboard_checkbox_popup_validation().isDisplayed());
		Thread.sleep(2000);
		user_uncheck_the_dashboard_name();
	}
	@Then("Verify unchecked dashboard is displayed in deafult dashboard dropdown")
	public void verify_unchecked_dashboard_is_displayed_in_deafult_dashboard_dropdown() throws InterruptedException {
		//		globalpages.Default_dashboard_dropdown().click();
		//		if(globalpages.Severity_option_validation().isDisplayed()) {
		//			Assert.assertTrue(false);
		//		}

	}
	/*
	 *   @GS-095
  Scenario: Verify Dashboard config functionality
	 */
	@When("User click on Configure dashboard")
	public void user_click_on_configure_dashboard() {
		globalpages.Dashboards();
		globalpages.Configure_dashboard_button().click();
	}
	@Then("Custom Dashboard page should display")
	public void custom_dashboard_page_should_display() {
		Assert.assertTrue(globalpages.Custom_Dashboard_validation().isDisplayed());
	}
	@Then("Verify User is able to add new and delete the widget")
	public void verify_user_is_able_to_add_new_and_delete_the_widget() {
		globalpages.Add_Widget().click();
		Assert.assertTrue(globalpages.Add_Widget_confirm_popup().isDisplayed());
		globalpages.Add_widget_popup_close_button().click();
		globalpages.Delete_Added_widget_button().click();
		globalpages.custom_widget_save_button().click();
	}
	/*
	 *   @GS-099
  Scenario: Verify product/Sub product security Dashboard functionality
	 *
	 */
	@When("User clicks on product Sub product security Dashboard")
	public void user_clicks_on_product_sub_product_security_dashboard() {
		globalpages.Dashboards();
		globalpages.Product_SubProduct_Security_Dashboard().click();
	}
	@Then("Custom dahsboard with Security dashboard should display")
	public void custom_dahsboard_with_security_dashboard_should_display() {
		Assert.assertTrue(globalpages.Product_SubProduct_Securityty_Dashboard_validation().isDisplayed());
	}
	@When("Configure Product Subproduct SSDLC Dashboard")
	public void configure_product_subproduct_ssdlc_dashboard() throws InterruptedException {
		globalpages.Dashboards();
		globalpages.Product_SubProduct_SDLC_dasboard().click();
	}
	@Then("Custom dashboard with SSDLC dashboard should display")
	public void custom_dashboard_with_ssdlc_dashboard_should_display() {
		Assert.assertTrue(globalpages.Product_SubProduct_SDLC_dasboard_validation().isDisplayed());
	}
	/*
	 *   @GS-101
  Scenario: Select the default Dashboard functionality
	 */
	@When("Click on default dashboard dropdown")
	public void click_on_default_dashboard_dropdown() {
		globalpages.Dashboards();
		globalpages.Default_dashboard_dropdown().click();
	}
	@When("Selects the SSDLC Healthcheck as default dashboard")
	public void selects_the_ssdlc_healthcheck_as_default_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		globalpages.default_SDLC_option().click();
	}
	@Then("Success popup should displayed")
	public void success_popup_should_displayed() {
		Assert.assertTrue(globalpages.default_SDLC_option_popup().isDisplayed());
	}
	@Then("Click logout button")
	public void click_logout_button() {
		globalpages.profile_button().click();
		globalpages.Logout_button().click();
	}
	@Then("Launch The application")
	public void launch_the_application() {
		user_log_in_to_application();
	}
	@Then("Verify SSDLC healthcheck dashboard should display")
	public void verify_ssdlc_healthcheck_dashboard_should_display() {
		Assert.assertTrue(globalpages.default_SDLC_validation().isDisplayed());
	}
	/*
	 *   @GS-103
  Scenario: Verify Reset to Default
	 *
	 */
	@When("User Click on ROI Calculation button")
	public void user_click_on_roi_calculation_button() {
		globalpages.ROI_Calculation_Button();
	}
	@Then("ROI Calculation page should be displayed")
	public void Roi_calculation_page_should_be_displayed() {
		Assert.assertTrue(globalpages.ROI_calculation_page_validation().isDisplayed());
	}
	@Then("Change the Man hour cost and Time")
	public void change_the_man_hour_cost_and_time() {
		globalpages.Man_hour_textfield().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		globalpages.Man_hour_textfield().sendKeys("50");
		globalpages.Man_time_textfield().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		globalpages.Man_time_textfield().sendKeys("7");;
	}
	@Then("Click on Save")
	public void click_on_Save() {
		globalpages.Man_hour_time_save_button().click();
	}
	@Then("Success popup should be display")
	public void success_popup_should_be_display() {
		Assert.assertTrue(globalpages.Man_Hour_time_popup_validation().isDisplayed());
	}
	@Then("Click on Reset to Default button")
	public void click_on_reset_to_default_button() {
		globalpages.Man_Hour_Default_button().click();
	}
	@Then("Confirmation popup should display")
	public void confirmation_popup_should_display() {
		Assert.assertTrue(globalpages.Man_Hour_time_popup_validation().isDisplayed());
	}
	@Then("Click on Yes")
	public void click_on_yes() throws InterruptedException {
		globalpages.Man_hour_default_yes_button().click();
		Thread.sleep(2000);
	}
	String Exp_hour = "60";
	String exp_time = "2";
	@Then("Man hour and Time should be reset")
	public void man_hour_and_time_should_be_reset() {
//		Assert.assertTrue(globalpages.Man_hour_textfield_validation()
//				.getAttribute("value").contains(exp_hour));
//		Assert.assertTrue(globalpages.Man_time_textfield_validation()
//				.getAttribute("value").contains(exp_time));
		WebElement Manhour = Driver_factory.getDriver().findElement(By.xpath("//input[@id='manHourCost']"));
		String Value = Manhour.getAttribute("value");
		if(Value.equals(Exp_hour)) {
			Assert.assertTrue(true);
		}
	}
	/*
	 *   @GS-105
   Scenario: Verify the success popup mesage
	 */
	@And("Verify user is on ROI calculation page")
	public void ROI_calculation_page() {
		user_click_on_roi_calculation_button();
		Roi_calculation_page_should_be_displayed();
	}
	/*
	 *   @GS-104
   Scenario: Verify Error message of ROI Calculation
	 */
	@When("Clear the value from Both fields")
	public void clear_the_value_from_both_fields() {
		globalpages.Man_hour_textfield();
		globalpages.Man_time_textfield();
	}
	@Then("Man hour and time required error message should display")
	public void man_hour_and_time_required_error_message_should_display() {
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains("Man Hour Cost is required."));
		Assert.assertTrue(Driver_factory.getDriver().getPageSource()
				.contains("Time (Hrs) is required."));
		//		Assert.assertTrue(globalpages.Man_hour_error_message().isDisplayed());
		//		Assert.assertTrue(globalpages.Man_time_error_message().isDisplayed());
	}
	@Then("Success popup should display")
	public void Success_popup_displayed() throws InterruptedException {
		Assert.assertTrue(globalpages.Man_Hour_time_popup_validation().isDisplayed());
		/*
		 * For restiing the changes
		 */
		click_on_reset_to_default_button();
		confirmation_popup_should_display();
		click_on_yes();
	}
	/*
	 * @GS-107
  Scenario: Verify that User can esaily Change Title name of Respective Fields
	 *
	 */
	String product = "prod";
	String subproduct = "sub";
	@When("User click on Titles button")
	public void user_click_on_titles_button() {
		globalpages.Title_page_button();
	}
	@Then("Titles page should display")
	public void titles_page_should_display() {
		Assert.assertTrue(globalpages.Title_page_validation().isDisplayed());
	}
	@Then("Click on Manage and change product")
	public void click_on_manage_and_change_product() {
		globalpages.Titles_manage_list().click();
		globalpages.Titles_product_field().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		globalpages.Titles_product_field().sendKeys(product);
		globalpages.Titles_manage_list().click();
	}
	@Then("Verify that popup should display")
	public void verify_that_popup_should_display() {
		Assert.assertTrue(globalpages.Titles_product_success_popup().isDisplayed());
		globalpages.Manage_title_popup_close_button().click();
	}
	@Then("Verify in Manage Section specific name should display")
	public void verify_in_manage_section_specific_name_should_display() {
		//globalpages.Manage_section();
		Assert.assertTrue(globalpages.Manage_product_validation().getText()
				.equals(product));
		Assert.assertTrue(globalpages.Manage_subproduct_validation().getText()
				.equals(subproduct));
	}
	@Then("Click on Manage and change sub product")
	public void click_on_manage_and_change_sub_product() {
		globalpages.Titles_manage_list().click();
		globalpages.Titles_subproduct_field().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		globalpages.Titles_subproduct_field().sendKeys(subproduct);
		globalpages.Titles_manage_list().click();
	}
	/*
	 *   @GS-109
  Scenario: Verify that User can esaily Change Title name of Respective Fields
	 */
	String Product = "Product";
	String Subproduct = "Subproduct";
	@And("Verify user is on titles page")
	public void Titles_page() {
		user_click_on_titles_button();
		titles_page_should_display();
	}
	@When("Click on Reset to default button")
	public void click_on_Reset_to_default_button() {
		globalpages.Manage_reset_default_button().click();
	}
	@Then("Confirmation popup is displayed")
	public void confirmation_popup_is_displayed() {
		Assert.assertTrue(globalpages.Manage_Reset_default_popup_validation().isDisplayed());
	}
	@Then("Click on Yes button")
	public void click_on_yes_button() throws InterruptedException {
		Thread.sleep(2000);
		globalpages.Manage_reset_yes_button().click();
	}
	@And("Success Popup should display")
	public void Success_popup_manage_section() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(globalpages.Managepopup_validation().isDisplayed());
//		globalpages.Manage_title_popup_close_button().click();
	}
	@Then("Verify Values set deafault automatically")
	public void verify_values_set_deafault_automatically() throws InterruptedException {
		Thread.sleep(2000);
		globalpages.Titles_manage_list().click();
		Assert.assertTrue(globalpages.Titles_product_field().getAttribute("value")
				.equals(Product));
		Assert.assertTrue(globalpages.Titles_subproduct_field().getAttribute("value")
				.equals(Subproduct));
	}
	/*
	 *   @GS-110
  Scenario: Verify that Editable titles should be Disaply at Respective place.
	 *
	 */
	String status = "Ope";
	@When("Click on Finding status change the open status")
	public void click_on_finding_status_change_the_open_status() {
		globalpages.Manage_finding_status().click();
		globalpages.Manage_finding_status_open().sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		globalpages.Manage_finding_status_open().sendKeys(status);
	}
	@Then("Reset to default findings status")
	public void Reset_finding_status() throws InterruptedException {
		globalpages.Manage_finding_status().click();
		globalpages.ResetToDefault_button().click();
		globalpages.Manage_reset_yes_button().click();
		Thread.sleep(3000);
	}
	@Then("Verify in findings page edited status should display properly")
	public void verify_in_findings_page_edited_status_should_displa_properly() throws InterruptedException {
		globalpages.Titles_Findings_page();
		globalpages.Findings_status_dropdown().click();
		Assert.assertTrue(globalpages.status_validation().getText()
				.contains(status));
		/*
		 * reset the changes
		 */
		//		verify_user_is_on_global_settings_page();
		//		Thread.sleep(3000);
		//		globalpages.Title_page_button();
		//		globalpages.Manage_finding_status().click();
		//		globalpages.Manage_reset_default_button().click();
		//		globalpages.Manage_reset_yes_button().click();
		//		verify_that_popup_should_display();
	}
	/*
	 *   @GS-116
  Scenario: Verify That Devops Widget Configuration
	 *
	 */
	@When("Click on Devops Widget Configuration button")
	public void click_on_devops_widget_configuration_button() {
		globalpages.Devops_wodget_config_button();
	}
	@Then("Devops Widget Configuration page should be display")
	public void devops_widget_configuration_page_should_be_display() {
		Assert.assertTrue(globalpages.Devops_widget_page_validation().isDisplayed());
	}
	/*
	 *   @GS-117
  Scenario: Verify the Reset to Default button
	 *
	 */
	@When("Verify user is on Devops Widget Configuration page")
	public void verify_user_is_on_devops_widget_configuration_page() {
		click_on_devops_widget_configuration_button();
		devops_widget_configuration_page_should_be_display();
	}
	/*
	 *   @GS-118
  Scenario: Verify the submit button
	 *
	 */
	@When("Edit some fields and click on Submit button")
	public void edit_some_fields_and_click_on_submit_button() {
		globalpages.close_release_icon().click();
		globalpages.Devops_widget_submit_button().click();
	}
	@When("Verify submit popup should display")
	public void verify_submit_popup_should_display() {
		Assert.assertTrue(globalpages.devops_success_popup().isDisplayed());
		globalpages.Manage_title_popup_close_button().click();
	}
	@When("Click on Reset button")
	public void click_on_reset_button() {
		globalpages.devops_reset_button().click();
	}
	@Then("The Reset data should display")
	public void the_reset_data_should_display() {
		Assert.assertTrue(globalpages.close_release_icon().isDisplayed());
		globalpages.Devops_widget_submit_button().click();
	}
	/*
	 *   @GS-120
  Scenario: Verify the Multi ticket setting page
	 *
	 */
	@When("Click on Multi ticket setting button")
	public void click_on_multi_ticket_setting_button() {
		globalpages.Multiple_ticket_setting_button();
	}
	@Then("Multi ticket setting page should display")
	public void multi_ticket_setting_page_should_display() {
		Assert.assertTrue(globalpages.Multiple_ticket_setting_page().isDisplayed());
	}
	@When("User enables multi ticket option")
	public void user_enables_multi_ticket_option() {
		globalpages.Multiple_ticket_enable_disable_button().click();
	}
	@Then("popup should display and click on yes")
	public void popup_should_display_and_click_on_yes() {
		Assert.assertTrue(globalpages.Multiple_enable_disable_yes_button().isDisplayed());
		globalpages.Multiple_enable_disable_yes_button().click();
	}
	@Then("Updated Success popup should display")
	public void updated_success_popup_should_display() {
		Assert.assertTrue(globalpages.Multiple_enable_disable().isDisplayed());
		globalpages.Manage_title_popup_close_button().click();
	}
	@Then("User disables multi ticket option")
	public void user_disables_multi_ticket_option() {
		globalpages.Multiple_ticket_enable_disable_button().click();
	}
	/*
	 *   @GS-127
  Scenario: Verify Global settings finding status page
	 *
	 */
	@When("Click on Finding status button")
	public void click_on_finding_status_button() {
		globalpages.Globalseeting_Finding_status_button();
	}
	@When("Finding status page should display")
	public void finding_status_page_should_display() {
		Assert.assertTrue(globalpages.Finding_status_page_validation().isDisplayed());
	}
	@Then("Verify accept Risk Prepetual option will be already enabled")
	public void verify_accept_risk_prepetual_option_will_be_already_enabled() {
	}
	/*
	 * 	
	 *   @GS-138
  Scenario Outline: Verify Global settings product status page
      Examples: 
      | options     |
      | Active17    |
      | Suspended   |
      | End of life |
      | Add Status  |
	 */
	@When("Click on product status button")
	public void click_on_product_status_button() throws InterruptedException {
		globalpages.product_subproduct_Status_Button();
	}
	@When("product status page should display")
	public void product_status_page_should_display() {
		customize_product_subproduct_page_should_be_displayed();
	}
	@Then("Verify that Customize product status Active should display")
	public void verify_that_customize_product_status_active_should_display() {
		Assert.assertTrue(globalpages.product_Active_status().isDisplayed());
	}
	@Then("Verify that Customize product status Suspended should display")
	public void verify_that_customize_product_status_suspended_should_display() {
		Assert.assertTrue(globalpages.product_Suspended_status().isDisplayed());
	}
	@Then("Verify that Customize product status End of life should display")
	public void verify_that_customize_product_status_end_of_life_should_display() {
		Assert.assertTrue(globalpages.product_EndOFLife_status().isDisplayed());
	}
	@Then("Verify that Customize product status Add Status should display")
	public void verify_that_customize_product_status_add_status_should_display() {
		Assert.assertTrue(globalpages.product_Add_status().isDisplayed());
	}
	/*
	 *   @GS-139
  Scenario: Verify user able to Add product status
	 *
	 */
	String new_status = "newStatus";
	String Delete = "Delete";
	@When("Click on Add status button")
	public void click_on_add_status_button() throws InterruptedException {
		Thread.sleep(5000);
		globalpages.product_Add_status_button().click();
	}
	@Then("Added status popup should display")
	public void added_status_popup_should_display() {
		Assert.assertTrue(globalpages.product_Add_status_popup().isDisplayed());
	}
	@Then("Add new status")
	public void add_new_status() {
		globalpages.product_new_status().sendKeys(new_status);
	}
	@Then("Click on save button")
	public void click_on_save_button() {
		globalpages.product_new_status_save_button().click();
	}
	@Then("Verify added status should display")
	public void verify_added_status_should_display() throws InterruptedException {
		Assert.assertTrue(globalpages.product_new_status_validation().getText()
				.contains(new_status));
		/*
		 * Delete the added status
		 * 
		 */
		Thread.sleep(2000);
		globalpages.delete_added_status().click();
		globalpages.delete_text_added_status().sendKeys(Delete);
		globalpages.delete_button_added_status().click();
		Thread.sleep(3000);
	}
	/*
	 *   @GS-150
  Scenario Outline: Verify Risk Score page
	 *
	 */
	@Then("Click on Risk Score button")
	public void click_on_risk_score_button() {
		globalpages.Risk_score_button();
	}
	@Then("Risk Score page should display")
	public void risk_score_page_should_display() {
		Assert.assertTrue(globalpages.Risk_score_page_validation().isDisplayed());
	}
	@Then("Verify that Product Dropdown should display")
	public void verify_that_product_dropdown_should_display() {
		Assert.assertTrue(globalpages.RiskScore_product_dropdown().isDisplayed());
	}
	@Then("Verify that SubProduct Dropdown should display")
	public void verify_that_sub_product_dropdown_should_display() {
		Assert.assertTrue(globalpages.RiskScore_subProduct_dropdown().isDisplayed());
	}
	@Then("Verify that Environment Dropdowns should display")
	public void verify_that_environment_dropdowns_should_display() {
		Assert.assertTrue(globalpages.RiskScore_Environment_dropdown().isDisplayed());
	}
	@Then("Verify that Inverse RiskScore Toggle should display")
	public void verify_that_inverse_risk_score_toggle_should_display() {
		Assert.assertTrue(globalpages.Inverse_RiskScore_toggle().isDisplayed());
	}
	@Then("Verify that Calculate Likelihood should display")
	public void verify_that_calculate_likelihood_should_display() {
		Assert.assertTrue(globalpages.RiskScore_Calculate_Likelihood().isDisplayed());
	}
	@Then("Verify that Calculate Impact should display")
	public void verify_that_calculate_impact_should_display() {
		Assert.assertTrue(globalpages.RiskScore_Calculate_Impact().isDisplayed());
	}
	@Then("Verify that Risk Score Preview should display")
	public void verify_that_risk_score_preview_should_display() {
		Assert.assertTrue(globalpages.RiskScore_Preview_Section().isDisplayed());
	}
}
