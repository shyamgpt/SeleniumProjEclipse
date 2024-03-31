import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdowns = new Select(staticDropdown);
		dropdowns.selectByIndex(3);
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		dropdowns.selectByVisibleText("INR");
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		dropdowns.selectByValue("AED");
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		
		
		

	}

}
