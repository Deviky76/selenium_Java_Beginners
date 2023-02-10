package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Point {

	public static void main(String[] args) 
	{
	
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	   // driver.navigate().to("https://javatpoint.com/selenium-tutorial");
	   // driver.switchTo().frame("frameName");  
	    // Click on the search text box and send value  
	    //driver.findElement(By.name("q")).sendKeys("Javatpoint tutorials");
	    
	    
	    WebElement e =  driver.findElement(By.name("q"));
	    e.sendKeys("javatpoint tutorials"); 

	    e.sendKeys(Keys.ENTER);
	    //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    driver.findElement(By.name("btnK")).click();
	          
	    // Click on the search button  
	    //driver.findElement(By.name("btnK")).click();  
	      

	}

}
