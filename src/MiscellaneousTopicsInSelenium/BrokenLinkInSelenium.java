package MiscellaneousTopicsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a[href*='soapui']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		System.out.println(url);

	}

}
