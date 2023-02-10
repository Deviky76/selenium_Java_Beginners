package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_calculator 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://calc.qedgetech.com");
		driver.findElement(By.xpath("//*[@value='1']")).click();
		driver.findElement(By.xpath("//*[@value='+']")).click();
		driver.findElement(By.xpath("//*[@value='2']")).click();
		driver.findElement(By.xpath("//*[@value='=']")).click();
		
		String res = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(res);
	}
}
