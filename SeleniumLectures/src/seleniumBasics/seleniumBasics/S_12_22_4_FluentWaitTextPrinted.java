package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class S_12_22_4_FluentWaitTextPrinted {

	public static void main(String[] args) throws InterruptedException {
		
		// Fluent Wait Text Printed

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("The text is not visible or may not exist, check your locator");
		
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='umbraaa blue ']"))); // Element is not clickable off course
		System.out.println(text.getText());


		driver.close();

}
}
