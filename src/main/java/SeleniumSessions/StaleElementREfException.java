package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementREfException {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		WebElement ele = driver.findElement(By.name("username"));
		
		ele.sendKeys("naveen");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		//ele = driver.findElement(By.name("username"));
		ele.sendKeys("naveen");
		//StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document (DOM)


		
	}

}
