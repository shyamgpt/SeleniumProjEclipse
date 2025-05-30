import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart2_73 {

	@Test
	public static void AddindToCart() throws InterruptedException {
//		"//button[text()='ADD TO CART']"
		// do not depends on text when you want to build locators -- Mean try to avoid 'Text' in writing the x-path
		// because any any moment of time text can get change --especially when you have dynamic text.
		// Lecture L-75, need rewatch this video to learn how to traverse from parent to child and how Xpath based
		//'Text'is not suggested.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		int j =0;
		String[] itemNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Cucumber - 1 Kg --> Cucumber , 1 Kg
			//Convert array into arrayList for easy search

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			System.out.println(formattedName);

			List itemNeededList = Arrays.asList("itemNeeded");

			if (itemNeededList.contains(formattedName)) {
				Thread.sleep(3000);

				j++;
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// remove the above line because x-path with 'text' is not suggested as this is not reliable.
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				System.out.println(formattedName);

				if(j == itemNeeded.length) {
					break;
				}
			}

		}

	}

}
