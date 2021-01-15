package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langList.size());
		
		for(WebElement e : langList) {
			System.out.println(e.getText());
		}
		
	}
	
	//function: which will return : the list of lang links text
	//function: which will return : the String array of links text []
	//function: which will return : the list of footer links text
	//on https://www.freshworks.com/ -- return the list of all footer links text


}
