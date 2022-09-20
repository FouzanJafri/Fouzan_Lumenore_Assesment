package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import properties.BrowserManagerClass;
import properties.ReadProperty;

public class Home {
	
	private static WebElement elem;
	
	private static WebDriver driver;
	
	public static void openURL() throws IOException {
		driver = BrowserManagerClass.BeforeExe(driver, ReadProperty.BrowserName());
		driver.get(ReadProperty.URL());
	}
	
	pu

}
