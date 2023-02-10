package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box_Flights_Login_Register {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		/* to check the checkbox is selected or not
		 * boolean x = driver.findElement(By.id("flexCheckChecked")).isSelected();
		//System.out.println(x);
		*/
		
		WebElement chkbox = driver.findElement(By.id("flexCheckChecked"));
		
		System.out.println(chkbox.isSelected());	
		//chkbox.click();
		//System.out.println("After Selected......");	
		//System.out.println(chkbox.isSelected());	
		if(!chkbox.isSelected())
		{
			chkbox.click();
		}
		// to make the checkbox always selected
		 
		
	}
}


