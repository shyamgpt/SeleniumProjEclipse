package JavaStreamsSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortingWebTableSTream {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on the column -->
		driver.findElement(By.xpath("//tr/td[1]")).click();
		
		// capture all the webElement into List -->
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		//capture text of all webElements into new(original) list -->
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// Sort on the original List of step 3 --> sorted list
		System.out.println(originalList);
		
		List<String>sortedList =originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original List vs sortedList
		
		System.out.println(sortedList);
		
//		Assert.assertTrue(originalList.equals(sortedList));
//		driver.quit();
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
