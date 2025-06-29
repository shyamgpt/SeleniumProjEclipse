import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown_L51 {
	
	// Lecture No: 52
	// Static Dropdown Using Select Class --> 
	// When any Dropdown have a tag 'Select' then there is specical class name Select 
	//and we will use Select class to select the dropdown
	//Select dropdown are static dropdown
	// Adding 6 passenger using while/for loops -->

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver","/Users/shyam/docuemnt/chromdriver");
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
