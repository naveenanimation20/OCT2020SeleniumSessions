package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");

		//String text = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(text);

		//get the text of all h3 htmal tags:
		List<WebElement> h3List = driver.findElements(By.tagName("h3"));
		
		System.out.println("total number of h3 tags: " + h3List.size());
		
		//1. normal for loop:
		for(int i=0; i<h3List.size(); i++) {
			String text = h3List.get(i).getText();
			System.out.println(text);
		}
		
		System.out.println("-------");
		
		//2. for each loop:
		
		for(WebElement e : h3List) {
			System.out.println(e.getText());
		}

	}

}
