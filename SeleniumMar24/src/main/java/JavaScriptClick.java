import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptClick {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;  // 1. scrolling 2.clicking 
		WebElement element = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  // take screen
		FileUtils.copyFile(scrFile1, new File("screenshots/vijaya.png"));                                     // 3. take screen shot		
		driver.quit();
	}

}
