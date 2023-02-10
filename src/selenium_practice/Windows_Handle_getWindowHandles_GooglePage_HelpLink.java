// Script to switch driver focus between multiple browser windows.

package selenium_practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handle_getWindowHandles_GooglePage_HelpLink {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Script to switch driver focus between multiple browser windows.
		driver.get("https://gmail.com");
		driver.findElement(By.linkText("Help")).click();

		Set<String> allwindows =driver.getWindowHandles();
		System.out.println(allwindows);
		
		Object[] windows = allwindows.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		

	}

}
