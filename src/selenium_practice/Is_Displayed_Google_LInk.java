package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Google_LInk {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		//Boolean b= driver.findElement(By.linkText("gmail")).isDisplayed();
		//System.out.println(b);
		
		
		if(driver.findElement(By.linkText("gmail")).isDisplayed())
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}

	}

}
