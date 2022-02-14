package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_12_22_1_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		// Explicit Wait

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());
		
		Thread.sleep(6000);
		driver.close();
	}

}
