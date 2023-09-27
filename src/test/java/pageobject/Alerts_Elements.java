package pageobject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alerts_Elements 
{
	public WebDriver driver;
	public static WebDriverWait wait;
	
	@FindBy(xpath = "//*[@class='menu-v2-item' and .='Alerts']")
	@CacheLookup
	WebElement alertstab;
	public void alerts_tab_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(alertstab));
		alertstab.click();
	}
	@FindBy(xpath = "//*[@class='ant-breadcrumb-link' and .='Alerts']")
	@CacheLookup
	WebElement alert_text;
	public void alert_text()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(alert_text));
		String alert_text1 = alert_text.getText();
		Assert.assertEquals(alert_text1, "Alerts");
	}
	@FindBy(xpath = "//span[.='Date']//*[@data-icon='caret-down']")
	@CacheLookup
	WebElement datedownsortbutton;
	public void date_down_sortbutton()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(datedownsortbutton));
		boolean ds = datedownsortbutton.isEnabled();
		Assert.assertEquals(ds, true);
	}
	@FindBy(xpath = "(//span[@class='ant-table-filter-trigger-container']/span)[4]")
	@CacheLookup
	WebElement Sevirity_filter_btn;
	public void Sevirity_filter_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Sevirity_filter_btn));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sevirity_filter_btn);
	}
	@FindBy(xpath = "//div[@class='text-ellipsis']//following-sibling::span[1]//span[text()='Critical']")
	@CacheLookup
	WebElement critical_filterdd_option;
	public void critical_filterdd_option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Sevirity_filter_btn));
		boolean cc = critical_filterdd_option.isSelected();
		Assert.assertEquals(cc, true);
	}
	@FindBy(xpath = "//div[@class='text-ellipsis']//following-sibling::span[1]//span[text()='High']")
	@CacheLookup
	WebElement high_filterdd_option;
	public void high_filterdd_option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(high_filterdd_option));
		boolean ho = high_filterdd_option.isSelected();
		Assert.assertEquals(ho, true);
	}
	/*@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ;
	public void ()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	*/
	
	
	
	
	public Alerts_Elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
