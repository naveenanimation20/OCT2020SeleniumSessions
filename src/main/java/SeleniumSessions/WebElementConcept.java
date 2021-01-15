package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//get the element (By using any locator) + action(sendkeys, click, get text....)
		
		//1. id: 
//		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("naveenautomation");
//		
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Naveen");
		
//		WebElement domain = driver.findElement(By.id("Form_submitForm_subdomain"));
//		domain.sendKeys("naveenautomation");
//		domain.sendKeys("amazon");
		
		//driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		//By locators: OR
		By domain = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitButton = By.id("Form_submitForm_action_request");
		
//		driver.findElement(domain).sendKeys("naveenautomationlabs");
//		driver.findElement(firstname).sendKeys("naveenautomation");
//		driver.findElement(lastname).sendKeys("labs");
		//driver.findElement(submitButton).click();
		
//		WebElement domain_ele = driver.findElement(domain);
//		WebElement firstname_ele = driver.findElement(firstname);
//		WebElement lastname_ele = driver.findElement(lastname);
//		
//		domain_ele.sendKeys("naveenautomation");
//		firstname_ele.sendKeys("nav");
//		lastname_ele.sendKeys("labs");
		
//		getElement(domain).sendKeys("naveenautomationlabs");
//		getElement(firstname).sendKeys("naveenautomation");
//		getElement(lastname).sendKeys("labs");
		//getElement(submitButton).click();
		
		doSendKeys(domain, "naveenautomationlabs");
		doSendKeys(firstname, "naveenautomation");
		doSendKeys(lastname, "labs");
		doClick(submitButton);

		
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	
	
	
}
