package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class S_12_22_2_FluentWait {

	public static void main(String[] args) throws InterruptedException {
		
		// Fluent Wait

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))
				.withMessage("Check your locator for this element");
		
		//When we tried to get that text and printed, it didn't work
		//because the element we were trying to locate was an AJAX element, and it is
		//not loaded with the rest of the page
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		//example for when we want to print the message if element is not found
//		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbrawww blue ']")));
		//because it is the right xpath, it will find the element and print the element text for us
		fluentWait.until(ExpectedConditions.visibilityOf(text));
				
		System.out.println(text.getText());
		driver.close();
	}

}
