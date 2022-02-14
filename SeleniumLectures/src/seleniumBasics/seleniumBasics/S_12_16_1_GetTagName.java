package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_16_1_GetTagName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println(element.getCssValue("background-color"));
		System.out.println(element.getCssValue("border-color"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("position"));
		
		String tagName = element.getTagName();
		String text = element.getText();
		
		driver.findElement(By.xpath("//"+tagName+"[text()='"+text+"']")).click();

		//For getAttribute method you may get a null or blank
		//String name2 = ""; local variable which must be initialized 
		System.out.println("getAttribute Name: " + element.getAttribute("id"));
		
		//For getDomAttribute method you may get true or null
		//public static String name1; global variable that doies not have to be initialized
		System.out.println("getDomAttribute Name: " + element.getDomAttribute("id"));
		
		//For getDomProperty method it will give the property of that element 
		//blank or null
		System.out.println("getDomProperty Name: " + element.getDomProperty("id"));
		
		//getTagName will get the tagName for an attribute in the DOM
		System.out.println("getTagName: " + element.getTagName());

		}
}
