package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_15_1_LocatorsinSelenium {

	public static void main(String[] args) {
		
		// Locators in Selenium
		
			// 1-Id 2-Name 3-className 4-tagName 5-xpath 6-cssSelector 7-linkText 8-partialLinkText
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");
		
		//driver.findElement(By.className("hm-icon-label")).click();
		
		//driver.findElement(By.id("glow-ingress-line2")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[9]")).click(); // right click on an element and select copy xpath and then put inside the expression
		
		// className is not preferred, ID is preferred, if ID is there we dont go for other attributes. otherwise we have to try them.
		
		// the fastest selector is CSS selector. Compared to css selector, xpath is slower identifying elements on the webpage
		// cssValue is not used at work that much
		
		// when we execute the code, we can execute it on a browser or we can execute it on a headless browser.
		
		// xpath is a language which we can use to locate elements in an XML document or DOM on a web page.
		// There are two types of xpaths:
			// 1- absolute xpath; one forward slash is never recommended
			// 2- relative xpath; two forward slash //tagName[@attribute='value']
													//tagName[text()='Create new account']
		
		// Parent to Child
			//tageName[@attribute=’attribute_value’]//child::tageNameForTheChild
			//select[@id='month']//child::option[6]
			//select[@id='month']//child::option[@value='6']
		
		// Child to Parent
			//tageName[@attribute=’attribute_value’]//parent::tageNameForTheChild
			//option[@value='3']//parent::select[@id='month']
			//option[@value='2018']//parent::select
		
		// button[text()='Log In']
		
	}
}
