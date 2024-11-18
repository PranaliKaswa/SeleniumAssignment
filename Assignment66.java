package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Assignment66
{
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void LaunchAmazon(String nameOfBrowser)
	{
		if(nameOfBrowser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameOfBrowser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	}

}