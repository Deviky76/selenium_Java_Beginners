package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Table_Data_Flight_Reservation {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("abcdd11@ab.com");
		driver.findElement(By.name("password")).sendKeys("bobby");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.id("search-date")).sendKeys("11/11/2023");

	}

}
