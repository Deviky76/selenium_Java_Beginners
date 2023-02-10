package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Data_ReadAll_Rows_Colums_IRCTC_TimeTable {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//script to fetch all the rows and columns of  IRCTC Time Table
		driver.get("https://www.railyatri.in/time-table");
		WebElement trainstable = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element : cols)
			{
			
				String data = element.getText();
				System.out.print(data+"     ");
			}
			System.out.println();
			
		}

	}

}
