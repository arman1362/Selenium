package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_21_3_HandlingAlertsWithText {

	public static void main(String[] args) throws InterruptedException {
		
		// Handling Alerts with Slenium (with Text)

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// An Alert in Selenium is a small message box which appears on screen to give
		// the user some information or notification. It notifies the user with some
		// specific information or error, asks for permission to perform certain tasks
		// and it also provides warning messages as well.
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        
		WebElement frame = driver.findElement(By.id("iframeResult"));
        
		driver.switchTo().frame(frame);
        
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
		//we are sending text to the alert pop up
        driver.switchTo().alert().sendKeys("Arman Hussaini");
        
        //we can accept
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        // we can reject
//      driver.switchTo().alert().dismiss();
        
        Thread.sleep(6000);
        driver.close();
	}

}
