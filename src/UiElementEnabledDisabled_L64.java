import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiElementEnabledDisabled_L64 {

	@Test
	public static void uIEnabledAndDisabledTest() throws InterruptedException {
		//Validation if UI Element are disabled or enabled with Attribute-->
		//isEnabled();
		//isDisabled();--> No such method

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("1")) {
			System.out.println("its Enabled!!");
			Assert.assertTrue(false);
		} else {

			Assert.assertTrue(false);
		}

		driver.quit();

	}
}
