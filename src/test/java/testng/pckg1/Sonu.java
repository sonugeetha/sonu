package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sonu {
	
  @Test(priority=1)
  public void tsetOne() {
	  System.out.println("Sonu_firstOne");
  }
  
  @Test(priority=2)
  public void testTwo() {
	  System.out.println("Sonu_secondOne");
  }
  
  @Test(priority=3)
  public void testThree() {
	  System.out.println("Sonu_thirdOne");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sonu_beforeMethod");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Sonu_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Sonu_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Sonu_afterClass");
  }

}
