package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://grotechminds.com/registration/");
		cd.manage().window().maximize();
		
		WebElement e1 = cd.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\pranali.p.kaswa\\Downloads\\Git-2.46.2-64-bit.exe");

	}

}
