package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment38_39 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");


		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//button[.=\"Click \"]"));
		e1.click();
		
		driver.switchTo().alert().accept();
		
		

	}

}
