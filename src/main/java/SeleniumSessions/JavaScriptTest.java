package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		//Thread.sleep(5000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		if(pageText.contains("Marketing Campaigns")) {
//			System.out.println("PASS");
//		}
		
		//jsUtil.refreshBrowserByJS();
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		
		//jsUtil.drawBorder(loginButton);
		
//		jsUtil.flash(username);
		//username.sendKeys("batchautomation");
//		jsUtil.flash(password);
		//password.sendKeys("Test@12345");
//		jsUtil.flash(loginButton);
//		loginButton.click();
		
		//jsUtil.generateAlert("this is my JS POP UP");
		//System.out.println(jsUtil.getBrowserInfo());
		
//		WebElement trackOrders = driver.findElement(By.xpath("//span[text()='Track Orders']"));
//		
//		jsUtil.clickElementByJS(trackOrders);
		
//		jsUtil.scrollPageDown();
//		
//		Thread.sleep(2000);
//		
//		jsUtil.scrollPageUp();
		
		WebElement fwdPwd = driver.findElement(By.linkText("Forgot Password?"));
		
		jsUtil.scrollIntoView(fwdPwd);
		
		
	}

}
