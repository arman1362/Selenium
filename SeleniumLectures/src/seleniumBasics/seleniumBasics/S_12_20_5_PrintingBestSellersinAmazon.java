package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_20_5_PrintingBestSellersinAmazon {

	public static void main(String[] args) throws InterruptedException {

		// printing the list of bestsellers in Amazon

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upcasting idea

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.com");

		driver.findElement(By.linkText("Best Sellers")).click();
		// div[@role='group']//descendant::div
		// div[@role='group']//child::div
		// div[@role='group']//preceding-sibling::div
		List<WebElement> allItems = driver.findElements(By.xpath("//div[@role='group']//div"));
		List<String> listOfItems = new ArrayList<String>();

		for (int i = 0; i < allItems.size(); i++) {
			listOfItems.add(allItems.get(i).getText());
		}

		System.out.println(listOfItems);

		for (int i = 0; i < allItems.size(); i++) {
		}
		allItems.get(4).click(); // clicking on item 4

		Thread.sleep(6000);
		driver.close();

		// the following will start from the next
	}
}
