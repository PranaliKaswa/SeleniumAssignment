package TESTNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment51
{
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	@Test
	public void test1()
	{
		System.out.println("test2");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
}