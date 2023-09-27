package pageobject;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

public class Finding_Element_1 
{
	public WebDriver driver;
	//public static WebDriverWait wait;
	public Actions as;
	public String FalsepositiveTEXT ="False +ve";
	public String Criticaltext="Critical";
	public String Confirmtext="Confirm";
	public String attacktext="Attack";
    public String fid_number;
    public String punithname ="Punith Kumar T G";
    public String fid_text_popup_verify;
   
//    public WebDriver driver;
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
//	@FindBy(id = "rc-tabs-0-panel-history") 
//	WebElement history_tab ;
//	public void history() 
//	{
//		 wait= new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
//		history_tab.click();
//	}
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
	WebElement finding_id_click_fe;
	public void finding_id_click_fe()
	{
		try{Thread.sleep(2000);} catch (Exception e) {	}
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finding_id_click_fe));
		finding_id_click_fe.click();
		String fid_number = finding_id_click_fe.getText();
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
WebElement edit_tag_fe;
public void edit_tag_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(edit_tag_fe));
	edit_tag_fe.click();
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
WebElement Search_filter_fe ;
public void search_fe() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Search_filter_fe));
	Search_filter_fe.sendKeys("Testing_02");
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
    
    
    
    
    
    
    
    
    
    
    
    //====================================================================
	@FindBy(xpath = "(//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/..//a[1])[1]")
	WebElement finding_id_click;
	public void finding_id_click()
	{
		as=new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finding_id_click));
		finding_id_click.click();
		//as.moveToElement(finding_id_click).click(finding_id_click).perform();
		fid_number = finding_id_click.getText();
		System.out.println( fid_number);
		
	}
	@FindBy(xpath ="//div[.='Status']/../div//div[@class='ant-dropdown-trigger d-flex align-items-center']")//(//div/div[@class='ant-dropdown-trigger d-flex align-items-center'])[2]
	WebElement status_dd;
	public void status_dropdown_click()
	{
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(status_dd));
		status_dd.click();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",status_dd);
	}
	@FindBy(xpath = "//ul/li[@role='menuitem' and text()='False +ve']")
	@CacheLookup
	WebElement dd_falsepositive_option;
	public void dd_falsepositive_option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(dd_falsepositive_option));
		dd_falsepositive_option.click();
	}
	String falsepositivecomment="Testing_@FI-061";
	@FindBy(id="note")
	WebElement note_popup ;
	public void note_popup_falsep()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(note_popup));
		note_popup.sendKeys(falsepositivecomment);
	}
	@FindBy(xpath = "//div/button[@type='submit']")
	WebElement submit_button_popup ;
	public void submit_button_popup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(submit_button_popup));
		submit_button_popup.click();
	}
	@FindBy(xpath = "//div/div[@class='ant-dropdown-trigger d-flex align-items-center']//span[.='False +ve']")
	@CacheLookup
	WebElement falsepositive_verify;
	public void falsepositive_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(falsepositive_verify));
		String fp_text = falsepositive_verify.getText();
		Assert.assertEquals(fp_text, FalsepositiveTEXT);
	}
	@FindBy(xpath = "//div//div[@role='tab'and .='History']") 
	WebElement history_tab ;
	@FindBy(xpath = "(//span[@class='ant-comment-content-author-time'])[1]")
	WebElement date_time;
	public void history() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
		history_tab.click();
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {e.printStackTrace();}
		String tabDateTime = date_time.getText();
	     System.out.println("Displayed date and time: " + tabDateTime); // Print to console
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	    String formattedDateTime = now.format(formatter);
	     System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
	     String actual = formattedDateTime;
	  //Assert.assertEquals(actual,tabDateTime);
	     wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify, punithname));
		  String owner_name = owner_author_verify.getText();
			Assert.assertEquals(owner_name, punithname);
	}
	public void falseposi_normal_note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(falsepositivecomment);
		Assert.assertTrue(note_verifytext.contains(falsepositivecomment));
	}
//severity change----------------------------------------------========================

	@FindBy(xpath ="//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='Medium']" )
	public WebElement  mediumcheckbox ;
	public void mediumcheckbox()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(mediumcheckbox));
		mediumcheckbox.click();
	}

//severity filter===================================================	
@FindBy(id = "filter-button-severity") 
public WebElement mainseveritydd;
public void main_severity_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mainseveritydd));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",mainseveritydd);
}
@FindBy(xpath ="//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='High']" )
public WebElement  HIGHcheckbox ;
public void highcheckbox()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(HIGHcheckbox));
	HIGHcheckbox.click();
}
@FindBy(xpath ="(//div[@class='column-filter ']//span[.='Apply']/..)[2]" ) 
@CacheLookup
WebElement sevApplybutton;
public void severityApplybutton() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(sevApplybutton));
	sevApplybutton.click();
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.withTimeout(Duration.ofSeconds(3));
}
@FindBy(xpath = "//div//div//span[@class='ant-dropdown-trigger']")
public WebElement Severity_dd;
public void Severity_dd_click()
{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Severity_dd));
		Severity_dd.click();
}
@FindBy(xpath = "//ul/li[@role='menuitem' ]/span[ text()='Critical']")
public WebElement critical_dd_option ;
public void critical_dd_option()
{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(critical_dd_option));
		critical_dd_option.click();
}//------------------------------------------------
String nfseveritynote="Testing @FI-066";
public void critical_note_popup()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(note_popup));
		note_popup.sendKeys(nfseveritynote);
}
@FindBy(xpath = "//div//span[text()='Save']/..")
public WebElement save_button;
public void save_button_popup()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(save_button));
		save_button.click();
}
@FindBy(xpath = "//div[.='Severity']/..//span[text()='Critical']")
public WebElement critical_verify;
public void severity_critical_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(critical_verify));
		String cr_text = critical_verify.getText();
		Assert.assertEquals(cr_text, Criticaltext);
}
@FindBy(xpath = "(//span[.='Punith Kumar T G']/../..//div[@class='ant-comment-content-detail'])[1]")
WebElement history_note_verify2;
public void severity_normal_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify2));
	String note_verifytext = history_note_verify2.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(nfseveritynote);
	Assert.assertTrue(note_verifytext.contains(nfseveritynote));
}
@FindBy(xpath = "//div/button/span[text()='Save']")
public WebElement save_button1;
public void cri_button_verify()
{
	boolean sb = critical_dd_option.isDisplayed();
	Assert.assertEquals(sb, true);
}
	
//CHANGEOWNER NORMAL FLOW-------------------------------------	

public void more_ownerSearch()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(more_Search_fe));
	more_Search_fe.sendKeys("Owner");
}
@FindBy(xpath = "//li[.='Owner']")
WebElement owner_filter;
public void  owner_filter()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(owner_filter));
	owner_filter.click();
}
@FindBy(xpath = "//div[@class='column-filter ']/div//span[@title='N/A']")
WebElement n_a_option;
public void  n_a_filter_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(n_a_option));
	n_a_option.click();
}
@FindBy(xpath = "//div[@class='column-filter ']/div//span[@title='Amrutha TV']")
WebElement amrutha_filter_option;
public void  amrutha_owner_filter_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(amrutha_filter_option));
	amrutha_filter_option.click();
}
@FindBy(xpath = "//div[@class='ant-table-filter-dropdown-btns']//span[.='Apply']/..")
WebElement apply_filter_updated;
public void  apply_filter_updated()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(apply_filter_updated));
	apply_filter_updated.click();
}

	@FindBy(xpath = "//div[.='Owner']/..//div[@class='d-flex text-ellipsis']//button")
	WebElement owner_edit_button;
	public void owner_edit_pencil_button()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(owner_edit_button));
		owner_edit_button.click();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",owner_edit_button);
	}
	@FindBy(name  = "ownerId")
	WebElement owner_change_ddpopup;
	public void owner_change_ddpopup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(owner_change_ddpopup));
		owner_change_ddpopup.click();
	}
	@FindBy(xpath = "//input[@id='ownerId']")
	WebElement owner_ddpopup;
	public void owner_enter_ddpopup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(owner_ddpopup));
		owner_ddpopup.sendKeys(punithname);
	}
	@FindBy(xpath = "//div[@title='Punith Kumar T G']")
	WebElement owner_ddpopup_option;
	public void owner_ddpopup_option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(owner_ddpopup_option));
		owner_ddpopup_option.click();
		//sendKeys("Punith Kumar T G" , Keys.ENTER);
	}
	String ngownernote="Testing @FI-093";
	@FindBy(id="notes")
	WebElement owner_Note;
	public void owner_Note()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(owner_Note));
		owner_Note.sendKeys(ngownernote);
	}
	@FindBy(xpath = "//div[@class='ant-modal-content']")
	WebElement sucess_alert;
	public void sucess_alert()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(sucess_alert));
		driver.switchTo().alert().accept();
	}
	
	//use same method to click on save--- save_button_popup
	@FindBy(xpath = "//div[.='Owner']/..//div[@class='d-flex text-ellipsis']/div")
	WebElement owner_verify;
	public void owner_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(owner_verify));
		wait.until(ExpectedConditions.textToBePresentInElement(owner_verify, punithname));
		String own = owner_verify.getText();
		Assert.assertEquals(own, punithname );
	}
	@FindBy(xpath = "(//div/div/span[@class='ant-comment-content-author-name'and .='Punith Kumar T G'])[1]")
	WebElement owner_author_verify;
	
	public void owner_history() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
		history_tab.click();
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {e.printStackTrace();}
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	    String formattedDateTime = now.format(formatter);
	     System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
	     String actual = formattedDateTime;
		String tabDateTime = date_time.getText();
		System.out.println("Displayed tab date and time: " + tabDateTime); // Print to console
	     //Assert.assertEquals(actual,tabDateTime);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify, punithname));
	  String owner_name = owner_author_verify.getText();
		Assert.assertEquals(owner_name, punithname);	
	}
	public void ownerchange_normal_note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(ngownernote);
		Assert.assertTrue(note_verifytext.contains(ngownernote));
	}
	@FindBy(xpath = "//div/button[@aria-label='Close']") WebElement closepopup;
	public void close_popup()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		closepopup.click();
	}
	
//tags testcase  ----------------------------------------------------------------
	@FindBy(xpath = "//*[.='TAGS']//div//div[@class='ant-collapse-header']") 
	public WebElement tagheader;
	public void tag_header_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(tagheader));
		tagheader.click();
	}
	@FindBy(xpath = "//*[.='Add New']//button")
	WebElement Add_new;
	public void Add_new_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Add_new));
		Add_new.click();
	}
	String key ="testingkey";
	String value= "testingvalue";
	@FindBy(xpath = "(//tr//td//div[@class='ant-mentions']/textarea)[1]")
	WebElement new_key_field ;
	public void new_key_field()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(new_key_field));
		driver.switchTo().activeElement();
		new_key_field.sendKeys(key, Keys.TAB);
	}
	@FindBy(xpath = "(//tr//td//div[@class='ant-mentions']/textarea)[2]")
	WebElement new_value_field;
	public void new_value_field()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(new_value_field));
		new_value_field.sendKeys(value);
	}
	@FindBy(xpath = "//div[@class='key-value-table p-sm p-t-0']//td[@class='ant-table-cell']//*[@data-icon='check']")
	WebElement tick_tag_btn;
	public void tick_tag_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(tick_tag_btn));
		tick_tag_btn.click();
	}
	@FindBy(xpath = "//tr//td[@title='testingvalue']")
	WebElement value_varify;
	public void tag_value_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(value_varify));
		String valuetext = value_varify.getText();
		Assert.assertEquals(valuetext, value);
	}
	@FindBy(xpath = "//tr//td[@title='testingkey']")
	WebElement key_varify;
	public void tag_key_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(key_varify));
		String keytext = key_varify.getText();
		Assert.assertEquals(keytext,key );
	}
	String tag_tabverify=key+":"+value;
	public void tags__note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(tag_tabverify);
		Assert.assertTrue(note_verifytext.contains(tag_tabverify));
	}
	public void tag_history() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
		history_tab.click();
		//String tabDateTime = date_time.getText();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	    String formattedDateTime = now.format(formatter);
	     System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
	     String actual = formattedDateTime;
		String tabDateTime = date_time.getText();
		System.out.println("Displayed tab date and time: " + tabDateTime); // Print to console
	     //Assert.assertEquals(actual,tabDateTime);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify, punithname));
	  String owner_name = owner_author_verify.getText();
		Assert.assertEquals(owner_name, punithname);	
	  
	}
	//user owner history to check on history tab
	
	@FindBy(xpath = "//td//span[@class='anticon clickable']")
	WebElement edit_tag;
	public void edit_tag()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(edit_tag));
		edit_tag.click();
	}
	String editkey="_editing";
	String editvalue="_editing";
	public void edit_key_field() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(new_key_field));
		new_key_field.sendKeys(editkey);
	}

	public void edit_value_field()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(new_value_field));
		new_value_field.sendKeys(editvalue);
		
	}
String keymerge=key+editkey;
String valuemerge=value+editvalue;
String edit_tag_tabverify=keymerge+":"+valuemerge;
	@FindBy(xpath = "//tr//td[@title='testingkey_editing']")
	WebElement editkey_varify;
	public void tagedit_key_varify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(editkey_varify));
		String editkeytext = editkey_varify.getText();
		Assert.assertEquals(editkeytext,keymerge );
	}
	@FindBy(xpath = "//tr//td[@title='testingvalue_editing']")
	WebElement editvalue_varify;
	public void tagedit_value_varify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(editvalue_varify));
		String editvaluetext = editvalue_varify.getText();
		Assert.assertEquals(editvaluetext,valuemerge );
	}
	public void tags_edit_note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(edit_tag_tabverify);
		Assert.assertTrue(note_verifytext.contains(edit_tag_tabverify));
	}
	//tick_tag_btn use method to click on tick mark
//confirm status-----------------------------------------------------------------------;
	String noteconfirm ="Testing_@FI-060";
	//status_dropdown_click use method to click on dd
	@FindBy(xpath = "//ul/li[@role='menuitem' and text()='Confirm']")
	WebElement dd_confirm_option;
	public void dd_confirm_option()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(dd_confirm_option));
		dd_confirm_option.click();
	}
	public void note_popup_confirm()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(note_popup));
		note_popup.sendKeys(noteconfirm);
	}
	//submit_button_popup use method to click
	@FindBy(xpath = "//div[@class='ant-modal-content']//span[.='Ok']/..")
	WebElement ok_confirmation;
	public void ok_confirmation_btn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(ok_confirmation));
		driver.switchTo().activeElement();
		try {
		ok_confirmation.click();}
		catch (Exception e) {System.out.println(e);
		}
	}
	@FindBy(xpath = "//div[@class='ant-modal-header']//button[@class='ant-btn ant-btn-text ant-btn-sm font-size-lg']")
	WebElement Refresh_popup;
	public void Refresh_popup_btn()
	{
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		wait= new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(Refresh_popup));
		Refresh_popup.click();
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	@FindBy(xpath = "//div/div[@class='ant-dropdown-trigger d-flex align-items-center']//span[.='Confirm']")
	WebElement confirm_status_verify;
	public void confirm_status_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(confirm_status_verify));
		String confirm_text = confirm_status_verify.getText();
		Assert.assertEquals(confirm_text,Confirmtext );
	}
	@FindBy(xpath = "(//div/div/span[@class='ant-comment-content-author-name'])[2]")
	WebElement owner_author_verify1;
	@FindBy(xpath = "(//div/div/span[@class='ant-comment-content-author-name'])[3]")
	WebElement owner_author_verify2;
	public void criticalHistory() 
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(history_tab));
		history_tab.click();
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {e.printStackTrace();}
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
		String formattedDateTime = now.format(formatter);
		System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
		String actual = formattedDateTime;
		String tabDateTime = date_time.getText();
		System.out.println("Displayed tab date and time: " + tabDateTime +"actual--"+actual); // Print to console
		//Assert.assertEquals(actual,tabDateTime);
		try {
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify1, punithname));
		String owner_name = owner_author_verify1.getText();
		Assert.assertEquals(owner_name, punithname);}
		catch (Exception e) 
		{
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify2, punithname));
			String owner_name = owner_author_verify2.getText();
			Assert.assertEquals(owner_name, punithname);
		}
	}
	public void confirm_normal_note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(noteconfirm);
		Assert.assertTrue(note_verifytext.contains(noteconfirm));
	}
//CATEGORY---------Attack -----------------------------------------------;
//ele.morefilterbtn 
	
	@FindBy(xpath = "//div[@class='p-xs p-b-0']/input[@type='text']")
	WebElement more_Search_fe;
	public void more_Search_fe()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(more_Search_fe));
		more_Search_fe.sendKeys("Category");
	}
	@FindBy(xpath = "//li[.='Category']")
	WebElement category_filter;
	public void category_filter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(category_filter));
		category_filter.click();
	}
	@FindBy(xpath = "(//div[@class='ant-table-filter-dropdown-btns']//span[.='All']/..)[2]")//div[@class='column-filter ']//div[@class='ant-table-filter-dropdown-btns']//span[.='All']/..
	WebElement allbtn1;
	public void allbtn1()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(allbtn1));
		allbtn1.click();
	}
	@FindBy(xpath = "//div[@class='column-filter ']//div[@class='ant-table-filter-dropdown-btns']//span[.='All']/..")
	WebElement allbtn;
	public void allbtn()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(allbtn));
		allbtn.click();
	}
	@FindBy(xpath = "//div[@class='column-filter ']//div[@class='column-filter-list m-xs']//span[@title='Attack']")
	WebElement attack_filter;
	public void attack_filter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(attack_filter));
		attack_filter.click();
	}
	@FindBy(xpath = "//div[@class='column-filter ']//div[@class='column-filter-list m-xs']//span[@title='Uncategorized']")
	WebElement uncategorised_filter;
	public void uncategorised_filter()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(uncategorised_filter));
		uncategorised_filter.click();
	}
@FindBy(xpath = "//div[.='Category']/..//div[@class='ant-dropdown-trigger d-flex align-items-center']")
WebElement category_dd;
public void category_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(category_dd));
	category_dd.click();
}
@FindBy(xpath = "//ul//li[.='Attack']")
WebElement attack_category;
public void attack_category_dd_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(attack_category));
	attack_category.click();
}
String attacknote="Testing_@FI-078";
String verifyattacknote="Note: "+attacknote;
public void note_attack_category()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(note_popup));
	note_popup.sendKeys(attacknote);
}
//save_button_popup use method to save  Success!
@FindBy(xpath = "//div[.='Category']/..//span[@class='text-ellipsis m-r-xs']")
WebElement Attack_verify;
public void Attack_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(Attack_verify, attacktext));
	String attack_text = Attack_verify.getText();
	Assert.assertEquals(attack_text, attacktext);
}
//(//div[@class='ant-comment-content']//div[@class='ant-comment-content-detail'])[1]
@FindBy(xpath = "(//span[.='Punith Kumar T G']/../..//div[@class='ant-comment-content-detail'])[1]")
WebElement history_note_verify;
public void attack_history() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(history_tab));
	history_tab.click();
	try {Thread.sleep(3000);}
	catch (InterruptedException e) {e.printStackTrace();}
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	String formattedDateTime = now.format(formatter);
	System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
	String actual = formattedDateTime;
	String tabDateTime = date_time.getText();
	System.out.println("Displayed tab date and time: " + tabDateTime +"actual--"+actual); // Print to console
	//Assert.assertEquals(actual,tabDateTime);
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify, punithname));
	String owner_name = owner_author_verify.getText();
	Assert.assertEquals(owner_name, punithname);
}
public void attack_normal_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(attacknote);
	Assert.assertTrue(note_verifytext.contains(attacknote));
}

//RE-OPEN STATUS NORMAL FLOW=============================================================
@FindBy(xpath = "//ul/li[@role='menuitem' and text()='Re-']")
WebElement reopen_status;
public void reopen_status_ddoption()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(reopen_status));
	reopen_status.click();
}

public void reopen_note()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(note_popup));
	note_popup.sendKeys("open");
}
//================   Change Summary   =====================================================

String Summarytext="Test_summary";
String Summarynote="Testing_FI-214";
@FindBy(xpath = "//div[@class='content-overlay-wrapper d-flex flex-column markdown-text m-b-sm']/../..//button")
WebElement summary_edit_icon;
public void summary_edit_icon()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(summary_edit_icon));
	summary_edit_icon.click();
}
@FindBy(name = "title")
WebElement change_summary;
public void change_summary()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(change_summary));
	change_summary.sendKeys(Keys.CONTROL+"a", Keys.BACK_SPACE);
	change_summary.sendKeys(Summarytext);
}
public void change_summary_note() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(Summarynote);
}
@FindBy(xpath = "(//div[@class='content d-flex'])[1]")
WebElement Summary_change_verify;
public void Summary_change_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(Summary_change_verify));
	String changesummary = Summary_change_verify.getText();
	System.out.println(changesummary);
	Assert.assertEquals(changesummary, Summarytext);
}

public void change_summary_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(Summarynote);
	Assert.assertTrue(note_verifytext.contains(Summarynote));
}
//===================== mitigated for custon finding ===================
String mitigated_note="Testing_FI-100";
@FindBy(xpath = "//ul//span[text()= 'Mitigated']/..")
WebElement mitigated_status_dd;
public void mitigated_status_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mitigated_status_dd));
	mitigated_status_dd.click();
}
public void mitigated_notearea() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(mitigated_note);
}
@FindBy(xpath = "//div[.='Status']/..//span[text()= 'Mitigated']")
WebElement mitigated_status_verify;
public void mitigated_status_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(mitigated_status_verify, "Mitigated"));
	String mitigated = mitigated_status_verify.getText();
	Assert.assertEquals(mitigated, "Mitigated");
}
public void mitigated_status_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(mitigated_note);
	Assert.assertTrue(note_verifytext.contains(mitigated_note));
}
//============= Change due date+++++++++++++
String datenf ="2023-08-31";
String duedatecommentnf ="Testing_FI-161";
@FindBy(xpath = "//div[.='Due Date']/..//button")
WebElement duedate_editbtn;
public void duedate_editbtn()
{
	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(duedate_editbtn));
	duedate_editbtn.click();
}
public void due_date_nf()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(due_date_click));
	due_date_click.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE ,datenf);
}
public void due_date_comment_nf_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(duedatecommentnf);
}
public void duedate_nf_verify() throws ParseException
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(duedate_verify));
	String datetext = duedate_verify.getText();
	String []da=datenf.split("-");
	String tabdate=""; String temp="";
	for(int i=0; i<=da.length;i++)
	{
		if(i==0){temp=da[i];}
		if(i==1){tabdate=da[i];}
		if(i==2){tabdate=tabdate+"/"+da[i];}
	}
	tabdate=tabdate+"/"+temp;
	System.out.println(tabdate);
	Assert.assertEquals(datetext, tabdate);
}
public void change_duedate_nf_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(duedatecommentnf);
	Assert.assertTrue(note_verifytext.contains(duedatecommentnf));
}
//=====================Accept risk three times ++++++++++=========================

@FindBy(xpath = "//ul//span[text()= 'Accept Risk']/..")
WebElement Accept_risk_option;
public void Accept_risk_status_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(Accept_risk_option));
	Accept_risk_option.click();
}
//accrisk_never_notearea -- submit_button_popup
//sucess alert

public void threetimes_accrisk_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(Accept_risk_option));
	String acc_disable = Accept_risk_option.getAttribute("aria-disabled");
	Assert.assertEquals(acc_disable, "true");
}
/*
@FindBy(xpath = "")
WebElement ;
public void ()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(confirm_status_verify));
}
@FindBy(xpath = "")
WebElement ;
public void ()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(confirm_status_verify));
}

	
	*/
	
//=========================================================================================
//========================================================================================
//========================================================================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//BUCKET FLOW

@FindBy(id  ="selected-finding-count" ) 
WebElement Selected;
public void selectedlink() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Selected));
	Selected.click();
}
@FindBy(xpath = "(//tr/td//span//input[@class='ant-checkbox-input']/../span)[1]")
WebElement fid_Checkbox_click;
@FindBy(xpath = "//div[@class='d-flex align-items-center']//span[.='Clear Selected']/..")
WebElement clearselected_btn;
public void fid_Checkbox_click()
{
	try
	{
		fid_Checkbox_click.click();
	}
	catch(Exception e) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fid_Checkbox_click));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",fid_Checkbox_click);}
}
//public String popupfidtext;
@FindBy(xpath ="//*[@class='ant-btn ant-btn-link ant-btn-sm' and @ type='button']" ) 
WebElement maincbox  ;
public void bucket_Fidgettext_popup() //to get fid text
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(maincbox));
	popupfidtext = maincbox.getText();
	System.out.println(popupfidtext);
}	
@FindBy(xpath ="//span[.='Finding ID']/..//span[@class='ant-dropdown-trigger ant-table-filter-trigger']" ) 
WebElement fid_filter  ;
public void fidfilter()//filtering the findings
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(fid_filter));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",fid_filter);
}
@FindBy(xpath ="//*[@placeholder='Search']" ) 
WebElement Search_filter  ;
public void search() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Search_filter));
	Search_filter.sendKeys(popupfidtext);
}
@FindBy(xpath ="//*[@class='ant-btn ant-btn-primary ant-btn-sm']" ) 
WebElement  apply_btn ;
public void applyfilbtn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(apply_btn));
	apply_btn.click(); 
}
//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/..//a[1]
@FindBy(xpath = "(//td[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']/..//a[1])[1]") 
WebElement  findid;// to click the fidlink to verify
public void fidclick() 
	{try {
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(findid));
		findid.click(); }
	catch (Exception e) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(findid));
		findid.click(); 
	}
	}
	//use select in fe page	
//selectedlink select link
//CHANGE OWNER---------------------------------------------------------------
String changeowner="Testing @FI-163";
	@FindBy(xpath = "//div/div/div//button/span[.='Change Owner']")
	@CacheLookup
	WebElement bucket_changeowner_button ;
	public void bucket_changeowner_button()
	{
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(bucket_changeowner_button));
			bucket_changeowner_button.click();
	}
	@FindBy(xpath = "//div//td//button[@type='button']")
	@CacheLookup
	WebElement fidtext_link_popup;
	public void fidtext_link_popup()
	{
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(fidtext_link_popup));
			fid_text_popup_verify= fidtext_link_popup.getText();
	}
	public void owner_Note_bucketflow()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(owner_Note));
		owner_Note.sendKeys(changeowner);
	}
	@FindBy(xpath = "//div/div//span[.='Submit']/..")
	@CacheLookup
	WebElement Submit_bucket_popup;
	public void Submit_bucket_popup()
	{
			wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(Submit_bucket_popup));
			Submit_bucket_popup.click();
	}
	//use above methods to verify
	
	public void change_owner_note_verify()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(history_note_verify));
		String note_verifytext = history_note_verify.getText();
		System.out.println("fetched text----- "+note_verifytext);
		System.out.println(changeowner);
		Assert.assertTrue(note_verifytext.contains(changeowner));
	}
	
// CHANGE_CATEGORY bucket flow-------------------------------------------
String changecategorycomment="Testing_FI-083";
String categorytext="Category";
String uncategorizedtext="Uncategorized";

@FindBy(xpath = "//div//button[.='Change Category']")
WebElement change_category_btn;
public void change_category_btn_bucketflow()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(change_category_btn));
	change_category_btn.click();
}

@FindBy(id ="comment")
WebElement comment_bucket_field;
public void changecategory_comment_bucket_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(changecategorycomment);
}
@FindBy(name = "category")
WebElement categeory_bucket_dd;
public void categeory_bucket_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(categeory_bucket_dd));
	categeory_bucket_dd.click();
}
@FindBy(xpath = "//div[@title='Uncategorized']")
WebElement Uncategorized_category_option ;
public void Uncategorized_category_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Uncategorized_category_option));
	Uncategorized_category_option.click();
}
//Submit_bucket_popup use submit btn
//done use to handle alert msg
@FindBy(xpath = "//span[.='Go to Findings']/..")
WebElement gotofindgs_bucket_btn ;
public void gotofindgs_bucket_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(gotofindgs_bucket_btn));
	gotofindgs_bucket_btn.click();
}
@FindBy(xpath = "//div[.='Category']/..//span[@class='text-ellipsis m-r-xs']")
WebElement category_bucket_verify;
public void category_bucket_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(category_bucket_verify, uncategorizedtext));
	String verify_category = category_bucket_verify.getText();
	System.out.println(verify_category);
	Assert.assertEquals(verify_category, uncategorizedtext);
}
public void change_category_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(changecategorycomment);
	Assert.assertTrue(note_verifytext.contains(changecategorycomment));
}



// CHANGE_SEVERITY BUCKETFLOW-----------------------------------------------
String severitycomment ="Testing_FI-084";
String highseveritytext ="High";
@FindBy(xpath = "//div//button[.='Change Severity']")
WebElement change_severity_btn;
public void change_Severity_btn_bucketflow()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(change_severity_btn));
	change_severity_btn.click();
}
@FindBy(name = "severity")
WebElement severity_bucket_dd;
public void severity_bucket_dd()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(severity_bucket_dd));
	severity_bucket_dd.click();
}
public void severity_comment_bucket_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(severitycomment);
}
@FindBy(id="HIGH")
WebElement high_severity_ddoption;
public void high_severity_ddoption()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(high_severity_ddoption));
	high_severity_ddoption.click();
}
@FindBy(xpath = "//div[.='Severity']/..//span[@class='ant-tag high severity-width ']")
WebElement verify_high_severity;
public void verify_high_severity()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(verify_high_severity));
	String hightext1 = verify_high_severity.getText();
	Assert.assertEquals(hightext1, highseveritytext);
}
public void severity_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(severitycomment);
	Assert.assertTrue(note_verifytext.contains(severitycomment));
}
//CONFIRM ---------BUCKETFLOW-------------------------------------------------------------
String commentconfirmtext="Testing_FI-094";
@FindBy(xpath = "//div//button[.='Confirm']")
WebElement confirm_btn;
public void confirm_btn_bucketflow()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(confirm_btn));
	confirm_btn.click();
}
public void confirm_comment_bucket_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(commentconfirmtext);
}
@FindBy(xpath = "//div[.='Status']/..//span[@class='text-ellipsis m-r-xs']")
WebElement confirm_status_verify1;
public void confirm_status_verify1()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(confirm_status_verify1, Confirmtext));
	String confirmtext1 = confirm_status_verify1.getText();
	Assert.assertEquals(confirmtext1, Confirmtext);
}
public void confirm_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(commentconfirmtext);
	Assert.assertTrue(note_verifytext.contains(commentconfirmtext));
}
//Change Due Date------bucketflow	--------------------------------------------------------
String date ="2023-12-08";
String duedatecomment ="Testing_FI-162";
@FindBy(xpath = "//div//button[.='Change Due Date']")
WebElement ChangeDueDate_btn;
public void ChangeDueDate_btn_bucketflow()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(ChangeDueDate_btn));
	ChangeDueDate_btn.click();
}	
//@FindBy(xpath = "//div[@class='ant-picker']")
@FindBy(xpath = "//input[@name='slaDueDate']")
WebElement due_date_click;
public void due_date_click()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(due_date_click));
	due_date_click.sendKeys(date);
}
public void due_date_comment_bucket_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(duedatecomment);
}
String []datearray=date.split("-");
@FindBy(xpath = "//div[.='Due Date']/..//div[@class='d-flex text-ellipsis']//time")
WebElement duedate_verify;
public void duedate_verify() throws ParseException
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(duedate_verify));
	String datetext = duedate_verify.getText();
	String []da=date.split("-");
	String tabdate=""; String temp="";
	for(int i=0; i<=da.length;i++)
	{
		if(i==0){temp=da[i];}
		if(i==1){tabdate=da[i];}
		if(i==2){tabdate=tabdate+"/"+da[i];}
	}
	tabdate=tabdate+"/"+temp;
	System.out.println(tabdate);
	Assert.assertEquals(datetext, tabdate);
}
public void change_duedate_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(duedatecomment);
	Assert.assertTrue(note_verifytext.contains(duedatecomment));
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
}*/













public void snote_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println();
	Assert.assertTrue(note_verifytext.contains(""));
}
//ACCEPTRISK ------- BUCKETFLOW
String comment_acceptrisk_text="Testing_FI-034";
@FindBy(xpath ="//div//button[.='Accept Risk']" ) 
@CacheLookup
WebElement Acceptrisk_bucket  ;
public void Bucket_Accrisk_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Acceptrisk_bucket));
	Acceptrisk_bucket.click();
}
@FindBy(id = "unsupressAfterDuration_neverOrAfter" ) 
WebElement  reopendd_bucket ;
public void reopendd_bucket() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(reopendd_bucket));
	reopendd_bucket.click();
}
@FindBy(xpath ="//*[@class='ant-select-item ant-select-item-option' and @ title='Never']" ) 
WebElement  never_dd ;
public void never() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(never_dd));
	never_dd.click();
}
@FindBy(id = "notes" ) 
WebElement notearea ;
public void accrisk_never_notearea() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(comment_acceptrisk_text);
}
//Submit_bucket_popup 
public void never_acceptrisk_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(comment_acceptrisk_text);
	Assert.assertTrue(note_verifytext.contains(comment_acceptrisk_text));
}


//reopen_AFTER FLOW-------
String comment_afterdays_acceptrisk_text="Testing_FI-142";
String reopendays="1";
@FindBy(id = "unsupressAfterDuration_number")
WebElement days_in_after_option;
public void Reopen_days_in_after_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(days_in_after_option));
	days_in_after_option.sendKeys(reopendays);
}
@FindBy(xpath ="//input[@id='unsupressAfterDuration_neverOrAfter']/../..//span[@title='After']") 
WebElement  After_dd ;
public void after_ddoption() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(After_dd));
	After_dd.click();
}
public void accrisk_after_notearea() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(comment_afterdays_acceptrisk_text);
}
//Submit_bucket_popup
// after 1 day we need to verify 
public void afterdays_acceptrisk_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(comment_afterdays_acceptrisk_text);
	Assert.assertTrue(note_verifytext.contains(comment_afterdays_acceptrisk_text));
}

// MITIGATED BUCKET FLOW

String note_mitigation="Testing_FI-208";
String mitigatedtext="Mitigated";
//filter
@FindBy(xpath ="//input[@class='ant-checkbox-input']/../following-sibling::span[1]/span[@title='Mitigated']" )
WebElement  mitigatedcheckbox ;
public void mitigatedcheckbox()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mitigatedcheckbox));
	mitigatedcheckbox.click();

}
@FindBy(xpath ="//div//button[.='Mitigated']" ) 
WebElement mitigated_bucket  ;
public void mitigated_bucket_btn() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(mitigated_bucket));
	mitigated_bucket.click();
}
public void mitigated_note() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(note_mitigation);
}
public void mitigated_status_verify1()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(confirm_status_verify1, mitigatedtext));
	String mitigatedtext1 = confirm_status_verify1.getText();
	Assert.assertEquals(mitigatedtext1, mitigatedtext);
}
public void mitigated_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(note_mitigation);
	Assert.assertTrue(note_verifytext.contains(note_mitigation));
}
//================Edit Basic Information Bucket flow======================


String editbasicinfo_note="Testing_FI-096";
@FindBy(xpath = "//button[.='Edit Basic Information']")
WebElement edit_basic_info;
public void edit_basic_info_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(edit_basic_info));
	edit_basic_info.click();
}
public void editbasicinfo_notes()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notes_fur));
	notes_fur.sendKeys(editbasicinfo_note);
}
@FindBy(name =  "Tester")
WebElement product_tester;
public void product_tester()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(product_tester));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", product_tester);
}
@FindBy(name = "Testersp")
WebElement subpro_Testersp;
public void subpro_Testersp()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(subpro_Testersp));
	subpro_Testersp.click();

}
String product="Tester" ;String subproduct="Testersp";String env;
@FindBy(xpath = "//div[@class='d-flex m-l-m']/div[1]")
WebElement product_txt;
@FindBy(xpath = "//div[@class='d-flex m-l-m']/div[3]")
WebElement sub_product_txt;
public void product_txt_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(product_txt, product));
	String product = product_txt.getText();
	Assert.assertEquals(product, product);
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(sub_product_txt, subproduct));
	String subpro = sub_product_txt.getText();
	Assert.assertEquals(subpro, subproduct);
	/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	List<WebElement> alltxt = driver.findElements(By.xpath("//div[@class='d-flex m-l-m']//div"));
	for(WebElement txt:alltxt)
	{
		for(int i=0;i<5;i++) 
		{
			if(i==0) { product = txt.getText();}
			if(i==2) { subproduct = txt.getText();}
			if(i==4) { env = txt.getText();}
		}
	}
*/
}
public void editbasicinfo_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(editbasicinfo_note);
	Assert.assertTrue(note_verifytext.contains(editbasicinfo_note));
}
//============= product filter ========================
@FindBy(id = "filter-button-product")
WebElement main_product_filter ;
public void main_product_filter()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(main_product_filter));
	main_product_filter.click();
}
@FindBy(xpath = "//span[@title='abcd']/../../../../../div[@class='p-xs p-b-0 d-flex align-items-center']//input[@type='text']")
WebElement filter_search;
public void filter_search_main()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(filter_search));
	filter_search.sendKeys("Testing_02");
}
//Applybutton1 use if 2 filter updated
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
	
*/	
	
	
	
	
	
String notefalsepositive="Testing FI-035";	
@FindBy(id = "comment")
WebElement note_fp;
public void notefalsep() 
{
	 wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(note_fp));
		note_fp.sendKeys(notefalsepositive);
}	
public void common_history() 
{
	for(int i=1;i<=6;i++)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(history_tab));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",history_tab);
	
	//history_tab.click();
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	String formattedDateTime = now.format(formatter);
	System.out.println("Fetched date and time: " + formattedDateTime); // Print to console
	String actual = formattedDateTime;
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(date_time));
	String tabDateTime = date_time.getText();
	System.out.println("Displayed tab date and time: " + tabDateTime +"actual--"+actual); // Print to console
	//Assert.assertEquals(actual,tabDateTime);
	wait= new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.textToBePresentInElement(owner_author_verify, punithname));
	String owner_name = owner_author_verify.getText();
	Assert.assertEquals(owner_name, punithname);
}
@FindBy(xpath = "(//span[.='Punith Kumar T G']/../..//span[@class='ant-typography'])[1]")//(//span[.='Punith Kumar T G']/../..//div[@class='ant-comment-content-detail'])[1]
WebElement history_note_verify1;
public void false_positive_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(notefalsepositive);
	Assert.assertTrue(note_verifytext.contains(notefalsepositive));
}

// PROPOSE BUCKET WORK FLOW==================================================================
@FindBy(xpath = "//tr//td[.='a few seconds ago']/..//td[2]/button")
WebElement  findingsunderreview_fid_verify;
public void fid_findingsunderreview_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(findingsunderreview_fid_verify, popupfidtext ));
	String fid_fp = findingsunderreview_fid_verify.getText();
	Assert.assertEquals(fid_fp, popupfidtext );
}
public void fid_click_findingsunderreview()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(findingsunderreview_fid_verify));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",findingsunderreview_fid_verify);
}
String punith="punith.tg@3ktechnologies.com";
@FindBy(xpath = "//div[@class='ant-spin-container']//span[@class='ant-comment-content-author-name']")
WebElement  punith_authorname_verify;
public void punith_authorname_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(punith_authorname_verify, punith));
	String punith_author = punith_authorname_verify.getText();
	Assert.assertEquals(punith_author, punith);
}
@FindBy(id = "findings-under-review")
WebElement  findingsunderreview_link;
public void findingsunderreview_link()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(findingsunderreview_link));
	findingsunderreview_link.click();
}
//===============================================================================================
//=========================================================================================
//Bucket PROPSE  False +ve============
// popupfidtext    fidtect
String Propose_Falsepsitive_text = "Propose False +ve";
String propse_falsepositive_comment="Testing_FI-177";

@FindBy(xpath = "//div//button[.='Propose False +ve']")
WebElement  propse_falsepositive;
public void bucket_propse_falsepositive()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propse_falsepositive));
	propse_falsepositive.click();
}
//fe1.bucket_Fidgettext_popup();
public void propse_falsepositive_comment_bucket_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(propse_falsepositive_comment);
}
//fe1.Submit_bucket_popup();
	//fe.done();
	//fe1.gotofindgs_bucket_btn();
	//fe.clear();
@FindBy(xpath = "//tr//td[.='Propose False +ve']")
WebElement  Propose_Falsepsitive_verify;
public void Propose_Falsepsitive_verify()//verify in finding under review page
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(Propose_Falsepsitive_verify, Propose_Falsepsitive_text));
	String p_fp = Propose_Falsepsitive_verify.getText();
	Assert.assertEquals(p_fp, Propose_Falsepsitive_text);
}
public void Propose_Falsepsitive_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(propse_falsepositive_comment);
	Assert.assertTrue(note_verifytext.contains(propse_falsepositive_comment));
}

//  propose Accept Risk ==============================================================

String propose_AcceptRisk_text="Propose Accept Risk";
String propose_AcceptRisk_Note="Testing_FI-178";

@FindBy(xpath = "//div//button[.='Propose Accept Risk']")
WebElement  propose_AcceptRisk;
public void propose_AcceptRisk_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propose_AcceptRisk));
	propose_AcceptRisk.click();
}
public void propose_AcceptRisk_Note()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(owner_Note));
	owner_Note.sendKeys(propose_AcceptRisk_Note);
}
public void Propose_AcceptRisk_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(propose_AcceptRisk_Note);
	Assert.assertTrue(note_verifytext.contains(propose_AcceptRisk_Note));
}
// PROPOSE OWNER   =====================================================

@FindBy(xpath = "//div//button[.='Propose Owner']")
WebElement  propose_Owner;
public void propose_Owner_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propose_Owner));
	propose_Owner.click();
}
//fe1.owner_change_ddpopup();
//fe1.owner_enter_ddpopup();
//fe1.owner_ddpopup_option();
String noteproposeowner="Testing_FI-179";
public void owner_Note_proposeflow()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(owner_Note));
	owner_Note.sendKeys(noteproposeowner);
}
public void Propose_owner_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(noteproposeowner);
	Assert.assertTrue(note_verifytext.contains(noteproposeowner));
}

// PROPOSE DUEDATE   =====================================================================

String propseduedate_comment="Testing_FI-180";
String propseduedate="2023-09-20";

@FindBy(xpath = "//span[.='Propose Action']/..//span[@class='ant-dropdown-trigger ant-table-filter-trigger']")
WebElement ProposeAction_fur_filter ;
public void ProposeAction_fur_filter()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(ProposeAction_fur_filter));
	ProposeAction_fur_filter.click();
}
@FindBy(xpath = "//div[@class='p-xs p-b-0 d-flex align-items-center']/input[@type='text']")
WebElement  fin_underrevie_filtersearch;
public void fin_underrevie_filtersearch()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(fin_underrevie_filtersearch));
	fin_underrevie_filtersearch.sendKeys("Propose Due Date");
}
@FindBy(xpath = "//div[@class='column-filter ']//span[@title='Propose Due Date']")
WebElement Propose_DueDate_cbox_filter ;
public void Propose_DueDate_cbox_filter()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Propose_DueDate_cbox_filter));
	Propose_DueDate_cbox_filter.click();
}

@FindBy(xpath = "//tr//td[.='Propose Due Date']/..//td[8]//span[.='a few seconds ago']/../../..//td[2]/button")
WebElement  findingsunderreview_fid_verify_duedate;
public void findingsunderreview_fid_verify_duedate()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(findingsunderreview_fid_verify, popupfidtext ));
	String fid_fp = findingsunderreview_fid_verify.getText();
	Assert.assertEquals(fid_fp, popupfidtext );
}
@FindBy(xpath = "//div//button[.='Propose Due Date']")
WebElement propse_duedate ;
public void propse_duedate_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propse_duedate));
	propse_duedate.click();
}
public void propse_duedate_enter()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(due_date_click));
	due_date_click.sendKeys(propseduedate);
}
public void propose_duedate_comment_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(propseduedate_comment);
}
public void Propose_duedate_comment_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(propseduedate_comment);
	Assert.assertTrue(note_verifytext.contains(propseduedate_comment));
}
//propse severity  =======================================================================

String propseseverity_comment="Testing_FI-181";
@FindBy(xpath = "//div//button[.='Propose Severity']")
WebElement propse_severity ;
public void propse_severity_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propse_severity));
	propse_severity.click();
}
public void propose_severity_comment_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(propseseverity_comment);
}
public void Propose_Severity_comment_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(propseseverity_comment);
	Assert.assertTrue(note_verifytext.contains(propseseverity_comment));
}


// PROPOSE CATEGORY   ===================================================================

String proposecategory_comment="Testing_FI-182";
@FindBy(xpath = "//div//button[.='Propose Category']")
WebElement  propsecategory;
public void propsecategory_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propsecategory));
	propsecategory.click();
}
public void propose_category_comment_field()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(comment_bucket_field));
	comment_bucket_field.sendKeys(proposecategory_comment);
}
public void Propose_category_comment_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(proposecategory_comment);
	Assert.assertTrue(note_verifytext.contains(proposecategory_comment));
}

// PROOPSE MITIGATED WITH CUSTOM FINDINGS ============================================
//ele.morefilterbtn();
//fe1.apply_filter_updated();
public void more_sourceSearch()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(more_Search_fe));
	more_Search_fe.sendKeys("Source");
}
@FindBy(xpath = "//li[.='Source']")
WebElement  souce_filter;
public void souce_filter_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(souce_filter));
	souce_filter.click();
}
@FindBy(xpath = "//div[@class='column-filter ']/div//span[@title='Custom']")
WebElement  custom_filter_option;
public void custom_filter_option()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(custom_filter_option));
	custom_filter_option.click();
}

@FindBy(xpath = "//tr//td/span[@class='anticon danger rc-delete-icon']")
WebElement delete_buketpage;
public void bucket_Fidgettext_popup_delete() //to get fid text
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(maincbox));
	popupfidtext = maincbox.getText();
	try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println(popupfidtext);
	String f="312192251";
	if(popupfidtext.equals(f))
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(delete_buketpage));
		delete_buketpage.click();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(gotofindgs_bucket_btn));
		gotofindgs_bucket_btn.click();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fid_Checkbox_click));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",fid_Checkbox_click);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Selected));
		Selected.click();
	}
	
}
//===
String proposeMitigated_note="Testing_FI-228";
@FindBy(xpath = "//div//button[.='Propose Mitigated']")
WebElement propseMitigate;
public void propseMitigate_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propseMitigate));
	propseMitigate.click();
}
public void propose_mitigated_Note()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(owner_Note));
	owner_Note.sendKeys(proposeMitigated_note);
}
public void Propose_Mitigated_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(proposeMitigated_note);
	Assert.assertTrue(note_verifytext.contains(proposeMitigated_note));
}

//PROPOSE BASIC INFORMATION =========================================================
String proposebasicinfo_note="Testing_FI-244";
@FindBy(xpath = "//div//button[.='Propose Basic Information']")
WebElement propose_basicinformation ;
public void propose_basicinformation_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(propose_basicinformation));
	propose_basicinformation.click();
}
//	ele.productuspopup();//ele.productTesting_02option();
//ele.subProductdd();
//ele.subproducttest2o();
//ele.environment_dd_updated();
//ele.productionopt_environment();

public void propose_basicinformation_Note()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(owner_Note));
	owner_Note.sendKeys(proposebasicinfo_note);
}
public void Propose_basicinfo_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(proposebasicinfo_note);
	Assert.assertTrue(note_verifytext.contains(proposebasicinfo_note));
}
//=============================ACCEPT PROPOSAL==============================
@FindBy(xpath = "(//tr//td//button)[1]")
WebElement fid_btn_fur ;
public void fid_btn_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(fid_btn_fur));
	System.out.println(fid_btn_fur.getText());
	fid_btn_fur.click();
}
//====
String Accept_note="Testing_FI-192";
@FindBy(xpath = "//div[@class='ant-comment-content-detail']//a[.='Accept']")
WebElement  accept_link;
public void accept_link()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(accept_link));
	accept_link.click();
}
@FindBy(name = "note")
WebElement note_fur;
public void note_accept_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(note_fur));
	note_fur.sendKeys(Accept_note);
}
@FindBy(xpath = "//div[@class='ant-modal-content']//span[.='Accept']/..")
WebElement Accept_note_btn ;
public void Accept_note_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Accept_note_btn));
	Accept_note_btn.click();
}
public void Propose_fid_accept_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(Accept_note);
	Assert.assertTrue(note_verifytext.contains(Accept_note));
}
//=============REJECT PROPOSAL+==============================================
String Reject_note_fid="Testing_FI-193";
@FindBy(xpath = "//div[@class='ant-comment-content-detail']//a[.='Reject']")
WebElement  Reject_link;
public void Reject_link()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Reject_link));
	Reject_link.click();
}
public void note_reject_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(note_fur));
	note_fur.sendKeys(Reject_note_fid);
}
@FindBy(xpath = "//div[@class='ant-modal-content']//span[.='Reject']/..")
WebElement Reject_note_btn ;
public void Reject_note_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Reject_note_btn));
	Reject_note_btn.click();
}
public void Propose_fid_Reject_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(Reject_note_fid);
	Assert.assertTrue(note_verifytext.contains(Reject_note_fid));
}
//
String AllAcceptnote="Testing_FI-195";
@FindBy(xpath = "//tr//th//input[@class='ant-checkbox-input']")
WebElement allcbox_fur ;
public void allcbox_fur()
{try
{
	allcbox_fur.click();
}
catch(Exception e) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(allcbox_fur));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",allcbox_fur);}
}

@FindBy(xpath = "//span[.='Accept Selected']/..")
WebElement  all_Accept_btn;
public void all_Accept_btn()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(all_Accept_btn));
	all_Accept_btn.click();
}
@FindBy(name = "notes")
WebElement notes_fur ;
public void Accept_notes_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notes_fur));
	notes_fur.sendKeys(AllAcceptnote);
}
//
String Allreject_note="Testing_FI-196";
@FindBy(xpath = "//span[.='Reject Selected']/..")
WebElement AllReject_btn_fur ;
public void AllReject_btn_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(AllReject_btn_fur));
	AllReject_btn_fur.click();
}
public void Reject_notes_fur()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notes_fur));
	notes_fur.sendKeys(Allreject_note);
}
//====================propose mitigated _normal flow   +++++++++++++++++++++++++++++++++++++++=
String propose_mitigated_fid_note="Testing_FI-229";

public void fid_nf_findingsunderreview_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBePresentInElement(findingsunderreview_fid_verify, fid_number ));
	String fid_fp = findingsunderreview_fid_verify.getText();
	Assert.assertEquals(fid_fp, fid_number );
}
@FindBy(xpath = "(//div[@ class='ant-modal-title']//button)[3]")
WebElement threedot_fidpopup ;
public void threedot_fidpopup()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(threedot_fidpopup));
	threedot_fidpopup.click();
}
@FindBy(xpath = "//ul//span[.='Propose Mitigated']/..")
WebElement proposemitigated_fid_popup ;
public void proposemitigated_fid_popup()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(proposemitigated_fid_popup));
	proposemitigated_fid_popup.click();
}
public void search1() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(Search_filter));
	Search_filter.sendKeys(fid_number);
}
public void propose_mitigated_note_fid() 
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(notearea));
	notearea.sendKeys(propose_mitigated_fid_note);
}
public void Propose_mitigated_fid_note_verify()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(history_note_verify));
	String note_verifytext = history_note_verify.getText();
	System.out.println("fetched text----- "+note_verifytext);
	System.out.println(propose_mitigated_fid_note);
	Assert.assertTrue(note_verifytext.contains(propose_mitigated_fid_note));
}
/*
@FindBy(xpath = "")
WebElement  ;
public void ()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable());
}
@FindBy(xpath = "")
WebElement  ;
public void ()
{
	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable());
}



*/

































































	public Finding_Element_1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
