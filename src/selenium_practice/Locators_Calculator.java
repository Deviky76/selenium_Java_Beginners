package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Calculator {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://calc.qedgetech.com");
		driver.findElement(By.xpath("//*[@value='9']")).click();
		driver.findElement(By.xpath("//input[@value='-']")).click();
		driver.findElement(By.xpath("//*[@value='2']")).click();
		driver.findElement(By.xpath("//*[@value='=']")).click();
		driver.findElement(By.name("display")).sendKeys("200");
		//driver.findElement(By.name("display")).clear();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		
		
	}

}
