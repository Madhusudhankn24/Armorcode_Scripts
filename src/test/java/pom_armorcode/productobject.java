package pom_armorcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productobject {
 public static WebDriver driver1;	
 public productobject(WebDriver driver2) {
 this.driver1=driver2;
 PageFactory.initElements(driver1,this);
 }
  @FindBy(xpath = "//span[text()='Products']")
  WebElement products;
   public void products() {
	   Actions as= new Actions(driver1);
	   as.moveToElement(products).click();
 }
  @FindBy(xpath = "//div[.='New Product']")
  WebElement newprd;
  public void newprd() {
	newprd.click();
}
  @FindBy(xpath = "//input[@id='name']")
  WebElement id;
  public void id(String name) {
	id.sendKeys(name);
}
  @FindBy(xpath = "//div[@name='type']//div[@class='ant-select-selector']")
  WebElement dropdown;
  public void dropdown() {
	dropdown.click();
}
  @FindBy(xpath = "//*[@id=\\\"3\\\"]/div")
  WebElement webapp;
  public void webapp() {
	webapp.click();
}
   @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
   WebElement spanc;
   public void space(String text) {
	   spanc.sendKeys(text);
   }
   @FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
   WebElement dropdown1;
   public void dropdown1() {
	   dropdown1.click();
	  
   }
   @FindBy(xpath = "//div[@label='Active']")
   WebElement active;
   public void active() {
	   active.click();
   }
@FindBy(xpath = "//input[@id='versionNumber']")
WebElement version;
public void version(int num){
	version.sendKeys("num");
}
   @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/div/div/div")
   WebElement tire;
   public void tire() {
	   tire.click();
   }
@FindBy(xpath = "//div[@label='Tier 2']")
WebElement tire2;
public void tire2() {
	tire2.click();
}

}










