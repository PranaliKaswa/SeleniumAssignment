package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class Assignment43 {

	public static void main(String[] args) {
		ChromeOptions c1 = new ChromeOptions();
		//EdgeOptions c1 = new EdgeOptions();
		c1.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(c1);
		driver.get("https://grotechminds.com/javascript-popup/");


		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//button[.=\"Click \"]"));
		e1.click();
		
		driver.switchTo().alert().accept();
		
		

	}

}
