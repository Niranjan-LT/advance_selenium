package genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDt 
{
	public String path="./excel/data.xlsx";
	public void  ddt()
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			try {
				WorkbookFactory.create(fis);
			} catch ( e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		catch (Ezzz e) {
			
		}
		
	}

}
