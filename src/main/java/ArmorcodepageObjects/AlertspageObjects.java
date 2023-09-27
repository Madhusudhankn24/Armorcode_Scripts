package ArmorcodepageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertspageObjects {

	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor Js;

	public AlertspageObjects(WebDriver driver){
		this.driver = driver;
	}
	/*
	 *   @AlertPage
  Scenario: Verify the ALerts page
	 */
	private By Analyze_Alerts_button = By.xpath("//span[.='Alerts']");
	public void Analyze_Alerts_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Analyze_Alerts_button));
		driver.findElement(Analyze_Alerts_button).click();
	}
	/*
	 *   @Alerts @AL-001
  Scenario: Verify that all the information should be properly indented
	 */
	private By Date_Column = By.xpath("//div[.='Date']/div");
	public WebElement Date_Column() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Date_Column));
		return driver.findElement(Date_Column);
	}
	private By Date_Column_ToolTip = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Date_Column_ToolTip() {
		return driver.findElement(Date_Column_ToolTip);
	}
	private By Alerts_Severity_Filter_button = By.xpath("(//span[@role='button'])[5]");
	public WebElement Alerts_Severity_Filter_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alerts_Severity_Filter_button));
		return driver.findElement(Alerts_Severity_Filter_button);
	}
	private By Severity_Filter_search_field = By.xpath("//input[@placeholder='Search']");
	public boolean Severity_Filter_search_field() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Severity_Filter_search_field));
		return driver.findElement(Severity_Filter_search_field).isDisplayed();
	}
	private By Severity_Critical_checkbox = By.xpath("//input[@data-value='CRITICAL']");
	public WebElement Severity_Critical_checkbox() {
		//		wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(Severity_Critical_checkbox));
		return driver.findElement(Severity_Critical_checkbox);
	}
	private By Severity_High_checkbox = By.xpath("//input[@data-value='HIGH']");
	public WebElement Severity_High_checkbox() {
		//		wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(Severity_High_checkbox));
		return driver.findElement(Severity_High_checkbox);
	}
	/*
	 * @Alerts @AL-002
	 * Scenario Outline: Check Count of Alerts based on Alert Severity
	 */
	private By Critical_checkbox = By.xpath("(//span[contains(text(),'Critical')])[11]");
	public WebElement Critical_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Critical_checkbox));
		return driver.findElement(Critical_checkbox);
	}
	private By Severity_apply_button = By.xpath("(//button[@type='button'])[16]");
	public WebElement Severity_apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Severity_apply_button));
		return driver.findElement(Severity_apply_button);
	}
	private By Severity_clear_button = By.xpath("(//button[@type='button'])[14]");
	public WebElement Severity_clear_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Severity_clear_button));
		return driver.findElement(Severity_clear_button);
	}
	private By High_checkbox = By.xpath("//span[contains(text(),'High')]");
	public WebElement High_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(High_checkbox));
		return driver.findElement(High_checkbox);
	}
	private By Displayed_High_alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[2]/div/div/h4");
	public WebElement Displayed_High_alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Displayed_High_alerts));
		return driver.findElement(Displayed_High_alerts);
	}
	private By Total_alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[2]/div/div/div/div[2]/div/div[1]/span");
	public WebElement Total_alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Total_alerts));
		return driver.findElement(Total_alerts);
	}
	private By Displayed_Critical_alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[1]/div/div/div/div/div[1]/div/div/div[2]/div/div/h4");
	public WebElement Displayed_Critical_alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Displayed_Critical_alerts));
		return driver.findElement(Displayed_Critical_alerts);
	}
	private By Info_checkbox = By.xpath("(//span[contains(text(),'Info')])[1]");
	public WebElement Info_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Info_checkbox));
		return driver.findElement(Info_checkbox);
	}
	private By Displayed_Info_alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[1]/div/div/div/div/div[5]/div/div/div[2]/div/div/h4");
	public WebElement Displayed_Info_alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Displayed_Info_alerts));
		return driver.findElement(Displayed_Info_alerts);
	}
	private By Low_checkbox = By.xpath("(//span[contains(text(),'Low')])[1]");
	public WebElement Low_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Low_checkbox));
		return driver.findElement(Low_checkbox);
	}
	private By Displayed_Low_Alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[1]/div/div/div/div/div[4]/div/div/div[2]/div/div/h4");
	public WebElement Displayed_Low_Alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Displayed_Low_Alerts));
		return driver.findElement(Displayed_Low_Alerts);
	}
	private By Displayed_Medium_Alerts = By.xpath("//*[@id=\"root\"]/section/main/div[2]/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/div/h4");
	public WebElement Displayed_Medium_Alerts() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Displayed_Medium_Alerts));
		return driver.findElement(Displayed_Medium_Alerts);
	}
	private By Medium_checkbox = By.xpath("(//span[contains(text(),'Medium')])[1]");
	public WebElement Medium_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Medium_checkbox));
		return driver.findElement(Medium_checkbox);
	}
	/*
	 * 
	 *   @Alerts @AL-007
  Scenario: Verify the filters in Alerts page
	 * 
	 */
	private By Application_Logo = By.xpath("//img[@alt='Logo']");
	public WebElement Application_Logo() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Application_Logo));
		return driver.findElement(Application_Logo);
	}
	private By Alert_ID_Filter = By.xpath("(//span[@role='button'])[2]");
	public WebElement Alert_ID_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_ID_Filter));
		return driver.findElement(Alert_ID_Filter);
	}
	private By ALert_ID_saerchfield = By.xpath("//input[@placeholder='Search']");
	public WebElement ALert_ID_saerchfield() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ALert_ID_saerchfield));
		return driver.findElement(ALert_ID_saerchfield);
	}
	private By Alert_ID_Apply_button = By.xpath("(//button[@type='button'])[15]");
	public WebElement Alert_ID_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_ID_Apply_button));
		return driver.findElement(Alert_ID_Apply_button);
	}
	private By Alert_filter_clear_button = By.xpath("(//button[@type='button'])[14]");
	public WebElement Alert_filter_clear_button() {
		wait = new WebDriverWait(driver, 20);;
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_filter_clear_button));
		return driver.findElement(Alert_filter_clear_button);
	}
	private By Alert_Date_Filter = By.xpath("(//span[@aria-label='filter'])[3]");
	public WebElement Alert_Date_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Date_Filter));
		return driver.findElement(Alert_Date_Filter);
	}
	private By Date_Last_24Hour = By.xpath("//ul[@role='menu']//li[2]");
	public WebElement Date_Last_24Hour() {
		return driver.findElement(Date_Last_24Hour);
	}
	private By Alert_Status_Filter = By.xpath("(//span[@aria-label='filter'])[5]");
	public WebElement Alert_Status_Filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Status_Filter));
		return driver.findElement(Alert_Status_Filter);
	}
	private By Open_Status_checkbox = By.xpath("(//span[@title='Open'])[1]");
	public WebElement Open_Status_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Open_Status_checkbox));
		return driver.findElement(Open_Status_checkbox);
	}
	private By Status_filter_Apply_Button = By.xpath("(//button[@type='button'])[16]");
	public WebElement Status_filter_Apply_Button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Status_filter_Apply_Button));
		return driver.findElement(Status_filter_Apply_Button);
	}
	private By Alert_product_filter = By.xpath("(//span[@aria-label='filter'])[6]");
	public WebElement Alert_product_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_filter));
		return driver.findElement(Alert_product_filter);
	}
	private By Alert_product_search = By.xpath("(//input[@placeholder='Search'])[2]");
	public WebElement Alert_product_search() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_search));
		return driver.findElement(Alert_product_search);
	}
	private By product_checkbox1 = By.xpath("//span[@title='casestudy']");
	public WebElement product_checkbox1() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(product_checkbox1));
		return driver.findElement(product_checkbox1);
	}
	private By product_checkbox2 = By.xpath("(//span[@title='Test'])[1]");
	public WebElement product_checkbox2() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(product_checkbox2));
		return driver.findElement(product_checkbox2);
	}
	private By product_filter_Apply_button = By.xpath("//body/div/div/div/div/div/div/button[1]");
	public void product_filter_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(product_filter_Apply_button));
		driver.findElement(product_filter_Apply_button).click();
	}
	private By Alert_product_clear_button = By.xpath("(//span[contains(text(),'Clear')])[2]");
	public WebElement Alert_product_clear_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_clear_button));
		return driver.findElement(Alert_product_clear_button);
	}
	private By Sub_product_filter = By.xpath("(//span[@aria-label='filter'])[7]");
	public WebElement Sub_product_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Sub_product_filter));
		return driver.findElement(Sub_product_filter);
	}
	private By Sub_product_checkbox = By.xpath("(//span[@title='hello'])[1]");
	public WebElement Sub_product_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Sub_product_checkbox));
		return driver.findElement(Sub_product_checkbox);
	}
	private By Sub_product_Apply_Button = By.xpath("(//button[@type='button'])[12]");
	public WebElement Sub_product_Apply_Button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Sub_product_Apply_Button));
		return driver.findElement(Sub_product_Apply_Button);
	}
	private By Alert_Environment_filter = By.xpath("(//span[@aria-label='filter'])[8]");
	public WebElement Alert_Environment_filter() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Environment_filter));
		return driver.findElement(Alert_Environment_filter);
	}
	private By Environment_Production_checkbox = By.xpath("//span[@title='Production']");
	public WebElement Environment_Production_checkbox() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Environment_Production_checkbox));
		return driver.findElement(Environment_Production_checkbox);
	}
	private By Environment_Staging_checkbox = By.xpath("//span[@title='Staging']");
	public WebElement Environment_Staging_checkbox() {
		return driver.findElement(Environment_Staging_checkbox);
	}
	private By Environment_filter_Apply_button = By.xpath("(//span[contains(text(),'Apply')])[2]");
	public WebElement Environment_filter_Apply_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Environment_filter_Apply_button));
		return driver.findElement(Environment_filter_Apply_button);
	}
	private By Date_list = By.xpath("/html/body/div[5]/div/div/div/div/div/div[1]/ul//li");
	public List<WebElement> Date_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Date_list));
		return driver.findElements(Date_list);
	}
	private By Last_24_hours = By.xpath("(//li[normalize-space()='Last 24 hour'])[1]");
	public WebElement Last_24_hours() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Last_24_hours));
		return driver.findElement(Last_24_hours);
	}
	private By Last_48_hours = By.xpath("(//li[normalize-space()='Last 48 hour'])[1]");
	public WebElement Last_48_hours() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Last_48_hours));
		return driver.findElement(Last_48_hours);
	}
	private By Last_30_days = By.xpath("(//li[normalize-space()='Last 30 days'])[1]");
	public WebElement Last_30_days() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Last_30_days));
		return driver.findElement(Last_30_days);
	}
	/*
	 *   @Alerts @AL-011
  Scenario: Sorting should working as per the condition( eg: Ascending)
	 *
	 **
	 */
	private By Alert_ID_Column = By.xpath("//div[.='Alert ID']/div");//span[.='Alert ID']/div
	public WebElement Alert_ID_Column() {
		return driver.findElement(Alert_ID_Column);
	}
	private By Alert_ID_Column_Tooltip = By.xpath("//div[@role='tooltip']");
	public WebElement Alert_ID_Column_Tooltip() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_ID_Column_Tooltip));
		return driver.findElement(Alert_ID_Column_Tooltip);
	}
	private By Alert_Date_column_tooltip = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]");
	public WebElement Alert_Date_column_tooltip() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Date_column_tooltip));
		return driver.findElement(Alert_Date_column_tooltip);
	}
	private By Alert_Date_Column = By.xpath("//div[.='Date']/div");
	public WebElement Alert_Date_Column() {
		return driver.findElement(Alert_Date_Column);
	}
	private By Alert_Date_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_Date_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Date_Column_Tooltip_cancel));
		return driver.findElement(Alert_Date_Column_Tooltip_cancel);
	}
	private By Alert_Date_Column_Tooltip_ascending = By.xpath("(//div[@role='tooltip'][normalize-space()='Click to sort in ascending'])[3]");
	public WebElement Alert_Date_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Date_Column_Tooltip_ascending));
		return driver.findElement(Alert_Date_Column_Tooltip_ascending);
	}
	private By Alert_Date_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_Date_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Date_Column_Tooltip_descending));
		return driver.findElement(Alert_Date_Column_Tooltip_descending);
	}
	private By Alert_Severity_Column = By.xpath("//span[.='Severity']/div");
	public WebElement Alert_Severity_Column() {
		return driver.findElement(Alert_Severity_Column);
	}
	private By Alert_Severity_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_Severity_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Severity_Column_Tooltip_cancel));
		return driver.findElement(Alert_Severity_Column_Tooltip_cancel);
	}
	private By Alert_Severity_Column_Tooltip_ascending = By.xpath("//div[.='Click to sort in ascending']/div[2]");
	public WebElement Alert_Severity_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Severity_Column_Tooltip_ascending));
		return driver.findElement(Alert_Severity_Column_Tooltip_ascending);
	}
	private By Alert_Severity_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_Severity_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Severity_Column_Tooltip_descending));
		return driver.findElement(Alert_Severity_Column_Tooltip_descending);
	}
	private By Alert_status_column = By.xpath("//span[.='Status']/div");
	public WebElement Alert_status_column() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_status_column));
		return driver.findElement(Alert_status_column);
	}
	private By Alert_status_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_status_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_status_Column_Tooltip_cancel));
		return driver.findElement(Alert_status_Column_Tooltip_cancel);
	}
	private By Alert_status_Column_Tooltip_ascending = By.xpath("//div[.='Click to sort in ascending']/div[2]");
	public WebElement Alert_status_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_status_Column_Tooltip_ascending));
		return driver.findElement(Alert_status_Column_Tooltip_ascending);
	}
	private By Alert_status_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_status_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_status_Column_Tooltip_descending));
		return driver.findElement(Alert_status_Column_Tooltip_descending);
	}
	private By Alert_product_column = By.xpath("//span[.='Product']/div");
	public WebElement Alert_product_column() {
		return driver.findElement(Alert_product_column);
	}
	private By Alert_product_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_product_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_Column_Tooltip_cancel));
		return driver.findElement(Alert_product_Column_Tooltip_cancel);
	}
	private By Alert_product_Column_Tooltip_ascending = By.xpath("//div[.='Click to sort in ascending']/div[2]");
	public WebElement Alert_product_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_Column_Tooltip_ascending));
		return driver.findElement(Alert_product_Column_Tooltip_ascending);
	}
	private By Alert_product_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_product_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_product_Column_Tooltip_descending));
		return driver.findElement(Alert_product_Column_Tooltip_descending);
	}
	private By Alert_Subproduct_column = By.xpath("//span[.='Subproduct']/div");
	public WebElement Alert_Subproduct_column() {
		return driver.findElement(Alert_Subproduct_column);
	}
	private By Alert_subproduct_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_subproduct_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_subproduct_Column_Tooltip_cancel));
		return driver.findElement(Alert_subproduct_Column_Tooltip_cancel);
	}
	private By Alert_subproduct_Column_Tooltip_ascending = By.xpath("//div[.='Click to sort in ascending']/div[2]");
	public WebElement Alert_subproduct_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_subproduct_Column_Tooltip_ascending));
		return driver.findElement(Alert_subproduct_Column_Tooltip_ascending);
	}
	private By Alert_subproduct_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_subproduct_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_subproduct_Column_Tooltip_descending));
		return driver.findElement(Alert_subproduct_Column_Tooltip_descending);
	}
	private By Alert_Environment_column = By.xpath("//span[.='Environment']/div");
	public WebElement Alert_Environment_column() {
		return driver.findElement(Alert_Environment_column);
	}
	private By Alert_Environment_Column_Tooltip_cancel = By.xpath("//div[.='Click to cancel sorting']/div[2]");
	public WebElement Alert_Environment_Column_Tooltip_cancel() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Environment_Column_Tooltip_cancel));
		return driver.findElement(Alert_Environment_Column_Tooltip_cancel);
	}
	private By Alert_Environment_Column_Tooltip_ascending = By.xpath("//div[.='Click to sort in ascending']/div[2]");
	public WebElement Alert_Environment_Column_Tooltip_ascending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Environment_Column_Tooltip_ascending));
		return driver.findElement(Alert_Environment_Column_Tooltip_ascending);
	}
	private By Alert_Environment_Column_Tooltip_descending = By.xpath("//div[.='Click to sort in descending']/div[2]");
	public WebElement Alert_Environment_Column_Tooltip_descending() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Alert_Environment_Column_Tooltip_descending));
		return driver.findElement(Alert_Environment_Column_Tooltip_descending);
	}

}















