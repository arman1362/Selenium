package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class S_12_22_3_FluentWaitNoTextPrinted {

	public static void main(String[] args) throws InterruptedException {
		
		// Fluent Wait No Text Printed

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		fluentWait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());


		driver.close();
	}

}
