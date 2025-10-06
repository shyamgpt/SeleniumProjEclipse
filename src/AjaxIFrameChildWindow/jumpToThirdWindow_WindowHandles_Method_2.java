package AjaxIFrameChildWindow;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jumpToThirdWindow_WindowHandles_Method_2 {
	
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://example.com");
        
        // get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);
        
        // switch to 3rd window (index 2)
        driver.switchTo().window(windowList.get(2));
        
        System.out.println("Switched to 3rd window: " + driver.getTitle());
    }
}
