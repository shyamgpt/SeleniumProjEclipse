package InterView_Questions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicHtmlTable {

	//// table[@id='customers']
	// Css --> table[id='customers']
	//// table[contains(@id,'cust')]
	// table[contains(@name,'cust')]
	// Xpath for col -> //table[contains(@name,'cust')]//th
	// Xpath for row -> //table[contains(@name,'cust')]//tr
	// Xpath for data -> //table[contains(@name,'cust')]//td
	// Only 3rd row table-data --> //table[contains(@name,'cust')]//td[3]
	// Only 3rd row table-data --> //table[contains(@name,'cust')]//td[2]

//	public static void main(String[] args) {
	@Test
	public void VerifyResult() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/");
		
		// 1. Want to print all the data present in Table and also want to check that "Java" is present
		//in the table or not?
		List<WebElement> allData = driver.findElements(By.xpath(" //table[contains(@name,'cust')]//td"));
		int size = allData.size();
		System.out.println(size);
		Assert.assertEquals(size, 30, "Column count is not same");
		
		
		boolean status = false;
		
		for(WebElement ele : allData) {
			String value = ele.getText();
			System.out.println(value);
			if(value.contains("Java")) {
				status = true;
				break;
			}
		}
		Assert.assertTrue(status, "Java is not present");
		
		//2. Now want to check that in the 3rd column "Country" header is present or not?
		
		List<WebElement> colEle = driver.findElements(By.xpath("//table[contains(@name,'cust')]//th"));
		int colSize = colEle.size();
		System.out.println(colSize);
		Assert.assertEquals(colSize, 5, "column is present");
		
		boolean colStatus = false;
		
		for(WebElement ele1: colEle) {
			String colValue = ele1.getText();
			System.out.println(colValue);
			if(colValue.contains("Country")) {
				status = true;
				break;
			}
			
			
			
		}
		Assert.assertTrue(colStatus);
		driver.quit();

	}
	

}
