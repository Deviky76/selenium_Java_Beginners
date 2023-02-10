package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String exptitle, acttitle;
		exptitle = "Google Images";
		
		driver.findElement(By.linkText("Images")).click();
		acttitle = driver.getTitle();
		
		if(acttitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("The testcase Pass");
		}
		else
		{
			System.out.println("The testcase Fail");
		
		}
				

	}

}
