package Stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.service.ExtentService;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Alerts_Elements;
import pageobject.Elements_scans;
import pageobject.Finding_Element_1;
import pageobject.Login_elements;
import pageobject.objects;

public class Scans 
{
	public static WebDriver driver;
	public  WebDriverWait wait;
	String uname ="punith.tg@3ktechnologies.com";//amrutha.tv@3ktechnologies.com
	String pwd = "pUnI@0804";
	public  objects obj;
	public Elements_scans ele;
	public Alerts_Elements ale;
	public Login_elements le;

	@Given("open the browser3")
	public void open_the_browser3() 
	{

		le=new Login_elements(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(le.URL);
		Capabilities cap=((RemoteWebDriver) driver).getCapabilities();
		ExtentReports extent =ExtentService.getInstance();
		extent.setSystemInfo("OS",System.getenv("OS"));
		extent.setSystemInfo("User Name",System.getenv("USERNAME"));
		extent.setSystemInfo("Browser Name",cap.getBrowserName());
		extent.setSystemInfo("Browser Version",cap.getBrowserVersion());
	}
	@When("log in to Armorcode application3")
	public void log_in_to_armorcode_application3() throws AWTException, InterruptedException 
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
	/*
	@Given("open the Chrome application1")
	public void open_the_chrome_application() 
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		Capabilities cap=((RemoteWebDriver) driver).getCapabilities();
		ExtentReports extent =ExtentService.getInstance();
		extent.setSystemInfo("OS",System.getenv("OS"));
		extent.setSystemInfo("User Name",System.getenv("USERNAME"));
		extent.setSystemInfo("Browser Name",cap.getBrowserName());
		extent.setSystemInfo("Browser Version",cap.getBrowserVersion());
	}
	//@Before(order=1)	
	public void setenvironmentvariables() {
		
		Capabilities cap=((RemoteWebDriver) driver).getCapabilities();
		ExtentReports extent =ExtentService.getInstance();
		extent.setSystemInfo("OS",System.getenv("OS"));
		extent.setSystemInfo("User Name",System.getenv("USERNAME"));
		extent.setSystemInfo("Browser Name",cap.getBrowserName());
		extent.setSystemInfo("Browser Version",cap.getBrowserVersion());
	}
	@When("login to Armorcode1")
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
*/
	@Then("Dashboard page should be displayed1")
	public void dashboard_page_should_be_displayed() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(10)); 
		Thread.sleep(10000);
		String data1 = "Enterprise Product Matrix";
		boolean Actualtext = driver.getPageSource().contains(data1);
		System.out.println(Actualtext);
	}
	@Given("click on scans tab")
	public void click_on_scans_tab() throws InterruptedException 
	{
	
		ele=new Elements_scans(driver);
		ale= new Alerts_Elements(driver);
		ale.alerts_tab_btn();
		Thread.sleep(2000);
		ele.scanstab();
	}

	@When("Clear filter")
	public void clear_filter() 
	{
		try
		{ele.clearbtn();}
		catch (Exception e) {System.out.println("button not there");}
	}

	@When("check ten\\/page filter")
	public void check_ten_page_filter() throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<4; i++)
		{js.executeScript("window.scrollBy(0,500)");}
		ele.paginationbtn();
		ele.tenpageopt();

	}

	@Then("ten\\/page scans should be displayed")
	public void ten_page_scans_should_be_displayed() throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<4; i++)
		{js.executeScript("window.scrollBy(0,-500)");}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]")).click();
		WebElement text = driver.findElement(By.xpath("//*[@class='border-right p-r-xs']"));
		String ten = text.getText();
		System.out.println(ten);
		Assert.assertEquals(ten, "Selected 10");

	}

	@When("check twenty\\/page filter")
	public void check_twenty_page_filter() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
		js.executeScript("arguments[0].click();", fc);
		for(int i=0; i<4; i++)
		{js.executeScript("window.scrollBy(0,500)");}
		ele.paginationbtn();
		ele.twentypageopt();
	}
	@Then("twenty\\/page scans should be displayed")
	public void twenty_page_scans_should_be_displayed() throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<8; i++)
		{js.executeScript("window.scrollBy(0,-500)");}
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("plus-more")));
		for(int i=0; i<=2;i++)
		{
			Thread.sleep(2000);
			WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
			js.executeScript("arguments[0].click();", fc);
		}
		WebElement text1 = driver.findElement(By.xpath("//*[@class='border-right p-r-xs']"));
		String twenty= text1.getText();
		System.out.println(twenty);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class='border-right p-r-xs']"), twenty));
		Assert.assertEquals(twenty, "Selected 20");
	}

	@When("check fifty\\/page filter")
	public void check_fifty_page_filter() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
		js.executeScript("arguments[0].click();", fc);
		//
		//for(int i=0; i<4; i++)
		//{js.executeScript("window.scrollBy(0,500)");}
		ele.paginationbtn();
		ele.fiftypageopt();
	}
	@Then("fifty\\/page scans should be displayed")
	public void fifty_page_scans_should_be_displayed() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<8; i++)
		{js.executeScript("window.scrollBy(0,-500)");}
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("plus-more")));
		for(int i=0; i<=2;i++)
		{
			Thread.sleep(2000);
			WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
			js.executeScript("arguments[0].click();", fc);
		}
		WebElement text2 = driver.findElement(By.xpath("//*[@class='border-right p-r-xs']"));
		String fifty = text2.getText();
		System.out.println(fifty);
		Assert.assertEquals(fifty, "Selected 50");
	}

	@When("check hundred\\/filter")
	public void check_hundred_filter() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
		js.executeScript("arguments[0].click();", fc);

		//for(int i=0; i<4; i++)
		//{js.executeScript("window.scrollBy(0,500)");}
		ele.paginationbtn();
		ele.hubdredpageopt();
	}
	@Then("hundred\\/page scans should be displayed")
	public void hundred_page_scans_should_be_displayed() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<25; i++)
		{js.executeScript("window.scrollBy(0,-500)");}
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("plus-more")));
		for(int i=0; i<=2;i++)
		{
			Thread.sleep(2000);
			WebElement fc = driver.findElement(By.xpath("(//input[@type='checkbox']/..)[1]"));
			js.executeScript("arguments[0].click();", fc);
		}
		WebElement text3 = driver.findElement(By.xpath("//*[@class='border-right p-r-xs']"));
		String hundred = text3.getText();
		System.out.println(hundred);
		Assert.assertEquals(hundred, "Selected 100");

	}


	@When("click on Environment sorting")
	public void click_on_environment_sorting() 
	{
		ele.upsort();

	}
	@Then("asecnding Sorting should be displayed")
	public void asecnding_sorting_should_be_displayed() 
	{
		WebElement prtext = driver.findElement(By.xpath("(//*[.='Production'])[1]"));
		String pt = prtext.getText();
		Assert.assertEquals(pt, "Production");
	}

	@When("click on Actiondots")
	public void click_on_actiondots() 
	{
		ele.Actionthreedots();
	}
	@When("click on export report")
	public void click_on_export_report() 
	{
		ele.exportpdfbyn();
	}
	@Then("Report should be downloaded")
	public void Report_should_be_downloaded() 
	{
		System.out.println("downloaded");
	}

	@When("click on Upload scan button")
	public void click_on_upload_scan_button() 
	{
		ele.uploadbtn();
	}
	@Then("Scan Upload popup should be displayed")
	public void scan_upload_popup_should_be_displayed() 
	{
		WebElement uploadscan = driver.findElement(By.xpath("//*[.='Scan Upload']/div"));
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(uploadscan));
		String ustext = uploadscan.getText();
		System.out.println(ustext);
		Assert.assertEquals(ustext, "Scan Upload");
		driver.findElement(By.xpath("//*[@aria-label='close']")).click();
	}

	@When("Mousehover on export report")
	public void mousehover_on_export_report() 
	{
		ele.mshover();
	}
	@Then("filename tooltip should be displayed")
	public void filename_tooltip_should_be_displayed() 
	{
		System.out.println("displayed");
	}

	@When("Apply new filter")
	public void apply_new_filter() throws InterruptedException 
	{
		ele.morefilterbtn();
		ele.newfilter_dd_opt();
		ele.newfilteroption();
		ele.Applybtn();
		ele.firstscanid();
	}
	@When("click on Result details")
	public void click_on_result_details() throws InterruptedException 
	{
		ele.resultdetailseye();
	}
	@Then("User should redirected to Findings page for that particular scan")
	public void user_should_redirected_to_findings_page_for_that_particular_scan() 
	{
		ele.scanfilter();
	}
	//
	public String initialPageSource;
	@When("click on refresh")
	public void click_on_refresh() 
	{
		initialPageSource = driver.getPageSource();
		driver.navigate().refresh();
	}
	@Then("Scan page should be refreshed")
	public void scan_page_should_be_refreshed() 
	{
		String refreshedPageSource = driver.getPageSource();
		Assert.assertNotEquals(initialPageSource, refreshedPageSource);//"Page was not refreshed!", 
	}
	//@SC-012
	@When("check scan tool")
	public void check_scan_tool() 
	{
		ele.customtext();
	}

	@When("click on scan id")
	public void click_on_scan_id() 
	{
		ele.clickfirstsid();
	}

	@Then("Redirecting to finding page and scan tool soruce should be same")
	public void redirecting_to_finding_page_and_scan_tool_soruce_should_be_same() throws InterruptedException 
	{
//		WebElement customtext = driver.findElement(By.xpath("(//*[.='Custom'])[1]"));
//		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(customtext));
//		String fidcustomtxt = customtext.getText();
//		System.out.println(fidcustomtxt);
//		Assert.assertEquals(fidcustomtxt, "Custom");
		
	}
	//tooltip
	@When("mousehover on clear button")
	public void mousehover_on_clear_button() 
	{
		ele.clearbtn_for_tooltip();
	}

	@Then("clear button Tooltip should be displayed")
	public void clear_button_tooltip_should_be_displayed() 
	{
		ele.Cleartooltip();
	}

	@When("mousehover on More button")
	public void mousehover_on_more_button() 
	{
		ele.more_for_tooltip();
	}

	@Then("More button Tooltip should be displayed")
	public void more_button_tooltip_should_be_displayed() 
	{
		System.out.println("tooltip is not displayed in manual testing");
	}

	@When("mousehover on Upload_scan button")
	public void mousehover_on_upload_scan_button() 
	{
		ele.upload_btn_mousehover();
	}
	@Then("Upload_scan button Tooltip should be displayed")
	public void upload_scan_button_tooltip_should_be_displayed() 
	{
		System.out.println("tooltip is not displayed in manual testing");
	}
	@When("mousehover on Reset_filter button")
	public void mousehover_on_reset_filter_button() 
	{
		ele.filterelementbtn();
	}

	@Then("Reset_filter button Tooltip should be displayed")
	public void reset_filter_button_tooltip_should_be_displayed() {
		ele.filterelement_tooltip();
	}

	@When("mousehover on Additional_columns button")
	public void mousehover_on_additional_columns_button() 
	{
		ele.tablebtn();
	}

	@Then("Additional_columns button Tooltip should be displayed")
	public void additional_columns_button_tooltip_should_be_displayed() {
		ele.Addi_column_tooltip();
	}

	@When("mousehover on Refresh button")
	public void mousehover_on_refresh_button() {
		ele.refreshbtn();
	}

	@Then("Refresh button Tooltip should be displayed")
	public void refresh_button_tooltip_should_be_displayed() {
		ele.refreshtooltip();
	}

	@When("mousehover on ascending_sort button")
	public void mousehover_on_ascending_sort_button() 
	{
		ele.scanidbtn();
	}

	@Then("ascending_sort button Tooltip should be displayed")
	public void ascending_sort_button_tooltip_should_be_displayed() {
		ele.ascendingtooltip();
	}

	@When("mousehover on descending_sort button")
	public void mousehover_on_descending_sort_button() {
		ele.scanidbtn_click();
	}

	@Then("descending_sort button Tooltip should be displayed")
	public void descending_sort_button_tooltip_should_be_displayed() {
		ele.descendingtooltip();
	}

	@When("mousehover on cancel_sort")
	public void mousehover_on_cancel_sort()
	{
		ele.scanidbtn_click1();
	}

	@Then("cancel_sort button Tooltip should be displayed")
	public void cancel_sort_button_tooltip_should_be_displayed() {
		ele.cancel_sort_tooltip();
	
	}
	//scan1_page

	@Then("Eror message should be displayed in all field")
	public void eror_message_should_be_displayed_in_all_field() 
	{
		ele.product_alert_msg();
		ele.sub_product_alert_msg();
		ele.environment_alert_msg();
		ele.scantool_alert_msg();
		ele.uploadfile_alert_msg();
		ele.cancelpopup();
	}

	@When("Fill environment and sacn_tool field")
	public void fill_environment_and_sacn_tool_field() 
	{
		ele.environment_dd_updated();;
		ele.productionopt_environment();
		ele.scantooldd();
	}

	@Then("Eror message should be displayed in environment and sacn_tool field")
	public void eror_message_should_be_displayed_in_environment_and_sacn_tool_field()
	{
		ele.product_alert_msg();
		ele.sub_product_alert_msg();
		ele.uploadfile_alert_msg();
		ele.cancelpopup();
	}

	@When("fill product subproduct and environment field")
	public void fill_product_subproduct_and_environment_field() 
	{
		ele.productuspopup();
		ele.productTesting_02option();
		ele.subProductdd();
		ele.subproducttest2o();
		ele.environment_dd_updated();
		ele.productionopt_environment();
	}

	@Then("Eror message should be displayed in sacn_tool field")
	public void eror_message_should_be_displayed_in_sacn_tool_field() 
	{
		ele.scantool_alert_msg();
		ele.uploadfile_alert_msg();
		ele.cancelpopup();
	}
	@When("fill required fields in upload scan page")
	public void fill_required_fields_in_upload_scan_page() 
	{
		ele.productuspopup();
		ele.productTesting_02option();
		ele.subProductdd();
		ele.subproducttest2o();
		ele.environment_dd_updated();
		ele.productionopt_environment();
		ele.scantooldd();
	}
	@When("upload sonarqube file in upload scan page")
	public void upload_sonarqube_file_in_upload_scan_page() 
	{
		ele.invalidupload();
	}
	@When("click on upload button")
	public void click_on_upload_button() 
	{
		ele.uploadbtninscanpopup();
	}
	@Then("Sucess message should be displayed in scans")
	public void sucess_message_should_be_displayed_in_scans() 
	{
		WebElement sucesselement = driver.findElement(By.xpath("//*[@class='ant-message-custom-content ant-message-success']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(sucesselement));
		boolean sucess = driver.getPageSource().contains("Success!");
		Assert.assertEquals(sucess, true);
		boolean uploadmsg = driver.getPageSource().contains("File uploaded successfully");
		Assert.assertEquals(uploadmsg, true);
		
	}
	@Then("cross icon should be displayed in scan status")
	public void cross_icon_should_be_displayed_in_scan_status() 
	{
		ele.scan_id();
		ele.scantool_verify();
		ele.crossmarkimage();
		
	}

	@When("upload .exe file")
	public void upload_exe_file() 
	{
		ele.exefileupload();

	}
	@Then("Error msg should be displayed in .exe")
	public void error_msg_should_be_displayed_in_exe() 
	{
		WebElement failedelement = driver.findElement(By.xpath("//*[@class='ant-message-custom-content ant-message-error']"));
		wait= new WebDriverWait(driver,Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(failedelement));
		boolean failed = driver.getPageSource().contains("Failed!");
		Assert.assertEquals(failed, true);
		boolean failedtext = driver.getPageSource().contains("chromedriver.exe is of invalid format");
		Assert.assertEquals(failedtext, true);
		Finding_Element_1 fe1=new Finding_Element_1(driver);
		fe1.close_popup();
		//Failed!
		//chromedriver.exe is of invalid format
	}

	@When("upload valid file")
	public void upload_valid_file() throws IOException, InterruptedException 
	{
		ele.validuploadscanfield();
	}


	@Then("tick mark icon should be displayed in scan status")
	public void tick_mark_icon_should_be_displayed_in_scan_status() 
	{
		ele.scan_id();
		ele.scantool_verify();
		ele.tickmarkimage();
	}

	@When("upload empty file")
	public void upload_empty_file() 
	{
		ele.emptyfileupload();
	}

	@Then("Should show - in Total, Duplicate, Resolved and New field")
	public void should_show_in_total_duplicate_resolved_and_new_field() 
	{
		ele.total_field_text();
		ele.duplicate_field_text();
		ele.resolved_field_text();
		ele.new_field_text();
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
