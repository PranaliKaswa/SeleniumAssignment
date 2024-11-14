package p1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment33 
{

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https:www.amazom.in");
        driver.manage().window().maximize();
        
        
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("Shoes" + Keys.ENTER);
        
        WebElement e2 = driver.findElement(By.xpath("(//div[@class= 'a-section a-spacing-base a-text-center'])[1]"));
        e2.click();
        
        Set<String> s1 =driver.getWindowHandles();
	    Iterator<String> i1 = s1.iterator();
	    String parent = i1.next();
	    String child = i1.next();
	    
	    
	    driver.switchTo().window(child);
	    Thread.sleep(5000);
	    WebElement e3 = driver.findElement(By.xpath("//span[@id='dealsx_atc_btn']"));
	    e3.click();
	
	
	}
}
