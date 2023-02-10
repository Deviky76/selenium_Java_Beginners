package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SighUP {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[1]/a")).click();
		driver.findElement(By.id("name")).sendKeys("Nimmi");
		driver.findElement(By.id("email")).sendKeys("nimmi@gmail.com");
		driver.findElement(By.id("contact")).sendKeys("434534534");
		driver.findElement(By.id("address")).sendKeys("Nimmi@123");
		driver.findElement(By.name("gender")).sendKeys("Female");
		driver.findElement(By.name("dob")).sendKeys("02-03-2003");
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();
		
		
		

	}

}
