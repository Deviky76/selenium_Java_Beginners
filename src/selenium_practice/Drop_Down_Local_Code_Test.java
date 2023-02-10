package selenium_practice;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Local_Code_Test {

	public static void main(String[] args) 
	{
		/*	the below text to be enter in the notepad to work with our own dropdown list elements
	 		<select id=cars> 	//to choose multiple values in dropdown list using ( <select id=cars multiple> )
				<option>Select a car</option>
				<option value="b">BMW</option>
				<option value="h">Honda</option>
				<option value="v">Volva</option>
				<option value="a">Audi Sport Driver</option>

			</select>
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/devi/Desktop/demo.html");
		Select car = new Select(driver.findElement(By.id("cars")));
		//car.selectByVisibleText("Honda");
		
		//finding element using value property in the list
		//car.selectByValue("a");
		List<WebElement> carlist= car.getOptions();
		
		//to know the total items in the dropdown list
		//System.out.println(carlist.size());
		
		for(int i=1; i<carlist.size(); i++)
		{
			String carname = carlist.get(i).getText();
			System.out.println(carname);
		}
		
	}

}
