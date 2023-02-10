package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testvvs {

	public static void main(String[] args) throws InterruptedException
	
	
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		//WebElement ele = driver.findElement(By.linkText("gmail"));
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\'gb\']/div[2]/div[3]/div[1]/div/div[1]/a"));

		ele.isDisplayed();
		ele.getText();
		System.out.println("this is :" +ele);

		

	}
	
	
}
