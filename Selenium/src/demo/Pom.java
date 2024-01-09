package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;
	

		public Pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	public WebElement  Login()
	{
		 return login;
	}
}
