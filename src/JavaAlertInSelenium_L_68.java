
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlertInSelenium_L_68 {

	@Test
	public static void handleAlerts() throws InterruptedException {
		
		String text = "Shyam";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
//		driver.findElement(By.id("name")).sendKeys("Shyam");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Shyam Gupta");

		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		Thread.sleep(10000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
		/* Window Authentication popup --> Where we provide the username and passowrd in the popup to get login
		 * into the website (These popup are known as window authentication popup)
		 * When we will work with network related website then we will come across these kind of popups and we prompted to
		 * give username and password. and these popups can not be handled with switch to alert mechanism.
		 * We use AutoIT to handle these type of window authentication popups
		 * Eg--> String url =  "https://"+"admin"+ ":" + "admin"+ "@" + "www.google.com";
		 * driver.get("http://username:password@yourwebsite.com");
		 * 
		 * */
		
	
		
		
		//Java Switch to alert has two option -->
		/*
		 * 1. driver.switchTo().alert().accept();
		 * 2. driver.switchTo().alert().dismiss();
		 * 
		 * we have two type of Java Script alert-->
		 * 1. where we have only one option i.e OK or Aceept.
		 * 2. Where we have both the option i.e OK and Cancel(either accept or dismiss it).
		 * **/
		
		

	}

}
