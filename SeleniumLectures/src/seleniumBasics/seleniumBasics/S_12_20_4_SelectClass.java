package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S_12_20_4_SelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upcasting idea

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Select class in Selenium;
			// it is a class in Selenium which we can create an object of select class and use all of its functions.
			// When we can use select class? With dynamic drop down list and if the tag is "Select".

		driver.get("https://facebook.com");

		driver.findElement(By.xpath("//a[text()= 'Create new account']")).click();

		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement years = driver.findElement(By.xpath("//select[@id='year']"));

		Select select1 = new Select(days);
		Select select2 = new Select(months);
		Select select3 = new Select(years);
		
//		select1.selectByIndex(0);
//		select1.selectByValue("1");
		select1.selectByVisibleText("1");

//		select2.selectByIndex(0);
//		select2.selectByValue("1");
		select2.selectByVisibleText("Jun");
		
//		select3.selectByIndex(0);
//		select3.selectByValue("1");
		select3.selectByVisibleText("2022");
		
    	// Iterating through the list of months and printing them
		
		
		List <WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//child::option"));
		List <String> listOfDays = new ArrayList <String> ();
		List <WebElement> allMonths = driver.findElements(By.xpath("//select[@id='month']//child::option"));
		List<String> listOfMonths = new ArrayList<String>(); // storing the list of months in a List String
		List <WebElement> allYears = driver.findElements(By.xpath("//select[@id='year']//child::option"));
		List <String> listOfYears = new ArrayList <String> ();
		
		for (int i=0; i < allDays.size(); i++) {
			listOfDays.add(allDays.get(i).getText());
		}
		System.out.println();
		System.out.print(listOfDays);
		
		for (int i = 0; i < allMonths.size(); i++) {
			listOfMonths.add(allMonths.get(i).getText());
		}
		System.out.println();
		System.out.print(listOfMonths);
			
		for (int i=0; i < allYears.size(); i++) {
			listOfYears.add(allYears.get(i).getText());
		}
		
		System.out.print(listOfYears);
		
		Thread.sleep(6000);
		
		driver.close();

	}
	
	 }
