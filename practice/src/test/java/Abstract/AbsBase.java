package Abstract;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BrowserManager;
import Utilities.ConfigReader;

public class AbsBase {
	public static WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = BrowserManager.setProperty(driver, ConfigReader.ReadBrowserName());
		driver.get(ConfigReader.ReadBrowserURL());
	}


}
