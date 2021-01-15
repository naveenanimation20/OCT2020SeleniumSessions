package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptWebElements {

	static WebDriver driver;
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		By footers = By.cssSelector("ul.footer-nav li a");
		
		List<WebElement> footerList = visibiblityOfAllElements(footers, 10);
		System.out.println(footerList.size());
		
		footerList.stream().forEach(ele -> System.out.println(ele.getText()));
		
//		By username = By.name("username");
//		By password = By.name("password");
//		By loginButton = By.xpath("//input[@value='Login']");
//		
//		waitForElementPresent(username, 10).sendKeys("batchautomation");		
//		driver.findElement(password).sendKeys("Test@12345");
//		driver.findElement(loginButton).click();
//		//e4 e5 e6
				
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * 	An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element, known to be 
	 * present on the DOM of a page, is visible. Visibility means 
	 * that the element is not only displayed but also has 
	 * a height and width that is greater than 0.

	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	/**
	 * An expectation for checking that all elements present on the web page 
	 * that match the locator are visible. 
	 * Visibility means that the elements are not only displayed 
	 * but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return 
	 * @return
	 */
	public static List<WebElement> visibiblityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	

}
