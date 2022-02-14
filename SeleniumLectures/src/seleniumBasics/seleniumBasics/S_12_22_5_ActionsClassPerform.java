package seleniumBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_12_22_5_ActionsClassPerform {

	public static void main(String[] args) throws InterruptedException {
		
		// Actions Class Perform()

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions action = new Actions(driver);
		
		// this will basically hover the mouse on the element rather clicking on it
		action.moveToElement(electronics).perform(); 
		
		Thread.sleep(6000);
		driver.close();
}
}
