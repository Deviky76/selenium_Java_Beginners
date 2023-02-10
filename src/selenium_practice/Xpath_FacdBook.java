package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FacdBook {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("kyaminik@gmail.com"); 
		driver.findElement(By.id("pass")).sendKeys("Yam1n1@FaceB00k"); 
		
// Here the login button id is dynamically changing. But we have a constant text.
		
// So Here we can use starts-with() function to capture the element using id
		
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_5')]")).click();
		
	}

}
