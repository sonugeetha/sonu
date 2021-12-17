package framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment4HomePagePO {
	WebDriver driver;
	
	public Assignment4HomePagePO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBar;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement submitBtn ;
	
	public void enterValueInSearchBar(String searchParam) {
		searchBar.clear();
		searchBar.sendKeys(searchParam);
	}
	public void clickSearchBtn() {
		submitBtn.click();
	}
	
	
}