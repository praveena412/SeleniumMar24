package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ReadData;


public class infoPage extends BasePage{
	
	
	public infoPage(WebDriver driver) {
super(driver);
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(name="continue")
	WebElement cont;
	
	public void enterDetails() throws IOException {
		enterText(firstName, new ReadData().getfirstName());
		enterText(lastName, new ReadData().getlastName());
		enterText(postalCode, new ReadData().getzipCode());
		ClickAction(cont);
	}


	
	
	
}
