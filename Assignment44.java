package TESTNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment44 {
	
	@Test
	public void scenario1()
	{
		System.out.println("Test");
	}
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuite");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("AfterTest");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest");
	}
	
	
	
	

}
