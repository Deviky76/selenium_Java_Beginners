package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("httP://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("kyaminik@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Yam1n1@FaceB00k");
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
