package TestPages;

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Abstract.AbsBase;
import Abstract.Common;
import Pages.DashBoard;
import Pages.LoginPage;

public class TestScript extends AbsBase {
	JavascriptExecutor je = (JavascriptExecutor) driver;

	@Test
	public void test1() throws InterruptedException {
		Common.WebDriver_Wait(LoginPage.Email_Field(driver));
		LoginPage.Email_Field(driver).sendKeys("shubhamk@netlink.com");
		LoginPage.Password_Field(driver).sendKeys("Testing@12345");
		LoginPage.LoginButton(driver).click();
		Common.WebDriver_Wait(DashBoard.AskMe_Btn_NavBar(driver));
		Assert.assertEquals(driver.getTitle(), "preview - Dashboards");
//		Actions action = new Actions(driver);
//		action.moveToElement(DashBoard.AskMe_Btn_NavBar(driver)).click();
		Thread.sleep(2000);
		DashBoard.AskMe_Btn_NavBar(driver).click();
		Thread.sleep(3000);
		Common.IframeSwitch(driver, "askmeframe");
		DashBoard.AskMe_Search_Field(driver).click();
		DashBoard.AskMe_Search_Field(driver).sendKeys("Customer segment customer name"+Keys.ENTER);
		Thread.sleep(3000);
		DashBoard.ListCorporate(driver);
	}
}
