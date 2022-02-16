package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntaxes {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();

		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=33");
		WebElement test = driver.findElement(By.linkText("Cameras"));
		test.click();
		System.out.println(test.getText());
		
		//find by linkText or xpath
		http://tek-school.com/retail/index.php?route=common/home
		driver.findElement(By.linkText("TEST ENVIRONMENT")); // or
		driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']")); // or
		
		// find by tag index
		http://tek-school.com/retail/index.php?route=product/category&path=33
		driver.findElement(By.xpath("//div[@class='list-group']//a[9]"));
		
		// find by text
		http://tek-school.com/retail/index.php?route=common/home
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][text()='Cameras']"));
		
		// contain text
		http://tek-school.com/retail/index.php?route=product/category&path=33
		driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[contains(text(),'Cameras')]"));
		
		// starts-with
		http://tek-school.com/retail/index.php?route=product/category&path=33
		driver.findElement(By.xpath("//div[starts-with(@class,'collapse')]"));
		
	
		
		
		
		
		
		
	}

	
	
	
	
}
