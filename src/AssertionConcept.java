import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionConcept {
	
	@Test
  public static void AssertionTest() throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Assert.assertFalse --will accept a false value, if the value is false then testcase will
		//pass and if true value is passed as an argument then the test case will fail
//		Assert.assertFalse(false);
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
		
		driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();
		Thread.sleep(3000);
		
		
		
//		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
	
		
		int size = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size();
		System.out.println(size);
		
		
		Assert.assertEquals(size, 6);
		
		
		driver.quit();
	  
  }

}
