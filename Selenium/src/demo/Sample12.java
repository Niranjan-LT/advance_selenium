package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import genric.Base_class;

public class Sample12 extends Base_class 
{
	@Test
	public  void test1() 
	{
		//Pom p=new Pom(driver);
		//p.Login().click();
		Assert.fail();
		///System.out.println(un);
	}
	@Test(dependsOnMethods = "test1")
	public void test12()
	{
		System.out.println("ji");
	}
	
	
}
 

