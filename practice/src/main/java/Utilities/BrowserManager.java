package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {

	public static WebDriver setProperty(WebDriver driver,String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Constant.ChromeName, Constant.ChromePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		}else if(BrowserName.equals("edge")) {
			
		}
		return driver;
	}
}
