package Abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	public static void WebDriver_Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(AbsBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void IframeSwitch(WebDriver driver,String id) {
		driver.switchTo().frame(id);
	}

}
