import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestveDropDown_L58 {
	// Handling auto suggestive dropsdown with webdriver API
	// What is autosuggetive dropdowns -->When options comes based on your inputs.

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			/*
			 * List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
//			if (name.equalsIgnoreCase("Beetroot")) {
			if (name.contains("Beetroot")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

				break;
			 * 
			 * */
		}

	}

}
