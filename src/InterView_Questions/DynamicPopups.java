package InterView_Questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPopups {
	
	/*
	 * Logic -->
	 * 1. Check If the Popup is displayed on the UI
	 * 2. If YES --> Click on OK or Accept or Yes Button
	 * 3. If No --> Move and Execute next Step
	 * */
	
	//https://www.youtube.com/watch?v=NhCkOiMYlWA

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	
		WebDriverWait wait = new WebDriverWait(driver, 5);
		if(wait.until(Exx))
	
	
	

	}

}
