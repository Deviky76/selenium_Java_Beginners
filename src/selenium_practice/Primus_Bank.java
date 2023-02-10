package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primus_Bank {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("httP://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.linkText("Home")).click();
		

	}

}
