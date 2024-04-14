import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("OKTab")).click();
		Alert simple = driver.switchTo().alert();  // 1. Simple Alert
		simple.accept();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();//Comfirmation alert
		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
		Thread.sleep(500);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.cssSelector("div#Textbox")).click();
		Thread.sleep(500);
		Alert obj = driver.switchTo().alert();  // input alert
		obj.sendKeys("Selenium+ Java"+Keys.RETURN);
		//obj.accept();
		driver.quit();
	}

}
