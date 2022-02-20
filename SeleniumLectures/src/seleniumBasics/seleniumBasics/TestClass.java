package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

public class TestClass{
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver",
			      ".\\drivers\\\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.tutorialspoint.com/index.htm");
			      //get current system time
			      long s = System.currentTimeMillis();
			      // Javascript executor
			      Thread.sleep(3000);
			      JavascriptExecutor j = (JavascriptExecutor) driver;
			      //executeAsyncScript method to set timeout
			      j.executeAsyncScript
			      ("window.setTimeout(arguments[arguments.length - 1], 800);");
			      System.out.println(
			      "Time Elapsed is: " + (System.currentTimeMillis() - s));
			      driver.quit();
   }
}