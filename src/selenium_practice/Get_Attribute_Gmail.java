package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_Gmail {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
		//driver.get("http://gmail.com");
		driver.get("http://facebook.com");
		//String linkurl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		
		//System.out.println(linkurl);
		
		//all Links present in the webpage
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e:links)
		{
			String linkname= e.getText();
			String linkurl= e.getAttribute("href");
			
			System.out.println(linkname+"    "+linkurl);
		}
		

	}

}
