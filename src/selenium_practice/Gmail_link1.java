// Script to check Gmail link is working or not based on the URL using : getCurrentUrl()  TestCase Pass or fail
//Script go capture URL of the Page using : getCurrentUrl() 


package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_link1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		String expurl, acturl;
		expurl= "gmail";
		
		acturl = driver.getCurrentUrl();
		
		if (acturl.contains(expurl))
		{
			System.out.println("Test case pass");
			
		}
		else
		{
		
			System.out.println("Test case Fail");
		}
		

	}

}
