package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullxpath_Snapdeal {

	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("httP://snapedeal.com");
		
		Thread.sleep(5000);
		// Using full xpath
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[1]/div/i")).click();
		Thread.sleep(5000);
		
		//using partial xpath
		driver.findElement(By.xpath("//section/div/div[1]/span/i")).click();

	}

}
