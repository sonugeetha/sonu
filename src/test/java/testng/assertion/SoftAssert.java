package testng.assertion;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void softAssertTest() {
		org.testng.asserts.SoftAssert sf=new org.testng.asserts.SoftAssert();
		
		sf.assertEquals("Sonu","Sonu");
		sf.assertEquals("ss","ss");
		sf.assertEquals("sonu@gmail.com","sonu@gmail.com");
		sf.assertEquals("","6363666510");
		sf.assertEquals("","testing");
		
		sf.assertAll();
	}

}
