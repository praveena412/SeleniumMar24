import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); // Selenium architechture
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
		WebElement fileUpload = driver.findElement(By.xpath("//a[text()='File Upload']"));
		act.moveToElement(more).moveToElement(fileUpload).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\PC\\Downloads\\sampleFile.jpeg");
		Thread.sleep(2000);
		driver.quit();
	}

}
