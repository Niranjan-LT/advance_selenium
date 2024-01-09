package bevarsi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Sample12
{
	@DataProvider(name="facebook_login")
	public Object[][] data()
	{
		return new Object[][]
				{
					{"hi","123"},
					{"hello","456"},
					{"tata","789"}
				};
	}
	
	
	
	@Test(dataProvider = "facebook_login")
	public  void test(String username, String password) 
	{
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "welcome to facebook");
		driver.close();
		System.out.println("pass");
		
		//System.out.println("hello");
		
		
		
}

}
