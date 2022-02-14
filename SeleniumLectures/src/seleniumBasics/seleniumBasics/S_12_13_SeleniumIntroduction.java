package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_13_SeleniumIntroduction {

	public static void main(String[] args) {

		// 1- Have or install Chrome on computer, download Chrome driver
		// 2- If you get the error "SLF4J: Failed to load class
		// "org.slf4j.impl.StaticLoggerBinder", then download and
		// import the following file
		// http://www.java2s.com/Code/Jar/s/Downloadslf4jsimple161jar.htm
		// to this address
		// go to SeleniumLecture/BuilDPath/ConfigureBuildPath/Librarries/ Add External JARs

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Arman\\eclipse-workspace\\SeleniumLectures\\drivers\\chromedriver.exe");
		
		// alternative and better option:
		
		// System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe"); 
		
		// we need to create reference to webdriver

		// ChromeDriver driver = new ChromeDriver ();

		WebDriver driver = new ChromeDriver(); // upcasting idea

		// we can use .get(); method to provide the URL for the web browser and launch our browser
		
		driver.get("https://facebook.com/");

		// public interface WebDriver extends SearchContext

		// WebDriver is a remote control interface that enables introspection and
		// control of user agents (browsers). 
		
		// The methods in this interface fall into three categories:
		// Control of the browser itself
		// Selection of WebElements
		// Debugging aids

		System.out.println("Title: " + driver.getTitle ());
		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Page Source Code: " + driver.getPageSource());
		
		// driver.close method will close the the current browser opened by Selenium
		// driver.quit method will close all of the browsers opened by Selenium
	
		// driver.close ();
		// driver.quit();
		
	}

}
