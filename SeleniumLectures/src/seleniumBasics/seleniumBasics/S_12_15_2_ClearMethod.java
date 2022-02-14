package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_15_2_ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// Clear Method
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.id("email"));
		
		userName.sendKeys("email@email.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("123456");
		
		Thread.sleep(6000);
		
		userName.clear();
		
		password.clear();
		
		Thread.sleep(6000);
		
		driver.close();
		
		
	}

}
