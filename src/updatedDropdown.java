import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n"
				+ " r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click(); 
		for(int i = 0; i<5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-"
					+ "plus-one-cta']")).click() ;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-"
				+ "travellers-done-cta']")).click();
		Thread.sleep(2000);
	System.out.println(	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n"
				+ " r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
		
		
	}

}
