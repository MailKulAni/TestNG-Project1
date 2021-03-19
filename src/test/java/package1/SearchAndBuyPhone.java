package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	@Test(priority=1)
	public void searchPhone() {
		System.out.println("In Search Phone test case...");
		Assert.assertEquals(1, 10);
	}
	
	@Test(priority=2, dependsOnMethods="searchPhone")
	public void selectPhone() {
		System.out.println("In select Phone test case...");
	}
	
	@Test(priority=3, dependsOnMethods= {"searchPhone", "selectPhone"})
	public void buyPhone() {
		System.out.println("In buy Phone test case...");
	}
}
