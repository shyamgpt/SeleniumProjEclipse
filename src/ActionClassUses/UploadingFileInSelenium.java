package ActionClassUses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFileInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogsopt.com/");
		
		String projectPath = System.getProperty("user.dir");
		
		driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\Files\\Wave.jpg");
		
		//driver.findElement(By.id("uploadfiles")).sendKeys("C:\\Users\\arun\\Download\\Wave.jpg");
		System.out.println(projectPath);

	}

}
