import org.testng.annotations.Test;

public class TestNG_Group {
	
	@Test(groups= {"first"})
	public void tc_Account() {
           System.out.println("Account");                            
	}
	
	@Test(groups= {"second"})
	public void tc_system() {
		System.out.println("System");    
	}
	@Test(groups= {"first"})
	public void tc_regression() {
		System.out.println("Regression");
	}
	@Test(groups= {"second"})
	public void tc_functional() {
		System.out.println("Functional");
	}

}
