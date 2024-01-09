package genric;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends Base_class
{
	public static  TakesScreenshot tc;
	public  static void sc() 
	{
		 tc=(TakesScreenshot)driver;
		File drc = tc.getScreenshotAs(OutputType.FILE);
		File target=new File("./photos/t.jpeg");
		try 
		{
			FileHandler.copy(drc, target);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
