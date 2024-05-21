import java.util.Arrays;

//How to raise a pull request and how to submit the code to git

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropdown_L54 {
	
	// How to write the x-path from parent To Child -->L55

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
//		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='IXG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).click();
		Thread.sleep(4000);
		System.out.println("Reached -1");
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[2]")).getText());
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[2]")).click();
		
		Thread.sleep(10000);
		driver.quit();
		

		

	}

}
