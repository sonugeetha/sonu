package framework.functionlibray;

import org.openqa.selenium.WebDriver;
import framework.pageobjects.Assignment4ProductPagePO;

public class Asignment4HomePageLib{
	
	WebDriver driver;
	Assignment4HomePagePO hompagepo;
	
	public void Assignment4HomePageLib(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchForProduct(String searchParam) {
		hompagepo=new Assignment4HomePagePO(driver);
		hompagepo.enterValueInSearchBar(searchParam);
		hompagepo.clickSearchBtn();
	}

}
