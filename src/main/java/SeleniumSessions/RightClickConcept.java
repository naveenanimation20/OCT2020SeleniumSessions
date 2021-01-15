package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClick = By.xpath("//span[text()='right click me']");
		By rightClickOptions = By.xpath("//ul/li[contains(@class,'context-menu-icon')]");

		//WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		List<String> optionsList = getRightClickMenuList(rightClick, rightClickOptions);
		System.out.println("count is: " + optionsList.size());
		System.out.println(optionsList);

		rightClickOption(rightClick, rightClickOptions, "Paste");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getRightClickMenuList(By rightCickLocator, By listLocator) {

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightCickLocator)).perform();

		List<String> rightClickList = new ArrayList<String>();
		List<WebElement> menuList = driver.findElements(listLocator);

		System.out.println(menuList.size());

		for (WebElement e : menuList) {
			String text = e.getText();
			rightClickList.add(text);
		}
		return rightClickList;
	}

	public static void rightClickOption(By rightCickLocator, By listLocator, String value) {

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightCickLocator)).perform();

		List<WebElement> menuList = driver.findElements(listLocator);

		System.out.println(menuList.size());// 6

		for (WebElement e : menuList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
