package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_21_1_ParentChildFollowingPreceding {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.linkText("Best Sellers")).click(); // we can traverse from child to parent by going from child to parent to parent and then preceding
		WebElement element = driver.findElement(By.xpath
		("//a[text()='Amazon Devices & Accessories']//parent::div//parent::div//preceding::div[starts-with(@class,'_p13n-zg-nav-tree-all_style_zg-root')]"));
		
		// Alternative option
//		WebElement element = driver.findElement(By.xpath("//span[text()='Any Department']"));
		System.out.println(element.getText());
		
		//	Parent = previous, but it has to be the parent of current node
		//	Child = next, but it has to be the child of current node
		//	Following = next, but it doesn’t have to be the child of current node
		//	Following-sibling = next, but also mean both current and the next node have to have same parent
		//	//select[@id='month']//option[@value='1']//following-sibling::option
		//	Preceding = previous node
		//	Preceding-sibling = previous sibling node
	}
}
