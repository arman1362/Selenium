package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_12_28_1_HandlingiFrames extends S_12_28_3_Utilities{
	
    public static void main(String[] args) throws InterruptedException {
    	
    	// https://www.hostinger.com/tutorials/what-is-iframe/
        
    	 launchChrome ("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");

         WebElement frame= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
         
         driver.switchTo().frame(frame);
         
         WebElement btn = driver.findElement(By.xpath("//button[text()='Try it']"));
         
         btn.click();
         
         Alert alert = driver.switchTo().alert();
         
         System.out.println(alert.getText());
         
         alert.accept();
         
         driver.switchTo().defaultContent();
         
         WebElement runbtn = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
         
         System.out.println(runbtn.getText());
         
         runbtn.click();
         
         Set <String> allWindows = driver.getWindowHandles();
         
         Iterator <String> itr = allWindows.iterator();
         
         String parentWindow = itr.next();
         String childWindow = itr.next();
         
         driver.switchTo().window(childWindow);
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//span[normalize-space()='Sign up']")).click();
         
         @SuppressWarnings("unused")
         WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
         
         // wait.until(ExpectedConditions.visibilityOf(element));
         
         driver.switchTo().window(parentWindow);
         driver.findElement(By.xpath("//a[@id='tryhome']")).click();

         Thread.sleep(6000);
         
         driver.quit();
 
         // https://www.guru99.com/handling-iframes-selenium.html
    }
}


