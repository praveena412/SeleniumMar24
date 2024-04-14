import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions obj = new Actions(driver); // ClassName object = new ClassName();                                                // for keyboard and mouse actions, we use actions class in selenium
		WebElement start = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement end = driver.findElement(By.xpath("//div[@class='dragged' and @id='droparea']"));
		obj.dragAndDrop(start, end).perform();
		WebElement logo = driver.findElement(By.xpath("//img[@id='mongo']"));
		obj.contextClick(logo).perform(); // Right click
		obj.doubleClick(logo).perform();
		driver.quit();  // close the browser
	}

}
