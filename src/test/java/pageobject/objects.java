package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objects 
{
	  @FindBy(xpath = "//*[@id=\"idSIButton9\"]") WebElement signin; 
	    // @FindBy(xpath= "//*[@ class='ant-btn ant-btn-primary pull-right' and .='Next']") WebElement next;
	     @FindBy(xpath = "(//a[@class='ant-typography'])[2]") 
	     @CacheLookup
	     WebElement  findid;

    public  WebDriver driver;
    public objects(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
     }
    public void SignIn_Button() throws InterruptedException 
    {
    	Thread.sleep(5000);
    	signin.sendKeys(Keys.ENTER);
    }
  
    public void Findingid()
    {
    	Actions ac=new Actions(driver);
    	ac.moveToElement(findid).click().perform();
    }
}



