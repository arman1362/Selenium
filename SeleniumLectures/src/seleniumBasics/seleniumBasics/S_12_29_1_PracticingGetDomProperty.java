package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S_12_29_1_PracticingGetDomProperty extends S_12_28_3_Utilities {
	
    public static void main(String[] args) throws InterruptedException {
        
    	launchChrome("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println(element.getDomProperty("id"));
		
		WebElement element2 = driver.findElement(By.linkText("Forgot password?"));
		System.out.println(element2.getDomProperty("href"));
    
		WebElement element3 = driver.findElement(By.linkText("Create a Page"));
		System.out.println(element3.getDomProperty("href"));
		
		driver.close();
    }
}


