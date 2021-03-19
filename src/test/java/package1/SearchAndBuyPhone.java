package package1;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	@Test(priority=1)
	public void searchPhone(ITestContext context) {
		System.out.println("In Search Phone test case...");
		//Assert.assertEquals(1, 10);
		context.setAttribute("phone name", "samsung a70");
	}
	
	@Test(priority=2, dependsOnMethods="searchPhone")
	public void selectPhone(ITestContext context) {
		System.out.println("In select Phone test case...");
		String phoneName = (String) context.getAttribute("phone name");
		
		//skip this test when phone name = samsung a70
		if(phoneName.equalsIgnoreCase("samsung a70")) {
			throw new SkipException("Skipping test since phone name is: samsung a70");
		}else {
			//select phone and add to the bag
		}
	}
	
	@Test(priority=3, dependsOnMethods= {"searchPhone", "selectPhone"})
	public void buyPhone() {
		System.out.println("In buy Phone test case...");
	}
}
