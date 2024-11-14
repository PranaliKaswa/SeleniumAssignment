package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment40_41 {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//a[.=\"About Amazon\"]"));
		             Point p1 =   e1.getLocation();
		       int x =      p1.getX();
		       int y =      p1.getY();
		       System.out.println(x);
		       System.out.println(y);
		       
		       JavascriptExecutor js = driver;
		       js.executeScript("window.scrollBy("+x+", "+y+")");
	}

}
