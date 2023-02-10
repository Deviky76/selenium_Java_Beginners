package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_By {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("kyaminik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Yam1n1@FaceB00k");
		driver.findElement(By.name("login")).click();
		
		

	}

}
