package Stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Elements_scans;
import pageobject.Finding_Element_1;
import pageobject.Findings_elements;
import pageobject.Login_elements;
import pageobject.objects;

public class FindingScreen 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	public Login_elements le;
	public Finding_Element_1 fe1;
//	public Findings_elements fe;
	public Elements_scans ele;

	@Given("open the browser")
	public void open_the_browser() 
	{

		le=new Login_elements(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(le.URL);
	}
	@When("log in to Armorcode application")
	public void log_in_to_armorcode_application() throws AWTException, InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		le=new Login_elements(driver);
		le.microsoft_login_button();
		le.un_field();
		le.next_signin_btn();
		le.mspassword_field();
		driver.findElement(By.id("idSIButton9")).click();
		WebElement id = driver.findElement(By.xpath("//div[@id='displayName']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(300));//wait
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println(id.getText());
		driver.findElement(By.id("KmsiCheckboxField")).click();
		driver.findElement(By.xpath("//div[@class='inline-block button-item ext-button-item']/input[@data-report-event='Signin_Submit']")).click();
		System.out.println("PUNITH LOGIN Sucessfully....:-");
	}
//	public static WebDriver driver1;
//	public static WebDriverWait wait;
	String uname ="punith.tg@3ktechnologies.com";
	String pwd = "pUnI@0804";
	public  objects obj;
//	public Findings_elements fe;
//	public Finding_Element_1 fe1;
//	public Login_elements le;
	public int fid;
	public String ftext;
	public String ftext1;
//	public Elements_scans ele;

	@Given("open the browser f")
//	@Before(order = 0)
	public void open_the_browser_f() 
	{
		fe1=new Finding_Element_1(driver);
		le=new Login_elements(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(le.URL);
	}
	@When("log in to Armorcode application f")
//	@Before(order = 1)
	public void log_in_to_armorcode_application_f() throws AWTException, InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		le=new Login_elements(driver);
		le.microsoft_login_button();
		le.un_field();
		le.next_signin_btn();
		le.mspassword_field();
		driver.findElement(By.id("idSIButton9")).click();
		WebElement id = driver.findElement(By.xpath("//div[@id='displayName']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(300));//wait
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println(id.getText());
		wait= new WebDriverWait(driver,Duration.ofSeconds(300));//wait
		wait.until(ExpectedConditions.elementToBeClickable(By.name("DontShowAgain")));
		driver.findElement(By.name("DontShowAgain")).click();
		//driver1.findElement(By.id("KmsiCheckboxField")).click();
		driver.findElement(By.xpath("//div[@class='inline-block button-item ext-button-item']/input[@data-report-event='Signin_Submit']")).click();
		System.out.println("PUNITH LOGIN Sucessfully....:-");
		fe1=new Finding_Element_1(driver);
	}
//	@After
//	public void close()
//	{
//		driver1.manage().deleteAllCookies();
//		driver1.quit();
//	}
	@Given("Click on Finding tab")
	public void click_on_finding_tab() 
	{
//		fe1=new Findings_elements(driver1);
		fe1=new Finding_Element_1(driver);
		fe1.scanstab();
		fe1.findingtab();
	}
	@Then("Finding page should be loaded properly")
	public void finding_page_should_be_loaded_properly() 
	{
		WebElement fidte = driver.findElement(By.xpath("//span[.='Finding ID' and @class='ant-table-filter-column-title']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(fidte));
		String ftextt = fidte.getText();
		System.out.println(ftextt);
		Assert.assertEquals(ftextt, "Finding ID");
	}
	@Then("Open, Accept Risk and Confirm status filter should be applied bydefault")
	public void open_accept_risk_and_confirm_status_filter_should_be_applied_bydefault() 
	{
		fe1.openfilter();
		fe1.Ariskfilter();
		fe1.confirmfilter();
	}
	@Then("Descending Sorting should be applied on Severity column bydefault.")
	public void descending_sorting_should_be_applied_on_severity_column_bydefault() 
	{
		fe1.downsort();
	}

	@When("Click on Add finding and fill Details")
	public void click_on_add_finding_and_fill_details() throws InterruptedException 
	{
		fe1.clear();
		fe1.Addfinding();
		fe1.producttextfield();
		fe1.testing_02product();
		fe1.subproduct();
		fe1.sptest2o();
		Elements_scans ele =new Elements_scans(driver);
		ele.environmentdd();
		ele.productionopt_environment();
		WebElement nextbtn=driver.findElement(By.xpath("//span[text()='Next']"));
		//nextbtn.click();
		fe1.nextbtnpopup();
		fe1.template();
		fe1.summaryfield();
		fe1.descriptionfield();
		fe1.steptoreproducefield();
		fe1.mitigationfield();
		fe1.impactfield();
		System.out.println(nextbtn.getText());
		nextbtn.click();
	}

	@When("click on Submit fe")
	public void click_on_submit_fe() throws InterruptedException 
	{
		fe1.submit();
	}

	@Then("Sucess message should be displayed")
	public void sucess_message_should_be_displayed()
	{
		WebElement sucesstext = driver.findElement(By.xpath("//*[@aria-label='check-circle']")); 
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(sucesstext));
		boolean sucesstext1 = sucesstext.isDisplayed();
		Assert.assertEquals(sucesstext1, true);
		System.out.println("Sucess msg is displayed---"+sucesstext1);
		//*[@class='ant-message-custom-content ant-message-success']
		//System.out.println("Sucess message is displayed-- "+driver1.getPageSource().contains("Successfully added new Finding"));
		//-/div/div/div/span[2]/text()//Success!
		//Successfully added new Finding
		//-/html/body/div[4]/div/span/div/div/div/span[2]/strong
	}

	@Then("Finding will be added")
	public void finding_will_be_added() 
	{
		// driver.findElement(By.xpath("(//span[.='Finding Age']/following-sibling::span[1])[2]")).click();
		
		//WebElement fewsecond = driver1.findElement(By.xpath("//span[.='a few seconds']"));
		//boolean fewsec = fewsecond.isDisplayed();
		//System.out.println(fewsec);
		//Assert.assertEquals(fewsec, true);
	}

	@Given("select finding fe")
	public void select_finding_fe() throws InterruptedException 
	{
		fe1.clear();
		fe1.Statusdropdown();
		fe1.opencheckbox();
		fe1.Applybutton();
		//fe.first_cbox();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]")).click();
		/*WebElement opencbox = driver1.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]"));
		wait= new WebDriverWait(driver1,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(opencbox));
		JavascriptExecutor js=(JavascriptExecutor) driver1;
		js.executeScript("arguments[0].click();",opencbox);*/
	}
	@Given("click on Finding Id")
	public void click_on_finding_id11() throws InterruptedException 
	{
		fe1.clear();
		fe1.Statusdropdown();
		fe1.opencheckbox();
		fe1.Applybutton();
		WebElement id = driver.findElement(By.xpath("(//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/a[1])[1]"));
		Actions as=new Actions(driver);
		as.click(id).perform();
		System.out.println(id.getText());
	}

	@When("select Accept Risk in dropdown")
	public void select_accept_risk_in_dropdown() 
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='d-flex text-ellipsis']//div[@class='ant-dropdown-trigger d-flex align-items-center'])[2]")));
		driver.findElement(By.xpath("(//div[@class='d-flex text-ellipsis']//div[@class='ant-dropdown-trigger d-flex align-items-center'])[2]")).click();
	}

	@When("Enter details in Accept risk and click on Submit")
	public void enter_details_in_accept_risk_and_click_on_submit() 
	{
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("@FI-060");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Submit'and @type='submit']")));
		driver.findElement(By.xpath("//*[.='Submit'and @type='submit']")).click();
	}

	@Then("Accept Risk1 Status should be changed and it should be recorded in the history tab.")
	public void accept_risk1_status_should_be_changed_and_it_should_be_recorded_in_the_history_tab() 
	{

	}

//Add template code	
	
	@When("click on addfinding and enter basic info")
	public void click_on_addfinding_and_enter_basic_info() 
	{
		fe1.Addfinding();
		fe1.producttextfield();
		fe1.testing_02product();
		fe1.subproduct();
		fe1.sptest2o();
		Elements_scans ele =new Elements_scans(driver);
		ele.environmentdd();
		ele.productionopt_environment();
		
		fe1.Next_basic_info();
	}

	@When("click on template")
	public void click_on_template() 
	{
	  fe1.template_dd();
	 
	}

	@When("click on add template")
	public void click_on_add_template() {
		 fe1.Add_template_btn();

	}

	@When("Enter all template details")
	public void enter_all_template_details() 
	{
		fe1.name_template_field();
		fe1.summary_add_template_field();
		fe1.description_add_template_field();
		fe1.mitigation_add_template_field();
		fe1.impact_add_template_field();
		
	}

	@When("click on save")
	public void click_on_save() 
	{
		fe1.save_add_template();
	}

	@Then("template should be added")
	public void template_should_be_added() 
	{
	   fe1.template_verify();
	}

	@Then("data should be added as per the template")
	public void data_should_be_added_as_per_the_template() 
	{
	   fe1.summary_verify();
	   fe1.description_verify();
	   fe1.mitigation_verify();
	   fe1.impact_verify();
	   fe1.close_popup();
	}

	@When("click on edit icon")
	public void click_on_edit_icon() 
	{
	    fe1.edit_tag_btn();
	}

	@When("edit details in template")
	public void edit_details_in_template() 
	{
		fe1.name_edit_template_field();
	    fe1.summary_edit_template_field();
	    fe1.description_edit_template_field();
		fe1.mitigation_edit_template_field();
		fe1.impact_edit_template_field();
	}

	@Then("template should be edited")
	public void template_should_be_edited() 
	{
	    //fe.edit_template_verify();
	}

	@Then("Edited details should be added as per the template")
	public void edited_details_should_be_added_as_per_the_template() 
	{
	  // fe.edit_summary_verify();
	   //fe.edit_description_verify();
	   //fe.edit_mitigation_verify();
	   //fe.edit_impact_verify();
	   driver.findElement(By.name("template")).click();
	   fe1.delete_edit_template();
	   fe1.close_popup();
	}
	

@When("attach file in detailed info")
public void attach_file_in_detailed_info() 
{
  
}

@When("check files is displayed in details tab")
public void check_files_is_displayed_in_details_tab() 
{
   
}

	@When("Enter all details in detailed info")
	public void enter_all_details_in_detailed_info() 
	{
		fe1.template();
		fe1.attachsummaryfield();
		fe1.descriptionfield();
		fe1.steptoreproducefield();
		fe1.mitigationfield();
		fe1.impactfield();
		fe1.next_btn_detailpopup();
	}

	@When("upload file in attach file info")
	public void upload_file_in_attach_file_info() 
	{
	   fe1.Attach_file_field();
	}

	@When("check finding age")
	public void check_finding_age() 
	{
		//fe.main_refresh_btn();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		fe1.clear();
		fe1.attach_findingage();
	}
	@When("check summary")
	public void check_summary() 
	{
		fe1.verify_summary();
	}
	@When("click on finding id for attachment")
	public void click_on_finding_id_for_attachment() 
	{
		fe1.attach_fid_click();
	}

	@When("check file is displayed in attachment tab")
	public void check_file_is_displayed_in_attachment_tab() 
	{
	    fe1.attachment_tab();
	    fe1.verify_attach_file();
	}

	@When("Aplly product subproduct owner filter")
	public void aplly_product_subproduct_owner_filter() 
	{
		fe1.clear();
	   ele=new Elements_scans(driver);
	   fe1.product_filter();
	   fe1.search_fe();
	   fe1.product_testing02_option();
	   fe1.applyfilbtn();
	    ele.morefilterbtn();
	    fe1.more_Search();
	    fe1.subproduct_more_option();
	    fe1.test20_filter_option();
	    fe1.apply_btn_dynamic();
	    ele.morefilterbtn();
	    fe1.more_ownerSearch();
	    fe1.owner_filter();
	    fe1.punith_owner_filter_option();
	    fe1.apply_btn_dynamic1();
	}

	@When("click on save As and enter details and save")
	public void click_on_save_as_and_enter_details_and_save() 
	{
	    fe1.save_as_btn();
	    fe1.name_field();
	    fe1.save_btn();
	    driver.navigate().refresh();
	}

	@Then("specific filters should be saved and it should be displayed in saved search")
	public void specific_filters_should_be_saved_and_it_should_be_displayed_in_saved_search() 
	{
	   fe1.saved_search_btn();
	   fe1.saved_search_field();
	   fe1.saved_search_verify();
	   fe1.delete_saved_search();
	   fe1.close_saved_search();
	   
	}
	
	@When("Enter text in comment")
	public void enter_text_in_comment() 
	{
		fe1.finding_id_click_fe();
		fe1.comment_field_click();
	    fe1.comment_field();
	    fe1.emoji_btn();
	    fe1.smily_emoji();
	    fe1.emoji_btn();
	    fe1.laugh_emoji();
	}

	@When("mention person")
	public void mention_person() 
	{
//		fe.comment_field_click();
//	   fe.comment_field_mention();
//	   fe.mention_person();
//		
////	   fe.comment_field();
//	  // fe.attachment_btn();
	}

	@When("click on comment")
	public void click_on_comment() 
	{
		fe1.comment_btn();
	}

	@Then("comment should be added")
	public void comment_should_be_added() 
	{
	    fe1.comment_txt_verify();
	    fe1.close_popup();
	}

	@When("click on saved search")
	public void click_on_saved_search() 
	{
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		fe1.saved_search_btn();
	}

	@When("click on schedule and enable schedule")
	public void click_on_schedule_and_enable_schedule() 
	{
	   fe1.schedule_btn();
	   fe1.schedule_togle();
	}

	@When("select user")
	public void select_user() 
	{
	  fe1.user_field();
	  //fe.user_field_input();
	  //fe.punith_user_ss();
	}

	@When("click on save in saved search")
	public void click_on_save_in_saved_search() 
	{
		fe1.save_btn();
	}

	@Then("message should be displayed")
	public void message_should_be_displayed() 
	{
	   fe1.saved_search_popup_verify();
	}
	@Then("clear schedule")
	public void clear_schedule() 
	{
		 fe1.schedule_btn();
		   fe1.schedule_togle();
		   fe1.user_close();
		   fe1.save_btn();
	   fe1.close_saved_search();
	}
	@When("select Teams name")
	public void select_teams_name() 
	{
	   fe1.teams_btn();
	   fe1.punith_team();
	}
	@Given("filter high severity1")
	public void filter_high_severity1()
	{
		fe1.clear();
		fe1=new Finding_Element_1(driver);
		fe1.main_severity_dd();
		fe1.highcheckbox();
		fe1.Applybutton();
	}
	@Then("clear schedule team")
	public void clear_schedule_team() 
	{
		 fe1.schedule_btn();
		   fe1.schedule_togle();
		   fe1.teams_close();
		   fe1.save_btn();
	   fe1.close_saved_search();
	}
	@When("click on click here")
	public void click_on_click_here() 
	{
	   fe1.allcbox();
	   fe1.click_here();
	}

	@Then("create ticket and mitigated and propose mitigated should be disabled")
	public void create_ticket_and_mitigated_and_propose_mitigated_should_be_disabled() 
	{
	  fe1.create_ticket_verify();
	  fe1.threedots_main();
	  fe1.mitigated_veify_thredot();
	  fe1.propose_mitigated_veify_thredot();
	  fe1.clear();
	}
	@Given("Get counts in basic filter")
	public void get_counts_in_basic_filter() 
	{
			fe1.allcbox();
		 fe1.old_filter_count();
		 fe1.allcbox();
	}

	@When("click on Switch to AQL")
	public void click_on_switch_to_aql() 
	{
	    fe1.switch_Aql_btn();
	}

	@Then("check same count is displayed in aql filter")
	public void check_same_count_is_displayed_in_aql_filter() 
	{
		fe1.aql_filter_verify();
	   fe1.allcbox();
	   fe1.aql_filter_count();
	   fe1.allcbox();
	   fe1.reset_aql_filter();
	}
	@Given("Open Finding page")
	public void open_finding_page() 
	{
		fe1=new Finding_Element_1(driver);
		fe1.scanstab();
		fe1.findingtab();
		fe1.clear();
	}
	String parent;
	@Given("filter open findings")
	public void filter_open_findings() 
	{
		fe1.Statusdropdown();
		fe1.opencheckbox();
		fe1.Applybutton();
	}
	@Given("filter falsepositive findings")
	public void filter_falsepositive_findings() 
	{
		fe1.Statusdropdown();
		fe1.falsepositivecheckbox();
		fe1.Applybutton();
	}
	@Given("filter product")
	public void filter_product() 
	{
//		fe=new Findings_elements(driver);
		fe1.main_product_filter();
		fe1.filter_search_main();
		fe1.product_testing02_option();
		fe1.Applybutton1();
	}
	@When("Click on Finding Id")
	public void click_on_finding_id() throws InterruptedException 
	{
		//fe1.main_severity_dd();
		//fe1.highcheckbox();
		//fe.Applybutton();
		Thread.sleep(3000);
		fe1.finding_id_click();
	}

	@When("select False +ve in dropdown")
	public void select_false_ve_in_dropdown() throws InterruptedException 
	{
		Thread.sleep(2000);
		fe1.status_dropdown_click();
		fe1.dd_falsepositive_option();
	}

	@When("Enter Note in False +ve1 and click on Submit")
	public void enter_note_in_false_ve1_and_click_on_submit() 
	{
		fe1.note_popup_falsep();
		fe1.submit_button_popup();
	}

	@Then("False +ve1 Status should be changed and it should be recorded in the history tab.")
	public void false_ve1_status_should_be_changed_and_it_should_be_recorded_in_the_history_tab() 
	{
		fe1.falsepositive_verify();
		fe1.history();
		//fe1.note_verify();
		fe1.close_popup();
	}

	@Given("filter high severity")
	public void filter_high_severity()
	{
		fe1=new Finding_Element_1(driver);
		fe1.main_severity_dd();
		fe1.highcheckbox();
		fe1.Applybutton();
	}
	@When("Change severity")
	public void change_severity() throws InterruptedException 
	{
		Thread.sleep(2000);
		fe1.Severity_dd_click();
		fe1.critical_dd_option();
	}

	@When("Enter note in popup click on submit")
	public void enter_note_in_popup_click_on_submit() 
	{
		fe1.critical_note_popup();
		fe1.save_button_popup();
	}

	@Then("Severity should be changed it should be recorded in History tab")
	public void severity_should_be_changed_it_should_be_recorded_in_history_tab() 
	{
		fe1.severity_critical_verify();
		fe1.criticalHistory();
		fe1.severity_normal_note_verify();
		
	}

	@Then("If user click same Severity dropdown should be close.")
	public void if_user_click_same_severity_dropdown_should_be_close() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[@class='d-flex justify-content-between']//div//button[@type='button']/span[@class='anticon'])[2]")).click();
		Thread.sleep(3000);
		fe1.Severity_dd_click();
		fe1.critical_dd_option();
		fe1.close_popup();
	}
	@Given("filter na_owner")
	public void filter_na_owner()
	{
		ele=new Elements_scans(driver);
		ele.morefilterbtn();
		fe1.more_ownerSearch();
		fe1.owner_filter();
		fe1.amrutha_owner_filter_option();
		fe1.apply_filter_updated();
	}
	@When("click on pencil icon")
	public void click_on_pencil_icon() throws InterruptedException 
	{
		Thread.sleep(2000);
		fe1.owner_edit_pencil_button();
	}

	@When("select new owner")
	public void select_new_owner() 
	{	
		fe1.owner_change_ddpopup();
		fe1.owner_enter_ddpopup();
		fe1.owner_ddpopup_option();
	}

	@When("Enter note and click on save")
	public void enter_note_and_click_on_save() 
	{
		fe1.owner_Note();
		fe1.save_button_popup();
	}

	@Then("owner name should be changed and should be recorded in history tab")
	public void owner_name_should_be_changed_and_should_be_recorded_in_history_tab() 
	{
		fe1.owner_verify();
		fe1.owner_history();
		fe1.ownerchange_normal_note_verify();
		fe1.close_popup();
	}

	
	@When("click on tags")
	public void click_on_tags() 
	{
	   fe1.tag_header_btn();
	   
	}

	@When("click on add new button")
	public void click_on_add_new_button() 
	{
	   fe1.Add_new_btn();
	}

	@When("Enter key and value and click on tick mark")
	public void enter_key_and_value_and_click_on_tick_mark() 
	{
		fe1.new_value_field();
	   fe1.new_key_field();
	   fe1.tick_tag_btn();
	}

	@Then("tag should be displayed")
	public void tag_should_be_displayed() 
	{
	  fe1.tag_key_verify();
	  fe1.tag_value_verify();
	}

	@Then("Displayed in history tab")
	public void displayed_in_history_tab() throws InterruptedException 
	{
		fe1.tag_history();
		Thread.sleep(3000);
		fe1.tags__note_verify();
		fe1.close_popup();
	}

	@When("click on pencil icon in tags")
	public void click_on_pencil_icon_in_tags() 
	{
		fe1.edit_tag();
		
	}

	@When("change key and value and click on tick mark")
	public void change_key_and_value_and_click_on_tick_mark() 
	{
		
		fe1.edit_value_field();
		fe1.edit_key_field();
		fe1.tick_tag_btn();
	}

	@Then("changes should be displayed")
	public void changes_should_be_displayed() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[@class='d-flex justify-content-between']//div//button[@type='button']/span[@class='anticon'])[2]")).click();
		Thread.sleep(3000);
	   fe1.tagedit_key_varify();
	   fe1.tagedit_value_varify();
	}

	@Then("changes displayed in history tab")
	public void changes_displayed_in_history_tab() throws InterruptedException 
	{
		fe1.tag_history();
		Thread.sleep(3000);
		fe1.tags_edit_note_verify();
		driver.findElement(By.xpath("//td[@title='testingkey_editing']/..//span[@class='anticon m-r-xs clickable rc-delete-icon']")).click();
		fe1.close_popup();
	}

	@When("click on Confirm")
	public void click_on_confirm() throws InterruptedException 
	{
		Thread.sleep(2000);
	   fe1.status_dropdown_click();
	   fe1.dd_confirm_option();
	}

	@When("Enter confirm note in popup click on submit")
	public void enter_confirm_note_in_popup_click_on_submit() {
	  fe1.note_popup_confirm();
	  fe1.submit_button_popup();
	}

	@When("click on ok in sucess alert")
	public void click_on_ok_in_sucess_alert() {
	    fe1.ok_confirmation_btn();
	    //fe1.Refresh_popup_btn();
	}

	@Then("status should be changed to Confirm and it should be recorded in History tab")
	public void status_should_be_changed_to_confirm_and_it_should_be_recorded_in_history_tab() {
	   fe1.confirm_status_verify();
	   fe1.history();
	   fe1.confirm_normal_note_verify();
	   fe1.close_popup();
	}
	@Given("unfilter attack in allfilter")
	public void unfilter_attack_in_allfilter() 
	{
		Elements_scans ele=new Elements_scans(driver);
		ele.morefilterbtn();
		fe1.more_Search_fe();
		fe1.category_filter();
		fe1.allbtn();
		fe1.attack_filter();
		fe1.uncategorised_filter();
		driver.findElement(By.xpath("//div[@class='column-filter ']//div[@class='ant-table-filter-dropdown-btns']//span[.='Apply']/..")).click();
	}
	@When("click on Attack category")
	public void click_on_attack_category() 
	{
	   fe1.category_dd();
	   fe1.attack_category_dd_option();
	}

	@When("Enter note in category and click on save")
	public void enter_note_in_category_and_click_on_save() 
	{
		fe1.note_attack_category();
		fe1.save_button_popup();
	}

	@Then("category should be changed to attack and it should be recorded in History tab")
	public void category_should_be_changed_to_attack_and_it_should_be_recorded_in_history_tab() 
	{
		fe1.Attack_verify();
		fe1.attack_history();
		fe1.attack_normal_note_verify();
		fe1.close_popup();
	}
	//reopen
	@When("click on reopen")
	public void click_on_reopen() throws InterruptedException 
	{
		Thread.sleep(2000);
		fe1.status_dropdown_click();
		fe1.reopen_status_ddoption();
	}

	@When("Enter reopen note in popup click on submit")
	public void enter_reopen_note_in_popup_click_on_submit() 
	{
		fe1.reopen_note();
		fe1.submit_button_popup();
		 fe1.close_popup();
	}
	

@When("click on edit beside summary")
public void click_on_edit_beside_summary() 
{
   fe1.summary_edit_icon();
}

@When("Enter Summary and note")
public void enter_summary_and_note() throws InterruptedException 
{
    fe1.change_summary();
    fe1.change_summary_note();
    fe1.submit_button_popup();
    Thread.sleep(3000);
    fe1.Refresh_popup_btn();
    Thread.sleep(3000);
}

@Then("Summary should be changed and it should be recorded in hoistory tab")
public void summary_should_be_changed_and_it_should_be_recorded_in_hoistory_tab() 
{
	fe1.Summary_change_verify();
	fe1.common_history();
	fe1.change_summary_note_verify();
	fe1.close_popup();
}

@Given("Click on Add finding and fill Details for custom finding")
public void click_on_add_finding_and_fill_details_for_custom_finding() 
{
	fe1.clear();
	fe1.Addfinding();
	fe1.producttextfield();
	fe1.testing_02product();
	fe1.subproduct();
	fe1.sptest2o();
	Elements_scans ele =new Elements_scans(driver);
	ele.environmentdd();
	ele.productionopt_environment();
	WebElement nextbtn=driver.findElement(By.xpath("//span[text()='Next']"));
	//nextbtn.click();
	fe1.nextbtnpopup();
	fe1.template();
	fe1.summaryfield();
	fe1.descriptionfield();
	fe1.steptoreproducefield();
	fe1.mitigationfield();
	fe1.impactfield();
	System.out.println(nextbtn.getText());
	nextbtn.click();
	fe1.submit();
}

@When("change status to mitigated and enter note")
public void change_status_to_mitigated_and_enter_note() 
{
	fe1.status_dropdown_click();
	fe1.mitigated_status_dd();
	fe1.mitigated_notearea();
}

@When("click on submit N")
public void _click_on_submit_n() 
{
	fe1.Submit_bucket_popup();
	fe1.done();
	fe1.clear();
	fe1.fidfilter();
	fe1.search1();
	fe1.applyfilbtn();
	fe1.fidclick();
}
@Then("mitigated status should be changed and should be displayed in history tab")
public void mitigated_status_should_be_changed_and_should_be_displayed_in_history_tab() 
{
   fe1.mitigated_status_verify();
   fe1.common_history();
   fe1.mitigated_status_note_verify();
	fe1.close_popup();
}

@When("click on due date edit icon and enter date comment and click on save")
public void click_on_due_date_edit_icon_and_enter_date_comment_and_click_on_save() 
{
	fe1.duedate_editbtn();
	fe1.due_date_nf();
	fe1.due_date_comment_nf_field();
   fe1.save_button_popup();
   fe1.Refresh_popup_btn();
}

@Then("Due date should be changed and it should be recorded in history tab")
public void due_date_should_be_changed_and_it_should_be_recorded_in_history_tab() throws ParseException 
{
	fe1.duedate_nf_verify();
	fe1.common_history();
	fe1.change_duedate_nf_note_verify();
}
@Given("clear filter")
public void clear_filter() 
{
 fe1.clear();
}	
@When("change status to acceptrisk three times")
public void change_status_to_acceptrisk_three_times() 
{
    fe1.status_dropdown_click();
    fe1.Accept_risk_status_option();
    fe1.accrisk_never_notearea();
    fe1.submit_button_popup();
    fe1.ok_confirmation_btn();
    
}

@Then("Acceptrisk button should be disabled")
public void acceptrisk_button_should_be_disabled() 
{
	fe1.status_dropdown_click();
	fe1.threetimes_accrisk_verify();
	fe1.close_popup();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//bucket flow
	@Given("click on Selected and click on False +ve")
	public void click_on_selected_and_click_on_false_ve() 
	{
		fe1.selectedlink();
		fe1.bucketfalsep();
		fe1.bucket_Fidgettext_popup();
	}
	@When("Enter Note in falsepositive click on submit")
	public void Enter_Note_in_falsepositive_click_on_submit()
	{
		fe1.notefalsep();
		fe1.submitpopup();
		fe1.done();
		fe1.gotofindgs_bucket_btn();
		fe1.clear();
	}

	@Then("Bucket False +ve Status should be changed and it should be recorded in the history tab.")
	public void Bucket_false_ve_status_should_be_changed_and_it_should_be_recorded_in_the_history_tab() throws InterruptedException 
	{
		fe1.fidfilter();
		fe1.search();
		fe1.applyfilbtn();
		fe1.fidclick();
		fe1.falsepositive_verify();
		fe1.common_history();
		fe1.false_positive_note_verify();
		fe1.close_popup();
	}
	@When("click on Selected and click on Accept Risk")
	public void click_on_selected_and_click_on_accept_risk() throws InterruptedException 
	{
		fe1.selectedlink();
		fe1.Bucket_Accrisk_btn();
		fe1.bucket_Fidgettext_popup();
	}
	@When("change to Never in Reopen option")
	public void change_to_never_in_reopen_option() 
	{
		fe1.reopendd_bucket();
		fe1.never();
	}
	@When("Enter Note click on submit")
	public void enter_note_click_on_submit() throws InterruptedException 
	{
		fe1.accrisk_never_notearea();
		fe1.submitpopup();
		fe1.done();
		fe1.scanstab();
		fe1.findingtab();
		fe1.clear();
	}
	@Then("Accept Risk Status should be changed and it should be recorded in the history tab.")
	public void accept_risk_status_should_be_changed_and_it_should_be_recorded_in_the_history_tab() throws IOException, InterruptedException 
	{

		fe1.fidfilter();
		fe1.search();
		fe1.applyfilbtn();
		fe1.fidclick();
		fe1.accrisk();
		// driver1.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[2]")).click();
		//driver1.findElement(By.xpath("(//a[@class='ant-typography'])[2]")).click();//finding id
		//obj.Findingid();
		//WebElement confirm = driver1.findElement(By.xpath("//div[@class='d-flex text-ellipsis' and .='Confirm']"));
		fe1.history();
		/*TakesScreenshot tss=(TakesScreenshot) driver1;
	     Thread.sleep(2000);
	     File temp = tss.getScreenshotAs(OutputType.FILE);
	     Thread.sleep(2000);
	     String path = "C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\Screenshot"+ftext+".jpeg";
	     File sc=new File(path);
	     Thread.sleep(2000);
	     FileHandler.copy(temp, sc);*/
	}
	@When("Select finding")
	public void select_finding() throws InterruptedException 
	{
		Thread.sleep(3000);
		fe1.fid_Checkbox_click();
	}

	@When("click on selected and click on change owner")
	public void click_on_selected_and_click_on_change_owner() 
	{
		fe1.selectedlink();
		fe1.bucket_changeowner_button();
		fe1.bucket_Fidgettext_popup();
	}
	@When("select owner and enter comment")
	public void select_owner_and_enter_comment() 
	{
		fe1.owner_change_ddpopup();
		fe1.owner_enter_ddpopup();
		fe1.owner_ddpopup_option();
		fe1.fidtext_link_popup();
		fe1.owner_Note_bucketflow();
	}
	@When("click on submit1")
	public void click_on_submit1() 
	{
		fe1.Submit_bucket_popup();
		fe1.done();
		fe1.gotofindgs_bucket_btn();
		fe1.clear();
		fe1.fidfilter();
		fe1.search();
		fe1.applyfilbtn();
		fe1.fidclick();
		
	}
	@Then("owner name should be changed in bucket flow and should be recorded in history tab")
	public void owner_name_should_be_changed_in_bucket_flow_and_should_be_recorded_in_history_tab() 
	{
		fe1.owner_verify();
		fe1.owner_history();
		fe1.change_owner_note_verify();
		fe1.close_popup();
		
	}
	@When("click on Selected")
	public void click_on_selected() 
	{
		fe1.selectedlink();
	}

	@When("click on Change category and enter comment and category")
	public void click_on_change_category_and_enter_comment_and_category() 
	{
		fe1.change_category_btn_bucketflow();
		fe1.changecategory_comment_bucket_field();
		fe1.categeory_bucket_dd();
		fe1.Uncategorized_category_option();
		fe1.bucket_Fidgettext_popup();
	}

	@Then("Bucketflow Category should be changed and should be recorded in history tab")
	public void bucketflow_category_should_be_changed_and_should_be_recorded_in_history_tab() 
	{
	   fe1.category_bucket_verify();
	   fe1.common_history();
	   fe1.change_category_note_verify();
	   fe1.close_popup();
	}
	@Given("filter medium severity")
	public void filter_medium_severity()
	{
		fe1.main_severity_dd();
		fe1.mediumcheckbox();
		fe1.Applybutton();
	}
	@When("click on Change severity and enter comment and severity")
	public void click_on_change_severity_and_enter_comment_and_severity() 
	{
	   fe1.change_Severity_btn_bucketflow();
	   fe1.severity_bucket_dd();
	   fe1.high_severity_ddoption();
	   fe1.severity_comment_bucket_field();
	   fe1.bucket_Fidgettext_popup();
	}

	@Then("Bucketflow severity should be changed and should be recorded in history tab")
	public void bucketflow_severity_should_be_changed_and_should_be_recorded_in_history_tab()
	{
		fe1.verify_high_severity();
		fe1.criticalHistory();
		fe1.severity_note_verify();
		fe1.close_popup();
		
	}

	@When("click on confirm and enter note")
	public void click_on_confirm_and_enter_note()
	{
	    fe1.confirm_btn_bucketflow();
	    fe1.confirm_comment_bucket_field();
	    fe1.bucket_Fidgettext_popup();
	   
	}

	@Then("Bucketflow confirm should be changed and should be recorded in history tab")
	public void bucketflow_confirm_should_be_changed_and_should_be_recorded_in_history_tab() 
	{
		fe1.confirm_status_verify1();
		fe1.common_history();
		fe1.confirm_note_verify();
		fe1.close_popup();
	}

	@When("click on Change Due date and Select date and enter comment")
	public void click_on_change_due_date_and_select_date_and_enter_comment() 
	{
	    fe1.ChangeDueDate_btn_bucketflow();
	    fe1.due_date_click();
	    fe1.due_date_comment_bucket_field();
	    fe1.bucket_Fidgettext_popup();
	}

	@Then("Bucketflow Change Due date should be changed and should be recorded in history tab")
	public void bucketflow_change_due_date_should_be_changed_and_should_be_recorded_in_history_tab() throws ParseException 
	{
	    fe1.duedate_verify();
	    fe1.common_history();
	    fe1.change_duedate_note_verify();
	    fe1.close_popup();
	}
	@Given("select mitigated findings")
	public void select_mitigated_findings() 
	{
		fe1.Statusdropdown();
		fe1.mitigatedcheckbox();;
		fe1.Applybutton();
	}
	@Given("filter mitigated findings")
	public void filter_mitigated_findings() 
	{
		fe1.Statusdropdown();
		fe1.allbtn();
		fe1.mitigatedcheckbox();;
		fe1.Applybutton();
	}
	@Given("filter mitigated findings1")
	public void filter_mitigated_findings1() 
	{
		fe1.Statusdropdown();
		fe1.allbtn1();
		fe1.mitigatedcheckbox();;
		fe1.Applybutton1();
		
	}
	
	@When("click on mitigated and enter note")
	public void click_on_mitigated_and_enter_note() 
	{
	   fe1.mitigated_bucket_btn();
	   fe1.mitigated_note();
	   fe1.bucket_Fidgettext_popup();
	}

	@Then("Bucketflow mitigated should be changed and should be recorded in history tab")
	public void bucketflow_mitigated_should_be_changed_and_should_be_recorded_in_history_tab() 
	{
		fe1.mitigated_status_verify1();
		fe1.common_history();
		fe1.mitigated_note_verify();
		fe1.close_popup();
		
	}
	@When("click on Edit basic information and select product subproduct environment and enter note")
	public void click_on_edit_basic_information_and_select_product_subproduct_environment_and_enter_note() 
	{
		ele=new Elements_scans(driver);
		fe1.edit_basic_info_btn();
		ele.productuspopup();
	    fe1.product_tester();
	    ele.subProductdd();
	    fe1.subpro_Testersp();
	    ele.environment_dd_updated();
	    ele.productionopt_environment();
	    fe1.editbasicinfo_notes();
	    fe1.bucket_Fidgettext_popup();
	}
	String product ;String subproduct;String env;
	@Then("Bucketflow Edit basic information should be changed and should be recorded in history tab")
	public void bucketflow_edit_basic_information_should_be_changed_and_should_be_recorded_in_history_tab() 
	{
		fe1.product_txt_verify();
		fe1.common_history();
		fe1.editbasicinfo_note_verify();
		fe1.close_popup();
	}
	
//==========================================PROPSE WORKFLOW
	
	@When("unfilter falsepositive findings")
	public void unfilter_falsepositive_findings() 
	{
		fe1.Statusdropdown();
		fe1.allbtn();
		fe1.falsepositivecheckbox();
		fe1.Applybutton();
	}
	@When("click on propose falsepositive")
	public void click_on_propose_falsepositive() 
	{
		fe1.bucket_propse_falsepositive();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter comment in  propse falsepositive")
	public void enter_comment_in_propse_falsepositive() 
	{
	   fe1.propse_falsepositive_comment_bucket_field();
	}

	@When("click on submit")
	public void click_on_submit() 
	{
		fe1.Submit_bucket_popup();
		fe1.done();
		fe1.gotofindgs_bucket_btn();
		fe1.findingsunderreview_link();
		fe1.fidfilter();
		fe1.search();
		fe1.applyfilbtn();
	}

	@Then("Bucket propse False +ve finding should be there in finding_under review page")
	public void bucket_propse_false_ve_finding_should_be_there_in_finding_under_review_page() 
	{
	   fe1.fid_findingsunderreview_verify();
	   
	}

	@Then("propse False +ve should be recorded in the history tab.")
	public void propse_false_ve_should_be_recorded_in_the_history_tab() {
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
		fe1.common_history();
		fe1.Propose_Falsepsitive_note_verify();
		 fe1.Reject_link();
		 fe1.note_reject_fur();
		 fe1.Reject_note_btn();
		fe1.close_popup();
	}

	@When("click on propose Accept Risk")
	public void click_on_propose_accept_risk() 
	{
	   fe1.propose_AcceptRisk_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter Note in  propse Accept Risk")
	public void enter_note_in_propse_accept_risk() 
	{
	    fe1.propose_AcceptRisk_Note();
	}

	@Then("Bucket propse Accept Risk finding should be there in finding_under review page")
	public void bucket_propse_accept_risk_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Accept Risk should be recorded in the history tab.")
	public void propse_accept_risk_should_be_recorded_in_the_history_tab() 
	{
		fe1.common_history();
		fe1.Propose_AcceptRisk_note_verify();
		fe1.close_popup();
	}

	@When("click on propose owner")
	public void click_on_propose_owner() 
	{
		fe1.propose_Owner_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter owner name and comment in propse owner")
	public void enter_owner_name_and_comment_in_propse_owner() 
	{
		fe1.owner_change_ddpopup();
		fe1.owner_enter_ddpopup();
		fe1.owner_ddpopup_option();
		fe1.owner_Note_proposeflow();
	}

	@Then("Bucket propse owner finding should be there in finding_under review page")
	public void bucket_propse_owner_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse owner should be recorded in the history tab.")
	public void propse_owner_should_be_recorded_in_the_history_tab() 
	{
		fe1.common_history();
		fe1.Propose_owner_note_verify();
		fe1.close_popup();
	}

	@When("click on propose Duedate")
	public void click_on_propose_duedate() 
	{
		fe1.propse_duedate_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter Duedate and comment in propse Duedate")
	public void enter_duedate_and_comment_in_propse_duedate() 
	{
	   fe1.propse_duedate_enter();
	   fe1.propose_duedate_comment_field();
	}

	@Then("Bucket propse Duedate finding should be there in finding_under review page")
	public void bucket_propse_duedate_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.findingsunderreview_fid_verify_duedate();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Duedate should be recorded in the history tab.")
	public void propse_duedate_should_be_recorded_in_the_history_tab()
	{
		fe1.common_history();
		fe1.Propose_duedate_comment_verify();
		fe1.close_popup();
	}

	@When("click on propose Severity")
	public void click_on_propose_severity() 
	{
		fe1.propse_severity_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter Severity and comment in propse Severity")
	public void enter_severity_and_comment_in_propse_severity() 
	{
		fe1.severity_bucket_dd();
		fe1.high_severity_ddoption();
		fe1.propose_severity_comment_field();
	}

	@Then("Bucket propse Severity finding should be there in finding_under review page")
	public void bucket_propse_severity_finding_should_be_there_in_finding_under_review_page()
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Severity should be recorded in the history tab.")
	public void propse_severity_should_be_recorded_in_the_history_tab()
	{
		fe1.common_history();
		fe1.Propose_Severity_comment_verify();
		fe1.close_popup();
	}

	@When("click on propose Category")
	public void click_on_propose_category() 
	{
		fe1.propsecategory_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter Category and comment in propse Category")
	public void enter_category_and_comment_in_propse_category() 
	{
		fe1.categeory_bucket_dd();
		fe1.Uncategorized_category_option();
		fe1.propose_category_comment_field();
	}

	@Then("Bucket propse Category finding should be there in finding_under review page")
	public void bucket_propse_category_finding_should_be_there_in_finding_under_review_page()
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Category should be recorded in the history tab.")
	public void propse_category_should_be_recorded_in_the_history_tab() 
	{
		fe1.common_history();
		fe1.Propose_category_comment_verify();
		fe1.close_popup();
	}

	@Given("filter custom findings")
	public void filter_custom_findings() throws InterruptedException 
	{
		Thread.sleep(2000);
		ele=new Elements_scans(driver); 
		ele.morefilterbtn();
		fe1.more_sourceSearch();
		fe1.souce_filter_btn();
		fe1.custom_filter_option();
		fe1.apply_filter_updated();
	}

	@When("click on propose Mitigated")
	public void click_on_propose_mitigated() 
	{
		
		fe1.propseMitigate_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter Note in propse Mitigated")
	public void enter_note_in_propse_mitigated() 
	{
	   fe1.propose_mitigated_Note();
	}

	@Then("Bucket propse Mitigated finding should be there in finding_under review page")
	public void bucket_propse_mitigated_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Mitigated should be recorded in the history tab.")
	public void propse_mitigated_should_be_recorded_in_the_history_tab() 
	{
		fe1.common_history();
		fe1.Propose_Mitigated_note_verify();
		fe1.Reject_link();
		 fe1.note_reject_fur();
		 fe1.Reject_note_btn();
		fe1.close_popup();
	}

	@When("click on propose Basic Information")
	public void click_on_propose_basic_information() 
	{
		fe1.propose_basicinformation_btn();
		fe1.bucket_Fidgettext_popup();
	}

	@When("Enter product subproduct environment and Note in propse Basic Information")
	public void enter_product_subproduct_environment_and_note_in_propse_basic_information() 
	{
	    Elements_scans ele=new Elements_scans(driver);
	    ele.productuspopup();
	    ele.productTesting_02option();
	    ele.subProductdd();
	    ele.subproducttest2o();
	    ele.environment_dd_updated();
	    ele.productionopt_environment();
	    fe1.propose_basicinformation_Note();
	}

	@Then("Bucket propse Basic Information finding should be there in finding_under review page")
	public void bucket_propse_basic_information_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.fid_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("propse Basic Information should be recorded in the history tab.")
	public void propse_basic_information_should_be_recorded_in_the_history_tab() 
	{
		fe1.common_history();
		fe1.Propose_basicinfo_note_verify();
		fe1.Reject_link();
		 fe1.note_reject_fur();
		 fe1.Reject_note_btn();
		fe1.close_popup();
	}
	
	@When("click on fining under review")
	public void click_on_fining_under_review() 
	{
	    fe1.findingsunderreview_link();
	}

	@When("click on finding id in fur")
	public void click_on_finding_id_in_fur() 
	{
	   fe1.fid_btn_fur();
	}

	@When("click on Accept and enter note")
	public void click_on_accept_and_enter_note() throws InterruptedException 
	{
	    fe1.accept_link();
	    fe1.note_accept_fur();
	    fe1.Accept_note_btn();
	    Thread.sleep(3000);
	    fe1.Refresh_popup_btn();
	}

	@Then("proposal should be accepted and recorded in hoistory tab")
	public void proposal_should_be_accepted_and_recorded_in_hoistory_tab() 
	{
		
		fe1.history();;
		fe1.Propose_fid_accept_note_verify();
		fe1.close_popup();
	}

	@When("click on Reject and enter note")
	public void click_on_reject_and_enter_note() throws InterruptedException 
	{
	    fe1.Reject_link();
	    fe1.note_reject_fur();
	    fe1.Reject_note_btn();
	    Thread.sleep(3000);
	    fe1.Refresh_popup_btn();
	}

	@Then("proposal should be rejected and recorded in hoistory tab")
	public void proposal_should_be_rejected_and_recorded_in_hoistory_tab() 
	{
		fe1.history();
		fe1.Propose_fid_Reject_note_verify();
		fe1.close_popup();   
	}

	@When("click on threedots")
	public void click_on_threedots() 
	{
	  fe1.threedot_fidpopup();
	}

	@When("click on Propose mitigated Enter note")
	public void click_on_propose_mitigated_enter_note()
	{
		fe1.proposemitigated_fid_popup();
		fe1.propose_mitigated_note_fid();
	}
	@When("click on submit nf")
	public void click_on_submit_nf() 
	{
		fe1.Submit_bucket_popup();
		fe1.done();
		fe1.findingsunderreview_link();
		fe1.fidfilter();
		fe1.search1();
		fe1.applyfilbtn();
	}
	@Then("Propse mitigated finding should be there in finding_under review page")
	public void propse_mitigated_finding_should_be_there_in_finding_under_review_page() 
	{
		fe1.fid_nf_findingsunderreview_verify();
		fe1.fid_click_findingsunderreview();
		fe1.punith_authorname_verify();
	}

	@Then("Normal flow Propse mitigated should be recorded in the history tab.")
	public void Normal_flow_propse_mitigated_should_be_recorded_in_the_history_tab() 
	{
		fe1.history();
		fe1.Propose_mitigated_fid_note_verify();
		fe1.Reject_link();
		 fe1.note_reject_fur();
		 fe1.Reject_note_btn();
		fe1.close_popup(); 
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
