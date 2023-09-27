package ArmorcodepageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalSettings_pageObjects {
	private WebDriver driver;
	private WebDriverWait wait;
	public JavascriptExecutor Js;
	public GlobalSettings_pageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * Launch Application
	 */
	@FindBy(xpath = "//span[.='Global Settings']") @CacheLookup 
	/*
	 * By using By By.xpath not possible to scroll
	 * So using @FindBy
	 */
	WebElement globalsettings;
	public void Global_Settings_Button() 
			throws InterruptedException {
		Thread.sleep(2000);
		Js = ((JavascriptExecutor)driver);
		Js.executeScript("arguments[0].scrollIntoView(true);", globalsettings);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(globalsettings));
		globalsettings.click();
	}
	private By Global_Page_vefification = By.xpath("//span[.='Add IP Address']");
	public WebElement Global_Page_vefification() {
		return driver.findElement(Global_Page_vefification);
	}
	/*
	 *   @GS-031
  Scenario: To verify Edited Product/Sub Products & Projects Names on every where.
	 *
	 */
	@FindBy(xpath = "(//div[@role='tab'])[15]")@CacheLookup WebElement product_subproduct_Status_Button;
	public void product_subproduct_Status_Button() 
			throws InterruptedException {
		Thread.sleep(2000);
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", product_subproduct_Status_Button);
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(product_subproduct_Status_Button));
		Js.executeScript("arguments[0].click();",product_subproduct_Status_Button);
	}
	private By Active_status_edit_button = By.xpath("(//*[name()='svg'])[19]");
	public WebElement Active_status_edit_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Active_status_edit_button));
		return driver.findElement(Active_status_edit_button);
	}
	private By Edit_Active_status = By.xpath("//input[@id='productStatus']");
	public void Edit_Active_status(String status) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_Active_status));
		driver.findElement(Edit_Active_status).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		driver.findElement(Edit_Active_status).sendKeys(status);
	}
	private By Edit_status_note = By.xpath("//textarea[@placeholder='Note']");
	public void Edit_status_note(String note) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_status_note));
		driver.findElement(Edit_status_note).sendKeys(note);
	}
	private By Edit_status_Submit_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Edit_status_Submit_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_status_Submit_button));
		return driver.findElement(Edit_status_Submit_button);
	}
	private By Edit_status_success_popup = By.xpath("//body/div/div/span/div/div/div/span[2]");
	public WebElement Edit_status_success_popup() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Edit_status_success_popup));
		return driver.findElement(Edit_status_success_popup);
	}
	/*
	 *   @GS-041
  Scenario: To set the basis on which product risk score will be calculated.
	 *
	 */
	@FindBy(xpath = "//div[.='Risk Calculation Type']/div")@CacheLookup WebElement RiskCalculationType;
	public void Risk_calculation_Type()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", RiskCalculationType);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(RiskCalculationType));
		Js.executeScript("arguments[0].click();",RiskCalculationType);
	}
	private By Risk_calculation_type_page_verification = By.xpath("//h5[normalize-space()='Risk Calculation Type']");
	public WebElement Risk_calculation_type_page_verification() {
		return driver.findElement(Risk_calculation_type_page_verification);
	}
	private By Riskiest_radio_button = By.xpath("//span[.='Riskiest']");
	public WebElement Riskiest_radio_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Riskiest_radio_button));
		return driver.findElement(Riskiest_radio_button);
	}
	private By Mean_radio_button = By.xpath("//span[.='Mean']");
	public WebElement Mean_radio_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Mean_radio_button));
		return driver.findElement(Mean_radio_button);
	}
	private By Inferior_radio_button = By.xpath("//span[.='Inferior']");
	public WebElement Inferior_radio_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Inferior_radio_button));
		return driver.findElement(Inferior_radio_button);
	}
	private By ResetToDefault_button = By.xpath("//span[.='Reset to Default']");
	public WebElement ResetToDefault_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ResetToDefault_button));
		return driver.findElement(ResetToDefault_button);
	}
	private By Radio_button_validation = By.xpath("//input[@value='RISKY']");
	public WebElement Radio_button_validation() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Radio_button_validation));
		return driver.findElement(Radio_button_validation);
	}
	/*
	 *   @GS-047
  Scenario: To check SLA template configs
	 *
	 */
	@FindBy(xpath = "//div[.='Findings SLA']/div")@CacheLookup WebElement FindingsSLA;
	public void Findings_SLA()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", FindingsSLA);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(FindingsSLA));
		Js.executeScript("arguments[0].click();",FindingsSLA);
	}
	private By SLA_page_validation = By.xpath("//h5[normalize-space()='Findings SLA Configuration']");
	public WebElement SLA_page_validation() {
		return driver.findElement(SLA_page_validation);
	}
	private By Default_SLA = By.xpath("//div[@role='button'][contains(text(),'Default SLA')]");
	public WebElement Default_SLA() {
		return driver.findElement(Default_SLA);
	}
	/*
	 *   @GS-055
  Scenario: To verify deletion of SLA template
	 *
	 */
	private By Add_SLA_button = By.xpath("(//button[@type='button'])[4]");
	public WebElement Add_SLA_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_SLA_button));
		return driver.findElement(Add_SLA_button);
	}
	private By Add_SLA_popup_validation = By.xpath("//div[contains(text(),'Create SLA with desired name and description based')]");
	public WebElement Add_SLA_popup_validation() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_SLA_popup_validation));
		return driver.findElement(Add_SLA_popup_validation);
	}
	private By Add_SLA_name = By.xpath("//input[@id='slaName']");
	public void Add_SLA_name(String name) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Add_SLA_name));
		driver.findElement(Add_SLA_name).sendKeys(name);
	}
	private By Add_SLA_description = By.xpath("//textarea[@id='description']");
	public void Add_SLA_description(String description) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Add_SLA_description));
		driver.findElement(Add_SLA_description).sendKeys(description);
	}
	@FindBy(xpath = "//input[@id='critical_firstResponseSla']")@CacheLookup WebElement TSLA_Critical;
	public void TSLA_Critical(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(TSLA_Critical));
		TSLA_Critical.clear();
		TSLA_Critical.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='high_firstResponseSla']")@CacheLookup WebElement TSLA_High;
	public void TSLA_High(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(TSLA_High));
		TSLA_High.clear();
		TSLA_High.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='medium_firstResponseSla']")@CacheLookup WebElement TSLA_Medium;
	public void TSLA_Medium(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(TSLA_Medium));
		TSLA_Medium.clear();
		TSLA_Medium.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='low_firstResponseSla']")@CacheLookup WebElement TSLA_Low;
	public void TSLA_Low(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(TSLA_Low));
		TSLA_Low.clear();
		TSLA_Low.sendKeys(days);
	}
	/*
	 * RemidiationSLA
	 * 
	 */
	@FindBy(xpath = "//input[@id='critical_developerSla']")@CacheLookup WebElement RSLA_Critical;
	public void RSLA_Critical(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(RSLA_Critical));
		RSLA_Critical.clear();
		RSLA_Critical.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='high_developerSla']")@CacheLookup WebElement RSLA_High;
	public void RSLA_High(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(RSLA_High));
		RSLA_High.clear();
		RSLA_High.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='medium_developerSla']")@CacheLookup WebElement RSLA_Medium;
	public void RSLA_Medium(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(RSLA_Medium));
		RSLA_Medium.clear();
		RSLA_Medium.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='low_developerSla']")@CacheLookup WebElement RSLA_Low;
	public void RSLA_Low(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(RSLA_Low));
		RSLA_Low.clear();
		RSLA_Low.sendKeys(days);
	}
	/*
	 * ResolutionSLA
	 * 
	 */
	@FindBy(xpath = "//input[@id='critical_resolutionSla']")@CacheLookup WebElement ReSLA_Critical;
	public void ReSLA_Critical(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ReSLA_Critical));
		ReSLA_Critical.clear();
		ReSLA_Critical.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='high_resolutionSla']")@CacheLookup WebElement ReSLA_High;
	public void ReSLA_High(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ReSLA_High));
		ReSLA_High.clear();
		ReSLA_High.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='medium_resolutionSla']")@CacheLookup WebElement ReSLA_Medium;
	public void ReSLA_Medium(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ReSLA_Medium));
		ReSLA_Medium.clear();
		ReSLA_Medium.sendKeys(days);
	}
	@FindBy(xpath = "//input[@id='low_resolutionSla']")@CacheLookup WebElement ReSLA_Low;
	public void ReSLA_Low(String days) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ReSLA_Low));
		ReSLA_Low.clear();
		ReSLA_Low.sendKeys(days);
	}
	@FindBy(xpath = "//button[.='Save']")@CacheLookup WebElement savebutton;
	public void SLA_Save_button() {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(savebutton));
		savebutton.click();
	}
	private By Add_SLA_save_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Add_SLA_save_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_SLA_save_button));
		return driver.findElement(Add_SLA_save_button);
	}
	private By Add_SlA_popup_validation = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Add_SlA_popup_validation() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_SlA_popup_validation));
		return driver.findElement(Add_SlA_popup_validation);
	}
	private By Delete_SLA_icon = By.xpath("//body//div//div[@role='button'][contains(text(),'newSLA3')]//span[2]//*[name()='svg']");
	public WebElement Delete_SLA_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_SLA_icon));
		return driver.findElement(Delete_SLA_icon);
	}
	private By Delete_popup_validation = By.xpath("//p[normalize-space()='You want to delete \"newSLA3\" SLA configuration?']");
	public WebElement Delete_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_popup_validation));
		return driver.findElement(Delete_popup_validation);
	}
	@FindBy(xpath = "//input[@placeholder='Delete']")WebElement Delete_text;
	public void Delete_text(String delete) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Delete_text));
		Delete_text.sendKeys(delete);
	}
	private By Delete_SLA_sumbit_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Delete_SLA_sumbit_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_SLA_sumbit_button));
		return driver.findElement(Delete_SLA_sumbit_button);
	}
	/*
	 *   @GS-064
  Scenario: Verify Global Settings-Relese Management
	 *
	 */
	@FindBy(xpath = "//div[.='Release Management']/div")@CacheLookup WebElement Release_management_button;
	public void Release_management_button() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Release_management_button);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Release_management_button));
		Js.executeScript("arguments[0].click();",Release_management_button);
	}
	private By Release_management_page_validation = By.xpath("//th[normalize-space()='New findings for']");
	public WebElement Release_management_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Release_management_page_validation));
		return driver.findElement(Release_management_page_validation);
	}
	private By RM_Add_button = By.xpath("//button[.='Add']");
	public WebElement RM_Add_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RM_Add_button));
		return driver.findElement(RM_Add_button);
	}
	private By RM_Add_popup_validation = By.xpath("//div[.=' Release Gate']/div");
	public WebElement RM_Add_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RM_Add_popup_validation));
		return driver.findElement(RM_Add_popup_validation);
	}
	private By RM_Global_option = By.xpath("//button[.='Global']/span");
	public WebElement RM_Global_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RM_Global_option));
		return driver.findElement(RM_Global_option);
	}
	private By RM_Specific_option = By.xpath("//button[.='Specific']/span");
	public WebElement RM_Specific_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RM_Specific_option));
		return driver.findElement(RM_Specific_option);
	}
	/*
	 *   @GS-085
  Scenario: Verify the Dashboard has all the data
	 *
	 */
	@FindBy(xpath = "//div[.='Dashboards']/div")@CacheLookup WebElement Dashboards;
	public void Dashboards()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Dashboards);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Dashboards));
		Js.executeScript("arguments[0].click();",Dashboards);
	}
	private By Dashboard_page_validation = By.xpath("//h5[normalize-space()='Dashboards']");
	public WebElement Dashboard_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_page_validation));
		return driver.findElement(Dashboard_page_validation);
	}
	private By OOD_dashboard_option = By.xpath("//label[@title=\"Enable the following 'OOB' dashboard\"]");
	public WebElement OOD_dashboard_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(OOD_dashboard_option));
		return driver.findElement(OOD_dashboard_option);
	}
	private By Default_dashboard_option = By.xpath("//label[@for='defaultDashboard']");
	public WebElement Default_dashboard_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Default_dashboard_option));
		return driver.findElement(Default_dashboard_option);
	}
	/*
	 *  @GS-086
  Scenario: when we hover on the pen Icon tooltip should be display
	 *
	 */
	private By Dashboard_pencil_icon = By.xpath("span[role='img'][data-id='SECURITY']");
	public WebElement Dashboard_pencil_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_pencil_icon));
		return driver.findElement(Dashboard_pencil_icon);
	}
	private By Dashboard_pecil_icon_tooltip = By.xpath("//div[@role='tooltip']");
	public WebElement Dashboard_pecil_icon_tooltip() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_pecil_icon_tooltip));
		return driver.findElement(Dashboard_pecil_icon_tooltip);
	}
	/*
	 *   @GS-087
  Scenario: when user Click on Pen icon edit dashboard popup should display
	 *
	 */
	private By Edit_dashboard_name_popup_validation = By.xpath("//div[.='Edit Dashboard name.']/div");
	public WebElement Edit_dashboard_name_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Edit_dashboard_name_popup_validation));
		return driver.findElement(Edit_dashboard_name_popup_validation);
	}
	private By dashboard_new_name = By.xpath("(//input[@type='text'])[3]");
	public void dashboard_new_name(String new_name) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashboard_new_name));
		driver.findElement(dashboard_new_name).sendKeys(new_name);
	}
	private By Dashboard_Save_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Dashboard_Save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_Save_button));
		return driver.findElement(Dashboard_Save_button);
	}
	private By Dashboard_reset_default_button = By.xpath("(//button[@type='button'])[4]");
	public WebElement Dashboard_reset_default_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_reset_default_button));
		return driver.findElement(Dashboard_reset_default_button);
	}
	/*
	 *   @GS-093
  Scenario: Verify the checkbox and dashboard name
	 * 
	 */
	@FindBy(xpath = "//input[@value='SECURITY']")@CacheLookup WebElement checkbox;
	public void Dashboard_Severity_checkbox() throws InterruptedException {
		Thread.sleep(2000);
		checkbox.click();
	}
	private By Dashboard_checkbox_popup_validation = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Dashboard_checkbox_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Dashboard_checkbox_popup_validation));
		return driver.findElement(Dashboard_checkbox_popup_validation);
	}
	private By Default_dashboard_dropdown = By.xpath("(//div)[158]");
	public WebElement Default_dashboard_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Default_dashboard_dropdown));
		return driver.findElement(Default_dashboard_dropdown);
	}
	private By Severity_option_validation = By.xpath("//div[contains(text(),'Security')]");
	public WebElement Severity_option_validation() {
		return driver.findElement(Severity_option_validation);
	}
	/*
	 *   @GS-095
  Scenario: Verify Dashboard config functionality
	 */
	private By Configure_dashboard_button = By.xpath("//a[@data-id='SECURITY']");
	public WebElement Configure_dashboard_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Configure_dashboard_button));
		return driver.findElement(Configure_dashboard_button);
	}
	private By Custom_Dashboard_validation = By.xpath("//span[normalize-space()='Edit Dashboard']");
	public WebElement Custom_Dashboard_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Custom_Dashboard_validation));
		return driver.findElement(Custom_Dashboard_validation);
	}
	private By Add_Widget = By.xpath("(//div)[71]");
	public WebElement Add_Widget() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_Widget));
		return driver.findElement(Add_Widget);
	}
	private By Add_Widget_confirm_popup = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Add_Widget_confirm_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_Widget_confirm_popup));
		return driver.findElement(Add_Widget_confirm_popup);
	}
	private By Add_widget_popup_close_button = By.xpath("//span[normalize-space()='x']");
	public WebElement Add_widget_popup_close_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Add_widget_popup_close_button));
		return driver.findElement(Add_widget_popup_close_button);
	}
	private By Delete_Added_widget_button = By.xpath("(//div)[2391]");
	public WebElement Delete_Added_widget_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Delete_Added_widget_button));
		return driver.findElement(Delete_Added_widget_button);
	}
	private By custom_widget_save_button =  By.xpath("(//button[@type='button'])[4]");
	public WebElement custom_widget_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(custom_widget_save_button));
		return driver.findElement(custom_widget_save_button);
	}
	private By custom_widget_delete_button = By.xpath("(//div)[2391]");
	public WebElement custom_widget_delete_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(custom_widget_delete_button));
		return driver.findElement(custom_widget_delete_button);
	}
	/*
	 *   @GS-099
  Scenario: Verify product/Sub product security Dashboard functionality
	 *
	 */
	private By Product_SubProduct_Security_Dashboard = By.xpath("//a[@href='#/dashboard/template/PRODUCT_SECURITY']");
	public WebElement Product_SubProduct_Security_Dashboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_SubProduct_Security_Dashboard));
		return driver.findElement(Product_SubProduct_Security_Dashboard);
	}
	private By Product_SubProduct_SDLC_dasboard = By.xpath("//a[normalize-space()='Configure Product / Subproduct SSDLC Dashboard...']");
	public WebElement Product_SubProduct_SDLC_dasboard() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_SubProduct_SDLC_dasboard));
		return driver.findElement(Product_SubProduct_SDLC_dasboard);
	}
	private By Product_SubProduct_SDLC_dasboard_validation = By.xpath("//input[@value='DevOps Process']");
	public WebElement Product_SubProduct_SDLC_dasboard_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_SubProduct_SDLC_dasboard_validation));
		return driver.findElement(Product_SubProduct_SDLC_dasboard_validation);
	}
	private By Product_SubProduct_Securityty_Dashboard_validation = By.xpath("//input[@value='Overall Risk Score']");
	public WebElement Product_SubProduct_Securityty_Dashboard_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Product_SubProduct_Securityty_Dashboard_validation));
		return driver.findElement(Product_SubProduct_Securityty_Dashboard_validation);
	}
	/*
	 *   @GS-101
  Scenario: Select the default Dashboard functionality
	 *
	 */
	private By default_SDLC_option = By.xpath("//div[contains(text(),'SSDLC Healthcheck')]");
	public WebElement default_SDLC_option() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(default_SDLC_option));
		return driver.findElement(default_SDLC_option);
	}
	private By default_SDLC_option_popup = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement default_SDLC_option_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(default_SDLC_option_popup));
		return driver.findElement(default_SDLC_option_popup);
	}
	private By profile_button = By.xpath("//div[contains(text(),'Madhusudhan')]");
	public WebElement profile_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(profile_button));
		return driver.findElement(profile_button);
	}
	private By Logout_button = By.xpath("//a[normalize-space()='Log out']");
	public WebElement Logout_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Logout_button));
		return driver.findElement(Logout_button);
	}
	private By default_SDLC_validation = By.xpath("//span[@title='SSDLC Healthcheck']");
	public WebElement default_SDLC_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(default_SDLC_validation));
		return driver.findElement(default_SDLC_validation);
	}
	/*
	 *   @GS-103
  Scenario: Verify Reset to Default
	 *
	 */
	@FindBy(xpath = "//div[.='ROI Calculation']/div")@CacheLookup WebElement ROI_Calculation_Button;
	public void ROI_Calculation_Button()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", ROI_Calculation_Button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ROI_Calculation_Button));
		Js.executeScript("arguments[0].click();",ROI_Calculation_Button);
	}
	private By ROI_calculation_page_validation = By.xpath("//label[normalize-space()='Man Hour Cost']");
	public WebElement ROI_calculation_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ROI_calculation_page_validation));
		return driver.findElement(ROI_calculation_page_validation);
	}
	private By Man_hour_textfield = By.xpath("(//input[@name='manHourCost'])[1]");
	public WebElement Man_hour_textfield() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_hour_textfield));
		driver.findElement(Man_hour_textfield).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		return driver.findElement(Man_hour_textfield);
	}
	private By Man_time_textfield = By.xpath("(//input[@name='triageTime'])[1]");
	public WebElement Man_time_textfield() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_time_textfield));
		driver.findElement(Man_time_textfield).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
		return driver.findElement(Man_time_textfield);
	}
	private By Man_hour_time_save_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Man_hour_time_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_hour_time_save_button));
		return driver.findElement(Man_hour_time_save_button);
	}
	private By Man_Hour_time_popup_validation = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Man_Hour_time_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_Hour_time_popup_validation));
		return driver.findElement(Man_Hour_time_popup_validation);
	}
	private By Man_Hour_Default_button = By.xpath("(//button[@type='button'])[3]");
	public WebElement Man_Hour_Default_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_Hour_Default_button));
		return driver.findElement(Man_Hour_Default_button);
	}
	private By Man_Hour_default_popup_validation = By.xpath("//div[contains(text(),'Are you sure you want to reset to default values?')]");
	public WebElement Man_Hour_default_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_Hour_default_popup_validation));
		return driver.findElement(Man_Hour_default_popup_validation);
	}
	private By Man_hour_default_yes_button = By.xpath("(//button[@type='submit'])[2]");
	public WebElement Man_hour_default_yes_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_hour_default_yes_button));
		return driver.findElement(Man_hour_default_yes_button);
	}
	private By Man_hour_textfield1 = By.xpath("(//input[@name='manHourCost'])[1]");
	public WebElement Man_hour_textfield_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_hour_textfield1));
		return driver.findElement(Man_hour_textfield1);
	}
	private By Man_time_textfield1 = By.xpath("(//input[@name='triageTime'])[1]");
	public WebElement Man_time_textfield_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_time_textfield1));
		return driver.findElement(Man_hour_textfield1);
	}
	/*
	 *   @GS-104
  Scenario: Verify Error message of ROI Calculation
	 */
	private By Man_hour_error_message = By.xpath("//div[@role='alert'][normalize-space()='Man Hour Cost is required.']");
	public WebElement Man_hour_error_message() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_hour_error_message));
		return driver.findElement(Man_hour_error_message);
	}
	private By Man_time_error_message = By.xpath("//div[@role='alert'][normalize-space()='Time (Hrs) is required.']");
	public WebElement Man_time_error_message() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Man_time_error_message));
		return driver.findElement(Man_time_error_message);
	}
	/*
	 * @GS-107
  Scenario: Verify that User can esaily Change Title name of Respective Fields
	 *
	 */
	@FindBy(xpath = "//div[.='Titles']/div")@CacheLookup WebElement Title_page_button;
	public void Title_page_button() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Title_page_button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Title_page_button)); 
		Js.executeScript("arguments[0].click();",Title_page_button);
	}
	private By Title_page_validation = By.xpath("//h5[normalize-space()='Customize Titles']");
	public WebElement Title_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Title_page_validation));
		return driver.findElement(Title_page_validation);
	}
	private By Titles_manage_list = By.xpath("//span[.='Manage']");
	public WebElement Titles_manage_list() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Titles_manage_list));
		return driver.findElement(Titles_manage_list);
	}
	private By Titles_product_field = By.xpath("//input[@id='product']");
	public WebElement Titles_product_field() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Titles_product_field));
		return driver.findElement(Titles_product_field);
	}
	private By Titles_product_success_popup = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Titles_product_success_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Titles_product_success_popup));
		return driver.findElement(Titles_product_success_popup);
	}
	private By Manage_product_validation = By.xpath("//*[@id='root']/aside/div/div[2]/div/ul/li[2]/ul/li[1]/a/span");
	public WebElement Manage_product_validation() {
		//		wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_product_validation));
		return driver.findElement(Manage_product_validation);
	}
	private By Titles_subproduct_field = By.xpath("//input[@id='subProduct']");
	public WebElement Titles_subproduct_field() {
		//		wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Titles_subproduct_field));
		return driver.findElement(Titles_subproduct_field);
	}
	private By Manage_subproduct_validation = By.xpath("//*[@id='root']/aside/div/div[2]/div/ul/li[2]/ul/li[2]/a/span");
	public WebElement Manage_subproduct_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_subproduct_validation));
		return driver.findElement(Manage_subproduct_validation);
	}
	private By Manage_reset_default_button = By.xpath("//span[.='Reset to Default']");
	public WebElement Manage_reset_default_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_reset_default_button));
		return driver.findElement(Manage_reset_default_button);
	}
	/*
	 *   @GS-109
  Scenario: Verify that User can esaily Change Title name of Respective Fields
	 */
	private By Manage_Reset_default_popup_validation  = By.xpath("//div[contains(text(),'Are you sure you want to reset to default values?')]");
	public WebElement Manage_Reset_default_popup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_Reset_default_popup_validation));
		return driver.findElement(Manage_Reset_default_popup_validation);
	}
	private By Manage_reset_yes_button = By.xpath("//button[@type='submit']");
	public WebElement Manage_reset_yes_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_reset_yes_button));
		return driver.findElement(Manage_reset_yes_button);
	}
	@FindBy(xpath = "//div[.='Manage']/div")@CacheLookup WebElement Manage_section;
	public void Manage_section() {
		Js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Manage_section)); 
		Js.executeScript("arguments[0].scrollIntoView(true);", Manage_section);
	}
	private By Manage_title_popup_close_button = By.xpath("//span[normalize-space()='x']");
	public WebElement Manage_title_popup_close_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_title_popup_close_button));
		return driver.findElement(Manage_title_popup_close_button);
	}
	private By Managepopup_validation = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Managepopup_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Managepopup_validation));
		return driver.findElement(Managepopup_validation);
	}
	/*
	 *   @GS-110
  Scenario: Verify that Editable titles should be Disaply at Respective place.
	 *
	 */
	private By Manage_finding_status = By.xpath("//span[.='Finding Statuses']");
	public WebElement Manage_finding_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_finding_status));
		return driver.findElement(Manage_finding_status);
	}
	private By Manage_finding_status_open = By.xpath("//input[@id='open']");
	public WebElement Manage_finding_status_open() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Manage_finding_status_open));
		return driver.findElement(Manage_finding_status_open);
	}
	@FindBy(xpath = "//a[.='Findings']")@CacheLookup WebElement Titles_Findings_page;
	public void Titles_Findings_page()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Titles_Findings_page);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Titles_Findings_page));
		Js.executeScript("arguments[0].click();",Titles_Findings_page);
	}
	private By Findings_status_dropdown = By.xpath("(//span[@aria-label='down'])[2]");
	public WebElement Findings_status_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Findings_status_dropdown));
		return driver.findElement(Findings_status_dropdown);
	}
	private By status_validation = By.xpath("//span[@title='Ope']");
	public WebElement status_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(status_validation));
		return driver.findElement(status_validation);
	}
	/*
	 *   @GS-116
  Scenario: Verify That Devops Widget Configuration
	 *
	 */
	@FindBy(xpath = "//div[.='DevOps Widget Configuration']/div")@CacheLookup WebElement Devops_wodget_config_button;
	public void Devops_wodget_config_button() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Devops_wodget_config_button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Devops_wodget_config_button));
		Js.executeScript("arguments[0].click();",Devops_wodget_config_button);
	}
	private By Devops_widget_page_validation = By.xpath("//div[.='Plan']");
	public WebElement Devops_widget_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Devops_widget_page_validation));
		return driver.findElement(Devops_widget_page_validation);
	}
	private By close_release_icon = By.xpath("(//span[@aria-label='close'])[8]");
	public WebElement close_release_icon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(close_release_icon));
		return driver.findElement(close_release_icon);
	}
	private By Devops_widget_submit_button = By.xpath("//button[@type='submit']");
	public WebElement Devops_widget_submit_button() {
		return driver.findElement(Devops_widget_submit_button);
	}
	private By devops_success_popup = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement devops_success_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(devops_success_popup));
		return driver.findElement(devops_success_popup);
	}
	private By devops_reset_button = By.xpath("(//button[@type='button'])[3]");
	public WebElement devops_reset_button() {
		return driver.findElement(devops_reset_button);
	}
	/*
	 *   @GS-120
  Scenario: Verify the Multi ticket setting page
	 *
	 */
	@FindBy(xpath = "//div[.='Multiple Ticket Setting']/div")@CacheLookup WebElement Multiple_ticket_setting_button;
	public void Multiple_ticket_setting_button() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Multiple_ticket_setting_button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Multiple_ticket_setting_button));
		Js.executeScript("arguments[0].click();",Multiple_ticket_setting_button);
	}
	private By Multiple_ticket_setting_page = By.xpath("//h5[normalize-space()='Multiple Ticket Support']");
	public WebElement Multiple_ticket_setting_page() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_ticket_setting_page));
		return driver.findElement(Multiple_ticket_setting_page);
	}
	private By Multiple_ticket_enable_disable_button = By.xpath("(//button[@role='switch'])[1]");
	public WebElement Multiple_ticket_enable_disable_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_ticket_enable_disable_button));
		return driver.findElement(Multiple_ticket_enable_disable_button);
	}
	private By Multiple_enable_disable_popup = By.xpath("//div[contains(text(),'Are you sure you want to enable Multiple Ticket Su')]");
	public WebElement Multiple_enable_disable_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_enable_disable_popup));
		return driver.findElement(Multiple_enable_disable_popup);
	}
	private By Multiple_enable_disable_yes_button = By.xpath("(//button[@type='submit'])[1]");
	public WebElement Multiple_enable_disable_yes_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_enable_disable_yes_button));
		return driver.findElement(Multiple_enable_disable_yes_button);
	}
	private By Multiple_enable_disable = By.xpath("//strong[normalize-space()='Success!']");
	public WebElement Multiple_enable_disable() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_enable_disable));
		return driver.findElement(Multiple_enable_disable);
	}
	private By Multiple_disable_popup = By.xpath("//div[contains(text(),'Are you sure you want to disable Multiple Ticket S')]");
	public WebElement Multiple_disable_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Multiple_disable_popup));
		return driver.findElement(Multiple_disable_popup);
	}
	/*
	 *   @GS-127
  Scenario: Verify Global settings finding status page
	 *
	 */
	@FindBy(xpath = "//div[.='Findings Status']/div")@CacheLookup WebElement Globalseeting_Finding_status_button;
	public void Globalseeting_Finding_status_button()  {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Globalseeting_Finding_status_button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Globalseeting_Finding_status_button));
		Js.executeScript("arguments[0].click();",Globalseeting_Finding_status_button);
	}
	private By Finding_status_page_validation = By.xpath("//h5[normalize-space()='Customize Finding Status']");
	public WebElement Finding_status_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Finding_status_page_validation));
		return driver.findElement(Finding_status_page_validation);
	}
	/*
	 *   @GS-138
  Scenario Outline: Verify Global settings product status page
      Examples: 
      | options     |
      | Active17    |
      | Suspended   |
      | End of life |
      | Add Status  |
	 */
	private By product_Active_status = By.xpath("//span[.='Active']");
	public WebElement product_Active_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Active_status));
		return driver.findElement(product_Active_status);
	}
	private By product_Suspended_status = By.xpath("//span[.='Suspended']");
	public WebElement product_Suspended_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Suspended_status));
		return driver.findElement(product_Suspended_status);
	}
	private By product_EndOFLife_status = By.xpath("//span[.='End of life']");
	public WebElement product_EndOFLife_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_EndOFLife_status));
		return driver.findElement(product_EndOFLife_status);
	}
	private By product_Add_status = By.xpath("//span[.='Add Status']");
	public WebElement product_Add_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Add_status));
		return driver.findElement(product_Add_status);
	}
	/*
	 *   @GS-139
  Scenario: Verify user able to Add product status
	 *
	 */
	private By product_Add_status_button = By.xpath("//span[normalize-space()='Add Status']");
	public WebElement product_Add_status_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Add_status_button));
		return driver.findElement(product_Add_status_button);
	}
	private By product_Add_status_popup = By.xpath("//div[.='Add Status']/div");
	public WebElement product_Add_status_popup() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_Add_status_popup));
		return driver.findElement(product_Add_status_popup);
	}
	private By product_new_status = By.xpath("//input[@id='productStatus']");
	public WebElement product_new_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_new_status));
		return driver.findElement(product_new_status);
	}
	private By product_new_status_save_button = By.xpath("//button[@type='submit']");
	public WebElement product_new_status_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_new_status_save_button));
		return driver.findElement(product_new_status_save_button);
	}
	private By product_new_status_validation = By.xpath("//span[.='newStatus']");
	public WebElement product_new_status_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_new_status_validation));
		return driver.findElement(product_new_status_validation);
	}
	private By delete_added_status = By.xpath("//div[4]//span[3]");
	public WebElement delete_added_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(delete_added_status));
		return driver.findElement(delete_added_status);
	}
	private By delete_text_added_status = By.xpath("//input[@placeholder='Delete']");
	public WebElement delete_text_added_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(delete_text_added_status));
		return driver.findElement(delete_text_added_status);
	}
	private By delete_button_added_status = By.xpath("(//button[@type='submit'])[1]");
	public WebElement delete_button_added_status() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(delete_button_added_status));
		return driver.findElement(delete_button_added_status);
	}
	/*
	 *   @GS-150
  Scenario Outline: Verify Risk Score page
	 *
	 */
	@FindBy(xpath = "//div[.='Risk Score']/div")@CacheLookup WebElement Risk_score_button;
	public void Risk_score_button() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", Risk_score_button);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Risk_score_button));
		Js.executeScript("arguments[0].click();",Risk_score_button);
	}
	private By Risk_score_page_validation = By.xpath("//h5[normalize-space()='Customize Risk Score']");
	public WebElement Risk_score_page_validation() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Risk_score_page_validation));
		return driver.findElement(Risk_score_page_validation);
	}
	private By RiskScore_product_dropdown = By.xpath("//input[@id='risk-score_product']");
	public WebElement RiskScore_product_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_product_dropdown));
		return driver.findElement(RiskScore_product_dropdown);
	}
	private By RiskScore_subProduct_dropdown = By.xpath("//input[@id='risk-score_subProduct']");
	public WebElement RiskScore_subProduct_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_subProduct_dropdown));
		return driver.findElement(RiskScore_subProduct_dropdown);
	}
	private By RiskScore_Environment_dropdown = By.xpath("//span[.='Production']");
	public WebElement RiskScore_Environment_dropdown() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_Environment_dropdown));
		return driver.findElement(RiskScore_Environment_dropdown);
	}
	private By Inverse_RiskScore_toggle = By.xpath("//button[@type='button']/div");
	public WebElement Inverse_RiskScore_toggle() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Inverse_RiskScore_toggle));
		return driver.findElement(Inverse_RiskScore_toggle);
	}
	private By RiskScore_Calculate_Likelihood = By.xpath("//span[.='Calculate Likelihood']");
	public WebElement RiskScore_Calculate_Likelihood() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_Calculate_Likelihood));
		return driver.findElement(RiskScore_Calculate_Likelihood);
	}
	private By RiskScore_Calculate_Impact = By.xpath("//span[.='Calculate Impact']");
	public WebElement RiskScore_Calculate_Impact() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_Calculate_Impact));
		return driver.findElement(RiskScore_Calculate_Impact);
	}
	@FindBy(xpath = "//div[.='Risk Score Preview']")@CacheLookup WebElement RiskScore_Preview_Section;
	public WebElement RiskScore_Preview_Section() {
		Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", RiskScore_Preview_Section);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RiskScore_Calculate_Impact));
		return driver.findElement(RiskScore_Calculate_Impact);
	}
}
































