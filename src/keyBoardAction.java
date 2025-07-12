import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyBoardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Actions act = new Actions(driver);
		driver.findElement(By.id("email")).sendKeys("Selenium");
		
		act.sendKeys(Keys.TAB)
//		.pause(Duration.ofSeconds(0))
//		.sendKeys("Webdriver")
		.pause(Duration.ofSeconds(0))
		.sendKeys("7328973297")
		.sendKeys(Keys.TAB)
		.build().perform();
		

	}

}
