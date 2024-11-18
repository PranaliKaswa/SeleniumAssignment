package p1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Assignment71 implements IRetryAnalyzer
{

	@Override
	public boolean retry(ITestResult result) 
	{
		int InitialCount = 0;
		int RetryCount = 2;
		if(InitialCount<RetryCount)
		{
			InitialCount++;
			return true;
		}
		
		return false;
	}

}