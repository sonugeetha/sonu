package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sonaa2 {
  @Test
  public void TestOne() {
	  System.out.println("Sonaa2_this is the firstOne");
  }
  
  @Test
  public void testTwo() {
	  System.out.println("Sonaa2_this is the secondOne");
  }
  
  @Test
  public void testThree() {
	  System.out.println("Sonaa2_this is the thirdOne");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sonaa2_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Sonaa2_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Sonaa2_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Sonaa2_afterClass");
  }

}
