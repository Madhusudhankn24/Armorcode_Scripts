package ArmorcodepageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginpageObjects {

	private WebDriver driver;
	private WebDriverWait wait;
	/*
	 * We have to create by locators
	 */
	private By Microsoft_Button = By.xpath("//span[.='Sign in using Microsoft']");
	public void Microsoft_Button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Microsoft_Button));
		driver.findElement(Microsoft_Button).click();
	}
	private By emailID = By.id("i0116");
	public void EnterEmailID(String EmailID) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailID));
		driver.findElement(emailID).sendKeys(EmailID);
	}
	private By next_button = By.xpath("//input[@id='idSIButton9']");
	public void CLick_Next_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(next_button));
		driver.findElement(next_button).click();
	}
	private By password = By.id("i0118");
	public void EnterPassword(String pass) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys(pass);
	}
	private By SigninButton = By.xpath("//input[@id='idSIButton9']");
	public void Click_SignInButton() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SigninButton));
		driver.findElement(SigninButton).click();
	}
	private By Yes_button = By.xpath("//input[@id='idSIButton9']");
	public void CLick_Yes_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Yes_button));
		driver.findElement(Yes_button).click();
	}
	private By Logout_button = By.xpath("//a[.='Log out']");
	public void Click_logout_button() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Logout_button));
		driver.findElement(Logout_button).click();
	}
	/*
	 * Create Constructor of page classs
	 */
	public LoginpageObjects(WebDriver driver){
		this.driver = driver;
	}
	/*
	 * page Actions
	 */
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	private By ForgotPwdLink = By.linkText("Forgot my password");
	public boolean ForgotPwdLinkisDIsplayed() {
		return driver.findElement(ForgotPwdLink).isDisplayed();
	}
	public AlertspageObjects Login_application(String email, String pwd) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Microsoft_Button));
		driver.findElement(Microsoft_Button).click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailID));
		driver.findElement(emailID).sendKeys(email);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(next_button));
		driver.findElement(next_button).click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys(pwd);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SigninButton));
		driver.findElement(SigninButton).click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Yes_button));
		driver.findElement(Yes_button).click();
		return new AlertspageObjects(driver);
	}
	/*
	 * 	//Microsoft
	@FindBy(xpath = "//input[@type='password']") WebElement password;
	public void Microsoft_password(String pass) throws InterruptedException {
		wait = new WebDriverWait(driver1, 5);
		Thread.sleep(2000);
		password.sendKeys(pass);
	}
	@FindBy(xpath = "//*[@id=\"idSIButton9\"]") WebElement Signin;
	public void SignIn_Button() {
		wait = new WebDriverWait(driver1, 5);
		wait.until(ExpectedConditions.visibilityOf(Signin));
		Signin.click();
	}
	//Google
	@FindBy(xpath = "//input[@id='identifierId']")WebElement googlemail;
	public void Google_mail(String mailId) {
		wait = new WebDriverWait(driver1, 5);
		wait.until(ExpectedConditions.visibilityOf(googlemail));
		googlemail.sendKeys(mailId);
	}
	 */
}
