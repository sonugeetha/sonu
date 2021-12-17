package tests;

import org.testng.annotations.Optional;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.selenium.WebDriverManager;

import org.testng.annotations.Parameters;

public class CrossBrowser {
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional("chrome")String browser) {
		webDrvMgr=new WebDriverManager();
		driver=webDrvMgr.launchBrowser("chrome");
		}
	
	@Test
	public void navigateToGoogleTest()throws InterruptedException{
		driver.get("https://www.google.co.in");
		Thread.sleep(20000);
	}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}

}
