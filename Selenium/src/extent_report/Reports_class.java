package extent_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports_class 
{	public ExtentReports reports;
	public ExtentTest test;
	@BeforeClass
	public void report() 
	{
		reports=new ExtentReports("./reports/login.html");
		test = reports.startTest("Reports_class");
	}
	@Test
	public void test()
	{
		//By using WebDriverManager 
		WebDriver dr= WebDriverManager.chromedriver().create();
				
		dr.get("https://www.facebook.com");
		
		if(dr.getTitle().equals("Google"))
		{
			test.log(LogStatus.PASS, "navigated");
		}
		else
		{
			test.log(LogStatus.FAIL, "test is fail");
		}
	}
	@AfterClass
	public void close()
	{
		reports.endTest(test);
		reports.flush();
	}
	
	
	
	
	
	
}
