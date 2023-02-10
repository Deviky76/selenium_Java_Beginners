package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List_Select_Specified_Item_Present_Amazon {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//To select a particular item present in  the dropdown list 
		
		driver.get("http://amazon.com");
		Select cat= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> catlist = cat.getOptions();
		
		String Item_to_be_check ="ook";
		boolean isitempresent = false;
		
		for(int i=0; i<catlist.size(); i++)
		{
			if(catlist.get(i).getText().equalsIgnoreCase(Item_to_be_check))
			{
				isitempresent= true;
				break;
			}
		}
		if (isitempresent)
		{
			System.out.println(Item_to_be_check+"   is displayed in the list. Test Pass");
		}
		else
		{
			System.out.println(Item_to_be_check+"  is not displayed in the list. Test Fail");
		}
	}
}
