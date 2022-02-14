package seleniumBasics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_20_2_CheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
	// CheckBoxes
	
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); // upcasting idea
	
	driver.manage().window().maximize();
	
	driver.get("http://tek-school.com/retail/index.php?route=account/register");
	
	driver.findElement(By.xpath("//span[text()= 'My Account']")).click();
	
	driver.findElement(By.linkText("Register")).click();
	
	WebElement checkBox= driver.findElement(By.xpath("//input[@name='agree']"));
	
	boolean isDisplayed = checkBox.isDisplayed();
	boolean isEnabled = checkBox.isEnabled();
	boolean isSelected = checkBox.isSelected(); // before checking the checkBox
	checkBox.click(); // checking the checkBox
	boolean isSelected2 = checkBox.isSelected(); // after checking the checkBox

	System.out.println("Radio Button is Enabled = \t" + isEnabled);
	System.out.println("Radio Button is Displayed = \t" + isDisplayed);
	System.out.println("Radio Button is Selected = \t" + isSelected);
	System.out.println("Radio Button is Selected = \t" + isSelected2);
	
	}
}
