package IRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KyqToGimb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30)
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.cssSelector("span[class*='ng-tns-c57-8'] input")).sendKeys("KAMAKHYA - KYQ (GUWAHATI)");
		driver.findElement(By.cssSelector("span[class*='ng-tns-c57-9'] input")).sendKeys("VARANASI JN - BSB (BANARAS)");
		driver.findElement(By.cssSelector("button[class='search_btn train_Search']")).click();

	}

}
