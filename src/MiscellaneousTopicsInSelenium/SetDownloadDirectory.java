package MiscellaneousTopicsInSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetDownloadDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs1 = new HashMap<String, Object>();
		prefs1.put("download default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

	}

}
