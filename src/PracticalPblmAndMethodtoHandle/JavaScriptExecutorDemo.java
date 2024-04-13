package PracticalPblmAndMethodtoHandle;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 500)");
//		js.executeScript("window.scroll(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		for(int i =0 ; i<values.size(); i++) {
			
//			Integer.parseInt(values.get(i).getText());
//			System.out.println(Integer.parseInt(values.get(i).getText()));
			
			sum = sum+Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		
	String[] Text =	driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
	int total = Integer.parseInt(Text[1].trim());
	System.out.println("trimed Value --"+Text[1].trim());
	Assert.assertEquals(sum, total);
		
		driver.quit();
		

		
		
		
		

	}

}
