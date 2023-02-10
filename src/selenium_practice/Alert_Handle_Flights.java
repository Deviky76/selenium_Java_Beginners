// Script to handle alerts

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle_Flights {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.partialLinkText("Bookings")).click();
		driver.findElement(By.partialLinkText("Delete")).click();
		String alertstr = driver.switchTo().alert().getText();
		System.out.println(alertstr);
		
		if(alertstr.contains("Delete"))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			driver.switchTo().alert().dismiss();
		}

	}

}
