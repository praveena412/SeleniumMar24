package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	// 1. page elements 2. page actions 3. POM: Page factory
	
	
	public loginPage(WebDriver driver) {
	super(driver);  // calling the parent class constructor
	}
	
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	public void enterUsername(String str) {
		enterText(username, str);
	}
	
	public void enterPassword(String pwd) {
		enterText(password, pwd);
	}
	
	public void clickSubmit() {
		ClickAction(loginBtn);
	}
	
	
}
