package ExceptionHandling;


//Url --https://docs.google.com/document/d/1YPj2GviGphAPFaCkPrgl4bvS0ARlb3cBrDQdraB91OA/edit?tab=t.0
//https://chatgpt.com/c/68adf790-2200-8325-8f59-99f22215731c
public class praticalExampleof_Try_Catch_Finally {

	
	//1--> LoginPage.java (Page Object Model class)-->
	
	/*
	 * package pages;
	 * 
	 * import org.openqa.selenium.By; 
	 * import org.openqa.selenium.WebDriver;
	 * 
	 * public class LoginPage { 
	 * WebDriver driver;
	 * 
	 * // Locators By username = By.id("username"); By password = By.id("password");
	 * By loginBtn = By.id("loginBtn");
	 * 
	 * // Constructor public LoginPage(WebDriver driver) { this.driver = driver; }
	 * 
	 * // Actions public void login(String user, String pass) {
	 * driver.findElement(username).sendKeys(user);
	 * driver.findElement(password).sendKeys(pass);
	 * driver.findElement(loginBtn).click(); } }
	 * 
	 * 
	 */
	
	//2--> LoginTest.java (Test Class with try–catch)
	
	/*


public class LoginTest {
    @Test
    public void testLogin() {
        WebDriver driver = null;

        try {
            // Launch browser
            System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://example.com/login");

            // Perform login
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("wrongUser", "wrongPass");

            // Validate page title after login
            Assert.assertEquals(driver.getTitle(), "Dashboard");

        } catch (Exception e) {
            System.out.println("❌ Exception occurred: " + e.getMessage());

            // Capture screenshot if test fails
            ScreenshotUtil.captureScreenshot(driver, "LoginTest_Failed");

        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
*/
	
	//3-->ScreenshotUtil.java (Utility for screenshot)
	
	/*
	 * package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {
    public static void captureScreenshot(WebDriver driver, String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
            System.out.println("📸 Screenshot saved: " + fileName);
        } catch (IOException e) {
            System.out.println("⚠️ Could not save screenshot: " + e.getMessage());
        }
    }
}

	 * 
	 * */
	 
	 
}
