package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_HrmOrange {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		

	}

}
