package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_OrangeHRM_Capture_EMP_id {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		/* To capture the value present in the text box using : getAttribute()
		
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empid);
		
		*/
		WebElement empno_element = driver.findElement(By.id("employeeId"));
		
		empno_element.clear();
		empno_element.sendKeys("1122");
		
		
		
	}

}
