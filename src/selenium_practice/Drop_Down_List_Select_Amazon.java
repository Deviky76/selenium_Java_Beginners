package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List_Select_Amazon {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//To select particular item from the dropdown list using VisibleText
		
		driver.get("http://amazon.com");
		Select catalog = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		catalog.selectByVisibleText("Books");

	}

}
