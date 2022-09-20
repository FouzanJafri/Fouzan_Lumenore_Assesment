package pages;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import properties.BrowserManagerClass;
import properties.ReadProperty;

public class BasePage {
	static WebDriver driver;

	@BeforeTest
	public void openURL() throws IOException {
		Home.openURL();
	}
	@Test
	private void ff() {
		System.out.println("LAJJ");
	}

}
