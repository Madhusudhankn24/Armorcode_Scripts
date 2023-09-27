//package Stepdefinition;
//
//import java.awt.AWTException;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pageobject.Elements_scans;
//import pageobject.Finding_Element_1;
//import pageobject.Findings_elements;
//import pageobject.Login_elements;
//import pageobject.objects;
//public class Findings 
//{
//
//	public static WebDriver driver1;
//	public static WebDriverWait wait;
//	String uname ="punith.tg@3ktechnologies.com";
//	String pwd = "pUnI@0804";
//	public  objects obj;
////	public Findings_elements fe;
//	public Finding_Element_1 fe1;
//	public Login_elements le;
//	public int fid;
//	public String ftext;
//	public String ftext1;
//	public Elements_scans ele;
//
////	@Given("open the browser f")
//	@Before(order = 0)
//	public void open_the_browser_f() 
//	{
//
//		le=new Login_elements(driver1);
//		WebDriverManager.chromedriver().setup();
//		driver1= new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get(le.URL);
//	}
////	@When("log in to Armorcode application f")
//	@Before(order = 1)
//	public void log_in_to_armorcode_application_f() throws AWTException, InterruptedException 
//	{
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		le=new Login_elements(driver1);
//		le.microsoft_login_button();
//		le.un_field();
//		le.next_signin_btn();
//		le.mspassword_field();
//		driver1.findElement(By.id("idSIButton9")).click();
//		WebElement id = driver1.findElement(By.xpath("//div[@id='displayName']"));
//		wait= new WebDriverWait(driver1,Duration.ofSeconds(300));//wait
//		wait.until(ExpectedConditions.visibilityOf(id));
//		System.out.println(id.getText());
//		wait= new WebDriverWait(driver1,Duration.ofSeconds(300));//wait
//		wait.until(ExpectedConditions.elementToBeClickable(By.name("DontShowAgain")));
//		driver1.findElement(By.name("DontShowAgain")).click();
//		//driver1.findElement(By.id("KmsiCheckboxField")).click();
//		driver1.findElement(By.xpath("//div[@class='inline-block button-item ext-button-item']/input[@data-report-event='Signin_Submit']")).click();
//		System.out.println("PUNITH LOGIN Sucessfully....:-");
//	}
//	@After
//	public void close()
//	{
//		driver1.manage().deleteAllCookies();
//		driver1.quit();
//	}
//	@Given("Click on Finding tab")
//	public void click_on_finding_tab() 
//	{
////		fe1=new Findings_elements(driver1);
//		fe1=new Finding_Element_1(driver1);
//		fe1.scanstab();
//		fe1.findingtab();
//	}
//	@Then("Finding page should be loaded properly")
//	public void finding_page_should_be_loaded_properly() 
//	{
//		WebElement fidte = driver1.findElement(By.xpath("//span[.='Finding ID' and @class='ant-table-filter-column-title']"));
//		wait= new WebDriverWait(driver1,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(fidte));
//		String ftextt = fidte.getText();
//		System.out.println(ftextt);
//		Assert.assertEquals(ftextt, "Finding ID");
//	}
//	@Then("Open, Accept Risk and Confirm status filter should be applied bydefault")
//	public void open_accept_risk_and_confirm_status_filter_should_be_applied_bydefault() 
//	{
//		fe1.openfilter();
//		fe1.Ariskfilter();
//		fe1.confirmfilter();
//	}
//	@Then("Descending Sorting should be applied on Severity column bydefault.")
//	public void descending_sorting_should_be_applied_on_severity_column_bydefault() 
//	{
//		fe1.downsort();
//	}
//
//	@When("Click on Add finding and fill Details")
//	public void click_on_add_finding_and_fill_details() throws InterruptedException 
//	{
//		fe1.clear();
//		fe1.Addfinding();
//		fe1.producttextfield();
//		fe1.testing_02product();
//		fe1.subproduct();
//		fe1.sptest2o();
//		Elements_scans ele =new Elements_scans(driver1);
//		ele.environmentdd();
//		ele.productionopt_environment();
//		WebElement nextbtn=driver1.findElement(By.xpath("//span[text()='Next']"));
//		//nextbtn.click();
//		fe1.nextbtnpopup();
//		fe1.template();
//		fe1.summaryfield();
//		fe1.descriptionfield();
//		fe1.steptoreproducefield();
//		fe1.mitigationfield();
//		fe1.impactfield();
//		System.out.println(nextbtn.getText());
//		nextbtn.click();
//	}
//
//	@When("click on Submit")
//	public void click_on_submit() throws InterruptedException 
//	{
//		fe1.submit();
//	}
//
//	@Then("Sucess message should be displayed")
//	public void sucess_message_should_be_displayed()
//	{
//		WebElement sucesstext = driver1.findElement(By.xpath("//*[@aria-label='check-circle']")); 
//		wait= new WebDriverWait(driver1,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(sucesstext));
//		boolean sucesstext1 = sucesstext.isDisplayed();
//		Assert.assertEquals(sucesstext1, true);
//		System.out.println("Sucess msg is displayed---"+sucesstext1);
//		//*[@class='ant-message-custom-content ant-message-success']
//		//System.out.println("Sucess message is displayed-- "+driver1.getPageSource().contains("Successfully added new Finding"));
//		//-/div/div/div/span[2]/text()//Success!
//		//Successfully added new Finding
//		//-/html/body/div[4]/div/span/div/div/div/span[2]/strong
//	}
//
//	@Then("Finding will be added")
//	public void finding_will_be_added() 
//	{
//		// driver.findElement(By.xpath("(//span[.='Finding Age']/following-sibling::span[1])[2]")).click();
//		
//		//WebElement fewsecond = driver1.findElement(By.xpath("//span[.='a few seconds']"));
//		//boolean fewsec = fewsecond.isDisplayed();
//		//System.out.println(fewsec);
//		//Assert.assertEquals(fewsec, true);
//	}
//
//	@Given("select finding")
//	public void select_finding() throws InterruptedException 
//	{
//		fe1.clear();
//		fe1.Statusdropdown();
//		fe1.opencheckbox();
//		fe1.Applybutton();
//		//fe.first_cbox();
//		Thread.sleep(3000);
//        driver1.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]")).click();
//		/*WebElement opencbox = driver1.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]"));
//		wait= new WebDriverWait(driver1,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(opencbox));
//		JavascriptExecutor js=(JavascriptExecutor) driver1;
//		js.executeScript("arguments[0].click();",opencbox);*/
//	}
//	@Given("click on Finding Id")
//	public void click_on_finding_id11() throws InterruptedException 
//	{
//		fe1.clear();
//		fe1.Statusdropdown();
//		fe1.opencheckbox();
//		fe1.Applybutton();
//		WebElement id = driver1.findElement(By.xpath("(//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/a[1])[1]"));
//		Actions as=new Actions(driver1);
//		as.click(id).perform();
//		System.out.println(id.getText());
//	}
//
//	@When("select Accept Risk in dropdown")
//	public void select_accept_risk_in_dropdown() 
//	{
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='d-flex text-ellipsis']//div[@class='ant-dropdown-trigger d-flex align-items-center'])[2]")));
//		driver1.findElement(By.xpath("(//div[@class='d-flex text-ellipsis']//div[@class='ant-dropdown-trigger d-flex align-items-center'])[2]")).click();
//	}
//
//	@When("Enter details in Accept risk and click on Submit")
//	public void enter_details_in_accept_risk_and_click_on_submit() 
//	{
//		driver1.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("@FI-060");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Submit'and @type='submit']")));
//		driver1.findElement(By.xpath("//*[.='Submit'and @type='submit']")).click();
//	}
//
//	@Then("Accept Risk1 Status should be changed and it should be recorded in the history tab.")
//	public void accept_risk1_status_should_be_changed_and_it_should_be_recorded_in_the_history_tab() 
//	{
//
//	}
//
////Add template code	
//	
//	@When("click on addfinding and enter basic info")
//	public void click_on_addfinding_and_enter_basic_info() 
//	{
//		fe1.Addfinding();
//		fe1.producttextfield();
//		fe1.testing_02product();
//		fe1.subproduct();
//		fe1.sptest2o();
//		Elements_scans ele =new Elements_scans(driver1);
//		ele.environmentdd();
//		ele.productionopt_environment();
//		
//		fe1.Next_basic_info();
//	}
//
//	@When("click on template")
//	public void click_on_template() 
//	{
//	  fe1.template_dd();
//	 
//	}
//
//	@When("click on add template")
//	public void click_on_add_template() {
//		 fe1.Add_template_btn();
//
//	}
//
//	@When("Enter all template details")
//	public void enter_all_template_details() 
//	{
//		fe1.name_template_field();
//		fe1.summary_add_template_field();
//		fe1.description_add_template_field();
//		fe1.mitigation_add_template_field();
//		fe1.impact_add_template_field();
//		
//	}
//
//	@When("click on save")
//	public void click_on_save() 
//	{
//		fe1.save_add_template();
//	}
//
//	@Then("template should be added")
//	public void template_should_be_added() 
//	{
//	   fe1.template_verify();
//	}
//
//	@Then("data should be added as per the template")
//	public void data_should_be_added_as_per_the_template() 
//	{
//	   fe1.summary_verify();
//	   fe1.description_verify();
//	   fe1.mitigation_verify();
//	   fe1.impact_verify();
//	   fe1.close_popup();
//	}
//
//	@When("click on edit icon")
//	public void click_on_edit_icon() 
//	{
//	    fe1.edit_tag_btn();
//	}
//
//	@When("edit details in template")
//	public void edit_details_in_template() 
//	{
//		fe1.name_edit_template_field();
//	    fe1.summary_edit_template_field();
//	    fe1.description_edit_template_field();
//		fe1.mitigation_edit_template_field();
//		fe1.impact_edit_template_field();
//	}
//
//	@Then("template should be edited")
//	public void template_should_be_edited() 
//	{
//	    //fe.edit_template_verify();
//	}
//
//	@Then("Edited details should be added as per the template")
//	public void edited_details_should_be_added_as_per_the_template() 
//	{
//	  // fe.edit_summary_verify();
//	   //fe.edit_description_verify();
//	   //fe.edit_mitigation_verify();
//	   //fe.edit_impact_verify();
//	   driver1.findElement(By.name("template")).click();
//	   fe1.delete_edit_template();
//	   fe1.close_popup();
//	}
//	
//
//@When("attach file in detailed info")
//public void attach_file_in_detailed_info() 
//{
//  
//}
//
//@When("check files is displayed in details tab")
//public void check_files_is_displayed_in_details_tab() 
//{
//   
//}
//
//	@When("Enter all details in detailed info")
//	public void enter_all_details_in_detailed_info() 
//	{
//		fe1.template();
//		fe1.attachsummaryfield();
//		fe1.descriptionfield();
//		fe1.steptoreproducefield();
//		fe1.mitigationfield();
//		fe1.impactfield();
//		fe1.next_btn_detailpopup();
//	}
//
//	@When("upload file in attach file info")
//	public void upload_file_in_attach_file_info() 
//	{
//	   fe1.Attach_file_field();
//	}
//
//	@When("check finding age")
//	public void check_finding_age() 
//	{
//		//fe.main_refresh_btn();
//		driver1.navigate().refresh();
//		driver1.navigate().refresh();
//		driver1.navigate().refresh();
//		fe1.clear();
//		fe1.attach_findingage();
//	}
//	@When("check summary")
//	public void check_summary() 
//	{
//		fe1.verify_summary();
//	}
//	@When("click on finding id for attachment")
//	public void click_on_finding_id_for_attachment() 
//	{
//		fe1.attach_fid_click();
//	}
//
//	@When("check file is displayed in attachment tab")
//	public void check_file_is_displayed_in_attachment_tab() 
//	{
//	    fe1.attachment_tab();
//	    fe1.verify_attach_file();
//	}
//
//	@When("Aplly product subproduct owner filter")
//	public void aplly_product_subproduct_owner_filter() 
//	{
//		fe1.clear();
//	   ele=new Elements_scans(driver1);
//	   fe1.product_filter();
//	   fe1.search();
//	   fe1.product_testing02_option();
//	   fe1.applyfilbtn();
//	    ele.morefilterbtn();
//	    fe1.more_Search();
//	    fe1.subproduct_more_option();
//	    fe1.test20_filter_option();
//	    fe1.apply_btn_dynamic();
//	    ele.morefilterbtn();
//	    fe1.more_ownerSearch();
//	    fe1.owner_filter();
//	    fe1.punith_owner_filter_option();
//	    fe1.apply_btn_dynamic1();
//	}
//
//	@When("click on save As and enter details and save")
//	public void click_on_save_as_and_enter_details_and_save() 
//	{
//	    fe1.save_as_btn();
//	    fe1.name_field();
//	    fe1.save_btn();
//	    driver1.navigate().refresh();
//	}
//
//	@Then("specific filters should be saved and it should be displayed in saved search")
//	public void specific_filters_should_be_saved_and_it_should_be_displayed_in_saved_search() 
//	{
//	   fe1.saved_search_btn();
//	   fe1.saved_search_field();
//	   fe1.saved_search_verify();
//	   fe1.delete_saved_search();
//	   fe1.close_saved_search();
//	   
//	}
//	
//	@When("Enter text in comment")
//	public void enter_text_in_comment() 
//	{
//		fe1.finding_id_click_fe();
//		fe1.comment_field_click();
//	    fe1.comment_field();
//	    fe1.emoji_btn();
//	    fe1.smily_emoji();
//	    fe1.emoji_btn();
//	    fe1.laugh_emoji();
//	}
//
//	@When("mention person")
//	public void mention_person() 
//	{
////		fe.comment_field_click();
////	   fe.comment_field_mention();
////	   fe.mention_person();
////		
//////	   fe.comment_field();
////	  // fe.attachment_btn();
//	}
//
//	@When("click on comment")
//	public void click_on_comment() 
//	{
//		fe1.comment_btn();
//	}
//
//	@Then("comment should be added")
//	public void comment_should_be_added() 
//	{
//	    fe1.comment_txt_verify();
//	    fe1.close_popup();
//	}
//
//	@When("click on saved search")
//	public void click_on_saved_search() 
//	{
//		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
//		fe1.saved_search_btn();
//	}
//
//	@When("click on schedule and enable schedule")
//	public void click_on_schedule_and_enable_schedule() 
//	{
//	   fe1.schedule_btn();
//	   fe1.schedule_togle();
//	}
//
//	@When("select user")
//	public void select_user() 
//	{
//	  fe1.user_field();
//	  //fe.user_field_input();
//	  //fe.punith_user_ss();
//	}
//
//	@When("click on save in saved search")
//	public void click_on_save_in_saved_search() 
//	{
//		fe1.save_btn();
//	}
//
//	@Then("message should be displayed")
//	public void message_should_be_displayed() 
//	{
//	   fe1.saved_search_popup_verify();
//	}
//	@Then("clear schedule")
//	public void clear_schedule() 
//	{
//		 fe1.schedule_btn();
//		   fe1.schedule_togle();
//		   fe1.user_close();
//		   fe1.save_btn();
//	   fe1.close_saved_search();
//	}
//	@When("select Teams name")
//	public void select_teams_name() 
//	{
//	   fe1.teams_btn();
//	   fe1.punith_team();
//	}
//	@Given("filter high severity1")
//	public void filter_high_severity1()
//	{
//		fe1.clear();
//		fe1=new Finding_Element_1(driver1);
//		fe1.main_severity_dd();
//		fe1.highcheckbox();
//		fe1.Applybutton();
//	}
//	@Then("clear schedule team")
//	public void clear_schedule_team() 
//	{
//		 fe1.schedule_btn();
//		   fe1.schedule_togle();
//		   fe1.teams_close();
//		   fe1.save_btn();
//	   fe1.close_saved_search();
//	}
//	@When("click on click here")
//	public void click_on_click_here() 
//	{
//	   fe1.allcbox();
//	   fe1.click_here();
//	}
//
//	@Then("create ticket and mitigated and propose mitigated should be disabled")
//	public void create_ticket_and_mitigated_and_propose_mitigated_should_be_disabled() 
//	{
//	  fe1.create_ticket_verify();
//	  fe1.threedots_main();
//	  fe1.mitigated_veify_thredot();
//	  fe1.propose_mitigated_veify_thredot();
//	  fe1.clear();
//	}
//	@Given("Get counts in basic filter")
//	public void get_counts_in_basic_filter() 
//	{
//			fe1.allcbox();
//		 fe1.old_filter_count();
//		 fe1.allcbox();
//	}
//
//	@When("click on Switch to AQL")
//	public void click_on_switch_to_aql() 
//	{
//	    fe1.switch_Aql_btn();
//	}
//
//	@Then("check same count is displayed in aql filter")
//	public void check_same_count_is_displayed_in_aql_filter() 
//	{
//		fe1.aql_filter_verify();
//	   fe1.allcbox();
//	   fe1.aql_filter_count();
//	   fe1.allcbox();
//	   fe1.reset_aql_filter();
//	}
//}
