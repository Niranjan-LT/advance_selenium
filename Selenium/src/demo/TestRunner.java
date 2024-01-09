package demo;

import org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import genric.DDt;

public class TestRunner 
{
	public static void main(String[] args) throws InterruptedException  {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
//		Thread.sleep(4000);
//		 driver.findElement(By.id("buttonAlert1")).click();
//		 Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("yes");
		
		String value = DDt.ddt("Sheet1", 5, 0);
		System.out.println(value);
	
		
	}

}
