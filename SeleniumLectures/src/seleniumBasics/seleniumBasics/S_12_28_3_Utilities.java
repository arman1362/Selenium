package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_12_28_3_Utilities {

	public static WebDriver driver;

	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	public static void waitUntilElementToBeClickable(WebDriver driver, WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForElement (WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void takeScreenShot(String fileName) throws IOException {
		// we need to create a folder at project level and store the path here so that
		// when even we take screenshots, they are all saved in that specific folder
		String path = ".\\screenshots\\";
		// I create object of the file class
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// After taking the screenshot, take the file and store it in a location in my computer
		// and also I want to provide the file_name and the extension
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}
	
	// JavaScript Executor
		// sometimes, Selenium WebDriver can encounter problems interacting with a few web elements. For instance, 
		// the user opens a URL and there is an unexpected pop-up that will prevent the WebDriver from locating a 
		// specific element and produce inaccurate results. This is where JavascriptExecutor comes into the picture.
	
	// JavaScriptExecutor Methods: 
		// 1- executeAsyncScript: With Asynchronous script, your page renders more quickly. Instead of forcing 
		// users to wait for a script to download before the page renders, this function will execute an asynchronous 
		// piece of JavaScript in the context of the currently selected frame or window in Selenium. 
	
		// 2- executeScript: This method executes JavaScript in the context of the currently selected frame or window 
		// in Selenium. The script used in this method runs in the body of an anonymous function (a function without 
		// a name). We can also pass complicated arguments to it. The script can return values. Data types returned are
			//	Boolean
			//	Long
			//	String
			//	List
			//	WebElement.

	// if the .click() does not work, then we get the help JSExecuter
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// How we can give border to an element on webpage
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid yellow'", element);
	}

	// How we can highlight an element background
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='red'", element);
	}

	// What if we want to do both/above with same method?
	// give border and highlith
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	// How we can scroll down the page with JSExecutor
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// how to sendkeys with JSExecutor
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}
	
	public static void scrollDownBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}
	
	public static void scrollUpBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}

}
