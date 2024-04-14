package myPackage;
import org.testng.annotations.Test;

public class TestNG_order {
	
	@Test(priority=4, enabled=true)
	public void abc() {
		
	}
	@Test(priority=1, invocationCount=5)
	public void water() {
		
	}
	@Test(priority=3, description= "test is special for this release")
	public void apple() {
		
	}
	
	@Test(priority=2, timeOut=2000)
	public void grape() throws InterruptedException {
	}
	
	

}
