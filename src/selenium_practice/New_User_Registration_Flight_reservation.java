package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New_User_Registration_Flight_reservation {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("bobby4");
		driver.findElement(By.name("contact")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcdd03@ab.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("bobby1");
		
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Male");
		
		//driver.findElement(By.name("dob")).sendKeys("24-03-2003");
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
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		String msg = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]")).getText();
		
		System.out.println(msg);
		
		if(msg.toLowerCase().contains("registered"))
		{
			System.out.println("New User Registration Test case Pass");
		}
		else
		{
			System.out.println("New User Registration Testcase Fail");
		}
		//driver.close();

	
	}
}

