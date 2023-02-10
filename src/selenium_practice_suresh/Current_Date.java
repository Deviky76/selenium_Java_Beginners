package selenium_practice_suresh;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Current_Date {

	public static void main(String[] args) 
	{
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  

	}

}
