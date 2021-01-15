package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		//Explicit wait: WebDriverWait extends FluentWait
		//both classes are implementing Wait interface
		//dynamic wait: 10 secs -- 5 secs -- 5 secs will be ignored
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.dollartree.com/");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("KAYAK"));
		
//		Exception in thread "main" org.openqa.selenium.TimeoutException: Expected 
//		condition failed: waiting for title to contain "My Store". 
//		Current title: "Search Flights, Hotels & Rental Cars | KAYAK" 
//			(tried for 10 second(s) with 500 milliseconds interval)

		//System.out.println(driver.getTitle());
		
		String title = waitForPageTitle("Dollar", 10);
		System.out.println(title);
		
	}
	
	public static String waitForPageTitle(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public static String waitForPageTitleToBe(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	

}
