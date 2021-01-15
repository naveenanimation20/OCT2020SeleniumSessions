package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsGenericMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");

		
		int totalLinks = getElements(links).size();
		System.out.println(totalLinks);
		
		int totalImages = getElements(images).size();
		System.out.println(totalImages);

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	

}
