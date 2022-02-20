package seleniumBasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S_12_29_2_GetDomProperty extends S_12_28_3_Utilities {

	public static void main(String[] args) throws InterruptedException {

		launchChrome("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		Thread.sleep(2000);
		scrollDownBy();
		List<WebElement> daysOfMonth = driver.findElements(By.xpath("//div//div//div[@aria-disabled='false']"));

		String date2 = "Wed Jan 23 2022";
		for (int i = 0; i < daysOfMonth.size(); i++) {
			String date1 = daysOfMonth.get(i).getAttribute("aria-label");
			if (date1.equalsIgnoreCase(date2)) {
				daysOfMonth.get(i).click();
				break;
			}
		}
	}
}
