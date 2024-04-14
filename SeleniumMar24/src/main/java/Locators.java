import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.tagName("title"));
		driver.findElement(By.className("btn_action")).click();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Home"));
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name"));
		driver.findElement(By.cssSelector("input.btn_action"));
		driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		driver.findElement(By.xpath("//input[@type='submit' and @id='login-button']"));
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
		driver.quit();
	}

}
