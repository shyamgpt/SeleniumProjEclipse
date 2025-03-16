import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticDropdownUpdated_L52_53 {
	
	//Lecture - 53-- Open the Url and add the 2 adult in passengers
	//path search with 'ID' is most stable than xpath and css. and 'Id' is most preferrrable over the others
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n"
				+ " r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click(); 
		//Using for loop
		for(int i = 0; i<5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-"
					+ "plus-one-cta']")).click() ;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-"
				+ "travellers-done-cta']")).click();
		Thread.sleep(2000);
	System.out.println(	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n"
				+ " r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
	/* 
	 * Same code using while loop-->
	 * 
	 * int i =1;
	 * while(i<5){
	 * driver.findElement(By.xpath("//div[@data-testid='Adult-testID-"
					+ "plus-one-cta']")).click() ;
					i++;
	 * }
	 * 
	 * 
	 * */
		
		
	}

}
