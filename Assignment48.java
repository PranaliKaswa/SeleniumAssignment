package TESTNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment48
{
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
}