package pom_armorcode;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class subproductobject {

	public static WebDriver driver1;
    public  WebDriverWait wait;
	String emilid="Manoj.t@3ktechnologies.com";

	  public subproductobject(WebDriver driver2)  { 
	    	this.driver1=driver2;
	    	PageFactory.initElements(driver1, this);
	  }
	  @FindBy(xpath = "//span[.='Sign in using Microsoft']")
	  WebElement microsoft;
	  public void microsoft() { 
		 microsoft.click();
	  }
	@FindBy (xpath = "//input[@type='email']")
	WebElement email;
	public void eamil() {
		wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(emilid,Keys.ENTER);
	}
 @FindBy(xpath = "//input[@type='password']")
WebElement pwd;
 public WebElement pwd() {
	 wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(pwd));
	return pwd;
 }
  @FindBy(xpath = "//input[@type='submit']")
  WebElement click;
  public void click() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(click));
	  click.click();
	  
  }
  @FindBy(xpath = "//input[@id='idSIButton9']")
  WebElement yes;
  public void yes() {
	  wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(yes));
	  yes.click();
  }
  @FindBy(xpath = "//span[text()='Subproducts']")
  WebElement sub;
  public void sub() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(sub));
	  sub.click();
	  }
  @FindBy(xpath = "(//span[@role='img'])[11]")
  WebElement dots;
  public void dots() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(dots));
	  dots.click();
  }
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-block']")
  WebElement newsub;
  public void newsub() {
	  wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(newsub));
	 newsub.click(); 
  }
  //Scenario2
  
  @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
  WebElement product;
  public void product() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(product));
	  product.click();
  }
  @FindBy(xpath="//div[text()='Testing_test']")
  WebElement test;
  public void test() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(product));
	  test.click();
  }
  @FindBy(xpath="//input[@id='name'] ")
  WebElement name;
  public void name(String produts) {
	  name.sendKeys("produts");
  }
  
 @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
 WebElement disp;
 public void disp(String pd) {
	 disp.sendKeys("pd");
 }
 @FindBy(xpath="(//div[@class='ant-form-item-control-input'])[5] ")
 WebElement type;
 public void type() {
	 type.click();
 }
 @FindBy(xpath = "//div[text()='iOS App']")
  WebElement ios;
 public void iso() {
	 ios.click();
 }
  @FindBy(xpath = "(//div[@class='ant-form-item-control-input'])[5]")
  WebElement web;
  public void web() {
	  web.click();
  }
  @FindBy(xpath = "//div[@name='status']//div[@class='ant-select-selector']")
  WebElement status;
  public void status() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(status));
	  status.click();
  }
  @FindBy(xpath = "//div[@class='ant-row ant-form-item ant-form-item-has-success']//div[@class='ant-col ant-col-24 ant-form-item-control']")
  WebElement suspend;
  public void suspend() {
	  suspend.click();
  }
  @FindBy(xpath = "//input[@id='versionNumber']")
  WebElement version;
  public WebElement version()
  {
	  return version;
  }
  @FindBy(xpath = "(//div[@class='ant-collapse-header'])[8]")
  WebElement tags;
  public void tags() {
	  tags.click();
  }
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-dashed ant-btn-sm']")
  WebElement addtag;
  public void addtag() {
	  addtag.click();
  }
  @FindBy(xpath = "//textarea[@name='key_0']")
  WebElement key;
  public  WebElement key() {
	  return key;
  }
  @FindBy(xpath = "//textarea[@name='value_0']")
  WebElement value;
  public WebElement value() {
	  return value;
  }
 @FindBy(xpath = "(//*[@role='img'])[46]")

WebElement save;
 public void save() {
	 save.click();
 }
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-default pull-right']")
  WebElement next_button;
  public void next_button() {
	  next_button.click();
  }
  
  @FindBy(xpath = "//div[@name='slaTemplateId']")
  WebElement dropdow_sla;
  public void dropdow_sla() {
	  dropdow_sla.click();
  }
  @FindBy(xpath = "//div[@name='Default SLA']")
  
  WebElement select_sla;
  public void select_sla() {
	  select_sla.click();
  }
  @FindBy(xpath = "(//div[@class='ant-select-selector'])[6]")
  WebElement click_team;
  public void click_team() {
	  click_team.click();
  }
  @FindBy(xpath = "//div[text()='Business Unit']")
  WebElement select_bu;
  public void select_bu(){
select_bu.click();
  }
  @FindBy(xpath = "//input[@autocomplete='off']")
  WebElement addtool;
  public void addtool() {
	  addtool.click();
  }
  @FindBy(xpath = "//div[@toolname='Amazon GuardDuty']")
  WebElement amazon;
  public void amazon() {
	  amazon.click();
  }
  
  @FindBy(xpath ="(//div[@class='ant-select-selector'])[1]" )
  WebElement depurl;
  public void depurl() {
	//  as.moveToElement(depurl).doubleClick();
  }
  @FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
  WebElement click_prg;
  public void  click_prg() {
	  click_prg.click();
  }
  @FindBy(xpath = "(//div[text()='Java'])")
  WebElement select_lag;
  public void select_lag() {
	  wait = new WebDriverWait(driver1, 10);
		wait.until(ExpectedConditions.visibilityOf(select_lag));
	  select_lag.click();
  }
  @FindBy(xpath = "//span[text()='Technologies']")
  WebElement tech;
  public void tech() {
	  tech.click();
  }
  @FindBy(xpath = "(//div[text()='Spring'])[2]")
  WebElement spring;
  public void spring() {
	  spring.click();
  }
  @FindBy(xpath = "//input[@id='repoType']")
  WebElement repotype;
  public void repotype() {
	  repotype.click();
  }
  @FindBy(xpath = "//div[text()='GitHub']")
  WebElement git;
  public void git() {
	  git.click();
  }
  @FindBy(xpath = "(//span[@role='img'])[29]")
  WebElement subclose;
  public void subclose() {
	  subclose.click();
  }
  @FindBy(xpath="//span[text()='Proceed']")
  WebElement proced;
  public void proced() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(proced).click();
  }
//Scenario3
  @FindBy(xpath = "//li[@data-id='61618']")
  WebElement exitprd;
  public void exitprd() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(exitprd).click(); 
	  }
  @FindBy(xpath = "//a[text()='Edit']")
  WebElement edit;
  public void edit() {
	  edit.click();
  }
  @FindBy(xpath = "//div[text()='4']")
  WebElement owner;
  public void owner() {
	  owner.click();
  }
@FindBy(xpath = "(//div[@class='ant-select-selector'])[6]")
  WebElement click_teamsin_owner;
  public void click_teamsin_owner() {
	  click_teamsin_owner.click();
  }
  @FindBy(xpath = "//div[text()='3K Technologies']")
  WebElement select_3kt;
  public void select_3kt() {
	  select_3kt.click();
  }
//Scenario4
  
  @FindBy(xpath = "//li[@data-id='1814']")
  WebElement desired_prd;
  public void desired_prd() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(desired_prd).click();
  }
  @FindBy(xpath = "//strong[text()='Updated By']")
  
  WebElement viewpoint;
  public void viewpoint() {
	  JavascriptExecutor h2 = (JavascriptExecutor)driver1;
	    h2.executeScript("arguments[0].scrollIntoView(true);",viewpoint );
  }
  @FindBy(xpath = "//span[@class='severity-counts-container']//span[1]/span[2]")
  WebElement total;
  public void total() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(total).perform();
  }
  @FindBy(xpath = "//span[@data-type='Critical']")
  WebElement critical;
  public void critical() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(critical).perform();
  }
  @FindBy(xpath = "//span[@data-type='High']")
  WebElement high;
  public void high() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(high).perform();
  }
  @FindBy(xpath = "//span[@data-type='Medium']")
  WebElement low;
  public void low() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(low).perform();
  }
  @FindBy(xpath = "//span[@data-type='Low']")
  WebElement medium;
  public void medium() {
	  Actions as= new Actions(driver1);
	  as.moveToElement(medium).perform();
  }
  @FindBy(xpath = "//span[@data-type='Total']")
  WebElement click_total;
  public void click_total() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",click_total );
	  
  }
  @FindBy(xpath = "/html/body/div[1]/section/main/div/div[6]/div/div[3]/div/div/div/div/div/div[1]/table/thead/tr/th[3]/div/span[2]/span/span")
 WebElement filter;
  public void filter() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",filter);
  }
  @FindBy(xpath = "//li[@data-id='1814']")
  WebElement demo;
  public void demo() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",demo);
  }
  @FindBy(xpath = "//span[@data-type='Critical']")
  WebElement click_critical;
  public void click_critical() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",click_critical );
  }
  @FindBy(xpath = "//span[@data-type='High']")
  WebElement click_high;
  public void click_high() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",click_high);
  }
  @FindBy(xpath = "//span[@data-type='Medium']")
  WebElement click_medium;
  public void click_medium() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",click_medium);
  }
  @FindBy(xpath = "//button[@role='switch']")
  WebElement click_colone;
  public void click_colone() {
	  click_colone.click();
  }
  @FindBy(xpath = "//input[@id='sourceSubProductId']")
  WebElement colone;
  public void colone() {
	  colone.click();
  }
  @FindBy(xpath = "//div[text()='Harika']")
  WebElement select_colone;
  public void select_colone() {
	  JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",select_colone);
  }
  @FindBy(xpath = "//span[text()='Skip & Save']")
  WebElement save_button;
  public void save_button() {
	  save_button.click();
  }
 @FindBy(xpath = "//div[text()='fggg']")
  WebElement click_59;
 public void click_59() {
	 JavascriptExecutor hl= (JavascriptExecutor)driver1;
	    hl.executeScript("arguments[0].click();",click_59);
 }
  @FindBy(xpath = "//button[@type='button']//span[@class='ant-modal-close-x']")
  WebElement harika;
  public void harika() {
	  harika.click();
  }
  @FindBy(xpath = "//a[@class='ant-typography'][text()='Move to another ']")
  WebElement move_to;
  public void move_to() {
	  move_to.click();
  }
  @FindBy(xpath = "//div[@name='product']")
  WebElement move_prd;
  public void move_prd() {
	  move_prd.click();
  }
  @FindBy(xpath = "//div[text()='Testing_02']")
  WebElement select_test;
  public void select_test() {
	  select_test.click();
  }
  
  @FindBy(xpath = "//button[@TYPE='submit']")
  WebElement save_move;
  public void save_move() {
	  save_move.click();
  }
  @FindBy(xpath = "//li[@data-id='1787']")
  WebElement sce7;
  public void sce7() {
	  sce7.click();
  }
  @FindBy(xpath = "//h5[text()='Delete ']")
  WebElement dlt;
  public void dlt() {
	 ((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true)",dlt);
  }
  @FindBy(xpath = "//span[@class='disabled ant-tooltip-disabled-compatible-wrapper']")
  WebElement delet;
  public void delet() {
	  delet.click();
  }
  @FindBy(xpath = "//span[text()='Import from CSV']")
  WebElement csv;
  public void csv() {
	  csv.click();
  }
  @FindBy(xpath = "//span[@class='pull-right']")
  WebElement click_dowload;
  public void click_dowload() {
	  click_dowload.click();
  }
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-link pull-right m-r-xs p-r-xs']")
  WebElement cancle_csv;
  public void cancle_csv() {
	  cancle_csv.click();
  }
  @FindBy(xpath = "//span[text()='Update CSV']")
  WebElement update_csv;
  public void update_csv() {
	  update_csv.click();
  }
  
  
  
  
  
  
  
  
  
  
  
  
}