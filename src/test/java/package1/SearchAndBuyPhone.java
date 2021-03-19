package package1;

import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	@Test(priority=1)
	public void searchPhone() {
		System.out.println("In Search Phone test case...");
	}
	
	@Test(priority=2)
	public void selectPhone() {
		System.out.println("In select Phone test case...");
	}
	
	@Test(priority=3)
	public void buyPhone() {
		System.out.println("In buy Phone test case...");
	}
}
