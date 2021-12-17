package framework.functionlibray;
import org.openqa.selenium.WebDriver;
import framework.pageobjects.Assignment4ProductPagePO;


public class Assignment4ProductPageLib {

	WebDriver driver;
	Assignment4ProductPagePO propagpo;

	public Assignment4ProductPageLib(WebDriver driver) {
		this.driver = driver;
	}

	public void addVerify() throws InterruptedException {
		propagpo = new Assignment4ProductPagePO(driver);
		propagpo.addToCart();
		Thread.sleep(5000);
		propagpo.verifyCart();
	}

}