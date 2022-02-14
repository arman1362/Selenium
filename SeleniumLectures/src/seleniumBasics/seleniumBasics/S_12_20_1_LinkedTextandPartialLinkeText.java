package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_20_1_LinkedTextandPartialLinkeText {
	
	public static void main(String[] args) throws InterruptedException {
		
	// LinkedText and Partial LinkedText
	
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); // upcasting idea
	
	driver.manage().window().maximize();

	driver.get("https://www.amazon.com");
	
	// driver.findElement(By.linkText("Amazon Basics")).click();
	
	driver.findElement(By.partialLinkText("Basics")).click();
	
	driver.get("https://facebook.com");
	
	// first go by ID, then class, and finally by CSS selector
	// if the class name contains "@" and "^" and space then dont use it
	// if the tagname is unique like h2 below then we can use it as an element
	WebElement findh2 = driver.findElement(By.tagName("h2"));
	System.out.println(findh2.getText());
	
	driver.get("https://amazon.com");
	
	// xpath: starts-with and ends-with
		// 	value = email or phone-number
		//	input[@name=’value’]
		//	input[@id=’value’]
	
	// Sometime part of the value may change. For example: first time when we launch the browser,
	// the value for attribute name is email and the second time the attribute for name is email42568GHCBVU.
	
	//input[starts-with(@name,’value’)]
		// Original xpath = //span[@class='hm-icon-label']
		// Xpath with starts-with = //span[starts-with(@class,'hm')]
	
	// When we want to use the ends-with xpath, the website has to use xpath version 2.0. if not, ends-with
	// xpath will not work. And we have to come up with other ways to locate that element.
	// But start-with works with both xpath 1.0 version and xpath 2.0 verison.
	
	// Ends-with example:
		// Original = //span[@class='hm-icon-label']
		// Ends-with = //span[ends-with(@class,'label')]
	
	// cssSelector:
		//	We can also use css selector to locate element on the browser
		//	And also css select is a bit faster than xpath
		//	But, there are some cons with it comes to css selector:
	
		//	1. 	When we write css selector, we have less options when we are traversing through
		//		elements in the DOM, With xpath, we can go from child to parent and from parent
		//		to child, but will css selector, we can only go from parent to child.
		//	2.	The css selector was more useful for internet explorer browser, but now since
		//		internet explorer is deprecated and not used or updated anymore, better to use
		//		xpath and other method to locate elements.
	
		//	3.  Then why should we know about css selector, mainly for interview purposes and
		//		also just because xpath has more advantages, doesn’t mean we will never use css
		//		selector. To locate some elements, we have use only css selector to locate the
		//		element.
	
	// With ID:
		// Xpath = //input[@id='email']
		// Css selector = input[id=’email’] also input#email
	
	// With Class:
		// Xpath = //span[@class='hm-icon-label']
		// Css selector = span[class='hm-icon-label'] also span.hm-icon-label
	
	// Shortening the expressions
	
		// (^) = signify’s the prefix of the text
			// Original = input[name=firstname]
			// With prefix = input[name^=first]
		
		// ($) = signify’s the suffix of the text
			// Original = input[name=reg_email__]
			// With suffix = input[name$=email__]
	
		// (*) = signify’s the sub-string
				// Original = input[name=reg_passwd__]
				// With sub-string = input[name*=g_pass]
	
	}
}
