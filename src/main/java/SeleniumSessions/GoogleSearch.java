package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

		Thread.sleep(3000);

		By search = By.name("q");
		By suggesionList = By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span");

		driver.findElement(search).sendKeys("naveen automation");
		Thread.sleep(3000);

		selectFromSuggestList(suggesionList, "naveen automation labs cucumber");

	}

	public static void selectFromSuggestList(By suggestionList, String value) {

		List<WebElement> resultList = driver.findElements(suggestionList);

		System.out.println(resultList.size());

		for (WebElement e : resultList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
