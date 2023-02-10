package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Data_Count_IRCTC {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//script to count number of rows in a table
		driver.get("https://www.railyatri.in/time-table");
		WebElement trainstable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		System.out.println(cols.size());
		

	}

}
