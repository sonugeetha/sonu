package framework.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import framework.functionlibray.Assignment4ProductPageLib;
import framework.functionlibray.Assignment4SearchResultsLib;
import framework.functionlibray.Assignment4HomePageLib;
import utilities.DataProvider;
import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class ProductAddTestAssignment4 {

	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	private Assignment4HomePageLib hompaglib;
	private Assignment4SearchResultsLib seareslib;
	private Assignment4ProductPageLib propaglib;
	WebDriverUtilities webDrvUtil;
	SoftAssert sf;

	private String propfile = "src/test/resources/base.prop";
	private String url = DataProvider.getTestData(propfile, "url");
	private String searchParam = DataProvider.getTestData(propfile, "searchParam");

	@BeforeClass
	public void setUp() {
		
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		webDrvUtil=new WebDriverUtilities(driver);
		driver.get(url);

	}

	@BeforeMethod
	public void preReq() {
		sf = new SoftAssert();
	}

	@Test
	public void productAddTest() throws InterruptedException {
		Reporter.log("search for product in homepage");
		hompaglib = new Assignment4HomePageLib(driver);
		hompaglib.searchForProduct(searchParam);
		Reporter.log("verify that all search results contained search result parameter");
		seareslib = new Assignment4SearchResultsLib(driver);
		seareslib.clickFirstSearchResultLink(1);
		Thread.sleep(2000);
		webDrvUtil.switchWindow();
		
		propaglib=new Assignment4ProductPageLib(driver);
		propaglib.addVerify();
		Thread.sleep(2000);
		
		driver.close();
		webDrvUtil.switchWindow();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
