package synchronisationInSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBasedOnUserInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the browserName");
		String browser = s.nextLine();
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		else if(browser.equals("FireFox")) {
			
			//FireFox
			
		} else {
			System.out.println("Invalid browser name");
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
