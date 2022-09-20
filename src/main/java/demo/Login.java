package demo;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	WebElement element;

	@BeforeTest
	private void beff() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://vm-outsys-dev02.global.netlink.com/ALM/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	private void test1() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();
	}

	@Test
	private void test2() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();

	}

	@Test
	private void test3() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();

	}

	@Test
	private void test4() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();
	}

	@Test
	private void test6() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();
	}

	@Test
	private void test7() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		element = driver.findElement(By.id("Input_emailVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("praghuwanshi@netlink.com");
		element = driver.findElement(By.id("Input_PasswordVal"));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click();
		element.sendKeys("123456");
		element = driver.findElement(By.xpath("//button"));
		element.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(driver.getTitle(), "Dashboard");
		driver.navigate().back();
	}

//	@Test
//	private void test8() {
//		driver.navigate().refresh();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Actions action = new Actions(driver);
//		element = driver.findElement(By.id("Input_emailVal"));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		action.moveToElement(element).click();
//		element.sendKeys("praghuwanshi@netlink.com");
//		element = driver.findElement(By.id("Input_PasswordVal"));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		action.moveToElement(element).click();
//		element.sendKeys("123456");
//		element = driver.findElement(By.xpath("//button"));
//		element.click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		Assert.assertEquals(driver.getTitle(), "Dashboard");
//		driver.navigate().back();
//	}

	@AfterTest
	private void aff() {
		driver.close();
	}
}
