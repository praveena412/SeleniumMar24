import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']")); // WebElement
		Select single = new Select(skills);
		single.selectByValue("iPhone");
		single.selectByIndex(5);
		single.selectByVisibleText("AutoCAD");
		driver.get("https://demoqa.com/select-menu");
		WebElement multiSelect = driver.findElement(By.name("cars"));
		Select multi = new Select(multiSelect);
		multi.selectByIndex(0);
		multi.selectByValue("audi");
		multi.selectByVisibleText("Opel");
		multi.deselectByIndex(0);
		multi.deselectAll();
		driver.quit();
	}

}
