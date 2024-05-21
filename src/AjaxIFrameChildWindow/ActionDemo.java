package AjaxIFrameChildWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement move = driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));

		Actions a = new Actions(driver);

		a.moveToElement(move).build().perform();
		
        // This will sendkeys the word in capital letter-->
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello")
//				.build().perform();
		
		//This will double click the send letters-->it will select the entire text
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick()
		.build().perform();
		
		//Right click on specific element -->
		a.moveToElement(move).contextClick().build().perform();

	}

}
