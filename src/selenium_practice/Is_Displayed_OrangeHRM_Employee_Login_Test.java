package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_OrangeHRM_Employee_Login_Test {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("ajith");
		driver.findElement(By.name("txtPassword")).sendKeys("Ajitha123@");
		
		
		//For testing if condition 
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.name("Submit")).click();
		
		try 
		{
			if(driver.findElement(By.linkText("Admin")).isDisplayed())
			{
				System.out.println("Testcase fail");
			}
		}
		catch (Exception e)
		{
			System.out.println("Testcase pass");
		}
	}
}
