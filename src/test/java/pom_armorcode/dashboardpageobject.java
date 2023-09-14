package pom_armorcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboardpageobject {


	public static WebDriver driver1;
    public static WebDriverWait wait;
    String emilid="Manoj.t@3ktechnologies.com";
	public dashboardpageobject(WebDriver driver2) {
	driver1=driver2;
	PageFactory.initElements(driver1,this);
	
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
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement  dropdown;
	
	public void dropdown() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		dropdown.click();
		
		    
	}
	@FindBy(xpath = "//div[text()='All Business Units']")
	WebElement allbu;
	public void allbu() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(allbu));
		
		 JavascriptExecutor d1= (JavascriptExecutor)driver1;
		    d1.executeScript("arguments[0].click();",allbu );
	}
	@FindBy(xpath = "//div[@class='ant-card-body']")
	WebElement prod;
	public void prod() {
		prod.isDisplayed();
	}
   @FindBy(xpath = "//div[@class='ant-col ant-col-sm-24']")
	WebElement product;
   public void product() {
	   product.isDisplayed();
   }
	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	WebElement staging;
	public void staging() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(staging));
		staging.click();
	}
	@FindBy(xpath = "//div[@class='ant-card-body']")
	WebElement staging_data;
	public void staging_data() {
		staging_data.isDisplayed();
		
		
	}
	@FindBy(xpath = "//button[@id='filter-button-severity']")
	WebElement severity;
	public void severity() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(severity));
		
		 JavascriptExecutor d1= (JavascriptExecutor)driver1;
		 d1.executeScript("arguments[0].click();",severity);
	}
	@FindBy(xpath = "//input[@data-value='Critical']")
	WebElement critical;
	public void critical() {
		critical.click();
	}
	@FindBy(xpath = "//body/div/div/div[@class='ant-dropdown ant-dropdown-placement-bottomLeft ']/div[@class='column-filter ']/div[@class='ant-table-filter-dropdown-btns']/button[1]")
    WebElement apply_button;
	public void apply_button()
	{
		wait = new WebDriverWait(driver1, 20);
	wait.until(ExpectedConditions.visibilityOf(apply_button));
		apply_button.click();
	}
	
	@FindBy(xpath = "//span[text()='High']")
	WebElement high;
	public void high() {
//		wait = new WebDriverWait(driver1, 20);
//		wait.until(ExpectedConditions.visibilityOf(high));
		Actions actions = new Actions(driver1);
		actions.moveToElement(high).click();
	}
	@FindBy(xpath = "//input[@data-value='Medium']")
	WebElement medium_cheskbox;
	public void medium_cheskbox() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(medium_cheskbox));
		medium_cheskbox.click();
	}
	@FindBy(xpath = "//input[@data-value='Low']")
	
	WebElement low_checkbox;
	public void low_checkbox() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(low_checkbox));
		low_checkbox.click();
	}
	@FindBy(xpath = "//div[text()='Production']")
	WebElement production;
	public void production() {
		wait = new WebDriverWait(driver1, 20);
		wait.until(ExpectedConditions.visibilityOf(production));
		
		production.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
