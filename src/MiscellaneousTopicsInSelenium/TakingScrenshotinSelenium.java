package MiscellaneousTopicsInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScrenshotinSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
//		D((TakesScreenshot)driver)
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Sumit\\Desktop\\Selenium Jars\\screenshot.png"));

	}

}
