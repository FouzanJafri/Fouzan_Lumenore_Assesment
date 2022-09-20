package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
	public static WebElement AskMe_Btn_NavBar(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='askmetab']/span"));
	}
	
	//Customer segment customer name
	public static WebElement AskMe_Search_Field(WebDriver driver) {
		return driver.findElement(By.cssSelector("#askmeSearchBar"));
	}
	public static List<WebElement> CorporateData(WebDriver driver) {
		return driver.findElements(By.xpath("//*[text()='Corporate']"));
	}
	public static void ListCorporate(WebDriver driver) {
		for(WebElement ele : DashBoard.CorporateData(driver)) {
			System.out.println(ele.getText());
		}
		System.out.println("Number of Corporate Present " + DashBoard.CorporateData(driver).size());

	}
	public static WebElement SearchField(WebDriver driver) {
		return driver.findElement(By.id("ag-input-id-59"));
	}
}
