package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends BasePage {
	
	public cartPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;
	
	
	public void clickCheckout() {
		ClickAction(checkout);
	}

}
