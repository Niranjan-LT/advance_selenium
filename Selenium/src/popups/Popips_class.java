package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popips_class 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
		//Thread.sleep(2000);
		//dr.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		//Alert alert = dr.switchTo().alert();
		//Thread.sleep(2000);
		// To perform +ve Action
		//alert.accept();
		// To perform -ve action
		//alert.dismiss();
		//To fetch the text of the popup
		//String text = alert.getText();
		//System.out.println(text);
//		alert.sendKeys("yes");
//		Thread.sleep(2000);
//		alert.accept();
		
		
		
		//to handle File upload popups
		
		
//		dr.findElement(By.xpath("//input[@type='file']"))
//		.sendKeys("C:\\Users\\lenovo\\Pictures\\Screenshots\\Screenshot 2023-06-14 185422.png");
		
		
		
		
		
	}
}
