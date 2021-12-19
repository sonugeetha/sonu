package framework.functionlibray;

import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import framework.pageobjects.SearchResultsPO;

public class Assignment4SearchResultsLib {
	
	WebDriver driver;
	SearchResultsPO searespo;
	
	public Assignment4SearchResultsLib(WebDriver driver){
		this.driver=driver;
	}
	
	public List<String> getListOfProdNames() {
		searespo=new SearchResultsPO(driver);
		List<WebElement> oList=searespo.returnSearchResultList();
		List<String> searchResultProdNames=new LinkedList<String>();
		for(WebElement oelem : oList) {
			String prodName=oelem.getText().trim();
			searchResultProdNames.add(prodName);
			
		}
		return searchResultProdNames;
	}
	
	public void clickFirstSearchResultLink(int resultNum) {
		searespo=new SearchResultsPO(driver);
		List<WebElement> oList=searespo.returnSearchResultList();
		oList.get(resultNum-1).click();
	}
	

}
