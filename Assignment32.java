package p1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment32 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//span[.=\"Sign in with Google\"]"));
		e1.click();
		
		Set<String> s1  = driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> i1 = s1.iterator();
		  String parent = i1.next();
		  String child = i1.next();
		
		driver.switchTo().window(child);
		WebElement e2 = driver.findElement(By.id("identifierId"));
		e2.sendKeys("kaswapranali@gmail.com");
				
		
	}
	
 
}
