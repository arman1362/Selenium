package seleniumBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_14_LocatorsinSelenium {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().window().maximize();

		driver.get("https://ww.facebook.com");
		
		Thread.sleep(3000);
		// static wait /hard wait Thread.sleep (3000); every second is 1000
		// We dont use static wait in automation often. We use it only if we want to debug our code.
		
		driver.navigate().to("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		// dynamic wait is not the hard wait. that means if we dont need the wait time
		// then the system will ignore the remaining wait if the action can be performed.

		// pageLoadTimeout; the reason we get the strikethrough warning is that because
			// we use Selenium4. In Selenium 4, the TimeUnit.Seconds is deprecated and we
			// need to use the one recommended by Selenium 4.

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); // Old method in Selenium 3
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5)); // new method in Selenium 4
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Old method in Selenium 3
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // new method in Selenium 4

		// DOM is document Object Model
		
		driver.findElement(By.name("email")).sendKeys("email@email.com");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText(" for a celebrity, brand or business.")).click();
		
		driver.findElement(By.partialLinkText(" for a celebrity")).click();
		
		WebElement textCelebrity = driver.findElement(By.tagName("a"));
		
		String printText = textCelebrity.getText();
		
		System.out.println(printText);
		
		driver.navigate().to("https://www.bankofamerica.com/");
		
		driver.findElement(By.cssSelector("#NAV_BUSINESS_INSTITUTIONS")).click();
		
		driver.findElement(By.id("footer_bofa_careers")).click();
		
		
		
		driver.close();

	}

}
