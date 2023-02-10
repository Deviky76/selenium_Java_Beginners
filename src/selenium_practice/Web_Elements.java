package selenium_practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement> links = driver.findElements(By.linkText("Home"));
		
		System.out.println(links.size());
		
		links.get(1).click();
		

	}

}
