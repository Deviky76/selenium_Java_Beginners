//Script Explicit Wait Condition using WebDriverWait

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Alert_Handling_Flight_Reservation {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.partialLinkText("Bookings")).click();
		driver.findElement(By.partialLinkText("Delete")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

	}

}
