package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_21_5_HandlingAlertsRequiresAuthentication {

	public static void main(String[] args) throws InterruptedException {
		
		// Handling Alerts with Slenium (Requires Authentication)

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// An Alert in Selenium is a small message box which appears on screen to give
		// the user some information or notification. It notifies the user with some
		// specific information or error, asks for permission to perform certain tasks
		// and it also provides warning messages as well.
		
		driver.get("http://the-internet.herokuapp.com/basic_auth"); // Original URL
		
		Thread.sleep(6000);
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); // Username and password is hardcoded
        
        Thread.sleep(6000);
        driver.close();
	}

}
