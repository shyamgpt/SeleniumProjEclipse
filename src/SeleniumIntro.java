import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
//		WebDriver driver = WebDriverManager.chromedriver().create();
//		 WebDriver driver = new ChromeDriver();
//		https://rahulshettyacademy.com/locatorspractice/
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		driver.manage().window().maximize();
	
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl());
		
		
//		Locators -----> 
		
		driver.findElement(By.id("inputUsername")).sendKeys("symgpt@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("5453434");
		driver.findElement(By.className("signInBtn")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).
		sendKeys("symgpt");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).
		sendKeys("symgpt@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7894528569");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		

	}

}
