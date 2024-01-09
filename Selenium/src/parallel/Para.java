package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para 
{
	@Parameters("browser")
	@Test
	public void test(String browser) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver;
		if (browser.equals("firefox"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.close();
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");	
			driver.close();
		}
	
	}

}
