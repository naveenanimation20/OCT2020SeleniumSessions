package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

//		WebElement industry_ele = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement country_ele = driver.findElement(By.id("Form_submitForm_Country"));

//		Select select1 = new Select(industry_ele);
//		//select.selectByIndex(5);
//		select1.selectByVisibleText("Electronics");
//		//select.selectByValue("health");
//		
//		Select select2 = new Select(country_ele);
//		select2.selectByVisibleText("India");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

//		doSelectDropDownVisibleText(industry, "Education");
//		doSelectDropDownVisibleText(country, "India");

		selectValue(country, DropDown.INDEX.toString(), "5");
		selectValue(industry, DropDown.VISBLETEXT.toString(), "Electronics");
		selectValue(industry, DropDown.VALUE.toString(), "Education");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectValue(By locator, String type, String value) {
		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		case "value":
			select.selectByValue(value);
			break;

		default:
			break;
		}

	}

	public static void doSelectDropDownVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
