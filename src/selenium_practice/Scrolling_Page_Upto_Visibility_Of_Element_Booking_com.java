package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Page_Upto_Visibility_Of_Element_Booking_com {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://booking.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@id=\"__bui-c10-2\"]/li[1]/a/div/div[2]/div[1]")));
		//Thread.sleep(1000);

	}

}
