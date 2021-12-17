package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sonaa {
  @Test(priority=1)
  public void testOne() {
	  System.out.println("Sonaa_this is the firstOne");
  }
  
  @Test(priority=2)
  public void testTwo() {
	  System.out.println("Sonaa_this is the secondOne");
  }
  
  @Test(priority=3)
  public void testThree() {
	  System.out.println("Sonaa_this is the thirdOne");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

}
