package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {

		String browser = "chrome";
		WebDriver driver = null;

		if (browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}
		
		else {
			System.out.println("Please pass the correct browser "+ browser);
		}

		driver.get("http://www.google.com"); // Enter Url

		String title = driver.getTitle(); // get the title
		System.out.println("page title is: " + title);

		// verification point//checkpoint: (Actual vs Expected Result)
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

		driver.close();

	}

}
