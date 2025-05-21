import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart1_L72 {

	@Test
	public static void Cart2() throws InterruptedException {
//		"//button[text()='ADD TO CART']"
// When there is no attribute- then search for whole product path where that item is present --mean search in the parent blog
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			System.out.println(name);
//			if (name.equalsIgnoreCase("Beetroot")) {
			if (name.contains("Beetroot")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

				break;
			}
		}

	}

}
