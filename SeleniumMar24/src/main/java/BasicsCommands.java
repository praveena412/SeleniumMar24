import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicsCommands {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver(); // Open the browser
		driver.get("https://www.google.com"); 
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit(); // close the browser
	}

}
