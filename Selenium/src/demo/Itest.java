package demo;

import org.testng.ITestListener;
import org.testng.ITestResult;

import genric.Base_class;
import genric.ScreenShot;

public class Itest  implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started"+" "+result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test got passed"+" "+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("take the ScreenShot"+" "+result.getName());
		ScreenShot.sc();
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test got Skipped"+" "+result.getName());
	
	}
}
