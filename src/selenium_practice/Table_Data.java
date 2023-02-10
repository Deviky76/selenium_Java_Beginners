package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Table_Data {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//script to count number of rows in a table
		driver.get("https://money.rediff.com/tools/forex");
		/* to find the total rows available in the table
		 * List<WebElement> rows= driver.findElement(By.className("dataTable")).findElements(By.tagName("tr"));
		   System.out.println(rows.size());
						OR
		*/
		WebElement curtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = curtable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		
	}

}
