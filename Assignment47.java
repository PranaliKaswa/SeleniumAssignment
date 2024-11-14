package TESTNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment47 
{
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("bSuite");
	}
	@AfterClass
	public void aClass()
	{
		System.out.println("aClass");
	}
}