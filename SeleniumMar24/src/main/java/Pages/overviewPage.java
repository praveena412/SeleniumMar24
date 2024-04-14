package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends BasePage {
	
	public overviewPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(id="finish")
WebElement finish;

public void clickFinish() {
	ClickAction(finish);
}



}
