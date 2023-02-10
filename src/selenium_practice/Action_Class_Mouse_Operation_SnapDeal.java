//Script to Move Mouse Over Specified element & Right Click

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Mouse_Operation_SnapDeal {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
		act.contextClick();
		act.build().perform();
		
		//                       OR
		Thread.sleep(2000);
		act.contextClick(driver.findElement(By.linkText("Electronics")));
		act.build().perform();
		
		

	}

}
