package WaitsInSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Refer this url for concepts 
 * 
 * https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver*/

import org.testng.annotations.Test;


/*Theroy Websites -->
 * https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
 * 
 * https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
 * */
public class ExplicitWaits {
	
//	
//	   @Test
//       public void WaitsExp() {
//		   WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//			
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			wait.until(ExpectedCondition.VisibilityOfElementLocatedBy(ByCssSelector("")))
//			
			// Read the theory--Methods available in explicit methods
	/*
	titleIs()
	titleContains()
	visibilityOf()
	visibilityOfAllElements()
	visibilityOfAllElementsLocatedBy()
	visibilityOfElementLocated()
	alertIsPresent()
			
  */
	
	
	/*
	 * Practical Examples of Explicit wait -->
	 * 
	 * 1. Dashboard Loading (After Login)-->(little extra time is required)
	 * 
	 * Once login is done, account balance and dashboard sections take a few seconds to load.
	 * Explicit Wait ensures the account summary table is visible.
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountSummaryTable")));

	 * 
	 * 
	 * 2. Funds Transfer – Wait for Confirmation Message-->
	 * After clicking "Transfer", the success message (e.g., "Transaction Successful") appears dynamically.
	 * Use Explicit Wait to wait for the message instead of using Thread.sleep().
	 * WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-success']")));
       System.out.println(successMsg.getText());

	 * 
	 * 3. Logout Button Availability-->
	 * Some banking apps disable buttons during transactions.
	 * After completing a transaction, wait for the Logout button to be clickable again.
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutBtn"))).click();

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * package waitExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ExpectedConditionExample {
// created reference variable for WebDriver
WebDriver driver;

@BeforeMethod
public void setup() throws InterruptedException {

// initializing driver variable using FirefoxDriver
driver=new FirefoxDriver();
// launching gmail.com on the browser
driver.get("https://gmail.com");
// maximized the browser window
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
public void test() throws InterruptedException {
// saving the GUI element reference into a "element" variable of WebElement type
WebElement element = driver.findElement(By.id("Email"));
// entering username
element.sendKeys("dummy@gmail.com");
element.sendKeys(Keys.RETURN);
// entering password
driver.findElement(By.id("Passwd")).sendKeys("password");
// clicking signin button
driver.findElement(By.id("signIn")).click();
// explicit wait - to wait for the compose button to be click-able
WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
// click on the compose button as soon as the "compose" button is visible
driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
}

@AfterMethod
public void teardown() {
// closes all the browser windows opened by web driver
driver.quit();
}

}
	 * 
	 * 
	 */
	
	

}
