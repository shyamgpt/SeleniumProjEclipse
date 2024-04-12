//Java Program to find all the link present on a web page-->
package RealTimeExercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class limitingWebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int sizeCount = driver.findElements(By.tagName("a")).size();

		System.out.println(sizeCount);
		
		//Limiting the scope of webdriver -->
//		1.-> finding the count of link in footer section -->
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinkCount = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerLinkCount);
		
//		2. finding the count of link in 1 column of footer section -->
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int columnSize = columnDriver.findElements(By.tagName("a")).size();
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for(int i =1 ;i<columnSize; i++) {
//			columnDriver.findElements(By.tagName("a")).get(i).click();
			// You will get StaleElement Exception here
			
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);	
			
			}
		
		Set<String> allwindow = driver.getWindowHandles();
		Iterator<String> it = allwindow.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		
		//table/tbody/tr/td[1]/ul
		//Stale element exception

	}

}
