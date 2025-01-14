package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","C:\\Users\\0047NF744\\Downloads\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
