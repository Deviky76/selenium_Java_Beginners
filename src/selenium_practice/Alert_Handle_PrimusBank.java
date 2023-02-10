package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle_PrimusBank {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.id("txtuId")).sendKeys("abc");
		driver.findElement(By.id("txtPword")).sendKeys("xyz");
		driver.findElement(By.id("login")).click();
		
		//driver.switchTo().alert().accept();
		
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);

	}

}
