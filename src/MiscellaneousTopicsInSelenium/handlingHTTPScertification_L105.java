package MiscellaneousTopicsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingHTTPScertification_L105 {

	public static void main(String[] args) {
		
		
		//How to bypass SSL certification-->
		
//		FirefoxOptions option = new FirefoxOptions();
//		option.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		
		/**
		 * for firefox -->
		 * FirefoxOption options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		 * 
		 * */
		
		// Lecture -->
		//https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/1994944#overview

	}

}
