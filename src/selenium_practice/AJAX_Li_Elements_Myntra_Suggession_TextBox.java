package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJAX_Li_Elements_Myntra_Suggession_TextBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		// Script to count & read all suggestions (AJAX) displayed in Google
		
		driver.get("https://myntra.com");
		//   Or driver.findElement(By.className("desktop-searchBar")).sendKeys("kids");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("kids");;
		Thread.sleep(2000);
		List<WebElement> women_cloth = driver.findElement(By.className("desktop-group")).findElements(By.tagName("li"));
		System.out.println(women_cloth.size());
		
		for(WebElement element : women_cloth)
		{
			System.out.println(element.getText());
		}
		
		
	}

}
