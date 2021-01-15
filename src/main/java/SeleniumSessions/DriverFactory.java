package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private WebDriver driver;

	/**
	 * This method is used to initializing the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this return WebDriver driver
	 */
	public WebDriver init_driver(String browserName) {

		System.out.println("browser name is : " + browserName);

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browser name " + browserName);
		}

		return driver;

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public String doGetPageTitle() {
		return driver.getTitle();
	}

	public String doGetPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
