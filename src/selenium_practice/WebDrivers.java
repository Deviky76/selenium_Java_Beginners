package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		
		
	//	driver.navigate().to("https://facebook.com");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().to("https://gmail.com");
		
		//driver.close();

	}

}
