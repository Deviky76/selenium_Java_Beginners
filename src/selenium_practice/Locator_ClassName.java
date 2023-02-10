package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ClassName {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("devi1976@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Devi@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		

	}

}
