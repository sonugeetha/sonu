package testng.assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert1 {
	
	org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp(){
		sf = new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority = 1)
	public void createEmployee(){		
		sf.assertEquals("sonu", "sonu");
		sf.assertEquals("Nigam", "Nigam");
		sf.assertEquals("sonu@gmail.com", "sonu@gmail.com");
		sf.assertEquals("", "6363666510");
		sf.assertEquals("", "testing");
	    sf.assertAll();
	}
	
	@Test (priority = 2)
	public void updateEmployee(){
		//Steps will come here
		sf.assertTrue(true);
		sf.assertAll();
	}

}