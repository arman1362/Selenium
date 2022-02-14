package seleniumBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_12_22_6_ActionsClassBuildPerform {

	public static void main(String[] args) throws InterruptedException {
		
		// Actions Class Composit Action build ().perform()

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement career = driver.findElement(By.linkText("Careers"));
		
		Actions action = new Actions(driver);

		//Three ways to call the actions from action class: 
			//1
		action.moveToElement(career).perform();
		action.click(career).perform();
		
			//2
				//	action.moveToElement(career).click(career).build().perform();
		
			//3
				//	action.moveToElement(career)
				//	.click(career)
				//	.build().perform();
		
		Thread.sleep(6000);
		driver.close();
}
}
