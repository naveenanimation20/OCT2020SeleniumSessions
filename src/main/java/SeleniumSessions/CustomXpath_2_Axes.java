package SeleniumSessions;

public class CustomXpath_2_Axes {

	public static void main(String[] args) {

		
		//parent to child:
		// (//div[@class='navFooterLinkCol navAccessibility'])[position()=2]//a
		
		//direct child: /
		//all the child : //
		// (//form[@id='hs-login']/button)[1]
		// //form[@id='hs-login']//input
		
		//parent to child:
		//div[@class='input-group']//child::input
		
		//child to parent:
		//backward traversing in xpath:
		//input[@name='username']/../../../../../../..
		//input[@name='username']//parent::div//parent::form
		
		//input[@name='username']//ancestor::form
		
		//preceding-sibling:
		//a[text()='Ali Baba']//parent::td//preceding-sibling::td/input
		//a[text()='Alex DAN']//parent::td//following-sibling::td/a ---6
		//a[text()='Alex DAN']//parent::td//following-sibling::td/a[@context='company'] ---1
		
		
		
		
		
		
		
		
	}

}
