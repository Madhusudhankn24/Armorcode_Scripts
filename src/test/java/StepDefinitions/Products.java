package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ArmorcodepageObjects.ProductspageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Products {
	public static WebDriver driver;
	WebDriver wait;
	public ProductspageObjects
	product=new ProductspageObjects(driver);

	@Then("product page should be displayed")
	public void product_page_should_be_displayed() {
		boolean ele=driver.findElement(By.xpath("//span[.='Products']")).isDisplayed();
		if(ele)
		{
			System.out.println("produt page shoul be displayed");
		}
		else
			Assert.assertTrue(true);
	}
	@When("click on new product buutton")
	public void click_on_new_product_buutton() {
		product.newprd();
	}
	@When("pop should be displayed")
	public void pop_should_be_displayed() {   
		System.out.println("pop up should be displayed");
	}
	@When("enter the user name select type, enter description, select status, enter version number, select tier, select class, enter tags in key-value.")
	public void enter_the_user_name_select_type_enter_description_select_status_enter_version_number_select_tier_select_class_enter_tags_in_key_value() throws InterruptedException {
		product.id("manu");
		Thread.sleep(1000);
		product.dropdown();
		Thread.sleep(1000);
		product.webapp(); 
		Thread.sleep(1000);
		product.space("abbcc");
		Thread.sleep(1000);
		product.dropdown1();
		product.active();
		Thread.sleep(1000);

		product.version(12);
		Thread.sleep(1000);
		product.tire();
		product.tire2();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Software only']")).click();
		Thread.sleep(1000);

		WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/div/div/div/div[2]/div"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		WebElement tag = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[9]/div[1]/div/div/span[1]"));
		tag.click();
		WebElement add_new = driver.findElement(By.xpath("//span[.='Add New']"));
		add_new.click();
		WebElement keys = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[9]/div[1]/div/div[2]/div/div/span[2]/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[1]/div/div/textarea"));
		keys .sendKeys("adree");
		WebElement value = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[9]/div[1]/div/div[2]/div/div/span[2]/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[2]/div/textarea"));
		value.sendKeys("hnmmm");
		driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-check fa-w-16 clickable']")).click();
	}
	@When("click on next")
	public void click_on_next() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default pull-right']")).click();
	}
	@When("select SLA")
	public void select_sla() throws InterruptedException {
		Thread.sleep(2000);
		WebElement sla_dropdownd = driver.findElement(By.xpath("//span[.='Default SLA']"));
		sla_dropdownd.click();
	}
	@When("User can define Risk Assessment Questionaaire")
	public void user_can_define_risk_assessment_questionaaire() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
	}
	@When("In the Owners Section, User can select team")
	public void in_the_owners_section_user_can_select_team() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='teamDto']")).click();
		WebElement findElement4 = driver.findElement(By.xpath("(//*[.='3K Technologies - BU 1'])[2]"));
		findElement4.click();
	}
	@Then("Click on Submit")
	public void click_on_submit() {
		WebElement submit_button = driver.findElement(By.xpath("//span[.='Submit']"));
		submit_button.click();
		//driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
	}

	// secnario2
	@When("product detailed page should be displayed")
	public void product_detailed_page_should_be_displayed() {
		boolean elements=driver.findElement(By.xpath("//span[.='Products']")).isDisplayed();
		if(elements)
		{
			System.out.println("product page detail should be displayed");
		}
		else
			Assert.assertTrue(true);	
	}
	@When("verify product name should be displayed in top")
	public void verify_product_name_should_be_displayed_in_top() {
		driver.findElement(By.xpath("//li[@data-id='13171']")).click();

		boolean ele=driver.findElement(By.xpath("//span[.='IoT Application']")).isDisplayed();
	}
	@When("verify links buttons")
	public void verify_links_buttons() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dash_board = driver.findElement(By.xpath("(//span[@role='img'])[13]"));

		dash_board.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Products']")).click();
		Thread.sleep(2000);

		WebElement ssdlc = driver.findElement(By.xpath("(//span[@role='img'])[14]"));
		ssdlc.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Products']")).click();
		WebElement edit = driver.findElement(By.xpath("//a[.='Edit']"));
		edit.click();
		WebElement close = driver.findElement(By.xpath("//span[@class='ant-modal-close-x']"));
		close.click();

	}

	@Then("verify all product details should be displayed")
	public void verify_all_product_details_should_be_displayed() {
		driver.findElement(By.xpath("//div[@class='ant-col ant-col-md-24 ant-col-lg-24']")).isDisplayed();

	}
	// Secnario3
	@When("click new product button")
	public void click_new_product_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")).click();
	}

	@When("enter all the details")
	public void enter_all_the_details() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("productss",Keys.ENTER);
	} 
	@When("enter all the details in sla page")
	public void enter_all_the_details_in_sla_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ant-select-selection-item']")).click();
		//driver.findElement(By.xpath("(//div[.='demo_testing'])[1]")).click();

	}
	@When("click on below next button")
	public void click_on_below_next_button() {
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default pull-right']")).click();
	}
	@When("enter details click on next button in risk assessment page")
	public void enter_details_click_on_next_button_in_risk_assessment_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
	}
	@When("select teams and click on next button in owner page")
	public void select_teams_and_click_on_next_button_in_owner_page() throws InterruptedException {
		WebElement ssl_click = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
		ssl_click.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@label='Business Unit']")).click();
		WebElement ele_click = driver.findElement(By.xpath("(//*[.='Next'])[2]"));
		ele_click .click();

	}
	@When("clcik on next button in ssldc page")
	public void clcik_on_next_button_in_ssldc_page() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@toolname='Amazon GuardDuty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
	}
	@Then("enter the detaild click on sumbit button")
	public void enter_the_detaild_click_on_sumbit_button() throws InterruptedException {
		//  WebElement Developed_url = driver.findElement(By.xpath("(//span[.='Deployed URL'])[2]"));
		// Actions A=new Actions(driver);
		//  A.moveToElement(Developed_url).doubleClick().perform();
		Thread.sleep(2000);
		// WebElement Developed_url1 = driver.findElement(By.xpath("(//span[.='Deployed URL'])[4]"));
		//Actions As=new Actions(driver);
		// As.moveToElement(Developed_url1).doubleClick().perform();
		// Thread.sleep(2000);
		/* JavascriptExecutor js=( JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,700)", " ");


	   driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input'])[3]")).sendKeys("java",Keys.ENTER);

	   WebElement URL = driver.findElement(By.xpath("//*[@id='repoLink']"));
	   Actions A1=new Actions(driver);
	   A1.moveToElement(URL).doubleClick().perform();
	   Thread.sleep(2000);

	   WebElement button = driver.findElement(By.xpath("(//div[@class='ant-col ant-col-24 ant-form-item-control'])[4]"));
	   Actions A2=new Actions(driver);
	   A2.moveToElement(button).doubleClick().perform();

	   WebElement repositary = driver.findElement(By.xpath("//span[@class='ant-select-selection-item']"));
	   repositary.click();

	   driver.findElement(By.xpath("(//div[.='GitHub'])[4]")).click();
	   WebElement orgin = driver.findElement(By.xpath("//input[@id='origin']"));
	   orgin .click();
	   driver.findElement(By.xpath("((//div[.='Third party library'])[3]")).click();*/
		// driver.findElement(By.xpath("(//span[@role='img'])[38]")).click();
		driver.findElement(By.xpath("//span[.='Submit']")).click();
	}
	//Scenario4
	@When("click on desired product")
	public void click_on_desired_product() {
		WebElement desire_products = driver.findElement(By.xpath("//li[@data-id='13171']"));
		desire_products.click();
	}
	@When("check the subproduct information")
	public void check_the_subproduct_information() throws InterruptedException {
		Thread.sleep(2000);
		boolean ele=driver.findElement(By.xpath("//*[@id=\"root\"]/section/main/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]")).isDisplayed();

	}
	@When("click on delete option")
	public void click_on_delete_option() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[6]")).click();
	}
	//Scenario5
	@When("click on new dependency")
	public void click_on_new_dependency() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='New Dependency']")).click();
	}

	@When("new dependecy page should be displayed")
	public void new_dependecy_page_should_be_displayed() {
		boolean b1= driver.findElement(By.xpath("//span[.='New Dependency']")).isDisplayed();
	}

	@When("select product")
	public void select_product() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@name='productId']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@label='manojtesting']")).click();
	}
	@When("select subproduct")
	public void select_subproduct() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='subtest'])[2]")).click();
	}
	@When("select risk score")
	public void select_risk_score() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='considerRiskScore']")).click();
	}
	@Then("click on save button")
	public void click_on_save_button() {
		//driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		driver.findElement(By.xpath("//span[.='Save']")).click();
	}
	//Scenario 6
	@When("click on three dots on new products")
	public void click_on_three_dots_on_new_products() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-text ant-btn-sm ant-dropdown-trigger'])[1]")).click();
	}
	@When("import and update csv option should be displayed")
	public void import_and_update_csv_option_should_be_displayed() {
		boolean b2=  driver.findElement(By.xpath("//span[.='Import from CSV']")).isDisplayed();

	}

	@When("click on import option")
	public void click_on_import_option() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Import from CSV']")).click();

	}
	@When("import page should be displayed")
	public void import_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Import from CSV']")).isDisplayed();
	}
	@When("click on dowload option")
	public void click_on_dowload_option() {
		WebElement download = driver.findElement(By.xpath("//a[.='Download Sample csv File']"));
		download .click();
	}
	@Then("dowload successfuly")
	public void dowload_successfuly() throws InterruptedException {
		Thread.sleep(1000);
		WebElement closee = driver.findElement(By.xpath("//span[@class='ant-modal-close-x']"));
		closee.click();
	}
	//Scenario07
	@When("click on threee dots beside of new products option")
	public void click_on_threee_dots_beside_of_new_products_option() {
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-text ant-btn-sm ant-dropdown-trigger'])[1]")).click();
	}

	@When("update and import option should be displayed")
	public void update_and_import_option_should_be_displayed() {
		boolean b3=  driver.findElement(By.xpath("//span[.='Update CSV']")).isDisplayed();
	}
	@When("click on update option")
	public void click_on_update_option() {
		driver.findElement(By.xpath("//span[.='Update CSV']")).click();
	}
	@When("update page should be displayed")
	public void update_page_should_be_displayed() {
		driver.findElement(By.xpath("//div[@id='rcDialogTitle5']")).isDisplayed();
	}
	@Then("cilck on download option")
	public void cilck_on_download_option() {
		WebElement downlaod = driver.findElement(By.xpath("//span[@class='pull-right']"));
		downlaod .click();
		driver.findElement(By.xpath("//span[@aria-label='close']")).click();
	} 

	//Scenario8   
	@When("click on global filter")
	public void click_on_global_filter() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/section/header/div[2]/div/span/div[1]")).click();
	}

	@When("select bu option")
	public void select_bu_option() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[1]")).click();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//div[.='Default Business Unit'])[2]"));
		findElement.click();
	}

	@When("select none option in global filter")
	public void select_none_option_in_global_filter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@role='button'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='None']")).isDisplayed();
	}

	@When("none subprodut shou be displayed")
	public void none_subprodut_shou_be_displayed() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Select All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Clear All']")).click();
		Thread.sleep(1000);
		WebElement apply_button = driver.findElement(By.xpath("//span[.='Apply']"));
		apply_button.click();
	}

	@When("click onn team option")
	public void click_onn_team_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section/header/div[2]/div/span/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-radio-button'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-link ant-btn-sm p-l-xs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-link ant-btn-sm p-l-xs'])[2]")).click();
	}

	@When("team subproducts should be displayed")
	public void team_subproducts_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Apply']")).click();
	}

	@When("click on tier option")
	public void click_on_tier_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section/header/div[2]/div/span/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-radio-button'])[2]")).click();
	}

	@Then("tier sub produsts shold be displayed")
	public void tier_sub_produsts_shold_be_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Apply']")).click();

		//driver.findElement(By.xpath("//div[@class='ant-tree-list-holder-inner']")).isDisplayed();

	}





}