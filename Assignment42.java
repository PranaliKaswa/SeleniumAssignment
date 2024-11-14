package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment42 {

	public static void main(String[] args) throws InterruptedException {


		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(90);
		
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("GroTechMinds");
		
		WebElement e2 = driver.findElement(By.id("search-icon-legacy"));
		e2.click();
		
		driver.close();

	}

}
