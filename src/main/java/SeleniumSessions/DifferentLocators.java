package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		//1. id: is always unique
		//2. name: is not unique
		//3. className: is not unique
		
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		
		//By.className("form-control private-form__control login-email"); --wrong
		
		//driver.findElement(By.className("form-control private-form__control login-email")); --wrong
		
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test@123");
		
		//4. linkText: only for links
		//driver.findElement(By.linkText("Customers")).click();
		//5. partialLinkText: only for links -- for long link texts 
		//driver.findElement(By.partialLinkText("Cust")).click();
		
		//sign up
		//sign in
		
		//6. xpath: is not an attribute. its a locator -- address of the element in DOM
		// //*[@id="Form_submitForm_subdomain"]
//		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_subdomain\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("testing");
		
		//7. cssSelector: is not an attribute. its a locator
		//driver.findElement(By.cssSelector("#Form_submitForm_subdomain")).sendKeys("test@gmail.com");
		
		//8. tagName: 
		String h2Text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2Text);
		
		
	}

}
