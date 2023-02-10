package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_primusBank {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://primusbank.qedgetech.com");
		//driver.findElement(By.xpath("//*[@href='aboutus.html']")).click();
		driver.findElement(By.xpath("//img[@src='images/mainlinks_06.jpg']")).click();
		
	}

}
