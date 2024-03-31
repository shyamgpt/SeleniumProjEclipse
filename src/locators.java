import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		 driver.findElement(By.name("inputPassword")).sendKeys("abncj");
		 driver.findElement(By.className("signInBtn")).click();
		 
		 driver.findElement(By.cssSelector("p.error")).getText();
		 

		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shyam");
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("svt@gmail.com")
         
	}

}
