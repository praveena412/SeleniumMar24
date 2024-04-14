package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Before {
	
	public WebDriver driver;   
	
	@BeforeClass
	public void Before() {
		driver= new ChromeDriver(); 
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html"); 
	}
	
	@AfterClass
	public void After() {
		driver.quit();
	}

}
