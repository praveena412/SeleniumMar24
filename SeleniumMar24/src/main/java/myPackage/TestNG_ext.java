package myPackage;
import org.testng.annotations.Test;

public class TestNG_ext {
	
	@Test
	public void login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void notifications() {
		System.out.println("Notifications");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void Messages() {
		System.out.println("Messages");
	}
	

}
