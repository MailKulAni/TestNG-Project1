package package1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsExamples {
	
	@Test
	public void validateSoftAssertions() {
		SoftAssert softAssert = new SoftAssert();
		
		String expected = "abc";
		String actual = "abcd";
		
		softAssert.assertEquals(actual, expected);
	}

}
