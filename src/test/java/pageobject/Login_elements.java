package pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login_elements 
{
	public WebDriver driver;
	public static WebDriverWait wait;
	public Actions as;
	String uname ="punith.tg@3ktechnologies.com";
	String pwd = "pUnI@0804";
	public String URL="https://app.armorcode.com/#/login";


	@FindBy(xpath  = "//div/a/span[.='Sign in using Microsoft']")
	@CacheLookup
	WebElement microsoft_login_button;
	public void microsoft_login_button()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(microsoft_login_button));
		microsoft_login_button.click();
	}
	@FindBy(name  = "loginfmt")
	@CacheLookup
	WebElement un_field;
	public void un_field()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
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
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(next_btn));
			next_btn.click();}
		catch (Exception e) {System.out.println("handle");}
	}

	@FindBy(xpath = "//input[@name='passwd' and @ id='i0118']")
	@CacheLookup
	WebElement password_field;
	public void mspassword_field()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
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
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(waituptoframe));
	}
	@FindBy(xpath = "//div//img[@ alt='Logo']")
	WebElement logo_verify;
	public void logo_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logo_verify));
		boolean logo = logo_verify.isDisplayed();
		Assert.assertEquals(logo, true);
	}
	String welcome_txt="Welcome! Please sign in to continue";
	@FindBy(xpath = "//div[@class='login-box']//h3")
	WebElement login_txt_verify;
	@FindBy(xpath = "//div[@class='login-box']/div[@class='ant-typography login-text login-text-secondary']")
	WebElement text;
	public void login_txt_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(login_txt_verify, "Login"));
		String login_txt = login_txt_verify.getText();
		System.out.println(login_txt);
		Assert.assertEquals(login_txt, "Login");
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(text, welcome_txt));
		String login1_txt = text.getText();
		System.out.println(login1_txt);
		Assert.assertEquals(login1_txt, welcome_txt);
	}
	@FindBy(xpath = "//div[@class='ant-breadcrumb app-bread-crumb']//span[.='Dashboard']")
	WebElement Dashboard_verify;
	public void Dashboard_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(Dashboard_verify,"Dashboard"));
		String dashboard = Dashboard_verify.getText();
		System.out.println(dashboard);
		Assert.assertEquals(dashboard, "Dashboard");
	}
	
	@FindBy(xpath = "//div[@ class='ant-space-item']//div//*[@ data-icon ='caret-down']")
	WebElement profile_downarrow;
	public void profile_downarrow()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(profile_downarrow));
		profile_downarrow.click();
	}
	@FindBy(xpath = "//ul//li//a[.='Log out']")
	WebElement logout_btn;
	public void logout_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(logout_btn));
		logout_btn.click();
	}
		/*@FindBy(xpath = "")
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable());
	}
		@FindBy(xpath = "")
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable());
	}
		@FindBy(xpath = "")
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable());
	}
		@FindBy(xpath = "")
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable());
	}	@FindBy(xpath = "")
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable());
	}
	
	*/

	public Login_elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
