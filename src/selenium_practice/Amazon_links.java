package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_links {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://amazon.com");
		
		List<WebElement> links = driver.findElements(By.linkText("Shop now"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		System.out.println(links.size());
		
		for (int i =0; i<=links.size(); i++)
		{
			System.out.println(links.get(i));
		}

	}

}
