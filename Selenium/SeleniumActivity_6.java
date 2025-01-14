import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity_6 {

	public static void main(String[] args) {
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("This is the title" + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        driver.quit();
	}
}


