package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static String ReadBrowserName() throws IOException {
		File file = new File("src/test/resources/config/config.properties");
		FileInputStream fileInt  = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInt);
		return prop.getProperty("browserName");
	}
	public static String ReadBrowserURL() throws IOException {
		File file = new File("src/test/resources/config/config.properties");
		FileInputStream fileInt  = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInt);
		return prop.getProperty("browserURL");
	}
}
