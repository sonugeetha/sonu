package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class SelectDropdown1 {

	private WebDriver driver;
	private WebDriverManager WebDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass
	public void setUp() {
		WebDrvMgr = new WebDriverManager();
		driver = WebDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demoqa.com/select-menu");
	}
	
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}
	
	@Test
	public void selectDropdownTest() {
		WebElement oDropdown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(oDropdown);
		select.selectByIndex(2);
		select.selectByVisibleText("Red");
		select.selectByValue("8");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}