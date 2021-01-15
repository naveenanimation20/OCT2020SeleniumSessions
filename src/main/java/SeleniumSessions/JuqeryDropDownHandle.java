package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JuqeryDropDownHandle {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(2000);

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// 1. single selection
		//selectChoiceFromDropDown(choices, "choice 1");

		// 2. multi selection
		//selectChoiceFromDropDown(choices, "choice 2", "choice 6", "choice 6 2 3", "choice 7");

		// 3. All selection:
		selectChoiceFromDropDown(choices, "ALL");

	}

	/**
	 * Pass the single String value for single selection,
	 * Pass the multiple String values for multiple selection,
	 * Pass "ALL" for all selection values from dropdown
	 * @param choices
	 * @param value
	 */
	public static void selectChoiceFromDropDown(By choices, String... value) {

		List<WebElement> choiceList = driver.findElements(choices);

		if (!value[0].equalsIgnoreCase("All")) {

			for (int i = 0; i < choiceList.size(); i++) {

				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}

		}

		// select all the values:
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {
				//System.out.println("element is not found....");
			}
		}
	}

}
