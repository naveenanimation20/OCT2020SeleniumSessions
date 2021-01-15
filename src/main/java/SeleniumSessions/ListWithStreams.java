package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industryOptions = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		List<WebElement> indusList = driver.findElements(industryOptions);
		
		System.out.println(indusList.size());
		
		long stTime = System.currentTimeMillis();
		
		//1. sequential stream://265 ms
		//indusList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		//2. parallel stream://245 ms
		indusList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("total time taken: " + (endTime-stTime)); 

		
	}

}
