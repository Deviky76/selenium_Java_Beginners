package selenium_practice;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_open {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("http://amazon.com");
		
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Sell")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Sign up")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Next")).click();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		

	}

}
