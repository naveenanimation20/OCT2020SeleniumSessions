package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

//		Select select = new Select(driver.findElement(industry));
//
//		List<WebElement> indus_options_list = select.getOptions();
//
//		System.out.println(indus_options_list.size());
//
//		for (WebElement e : indus_options_list) {
//
//			System.out.println(e.getText());
//
//			if (e.getText().equals("Education")) {
//				e.click();
//				break;
//			}
//		}
		
		List<String> indus_list = getOptionsTextList(industry);
		System.out.println(indus_list);
		
		System.out.println("------");
		
		List<String> country_list = getOptionsTextList(country);
		System.out.println(country_list);

	}

	// function that takes the By locator and returns the list of text of each
	// option in the list:

	public static List<String> getOptionsTextList(By locator) {

		List<String> optionsTextList = new ArrayList<>();
		
		Select select = new Select(driver.findElement(locator));
		List<WebElement> options_list = select.getOptions();

		for (WebElement e : options_list) {
			String text = e.getText();
			System.out.println(text);

			optionsTextList.add(text);

		}

		return optionsTextList;
	}

}
