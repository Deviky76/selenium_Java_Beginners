package selenium_practice;
//import java.lang.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srartswith_OrangeHRMS {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> chklist = driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
		System.out.println(chklist.size());
		
		for(int i=0; i<chklist.size(); i++)
		{
			if(i % 2 == 0)
			{
				chklist.get(i).click();
			}
		}
			
		
		//Here we have to use for-each loop to select all the required webelements
		/*
		for(WebElement element : chklist)
		{
			element.click();
		} */
	}
	
}
