package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By loginLink = By.linkText("Login");
		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(driver.findElement(firstname), "naveen").perform();
//		action.sendKeys(driver.findElement(lastname), "automation").perform();
//		
//		action.click(driver.findElement(loginLink)).perform();
		
		doActionsSendKeys(firstname, "naveen");
		doActionsSendKeys(lastname, "automqtion");
		doActionsClick(loginLink);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}

}
