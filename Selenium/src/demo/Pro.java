package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pro
{
	String path="./excel/data.xlsx";
	@Test
	public void  before() throws EncryptedDocumentException, IOException  
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
//		int i=0;
//		FileInputStream fis=new FileInputStream(path);
//		Workbook book = WorkbookFactory.create(fis);
//		 
//		Sheet sheet = book.createSheet("abcdef");
//		
//		for(WebElement link:all_links)
//		{
//		String value = link.getAttribute("href");
//		
//		Row r = sheet.createRow(i);
//		
//		Cell c = r.createCell(0);
//		
//		c.setCellValue(value);
//		
//		FileOutputStream fos=new FileOutputStream(path);
//		
//		book.write(fos);
//		i++;
//		}
	}
}
