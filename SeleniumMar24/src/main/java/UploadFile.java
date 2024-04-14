import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		browse.sendKeys("C:\\Users\\PC\\Downloads\\sampleFile.jpeg");
		driver.quit();
	}

}
