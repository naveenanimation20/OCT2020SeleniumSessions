package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		// go to amazon.in
		// get the total links
		// print the text of each link but ignore the blank text
		// print the href(url) prop for each link

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

//		for(WebElement e : linksList) {
//			String linkText = e.getText();
//			System.out.println(linkText);
//		}

		for (int i = 0; i < linksList.size(); i++) {

			String linkText = linksList.get(i).getText();

			if (!linkText.isEmpty()) {
				System.out.println(i + ":-->" + linkText);
				String hrefVal = linksList.get(i).getAttribute("href");
				System.out.println(hrefVal);
			}

		}

	}

}
