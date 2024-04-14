import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='    click   ']"));
		button.click();  // Two Tabs are open 
		Set<String> windowHandles = driver.getWindowHandles();// 1. store all the opened windows in a Array 	
		String firstTab =(String)windowHandles.toArray()[0];
		String secondTab =(String)windowHandles.toArray()[1];
		Thread.sleep(1000);
		driver.switchTo().window(firstTab);
		Thread.sleep(1000);
		driver.switchTo().window(secondTab);
		Thread.sleep(1000);
		driver.switchTo().window(firstTab);
		Thread.sleep(1000);
		driver.switchTo().window(secondTab);
		driver.quit();
	}
}
