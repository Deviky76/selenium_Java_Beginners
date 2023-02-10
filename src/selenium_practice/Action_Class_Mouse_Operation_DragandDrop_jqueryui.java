//Script to handle iframe and also mouse Drag and Drop operation

package selenium_practice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Mouse_Operation_DragandDrop_jqueryui {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//Script to handle iframe and also mouse Drag and Drop operation
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement srcelement, trgelement;
		srcelement= driver.findElement(By.id("draggable"));
		trgelement =driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.findElement(By.linkText("Demos")).click();
		

	}

}
