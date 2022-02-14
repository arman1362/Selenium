package seleniumBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_12_22_9_ActionsClassPressShiftAndClick {

	public static void main(String[] args) throws InterruptedException {
		
		// Actions Class Press Shift and Send Text

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions hover = new Actions (driver);
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		hover.moveToElement(searchBar)
		.keyDown(searchBar, Keys.SHIFT)
		.sendKeys(searchBar, "selenium")
		.keyUp(searchBar, Keys.SHIFT)
		.click (searchButton)
		.build().perform();

		Thread.sleep(6000);
		driver.close();
}
}
