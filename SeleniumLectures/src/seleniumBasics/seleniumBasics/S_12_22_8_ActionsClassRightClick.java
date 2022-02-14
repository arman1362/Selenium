package seleniumBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_12_22_8_ActionsClassRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		// Actions Class Right Click

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement AmazonBasics = driver.findElement(By.linkText("Amazon Basics"));
		Actions action = new Actions(driver);
		action.contextClick(AmazonBasics).perform();
		
		Thread.sleep(6000);
		driver.close();
}
}
