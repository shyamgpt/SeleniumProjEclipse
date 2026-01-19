package AjaxIFrameChildWindow;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jumpToThirdWindow_WindowHandles_Method_1 {
	
	public static void main(String[] args) throws InterruptedException {
        // Set the driver path if not already in PATH
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // --- Assume 5 windows are already opened ---
        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        
        // Convert Set to Iterator
        Iterator<String> iterator = windowHandles.iterator();
        
        int i = 1;
        String thirdWindow = "";
        
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (i == 3) {   // get the 3rd window id
                thirdWindow = handle;
                break;
            }
            i++;
        }
        
        // Switch to 3rd window
        driver.switchTo().window(thirdWindow);
        
        System.out.println("Title of 3rd window: " + driver.getTitle());

        // Do actions in the 3rd window here
    }

}
