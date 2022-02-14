package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_21_2_HandlingAlertsOkorCancelButtons {

	public static void main(String[] args) throws InterruptedException {
		
		// Handling Alerts with Slenium (OK or Cancel Buttons)
		
		// How to handle frame in selenium?
				// If we want to interact with an element that is inside a frame, before any action we have to first
				// go to that frame and then interact with the element. Because the element we want to click on or get
				// text from is inside a frame and the frame is inside the web page.
		
		// How to handle alerts?
				// Alerts in selenium are javascript pop up alert that are not part of the DOM. That means we can not look
				// for any locator to interact with the alert inside the DOM. They are separate entity from DOM.

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// An Alert in Selenium is a small message box which appears on screen to give
		// the user some information or notification. It notifies the user with some
		// specific information or error, asks for permission to perform certain tasks
		// and it also provides warning messages as well.
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        
		//store the frame in webelement
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        
		//using selenium pre-built functions, switch to that frame
		driver.switchTo().frame(frame);
        
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
		//to accept
        driver.switchTo().alert().accept();
        
		//to dimiss
//      driver.switchTo().alert().dismiss();
        Thread.sleep(6000);
        driver.close();
	}

}
