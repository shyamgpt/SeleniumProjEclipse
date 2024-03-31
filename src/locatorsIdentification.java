import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsIdentification {

	
	@Test
	public void testLocators() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);

		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		
		String ele = driver.findElement(By.tagName("p")).getText();
		System.out.println(ele);
		Assert.assertEquals(ele, "You are successfully  in.");
}
}
