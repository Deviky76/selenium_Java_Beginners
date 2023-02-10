//Script to capture Current Browser Window Id using  :  getWindowHandle()

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_getWindowHandle_GooglePage {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Script to capture Current Browser Window Id using  :  getWindowHandle()
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		String current_window_id = driver.getWindowHandle();
		System.out.println(current_window_id);

	}

}
