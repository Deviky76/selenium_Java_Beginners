// Script to Select DOB in New User Registration in Flight App by operating Calendar

package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_Popup_Date_Flight_reservation {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("dob")).click();
		
		String dob="1-Jan-2011";
		String[] temp= dob.split("-");
		
		String dt= temp[0];
		String month =temp[1];
		String year =temp[2];
		
		System.out.println(dt);
		System.out.println(month);
		System.out.println(year);
		
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month);
		
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		
		for(int i=1; i<rows.size(); i++)
		{
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=1;j<cols.size();j++)
			{
				String caldate =cols.get(j).getText();
				//System.out.println(caldate);
				
				if(caldate.equals(dt))
				{
					cols.get(j).click();
					break;
				}
				
			}
			
		}
		

	}

}
