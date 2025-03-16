import java.util.Arrays;

//How to raise a pull request and how to submit the code to git

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown_L54 {
	//
	//Some dropdowns are getting loaded based on some user action in previous steps then these dropdowns
	//are known as Dyanmic Drop Downs
	
	// How to write the x-path from parent To Child -->L55
	
	//Try to Implement this by-own-- as this part I was not able to do it (again try)
	
	//Parent-Child relationship locator to Identify the Object Uniquely--> Refer to down section
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
//		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		opt.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']
		
		Thread.sleep(4000);
		
		//'From' field x-path
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='IXG']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).click();
		Thread.sleep(4000);
		System.out.println("Reached -1");
		
		
		//'To' filed x-path
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[2]")).getText());
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[2]")).click();
		
		Thread.sleep(10000);
		driver.quit();
		
		
		//Parent-Child relationship locator to Identify the Object Uniquely--->
		//1. Parent child relationship mechanism xpath
		//2. Parent child traversal mechanism xpath
		
		
		/*
		 * Lecture Link-->https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/13022888#overview
		 *  Eg of  Parent child relationship mechanism xpath-->
		 * Syntax --> [Parent xpath] child xpath (parent xpath 'space' child xpath)
		 * 
		 * 
		 * 
		 * */

		

	}

}
