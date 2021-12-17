package framework.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import framework.functionlibray.HomePageLib;
import framework.functionlibray.SearchResultsLib;
import utilities.DataProvider;
import utilities.selenium.WebDriverManager;

public class SearchProductTests {
	
	private WebDriver driver;
	private WebDriverManager webDrvMgr;
	private HomePageLib homepaglib;
	private SearchResultsLib seareslib;
	SoftAssert sf;
	
//Test Input
	private String propFile="src/test/resources/base.prop";
	private String url=DataProvider.getTestData(propFile,"url");
	private String searchParam=DataProvider.getTestData(propFile,"searchParam");
	
	
	@BeforeClass
	public void setUp() {
		webDrvMgr=new WebDriverManager();
		driver=webDrvMgr.launchBrowser("chrome");
		driver.get(url);
	}
	
@BeforeMethod
public void preReq() {
sf=new SoftAssert();
}

@Test
public void searchProductTest() {
	Reporter.log("Search for product in homepage");
	homepaglib=new HomePageLib(driver);
	homepaglib.searchForProduct(searchParam);
	
	Reporter.log("verify rhat all search reasult contaion the searched parameter");
	seareslib = new SearchResultsLib(driver);
	List<String>listProdNames=seareslib.getListOfProductNames();
	for(String prodName:listProdNames) {
		sf.assertTrue(prodName.toLowerCase().contains(searchParam.toLowerCase()),
		"FAIL | Actual product name "+prodName+"doesnt contain the search parameter"+searchParam);
	}
		sf.assertAll();
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}