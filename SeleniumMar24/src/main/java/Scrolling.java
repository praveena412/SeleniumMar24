import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");  // 1. Scroll by coordinates
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
		js.executeScript("arguments[0].scrollIntoView(true);", careers);
		js.executeScript("window.scrollBy(0,650)");
		driver.quit();
				// disavantages of using coordinates:
					// 1. approximation of location
					// different screensize different 

	}

}
