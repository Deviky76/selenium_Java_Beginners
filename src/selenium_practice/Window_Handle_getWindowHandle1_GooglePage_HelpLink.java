//Script to capture all browser window ids using  :  getWindowHandles()

package selenium_practice;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_getWindowHandle1_GooglePage_HelpLink {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Script to capture all browser window ids using  :  getWindowHandles()
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		String current_window_id = driver.getWindowHandle();
		System.out.println(current_window_id);
		
		driver.findElement(By.linkText("Help")).click();
		//String x = driver.getWindowHandle();
		//System.out.println(x);
		Set<String> allwindows =driver.getWindowHandles();
		System.out.println(allwindows);
		//System.out.println(allwindows.size());
		

	}

}
