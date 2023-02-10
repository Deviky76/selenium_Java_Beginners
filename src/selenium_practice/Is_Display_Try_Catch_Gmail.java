package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Display_Try_Catch_Gmail {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");

		String link ="Demo";
		try
		{
			if(driver.findElement(By.linkText(link)).isDisplayed())
			{
				System.out.println("Pass"); 
			}
		} catch (Exception e)
		{
			System.out.println("Fail");

		}

	}
}

