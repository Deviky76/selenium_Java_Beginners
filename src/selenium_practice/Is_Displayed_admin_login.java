package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_admin_login {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}

	}

}
