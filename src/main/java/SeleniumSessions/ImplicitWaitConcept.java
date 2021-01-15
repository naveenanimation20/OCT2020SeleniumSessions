package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		//two types of wait:
		//1. static wait: Thread.sleep(10000);
		//2. dynamic wait: 
			//a. implicitly wait
			//b. explicit wait
					//b.1 : WebDriverWait
					//b.2: FluentWait
		
		
		//a. implicitly wait : dynamic wait -- global wait
		//it will be applied on all the elements by default 
		//When you create your element with FE and FEs --imp wait will be applied by default
		//default value of imp wait: 0 sec
		//if element is not within the given time: it will throw NoSuchElementException
		//it will be applied for webelements not for non web elements: title, url, alerts
		//default polling time : 500 ms
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://classic.crmpro.com/");
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");

		
		WebElement u1 = driver.findElement(username);//10
		u1.sendKeys("batchautomation");
		
		WebElement p1 = driver.findElement(password);//10
		p1.sendKeys("Test@12345");
		
		WebElement lg = driver.findElement(login);//10
		lg.click();
		
		//home page:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//e4 e5 
		
		//deals page:
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//e6 e7 e8
		
		//home Page:
		
		//reg page:
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e e e e e e
		
		//deals page:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		
		
	}

}
