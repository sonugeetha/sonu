package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sonu2 {
	
  @Test
  public void firstOne() {
	  System.out.println("Sonu2_first");
  }
  
  @Test
  public void firstTwo() {
	  System.out.println("Sonu2_second");
  }
  
  @Test
  public void firstThree() {
	  System.out.println("Sonu2_third");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sonu2_beforeMethod");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Sonu2_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Sonu2_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Sonu2_afterClass");
  }

}
