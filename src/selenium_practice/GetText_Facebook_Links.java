package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Facebook_Links {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To fetch all the links availabel in the facebook home page
		
		//To capture Link names displayed in the page using getText() method
		driver.get("http://facebook.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int a=0;
		
		for(WebElement element : links)
		{
			String linkname = element.getText();
			System.out.print(a++);
			System.out.println("   "+linkname);
			
		}
			
		

	}

}
