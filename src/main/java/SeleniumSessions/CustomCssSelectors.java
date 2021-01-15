package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelectors {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		

		//id --> #id, tag#id
		//class --> .class, tag.class
		//.c1.c2.c3...cn
		// #input-email
		// input#username
		By.cssSelector("#input-email");
		// .form-control.private-form__control.login-email
		// .login-email
		// input.login-email
		// input.form-control.private-form__control.login-email
		
		// #username.login-email
		// #username.form-control.private-form__control.login-email
		// .form-control.private-form__control.login-email#username
		// .login-email#username
		// input.login-email#username
		
		// tagName[atrr1 = 'value'] --css
		//tagName[@attr1 = 'value'] --xpath
		
		// input[value='Login']
		//input[@value='Login']
		By.cssSelector("input[value='Login']");
		
		// tagName[atrr1 = 'value'][attr2 = 'value']
		// input[value='Login'][type='submit'] --css
		//input[@value='Login' and @type='submit'] --xpath
		// input[value][type='submit']
		// input[value][type]
		
		//input[@value and @type='submit'] --xpath
		//input[@value and @type]
		
		//parent to child:
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper > input#username
		// .private-form__input-wrapper input#username
		// .private-form__input-wrapper #username
		
		// div.private-form__input-wrapper > input
		
		//child to parent:
		//no backward traversing in CSS
		
		//contains:
		// input[id*='user']
		// input[id*=-origin-airport]
		
		//starts-with:
		// input[id^='user']
		
		//ends-with:
		// input[id$='name']
		
		//By.cssSelector("input[id^='user']");
		
		//comma in css:
		
//		By loginPageElement = By.cssSelector("input#input-email, a[href*=forgotten], div#cart");
//		
//		List<WebElement> eleList = driver.findElements(loginPageElement);
//		
//		if(eleList.size() == 4) {
//			System.out.println("My login page is displayed with mandatory elements....");
//		}
		
//		List<WebElement> loginFormEleList = driver.findElements(
//				By.cssSelector("input#username, input#password, "
//						+ "button#loginBtn, span.private-checkbox__icon.private-checkbox__check"));
//		
//		if(loginFormEleList.size() == 4) {
//			System.out.println("My login page is displayed with mandatory elements....");
//
//		}
		
		//following sibling in css:
		// div.private-form__input-wrapper + div
		
		//nth-of-type:
		// ul.footer-nav > li > a
		// ul.footer-nav li a
		//ul[@class='footer-nav']/li/a
		
		// ul.footer-nav li:nth-of-type(3)
		// ul.list-unstyled li:nth-of-type(1)
		// ul.list-unstyled li:nth-of-type(n)
		
		By langLinks = By.cssSelector("ul.list-unstyled li:nth-of-type(n)");
		
		List<WebElement> langList = driver.findElements(langLinks);
		
		for(WebElement e : langList) {
			System.out.println(e.getText());
		}
		
		System.out.println("------");
		
		langList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		
		
	}

}
