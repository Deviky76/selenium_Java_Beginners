package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Date_Selecting_Flight_Booking_Ticket {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("abcdd01@ab.com");
		driver.findElement(By.name("password")).sendKeys("bobby1");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.id("search-date")).click();
		String flydate= "11-August-2023";
		String temp[]=flydate.split("-");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
		String calyear= driver.findElement(By.className("ui-datepicker-year")).getText();
		
		//System.out.println(calyear);
		while(!calyear.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			calyear= driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		//System.out.println(calmonth);
		
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.linkText("Next")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows, cols;
		
		rows= cal.findElements(By.tagName("tr"));
		for( int i=1; i<rows.size();i++)
		{
			cols= rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(dt))
				{
					cols.get(j).click();
					break;
				}
			
			}
		}

	}

}
