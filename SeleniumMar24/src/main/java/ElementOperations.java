import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementOperations {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		boolean result = driver.findElement(By.xpath("//input[@id='checkbox1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		boolean checked = driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
		System.out.println(result);
		System.out.println(checked);
		boolean enabled = driver.findElement(By.xpath("//input[@id='checkbox3']")).isEnabled();
		System.out.println(enabled);
		driver.quit();
	}

}
