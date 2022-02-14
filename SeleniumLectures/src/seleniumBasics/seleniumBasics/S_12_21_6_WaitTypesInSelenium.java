package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_21_6_WaitTypesInSelenium {

	public static void main(String[] args) throws InterruptedException {

		// Wait types in Selenium
		// https://www.guru99.com/implicit-explicit-waits-selenium.html

		// 1- Dynamic wait = soft wait

			// a- implicit wait:

				// The Implicit Wait in Selenium is used to tell the web driver to wait for a
				// certain amount of time before it throws a “No Such Element Exception”. The
				// default setting is 0. Once we set the time, the web driver will wait for the
				// element for that time before throwing an exception.
			 	// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

			// b- Explicit wait:
				// The Explicit Wait in Selenium is used to tell the Web Driver to wait for 
				// certain conditions (Expected Conditions) or maximum time exceeded before 
				// throwing “ElementNotVisibleException” exception. It is an intelligent 
				// kind of wait, but it can be applied only for specified elements. 
				// It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.
				// WebDriverWait wait=new WebDriverWait(driver, 20);
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
				// guru99seleniumlink.click();
		
			// c- Fluent wait:
		
				// The Fluent Wait in Selenium is used to define maximum time for the web driver 
				// to wait for a condition, as well as the frequency with which we want to check 
				// the condition before throwing an “ElementNotVisibleException” exception. 
				// It checks for the web element at regular intervals until the object is found
				// or timeout happens. 
				// Frequency: Setting up a repeat cycle with the time frame to verify/check the 
				// condition at the regular interval of time.
		
		// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				// .withTimeout(30, TimeUnit.SECONDS) 			
				// .pollingEvery(5, TimeUnit.SECONDS) 			
				// .ignoring(NoSuchElementException.class);
		
		// Frequency is set to 5 seconds and the maximum time is set to 30 seconds. 
		// Thus this means that it will check for the element on the web page at every 
		// 5 seconds for the maximum time of 30 seconds. If the element is located within
		// this time frame it will perform the operations else it will throw an” ElementNotVisibleException”
		
		// 2- Static wait = hard wait
		   // Thread.sleep(6000); not recommended
		
		// 3- pageLoadTimeout:
		
			// It is focused on the time a webpage needs to be loaded – the pageLoadTimeout 
			// limits the time that the script allots for a web page to be displayed. 
			// If the page loads within the time then the script continues. If the page 
			// does not load within the timeout the script will be stopped by a TimeoutException.
			// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// wait 20 seconds for the page to load before you throw an exception if you can
		// not execute my first command.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// wait 20 seconds for any command that I give, for the whole execution of my
		// test when browser is open, before you throw an exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://tek-school.com/retail//");

		driver.findElement(By.xpath("//span[text()='My Account']"));

		Thread.sleep(6000);

		driver.close();
	}

}
