package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment56 
{
	@DataProvider(name="Set1")
	public Object[][] dataSet()
	{
		return new Object[][] {{"Shoes"},{"watches for women"}, {"Books"},{"sunglasses for men"},{"Home decore"},{"Kids Toys"},{"Women dress"},{"Mens Shirt"},{"HeadPhones"},{"Mobile"}};
	}
	
	@Test(dataProvider="Set1")
	public void AmazonSearch(String input)
	{
	EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtBox_search.sendKeys(input);
	}
	
}
