package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_12_27_3_IteratingBetweenTabs {

	public static void main(String[] args) throws InterruptedException {

		// Iterating Between Tabs

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        
        driver.findElement(By.id("newTabBtn")).click();
     
        Set<String> allTabs = driver.getWindowHandles();
        Iterator<String> itr = allTabs.iterator();
        
        String parentTab = itr.next();
        String childTab = itr.next();
        
        driver.switchTo().window(childTab);
      
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		// if there is no explicit wait, it is highly likely that the alert will not be clicked (accepted)
		WebElement alert = driver.findElement(By.id("alertBox"));
	    alert.click();
	    
	    wait.until(ExpectedConditions.alertIsPresent());
        
        driver.switchTo().alert().accept();
              
        driver.switchTo().window(parentTab);
        WebElement text = driver.findElement(By.xpath("//h3[text()='Button2']"));
        System.out.println(text.getText());
        
        System.out.println("This is Parent: " + parentTab);
        System.out.println("This is Child: " + childTab);
        
        Thread.sleep(2000);
        driver.quit();
	}
}
