package seleniumBasics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S_12_28_2_JavascriptExecutorMethods extends S_12_28_3_Utilities {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		compareText ("Truth", "Fact" + ": ");

		launchChrome("https://www.amazon.com/");

		WebElement bestSeller = driver.findElement(By.linkText("Best Sellers"));
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		sendKeys(textBox, "iPad Pro 11 Inch");
		highlightelementRedBorder(bestSeller);
		highlightelementBackground(bestSeller);
		// highlightelementBorderAndBackground(bestSeller);
		
		takeScreenShot("AmazonHomePage1");
		
		Thread.sleep(3000);
		
		clickWithJSE(bestSeller);
		scrolldownPage();
		takeScreenShot("AmazonHomePage2");

		// Calling FluentWait method
		driver.navigate().to("https://facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		waitUntilElementToBeClickable(driver, email);  //FluentWait
		email.click();
		email.sendKeys("email@email.com");
		
		S_12_28_3_Utilities.waitForElement (email, 30);
		
		Thread.sleep(6000);
		driver.close();
	}
}