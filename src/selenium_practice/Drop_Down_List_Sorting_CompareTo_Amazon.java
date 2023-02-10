package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List_Sorting_CompareTo_Amazon {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://amazon.com");
		Select cat= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> catlist = cat.getOptions();
		
		String item1, item2;
		boolean ordered= true;
		
		for(int i=1; i<catlist.size(); i++)
		{
			item1 = catlist.get(i-1).getText();
			item2 = catlist.get(i).getText();
			// for checking purpose
			//System.out.println(item1+"     "+item2);
			
			if(item2.compareToIgnoreCase(item1)<0)
			{
				ordered =false;
				break;
			}
		}
		if(ordered)
		{
			System.out.println("all items in the dropdown list is in ascending order, Test Pass");
		}
		else
		{
			System.out.println("items in the dropdown are not listed in the ascending order, Test Fail");
		}
	}
}
