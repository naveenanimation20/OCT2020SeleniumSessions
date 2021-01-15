package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://classic.crmpro.com/");
		By username = By.name("username111");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.retryingElement(username).sendKeys("batchautomation");
		eleUtil.doSendKeys(password, "Test@12345");
		eleUtil.doClick(login);
		
		
		
		
	}

}
