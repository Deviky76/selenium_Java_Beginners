//Script go capture URL of the Page using : getCurrentUrl()


package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_link {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();   
		String pgurl = driver.getCurrentUrl();
		System.out.println(pgurl);
		

	}

}
