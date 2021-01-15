package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScore {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/lanka-premier-league-2020-21-1237339/galle-gladiators-vs-kandy-tuskers-19th-match-1238770/full-scorecard");

//		String wicketTaker = 
//					driver.findElement
//						(By.xpath("//a[text()='Kusal Mendis']//parent::td//following-sibling::td/span"))
//								.getText();
//		
//		System.out.println(wicketTaker);

//		System.out.println(getWicketTakerName("Kusal Mendis"));
//		
//		System.out.println(getWicketTakerName("Brendan Taylor"));

		System.out.println(getScoreList("Kusal Mendis"));
		System.out.println(getScoreList("Brendan Taylor"));

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("//a[text()='" + playerName + "']//parent::td//following-sibling::td/span"))
				.getText();
	}

	public static List<String> getScoreList(String playerName) {
		System.out.println("getting score card for : " + playerName);
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));

		for (int i = 1; i < scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			if(!text.isEmpty()) {
				scoreCardList.add(text);
			}
		}
		
		return scoreCardList;
	}

}
