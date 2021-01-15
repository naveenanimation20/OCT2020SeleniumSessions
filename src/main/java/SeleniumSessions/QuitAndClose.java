package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //Launch a browser(Chrome)
		driver.get("http://www.google.com"); //Enter Url
		
		String title = driver.getTitle(); //get the title
		System.out.println("page title is: " + title);
		
		//driver.quit();//close the browser
		
		driver.close();//close the browser
		
		System.out.println(driver.getTitle());
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		
	}

}
