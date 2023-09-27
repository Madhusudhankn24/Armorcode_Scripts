package UtilityFiles;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Armorcode_Utils {

	private WebDriver driver;
	public Armorcode_Utils(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Windowhandles(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			driver.switchTo().window(window);
		}
	}
}
