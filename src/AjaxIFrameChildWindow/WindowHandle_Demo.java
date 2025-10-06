
/*Website -->How to window multiple windows in selenium-->
 * https://www.browserstack.com/guide/handle-multiple-windows-in-selenium#:~
  :text=Iterate%20through%20child%20windows.
  ,URL%20of%20the%20web%20page.
 * */
package AjaxIFrameChildWindow;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle_Demo {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

// Load the website
		driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				driver.close();

//				System.out.println(driver.switchTo().window(child_window).getTitle());

				
			}

		}
//switch to the parent window
		driver.switchTo().window(parent);

	}
}
