package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJAX_Li_Elements_Google_Suggession_TextBox {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		// Script to count & read all suggestions (AJAX) displayed in Google
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		List<WebElement> keywordlist =  driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		
		System.out.println(keywordlist.size());
		
		for(WebElement element : keywordlist )
		{
			
			/*
			 * String keyword = element.getText();
			System.out.println(keyword);
			
			         or
			 * 
			 */
			
			System.out.println(element.getText());
		}
	}

}
