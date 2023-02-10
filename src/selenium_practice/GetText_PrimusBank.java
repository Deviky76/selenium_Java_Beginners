package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_PrimusBank {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//To read the content displayed in a web page using getText() method
		
		driver.get("http://primusbank.qedgetech.com");
		String str = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		System.out.println(str);
	}

}
