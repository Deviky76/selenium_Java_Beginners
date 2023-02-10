package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GooglePage {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//To capture heading displayed in the page using getText() method
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("About")).click();
		String heading = driver.findElement(By.xpath("//section[2]/div/h1")).getText();
		System.out.println(heading);

	}

}
