package properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManagerClass {
	
	
	public static WebDriver BeforeExe(WebDriver driver, String BrowserName ) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver" , "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if (BrowserName.equalsIgnoreCase("edge")) {
			System.getProperty("www.edge.com", "src/test/resources/driver/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} 
		return driver;
	}

}
