package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage{
	
	public productsPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(id="item_4_title_link")
	WebElement backPack;
	
	// HomeWork: Add rest of the elements
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement addToCart;
	
	public void clickBackPack() {
		ClickAction(backPack);
	}
	
	public void clickAddToCart() {
		ClickAction(addToCart);
	}
	

}
