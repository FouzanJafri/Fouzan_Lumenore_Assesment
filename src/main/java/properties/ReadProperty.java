package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static String BrowserName() throws IOException {
		
		File file = new File("src/test/resources/config/config.properties");
		FileInputStream fileInt = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fileInt);
		
		String Browser_Name = prop.getProperty("browserName");
		return Browser_Name;

	}
	
	public static String URL() throws IOException {
		
		File file = new File("src/test/resources/config/config.properties");
		
		FileInputStream fileInt = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fileInt);
		
		String Browser_URL = prop.getProperty("baseUrl");
		return Browser_URL;

	}

}
