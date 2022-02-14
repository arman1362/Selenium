package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_20_3_RadioButton {

	public static void main(String[] args) throws InterruptedException {

		// RadioButton

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		WebElement radioButton = driver.findElement(By.xpath("//span[@data-type='radio']//input[@value='1']"));

		boolean isdisplayed = radioButton.isDisplayed();
		System.out.println(isdisplayed);

		boolean isenabled = radioButton.isEnabled();
		System.out.println(isenabled);

		boolean isselected1 = radioButton.isSelected();
		System.out.println("Before Clicking: " + isselected1);

		radioButton.click();
		Thread.sleep(6000);

		boolean isselected2 = radioButton.isSelected();
		System.out.println("After Clicking: " + isselected2);

		Thread.sleep(3000);
		driver.close();
	}
}
