import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart2 {

	@Test
	public static void AddindToCart() throws InterruptedException {
//		"//button[text()='ADD TO CART']"

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		int j =0;
		String[] itemNeeded = {"Cucumber", "Brocolli", "Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0; i<products.size(); i++) {
			
			//Cucumber - 1 Kg  --> Cucumber , 1 Kg
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			System.out.println(formattedName);
			
			List itemNeededList = Arrays.asList("itemNeeded");
			
			
			
			
			
			
			if(itemNeededList.contains(formattedName)) {
				Thread.sleep(3000);
				
//				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				System.out.println(formattedName);
				
				
				
//				if(j ==3) {
//					break;
//				}
			}
			
		}

	

	}

}
