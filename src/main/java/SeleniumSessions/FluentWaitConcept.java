package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		// WebDriverWait(c) --> ex--> FluentWait (c) ---> imp --> Wait (I)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		By username = By.name("username111");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		
		Wait<WebDriver> wait  = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class)
									.ignoring(StaleElementReferenceException.class);
									
									
		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("naveen");
		
	}

}
