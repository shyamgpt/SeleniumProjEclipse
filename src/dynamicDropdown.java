import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
//		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='IXG']")).click();
		
		Thread.sleep(10000);
		driver.quit();
		

		

	}

}
