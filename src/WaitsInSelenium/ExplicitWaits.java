package WaitsInSelenium;
import java.util.List;

import org.openqa.selenium.By;
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
 * */
public class ExplicitWaits {
	
	
	   @Test
       public void WaitsExp() {
		   WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedCondition.)
			
			// Read the theory--Methods available in explicit methods
			
       }

}
