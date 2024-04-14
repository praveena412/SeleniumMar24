import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myPackage.Before;

public class newConcepts extends Before {  // 
	
	//Framework that will us to not to use main method
	// Jbehave, Junit, TestNG: Next generation
	
	@Test
	public void xyz_webTable_rows() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr")); //7
		int count = rows.size();
		System.out.println("rows count:" + count);
		
	}
	@Test
	public void abc_webTable_headers() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//th"));
		//advanced for loop for(dataType tempVariable: Collection)
		for(WebElement e:rows) {
			System.out.println("Header: "+ e.getText());
		}
	}
	@Test
	public void ghi_webtable_data() {
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']//td"));
		for(WebElement x: data) {
			if(x.getText().equals("Java")) {
				break;
			}
		}
		System.out.println("Data got validated");
	}
	


}
