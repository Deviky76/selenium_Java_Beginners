package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_Flight {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("bobby4");
		driver.findElement(By.name("contact")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcdd11@ab.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("bobby");
		
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.name("dob")).sendKeys("24-03-2003");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		String msg = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]")).getText();
		
		System.out.println(msg);
		
		if(msg.toLowerCase().contains("registered"))
		{
			System.out.println("New User Registration Test case Pass");
		}
		else
		{
			System.out.println("New User Registration Testcase Fail");
		}
		// driver.close();
	}

}
