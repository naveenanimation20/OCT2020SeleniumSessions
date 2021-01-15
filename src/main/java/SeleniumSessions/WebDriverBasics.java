package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");

		//Automation Steps + verification point ==> Automation Testing
		//Selenium +         (Java + testNG/Junit + Assertions) 
		//Selenium +         (Python + PyTest)
		//					  (JavaScript + Mocha/Jasmine/Chai )	
		//						(Php + PHPUnit)
		
		//for mac:
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //Launch a browser(Chrome)
		driver.get("http://www.google.com"); //Enter Url
		
		String title = driver.getTitle(); //get the title
		System.out.println("page title is: " + title);
		
		//verification point//checkpoint: (Actual vs Expected Result)
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		driver.close();
		
		System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//NoSuchSessionException: invalid session id
		
	}

}
