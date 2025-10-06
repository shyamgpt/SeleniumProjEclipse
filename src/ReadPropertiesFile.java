import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	/*
	 * Properties file -->
	 * 
	 * url=https://www.google.com 
	 * browser=chrome 
	 * username=testuser
	 * password=secret123
	 * 
	 */

	public static void main(String[] args) {
		Properties prop = new Properties();

		try {
			// Load the properties file
			//Conveting file into FileInputStream which java understand.
			
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			prop.load(fis);

			// Read properties
			String url = prop.getProperty("url");
			String browser = prop.getProperty("browser");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			// Print values
			System.out.println("URL: " + url);
			System.out.println("Browser: " + browser);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
