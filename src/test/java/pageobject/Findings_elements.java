package pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Findings_elements 
{
	public WebDriver driver;
	public static WebDriverWait wait;
	public String popupfidtext;

	@FindBy(xpath = "//ul[@class='menu-v2']//span[.='Findings']/..") //*[@class='menu-v2-item' and .='Findings']
	WebElement finding_tab ;
	public void findingtab()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finding_tab));
		finding_tab.click();
	}
	@FindBy(id = "clear-filters") 
	WebElement clearfilter ;
	public void clear()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clearfilter));
		clearfilter.click();
	}
	@FindBy(xpath = "//*[@class='menu-v2-item' and .='Scans']")
	WebElement Scanstab ;
	 public void scanstab()
 	 {
		 wait= new WebDriverWait(driver,Duration.ofSeconds(30));
 		 wait.until(ExpectedConditions.elementToBeClickable(Scanstab));
 		 Scanstab.click();
 		 wait.withTimeout(Duration.ofSeconds(3));
 	 }
	@FindBy(xpath = "//span[.='Open']")
	WebElement open;
	public void openfilter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.textToBePresentInElement(open, "Open"));
		 String optxt = open.getText();
		 System.out.println(optxt);
		 Assert.assertEquals(optxt, "Open");
	}
	@FindBy(xpath = "//span[.='Accept Risk']")
	@CacheLookup
	WebElement Aceprisk;
	public void Ariskfilter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.textToBePresentInElement(Aceprisk, "Accept Risk"));
		 String acrtxt = Aceprisk.getText();
		 System.out.println(acrtxt);
		 Assert.assertEquals(acrtxt, "Accept Risk");
	}
	@FindBy(xpath = "//span[.='Confirm']")
	@CacheLookup
	WebElement confirm;
	public void confirmfilter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.textToBePresentInElement(confirm, "Confirm"));
		 wait.withTimeout(Duration.ofSeconds(3));
		 String ctxt = confirm.getText();
		 System.out.println(ctxt);
		 Assert.assertEquals(ctxt, "Confirm");
	}
	@FindBy(xpath = "//span[.='Severity']//span[@aria-label='caret-down']")
	@CacheLookup 
	WebElement decendingsort ;
	public void downsort()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(decendingsort));
		wait.withTimeout(Duration.ofSeconds(3));
		boolean s = decendingsort.isEnabled();
		System.out.println(s);
		Assert.assertEquals(s, true);
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {e.printStackTrace();}
	}
	//manual add finding
	@FindBy(xpath = "//*[@id='add-findings']") //a[.='+ Add Findings']
	@CacheLookup
	WebElement Addfinding ;
	public void Addfinding() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(Addfinding));
		Addfinding.click();
	}
	@FindBy(name = "product")
	WebElement productfield;
	public void producttextfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(productfield));
		productfield.click();
		
	}
	@FindBy(xpath = "//*[@id='12758' and @name='Testing_02']")
	@CacheLookup
	WebElement testing_02 ;
	public void testing_02product()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(testing_02));
		testing_02.click();
	}
	@FindBy(name =  "subProduct")
	WebElement subpro ;
	public void subproduct()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(subpro));
		subpro.click();
	}
	@FindBy(xpath = "//*[@id='60392' and @name='test2.0']")
	WebElement test2o;
	public void sptest2o()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(test2o));
		test2o.click();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
	}
/*	@FindBy(id  = "environment")
	@CacheLookup
	WebElement environment ;
	public void environmentfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(environment));
		environment.click();
	}*/
	@FindBy(id  = "environment")
	@CacheLookup
	WebElement environment ;
	public void environmentfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(environment));
		environment.click();
	}
	//modify
	@FindBy(xpath = "//*[text()='Next']")//*[@class='ant-btn ant-btn-primary pull-right' and @type ='button' ]
	@CacheLookup
	WebElement next;
	public void nextbtnpopup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(next));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",next);
		//next.click();
		
	}
	@FindBy(xpath = "//*[@id='template' and @ role='combobox']")
	@CacheLookup
	WebElement template;
	public void template()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(template));
		template.sendKeys(Keys.TAB);
	}
	@FindBy(xpath = "//input[@id='title']")
	@CacheLookup
	WebElement summary;
	
	public void summaryfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(summary));
		summary.sendKeys("testnew");
		
	}
	@FindBy(xpath = "//div[@class='ql-editor ql-blank'and @data-placeholder='Description']")
	@CacheLookup
	WebElement description;
	public void descriptionfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(description));
		description.sendKeys("testnew");
		
	}
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank'and @data-placeholder='Steps To Reproduce']")
	@CacheLookup
	WebElement stepreproduce;
	public void steptoreproducefield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(stepreproduce));
		stepreproduce.sendKeys("testnew");
		
	}
	@FindBy(xpath = "//div[@class='ql-editor ql-blank'and @data-placeholder='Mitigation']")
	@CacheLookup
	WebElement mitigation;
	public void mitigationfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(mitigation));
		mitigation.sendKeys("testnew");
		
	}
	@FindBy(xpath = "//div[@class='ql-editor ql-blank'and @data-placeholder='Impact']")
	@CacheLookup
	WebElement impact;
	public void impactfield()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(impact));
		impact.sendKeys("testnew");
		
	}
	@FindBy(xpath = "//*[@ class='ant-btn ant-btn-primary pull-right 'and .='Submit']")
	@CacheLookup
	WebElement submit;
	public void submit()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
	}
	
 //@FI-034 
	@FindBy(id = "filter-button-status") 
	@CacheLookup
	WebElement Statusdropdown ;
	public void Statusdropdown() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Statusdropdown));
		Statusdropdown.click();
	}

	@FindBy(xpath ="//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='Open']" )
	@CacheLookup
	WebElement  opencheckbox ;
	public void opencheckbox()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(opencheckbox));
		opencheckbox.click();

	}
	@FindBy(xpath ="//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='False +ve']" )
	WebElement  falsepositivecheckbox ;
	public void falsepositivecheckbox()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(falsepositivecheckbox));
		falsepositivecheckbox.click();

	}
	@FindBy(xpath ="(//div[@class='ant-table-filter-dropdown-btns']//span[.='Apply']/..)[2]" ) 
	WebElement Applybutton1;
	public void Applybutton1() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Applybutton1));
		Applybutton1.click();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
	}
	@FindBy(xpath ="//span[ .='Apply']/..") 
	WebElement Applybutton;
	public void Applybutton() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Applybutton));
		Applybutton.click();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.withTimeout(Duration.ofSeconds(3));
	}
	@FindBy(xpath = "(//*[@class='ant-checkbox-input'])[3]")
	@CacheLookup
	WebElement first_cbox   ;
	public void first_cbox()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(first_cbox));
		Actions as= new Actions(driver);
		as.moveToElement(first_cbox).click().perform();
		//as.click(first_cbox).perform();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",first_cbox);
		
	}
	/*@FindBy(xpath ="//*[@class='ant-btn ant-btn-link ant-btn-sm' and @ type='button']" ) 
	@CacheLookup
	WebElement Fid_popup  ;
	public void Fidpopup1() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Fid_popup));
		Fid_popup.click();

	}*/

	@FindBy(xpath ="//*[.='Submit'and @type='submit']" ) 
	@CacheLookup
	WebElement  Submit_pop ;
	public void submitpopup() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Submit_pop));
		Submit_pop.click();
	}

	@FindBy(xpath ="//*[.='Done' and @type='button']" ) 
	@CacheLookup
	WebElement donealert  ;
	public void done()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(donealert));
		try{donealert.click();}
		catch (Exception e) {System.out.println("done not clicked");}
	}

	@FindBy(xpath = "(//*[@class='d-flex text-ellipsis'])[5]") 
	@CacheLookup
	WebElement acceptrisk_verify;
	public void accrisk() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(acceptrisk_verify));
		boolean accrisk=acceptrisk_verify.isDisplayed();
		System.out.println(accrisk);
		Assert.assertEquals(accrisk, true);
	}
	@FindBy(id = "rc-tabs-0-panel-history") 
	@CacheLookup
	WebElement history_tab ;
	public void history() 
	{
		 wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
		history_tab.click();
	}
//false positive

	@FindBy(xpath = "//*[@ class='ant-btn m-r-sm m-b-sm' and .='False +ve']") 
	@CacheLookup
	WebElement falsep_ve_bucket;
	public void bucketfalsep() 
	{
		 wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(falsep_ve_bucket));
		falsep_ve_bucket.click();
	}
	
	@FindBy(xpath = "(//*[@class='d-flex text-ellipsis'])[5]") 
	@CacheLookup
	WebElement false_positive_verify ;
	public void false_positive_verify() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(false_positive_verify));
		boolean falseposi=false_positive_verify.isDisplayed();
		System.out.println(falseposi);
		Assert.assertEquals(falseposi, true);
	}
	@FindBy(xpath = "(//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/a[1])[1]")
	WebElement finding_id_click;
	public void finding_id_click()
	{
		try{Thread.sleep(2000);} catch (Exception e) {	}
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finding_id_click));
		finding_id_click.click();
		String fid_number = finding_id_click.getText();
		System.out.println( fid_number);
	}
	
//add template

@FindBy(xpath = "//div[@class='ant-row']//span[.='Next']/..")//basic info next button
WebElement Next_basic_info;
public void Next_basic_info() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Next_basic_info));
	Next_basic_info.click();
}	
@FindBy(xpath = "//div//div[@name='template']//span/input[@id='template']")
WebElement template_dd;
public void template_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(template_dd));
	template_dd.click();
}
@FindBy(xpath = "//div/div[@class='p-xs']/button[@name='template']")
WebElement Add_template;
public void Add_template_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Add_template));
	Add_template.click();
}

String nametext=		"TESTQA";
String summarytext=		"TESTQASummary";
String descriptiontext=	"TESTQAdescription";
String mitigationtext=	"TESTQAmitigation";
String impacttext=		"TESTQAimpact";

@FindBy(id  = "name")
WebElement name_add_template;
public void name_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(name_add_template));
	name_add_template.sendKeys(nametext);
}
@FindBy(xpath = "//div[@class='ant-col ant-form-item-control']//div/input[@id='title']")
WebElement summary_add_template;
public void summary_add_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(summary_add_template));
	summary_add_template.sendKeys(summarytext);
}
@FindBy(xpath = "//div[@class='ant-col ant-form-item-control']/..//div//span[.='Description']/../../..//div[@aria-owns='quill-mention-list']")
WebElement description_add_template;
public void description_add_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(description_add_template));
	description_add_template.sendKeys(descriptiontext);
}
@FindBy(xpath = "//div[@class='ant-col ant-form-item-control']/..//div//span[.='Mitigation']/../../..//div[@data-placeholder='Mitigation']")
WebElement mitigation_add_template;
public void mitigation_add_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mitigation_add_template));
	mitigation_add_template.sendKeys(mitigationtext);
}
@FindBy(xpath = "//div[@class='ant-col ant-form-item-control']/..//div//span[.='Impact']/../../..//div[@data-placeholder='Impact']")
WebElement impact_add_template;
public void impact_add_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(impact_add_template));
	impact_add_template.sendKeys(impacttext);
}
@FindBy(xpath = "//div/div/button[@type='submit']")
WebElement save_add_template;
public void save_add_template() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(save_add_template));
	save_add_template.click();
}

@FindBy(xpath = "//div//div[@name='template']//span/input[@id='template']/../..//span[@class='ant-select-selection-item']")
WebElement template_verify;
public void template_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(template_verify));
	String template_text = template_verify.getText();
	System.out.println(template_text);
	Assert.assertEquals(template_text, nametext);
}

public void summary_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElementValue(summary, summarytext));
	String summary_text = summary.getAttribute("value");
	System.out.println(summary_text);
	Assert.assertEquals(summary_text, summarytext);
	
}
@FindBy(xpath = "//div[@data-placeholder='Mitigation']/p")
WebElement mitigation_verify;
public void mitigation_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(mitigation_verify, mitigationtext));
	String mitigation_text = mitigation_verify.getText();
	System.out.println(mitigation_text);
	Assert.assertEquals(mitigation_text, mitigationtext);
}
@FindBy(xpath = "//div[@data-placeholder='Description']/p")
WebElement description_verify;
public void description_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(description_verify, descriptiontext));
	String description_text = description_verify.getText();
	System.out.println(description_text);
	Assert.assertEquals(description_text, descriptiontext);
}
@FindBy(xpath = "//div[@data-placeholder='Impact']/p")
WebElement impact_verify;
public void impact_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(impact_verify, impacttext));
	String impact_text = impact_verify.getText();
	System.out.println(impact_text);
	Assert.assertEquals(impact_text, impacttext);
}
//edit tag 
@FindBy(xpath = "//span[.='TESTQA']/..//div[@class='d-inline-block']//span[@class='anticon m-r-xs']")
WebElement edit_tag;
public void edit_tag_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(edit_tag));
	edit_tag.click();
}
String editnametext=		"Edit_"+nametext;
String editsummarytext=		"Edit_"+summarytext;
String editdescriptiontext=	"Edit_"+descriptiontext;
String editmitigationtext=	"Edit_"+mitigationtext;
String editimpacttext=		"Edit_"+impacttext;


public void name_edit_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(name_add_template));
	name_add_template.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	name_add_template.sendKeys(editnametext);
}
public void summary_edit_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(summary_add_template));
	summary_add_template.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	summary_add_template.sendKeys(editsummarytext);
}
public void description_edit_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(description_add_template));
	description_add_template.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	description_add_template.sendKeys(editdescriptiontext);
}
public void mitigation_edit_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mitigation_add_template));
	mitigation_add_template.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	mitigation_add_template.sendKeys(editmitigationtext);
}
public void impact_edit_template_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(impact_add_template));
	impact_add_template.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	impact_add_template.sendKeys(editimpacttext);
}
public void edit_template_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(template_verify));
	String edit_template_text = template_verify.getText();
	System.out.println(edit_template_text);
	Assert.assertEquals(edit_template_text, editnametext);
}
public void edit_summary_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElementValue(summary, editsummarytext));
	String edit_summarytext = summary.getAttribute("value");
	System.out.println(edit_summarytext);
	Assert.assertEquals(edit_summarytext, editsummarytext);
	
}
@FindBy(xpath = "//span[.='Edit_TESTQA']/..//span[@class='anticon danger rc-delete-icon']")
WebElement delete_editqa;
@FindBy(xpath = "//input[@class='ant-input m-t-xs' and @ placeholder='Delete']") WebElement deletetext;
@FindBy(xpath = "//button//span[.='Delete']/..") WebElement deletebtn;
public void delete_edit_template()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(delete_editqa));
	delete_editqa.click();
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(deletetext));
	deletetext.sendKeys("Delete");
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(deletebtn));
	deletebtn.click();
	
}
public void edit_mitigation_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(mitigation_verify, editmitigationtext));
	String edit_mitigation_text = mitigation_verify.getText();
	System.out.println(edit_mitigation_text);
	Assert.assertEquals(edit_mitigation_text, editmitigationtext);
}
public void edit_description_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(description_verify, editdescriptiontext));
	String edit_description_text = description_verify.getText();
	System.out.println(edit_description_text);
	Assert.assertEquals(edit_description_text, editdescriptiontext);
}
public void edit_impact_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(impact_verify, editimpacttext));
	String edit_impact_text = impact_verify.getText();
	System.out.println(edit_impact_text);
	Assert.assertEquals(edit_impact_text, editimpacttext);
}
@FindBy(xpath = "//div[@class='ant-row']//span[.='Next']/..")
WebElement next_btn_detailpopup;
public void next_btn_detailpopup() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(next_btn_detailpopup));
	next_btn_detailpopup.click();
}
String summary_text="Attachment";
public void attachsummaryfield()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(summary));
	summary.sendKeys(summary_text);
	
}
String attachfilename_text;
@FindBy(xpath = "//input[@id='file']")
WebElement Attach_file;
@FindBy(xpath = "//div[@class='ant-upload-list-item-info']/..//div[@class='ant-upload-list-item-info']/span/span[1]")//div[@class='ant-upload-list-item-info']  
WebElement filename;
public void Attach_file_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.withTimeout(Duration.ofSeconds(3));
	String filepath = "C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\testfiles\\empty.txt";
	Attach_file.sendKeys(filepath);
	wait= new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOf(filename));
	attachfilename_text=filename.getText();
}
String attachfid;
@FindBy(xpath = "//td[.='a few seconds']")
WebElement attach_findingage;
@FindBy(xpath = "//td[.='a few seconds']/..")
WebElement attach_findinid;
public void attach_findingage() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOf(attach_findingage));
	System.out.println(attach_findingage.getText());
	 attachfid = attach_findinid.getAttribute("data-row-key");
	System.out.println(attachfid);
}
@FindBy(xpath = "//td[.='a few seconds']/../td[2]/a[1]")
WebElement attach_fid;
public void attach_fid_click() 
{
	Actions as =new Actions(driver);
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(attach_fid));
	as.moveToElement(attach_fid).click(attach_fid).perform();
	System.out.println(attach_fid.getText());
	
}
@FindBy(xpath = "//div[@class='finding-list-v3']/button[@id='refresh']")//,main refresh
WebElement main_refresh;
public void main_refresh_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(main_refresh));
	main_refresh.click();
	wait= new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOf(attach_findingage));
}
@FindBy(xpath = "//td[.='a few seconds']/../td[5]")
WebElement verify_summary;
public void verify_summary() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(verify_summary, summary_text));
	String summtxt = verify_summary.getText();
	Assert.assertEquals(summtxt, summary_text);
}
@FindBy(xpath = "//div//div[@role='tab'and .='Attachments']")
WebElement attachment_tab;
public void attachment_tab() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(attachment_tab));
	attachment_tab.click();
}
@FindBy(xpath = "//div[@class='ant-spin-container']//div/ul/li//a")
WebElement verify_attach_file;
public void verify_attach_file() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.textToBePresentInElement(verify_attach_file, attachfilename_text));
	String vtext = verify_attach_file.getText();
	Assert.assertEquals(vtext, attachfilename_text);
}
//deyailed info attachments
@FindBy(xpath = "//div[@id='message-editor-description-']//button[@class='ql-attachment']")
WebElement attach_description;
public void attach_description_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(attach_description));
	
}


//=========== save specific filter==============================================
//ele.morefilterbtn


@FindBy(id = "filter-button-product")
WebElement product_filter;
public void product_filter() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(product_filter));
	product_filter.click();
}
@FindBy(xpath ="//*[@placeholder='Search']" ) 
WebElement Search_filter ;
public void search() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Search_filter));
	Search_filter.sendKeys("Testing_02");
}

@FindBy(xpath = "//div[@class='column-filter ']//span[@title='Testing_02']")
WebElement product_testing02_option ;
public void product_testing02_option() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(product_testing02_option));
	product_testing02_option.click();
}
//applyfilbtn
@FindBy(xpath = "//div[@class='p-xs p-b-0']/input[@type='text']")
WebElement more_Search;
public void more_Search()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(more_Search));
	more_Search.sendKeys("Subproduct");
}
@FindBy(xpath = "//ul//li[.='Subproduct']")
WebElement subproduct_more_option;
public void subproduct_more_option() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(subproduct_more_option));
	subproduct_more_option.click();
	
}
@FindBy(xpath = "//div[@class='column-filter ']//span[@title='test2.0']")
WebElement test20_filter_option;
public void test20_filter_option() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(test20_filter_option));
	test20_filter_option.click();
}
@FindBy(xpath = "(//div[@class='ant-table-filter-dropdown-btns']//span[.='Apply']/..)[2]")
WebElement apply_btn_dynamic;
public void apply_btn_dynamic() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(apply_btn_dynamic));
	apply_btn_dynamic.click();
}
//more_ownerSearch
//owner_filter
@FindBy(xpath = "//div[@class='column-filter ']//span[@title='Punith Kumar T G']")
WebElement punith_owner_filter_option;
public void punith_owner_filter_option() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(punith_owner_filter_option));
	punith_owner_filter_option.click();
}
@FindBy(xpath = "(//div[@class='ant-table-filter-dropdown-btns']//span[.='Apply']/..)[3]")
WebElement apply_btn_dynamic1;
public void apply_btn_dynamic1() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(apply_btn_dynamic1));
	apply_btn_dynamic1.click();
}
@FindBy(id = "saved-search-save-as")
WebElement save_as_btn;
public void save_as_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(save_as_btn));
	save_as_btn.click();
}
String save_name="Testp";
@FindBy(name = "name")
WebElement name_field;
public void name_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(name_field));
	name_field.sendKeys(save_name);
}
@FindBy(xpath = "//span[.='Save']/..")
WebElement save_btn ;
public void save_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(save_btn));
	save_btn.click();
}
@FindBy(id = "saved-search")
WebElement saved_search_btn;
public void saved_search_btn() 
{
	try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(saved_search_btn));
	saved_search_btn.click();
}
@FindBy(xpath = "//div[@class='ant-drawer-content']//input[@ placeholder='Search']")
WebElement saved_search_field;
public void saved_search_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(saved_search_field));
	saved_search_field.sendKeys(save_name);
}
@FindBy(xpath = "//tr//td[.='Testp']")
WebElement saved_search_verify;
public void saved_search_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(saved_search_verify, save_name));
	boolean saved_search = saved_search_verify.isDisplayed();
	Assert.assertEquals(saved_search, true);
}
@FindBy(xpath = "//td[.='Testp']/..//span[@Class='anticon danger clickable delete-icon rc-delete-icon']")
WebElement saved_serach_delete;
public void delete_saved_search()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(saved_serach_delete));
	saved_serach_delete.click();
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(deletetext));
	deletetext.sendKeys("Delete");
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(deletebtn));
	deletebtn.click();
	
}
@FindBy(xpath = "//div[@class='ant-drawer-content']//button[@ aria-label='Close']")
WebElement close_saved_search;
public void close_saved_search() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(close_saved_search));
	close_saved_search.click();
}

//========== comments ===========================
String commenttext ="Testing_FI-068";

@FindBy(xpath = "//div[@class='no-focus-placeholder']")
WebElement comment_field_click ;
public void comment_field_click() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(comment_field_click));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",comment_field_click);
}
@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
WebElement comment_field ;
public void comment_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(comment_field));
	comment_field.sendKeys(commenttext);
}
@FindBy(xpath = "//div[@id='toolbar']//button[@class='ql-emoji']")
WebElement emoji_btn;
public void emoji_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(emoji_btn));
	emoji_btn.click();
}
@FindBy(xpath = "//div[@id='toolbar']//div[text()='Comment']")
WebElement comment_btn;
public void comment_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(comment_btn));
	comment_btn.click();
}
@FindBy(xpath = "//div[@id='emoji-palette']//span[@class='bem bem-grinning ap ap-grinning']")
WebElement smily_emoji;
public void smily_emoji() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(smily_emoji));
	smily_emoji.click();
}
@FindBy(xpath = "//div[@id='emoji-palette']//span[@class='bem bem-joy ap ap-joy']")
WebElement laugh_emoji;
public void laugh_emoji() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(laugh_emoji));
	laugh_emoji.click();
}
@FindBy(xpath = "//div[@id='toolbar']//button[@ class ='ql-attachment']")
WebElement attachment_btn ;
public void attachment_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(attachment_btn));
	String path="C:\\Users\\dell\\eclipse-workspace1\\Armorcode\\testfiles\\FIDF-037.png";
	attachment_btn.sendKeys(path);
	try{Thread.sleep(3000);}catch (Exception e) {}
}
@FindBy(xpath = "(//div[@class='ant-comment-content-detail'])[1]")
WebElement comment_txt_verify;
public void comment_txt_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_txt_verify));
	String comment = comment_txt_verify.getText();
	System.out.println(comment);
	Assert.assertTrue(comment.contains(commenttext));
}
public void comment_field_mention() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(comment_field));
	comment_field.click();
	comment_field.sendKeys("@punith");
}
@FindBy(xpath = "//ul[@id='quill-mention-list']/li[@data-value='Punith Kumar T G']")
WebElement mention_person;
public void mention_person() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mention_person));
	mention_person.click();
}

//=================== saved Search  ++++++++++++++++++++++++++++++++++++++++++++

@FindBy(xpath = "(//td[.='punith']/..//td//div[@class='ant-space-item'])[2]")
WebElement schedule_btn;
public void schedule_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(schedule_btn));
	schedule_btn.click();
}
@FindBy(name = "enableScheduleReport")
WebElement schedule_togle;
public void schedule_togle() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(schedule_togle));
	schedule_togle.click();
}
@FindBy(xpath = "//div[@name='users']/div")
WebElement user_field;
public void user_field() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(user_field));
	Actions as= new Actions(driver);
	as.sendKeys(Keys.TAB,Keys.TAB);
	try{Thread.sleep(1000);}catch(Exception e) {}
	as.moveToElement(user_field).sendKeys("punith.tg@3ktechnologies.com", Keys.ENTER).perform();
	
}
public void user_field_input() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(user_field));
	user_field.click();
}
@FindBy(xpath = "//div[@ title='punith.tg@3ktechnologies.com']")
WebElement punith_user_ss;
@FindBy(xpath = "//div[@id='users_list']/..")
WebElement user_ss;
public void punith_user_ss() 
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    //WebElement dropdown = driver.findElement(By.id("your-dropdown-id")); // Replace with actual dropdown element
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", user_ss);
//	for(int i=1;i<=20;i++)
//	{
//		user_ss.sendKeys(Keys.ARROW_UP);
//	}
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(punith_user_ss));
	punith_user_ss.click();
}
@FindBy(xpath = "//span[.='punith.tg@3ktechnologies.com']//span[@ aria-label='close']")
WebElement user_close;
public void user_close() 
{
	try
	{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(user_close));
	user_close.click();}
	catch (Exception e) { System.out.println("notpresent");
	}
}
@FindBy(xpath = "//div[@name='teams']/div")
WebElement teams_btn;
public void teams_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(teams_btn));
	teams_btn.click();
}
@FindBy(name = "punith")
WebElement punith_team ;
public void punith_team() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(punith_team));
	punith_team.click();
}
String ss_txt="Filter punith scheduled is enabled";
@FindBy(xpath = "//span[text()='Filter punith scheduled is enabled']")
WebElement saved_search_popup_verify;
public void saved_search_popup_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(saved_search_popup_verify, ss_txt));
	String txt = saved_search_popup_verify.getText();
	Assert.assertTrue(txt.contains(ss_txt));
}
@FindBy(xpath = "//span[.='punith']//span[@ aria-label='close']")
WebElement teams_close;
public void teams_close() 
{
	try
	{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(teams_close));
	teams_close.click();}
	catch (Exception e) { System.out.println("notpresent");
	}
}
//=============== select all        ====================================
@FindBy(xpath = "//a[.='here']")
WebElement click_here;
public void click_here() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(click_here));
	click_here.click();
}
@FindBy(xpath = "//div//tr//th//input[@class='ant-checkbox-input']/../span")
WebElement allcbox ;
public void allcbox() 
{
	try
	{
		allcbox.click();
	}
	catch(Exception e) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(allcbox));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",allcbox);}
}
@FindBy(xpath = "//a[@data-key='CREATE_TICKETS']")
WebElement create_ticket_verify;
public void create_ticket_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(create_ticket_verify));
	String disable = create_ticket_verify.getAttribute("disabled");
	Assert.assertEquals(disable, "true");
}
@FindBy(xpath = "//div//button[@class='ant-btn ant-btn-text ant-btn-sm ant-dropdown-trigger font-size-lg']")
WebElement threedots_main;
public void threedots_main() 
{
	try {threedots_main.click();}
	catch (Exception e) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(threedots_main));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",threedots_main);
	}
	
}
@FindBy(xpath = "(//ul//li[text()='Mitigated'])[1]")
WebElement mitigated_veify_thredot;
public void mitigated_veify_thredot() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(mitigated_veify_thredot));
	String mitigated = mitigated_veify_thredot.getAttribute("aria-disabled");
	Assert.assertEquals(mitigated, "true");
}
@FindBy(xpath = "(//ul//li[text()='Mitigated'])[2]")
WebElement propose_mitigated_veify_thredot;
public void propose_mitigated_veify_thredot() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(propose_mitigated_veify_thredot));
	String propose_mitigated = propose_mitigated_veify_thredot.getAttribute("aria-disabled");
	Assert.assertEquals(propose_mitigated, "true");
}

//  ================== Switch TO AQL FILTER  ========================


String old_count;
@FindBy(xpath = "//a[@id='selected-finding-count']/span")
WebElement old_filter_count;
public void old_filter_count() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(old_filter_count));
	old_count=old_filter_count.getText();
	System.out.println(old_count);
	try {Thread.sleep(3000);}catch (Exception e) {System.out.println(e);}
	
}
@FindBy(xpath = "//button[@id='switch-aql']")
WebElement switch_Aql_btn;
public void switch_Aql_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(switch_Aql_btn));
	switch_Aql_btn.click();
}
@FindBy(xpath = "//a[@id='selected-finding-count']/span")
WebElement aql_filter_count;
public void aql_filter_count() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(aql_filter_count));
	String aql_count = aql_filter_count.getText();
	System.out.println(aql_count);
	Assert.assertEquals(aql_count, old_count);
}
@FindBy(xpath = "//span[.='Reset filters ']/..")
WebElement reset_aql_filter;
public void reset_aql_filter() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(reset_aql_filter));
	boolean reser_aql = reset_aql_filter.isDisplayed();
	Assert.assertEquals(reser_aql, true);
	reset_aql_filter.click();
}

@FindBy(xpath = "//div[@class='flex-1 d-flex']//textarea")
WebElement aql_filter_verify;
public void aql_filter_verify() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(aql_filter_verify));
	String txtarea = aql_filter_verify.getText();
	System.out.println(txtarea);
	Assert.assertTrue(txtarea.contains("High"));
}
/*
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
}*/


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Findings_elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}










}
