package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass extends S_12_28_3_Utilities {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.drive", ".//drivers////ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		driver.findElement(By.xpath("//a[text()= 'Create new account']")).click();
		
		List <WebElement> months = driver.findElements(By.xpath("//select[@id='month']//child::option"));
		// If you use this locator: //select[@id='month'] then it will print in separate rows instead of one row.
		List <String> allMonths = new ArrayList <String> ();
		
		for (int i =0; i < months.size(); i++) {
			allMonths.add(months.get(i).getText());
		}
		System.out.print(allMonths);
	}
}
