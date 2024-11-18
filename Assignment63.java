package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment63
{
	@Test(timeOut = 200)
	public void googleLaunch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}