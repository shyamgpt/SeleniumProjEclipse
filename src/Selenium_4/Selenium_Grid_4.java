package Selenium_4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import abstractClass.WebDriver;

public class Selenium_Grid_4 {


	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        /* Test case execution on grid in "Standalone mode"-->
         * 
        FirefoxOptions driver = new FirefoxOptions();
        
        
		ChromeOptions opt = new ChromeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),opt);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Grid !!!");
		
		driver.quit();
		
		*/
	}

//Url--Selenium Grid diagram--> https://docs.google.com/document/d/1RoyDggDtbhEDTOolFFnorcYxMROOGJpmYqXfk4QICqg/edit?tab=t.d90d9iy3mk27
	/*
	 * The purpose of grid is used to distribute your test cases for remote
	 * execution.
	 * 
	 * Selenium Grid allows the execution of WebDriver scripts on remote
	 * machines(virtual or real) by routing commands sent by the client to remote
	 * browser instances.
	 * 
	 * Grid aims to:
	 * 
	 * Provide an easy way to run tests in parallel on multiple machines Allow
	 * testing on different browser versions Enable cross platform testing
	 * 
	 * There 3 ways to configure/running selenium grid--> 1. Standalone mode 2. Hub
	 * and Node 3. Distributed mode
	 * 
	 * Parralle/Sequential testing is done by TestNg Framwork or by using
	 * Testng/Junit.
	 * 
	 * 
	 * 
	 */
}
