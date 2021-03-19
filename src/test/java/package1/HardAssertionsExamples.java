package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsExamples {
	
	@Test
	public void doLogin() {
		System.out.println("In doLogin test case...");
		
		String expected = "abc";
		String actual = "abcd";
		
		Assert.assertEquals(actual, expected); 
		//in case of failure, it won't execute further statements
		//also, it won't execute onTestFailure method under listener class
		System.out.println("statement after assertion");
	}
}
