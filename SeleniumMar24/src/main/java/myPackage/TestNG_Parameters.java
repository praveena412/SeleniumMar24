package myPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	
	@Parameters({"url", "username", "pwd"})
	@Test
	public void login(String url, String username, String pwd) {
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.quit();
	}

}
