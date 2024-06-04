package AjaxIFrameChildWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> it = windows.iterator();
		System.out.println(it);
		String parentId = it.next();
		String childId = it.next();
		System.out.println(childId);
		System.out.println(parentId);

		driver.switchTo().window(childId);
		

//		Set<String> allwindow = driver.getWindowHandles();
//		Iterator<String> it = allwindow.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println("HasNext ->" +it.hasNext());
//			driver.switchTo().window(it.next());
//			
//			System.out.println(driver.getTitle());
//		}
//		
		driver.findElement(By.cssSelector("p.im-para.red")).getText();
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());

		String EmailId = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		System.out.println(EmailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(EmailId);

	}

	

}
