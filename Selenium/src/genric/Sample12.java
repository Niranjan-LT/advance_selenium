package genric;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import genric.Base_class;

public class Sample12 extends Base_class
{
	@Test
	public void test1()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		driver.findElement(By.id("email")).sendKeys("hi");
		driver.findElement(By.id("pass")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		
	}
}
 

