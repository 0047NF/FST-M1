import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
	    
		driver.get("https://training-support.net");
		
		System.out.println("This is the title of page" + driver.getTitle());
	   
	    driver.quit();
	}

}
