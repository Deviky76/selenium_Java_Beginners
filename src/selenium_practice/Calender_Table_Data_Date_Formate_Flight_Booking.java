// Script to Enter DOB in User Registration of Flight App using : sendKeys()

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Table_Data_Date_Formate_Flight_Booking {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("dob")).sendKeys("22-06-2019");

	}

}
