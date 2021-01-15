package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KayakFlight {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
//		driver.manage().deleteAllCookies();
//	    driver.get("chrome://settings/clearBrowserData");
//	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

		ChromeOptions co = new ChromeOptions();
		co.merge(capabilities);
		
		WebDriver driver = new ChromeDriver(co);

	    
		driver.get("https://www.kayak.co.in/flights");

		Thread.sleep(4000);

		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//div[contains(@id,'-origin-col')]")))
		.build().perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("//input[contains(@id,'-origin-airport')]")))
				.sendKeys("Bengaluru, India").build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//ul[@class='flight-smarty']/li/div[@class='item-info']")))
				.click().build().perform();
		Thread.sleep(2000);

		// to
		act.click(driver.findElement(By.xpath("//div[contains(@id,'-dest-col')]")))
		.build().perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("//input[contains(@id,'-destination-airport')]")))
		.sendKeys("Munich, Germany").build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//ul[@class='flight-smarty']/li/div[@class='item-info']")))
		.click().build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@id,'-submit')]")).click();
		
		
		String text = driver.findElement
				(By.xpath("//div[@class='progress-bar ']//div[contains(@id, '-bar')]"))
					.getAttribute("style");
		while(!text.contains("100%")) {
			text = driver.findElement
					(By.xpath("//div[@class='progress-bar ']//div[contains(@id, '-bar')]"))
						.getAttribute("style");
			System.out.println(text);
			

		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement close = wait.until(ExpectedConditions.
				elementToBeClickable(By.xpath("(//button[contains(@id,'-dialog-close')])[last()]")));
		act.moveToElement(close).click().build().perform();
		
		
		

	}

}
