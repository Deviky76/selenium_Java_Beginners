package selenium_practice_suresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_nocommerce {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://admin-demo.nopcommerce.com");
		//driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//div/div/nav/ul/li[4]/a/p")).click();
		driver.findElement(By.xpath("//a[@href='#']//span[contains(text(), 'Customers')]"));
	}

}
