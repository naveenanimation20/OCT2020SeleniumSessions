package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicCrmLoginPage {

	public static void main(String[] args) {

		By username = By.name("username");
		By passowrd = By.name("password");
		By loginButton = By.xpath("//*[@id=\"loginForm\"]/div/div/input");

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver("firefox");
		
		df.launchUrl("http://classic.crmpro.com/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(username, "batchautomation");
		eleUtil.doSendKeys(passowrd, "Selenium@12345");
		eleUtil.doClick(loginButton);
		
		df.quitBrowser();
		
		
	}

}
