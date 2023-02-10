//Script to capture Screenshot of the page

package selenium_practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screehshot_Of_Page_PrimusBank {

	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgfile = new File("C:\\Users\\devi\\workspace\\selenium\\011122\\Defect\\defect1.bmp");
		FileUtils.copyFile(srcfile, trgfile);
		
		
		
		
		driver.findElement(By.xpath("//a[contains(@href,'password')]")).click();
		
		//code to capture Screenshot
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File srcfile1 = ts1.getScreenshotAs(OutputType.FILE);
		File trgfile1 = new File("C:\\Users\\devi\\workspace\\selenium\\011122\\Defect\\defect2.bmp");
		FileUtils.copyFile(srcfile1, trgfile1);
		
		

	}

}
