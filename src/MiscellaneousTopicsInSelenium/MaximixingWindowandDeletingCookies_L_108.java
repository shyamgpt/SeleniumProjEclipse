package MiscellaneousTopicsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximixingWindowandDeletingCookies_L_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().deleteCookieNamed("SessionIdCookie");
		
		
		//Click on any Link
		//Login page -verify login url
		
		driver.get("https://google.com");
		

	}

}
