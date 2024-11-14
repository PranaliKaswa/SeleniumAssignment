package p1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment35 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
		
		/*Screenshot_Taking t = new Screenshot_Taking();
		System.out.println(t.getClass());
		*/
		Date d = new Date();
		d.getTime();
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\pranali.p.kaswa\\Documents\\Sele_Screenshot\\" + new Assignment35().getClass()  + Math.random() + ".png");
		FileHandler.copy(source, destination);
		
		
	}

}
