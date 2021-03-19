package listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNGListener extends TestListenerAdapter{
	
	public void onTestFilure(ITestResult it) {
		String testcase = it.getName();
		System.out.println("----->"+testcase+" failed");
	}
	
	public void onTestSuccess(ITestResult it) {
		String testcase = it.getName();
		System.out.println("----->"+testcase+" success");
	}

	public void onTestSkipped(ITestResult it) {
		String testcase = it.getName();
		System.out.println("----->"+testcase+" skipped");
	}
}
