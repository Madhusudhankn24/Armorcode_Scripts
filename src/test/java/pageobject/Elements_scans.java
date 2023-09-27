package pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Elements_scans 
{
	public WebDriver driver;
	public static WebDriverWait wait; 
	public Actions act;
	
	 public Elements_scans(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	     }
	public String scantext;
	@FindBy(xpath = "//*[@class='menu-v2-item' and .='Scans']")
	@CacheLookup
	WebElement Scanstab ;
	public void scanstab()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Scanstab));
		Scanstab.click();
	}
	@FindBy(xpath = "//*[@ data-icon='times-circle']")
	@CacheLookup
	WebElement clearbtn;
	public void clearbtn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clearbtn));
		clearbtn.click();
	}
	@FindBy(xpath = "//*[@class='ant-pagination-options']//div[@class='ant-select-selector']")
	@CacheLookup
	WebElement pagination;
	public void paginationbtn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(pagination));
		pagination.click();
	}
	@FindBy(xpath = "//div[@title='10 / page']")
	@CacheLookup
	WebElement tenpage ;
	public void tenpageopt()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(tenpage));
		tenpage.click();
	}
	@FindBy(xpath = "(//input[@type='checkbox']/..)[1]")
	@CacheLookup
	WebElement firstcbox;
	public void firstcheckbox() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(firstcbox));
		firstcbox.click();
	}
	@FindBy(xpath = "//*[@class='border-right p-r-xs']")
	@CacheLookup
	WebElement selecttext;
	public void textselect()
	{
		String text = selecttext.getText();
		System.out.println(text);
	}
	@FindBy(xpath = "//div[@title='20 / page']")
	@CacheLookup
	WebElement twentypage ;
	public void twentypageopt()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(twentypage));
		twentypage.click();
	}
	@FindBy(xpath = "//div[@title='50 / page']")
	@CacheLookup
	WebElement fiftypage ;
	public void fiftypageopt()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fiftypage));
		fiftypage.click();
	}
	@FindBy(xpath = "//div[@title='100 / page']")
	@CacheLookup
	WebElement hubdredpage ;
	public void hubdredpageopt()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(hubdredpage));
		hubdredpage.click();
	}

	//2
	@FindBy(xpath = "//span[.='Environment']//span[@aria-label='caret-up']")
	@CacheLookup 
	WebElement topsort ;
	public void upsort()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(topsort));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", topsort);
	}
	@FindBy(xpath = "//span[.='Environment']//span[@aria-label='caret-down']")
	@CacheLookup 
	WebElement downsort ;
	public void downsort()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(downsort));
		downsort.click();
	}

	//3
	@FindBy(xpath = "(//button[@type='button' and @class='ant-btn ant-btn-text ant-btn-sm ant-dropdown-trigger'])[1]")
	@CacheLookup
	WebElement Actiondots;
	public void Actionthreedots()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Actiondots));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Actiondots);
	}
	@FindBy(xpath = "//*[.='Export Report' and @ role='menuitem']")
	@CacheLookup
	WebElement exportpdf;
	public void exportpdfbyn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(exportpdf));
		exportpdf.click();
	}

	//4
	@FindBy(xpath = "//*[.='Upload Scan' and @ type='button']")
	@CacheLookup
	WebElement upload;
	public void uploadbtn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		upload.click();

	}

	//5
	public void mshover()
	{
		act=new Actions(driver);
		act.moveToElement(exportpdf).perform();	
	}
	@FindBy(xpath = "//*[@class='ant-tooltip-inner']")
	@CacheLookup
	WebElement tooltip;
	public void tooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.pre(tooltip));
		Assert.assertEquals(false, null);

	}

	//6
	/*@FindBy(xpath = "(//span[@class='ant-table-filter-trigger-container']/span)[5]" )//(//span[@class='ant-table-filter-trigger-container']//span[@aria-label='filter'])[5]
	@CacheLookup
	WebElement scantoolfilter;
	public void scantoolfilter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(scantoolfilter));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", scantoolfilter);
	}

		Thread.sleep(3000);

	}*/
	@FindBy(id = "plus-more")
	WebElement more;
	public void morefilterbtn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(more));
		more.click();
	}
	@FindBy(xpath = "//li[.='Total/Duplicate/Resolved/New Findings']")
	@CacheLookup
	WebElement newdd;
	public void newfilter_dd_opt()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(newdd));
		newdd.click();
	}
	@FindBy(xpath = "(//span[@class='ant-table-filter-trigger-container']/span)[8]" )//(//span[@class='ant-table-filter-trigger-container']//span[@aria-label='filter'])[5]
	@CacheLookup
	WebElement newfilter;
	public void newfilter()
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 for(int i=0; i<=4; i++)
	     {js.executeScript("window.scrollBy(500,0)");}//horizontal scroll
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(newfilter));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", newfilter);
	}
	@FindBy(xpath = "//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='New > 0']")
	@CacheLookup
	WebElement newoption;
	public void newfilteroption() throws InterruptedException
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(newoption));
		newoption.click();
		Thread.sleep(3000);

	}
	@FindBy(xpath = "//span[ .='Apply']")
	@CacheLookup
	WebElement Applybtnscan;
	public void Applybtn() throws InterruptedException
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Applybtnscan));
		Applybtnscan.click();
		Thread.sleep(3000);
	}
	@FindBy(xpath = "(//*[@role='menuitem']/span[.='Result Details'])[1]")
	@CacheLookup
	WebElement resultdetail;
	public void resultdetailseye()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(resultdetail));
		if(firstscanid.isEnabled())
		{
			resultdetail.click();
		}

	}
	@FindBy(xpath = "(//*[@class='ant-btn ant-btn-link ant-btn-sm p-0'])[1]")
	@CacheLookup
	WebElement firstscanid;
	public void firstscanid()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(firstscanid));
		String scantext1 = firstscanid.getText();
		scantext=scantext1.substring(2);
		System.out.println(scantext);
	}
	@FindBy(id = "filter-button-scan")
	@CacheLookup
	WebElement scanfilter;
	public void scanfilter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		Boolean re = wait.until(ExpectedConditions.textToBePresentInElement(scanfilter, scantext));
		System.out.println("text is displayed? "+re);
		wait.withTimeout(Duration.ofSeconds(3));
		Assert.assertEquals(re, true);
	}
	//7
	@FindBy(id =  "product")
	@CacheLookup
	WebElement productusp;
	public void productuspopup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(productusp));
		productusp.click();

	}
	@FindBy(xpath = "//div[@id='product_list']/..//div[@title='Testing_02' ]")
	WebElement productTesting_02;
	public void productTesting_02option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(productTesting_02));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", productTesting_02);

	}
	@FindBy(id =  "subProduct")
	WebElement subProduct;
	public void subProductdd()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(subProduct));
		subProduct.click();

	}
	@FindBy(xpath = "//*[@label='test2.0']")
	WebElement subprotest2o;
	public void subproducttest2o()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(subprotest2o));
		subprotest2o.click();

	}
	@FindBy(name = "environment")
	WebElement environmentdd;
	public void environmentdd()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(environmentdd));
		environmentdd.click();
	}
	//8
	@FindBy(xpath = "(//*[.='Custom'])[1]")
	WebElement customtext;
	public String customtxt;
	public void customtext()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(customtext));
		customtxt = customtext.getText();
		System.out.println(customtxt);
	}
	public String fidcustomtxt;
	@FindBy(xpath = "(//td[text()='Custom'])[1]")
	@CacheLookup
	WebElement customtext1;
	public void findingcustomtext()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 for(int i=0; i<=8; i++)
	     {js.executeScript("window.scrollBy(500,0)");}//horizontal scroll
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(customtext1));
		fidcustomtxt = customtext1.getText();
		System.out.println(fidcustomtxt);
		Assert.assertEquals(fidcustomtxt, customtxt);
	}
	@FindBy(xpath = "(//*[@class='ant-btn ant-btn-link ant-btn-sm p-0'])[1]")
	@CacheLookup
	WebElement firstscanid1;
	public String ssscantext;
	public void clickfirstsid()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(firstscanid1));
		String scantext2 = firstscanid1.getText();
		ssscantext=scantext2.substring(2);
		System.out.println(ssscantext);
		firstscanid.click();
	}
	@FindBy(xpath = "//li[@role='menuitem' and .='Source']")
	@CacheLookup
	WebElement souceoption ;
	public void sourcefilteroption() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(souceoption));
		souceoption.click();
	}
	@FindBy(xpath = "//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='Custom']")
	@CacheLookup
	WebElement customopt;
	public void customfilteroption() throws InterruptedException
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(customopt));
		customopt.click();
	}
	//tooltip
	
	@FindBy(xpath = "//*[@ data-icon='times-circle']")
	@CacheLookup
	WebElement clearbtn1;
	public void clearbtn_for_tooltip()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clearbtn1));
		act.moveToElement(clearbtn1).pause(2).perform();
		
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Clear']")
	@CacheLookup
	WebElement cleartooltip ;
	public void Cleartooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(cleartooltip));
		System.out.println(cleartooltip.getText());
		boolean clear = cleartooltip.isDisplayed();
		Assert.assertEquals(clear, true);
	}
	public void more_for_tooltip()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(more));
		act.moveToElement(more).pause(2).perform();
	}
	
	@FindBy(xpath = "(//*[@class='anticon clickable'])[2]")
	@CacheLookup
	WebElement filterelement ;
	public void filterelementbtn()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(filterelement));
		act.moveToElement(filterelement).pause(2).perform();
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Reset Filter and Sorting']")
	@CacheLookup
	WebElement filtertooltip ;
	public void filterelement_tooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(filtertooltip));
		System.out.println(filtertooltip.getText());
		boolean filter = filtertooltip.isDisplayed();
		Assert.assertEquals(filter, true);
	}
	@FindBy(xpath = "(//*[@class='ant-space-item']/span)[3]")
	@CacheLookup
	WebElement tablebtn ;
	public void tablebtn()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(tablebtn));
		act.moveToElement(tablebtn).pause(2).perform();
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Additional columns']")
	@CacheLookup
	WebElement Addi_column_tooltip ;
	public void Addi_column_tooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Addi_column_tooltip));
		System.out.println(Addi_column_tooltip.getText());
		boolean ad_column = Addi_column_tooltip.isDisplayed();
		Assert.assertEquals(ad_column, true);
	}
	public void upload_btn_mousehover()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		act.moveToElement(upload).pause(2).perform();
	}
	@FindBy(xpath = "//*[@title='Refresh']")
	@CacheLookup
	WebElement refreshbtn ;
	public void refreshbtn()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(refreshbtn));
		act.moveToElement(refreshbtn).pause(2).perform();
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Refresh']")
	@CacheLookup
	WebElement refreshtooltip ;
	public void refreshtooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(refreshtooltip));
		System.out.println(refreshtooltip.getText());
		boolean refresh = refreshtooltip.isDisplayed();
		Assert.assertEquals(refresh, true);
	}
	
	@FindBy(xpath = "//*[@class='ant-table-filter-column-title' and .='Scan ID']")
	@CacheLookup
	WebElement scanid ;
	public void scanidbtn()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(scanid));
		act.moveToElement(scanid).pause(2).perform();
	}
	public void scanidbtn_click()
	{
		Actions act=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(scanid));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", scanid);
		act.moveToElement(scanid).pause(3).perform();
	}
	@FindBy(xpath = "(//*[@role='tooltip' and .='Click to sort in ascending'])[1]")
	@CacheLookup
	WebElement ascendingtooltip ;
	public void ascendingtooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ascendingtooltip));
		System.out.println(ascendingtooltip.getText());
		boolean ascending = ascendingtooltip.isDisplayed();
		Assert.assertEquals(ascending, true);
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Click to sort in descending']")
	@CacheLookup
	WebElement descendingtooltip ;
	public void descendingtooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(descendingtooltip));
		System.out.println(descendingtooltip.getText());
		boolean descending = descendingtooltip.isDisplayed();
		Assert.assertEquals(descending, true);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", scanid);
	}
	public void scanidbtn_click1()
	{
		Actions act=new Actions(driver);
		//wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(scanid));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", scanid);
		WebElement scaniddd = driver.findElement(By.xpath("//*[@class='ant-table-filter-column-title' and .='Scan ID']"));
		for(int i=1;i<=10;i++)
		{
		act.moveToElement(scaniddd).pause(2).perform();}
		
	}
	@FindBy(xpath = "//*[@role='tooltip' and .='Click to cancel sorting']")
	@CacheLookup
	WebElement cancelsorttooltip ;
	public void cancel_sort_tooltip()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(cancelsorttooltip));
		System.out.println(cancelsorttooltip.getText());
		boolean cancel = cancelsorttooltip.isDisplayed();
		Assert.assertEquals(cancel, true);
	}
	//scan1 page
	@FindBy(xpath = "//*[@role='alert' and .='Select a product name.']")
	@CacheLookup
	WebElement product_alert_msg;
	public void product_alert_msg()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(product_alert_msg, "Select a product name."));
		String productmsg = product_alert_msg.getText();
		wait.until(ExpectedConditions.visibilityOf(product_alert_msg));
		Assert.assertEquals(productmsg, "Select a product name.");
		boolean producttext = product_alert_msg.isDisplayed();
		Assert.assertEquals(producttext, true);
	}
	@FindBy(xpath = "//*[@role='alert' and .='Select a subproduct name.']")
	@CacheLookup
	WebElement sub_product_alert_msg;
	public void sub_product_alert_msg()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(sub_product_alert_msg, "Select a subproduct name."));
		String subproductmsg = sub_product_alert_msg.getText();
		wait.until(ExpectedConditions.visibilityOf(sub_product_alert_msg));
		Assert.assertEquals(subproductmsg, "Select a subproduct name.");
		boolean subproducttext = sub_product_alert_msg.isDisplayed();
		Assert.assertEquals(subproducttext, true);
		
	}
	@FindBy(xpath = "//*[@role='alert' and .='Select an environment name.']")
	@CacheLookup
	WebElement environment_alert_msg;
	public void environment_alert_msg()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(environment_alert_msg, "Select an environment name."));
		String environmentmsg = environment_alert_msg.getText();
		wait.until(ExpectedConditions.visibilityOf(environment_alert_msg));
		Assert.assertEquals(environmentmsg, "Select an environment name.");
		boolean environment = environment_alert_msg.isDisplayed();
		Assert.assertEquals(environment, true);
		
		
	}
	@FindBy(xpath = "//*[@role='alert' and .='Select a scan tool.']")
	@CacheLookup
	WebElement scantool_alert_msg;
	public void scantool_alert_msg()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(scantool_alert_msg, "Select a scan tool."));
		String scantoolmsg = scantool_alert_msg.getText();
		wait.until(ExpectedConditions.visibilityOf(scantool_alert_msg));
		Assert.assertEquals(scantoolmsg, "Select a scan tool.");
		boolean scantool_text = scantool_alert_msg.isDisplayed();
		Assert.assertEquals(scantool_text, true);
		
	}
	@FindBy(xpath = "//*[@role='alert' and .='Please upload file.']")
	@CacheLookup
	WebElement uploadfile_alert_msg;
	public void uploadfile_alert_msg()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(uploadfile_alert_msg, "Please upload file."));
		String uploadfilemsg = uploadfile_alert_msg.getText();
		wait.until(ExpectedConditions.visibilityOf(uploadfile_alert_msg));
		Assert.assertEquals(uploadfilemsg, "Please upload file.");
		boolean uploadfile_text = uploadfile_alert_msg.isDisplayed();
		Assert.assertEquals(uploadfile_text, true);
	}
    @FindBy(xpath = "//*[@type='button' and .='Cancel']")
    @CacheLookup
    WebElement cancel ;
    public void cancelpopup()
    {
    	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(cancel));
		cancel.click();
    }
	@FindBy(xpath = "//label[@title='Environment']/../..//div[@class='ant-select-selector']")
	WebElement environment_dd_updated;
	public void environment_dd_updated()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(environment_dd_updated));
		environment_dd_updated.click();	
	}
	@FindBy(xpath = "//*[@label='[object Object]' and .='Production']")
	WebElement productionopt;
	public void productionopt_environment()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(productionopt));
		productionopt.click();	
	}
	@FindBy(id =  "tools")
	@CacheLookup
	WebElement scantooldd;
	public void scantooldd()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(scantooldd));
		scantooldd.click();
		scantooldd.sendKeys("SonarQube", Keys.ENTER);
	}
	@FindBy(xpath="//input[@type='file']")
	WebElement uploadscanfield;
	public void validuploadscanfield() throws IOException, InterruptedException
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
		String validpath = "C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\testfiles\\valid.json";
		uploadscanfield.sendKeys(validpath);
		wait.withTimeout(Duration.ofSeconds(50));
        wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='paper-clip']")));
		/*//uploadscanfield.click();
		Actions as = new Actions(driver);
		as.sendKeys(uploadscanfield, validpath).perform();
		uploadscanfield.sendKeys(validpath);
		/*File file= new File(validpath);
		FileInputStream fis = new FileInputStream(file);
        byte[] fileContent = new byte[(int) file.length()];
        fis.read(fileContent);
        Thread.sleep(2000);
       // uploadscanfield.sendKeys(validpath);
        String script = "arguments[0].style.display='block'; arguments[0].value=arguments[1];";
        ((JavascriptExecutor) driver).executeScript(script, uploadscanfield, new String(fileContent));
        fis.close();
        //uploadscanfield.sendKeys(new String(fileContent));
        */
        
	}
	//crosstick"C:\Users\dell\testingAc\invalidfile.json"
	public void invalidupload()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
		String invalidfile = "C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\testfiles\\emptyfile.json";
		uploadscanfield.sendKeys(invalidfile);
		wait.withTimeout(Duration.ofSeconds(50));
        wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='paper-clip']")));
		wait= new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.withTimeout(Duration.ofMinutes(2));
	}
	//.exe file
	public void exefileupload()
	{
		//wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(uploadscanfield));
		String exefilepath="C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\Driver\\chromedriver.exe";
		uploadscanfield.sendKeys(exefilepath);
		wait.withTimeout(Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='paper-clip']")));
	}
	public void emptyfileupload()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
		String emptyfile = "C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\testfiles\\emptyfile.json";
		uploadscanfield.sendKeys(emptyfile);
		wait.withTimeout(Duration.ofSeconds(50));
        wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='paper-clip']")));
	}
	@FindBy(xpath = "//div[@class='ant-row m-t-m m-b-m']//button[@type='submit']")
	@CacheLookup
	WebElement uploadbtn;
	public void uploadbtninscanpopup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(uploadbtn));
		uploadbtn.click();	
	}
String sonarqubetext="SonarQube";

@FindBy(xpath = "//td[.='a few seconds ago']/..")//.='a few seconds ago']
WebElement time_verify ;
public void scan_id()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(time_verify, "a few seconds ago"));
	String scanidbasic = time_verify.getAttribute("data-row-key");
	String scanid="S-"+ scanidbasic;
	System.out.println(scanid);
	
}
	@FindBy(xpath = "//td[.='a few seconds ago']/..//td[6]")//.='a few seconds ago']
	WebElement scantool_verify ;
	public void scantool_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(scantool_verify, sonarqubetext));
		String sonartxt = scantool_verify.getText();
		Assert.assertEquals(sonartxt, sonarqubetext);
	}
	@FindBy(xpath = "//td[.='a few seconds ago']/..//td[10]//img[@src='images/Finished.png']")
	@CacheLookup
	WebElement tickmark ;
	public void tickmarkimage()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(tickmark));
		boolean tic = tickmark.isDisplayed();
		System.out.println(tic);
		Assert.assertEquals(tic, true);
	}
	@FindBy(xpath = "//td[.='a few seconds ago']/..//td[10]//img[@src='images/Failed.png']")
	@CacheLookup
	WebElement crossmark ;
	public void crossmarkimage()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(crossmark));
		boolean cross = crossmark.isDisplayed();
		System.out.println(cross);
		Assert.assertEquals(cross, true);
	}
//-
	@FindBy(xpath = "(//*[@class='ant-tag scan-finding'and text()='T' ]/span[text()='-'])[1]")
	@CacheLookup
	WebElement total_field ;
	public void total_field_text()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(total_field, "-"));
		System.out.println(total_field.getText());
		boolean totaltext = total_field.isDisplayed();
		Assert.assertEquals(totaltext, true);
	}
	@FindBy(xpath = "(//*[@class='ant-tag scan-finding'and text()='D' ]/span[text()='-'])[1]")
	@CacheLookup
	WebElement duplicate_field_text ;
	public void duplicate_field_text()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(duplicate_field_text));
		System.out.println(duplicate_field_text.getText());
		boolean duplicate_text = duplicate_field_text.isDisplayed();
		Assert.assertEquals(duplicate_text, true);
	}
	@FindBy(xpath = "(//*[@class='ant-tag scan-finding'and text()='R' ]/span[text()='-'])[1]")
	@CacheLookup
	WebElement resolved_field_text ;
	public void resolved_field_text()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(resolved_field_text));
		System.out.println(resolved_field_text.getText());
		boolean resolved_text = resolved_field_text.isDisplayed();
		Assert.assertEquals(resolved_text, true);
	}
	@FindBy(xpath = "(//*[@class='ant-tag scan-finding'and text()='N' ]/span[text()='-'])[1]")
	@CacheLookup
	WebElement new_field_text ;
	
	public void new_field_text()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(new_field_text));
		System.out.println(new_field_text.getText());
		boolean new_text = new_field_text.isDisplayed();
		Assert.assertEquals(new_text, true);
	}

	
	public void wait1()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}



}
