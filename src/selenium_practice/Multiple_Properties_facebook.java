package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Properties_facebook {

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facbook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='sex' and @value='2']")).click();
		

	}

}
