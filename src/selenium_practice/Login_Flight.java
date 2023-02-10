package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Flight {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("abcd111111@ab.com");
		driver.findElement(By.name("password")).sendKeys("bobby");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[3]/ul/li[2]/div/a/i")).click();
		//driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/ul/li[5]/a"))
		driver.findElement(By.partialLinkText("Logout")).click(); 
		
		driver.close();
		
		

	}

}
