package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		//xpath: address of the element inside the DOM
		//two types:
		//1. absolute xpath : complete path of the element inside the DOM (not recommended)
		// /html/body/header/div/div/div[2]/div/input
		// its risky, it might get changed
		// /html/body/header/div/div/div/div[2]/div/input
		
		
		//2. relative xpath: xpath with some attributes or functions
		//custom xpath
		
		//tagname[@attr = 'value'] -- 1 of 1 , 1 of n
		//input[@id='input-email'] --1
		//input[@id] --2
		
		//input[@name='email']
		//input[@type='text']
		
		//tagname[@attr1 = 'value' and @attr1 = 'value']
		//input[@id='input-email' and @type='text' and @name='email']
		
		//input[@id and @type and @name]
		//input[@id='input-email' and @type and @name]
		
		//input[@type='submit' and @value='Login']
		
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		
		By.className("form-control private-form__control login-email"); //-- wrong
		By.xpath("//input[@class='form-control private-form__control login-email']"); //-right
		
		//text(): any element having the text: link, span, h1,h2,h3, label, div
		//tagname[text()='value']
		//h3[text()='Marketing Campaigns']
		//a[text()='Solutions']
		
		//xpath with attr and text:
		//tagname[@attr='value' and text()='value']
		//tagname[text()='value' and @attr='value']

		//span[@class='description js-validator' and text()='Pick a username for OrangeHRM trial.']
		//span[text()='Pick a username for OrangeHRM trial.' and @class='description js-validator']
		//span[@class='description js-validator']
		
		//index:
		//input[@type='text'] ---6
		
		//position() and last()
		// (//input[@type='text'])[1]
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[position()=1]
		
		// (//input[@class='form-control'])[last()]
		// (//input[@type='text'])[last()]
		By fn = By.xpath("(//input[@type='text'])[1]");
		
		//contains(): is used for dynamic attributes
		//tagname[contains(@attr, 'value')]
		//input[contains(@name, 'search')]
		//input[contains(@name, 'se')]
		//a[contains(text(),'Fresh')]
		//h3[contains(text(), 'Management')]
		//small[contains(text(), 'pulse')]
		
		String deal_text = driver.findElement(By.xpath("//small[contains(text(), 'pulse')]")).getText();
		System.out.println(deal_text);
		
		//dynamic ID: ext JS
//		< input id = '123_firstname'>
//		<id = '333_firstname'>
//		<id = '121_firstname'>
		
		//input[contains(@id, '_firstname')]
		
		// MoEV-origin-airport
		// c-aF0-origin-airport
		//input[contains(@id, '-origin-airport')]
		
//		c1y_n-submit
//		AcRp-submit
//		c-aF0-submit
		
		//input[contains(@id,'value') and text()='value']
		//a[contains(@href, 'login') and text()='Forgot Password?']
		//a[contains(@href, 'login') and contains(text(),'Forgot')]

		//starts-with:
		//input[starts-with(@name,'user')]
		
		
		
		
		
		
	}

}
