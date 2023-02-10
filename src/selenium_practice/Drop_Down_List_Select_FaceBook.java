package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Drop_Down_List_Select_FaceBook {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facbook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(23);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("3");
		
		WebElement yearelement = driver.findElement(By.id("year"));
		Select year = new Select(yearelement);
		year.selectByVisibleText("2003");
		
	}

}
