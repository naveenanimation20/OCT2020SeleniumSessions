package SeleniumSessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		// go to amazon.in
		// get the total images with img tag
		// print the src(url) prop for each image

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		
		System.out.println("total images: " + imgList.size());
		
		for(int i=0; i<imgList.size(); i++) {
			String srcUrl = imgList.get(i).getAttribute("src");
			String altValue = imgList.get(i).getAttribute("alt");

			System.out.println(srcUrl);
			System.out.println(altValue);
		}

	}

}
