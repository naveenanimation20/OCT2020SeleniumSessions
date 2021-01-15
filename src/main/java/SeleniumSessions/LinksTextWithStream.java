package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextWithStream {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		long stTime = System.currentTimeMillis();

		//seq: 5407 ms 5893 ms  5994 ms 6077 ms
		//linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		//parallel: 5589 ms 5627ms  5250ms 6095 ms
		linksList.parallelStream().forEach(ele -> System.out.println(ele.getText()));		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("total time taken: " + (endTime-stTime)); 

		
		
	}

}
