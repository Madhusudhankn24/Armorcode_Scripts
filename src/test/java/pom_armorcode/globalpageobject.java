package pom_armorcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class globalpageobject {
	public static WebDriver driver1;
    public static WebDriverWait wait;
    public globalpageobject(WebDriver driver2) {
    	this.driver1=driver2;
    	PageFactory.initElements(driver1, this);
    }
	
	@FindBy(xpath = "/html/body/div[1]/section/header/div[2]/div/span/div[1]")
	WebElement globalfilter;
	public void globalfilter()
	{
		globalfilter.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div")
	WebElement dropdown;
	public void  dropdown()
	{
	
    dropdown.click();
	}
	@FindBy(xpath = "//div[@name='Business Unit']")
	WebElement BU;
	public void BU() {
		BU.click();
	}
	@FindBy(xpath = "//div[@class='ant-collapse-header']")
	WebElement test;
	public void test() {
		test.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div")
	WebElement dropdown_bu;
	public void dropdown_bu()
	{
		dropdown_bu.click();
	}
	@FindBy(xpath = "//div[@name='Default Business Unit']")
	WebElement dbu;
	public void dbu()
	{
		dbu.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/label[2]/span[1]")
	WebElement team;
	public void team() {
		team.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/label[3]/span[1]")
	WebElement tire;
	public void tire() {
		tire.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/span[2]/span")
    WebElement tire1;
	public void tire1() {
		tire1.click();
	}
	@FindBy(xpath = "//span[.='Tool Category']")
	WebElement catageory;
	public void catageory() {
		catageory.click();
	}
	@FindBy(xpath = "(//div[.='Application'])[2]")
	WebElement app;
	public void app() {
		app.click();
	}
	@FindBy(xpath = "//span[.='Apply']")
	WebElement apply_button;
	public void apply_button() {
		apply_button.click();
	}
	
	
	
	
	
	
	
	
	
}
