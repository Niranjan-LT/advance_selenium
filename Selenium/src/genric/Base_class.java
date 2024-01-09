package genric;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Base_class implements base_constans
{
//	public String un;
//	public String pwd;
//	
	public static WebDriver driver;
	@BeforeTest
	public void  before() throws FileNotFoundException, IOException 
	{
	System.setProperty(chrome_key, chrome_value);
	 //driver  =new ChromeDriver();
//		Properties p=new Properties();
//		p.load(new FileInputStream("./property.properties"));
//		 un = p.getProperty("username"); 
//		 pwd=p.getProperty("password");
	}


	@BeforeMethod
	public void  open_pp()
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	
	@AfterMethod
	public void close_app()
	
	{
		driver.quit();
	}
	
	
	
	
	
	
}

