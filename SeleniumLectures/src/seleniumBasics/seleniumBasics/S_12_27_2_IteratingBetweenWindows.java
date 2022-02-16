package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_27_2_IteratingBetweenWindows {

	public static void main(String[] args) throws InterruptedException {

		// Iterating Between Windows
		// A window handle stores the unique and dynamic address of the browser windows e.g. CDwindow-A5915F4DB36681A412CBDB0EE15BB226
		// To handle Browser based Alerts, we use Alert Interface. 
		// The Alert Interface provides some methods to handle the popups.
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//We click to open the next window (child window)
		driver.findElement(By.id("newWindowBtn")).click();
	
		//we are storing our windows (the parent and any child after that) here
	
		Set<String> allWindows = driver.getWindowHandles();
		
		//iterator will allow us to iterate through windows/tabs that are open by Selenium
		Iterator<String> itr = allWindows.iterator();
		
		//The reason for below two lines of code is so that later when we call the 
		//driver.switchTo().window(we can pass the window we want to switch to) here
		//We are storing the parent window in a String
		String parentWindow = itr.next();
		//We are storing the child window in a String
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("email@email.com");
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("text");
		
		System.out.println("This is Child Windows Handle: " + childWindow);
		System.out.println("This is Parent Window Handle: " + parentWindow);
		
		Thread.sleep(6000);
		driver.quit();

	}
}
