package ArmorcodepageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DashboardPageObjects {

	private WebDriver driver;
	private WebDriverWait wait;
	public JavascriptExecutor Js;

	public DashboardPageObjects(WebDriver driver){
		this.driver = driver;
	}
	/*
	 *   @DASH-018
  Scenario: Date filter with different custom date range and with Common options.
	 *
	 */
	private By Dashboard_Dropdown = By.xpath("//span[@title='Security']");
	public WebElement Dashboard_Dropdown() {
		wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_Dropdown));
		return driver.findElement(Dashboard_Dropdown);
	}
	private By Dashboard_All_BU_option = By.xpath("//div[.='All Business Units']/div");
	public WebElement Dashboard_All_BU_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_All_BU_option));
		return driver.findElement(Dashboard_All_BU_option);
	}
	private By Date_Filter = By.xpath("//button[@type='button']//div//span//span[@role='img']");
	public WebElement Date_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_Filter));
		return driver.findElement(Date_Filter);
	}
	private By Date_range_from = By.cssSelector("td[title='2023-09-01'] div");
	public WebElement Date_range_from() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_range_from));
		return driver.findElement(Date_range_from);
	}
	private By Date_range_to = By.cssSelector("td[title='2023-09-02'] div");
	public WebElement Date_range_to() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_range_to));
		return driver.findElement(Date_range_to);
	}
	private By Date_Apply_button = By.xpath("//span[normalize-space()='Apply']");
	public WebElement Date_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_Apply_button));
		return driver.findElement(Date_Apply_button);
	}
	private By Date_clear_button = By.xpath("//span[normalize-space()='Clear']");
	public WebElement Date_clear_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_clear_button));
		return driver.findElement(Date_clear_button);
	}
	private By Date_common_options = By.xpath("//li[normalize-space()='Last 24 hour']");
	public WebElement Date_common_options() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Date_common_options));
		return driver.findElement(Date_common_options);
	}
	private By Notification_popup_close = By.xpath("/html/body/div[5]/div/span/div/div/div/span/span");
	public WebElement Notification_popup_close() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Notification_popup_close));
		return driver.findElement(Notification_popup_close);
	}
	/*
	 *   @DASH-019
  Scenario: Verify Customize Dashboard
	 *
	 */
	private By Create_Dashboard_button = By.xpath("//span[.='Create Dashboard']");
	public WebElement Create_Dashboard_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Create_Dashboard_button));
		return driver.findElement(Create_Dashboard_button);
	}
	private By Custom_dashboard_page = By.xpath("(//div[.='Select Widgets'])[1]");
	public WebElement Custom_dashboard_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dashboard_page));
		return driver.findElement(Custom_dashboard_page);
	}
	/*
	 *   @DASH-020
  Scenario: Verify Customize Dashboard Search field
	 *
	 */
	private By Search_widget_field = By.xpath("//input[@placeholder='Search widgets']");
	public void Search_widget_field(String widget) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Search_widget_field));
		driver.findElement(Search_widget_field).sendKeys(widget);
	}
	private By Displayed_widget = By.xpath("//div[.='Enterprise Product Matrix']");
	public WebElement Displayed_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_widget));
		return driver.findElement(Displayed_widget);
	}
	private By Related_widget = By.xpath("//h5[.='Enterprise Product Matrix']");
	public WebElement Related_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Related_widget));
		return driver.findElement(Related_widget);
	}
	/*
	 *   @DASH-023
  Scenario: Verify Customize Dashboard cancel field
	 *
	 */
	private By Custom_daahboad_cancel_button = By.xpath("//button[.='Cancel']");
	public WebElement Custom_daahboad_cancel_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_daahboad_cancel_button));
		return driver.findElement(Custom_daahboad_cancel_button);
	}
	/*
	 *   @DASH-024
  Scenario: Verify Customize Dashboard Next field
	 *
	 */
	private By Add_Custom_widget = By.xpath("(//div)[130]");
	public WebElement Add_Custom_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_Custom_widget));
		return driver.findElement(Add_Custom_widget);
	}
	private By Custom_widget_Next_button = By.xpath("//button[.='Next']");
	public WebElement Custom_widget_Next_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_widget_Next_button));
		return driver.findElement(Custom_widget_Next_button);
	}
	private By Edit_next_button = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[3]/div[2]/div[2]/button[2]/span");
	public WebElement Edit_next_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Edit_next_button));
		return driver.findElement(Edit_next_button);
	}
	private By widget_next_page = By.xpath("//label[normalize-space()='Select Products/Subproducts']");
	public WebElement widget_next_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(widget_next_page));
		return driver.findElement(widget_next_page);
	}
	/*
	 *   @DASH-025
  Scenario: Verify Customize Dashboard Add Name field.
	 *
	 */
	private By Custom_dashboard_name = By.xpath("//input[@id='name']");
	public void Custom_dashboard_name(String new_name) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dashboard_name));
		driver.findElement(Custom_dashboard_name).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		driver.findElement(Custom_dashboard_name).sendKeys(new_name);
	}
	private By Custom_dashboard_save_button = By.xpath("//button[.='Save']/span");
	public WebElement Custom_dashboard_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dashboard_save_button));
		return driver.findElement(Custom_dashboard_save_button);
	}
	private By dashboard_created_popup = By.xpath("//body/div/div/span/div/div/div/span[2]");
	public WebElement dashboard_created_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashboard_created_popup));
		return driver.findElement(dashboard_created_popup);
	}
	private By Created_dashboard_popup_close = By.xpath("//span[.='x']");
	public WebElement Created_dashboard_popup_close() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Created_dashboard_popup_close));
		return driver.findElement(Created_dashboard_popup_close);
	}
	private By dashboard_dp = By.xpath("//span[@title='demo']");
	public WebElement dashboard_dp() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashboard_dp));
		return driver.findElement(dashboard_dp);
	}
	private By Created_Dashboard_verification = By.xpath("(//span[@title='demo'][normalize-space()='demo'])[2]");
	public WebElement Created_Dashboard_verification() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Created_Dashboard_verification));
		return driver.findElement(Created_Dashboard_verification);
	}
	/*
	 *   @DASH-026
  Scenario: Verify Customize Dashboard Add Product /Subproduct Field
	 *
	 */
	private By product_subproduct_dropdown = By.xpath("(//*[name()='svg'])[18]");
	public WebElement product_subproduct_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_subproduct_dropdown));
		return driver.findElement(product_subproduct_dropdown);
	}
	private By Select_subproduct_list = By.xpath("(//span[@aria-label='caret-down'])[3]");
	public WebElement Select_subproduct_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_subproduct_list));
		return driver.findElement(Select_subproduct_list);
	}
	private By Select_subproduct = By.xpath("(//div[.='hello'])[2]");
	public WebElement Select_subproduct() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_subproduct));
		return driver.findElement(Select_subproduct);
	}
	private By Product_displayed = By.xpath("//body/div/section/main/div/div/div/div/div[1]/div[1]/span");
	public WebElement Product_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_displayed));
		return driver.findElement(Product_displayed);
	}
	private By Subproduct_displayed = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[1]/div[3]/span");
	public WebElement Subproduct_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Subproduct_displayed));
		return driver.findElement(Subproduct_displayed);
	}
	/*
	 *   @DASH-027
  Scenario: Verify Customize Dashboard Add Environment Field
	 *
	 */
	private By Select_Environment = By.xpath("//div[@name='environmentName']");
	public WebElement Select_Environment() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_Environment));
		return driver.findElement(Select_Environment);
	}
	private By Select_production = By.xpath("//div[.='Production']/div");
	public WebElement Select_production() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_production));
		return driver.findElement(Select_production);
	}
	private By Select_Stagging = By.xpath("//div[.='Staging']/div");
	public WebElement Select_Stagging() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_Stagging));
		return driver.findElement(Select_Stagging);
	}
	private By Environment_displayed = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[1]/text()[6]");
	public WebElement Environment_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Environment_displayed));
		return driver.findElement(Environment_displayed);
	}
	private By Edit_options = By.xpath("//body//div//button[2]");
	public WebElement Edit_options() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Edit_options));
		return driver.findElement(Edit_options);
	}
	private By Edit_button = By.xpath("//span[contains(text(),'Edit')]");
	public WebElement Edit_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Edit_button));
		return driver.findElement(Edit_button);
	}
	private By Close_environment = By.xpath("//span[@aria-label='close']");
	public WebElement Close_environment() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Close_environment));
		return driver.findElement(Close_environment);
	}
	private By Add_new_widget = By.xpath("(//div)[83]");
	public WebElement Add_new_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_new_widget));
		return driver.findElement(Add_new_widget);
	}
	/*
	 *   @DASH-028
  Scenario: Verify Customize Dashboard Add Date Range Field
	 *
	 */
	private By Default_dateRange_verification = By.xpath("//span[@title='Last 7 days']");
	public WebElement Default_dateRange_verification() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Default_dateRange_verification));
		return driver.findElement(Default_dateRange_verification);
	}
	private By New_date_range = By.xpath("//div[.='Last month']/div");
	public WebElement New_date_range() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_date_range));
		return driver.findElement(New_date_range);
	}
	private By Displayed_date_range = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[2]/button[1]/div/span[1]");
	public WebElement Displayed_date_range() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_date_range));
		return driver.findElement(Displayed_date_range);
	}
	private By Another_date_range = By.xpath("//div[.='Last 6 months']/div");
	public WebElement Another_date_range() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Another_date_range));
		return driver.findElement(Another_date_range);
	}
	/*
	 *   @DASH-029
  Scenario: Verify Customize Dashboard Add Share with Funtionality
	 *
	 */
	private By Share_with_user_field = By.xpath("//div[@name='users']");
	public WebElement Share_with_user_field() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Share_with_user_field));
		return driver.findElement(Share_with_user_field);
	}
	private By User_list = By.xpath("(//div)[149]");
	public List<WebElement> User_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(User_list));
		return driver.findElements(User_list);
	}
	private By User_from = By.xpath("//div[@id='301']");
	public WebElement User_from() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(User_from));
		return driver.findElement(User_from);
	}
	@FindBy(xpath = "//div[@id='5472']")@CacheLookup
	private WebElement User;
	public WebElement User() throws InterruptedException {
		Thread.sleep(5000);
		Js.executeScript("window.scrollBy(0,200);", "");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(User));
		Js.executeScript("arguments[0].click();", User);
		return User;
	}
	private By Edit_share_button = By.xpath("//span[.='Share']/span");
	public WebElement Edit_share_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Edit_share_button));
		return driver.findElement(Edit_share_button);
	}
	private By User_name = By.xpath("//span[.='Share With']");
	public WebElement User_name() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(User_name));
		return driver.findElement(User_name);
	}
	private By Share_with_save_button = By.xpath("//span[.='Save']");
	public WebElement Share_with_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Share_with_save_button));
		return driver.findElement(Share_with_save_button);
	}
	private By Share_with_confirmation_popup = By.xpath("(//span[.='Sucessfully updated the Share With list'])[2]");
	public WebElement Share_with_confirmation_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Share_with_confirmation_popup));
		return driver.findElement(Share_with_confirmation_popup);
	}
	private By Select_user = By.xpath("//div[@title='Madhusudhan  KN']");
	public WebElement Select_user() {
		return driver.findElement(Select_user);
	}
	/*
	 * Delete Dashboard
	 */
	private By Delete_Dashboard_icon = By.xpath("//span[.='Delete']/span");
	public WebElement Delete_Dashboard_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_Dashboard_icon));
		return driver.findElement(Delete_Dashboard_icon);
	}
	private By Delete_text = By.xpath("//input[@placeholder='Delete']");
	public void Delete_text(String Delete) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_text));
		driver.findElement(Delete_text).sendKeys(Delete);
	}
	private By Delete_button = By.xpath("//button[.='Delete']/span");
	public WebElement Delete_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_button));
		return driver.findElement(Delete_button);
	}
	private By Delete_popup = By.xpath("//strong[.='Success!']");
	public WebElement Delete_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_popup));
		return driver.findElement(Delete_popup);
	}
	/*
	 * @DASH-030
  Scenario: Verify Enable public Dashboad Funtionality
	 *
	 */
	private By Public_dashboard_toggle = By.xpath("//button[@id='isPublic']");
	public WebElement Public_dashboard_toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Public_dashboard_toggle));
		return driver.findElement(Public_dashboard_toggle);
	}
	/*
	 *   @DASH-031
  Scenario: Verify Save & Add Another button Funtionality
	 *
	 */
	private By Save_Add_Another_button = By.xpath("//span[.='Save & Add Another']");
	public WebElement Save_Add_Another_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Save_Add_Another_button));
		return driver.findElement(Save_Add_Another_button);
	}
	private By Dashboard_button = By.xpath("//a[.='Dashboard']/span");
	public WebElement Dashboard_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_button));
		return driver.findElement(Dashboard_button);
	}
	private By Select_created_dashboard = By.xpath("//span[@title='demo']");
	public WebElement Select_created_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_created_dashboard));
		return driver.findElement(Select_created_dashboard);
	}
	/*
	 *   @DASH-046
  Scenario: Verify Custom Widget feature Funtionality
	 *
	 */
	private By Added_widget = By.xpath("//input[@value='Enterprise Product Matrix']");
	public WebElement Added_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Added_widget));
		return driver.findElement(Added_widget);
	}
	/*
	 * @DASH-124
  Scenario: Verify Custom dashboard > Source Funtionality
	 *
	 */
	private By Source_Tool = By.xpath("//span[.='Source Tool']");
	public WebElement Source_Tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Source_Tool));
		return driver.findElement(Source_Tool);
	}
	private By Appscan_Source_tool = By.xpath("//div[@title='Appscan']");
	public WebElement Appscan_Source_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appscan_Source_tool));
		return driver.findElement(Appscan_Source_tool);
	}
	private By Appspider_Source_tool = By.xpath("//div[@title='Appspider']");
	public WebElement Appspider_Source_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appspider_Source_tool));
		return driver.findElement(Appspider_Source_tool);
	}
	private By Source_tool_CLose_button = By.xpath("(//span[@aria-label='close'])[2]");
	public WebElement Source_tool_CLose_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Source_tool_CLose_button));
		return driver.findElement(Source_tool_CLose_button);
	}
	private By Displayed_Source_tool1 = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[1]/div[6]/span[1]");
	public WebElement Displayed_Source_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Source_tool1));
		return driver.findElement(Displayed_Source_tool1);
	}
	private By Displayed_Source_tool2 = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[1]/div[6]/span[2]");
	public WebElement Displayed_Source_tool2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Source_tool2));
		return driver.findElement(Displayed_Source_tool2);
	}
	private By Click_Source_Tool = By.xpath("//span[.='Appscan']/span[1]");
	public WebElement Click_Source_Tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Click_Source_Tool));
		return driver.findElement(Click_Source_Tool);
	}
	/*
	 *   @DASH-151
  Scenario: Verify Create dashboard with any widget > Three dot > Export as PDF
	 *
	 */
	private By Export_as_Pdf_button = By.xpath("//span[.='Export as PDF']/span");
	public WebElement Export_as_Pdf_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Export_as_Pdf_button));
		return driver.findElement(Export_as_Pdf_button);
	}
	private By Export_pdf_popup = By.xpath("//div[.='Dashboard is ready for export as PDF']");
	public WebElement Export_pdf_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Export_pdf_popup));
		return driver.findElement(Export_pdf_popup);
	}
	private By Export_pdf_link = By.xpath("//a[.='here']");
	public WebElement Export_pdf_link() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Export_pdf_link));
		return driver.findElement(Export_pdf_link);
	}
	private By PDF_popup_close = By.xpath("(//span[@role='img'])[15]");
	public WebElement PDF_popup_close() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PDF_popup_close));
		return driver.findElement(PDF_popup_close);
	}
	/*
	 *   @DASH-153
  Scenario: Create dashboard > Add All widget with Custom dashboard
	 *
	 */
	private By Custom_widget_button = By.xpath("//body/div/section/main/div/div/div/div/div/div/div/div/div/div[2]/div[1]/form[1]/div[1]/div[2]");
	public WebElement Custom_widget_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_widget_button));
		return driver.findElement(Custom_widget_button);
	}
	private By Custom_widget_add_popup = By.xpath("//strong[.='Success!']");
	public WebElement Custom_widget_add_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_widget_add_popup));
		return driver.findElement(Custom_widget_add_popup);
	}
	private By Custom_widget_popup_close_button = By.xpath("//span[.='x']");
	public WebElement Custom_widget_popup_close_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_widget_popup_close_button));
		return driver.findElement(Custom_widget_popup_close_button);
	}
	private By Custom_widget_title = By.xpath("//input[@id='title']");
	public void Custom_widget_title(String Custom_ttle) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_widget_title));
		driver.findElement(Custom_widget_title).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		driver.findElement(Custom_widget_title).sendKeys(Custom_ttle);
	}
	private By Custom_dataSorce_dropdown = By.xpath("//input[@id='dataSource']");
	public WebElement Custom_dataSorce_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dataSorce_dropdown));
		return driver.findElement(Custom_dataSorce_dropdown);
	}
	private By Custom_demo_datasource = By.xpath("//div[.='test123']/div");
	public WebElement Custom_demo_datasource() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_demo_datasource));
		return driver.findElement(Custom_demo_datasource);
	}
	private By Custom_display_as = By.xpath("//input[@id='displayType']");
	public WebElement Custom_display_as() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_display_as));
		return driver.findElement(Custom_display_as);
	}
	private By Custom_display_pivotTable = By.xpath("(//div[contains(text(),'Pivot Table')])[2]");
	public WebElement Custom_display_pivotTable() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_display_pivotTable));
		return driver.findElement(Custom_display_pivotTable);
	}
	private By Custom_column1 = By.xpath("//input[@id='column1']");
	public WebElement Custom_column1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_column1));
		return driver.findElement(Custom_column1);
	}
	private By column1_severity = By.xpath("//div[.='Severity']/div");
	public WebElement column1_severity() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(column1_severity));
		return driver.findElement(column1_severity);
	}
	private By Custom_column2 = By.xpath("//input[@id='column2']");
	public WebElement Custom_column2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_column2));
		return driver.findElement(Custom_column2);
	}
	private By column2_status = By.xpath("(//div[contains(text(),'Status')])[10]");
	public WebElement column2_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(column2_status));
		return driver.findElement(column2_status);
	}
	private By Custom_add_widget = By.xpath("(//div)[83]");
	public WebElement Custom_add_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_add_widget));
		return driver.findElement(Custom_add_widget);
	}
	private By Custom_dashboard_validation = By.xpath("//div[normalize-space()='custom_demo']");
	public WebElement Custom_dashboard_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dashboard_validation));
		return driver.findElement(Custom_dashboard_validation);
	}
	/*
	 * @DASH-154
  Scenario: Global settings > Select custom dashboard as Set as Default
	 *
	 */
	private By Custom_dashboard = By.xpath("//div[contains(text(),'demo')]");
	public WebElement Custom_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_dashboard));
		return driver.findElement(Custom_dashboard);
	}
	/*
	 *   @DASH-224
  Scenario: Verify Product /subproduct filter  > Filter by Tag functionality
	 *
	 */
	private By product_tag_filter = By.xpath("(//span[@aria-label='filter'])[1]");
	public WebElement product_tag_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_tag_filter));
		return driver.findElement(product_tag_filter);
	}
	private By product_key = By.xpath("//input[@id='tags_0_key']");
	public void product_key(String key) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_key));
		driver.findElement(product_key).sendKeys(key);
	}
	private By product_filter_apply_button = By.xpath("//span[normalize-space()='Apply']");
	public WebElement product_filter_apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_filter_apply_button));
		return driver.findElement(product_filter_apply_button);
	}
	private By product_displayed = By.xpath("//span[@title='Juiceshop']");
	public WebElement product_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_displayed));
		return driver.findElement(product_displayed);
	}
	/*
	 *   @DASH-229
  Scenario: check behaviour of  top subproducts
	 *
	 */
	private By Top_product_widget = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[3]");
	public WebElement Top_product_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top_product_widget));
		return driver.findElement(Top_product_widget);
	}
	private By Top_vulneribity_products = By.xpath("//body//div//col[1]");
	public WebElement Top_vulneribity_products() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top_vulneribity_products));
		return driver.findElement(Top_vulneribity_products);
	}
	private By Top_product_RiskScore = By.xpath("(//span)[68]");
	public WebElement Top_product_RiskScore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top_product_RiskScore));
		return driver.findElement(Top_product_RiskScore);
	}
	private By Top_product_Risk_trendSign = By.xpath("//tbody/tr[1]/td[2]/div[1]//*[name()='svg']");
	public WebElement Top_product_Risk_trendSign() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top_product_Risk_trendSign));
		return driver.findElement(Top_product_Risk_trendSign);
	}
	/*
	 *   @DASH-230
  Scenario: Count verification wrt Findings Status of dashbaord vs Finding Page
	 *
	 */
	private By Finding_status_widget = By.xpath("//body/div/section/main/div/div/div/div/div/div[4]");
	public WebElement Finding_status_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Finding_status_widget));
		return driver.findElement(Finding_status_widget);
	}
	private By Finding_status_i_icon = By.xpath("(//*[name()='svg'][@role='img'])[16]");
	public WebElement Finding_status_i_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Finding_status_i_icon));
		return driver.findElement(Finding_status_i_icon);
	}
	private By Finding_status_copy_icon = By.xpath("(//*[name()='svg'][@data-icon='copy'])[1]");
	public WebElement Finding_status_copy_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Finding_status_copy_icon));
		return driver.findElement(Finding_status_copy_icon);
	}
	private By Open_status_dashboard = By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div[6]//div[2]");
	public WebElement Open_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Open_status_dashboard));
		return driver.findElement(Open_status_dashboard);
	}
	private By Open_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[1]/div[1]/span/strong");
	public WebElement Open_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Open_status_Findings));
		return driver.findElement(Open_status_Findings);
	}
	private By Confirm_status_dashboard = By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div[6]//div[3]");
	public WebElement Confirm_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Confirm_status_dashboard));
		return driver.findElement(Confirm_status_dashboard);
	}
	private By Confirm_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[2]/div[1]/span/strong");
	public WebElement Confirm_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Confirm_status_Findings));
		return driver.findElement(Confirm_status_Findings);
	}
	private By AcceptRisk_status_dashboard = By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div[6]//div[4]");
	public WebElement AcceptRisk_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AcceptRisk_status_dashboard));
		return driver.findElement(AcceptRisk_status_dashboard);
	}
	private By AcceptRisk_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[3]/div[1]/span/strong");
	public WebElement AcceptRisk_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AcceptRisk_status_Findings));
		return driver.findElement(AcceptRisk_status_Findings);
	}
	private By Falseve_status_dashboard = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/div[6]/div[5]");
	public WebElement Falseve_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Falseve_status_dashboard));
		return driver.findElement(Falseve_status_dashboard);
	}
	private By Falsve_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[4]/div[1]/span/strong");
	public WebElement Falsve_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Falsve_status_Findings));
		return driver.findElement(Falsve_status_Findings);
	}
	private By Mitigated_status_dashboard = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/div[6]/div[6]");
	public WebElement Mitigated_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Mitigated_status_dashboard));
		return driver.findElement(Mitigated_status_dashboard);
	}
	private By Mitigated_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[5]/div[1]/span/strong");
	public WebElement Mitigated_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Mitigated_status_Findings));
		return driver.findElement(Mitigated_status_Findings);
	}
	private By Supressed_status_dashboard = By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div[6]//div[7]");
	public WebElement Supressed_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Supressed_status_dashboard));
		return driver.findElement(Supressed_status_dashboard);
	}
	private By Supressed_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[6]/div[1]/span/strong");
	public WebElement Supressed_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Supressed_status_Findings));
		return driver.findElement(Supressed_status_Findings);
	}
	private By Total_status_dashboard = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/div[6]/div[8]");
	public WebElement Total_status_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_status_dashboard));
		return driver.findElement(Total_status_dashboard);
	}
	private By Total_status_Findings = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[7]/div[1]/span/strong");
	public WebElement Total_status_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_status_Findings));
		return driver.findElement(Total_status_Findings);
	}
	/*
	 *   @DASH-231
  Scenario: Validation of redirection flow to finding page wrt Findings Status
	 *
	 */
	private By Findings_page = By.xpath("(//span[.='Findings'])[2]");
	public WebElement Findings_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_page));
		return driver.findElement(Findings_page);
	}
	/*
	 *   @DASH-233
  Scenario: Validation of redirection flow to finding page wrt New Findings
	 */
	private By findings_count_New_findings = By.xpath("//div[5]//div[2]//div[2]//div[1]//div[1]//div[1]//div[2]//div[2]");
	public WebElement findings_count_New_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findings_count_New_findings));
		return driver.findElement(findings_count_New_findings);
	}
	/*
	 *   @DASH-235
  Scenario: To check behaviour of findings over time widget
	 *
	 */
	@FindBy(xpath = "(//div)[292]")@CacheLookup
	private WebElement Findings_over_time_widget;
	public WebElement Findings_over_time_widget() throws InterruptedException {
		Thread.sleep(5000);
		//		Js = ((JavascriptExecutor)driver);
		//		Js.executeScript("window.scrollBy(0,250)","");
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Findings_over_time_widget));
		return Findings_over_time_widget;

		//	private By Findings_over_time_widget = By.xpath("(//div)[292]");
		//	public WebElement Findings_over_time_widget() {
		//		wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_over_time_widget));
		//		return driver.findElement(Findings_over_time_widget);
	}
	@FindBy(xpath = "(//div)[292]")@CacheLookup
	private WebElement Findings_overtime;
	public  void Findings_overtime() throws InterruptedException {
		Thread.sleep(10000);
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,500);", "");
		//		wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.visibilityOf(Findings_overtime));
	}
	private By Findings_time_period_dropdown = By.xpath("(//span[@title='All time'])[2]");
	public WebElement Findings_time_period_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_time_period_dropdown));
		return driver.findElement(Findings_time_period_dropdown);
	}
	private By Findings_Line_option = By.xpath("//span[.='Line']");
	public WebElement Findings_Line_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_Line_option));
		return driver.findElement(Findings_Line_option);
	}
	private By Findings_Area_option = By.xpath("//span[.='Area']");
	public WebElement Findings_Area_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_Area_option));
		return driver.findElement(Findings_Area_option);
	}
	private By LogScale_toggle = By.xpath("(//button[@role='switch'])[3]");
	public WebElement LogScale_toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogScale_toggle));
		return driver.findElement(LogScale_toggle);
	}
	private By Findings_overTime_Filter = By.xpath("//body/div/section/main/div/div/div/div/div/div/div/div/div[contains(text(),'Log Scale')]/span[1]");
	public WebElement Findings_overTime_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_overTime_Filter));
		return driver.findElement(Findings_overTime_Filter);
	}
	private By Severity_list = By.xpath("//div[@role='tooltip']//button[1]//div[1]//div[1]");
	public WebElement Severity_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Severity_list));
		return driver.findElement(Severity_list);
	}
	private By Tool_list = By.xpath("(//div[contains(text(),'Tool')])[2]");
	public WebElement Tool_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Tool_list));
		return driver.findElement(Tool_list);
	}
	private By ScanType_list = By.xpath("//div[contains(text(),'Scan Type')]");
	public WebElement ScanType_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ScanType_list));
		return driver.findElement(ScanType_list);
	}
	private By Graphical_Representation = By.xpath("(//*[name()='svg'])[42]");
	public WebElement Graphical_Representation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Graphical_Representation));
		return driver.findElement(Graphical_Representation);
	}
	private By Findings_Overtime_ViewMore_option = By.xpath("//a[.='View more...']");
	public WebElement Findings_Overtime_ViewMore_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_Overtime_ViewMore_option));
		return driver.findElement(Findings_Overtime_ViewMore_option);
	}
	private By Individual_findings_page = By.xpath("//span[.='Findings Over Time']");
	public WebElement Individual_findings_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Individual_findings_page));
		return driver.findElement(Individual_findings_page);
	}
	/*
	 *   @DASH-238
  Scenario: Check behaviour of Security Dashboard page after login
	 *
	 */
	private By Security_dashboard = By.xpath("//span[@title='Security']");
	public WebElement Security_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Security_dashboard));
		return driver.findElement(Security_dashboard);
	}
	/*
	 *   @DASH-239
  Scenario: Check behaviour of Security Dashboard page once the page is loaded
	 *
	 */
	private By OverAll_RiskScore_widget = By.xpath("//body/div/section/main/div/div/div/div/div/div[1]/div[2]/div[2]");
	public WebElement OverAll_RiskScore_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(OverAll_RiskScore_widget));
		return driver.findElement(OverAll_RiskScore_widget);
	}
	private By Enterprises_product_matrix_widget = By.xpath("//body/div/section/main/div/div/div/div/div/div[2]/div[2]");
	public WebElement Enterprises_product_matrix_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Enterprises_product_matrix_widget));
		return driver.findElement(Enterprises_product_matrix_widget);
	}
	@FindBy(xpath = "(//div)[242]")@CacheLookup
	private WebElement New_Findings_widget;
	public  void New_Findings_widget() throws InterruptedException {
		Thread.sleep(10000);
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,500);", "");
		//		wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.visibilityOf(Findings_overtime));
	}
	private By New_findings_widget = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[1]");
	public WebElement New_findings_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_findings_widget));
		return driver.findElement(New_findings_widget);
	}
	private By Findings_by_product_widget = By.xpath("//body/div/section/main/div/div/div/div/div/div[6]/div[2]");
	public WebElement Findings_by_product_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_by_product_widget));
		return driver.findElement(Findings_by_product_widget);
	}
	private By Findings_Due_Date = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[8]/div[2]/div[1]/div[1]/div[1]");
	public WebElement Findings_Due_Date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_Due_Date));
		return driver.findElement(Findings_Due_Date);
	}
	private By Resolution_SLA_widget = By.xpath("//body//div//div[9]");
	public WebElement Resolution_SLA_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Resolution_SLA_widget));
		return driver.findElement(Resolution_SLA_widget);
	}
	private By SLA_Breaches_By_product_widget = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[10]");
	public WebElement SLA_Breaches_By_product_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_Breaches_By_product_widget));
		return driver.findElement(SLA_Breaches_By_product_widget);
	}
	private By SLA_Breaches_By_Team = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[11]");
	public WebElement SLA_Breaches_By_Team() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_Breaches_By_Team));
		return driver.findElement(SLA_Breaches_By_Team);
	}
	/*
	 *   @DASH-240
  Scenario: Check behaviour of Security Dashboard page when user clicks in different tabs like Production and Staging
	 *
	 */
	private By Staging_button = By.xpath("//div[.='Staging']/div");
	public WebElement Staging_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Staging_button));
		return driver.findElement(Staging_button);
	}
	private By Production_button = By.xpath("//div[.='Production']/div");
	public WebElement Production_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Production_button));
		return driver.findElement(Production_button);
	}
	/*
	 *   @DASH-249
  Scenario: Check behaviour when user Navigates to Top Product Widget
	 *
	 */
	private By Top_5_products_list = By.xpath("//tbody");
	public List<WebElement> Top_5_products_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top_5_products_list));
		return driver.findElements(Top_5_products_list);
	}
	/*
	 * @DASH-255
  Scenario: Check behaviour when user navigates to New Findings widget
	 *
	 */
	private By New_Findings_last_24hours = By.xpath("//div[.='Last 24 hours']");
	public WebElement New_Findings_last_24hours() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Findings_last_24hours));
		return driver.findElement(New_Findings_last_24hours);
	}
	private By New_Findings_last_7days = By.xpath("//div[.='Last 7 days']");
	public WebElement New_Findings_last_7days() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Findings_last_7days));
		return driver.findElement(New_Findings_last_7days);
	}
	private By New_Findings_lastmonth = By.xpath("//div[.='Last month']");
	public WebElement New_Findings_lastmonth() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Findings_lastmonth));
		return driver.findElement(New_Findings_lastmonth);
	}
	/*
	 *   @DASH-258
  Scenario: Check behaviour when user navigates to Findings By Product widget
	 *
	 */
	private By Findings_by_product_top5_products_list = By.xpath("//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[4]/div[1]"
			+ "/div[2]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g']"
			+ "/*[name()='g']/*[name()='text']");
	public List<WebElement> Findings_by_product_top5_products_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_by_product_top5_products_list));
		return driver.findElements(Findings_by_product_top5_products_list);
	}
	private By Top1_product = By.xpath("(//*[name()='g'])[39]");
	public WebElement Top1_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top1_product));
		return driver.findElement(Top1_product);
	}
	private By Top2_product = By.xpath("(//*[name()='g'])[41]");
	public WebElement Top2_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top2_product));
		return driver.findElement(Top2_product);
	}
	private By Top3_product = By.xpath("(//*[name()='g'])[43]");
	public WebElement Top3_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top3_product));
		return driver.findElement(Top3_product);
	}
	private By Top4_product = By.xpath("(//*[name()='g'])[45]");
	public WebElement Top4_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top4_product));
		return driver.findElement(Top4_product);
	}
	private By Top5_product = By.xpath("(//*[name()='g'])[47]");
	public WebElement Top5_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Top5_product));
		return driver.findElement(Top5_product);
	}
	/*
	 * @DASH-284
  Scenario: Check behaviour when user Navigates to Findings Due Date widget
	 */
	private By Findings_OverDue = By.xpath("//div[.='Overdue']");
	public WebElement Findings_OverDue() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_OverDue));
		return driver.findElement(Findings_OverDue);
	}
	private By Findings_DueIn1D = By.xpath("//div[.='Due in 1D']");
	public WebElement Findings_DueIn1D() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_DueIn1D));
		return driver.findElement(Findings_DueIn1D);
	}
	private By Findings_DueIn7D = By.xpath("//div[.='Due in 7D']");
	public WebElement Findings_DueIn7D() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_DueIn7D));
		return driver.findElement(Findings_DueIn7D);
	}
	private By Findings_DueIn14D = By.xpath("//div[.='Due in 14D']");
	public WebElement Findings_DueIn14D() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_DueIn14D));
		return driver.findElement(Findings_DueIn14D);
	}
	private By Findings_DueIn30D = By.xpath("//div[.='Due in 30D']");
	public WebElement Findings_DueIn30D() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_DueIn30D));
		return driver.findElement(Findings_DueIn30D);
	}
	/*
	 *   @DASH-305
  Scenario: Check behaviour SSDLC Dashboard functionality
	 */
	private By SSDLC_Healthcheck_dashboard = By.xpath("//div[.='SSDLC Healthcheck']/div");
	public WebElement SSDLC_Healthcheck_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Healthcheck_dashboard));
		return driver.findElement(SSDLC_Healthcheck_dashboard);
	}
	private By Show_All_toggle = By.xpath("//button[@role='switch']");
	public WebElement Show_All_toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Show_All_toggle));
		return driver.findElement(Show_All_toggle);
	}
	private By SSDLC_DateFilter = By.xpath("(//span[@role='img'])[9]");
	public WebElement SSDLC_DateFilter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DateFilter));
		return driver.findElement(SSDLC_DateFilter);
	}
	private By SSDLC_prd = By.xpath("//a[.='casestudy']");
	public WebElement SSDLC_prd() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_prd));
		return driver.findElement(SSDLC_prd);
	}
	private By SSDLC_product_icon = By.xpath("//tbody/tr[10]/td[1]//*[name()='svg']");
	public WebElement SSDLC_product_icon() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);", "");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_product_icon));
		return driver.findElement(SSDLC_product_icon);
	}
	private By SSDLC_subproduct_list = By.xpath("(//span[contains(text(),'Subproduct')])[4]");
	public WebElement SSDLC_subproduct_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_subproduct_list));
		return driver.findElement(SSDLC_subproduct_list);
	}
	private By SSDLC_Subproduct_tool = By.xpath("//tbody//tr//th[3]");
	public WebElement SSDLC_Subproduct_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Subproduct_tool));
		return driver.findElement(SSDLC_Subproduct_tool);
	}
	private By SSDLC_Subproduct_ToolType = By.xpath("//tbody//tr//th[4]");
	public WebElement SSDLC_Subproduct_ToolType() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Subproduct_ToolType));
		return driver.findElement(SSDLC_Subproduct_ToolType);
	}
	private By SSDLC_Subproduct_Findings = By.xpath("(//span[contains(text(),'Findings')])[3]");
	public WebElement SSDLC_Subproduct_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Subproduct_Findings));
		return driver.findElement(SSDLC_Subproduct_Findings);
	}
	private By SSDLC_Subproduct_status = By.xpath("(//th[contains(text(),'Tool Status')])[2]");
	public WebElement SSDLC_Subproduct_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Subproduct_status));
		return driver.findElement(SSDLC_Subproduct_status);
	}
	/*
	 *   @DASH-306
  Scenario: Check behaviour SSDLC Dashboard > icon
	 */
	private By SSDLC_Subproduct_icon = By.xpath("(//*[name()='svg'][@role='img'])[26]");
	public WebElement SSDLC_Subproduct_icon() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,200);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Subproduct_icon));
		return driver.findElement(SSDLC_Subproduct_icon);
	}
	private By SSDLC_tool_findings = By.xpath("(//span[@data-type='Total'])[13]");
	public WebElement SSDLC_tool_findings() {
		return driver.findElement(SSDLC_tool_findings);
	}
	private By SSDLC_tool_type =By.xpath("(//span)[507]");
	public WebElement SSDLC_tool_type() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_tool_type));
		return driver.findElement(SSDLC_tool_type);
	}
	private By SSDLC_tool_LastSCan = By.xpath("(//div)[283]");
	public WebElement SSDLC_tool_LastSCan() {
		return driver.findElement(SSDLC_tool_LastSCan);
	}
	private By SSDLC_tool_status = By.xpath("//span[normalize-space()='Tool Status']");
	public WebElement SSDLC_tool_status() {
		return driver.findElement(SSDLC_tool_status);
	}
	/*
	 *   @DASH-307
  Scenario: Check All the tool type and total number of findings and overall status
	 */
	private By COllapsed_tool = By.xpath("(//td)[60]");
	public WebElement COllapsed_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(COllapsed_tool));
		return driver.findElement(COllapsed_tool);
	}
	/*
	 * @DASH-308
  Scenario: Check Count of findings with findings page
	 */
	private By SSDLC_Total_findings = By.xpath("//tr[@data-row-key='Custom']//span[contains(text(),'T')]");
	public WebElement SSDLC_Total_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Total_findings));
		return driver.findElement(SSDLC_Total_findings);
	}
	private By SSDLC_findings_page = By.xpath("(//span[contains(text(),'Findings')])[2]");
	public WebElement SSDLC_findings_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_findings_page));
		return driver.findElement(SSDLC_findings_page);
	}
	private By SSDLC_findings_dislayed = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[7]/div[1]/span/strong");
	public WebElement SSDLC_findings_dislayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_findings_dislayed));
		return driver.findElement(SSDLC_findings_dislayed);
	}
	/*
	 * @DASH-309
  Scenario: Check Count of All different Severity of Findings with findings page
	 */
	private By SSDLC_Critical_findings = By.xpath("(//span[@data-type='Critical'])[13]");
	public WebElement SSDLC_Critical_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Critical_findings));
		return driver.findElement(SSDLC_Critical_findings);
	}
	private By SSDLC_High_findings = By.xpath("(//span[@data-type='High'])[13]");
	public WebElement SSDLC_High_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_High_findings));
		return driver.findElement(SSDLC_High_findings);
	}
	private By SSDLC_Medium_findings = By.xpath("(//span[@data-type='Medium'])[13]");
	public WebElement SSDLC_Medium_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Medium_findings));
		return driver.findElement(SSDLC_Medium_findings);
	}
	private By SSDLC_Low_findings = By.xpath("(//span[@data-type='Low'])[13]");
	public WebElement SSDLC_Low_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Low_findings));
		return driver.findElement(SSDLC_Low_findings);
	}
	/*
	 *   @DASH-330
  Scenario: My Findings Widget functionality
	 */
	private By Developer_dashboard = By.xpath("//div[.='Developer']/div");
	public WebElement Developer_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_dashboard));
		return driver.findElement(Developer_dashboard);
	}
	private By Developer_My_Findings = By.xpath("(//*[name()='svg'])[20]");
	public WebElement Developer_My_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_My_Findings));
		return driver.findElement(Developer_My_Findings);
	}
	private By Dev_My_findings_severity_colour = By.xpath("//li[1]//span[1]//span[1]");
	public WebElement Dev_My_findings_severity_colour() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dev_My_findings_severity_colour));
		return driver.findElement(Dev_My_findings_severity_colour);
	}
	private By Severity_findings_page = By.xpath("(//span[.='Critical'])[1]");
	public WebElement Severity_findings_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Severity_findings_page));
		return driver.findElement(Severity_findings_page);
	}
	/*
	 *   @DASH-331
  Scenario: My SLA Notification Widget functionality
	 */
	private By Developer_My_SLA_notification_widget = By.xpath("(//div)[103]");
	public WebElement Developer_My_SLA_notification_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_My_SLA_notification_widget));
		return driver.findElement(Developer_My_SLA_notification_widget);
	}
	private By Total_number_Overdue = By.xpath("(//div)[117]/div[2]");
	public WebElement Total_number_Overdue() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_number_Overdue));
		return driver.findElement(Total_number_Overdue);
	}
	/*
	 *   @DASH-332
  Scenario: My Findings by Product widget functionality
	 */
	private By Developer_MYFindings_BY_product_widget = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div/div[5]");
	public WebElement Developer_MYFindings_BY_product_widget() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_MYFindings_BY_product_widget));
		return driver.findElement(Developer_MYFindings_BY_product_widget);
	}
	private By Myfindings_product_graph = By.xpath("(//*[name()='g'])[17]");
	public WebElement Myfindings_product_graph() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Myfindings_product_graph));
		return driver.findElement(Myfindings_product_graph);
	}
	/*
	 *   @DASH-333
  Scenario: My Findings by Source widget functionality
	 */
	private By Developer_Findings_By_Source = By.xpath("(//div)[190]");
	public WebElement Developer_Findings_By_Source() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_Findings_By_Source));
		return driver.findElement(Developer_Findings_By_Source);
	}
	private By FindingsBySource_graph = By.xpath("(//*[name()='g'])[41]");
	public WebElement FindingsBySource_graph() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindingsBySource_graph));
		return driver.findElement(FindingsBySource_graph);
	}
	/*
	 *   @DASH-334
  Scenario: My Findings by Severity/Status widget functionality
	 */
	private By Developer_Finding_status = By.xpath("(//div)[142]");
	public WebElement Developer_Finding_status() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_Finding_status));
		return driver.findElement(Developer_Finding_status);
	}
	private By Total_number_confirm_status = By.xpath("(//div)[155]/div[3]");
	public WebElement Total_number_confirm_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_number_confirm_status));
		return driver.findElement(Total_number_confirm_status);
	}
	/*
	 *   @DASH-335
  Scenario: My Open Tickets widget functionality
	 */
	private By Developer_My_open_tickets = By.xpath("(//div)[80]");
	public WebElement Developer_My_open_tickets() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_My_open_tickets));
		return driver.findElement(Developer_My_open_tickets);
	}
	private By My_open_tickets_Total_number = By.xpath("//*[@id=\"root\"]/section/main/div/div/div[4]/div/div"
			+ "/div[2]/div[2]/div[2]/div/div[1]/div/div/div[1]/div[2]");
	public WebElement My_open_tickets_Total_number() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(My_open_tickets_Total_number));
		return driver.findElement(My_open_tickets_Total_number);
	}
	private By Tickets_page = By.xpath("(//a[.='Tickets'])[2]");
	public WebElement Tickets_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Tickets_page));
		return driver.findElement(Tickets_page);
	}
	private By Filter_tickets_page = By.xpath("//span[.='Critical']");
	public WebElement Filter_tickets_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Filter_tickets_page));
		return driver.findElement(Filter_tickets_page);
	}
	/*
	 *   @DASH-337
  Scenario: Global filter application on developer dashboard functionality
	 */
	private By Global_filter = By.xpath("//div[@title='Default Business Unit']");
	public WebElement Global_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Global_filter));
		return driver.findElement(Global_filter);
	}	
	private By Global_filter_BU_dropdown = By.xpath("(//span[@title='Default Business Unit'][normalize-space()='Default Business Unit'])[1]");
	public WebElement Global_filter_BU_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Global_filter_BU_dropdown));
		return driver.findElement(Global_filter_BU_dropdown);
	}
	private By Global_filter_BU1 = By.xpath("//span[.='Business Unit']");
	public WebElement Global_filter_BU1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Global_filter_BU1));
		return driver.findElement(Global_filter_BU1);
	}
	private By Global_filter_Apply_button = By.xpath("//span[.='Apply']");
	public WebElement Global_filter_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Global_filter_Apply_button));
		return driver.findElement(Global_filter_Apply_button);
	}
	private By Dashboard_After_filter = By.xpath("//div[@title='Business Unit']");
	public WebElement Dashboard_After_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_After_filter));
		return driver.findElement(Dashboard_After_filter);
	}
	/*
	 *   @DASH-338
  Scenario: Check Date filter in developer dashboard is working
	 */
	private By Developer_Date_filter = By.xpath("(//button[@type='button'])[2]");
	public WebElement Developer_Date_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_Date_filter));
		return driver.findElement(Developer_Date_filter);
	}
	private By Developer_date_option = By.xpath("//li[normalize-space()='Last 24 hour']");
	public WebElement Developer_date_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_date_option));
		return driver.findElement(Developer_date_option);
	}
	/*
	 *   @DASH-339
  Scenario: Check Production staging tab data validation
	 */
	private By Developer_staging_button = By.xpath("//div[.='Staging']/div");
	public WebElement Developer_staging_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_staging_button));
		return driver.findElement(Developer_staging_button);
	}
	private By Developer_production_button = By.xpath("//div[.='Production']/div");
	public WebElement Developer_production_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_production_button));
		return driver.findElement(Developer_production_button);
	}
	/*
	 *   @DASH-340
  Scenario: Global settings > Select Developer dashboard as Set as Defaul
	 */
	private By Developer_dashboard_default = By.xpath("//div[contains(text(),'Developer')]");
	public WebElement Developer_dashboard_default() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_dashboard_default));
		return driver.findElement(Developer_dashboard_default);
	}
	private By Developer_dashboard_verification = By.xpath("//span[@title='Developer']");
	public WebElement Developer_dashboard_verification() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_dashboard_verification));
		return driver.findElement(Developer_dashboard_verification);
	}
	private By Security_Default_dashboard = By.xpath("//div[contains(text(),'Security')]");
	public WebElement Security_Default_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Security_Default_dashboard));
		return driver.findElement(Security_Default_dashboard);
	}
	/*
	 *   @DASH-372
  Scenario: All BU dashboard enable/disable from Global setting page.
	 */
	private By Global_Dashboards = By.xpath("//div[.='Dashboards']/div");
	public WebElement Global_Dashboards() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Global_Dashboards));
		return driver.findElement(Global_Dashboards);
	}
	private By Developer_checkbox = By.xpath("(//span)[71]");
	public WebElement Developer_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Developer_checkbox));
		return driver.findElement(Developer_checkbox);
	}
	/*
	 *   @DASH-373
  Scenario: All BU > Export as CSV link text button
	 */
	private By Export_CSV_button = By.xpath("(//*[name()='svg'][@data-icon='file-excel'])[1]");
	public WebElement Export_CSV_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Export_CSV_button));
		return driver.findElement(Export_CSV_button);
	}
	private By Export_success_popup = By.xpath("/html/body/div[6]/div/span/div/div/div/span[2]");
	public WebElement Export_success_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Export_success_popup));
		return driver.findElement(Export_success_popup);
	}
	/*
	 *   @DASH-374
  Scenario: All BU dashboard with different environemnt.
	 */
	private By All_BU_staging = By.xpath("//div[.='Staging']/div");
	public WebElement All_BU_staging() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_staging));
		return driver.findElement(All_BU_staging);
	}
	private By All_BU_Production = By.xpath("//div[.='Production']/div");
	public WebElement All_BU_Production() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Production));
		return driver.findElement(All_BU_Production);
	}
	/*
	 *   @DASH-375
  Scenario: All BU dashboard with different filters.
	 */
	private By All_BU_Severity_dropdown = By.xpath("//div//div//div//div//div//button[1]//div[1]//span[1]");
	public WebElement All_BU_Severity_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Severity_dropdown));
		return driver.findElement(All_BU_Severity_dropdown);
	}
	private By All_BU_critical_severity = By.xpath("//span[.='Critical']/span");
	public WebElement All_BU_critical_severity() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_critical_severity));
		return driver.findElement(All_BU_critical_severity);
	}
	private By All_BU_Severity_Apply_button = By.xpath("//body/div/div/div/div/div/button[1]");
	public WebElement All_BU_Severity_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Severity_Apply_button));
		return driver.findElement(All_BU_Severity_Apply_button);
	}
	private By All_BU_Severity_high = By.xpath("//span[.='High']/span");
	public WebElement All_BU_Severity_high() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Severity_high));
		return driver.findElement(All_BU_Severity_high);
	}
	private By All_BU_displayed_sevrity = By.xpath("(//span[.='Critical'])[1]");
	public WebElement All_BU_displayed_sevrity() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_displayed_sevrity));
		return driver.findElement(All_BU_displayed_sevrity);
	}
	/*
	 * @DASH-376
  Scenario: Tool tip to all of the trend indicators
	 */
	private By All_BU_RiskScore = By.xpath("//tbody/tr/td[3]/div[1]/span[1]");
	public WebElement All_BU_RiskScore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_RiskScore));
		return driver.findElement(All_BU_RiskScore);
	}
	private By All_BU_RiskScore_Tooltip = By.xpath("(//div[@role='tooltip'])[1]");
	public WebElement All_BU_RiskScore_Tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_RiskScore_Tooltip));
		return driver.findElement(All_BU_RiskScore_Tooltip);
	}
	/*
	 *   @DASH-377
  Scenario: All BU dashboard Save Search feature
	 */
	private By All_BU_Filter_saveAs = By.xpath("//span[.='Save As']");
	public WebElement All_BU_Filter_saveAs() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Filter_saveAs));
		return driver.findElement(All_BU_Filter_saveAs);
	}
	private By All_BU_saveas_name = By.xpath("//input[@id='name']");
	public void All_BU_saveas_name(String name) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_saveas_name));
		driver.findElement(All_BU_saveas_name).sendKeys(name);
	}
	private By Make_public_saveas = By.xpath("//button[@placeholder='Make Public']//div");
	public WebElement Make_public_saveas() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Make_public_saveas));
		return driver.findElement(Make_public_saveas);
	}
	private By All_BU_saveAs_save_button = By.xpath("//span[normalize-space()='Save']");
	public WebElement All_BU_saveAs_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_saveAs_save_button));
		return driver.findElement(All_BU_saveAs_save_button);
	}
	private By All_BU_saveAs_popup = By.xpath("/html/body/div[5]/div/span/div/div/div/span[2]/strong");
	public WebElement All_BU_saveAs_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_saveAs_popup));
		return driver.findElement(All_BU_saveAs_popup);
	}
	private By All_BU_saved_search_field = By.xpath("//input[@placeholder='Search']");
	public void All_BU_saved_search_field(String search) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_saved_search_field));
		driver.findElement(All_BU_saved_search_field).sendKeys(search);
	}
	private By Delete_saved_search = By.xpath("(//span[@role='img'])[37]");
	public WebElement Delete_saved_search() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_saved_search));
		return driver.findElement(Delete_saved_search);
	}
	private By All_BU_Delete_text = By.xpath("//input[@placeholder='Delete']");
	public void All_BU_Delete_text(String delete) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Delete_text));
		driver.findElement(All_BU_Delete_text).sendKeys(delete);
	}
	private By All_BU_Delete_button = By.xpath("//button[@type='submit']");
	public WebElement All_BU_Delete_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Delete_button));
		return driver.findElement(All_BU_Delete_button);
	}
	private By ALl_BU_savedsearch_button = By.xpath("//button[@id='saved-search']");
	public WebElement ALl_BU_savedsearch_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ALl_BU_savedsearch_button));
		return driver.findElement(ALl_BU_savedsearch_button);
	}
	/*
	 *   @DASH-378
  Scenario: All BU dashboard Reset Filter
	 */
	private By All_BU_Reset_filter = By.xpath("//body/div/section/main/div/div/div/div/div/div/div/div/div/span[1]");
	public WebElement All_BU_Reset_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Reset_filter));
		return driver.findElement(All_BU_Reset_filter);
	}
	private By All_BU_Severity_reset = By.xpath("//div[.='Severity']/div");
	public WebElement All_BU_Severity_reset() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Severity_reset));
		return driver.findElement(All_BU_Severity_reset);
	}
	/*
	 *   @DASH-379
  Scenario: ALL BU> Findings Over Time widget functionality
	 */
	private By All_BU_findings_overtime_dropdown = By.xpath("//div[@role='button']");
	public WebElement All_BU_findings_overtime_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_findings_overtime_dropdown));
		return driver.findElement(All_BU_findings_overtime_dropdown);
	}
	private By All_BU_findings_Overtime_widget = By.xpath("//div[normalize-space()='Findings Over Time']");
	public WebElement All_BU_findings_Overtime_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_findings_Overtime_widget));
		return driver.findElement(All_BU_findings_Overtime_widget);
	}
	private By All_BU_findings_status_widget = By.xpath("//div[normalize-space()='Finding Status']");
	public WebElement All_BU_findings_status_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_findings_status_widget));
		return driver.findElement(All_BU_findings_status_widget);
	}
	private By BU_dropdown_Arrow = By.xpath("(//*[name()='svg'][@role='img'])[11]");
	public WebElement BU_dropdown_Arrow() {
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("window.scrollBy(0,300);","");
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_dropdown_Arrow));
		return driver.findElement(BU_dropdown_Arrow);
	}
	private By BU_findings_overtime_widget = By.xpath("//div[normalize-space()='BU 1: Unresolved Findings Over Time']");
	public WebElement BU_findings_overtime_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_findings_overtime_widget));
		return driver.findElement(BU_findings_overtime_widget);
	}
	private By BU_findings_status_widget = By.xpath("//div[normalize-space()='BU 1: Finding Status']");
	public WebElement BU_findings_status_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_findings_status_widget));
		return driver.findElement(BU_findings_status_widget);
	}
	/*
	 *   @DASH-382
  Scenario: All Bu Dashboard > Only BU Global filter is applicable
	 */
	private By Global_filter_subproducts = By.xpath("//span[.='None']");
	public WebElement Global_filter_subproducts() {
		return driver.findElement(Global_filter_subproducts);
	}
	private By Global_filter_ToolCategory = By.xpath("//span[.='Tool Category']");
	public WebElement Global_filter_ToolCategory() {
		return driver.findElement(Global_filter_ToolCategory);
	}
	/*
	 *   @DASH-385
  Scenario: All BU Additional column functionality
	 */
	private By All_BU_Additional_column_icon = By.xpath("//body/div/section/main/div/div/div/div/div/div/div/div/div/span[2]");
	public WebElement All_BU_Additional_column_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_Additional_column_icon));
		return driver.findElement(All_BU_Additional_column_icon);
	}
	private By All_BU_additional_options = By.xpath("//ul[@role='menu']");
	public WebElement All_BU_additional_options() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(All_BU_additional_options));
		return driver.findElement(All_BU_additional_options);
	}
	private By Additional_Riskscore = By.xpath("//span[.='Risk Score']");
	public WebElement Additional_Riskscore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_Riskscore));
		return driver.findElement(Additional_Riskscore);
	}
	private By Additional_Findings = By.xpath("(//span[.='Findings'])[2]");
	public WebElement Additional_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_Findings));
		return driver.findElement(Additional_Findings);
	}
	private By Additional_Total_Prodcut = By.xpath("//span[.='Total Product']");
	public WebElement Additional_Total_Prodcut() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_Total_Prodcut));
		return driver.findElement(Additional_Total_Prodcut);
	}
	private By Additional_Total_SubProduct = By.xpath("//span[.='Total Subproduct']");
	public WebElement Additional_Total_SubProduct() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_Total_SubProduct));
		return driver.findElement(Additional_Total_SubProduct);
	}
	private By Additional_Total_status = By.xpath("//span[.='Tool status']");
	public WebElement Additional_Total_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_Total_status));
		return driver.findElement(Additional_Total_status);
	}
	private By Additional_column_tooltip = By.xpath("(//div[.='Additional columns'])[5]");
	public WebElement Additional_column_tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Additional_column_tooltip));
		return driver.findElement(Additional_column_tooltip);
	}
	/*
	 *   @DASH-388
  Scenario: All_Bu_Dashboard > Risk score functionality
	 */
	private By BU_product_name = By.xpath("//td[@title='sonarcloud']/a");
	public WebElement BU_product_name() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_product_name));
		return driver.findElement(BU_product_name);
	}
	private By BU_product_RiskScore = By.xpath("//span[contains(text(),'15/100')]");
	public WebElement BU_product_RiskScore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_product_RiskScore));
		return driver.findElement(BU_product_RiskScore);
	}
	private By BU_prouct_arrow = By.xpath("(//tbody[1]/tr[1]/td[1])[2]");
	public WebElement BU_prouct_arrow() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_prouct_arrow));
		return driver.findElement(BU_prouct_arrow);
	}
	private By BU_Subproduct_name = By.xpath("//td[@title='abcd']/a");
	public WebElement BU_Subproduct_name() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_Subproduct_name));
		return driver.findElement(BU_Subproduct_name);
	}
	private By Product_page = By.xpath("//a[.='Products']");
	public WebElement Product_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_page));
		return driver.findElement(Product_page);
	}
	private By Product_RiskScore = By.xpath("(//span)[61]/span");
	public WebElement Product_RiskScore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_RiskScore));
		return driver.findElement(Product_RiskScore);
	}
	private By Subproduct_page = By.xpath("//span[.='Subproducts']");
	public WebElement Subproduct_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Subproduct_page));
		return driver.findElement(Subproduct_page);
	}
	private By Subproduct_Riskscore = By.xpath("(//div)[77]/span");
	public WebElement Subproduct_Riskscore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Subproduct_Riskscore));
		return driver.findElement(Subproduct_Riskscore);
	}
	private By BU_product = By.xpath("//a[@data-id='76']");
	public WebElement BU_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(BU_product));
		return driver.findElement(BU_product);
	}
	/*
	 *   @DASH-394
  Scenario: To check behaviour of navigation to ssdlc dashboard
	 */
	private By SSDLC_Dashboard = By.xpath("//div[.='SSDLC Healthcheck']/div");
	public WebElement SSDLC_Dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Dashboard));
		return driver.findElement(SSDLC_Dashboard);
	}
	private By SSDLC_Dashboard_page = By.xpath("//span[@title='SSDLC Healthcheck']");
	public WebElement SSDLC_Dashboard_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Dashboard_page));
		return driver.findElement(SSDLC_Dashboard_page);
	}
	private By SSDLC_displayed_product = By.xpath("(//div)[92]");
	public WebElement SSDLC_displayed_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_displayed_product));
		return driver.findElement(SSDLC_displayed_product);
	}
	/*
	 *   @DASH-395
  Scenario: To check behaviour Product SSDLC Dashboard>> Devops process
	 */
	private By SSDLC_Product = By.xpath("//a[@title='casestudy']");
	public WebElement SSDLC_Product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Product));
		return driver.findElement(SSDLC_Product);
	}
	private By SSDLC_DevopsProcess_phase1 = By.xpath("//div[.='Plan']");
	public WebElement SSDLC_DevopsProcess_phase1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase1));
		return driver.findElement(SSDLC_DevopsProcess_phase1);
	}
	private By SSDLC_DevopsProcess_phase2 = By.xpath("//div[.='Code']");
	public WebElement SSDLC_DevopsProcess_phase2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase2));
		return driver.findElement(SSDLC_DevopsProcess_phase2);
	}
	private By SSDLC_DevopsProcess_phase3 = By.xpath("//div[.='Build']");
	public WebElement SSDLC_DevopsProcess_phase3() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase3));
		return driver.findElement(SSDLC_DevopsProcess_phase3);
	}
	private By SSDLC_DevopsProcess_phase4 = By.xpath("//div[.='Test']");
	public WebElement SSDLC_DevopsProcess_phase4() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase4));
		return driver.findElement(SSDLC_DevopsProcess_phase4);
	}
	private By SSDLC_DevopsProcess_phase5 = By.xpath("//div[.='Release']");
	public WebElement SSDLC_DevopsProcess_phase5() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase5));
		return driver.findElement(SSDLC_DevopsProcess_phase5);
	}
	private By SSDLC_DevopsProcess_phase6 = By.xpath("//div[.='Deploy']");
	public WebElement SSDLC_DevopsProcess_phase6() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase6));
		return driver.findElement(SSDLC_DevopsProcess_phase6);
	}
	private By SSDLC_DevopsProcess_phase7 = By.xpath("//div[.='Operate']");
	public WebElement SSDLC_DevopsProcess_phase7() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DevopsProcess_phase7));
		return driver.findElement(SSDLC_DevopsProcess_phase7);
	}
	private By DevopsPRoces_scantype_phase1 = By.xpath("//div[.='Threat Model']");
	public WebElement DevopsPRoces_scantype_phase1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsPRoces_scantype_phase1));
		return driver.findElement(DevopsPRoces_scantype_phase1);
	}
	private By DevopsProcess_scantype_phase2 = By.xpath("(//div[.='SAST'])[1]");
	public WebElement DevopsProcess_scantype_phase2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase2));
		return driver.findElement(DevopsProcess_scantype_phase2);
	}
	private By DevopsProcess_scantype_phase3 = By.xpath("//div[.='SCA']");
	public WebElement DevopsProcess_scantype_phase3() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase3));
		return driver.findElement(DevopsProcess_scantype_phase3);
	}
	private By DevopsProcess_scantype_phase4 = By.xpath("//div[.='DAST']");
	public WebElement DevopsProcess_scantype_phase4() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase4));
		return driver.findElement(DevopsProcess_scantype_phase4);
	}
	private By DevopsProcess_scantype_phase5 = By.xpath("//div[.='IaC']");
	public WebElement DevopsProcess_scantype_phase5() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase5));
		return driver.findElement(DevopsProcess_scantype_phase5);
	}
	private By DevopsProcess_scantype_phase6 = By.xpath("//div[.='Infrastructure Tools']");
	public WebElement DevopsProcess_scantype_phase6() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase6));
		return driver.findElement(DevopsProcess_scantype_phase6);
	}
	private By DevopsProcess_scantype_phase7 = By.xpath("//div[.='CSPM']");
	public WebElement DevopsProcess_scantype_phase7() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_scantype_phase7));
		return driver.findElement(DevopsProcess_scantype_phase7);
	}
	private By DevopsProcess_findings_phase1 = By.xpath("(//span[@data-type='Critical'])[1]");
	public WebElement DevopsProcess_findings_phase1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase1));
		return driver.findElement(DevopsProcess_findings_phase1);
	}
	private By DevopsProcess_findings_phase2 = By.xpath("(//span[@data-type='Critical'])[2]");
	public WebElement DevopsProcess_findings_phase2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase2));
		return driver.findElement(DevopsProcess_findings_phase2);
	}
	private By DevopsProcess_findings_phase3 = By.xpath("(//span[@data-type='Critical'])[3]");
	public WebElement DevopsProcess_findings_phase3() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase3));
		return driver.findElement(DevopsProcess_findings_phase3);
	}
	private By DevopsProcess_findings_phase4 = By.xpath("(//span[@data-type='Critical'])[4]");
	public WebElement DevopsProcess_findings_phase4() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase4));
		return driver.findElement(DevopsProcess_findings_phase4);
	}
	private By DevopsProcess_findings_phase5 = By.xpath("(//span[@data-type='Critical'])[7]");
	public WebElement DevopsProcess_findings_phase5() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase5));
		return driver.findElement(DevopsProcess_findings_phase5);
	}
	private By DevopsProcess_findings_phase6 = By.xpath("(//span[@data-type='Critical'])[8]");
	public WebElement DevopsProcess_findings_phase6() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase6));
		return driver.findElement(DevopsProcess_findings_phase6);
	}
	private By DevopsProcess_findings_phase7 = By.xpath("(//span[@data-type='Critical'])[10]");
	public WebElement DevopsProcess_findings_phase7() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DevopsProcess_findings_phase7));
		return driver.findElement(DevopsProcess_findings_phase7);
	}
	private By NA_findings = By.xpath("(//span[.='N/A'])[1]");
	public WebElement NA_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(NA_findings));
		return driver.findElement(NA_findings);
	}
	private By NA_Tooltp = By.xpath("//div[@role='tooltip']");
	public WebElement NA_Tooltp() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(NA_Tooltp));
		return driver.findElement(NA_Tooltp);
	}
	/*
	 *   @DASH-396
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Plan
	 */
	private By SSDLC_findings_displayed_total = By.xpath("(//span[@data-type='Total'])[4]");
	public WebElement SSDLC_findings_displayed_total() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_findings_displayed_total));
		return driver.findElement(SSDLC_findings_displayed_total);
	}
	private By Findingspage_date = By.xpath("//tbody/tr[2]/td[8]/div[1]/span[1]");
	public WebElement Findingspage_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findingspage_date));
		return driver.findElement(Findingspage_date);
	}
	private By Findingspage_datetooltip = By.xpath("//div[@role='tooltip']");
	public WebElement Findingspage_datetooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findingspage_datetooltip));
		return driver.findElement(Findingspage_datetooltip);
	}
	/*
	 *   @DASH-401
  Scenario: To check behaviour Product SSDLC Dashboard>>Devops process > Code
	 */
	private By Findings_product_displayed = By.xpath("//span[.='Demo application']");
	public WebElement Findings_product_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_product_displayed));
		return driver.findElement(Findings_product_displayed);
	}
	private By Findings_filter_applied1 = By.xpath("(//span[.='Critical'])[1]");
	public WebElement Findings_filter_applied1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_filter_applied1));
		return driver.findElement(Findings_filter_applied1);
	}
	private By Findings_filter_applied2 = By.xpath("(//span[.='Open'])[1]");
	public WebElement Findings_filter_applied2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_filter_applied2));
		return driver.findElement(Findings_filter_applied2);
	}
	/*
	 *   @DASH-408
  Scenario: To check behaviour of Findings by source/scan type
	 */
	private By SSDLC_Findings_by_source_widget = By.xpath("//div[.='Log Scale ']");
	public WebElement SSDLC_Findings_by_source_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Findings_by_source_widget));
		return driver.findElement(SSDLC_Findings_by_source_widget);
	}
	private By SSDLC_findings_typeList = By.xpath("//span[@title='Source']");
	public WebElement SSDLC_findings_typeList() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_findings_typeList));
		return driver.findElement(SSDLC_findings_typeList);
	}
	private By SSDLC_soucetype = By.xpath("//div[@title='Source']/div");
	public WebElement SSDLC_soucetype() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_soucetype));
		return driver.findElement(SSDLC_soucetype);
	}
	private By SSDLC_ScanTYpe = By.xpath("//div[@title='Scan Type']/div");
	public WebElement SSDLC_ScanTYpe() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_ScanTYpe));
		return driver.findElement(SSDLC_ScanTYpe);
	}
	/*
	 *   @DASH-414
  Scenario: To check behaviour of Product SSDLC Dashboard  >Appsec tool status
	 */
	private By AppSec_tool_widget = By.xpath("//div[normalize-space()='AppSec Tool Status']");
	public WebElement AppSec_tool_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppSec_tool_widget));
		return driver.findElement(AppSec_tool_widget);
	}
	private By Appsec_SOurce_coloumn = By.xpath("(//span[contains(text(),'Source')])[2]");
	public WebElement Appsec_SOurce_coloumn() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appsec_SOurce_coloumn));
		return driver.findElement(Appsec_SOurce_coloumn);
	}
	private By AppSec_Sourcetype_column = By.xpath("(//span[contains(text(),'Source Type')])[2]");
	public WebElement AppSec_Sourcetype_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppSec_Sourcetype_column));
		return driver.findElement(AppSec_Sourcetype_column);
	}
	private By AppSec_Scan_status_column = By.xpath("(//span[contains(text(),'Scan Status')])[2]");
	public WebElement AppSec_Scan_status_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppSec_Scan_status_column));
		return driver.findElement(AppSec_Scan_status_column);
	}
	private By AppSec_Tool_status_column = By.xpath("(//span[contains(text(),'Tool Status')])[2]");
	public WebElement AppSec_Tool_status_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppSec_Tool_status_column));
		return driver.findElement(AppSec_Tool_status_column);
	}
	private By AppSec_Last_run_column = By.xpath("(//th[contains(text(),'Last Run')])[2]");
	public WebElement AppSec_Last_run_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppSec_Last_run_column));
		return driver.findElement(AppSec_Last_run_column);
	}
	/*
	 *   @DASH-415
  Scenario: To check behaviour of Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By Infrastructure_tool_widget = By.xpath("//div[normalize-space()='Infrastructure Security Tools Status']");
	public WebElement Infrastructure_tool_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_tool_widget));
		return driver.findElement(Infrastructure_tool_widget);
	}
	private By Infrastructure_source_column = By.xpath("(//span[contains(text(),'Source')])[4]");
	public WebElement Infrastructure_source_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_source_column));
		return driver.findElement(Infrastructure_source_column);
	}
	private By Infrastructure_Sorcetype_column = By.xpath("(//span[contains(text(),'Source Type')])[2]");
	public WebElement Infrastructure_Sorcetype_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_Sorcetype_column));
		return driver.findElement(Infrastructure_Sorcetype_column);
	}
	private By Infrastructure_ScanStatus_column = By.xpath("(//span[contains(text(),'Scan Status')])[2]");
	public WebElement Infrastructure_ScanStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_ScanStatus_column));
		return driver.findElement(Infrastructure_ScanStatus_column);
	}
	private By Infrastucture_Tool_status_column = By.xpath("(//span[contains(text(),'Tool Status')])[2]");
	public WebElement Infrastucture_Tool_status_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastucture_Tool_status_column));
		return driver.findElement(Infrastucture_Tool_status_column);
	}
	private By Infrastucture_lastRun_column = By.xpath("(//th[contains(text(),'Last Run')])[2]");
	public WebElement Infrastucture_lastRun_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastucture_lastRun_column));
		return driver.findElement(Infrastucture_lastRun_column);
	}
	/*
	 *   @DASH-416
  Scenario: To check behaviour of ci/cd and notification status  > Product SSDLC Dashboard
	 */
	private By CI_CD_Notification_widget = By.xpath("//div[normalize-space()='CI/CD & Notification Status']");
	public WebElement CI_CD_Notification_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CI_CD_Notification_widget));
		return driver.findElement(CI_CD_Notification_widget);
	}
	private By CI_CD_Source_column = By.xpath("(//span[contains(text(),'Source')])[6]");
	public WebElement CI_CD_Source_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CI_CD_Source_column));
		return driver.findElement(CI_CD_Source_column);
	}
	private By CI_CD_ConfigStatus_column = By.xpath("(//span[contains(text(),'Config Status')])");
	public WebElement CI_CD_ConfigStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CI_CD_ConfigStatus_column));
		return driver.findElement(CI_CD_ConfigStatus_column);
	}
	private By CI_CD_ToolStatus_column = By.xpath("(//span[contains(text(),'Tool Status')])[3]");
	public WebElement CI_CD_ToolStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CI_CD_ToolStatus_column));
		return driver.findElement(CI_CD_ToolStatus_column);
	}
	private By CI_CD_LastRun_column = By.xpath("(//th[contains(text(),'Last Run')])[3]");
	public WebElement CI_CD_LastRun_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CI_CD_LastRun_column));
		return driver.findElement(CI_CD_LastRun_column);
	}
	/*
	 *   @DASH-434
  Scenario: Go to SSDLC dashboard > Hover on the Total findings
	 */
	private By SSDLC_Demo_Application = By.xpath("//a[.='Demo application']");
	public WebElement SSDLC_Demo_Application() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Demo_Application));
		return driver.findElement(SSDLC_Demo_Application);
	}
	private By SSDLC_Build_total_findings = By.xpath("(//span[@data-type='Total'])[3]");
	public WebElement SSDLC_Build_total_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Build_total_findings));
		return driver.findElement(SSDLC_Build_total_findings);
	}
	private By SSDLC_Build_total_tooltip = By.xpath("//div[normalize-space()='Total']");
	public WebElement SSDLC_Build_total_tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Build_total_tooltip));
		return driver.findElement(SSDLC_Build_total_tooltip);
	}
	/*
	 *   @DASH-435
  Scenario: Go to SSDLC dashboard > Hover on the Bar
	 */
	private By SSDLC_ScanTrend_bar = By.xpath("(//*[name()='g'])[40]");
	public WebElement SSDLC_ScanTrend_bar() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_ScanTrend_bar));
		return driver.findElement(SSDLC_ScanTrend_bar);
	}
	private By SSDLC_Scantrend_bar_Tool = By.xpath("//span[.='SonarQube']");
	public WebElement SSDLC_Scantrend_bar_Tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantrend_bar_Tool));
		return driver.findElement(SSDLC_Scantrend_bar_Tool);
	}
	/*
	 *   @DASH-436
  Scenario: Go to SSDLC dashboard > Hover on the Bar
	 */
	private By SSDLC_Scantrend_bar_pass = By.xpath("//span[.='Pass Scans']/strong");
	public WebElement SSDLC_Scantrend_bar_pass() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantrend_bar_pass));
		return driver.findElement(SSDLC_Scantrend_bar_pass);
	}
	/*
	 *   @DASH-437
  Scenario: Go to SSDLC dashboard > Click on the date filter
	 */
	private By SSDLC_Scantrend_default_date = By.xpath("(//div)[199]/span[1]");
	public WebElement SSDLC_Scantrend_default_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantrend_default_date));
		return driver.findElement(SSDLC_Scantrend_default_date);
	}
	/*
	 *   @DASH-438
  Scenario: Go to SSDLC dashboard > Click on the date filter
	 */
	private By SSDLC_Scantrend_date_24hours = By.xpath("//li[normalize-space()='Last 24 hour']");
	public WebElement SSDLC_Scantrend_date_24hours() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantrend_date_24hours));
		return driver.findElement(SSDLC_Scantrend_date_24hours);
	}
	private By SSDLC_Scantred_changed_date = By.xpath("//span[.='Last 24 hour']");
	public WebElement SSDLC_Scantred_changed_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantred_changed_date));
		return driver.findElement(SSDLC_Scantred_changed_date);
	}
	private By SSDLC_Scantrend_changed_bar = By.xpath("(//*[name()='g'])[24]");
	public WebElement SSDLC_Scantrend_changed_bar() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Scantrend_changed_bar));
		return driver.findElement(SSDLC_Scantrend_changed_bar);
	}
	/*
	 *   @DASH-440
  Scenario: Go to SSDLC dashboard > Finding by source / Scan type
	 */
	private By SSDLC_Sourcetype_widget_bar = By.xpath("(//*[name()='g'])[15]");
	public WebElement SSDLC_Sourcetype_widget_bar() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Sourcetype_widget_bar));
		return driver.findElement(SSDLC_Sourcetype_widget_bar);
	}
	/*
	 * @DASH-443
  Scenario: Try to turn off/on the toggle button for log scale
	 */
	private By SSDLC_Sourcetype_logscale_toggle = By.xpath("//button[@role='switch']");
	public WebElement SSDLC_Sourcetype_logscale_toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Sourcetype_logscale_toggle));
		return driver.findElement(SSDLC_Sourcetype_logscale_toggle);
	}
	private By SSDLC_Sourcetype_X_axis = By.xpath("(//*[name()='line'])[3]");
	public WebElement SSDLC_Sourcetype_X_axis() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Sourcetype_X_axis));
		return driver.findElement(SSDLC_Sourcetype_X_axis);
	}
	private By SSDLC_toggle_before_switch = By.cssSelector("tspan[x='10']");
	public WebElement SSDLC_toggle_before_switch() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_toggle_before_switch));
		return driver.findElement(SSDLC_toggle_before_switch);
	}
	private By SSDLC_toggle_After_Switch = By.cssSelector("tspan[x='40.70505955772607']");
	public WebElement SSDLC_toggle_After_Switch() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_toggle_After_Switch));
		return driver.findElement(SSDLC_toggle_After_Switch);
	}
	/*
	 *   @DASH-444
  Scenario: Go to SSDLC dashboard > Click on the filter
	 */
	private By SSDLC_Sourcetype_filter = By.xpath("(//*[name()='svg'])[71]");
	public WebElement SSDLC_Sourcetype_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Sourcetype_filter));
		return driver.findElement(SSDLC_Sourcetype_filter);
	}
	private By SSDLC_Sourcetype_Filter_items = By.xpath("//span[.='Custom']");
	public WebElement SSDLC_Sourcetype_Filter_items() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Sourcetype_Filter_items));
		return driver.findElement(SSDLC_Sourcetype_Filter_items);
	}
	/*
	 *   @DASH-445
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	private By SSDLC_Appsec_source_column = By.xpath("(//span[.='Source'])[2]");
	public WebElement SSDLC_Appsec_source_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_source_column));
		return driver.findElement(SSDLC_Appsec_source_column);
	}
	private By SSDLC_Appsec_sourceType_column = By.xpath("(//span[.='Source Type'])[2]");
	public WebElement SSDLC_Appsec_sourceType_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_sourceType_column));
		return driver.findElement(SSDLC_Appsec_sourceType_column);
	}
	private By SSDLC_Appsec_ScanStatus_column = By.xpath("(//span[.='Scan Status'])[2]");
	public WebElement SSDLC_Appsec_ScanStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ScanStatus_column));
		return driver.findElement(SSDLC_Appsec_ScanStatus_column);
	}
	private By SSDLC_Appsec_ToolStatus_column = By.xpath("(//span[.='Tool Status'])[2]");
	public WebElement SSDLC_Appsec_ToolStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ToolStatus_column));
		return driver.findElement(SSDLC_Appsec_ToolStatus_column);
	}
	/*
	 *   @DASH_446
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	private By SSDLC_Appsec_SOurce_Filter = By.xpath("(//span[@aria-label='filter'])[1]");
	public WebElement SSDLC_Appsec_SOurce_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_SOurce_Filter));
		return driver.findElement(SSDLC_Appsec_SOurce_Filter);
	}
	private By Appsec_Source_filter_dropdown = By.xpath("//span[.='SonarQube']/span");
	public WebElement Appsec_Source_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appsec_Source_filter_dropdown));
		return driver.findElement(Appsec_Source_filter_dropdown);
	}
	private By SSDLC_Appsec_Sourcetype_filter = By.xpath("(//span[@aria-label='filter'])[2]");
	public WebElement SSDLC_Appsec_Sourcetype_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_Sourcetype_filter));
		return driver.findElement(SSDLC_Appsec_Sourcetype_filter);
	}
	private By Appsec_Sourcetype_filter_dropdown = By.xpath("//span[.='SAST']/span");
	public WebElement Appsec_Sourcetype_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appsec_Sourcetype_filter_dropdown));
		return driver.findElement(Appsec_Sourcetype_filter_dropdown);
	}
	private By SSDLC_Appsec_ScanStatus_filter = By.xpath("(//span[@role='button'])[4]");
	public WebElement SSDLC_Appsec_ScanStatus_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ScanStatus_filter));
		return driver.findElement(SSDLC_Appsec_ScanStatus_filter);
	}
	private By Appsec_ScanStatus_filter_dropdown = By.xpath("//span[.='Passed']/span/span");
	public WebElement Appsec_ScanStatus_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appsec_ScanStatus_filter_dropdown));
		return driver.findElement(Appsec_ScanStatus_filter_dropdown);
	}
	private By SSDLC_Appsec_ToolStatus_filter = By.xpath("(//span[@role='button'])[5]");
	public WebElement SSDLC_Appsec_ToolStatus_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ToolStatus_filter));
		return driver.findElement(SSDLC_Appsec_ToolStatus_filter);
	}
	private By Appsec_ToolStatus_filter_dropdown = By.xpath("//span[.='Active']/span/span");
	public WebElement Appsec_ToolStatus_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Appsec_ToolStatus_filter_dropdown));
		return driver.findElement(Appsec_ToolStatus_filter_dropdown);
	}
	/*
	 *   @DASH_447
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	private By SSDLC_Appsec_Tool_displayed = By.xpath("//a[normalize-space()='SonarQube']");
	public WebElement SSDLC_Appsec_Tool_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_Tool_displayed));
		return driver.findElement(SSDLC_Appsec_Tool_displayed);
	}
	private By SSDLC_Appsec_Tool_Sourcetype_displayed = By.xpath("//tbody//span[@title='SAST'][normalize-space()='SAST']");
	public WebElement SSDLC_Appsec_Tool_Sourcetype_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_Tool_Sourcetype_displayed));
		return driver.findElement(SSDLC_Appsec_Tool_Sourcetype_displayed);
	}
	private By SSDLC_Appsec_ScanStatus_displayed = By.xpath("(//span[.='Passed'])[1]");
	public WebElement SSDLC_Appsec_ScanStatus_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ScanStatus_displayed));
		return driver.findElement(SSDLC_Appsec_ScanStatus_displayed);
	}
	private By SSDLC_Appsec_ToolStatus_Displayed = By.xpath("(//span[.='Active'])[1]");
	public WebElement SSDLC_Appsec_ToolStatus_Displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_ToolStatus_Displayed));
		return driver.findElement(SSDLC_Appsec_ToolStatus_Displayed);
	}
	/*
	 *   @DASH_448
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	private By Security_tool_page = By.xpath("(//span[.='Security Tools'])[2]");
	public WebElement Security_tool_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Security_tool_page));
		return driver.findElement(Security_tool_page);
	}
	/*
	 *   @DASH_449
  Scenario: Product SSDLC Dashboard  >Appsec tool status
	 */
	private By SSDLC_Appsec_Last_Run_date = By.xpath("//tbody/tr[2]/td[5]/time");
	public WebElement SSDLC_Appsec_Last_Run_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_Last_Run_date));
		return driver.findElement(SSDLC_Appsec_Last_Run_date);
	}
	/*
	 *   @DASH_452
  Scenario: Go to SSDLC dashboard > Check appsec tool status
	 */
	private By SSDLC_Appsec_Tool_Verification = By.xpath("(//div)[208]");
	public WebElement SSDLC_Appsec_Tool_Verification() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Appsec_Tool_Verification));
		return driver.findElement(SSDLC_Appsec_Tool_Verification);
	}
	/*
	 *   @DASH_453
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By SSDLC_Juiceshop_product = By.xpath("//a[.='Juiceshop']");
	public WebElement SSDLC_Juiceshop_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Juiceshop_product));
		return driver.findElement(SSDLC_Juiceshop_product);
	}
	private By SSDLC_Infrasrtucture_Source_Sort = By.xpath("(//span[.='Source'])[4]");
	public WebElement SSDLC_Infrasrtucture_Source_Sort() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Infrasrtucture_Source_Sort));
		return driver.findElement(SSDLC_Infrasrtucture_Source_Sort);
	}
	private By SSDLC_Infrasructure_Sourcetype_sort = By.xpath("(//span[contains(text(),'Source Type')])[2]");
	public WebElement SSDLC_Infrasructure_Sourcetype_sort() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Infrasructure_Sourcetype_sort));
		return driver.findElement(SSDLC_Infrasructure_Sourcetype_sort);
	}
	private By SSDLC_Infrastructure_ScanStatus_sort = By.xpath("(//span[contains(text(),'Scan Status')])[2]");
	public WebElement SSDLC_Infrastructure_ScanStatus_sort() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Infrastructure_ScanStatus_sort));
		return driver.findElement(SSDLC_Infrastructure_ScanStatus_sort);
	}
	private By SSDLC_Infrastucture_ToolStatus_Sort = By.xpath("(//span[contains(text(),'Tool Status')])[2]");
	public WebElement SSDLC_Infrastucture_ToolStatus_Sort() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_Infrastucture_ToolStatus_Sort));
		return driver.findElement(SSDLC_Infrastucture_ToolStatus_Sort);
	}
	/*
	 * @DASH_454
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By Infrastructure_Source_filter = By.xpath("(//span[@role='button'])[6]");
	public WebElement Infrastructure_Source_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_Source_filter));
		return driver.findElement(Infrastructure_Source_filter);
	}
	private By Infrastructure_Source_filter_dropdown = By.xpath("//span[@title='Aqua']");
	public WebElement Infrastructure_Source_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_Source_filter_dropdown));
		return driver.findElement(Infrastructure_Source_filter_dropdown);
	}
	private By Infrastructure_SourceType_filter = By.xpath("(//span[@role='button'])[7]");
	public WebElement Infrastructure_SourceType_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_SourceType_filter));
		return driver.findElement(Infrastructure_SourceType_filter);
	}
	private By Infrastructure_SourceType_filter_dropdown = By.xpath("(//span[@title='Container Security'])[3]");
	public WebElement Infrastructure_SourceType_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_SourceType_filter_dropdown));
		return driver.findElement(Infrastructure_SourceType_filter_dropdown);
	}
	private By Infrastructure_ScanStatus_filter = By.xpath("(//span[@role='button'])[8]");
	public WebElement Infrastructure_ScanStatus_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_ScanStatus_filter));
		return driver.findElement(Infrastructure_ScanStatus_filter);
	}
	private By Infrastructure_ScanStatus_filter_dropdown = By.xpath("(//span[contains(text(),'Failed')])[4]");
	public WebElement Infrastructure_ScanStatus_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_ScanStatus_filter_dropdown));
		return driver.findElement(Infrastructure_ScanStatus_filter_dropdown);
	}
	private By Infrastructure_ToolStatus_filter = By.xpath("(//span[@role='button'])[9]");
	public WebElement Infrastructure_ToolStatus_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_ToolStatus_filter));
		return driver.findElement(Infrastructure_ToolStatus_filter);
	}
	private By Infrastucture_ToolStatus_filter_dropdown = By.xpath("(//span[contains(text(),'Error')])[4]");
	public WebElement Infrastucture_ToolStatus_filter_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastucture_ToolStatus_filter_dropdown));
		return driver.findElement(Infrastucture_ToolStatus_filter_dropdown);
	}
	/*
	 *  @DASH_455
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By Infrastructure_tool_displyed = By.xpath("(//tbody)[2]");
	public WebElement Infrastructure_tool_displyed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_tool_displyed));
		return driver.findElement(Infrastructure_tool_displyed);
	}
	/*
	 *   @DASH_456
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By Infrasture_LastRun_date = By.xpath("(//td)[35]/time");
	public WebElement Infrasture_LastRun_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrasture_LastRun_date));
		return driver.findElement(Infrasture_LastRun_date);
	}
	/*
	 *   @DASH_459
  Scenario: Infrastructure tool status > Product SSDLC Dashboard
	 */
	private By Infrastructure_Tool_Displayed = By.xpath("(//a[normalize-space()='Aqua'])[2]");
	public WebElement Infrastructure_Tool_Displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Infrastructure_Tool_Displayed));
		return driver.findElement(Infrastructure_Tool_Displayed);
	}
	/*
	 *   @DASH_460
  Scenario: ci/cd and notification status  > Product SSDLC Dashboard
	 */
	private By SSDLC_DemoApplication_product = By.xpath("//a[.='Demo application']");
	public WebElement SSDLC_DemoApplication_product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_DemoApplication_product));
		return driver.findElement(SSDLC_DemoApplication_product);
	}
	private By SSDLC_CICD_Source_column = By.xpath("(//span[contains(text(),'Source')])[6]");
	public WebElement SSDLC_CICD_Source_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_CICD_Source_column));
		return driver.findElement(SSDLC_CICD_Source_column);
	}
	private By SSDLC_CICD_Configstatus_column = By.xpath("//span[normalize-space()='Config Status']");
	public WebElement SSDLC_CICD_Configstatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_CICD_Configstatus_column));
		return driver.findElement(SSDLC_CICD_Configstatus_column);
	}
	private By SSDLC_CICD_ToolStatus_column = By.xpath("(//span[contains(text(),'Tool Status')])[3]");
	public WebElement SSDLC_CICD_ToolStatus_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_CICD_ToolStatus_column));
		return driver.findElement(SSDLC_CICD_ToolStatus_column);
	}
	/*
	 *   @DASH_461
  Scenario: ci/cd and notification status  > Tool Status
	 */
	private By SSDLC_CICD_ToolStatus_Sorting_Tooltip = By.xpath("//div[@role='tooltip']");
	public WebElement SSDLC_CICD_ToolStatus_Sorting_Tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SSDLC_CICD_ToolStatus_Sorting_Tooltip));
		return driver.findElement(SSDLC_CICD_ToolStatus_Sorting_Tooltip);
	}
	/*
	 *   @DASH_462
  Scenario: ci/cd and notification status  > Last Run
	 */
	private By CICD_LastRun_date = By.xpath("(//td)[20]/time");
	public WebElement CICD_LastRun_date() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CICD_LastRun_date));
		return driver.findElement(CICD_LastRun_date);
	}
	/*
	 *   @DASH_463
  Scenario: ci/cd and notification status  > Check Tool status
	 */
	private By CICD_Displayed_tool = By.xpath("//tbody/tr/td/span[1]");
	public WebElement CICD_Displayed_tool() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CICD_Displayed_tool));
		return driver.findElement(CICD_Displayed_tool);
	}
	/*
	 *   @CTO_Dashboard
  Scenario: Check behaviour when user navigates to CTO dashboard
	 */
	private By CTO_dashboard = By.xpath("//div[.='CTO']/div");
	public WebElement CTO_dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_dashboard));
		return driver.findElement(CTO_dashboard);
	}
	private By CTO_Dashboard_page = By.xpath("//span[@title='CTO']");
	public WebElement CTO_Dashboard_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Dashboard_page));
		return driver.findElement(CTO_Dashboard_page);
	}
	private By CTO_EmergingThreats_widget = By.xpath("//div[normalize-space()='Emerging Threats']");
	public WebElement CTO_EmergingThreats_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_EmergingThreats_widget));
		return driver.findElement(CTO_EmergingThreats_widget);
	}
	private By CTO_Top5_Open_tickets_widget = By.xpath("//div[normalize-space()='Top Five Open Tickets']");
	public WebElement CTO_Top5_Open_tickets_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Top5_Open_tickets_widget));
		return driver.findElement(CTO_Top5_Open_tickets_widget);
	}
	private By CTO_Vulneribility_widget = By.xpath("//div[normalize-space()='Vulnerability Trend']");
	public WebElement CTO_Vulneribility_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Vulneribility_widget));
		return driver.findElement(CTO_Vulneribility_widget);
	}
	private By CTO_Average_TimeTO_Remediate_widget = By.xpath("//div[normalize-space()='Average Time To Remediate']");
	public WebElement CTO_Average_TimeTO_Remediate_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Average_TimeTO_Remediate_widget));
		return driver.findElement(CTO_Average_TimeTO_Remediate_widget);
	}
	private By CTO_Top_Teams_widget = By.xpath("//div[normalize-space()='Top Teams']");
	public WebElement CTO_Top_Teams_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Top_Teams_widget));
		return driver.findElement(CTO_Top_Teams_widget);
	}
	private By CTO_OWASP_traing_Team_widget = By.xpath("//div[normalize-space()='OWASP Training Requirement By Team']");
	public WebElement CTO_OWASP_traing_Team_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_OWASP_traing_Team_widget));
		return driver.findElement(CTO_OWASP_traing_Team_widget);
	}
	private By CTO_Findings_By_Team_widget = By.xpath("//div[normalize-space()='Findings By Team (Bar)']");
	public WebElement CTO_Findings_By_Team_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Findings_By_Team_widget));
		return driver.findElement(CTO_Findings_By_Team_widget);
	}
	private By CTO_ReleaseGate_Failure_widget = By.xpath("//div[normalize-space()='Release Gate Failures By Product']");
	public WebElement CTO_ReleaseGate_Failure_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_ReleaseGate_Failure_widget));
		return driver.findElement(CTO_ReleaseGate_Failure_widget);
	}
	private By CTO_Closed_tickets_widget = By.xpath("//div[normalize-space()='Closed Ticket Statistics']");
	public WebElement CTO_Closed_tickets_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Closed_tickets_widget));
		return driver.findElement(CTO_Closed_tickets_widget);
	}
	/*
	 *   @DASH-466
  Scenario: Check behaviour when user navigates to Top Five Open Tickets widget
	 */
	private By CTO_Top5Product_displayed = By.xpath("(//col)[9]");
	public WebElement CTO_Top5Product_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Top5Product_displayed));
		return driver.findElement(CTO_Top5Product_displayed);
	}
	private By CTO_TopProduct_TicketID_Column = By.xpath("//th[@title='Ticket ID']");
	public WebElement CTO_TopProduct_TicketID_Column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_TopProduct_TicketID_Column));
		return driver.findElement(CTO_TopProduct_TicketID_Column);
	}
	private By CTO_TopPrpduct_Severity_column = By.xpath("//th[normalize-space()='Severity']");
	public WebElement CTO_TopPrpduct_Severity_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_TopPrpduct_Severity_column));
		return driver.findElement(CTO_TopPrpduct_Severity_column);
	}
	private By CTO_TopProduct_Title_Column = By.xpath("//th[@title='Title']");
	public WebElement CTO_TopProduct_Title_Column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_TopProduct_Title_Column));
		return driver.findElement(CTO_TopProduct_Title_Column);
	}
	private By CTO_TopProduct_TicketAge_Column = By.xpath("//th[normalize-space()='Ticket Age']");
	public WebElement CTO_TopProduct_TicketAge_Column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_TopProduct_TicketAge_Column));
		return driver.findElement(CTO_TopProduct_TicketAge_Column);
	}
	/*
	 *   @DASH-469
  Scenario: Check behaviour when user navigates to Vulnerability Trend widget
	 */
	private By CTO_Vulneribility_NonMitigated = By.xpath("//span[normalize-space()='Non Mitigated']");
	public WebElement CTO_Vulneribility_NonMitigated() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Vulneribility_NonMitigated));
		return driver.findElement(CTO_Vulneribility_NonMitigated);
	}
	private By CTO_Vulneribility_Mitigated = By.xpath("//span[normalize-space()='Mitigated']");
	public WebElement CTO_Vulneribility_Mitigated() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Vulneribility_Mitigated));
		return driver.findElement(CTO_Vulneribility_Mitigated);
	}
	/*
	 *   @DASH-474
  Scenario: Check behaviour when user navigates to Findings By Team (Bar) widget
	 */
	private By CTO_Findings_by_Team_Critical = By.xpath("(//span[contains(text(),'Critical')])[3]");
	public WebElement CTO_Findings_by_Team_Critical() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Findings_by_Team_Critical));
		return driver.findElement(CTO_Findings_by_Team_Critical);
	}
	private By CTO_Findings_by_Team_High = By.xpath("(//span[contains(text(),'High')])[3]");
	public WebElement CTO_Findings_by_Team_High() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Findings_by_Team_High));
		return driver.findElement(CTO_Findings_by_Team_High);
	}
	/*
	 *   @DASH-480
  Scenario: Check behaviour when user clicks on Production / Staging tab
	 */
	private By CTO_Staging_tab = By.xpath("//div[contains(text(),'Staging')]");
	public WebElement CTO_Staging_tab() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Staging_tab));
		return driver.findElement(CTO_Staging_tab);
	}
	private By CTO_Production_tab = By.xpath("//div[contains(text(),'Production')]");
	public WebElement CTO_Production_tab() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CTO_Production_tab));
		return driver.findElement(CTO_Production_tab);
	}
	/*
	 * 	/*
	 *   @DASH-494
  Scenario: Navigate to Global Setting Page_Select Dashboard option
	 */
	private By Dashboard_teamSummery_checkbox = By.xpath("//span[normalize-space()='Teams Summary']");
	public WebElement Dashboard_teamSummery_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_teamSummery_checkbox));
		return driver.findElement(Dashboard_teamSummery_checkbox);
	}
	private By TeamSummery_dashboard_popup = By.xpath("//span[.='x']");
	public WebElement TeamSummery_dashboard_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(TeamSummery_dashboard_popup));
		return driver.findElement(TeamSummery_dashboard_popup);
	}
	private By COmpanyLOGO = By.xpath("//img[@alt='Logo']");
	public WebElement COmpanyLOGO() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(COmpanyLOGO));
		return driver.findElement(COmpanyLOGO);
	}
	private By Team_Summery_Dashboard = By.xpath("//div[contains(text(),'Teams Summary')]");
	public WebElement Team_Summery_Dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Team_Summery_Dashboard));
		return driver.findElement(Team_Summery_Dashboard);
	}
	/*
	 *   @DASH-495
  Scenario: Click on Production and Staging Option from top side
	 */
	private By Team_Summery_Dashboard_page = By.xpath("//span[contains(text(),'Teams Summary')]");
	public WebElement Team_Summery_Dashboard_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Team_Summery_Dashboard_page));
		return driver.findElement(Team_Summery_Dashboard_page);
	}
	/*
	 *   @DASH-496
  Scenario: All Sortings and Reset filter feature on Teams Summary dashboard.
	 */
	private By Teams_SUmmery_Team_column = By.xpath("(//span[contains(text(),'Team')])[2]");
	public WebElement Teams_SUmmery_Team_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_SUmmery_Team_column));
		return driver.findElement(Teams_SUmmery_Team_column);
	}
	private By Teams_Summery_EngineerinfOwner_column = By.xpath("//span[contains(text(),'Engineering Owner')]");
	public WebElement Teams_Summery_EngineerinfOwner_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Summery_EngineerinfOwner_column));
		return driver.findElement(Teams_Summery_EngineerinfOwner_column);
	}
	private By Teams_Summery_TeamSize_column = By.xpath("//span[normalize-space()='Team Size']");
	public WebElement Teams_Summery_TeamSize_column() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Summery_TeamSize_column));
		return driver.findElement(Teams_Summery_TeamSize_column);
	}
	private By Teams_Summery_Reset_filter = By.xpath("(//span[@role='img'])[12]");
	public WebElement Teams_Summery_Reset_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Summery_Reset_filter));
		return driver.findElement(Teams_Summery_Reset_filter);
	}
	/*
	 *   @DASH-498
  Scenario: Tool tip to all of the trend indicators
	 */
	private By Teams_Summery_RsikScore_Trend_icon = By.xpath("(//*[name()='svg'][@role='img'])[8]");
	public WebElement Teams_Summery_RsikScore_Trend_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Summery_RsikScore_Trend_icon));
		return driver.findElement(Teams_Summery_RsikScore_Trend_icon);
	}
	private By RiskScore_Trend_ToolTip = By.xpath("(//div)[228]//div[2]");
	public WebElement RiskScore_Trend_ToolTip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_Trend_ToolTip));
		return driver.findElement(RiskScore_Trend_ToolTip);
	}
	/*
	 *   @DASH-499
  Scenario: Findings coloums_Teams Summary dashboard
	 */
	private By Teams_Dashboard_Total_findings = By.xpath("(//span[@data-type='Total']/span)[1]");
	public WebElement Teams_Dashboard_Total_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_Total_findings));
		return driver.findElement(Teams_Dashboard_Total_findings);
	}
	private By Teams_Dashboard_Critical_findings = By.xpath("(//span[@data-type='Critical']/span)[1]");
	public WebElement Teams_Dashboard_Critical_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_Critical_findings));
		return driver.findElement(Teams_Dashboard_Critical_findings);
	}
	private By Teams_Dashboard_High_findings = By.xpath("(//span[@data-type='High']/span)[1]");
	public WebElement Teams_Dashboard_High_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_High_findings));
		return driver.findElement(Teams_Dashboard_High_findings);
	}
	private By Teams_Findings_page_Total_displayed = By.xpath("(//span)[131]/strong");
	public WebElement Teams_Findings_page_Total_displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Findings_page_Total_displayed));
		return driver.findElement(Teams_Findings_page_Total_displayed);
	}
	/*
	 *   @DASH-500
  Scenario: Click on arrow button to expand Teams Information
	 */
	private By Teams_Dashboard_Product_expandIcon = By.xpath("//tbody/tr[1]/td[1]//*[name()='svg']");
	public WebElement Teams_Dashboard_Product_expandIcon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_Product_expandIcon));
		return driver.findElement(Teams_Dashboard_Product_expandIcon);
	}
	private By Burn_UP_By_Findings_widget = By.xpath("//div[normalize-space()='Burn-Up By Findings/Team']");
	public WebElement Burn_UP_By_Findings_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Burn_UP_By_Findings_widget));
		return driver.findElement(Burn_UP_By_Findings_widget);
	}
	private By Existing_Findings_widget = By.xpath("//div[normalize-space()='Existing Findings']");
	public WebElement Existing_Findings_widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Existing_Findings_widget));
		return driver.findElement(Existing_Findings_widget);
	}
	/*
	 *   @DASH-501
  Scenario: Expand button of Product
	 */
	private By Teams_Dashboard_Produt_arrow = By.xpath("(//*[name()='svg'][@role='img'])[13]");
	public WebElement Teams_Dashboard_Produt_arrow() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_Produt_arrow));
		return driver.findElement(Teams_Dashboard_Produt_arrow);
	}
	private By Teams_Dashboard_Product_Displayed = By.xpath("//th[normalize-space()='Product']");
	public WebElement Teams_Dashboard_Product_Displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_Product_Displayed));
		return driver.findElement(Teams_Dashboard_Product_Displayed);
	}
	private By Teams_Dashboard_SubProduct_Dsiplayed = By.xpath("//th[normalize-space()='Subproduct']");
	public WebElement Teams_Dashboard_SubProduct_Dsiplayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_SubProduct_Dsiplayed));
		return driver.findElement(Teams_Dashboard_SubProduct_Dsiplayed);
	}
	/*
	 *   @DASH-502
  Scenario: Product Name[Link Text button]
	 */
	/*
	 *   @DASH-503
  Scenario: Sub Product Name[Link Text button]
	 */
	private By Teams_Dashboard_product_name = By.xpath("//a[normalize-space()='Tester']");
	public WebElement Teams_Dashboard_product_name() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_product_name));
		return driver.findElement(Teams_Dashboard_product_name);
	}
	private By Teams_Dashboard_SubProduct_name = By.xpath("//a[normalize-space()='Testersp']");
	public  WebElement Teams_Dashboard_SubProduct_name() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Teams_Dashboard_SubProduct_name));
		return driver.findElement(Teams_Dashboard_SubProduct_name);
	}
	private By Open_Product_page = By.xpath("(//div)[49]");
	public WebElement Open_Product_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Open_Product_page));
		return driver.findElement(Open_Product_page);
	}
	/*
	 *   @DASH-509
  Scenario: Navigate to Date filter feature at top right corner
	 */
	private By CISO_Dashboard = By.xpath("//div[@title='CISO']");
	public WebElement CISO_Dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard));
		return driver.findElement(CISO_Dashboard);
	}
	private By CISO_Dashboard_page = By.xpath("//span[@title='CISO']");
	public WebElement CISO_Dashboard_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_page));
		return driver.findElement(CISO_Dashboard_page);
	}
	private By CISO_Dashboard_date_Filter = By.xpath("(//button[@type='button'])[2]");
	public WebElement CISO_Dashboard_date_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_date_Filter));
		return driver.findElement(CISO_Dashboard_date_Filter);
	}
	/*
	 *   @DASH-510
  Scenario: CISO Dashboard > Risk Score
	 */
	private By CISO_Dashboard_RiskScore = By.xpath("(//span[contains(text(),'5/100')])[2]");
	public WebElement CISO_Dashboard_RiskScore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_RiskScore));
		return driver.findElement(CISO_Dashboard_RiskScore);
	}
	/*
	 *   @DASH-514
  Scenario: Product summary >Click on any  product
	 */
	private By CISO_Dashboard_Product = By.xpath("//a[.='Juiceshop']");
	public WebElement CISO_Dashboard_Product() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_Product));
		return driver.findElement(CISO_Dashboard_Product);
	}
	private By CISO_Dashboard_Main_dashboard_Verification = By.xpath("//a[@href='#/']");
	public WebElement CISO_Dashboard_Main_dashboard_Verification() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_Main_dashboard_Verification));
		return driver.findElement(CISO_Dashboard_Main_dashboard_Verification);
	}
	/*
	 *  @DASH-526
  Scenario: Product summary >Click on any  product
	 */
	private By CISO_Dashboard_RiskScore_Tooltip = By.xpath("/html/body/div[5]/div/div/div/div[2]");
	public WebElement CISO_Dashboard_RiskScore_Tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_RiskScore_Tooltip));
		return driver.findElement(CISO_Dashboard_RiskScore_Tooltip);
	}
	/*
	 * @DASH-527
  Scenario: CISO Dashbaord > Apply Global filter
  @DASH-528
  Scenario: Global setting > Set as CISO Dashboard
	 */
	private By CISO_Dashboard_GlobalSettings = By.xpath("//div[@title='CISO']//div[contains(text(),'CISO')]");
	public WebElement CISO_Dashboard_GlobalSettings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_GlobalSettings));
		return driver.findElement(CISO_Dashboard_GlobalSettings);
	}
	private By CISO_Dashboard_Displayed = By.xpath("//span[@title='CISO']");
	public WebElement CISO_Dashboard_Displayed() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_Displayed));
		return driver.findElement(CISO_Dashboard_Displayed);
	}
	/*
	 *   @DASH-530
  Scenario: Product summary >Click on any Findings (Total)
	 */
	private By CISO_Dashboard_Total_Findings = By.xpath("(//span[@data-type='Total'])[1]");
	public WebElement CISO_Dashboard_Total_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_Total_Findings));
		return driver.findElement(CISO_Dashboard_Total_Findings);
	}
	private By CISO_Findings_Open_Status = By.xpath("//span[.='Open']");
	public WebElement CISO_Findings_Open_Status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Findings_Open_Status));
		return driver.findElement(CISO_Findings_Open_Status);
	}
	private By CISO_Findings_AcceptRisk_Status = By.xpath("//span[.='Accept Risk']");
	public WebElement CISO_Findings_AcceptRisk_Status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Findings_AcceptRisk_Status));
		return driver.findElement(CISO_Findings_AcceptRisk_Status);
	}
	private By CISO_Findings_Confirm_status = By.xpath("//span[.='Confirm']");
	public WebElement CISO_Findings_Confirm_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Findings_Confirm_status));
		return driver.findElement(CISO_Findings_Confirm_status);
	}
	/*
	 *   @DASH-531
  Scenario: Product summary >Click on any Findings (Critical)
	 */
	private By CISO_Dashboard_Critical_Findings = By.xpath("(//span[@data-type='Critical'])[1]");
	public WebElement CISO_Dashboard_Critical_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_Critical_Findings));
		return driver.findElement(CISO_Dashboard_Critical_Findings);
	}
	/*
	 * 
  @DASH-532
  Scenario: Product summary >Click on any Findings (High)
	 */
	private By CISO_Dashboard_High_Findings = By.xpath("(//span[@data-type='High'])[1]");
	public WebElement CISO_Dashboard_High_Findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Dashboard_High_Findings));
		return driver.findElement(CISO_Dashboard_High_Findings);
	}
	/*
	 *   @DASH-533
  Scenario: Product Summary> Action  > Click on box.
	 */
	private By CISO_Action_Box = By.xpath("(//span[@role='img'])[14]");
	public WebElement CISO_Action_Box() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Action_Box));
		return driver.findElement(CISO_Action_Box);
	}
	private By CISO_Action_Box_Tooltip = By.xpath("(//div[.='Tool incorrectly configured'])[3]");
	public WebElement CISO_Action_Box_Tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CISO_Action_Box_Tooltip));
		return driver.findElement(CISO_Action_Box_Tooltip);
	}
	/*
	 * @DASH-534
  Scenario: Product Summary> Type
	 */
	private By Products_page = By.xpath("//span[.='Products']");
	public WebElement Products_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Products_page));
		return driver.findElement(Products_page);
	} 
	private By Products_Page_NewProduct_Button = By.xpath("(//button[@type='button'])[3]");
	public WebElement Products_Page_NewProduct_Button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Products_Page_NewProduct_Button));
		return driver.findElement(Products_Page_NewProduct_Button);
	}
	private By New_Product_name = By.xpath("//input[@name='name']");
	public void New_Product_name(String P_name) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_name));
		driver.findElement(New_Product_name).sendKeys(P_name);
	}
	private By New_Product_Type_List = By.xpath("//input[@aria-owns='type_list']");
	public WebElement New_Product_Type_List() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Type_List));
		return driver.findElement(New_Product_Type_List);
	}
	private By New_Product_Type = By.xpath("//div[contains(text(),'IoT Application')]");
	public WebElement New_Product_Type() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Type));
		return driver.findElement(New_Product_Type);
	}
	private By New_Product_Tag = By.xpath("//span[.='Tags']");
	public WebElement New_Product_Tag() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Tag));
		return driver.findElement(New_Product_Tag);
	}
	private By Add_new_Tag_button = By.xpath("//span[.='Add New']");
	public WebElement Add_new_Tag_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_new_Tag_button));
		return driver.findElement(Add_new_Tag_button);
	}
	private By New_Prodct_Key = By.xpath("(//textarea)[1]");
	public void New_Prodct_Key(String Key) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Prodct_Key));
		driver.findElement(New_Prodct_Key).sendKeys(Key);
	}
	private By New_Product_Key_Save_icon = By.xpath("(//*[name()='svg'][@data-icon='check'])[1]");
	public WebElement New_Product_Key_Save_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Key_Save_icon));
		return driver.findElement(New_Product_Key_Save_icon);
	}
	private By New_Product_Next_Button = By.xpath("//span[.='Next']");
	public WebElement New_Product_Next_Button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Next_Button));
		return driver.findElement(New_Product_Next_Button);
	}
	private By New_Product_team_Dropdown = By.xpath("//input[@aria-owns='teamDto_list']");
	public WebElement New_Product_team_Dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_team_Dropdown));
		return driver.findElement(New_Product_team_Dropdown);
	}
	private By New_Prduct_team = By.xpath("//div[@title='punith']//div[contains(text(),'punith')]");
	public WebElement New_Prduct_team() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Prduct_team));
		return driver.findElement(New_Prduct_team);
	}
	private By New_Product_Add_Responsibilty_dropdown = By.xpath("(//span)[348]");
	public WebElement New_Product_Add_Responsibilty_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Add_Responsibilty_dropdown));
		return driver.findElement(New_Product_Add_Responsibilty_dropdown);
	}
	private By New_Product_Security_Owner = By.xpath("(//div[contains(text(),'Security Owner')])[1]");
	public WebElement New_Product_Security_Owner() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Security_Owner));
		return driver.findElement(New_Product_Security_Owner);
	}
	private By New_Product_Submit_Button = By.xpath("//span[normalize-space()='Submit']");
	public WebElement New_Product_Submit_Button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Submit_Button));
		return driver.findElement(New_Product_Submit_Button);
	}
	private By New_Product_created_popup = By.xpath("/html/body/div[5]/div/span/div/div/div/span[2]/strong");
	public WebElement New_Product_created_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_created_popup));
		return driver.findElement(New_Product_created_popup);
	}
	private By Displayed_Product_Type = By.xpath("//tbody/tr[12]/td[5]");
	public WebElement Displayed_Product_Type() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Product_Type));
		return driver.findElement(Displayed_Product_Type);
	}
	private By Displayed_Product_tag = By.xpath("//span[@title='d']");
	public WebElement Displayed_Product_tag() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Product_tag));
		return driver.findElement(Displayed_Product_tag);
	}
	private By Displayed_Security_Owner = By.xpath("//td[normalize-space()='Amrutha TV']");
	public WebElement Displayed_Security_Owner() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Security_Owner));
		return driver.findElement(Displayed_Security_Owner);
	}
	private By New_Product_Selected_Sec_owner = By.xpath("//td[normalize-space()='Amrutha TV']");
	public WebElement New_Product_Selected_Sec_owner() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Selected_Sec_owner));
		return driver.findElement(New_Product_Selected_Sec_owner);
	}
	private By Displayed_Teams = By.xpath("(//td[contains(text(),'punith')])[2]");
	public WebElement Displayed_Teams() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Teams));
		return driver.findElement(Displayed_Teams);
	}
	private By Displayed_Status = By.xpath("(//td[contains(text(),'Active')])[11]");
	public WebElement Displayed_Status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Displayed_Status));
		return driver.findElement(Displayed_Status);
	}
	private By New_Product_Status = By.xpath("//span[normalize-space()='Active']");
	public WebElement New_Product_Status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(New_Product_Status));
		return driver.findElement(New_Product_Status);
	}
	private By Delete_Created_product_button = By.xpath("//div[@role='alert']//button[@type='button']");
	public WebElement Delete_Created_product_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_Created_product_button));
		return driver.findElement(Delete_Created_product_button);
	}
	private By product_Delete_button = By.xpath("//button[@type='submit']");
	public WebElement product_Delete_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Delete_button));
		return driver.findElement(product_Delete_button);
	}
	/*
	 *   @DASH-539
  Scenario: Product Summary>Most Prevelant Vulnerabilities > Log scale
	 */
	private By Most_Prevelent_vul_LogScale_Toggle = By.xpath("(//button[@role='switch'])[1]");
	public WebElement Most_Prevelent_vul_LogScale_Toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Most_Prevelent_vul_LogScale_Toggle));
		return driver.findElement(Most_Prevelent_vul_LogScale_Toggle);
	}
	/*
	 *   @DASH-540
  Scenario: Product Summary>Most Prevelant Vulnerabilities> Description
	 */
	private By Most_Prev_Vul_CWE_Description = By.xpath("(//tbody)[2]");
	public WebElement Most_Prev_Vul_CWE_Description() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Most_Prev_Vul_CWE_Description));
		return driver.findElement(Most_Prev_Vul_CWE_Description);
	}
	/*
	 *   @DASH-545
  Scenario: Product Summary>Most Critical Vulnerabilities>Show more
	 */
	private By Most_Prev_Vul_ShowMore = By.xpath("(//a[contains(text(),'Show More')])[1]");
	public WebElement Most_Prev_Vul_ShowMore() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Most_Prev_Vul_ShowMore));
		return driver.findElement(Most_Prev_Vul_ShowMore);
	}
	private By Insights_page = By.xpath("//a[@href='#/insights']");
	public WebElement Insights_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Insights_page));
		return driver.findElement(Insights_page);
	}
	/*
	 *   @DASH-546
  Scenario: Product Summary>Most Prevelant Weaknesses>when hovering any Description
	 */
	private By Most_Prev_Weakness_Description = By.xpath("(//div)[144]");
	public WebElement Most_Prev_Weakness_Description() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Most_Prev_Weakness_Description));
		return driver.findElement(Most_Prev_Weakness_Description);
	}
	private By MPW_description = By.xpath("(//td)[237]");
	public WebElement MPW_description() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_description));
		return driver.findElement(MPW_description);
	}
	private By MPW_Description_CWENumber = By.xpath("(//div[@role='tooltip'])[2]");
	public WebElement MPW_Description_CWENumber() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_Description_CWENumber));
		return driver.findElement(MPW_Description_CWENumber);
	}
	/*
	 *   @DASH-547
  Scenario: Product Summary>Most Prevelant Weaknesses> Click on any Findings(Critical)
	 */
	private By MPW_Critical_findings = By.xpath("(//a[contains(text(),'6')])[1]");
	public WebElement MPW_Critical_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_Critical_findings));
		return driver.findElement(MPW_Critical_findings);
	}
	private By Findings_Severity_Filter = By.xpath("//button[1]//div[1]//div[1]//span[1]");
	public WebElement Findings_Severity_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_Severity_Filter));
		return driver.findElement(Findings_Severity_Filter);
	}
	private By Count_Of_Applied_filter = By.xpath("//*[@id=\"root\"]/section/main/div/div[4]/div/div[1]/div[7]/div[1]/span/strong");
	public WebElement Count_Of_Applied_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Count_Of_Applied_filter));
		return driver.findElement(Count_Of_Applied_filter);
	}
	/*
	 * @DASH-548
  Scenario: Product Summary>Most Prevelant Weaknesses>Click on any Findings(High)
	 */
	private By MPW_High_findings = By.xpath("(//a[contains(text(),'0')])[3]");
	public WebElement MPW_High_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_High_findings));
		return driver.findElement(MPW_High_findings);
	}
	/*
	 *  @DASH-549
  Scenario: Product Summary>Most Prevelant Weaknesses>Findings(Total)
	 */
	private By MPW_Total_findings = By.xpath("(//a[contains(text(),'6')])[2]");
	public WebElement MPW_Total_findings() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_Total_findings));
		return driver.findElement(MPW_Total_findings);
	}
	/*
	 *   @DASH-550
  Scenario: Product Summary>Most Prevelant Weaknesses>show more
	 */
	private By MPW_ShowMore_link = By.xpath("(//div[.='Show More']/a)[2]");
	public WebElement MPW_ShowMore_link() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MPW_ShowMore_link));
		return driver.findElement(MPW_ShowMore_link);
	}
	/*
	 *   @DASH-551
  Scenario: SLA Breaches by Product>Log Scale
	 */
	private By SLA_LogScale_Toggle = By.xpath("(//button[@role='switch'])[2]");
	public WebElement SLA_LogScale_Toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_LogScale_Toggle));
		return driver.findElement(SLA_LogScale_Toggle);
	}
	/*
	 *  @DASH-552
  Scenario: SLA Breaches by Product>Click on critical finding line
	 */
	private By SLA_Critical_findings_Line = By.xpath("(//*[name()='g'])[36]");
	public WebElement SLA_Critical_findings_Line() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_Critical_findings_Line));
		return driver.findElement(SLA_Critical_findings_Line);
	}
	/*
	 *    @DASH-554
  Scenario: SLA Breaches by Product widget
	 */
	private By SLA_Breaches_by_product_tooltip_icon = By.xpath("(//*[name()='svg'][@role='img'])[27]");
	public WebElement SLA_Breaches_by_product_tooltip_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_Breaches_by_product_tooltip_icon));
		return driver.findElement(SLA_Breaches_by_product_tooltip_icon);
	}
	private By SLA_Breaches_by_product_tooltip = By.xpath("//div[@role='tooltip'][normalize-space()="
			+ "'This widget displays the top 5 Product with highest number of Resolution SLA breaches']");
	public WebElement SLA_Breaches_by_product_tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SLA_Breaches_by_product_tooltip));
		return driver.findElement(SLA_Breaches_by_product_tooltip);
	}
} 
