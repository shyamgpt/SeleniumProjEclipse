import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelPractice {

	public static void main(String[] args) {

//    	 WebDriverManager.chromedriver().setup();
	 
//	   WebDriverManager.chromedriver().setup();
//	   WebDriver driver = new ChromeDriver();
//	   
//	   JavascriptExecutor js = (JavascriptExecutor)driver;
//	   js.executeScript("window.scroll(0,500)");
		
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0, 500)");
		js.executeScript("document.queruSelector('.').scrollTop=5000");
	   
	   
	   
	   
	   
	   
	   

	}
}
