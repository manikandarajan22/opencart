package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
		
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//span[normalize-space()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkregister;
	
	public void clickmyaccount() {
		lnkmyaccount.click();
	}
	
	public void clickregister() {
		lnkregister.click();
	}
	
}
