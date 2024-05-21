//Performing drag and drop operation in a frame using action class-->
package AjaxIFrameChildWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConceptAndDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// .demo-frame

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
 // you can switch to frame with index, let suppose you have 3 frame i.e 0,1,2 -- and if you give 0 then 
//		it will switch to 1 frame
		WebElement ele = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(ele);

		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();

	}

}
