package seleniumBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_12_22_7_ActionsClassSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		// Actions Class Send Keys

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions hover = new Actions (driver);
		WebElement amzSearch = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		
		hover.sendKeys(amzSearch,"iPhone 13 Pro").perform(); // or
		// amzSearch.sendKeys("iPhone 13 Pro");
		hover.click(searchButton).perform(); // or
		// searchButton.click();
		
		//the above method from actions class work the same way as sendKeys method below,
		//but it is just for situations where sendKeys method alone may not work
		
		Thread.sleep(6000);
		driver.close();
}
}
