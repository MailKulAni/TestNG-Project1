package package1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsExamples {
	
	@Test
	public void validateSoftAssertions() {
		
		System.out.println("In Soft Assertion test case...");

		SoftAssert softAssert = new SoftAssert();
		
		String expected = "abc";
		String actual = "abcd";
		
		softAssert.assertEquals(actual, expected);
		System.out.println("statement after assertion");

		softAssert.assertTrue(5<2, "error...");
		
		//imp
		softAssert.assertAll();
	}

}
