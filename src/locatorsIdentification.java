import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsIdentification {

	
	@Test
	public void testLocators() throws InterruptedException {
		
		String name = "rahul";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String passward = getPassword(driver);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		

		driver.findElement(By.name("inputPassword")).sendKeys(passward);
		Thread.sleep(1000);

		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		
		String ele = driver.findElement(By.tagName("p")).getText();
		System.out.println(ele);
		Assert.assertEquals(ele, "You are successfully logged in.");
//		"Hello"+name+ ","
		

	    
}
	
	 public static String getPassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		  Thread.sleep(1000);
		 String pwdText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		 System.out.println(pwdText);
		String[] pwdSpltFirst = pwdText.split("'");
		String[] pwdSpltSecnd = pwdSpltFirst[1].split("'");
		String finalPwd = pwdSpltSecnd[0];
		System.out.println(finalPwd);
		return finalPwd;
		
	    }
}
