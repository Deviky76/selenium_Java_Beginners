package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List_Select_All_Items_Amazon {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//To select all items from the dropdown list using VisibleText
		
		driver.get("http://amazon.com");
		Select cat= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> catlist = cat.getOptions();
		System.out.println(catlist.size());
		
		for(int i=0; i<catlist.size(); i++)
		{
			String catname = catlist.get(i).getText();
			System.out.println(catname);
		}
	}
}
