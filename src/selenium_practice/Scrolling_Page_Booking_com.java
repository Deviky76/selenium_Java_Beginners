//Script to scroll a page for specified no. of pixels

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Page_Booking_com {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://booking.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 2000)");

	}

}
