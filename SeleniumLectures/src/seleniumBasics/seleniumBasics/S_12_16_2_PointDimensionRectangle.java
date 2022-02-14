package seleniumBasics;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_12_16_2_PointDimensionRectangle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting idea
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		// getLocation();
		// getRect();
		// getSize();
		
		// Selenium 3
			//1. class Point will give us the location of an element 
		Point p = element.getLocation();
		System.out.println(p);
		
			//2. Dimension will give us the size of an element 
		Dimension d = element.getSize();
		System.out.println(d);
		System.out.println("----------------------");
		
		//Selenium 4
			//Rectangle
		Rectangle rect = element.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		
		
	
	}
}
