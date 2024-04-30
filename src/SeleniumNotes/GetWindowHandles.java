package SeleniumNotes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
        String parentWindow = driver.getWindowHandle();
        System.out.println("parent WindowID -->" +parentWindow);
      driver.findElement(By.xpath("(//button[@class='btn btn-info'][normalize-space()='click'])[1]")).click();
	Set<String> allWindowID =	driver.getWindowHandles();
	for(String x :allWindowID ) {
		System.out.println(x);
		
		if(!parentWindow.equals(x)) {
			System.out.println("childWindow is ID--> "+ x);
			
			System.out.println(driver.switchTo().window(x).getTitle());
		}
	}
	
	
	
	driver.quit();
		
		


	}

}
