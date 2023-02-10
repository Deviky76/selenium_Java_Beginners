package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Facebook {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("httP://facebook.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'phone')]")).sendKeys("demo");

	}

}
