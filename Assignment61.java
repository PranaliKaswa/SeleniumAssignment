package p1;



import org.testng.annotations.Test;

public class Assignment61
{
	@Test(priority=0, invocationCount=10)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA");
	}
	@Test(priority=1)
	public void testcaseB()
	{
		System.out.println("testcaseB priority =1");
	}
}
