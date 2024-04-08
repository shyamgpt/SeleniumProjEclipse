import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions opt = new ChromeOptions();
//		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Armed Forces']")).isSelected());
		
		//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']
		
		int size = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size();
		System.out.println(size);
		
		driver.quit();
		
	}

}
