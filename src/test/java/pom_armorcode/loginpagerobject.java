package pom_armorcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpagerobject {
	
	    public WebDriver driver;
	    public static WebDriverWait wait;
	    public Actions as;
	    String uname ="Manoj.t@3ktechnologies.com";
	    String pwd = "Manu@1234";
	    public String URL="https://app.armorcode.com/#/login";


	    @FindBy(xpath  = "//div/a/span[.='Sign in using Microsoft']")
	    @CacheLookup
	    WebElement microsoft_login_button;
	    public void microsoft_login_button()
	    {
	        wait= new WebDriverWait(driver,10);
	        wait.until(ExpectedConditions.visibilityOf(microsoft_login_button));
	        microsoft_login_button.click();
	    }
	    @FindBy(name  = "loginfmt")
	    @CacheLookup
	    WebElement un_field;
	    public void un_field()
	    {
	        wait= new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.elementToBeClickable(un_field));
	        un_field.sendKeys(uname);
	    }

	    @FindBy(id = "idSIButton9")
	    @CacheLookup
	    public WebElement next_btn;
	    public void next_signin_btn()
	    {
	        try
	        {
	        wait= new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.elementToBeClickable(next_btn));
	        next_btn.click();}
	        catch (Exception e) {System.out.println("handle");}
	    }

	    @FindBy(xpath = "//input[@name='passwd' and @ id='i0118']")
	    @CacheLookup
	    WebElement password_field;
	    public void mspassword_field()
	    {
	        wait= new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd' and @id='i0118']")));

	        //wait.until(ExpectedConditions.visibilityOf(password_field));
	        password_field.sendKeys(pwd);
	    }
	    //give delay 
	    @FindBy(xpath = "lightbox")
	    @CacheLookup
	    WebElement waituptoframe;
	    public void waituptoframe()
	    {
	        wait= new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfAllElements(waituptoframe));
	    }
	    public loginpagerobject(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 
}