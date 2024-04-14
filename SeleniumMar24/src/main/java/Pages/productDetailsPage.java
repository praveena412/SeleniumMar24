package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePage {
	

	public productDetailsPage(WebDriver driver) {
super(driver);
	}
	
	@FindBy(className="inventory_details_price")
	WebElement price;
	
	@FindBy(name= "add-to-cart")
	WebElement addToCart;
	
	@FindBy(className= "shopping_cart_badge")
	WebElement shopingCart;
	
	public String getPrice() {
		return getText(price);   // 29.xx$
	}
	
	public void clickAddToCart() {
		ClickAction(addToCart);
	}
	
	public void clickAddShoppingBadge() {
		ClickAction(shopingCart);
	}
	

}
