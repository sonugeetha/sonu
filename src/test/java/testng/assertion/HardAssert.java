package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void hardAssertTest() {
		
		Assert.assertEquals("Sonu","Sonu");
		Assert.assertEquals("ss","ss");
		Assert.assertEquals("sonu@gmail.com","sonu@gmail.com");
		Assert.assertEquals("6363666510","6363666510");
		Assert.assertEquals("testing","testing");
		//Assert.assertEquals("","6363666510");
		//Assert.assertEquals("","testing");
		
	}

}


//Create an employee
		//First name, last name, email address. phone number, department.....
		
		//Firstname = Abcd
		//Last name = efgh
		//email = abcd@gmail.com
		//phone number = 1122334455
		//department = testing
		
	