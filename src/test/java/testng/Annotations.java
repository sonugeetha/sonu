package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations {
  @Test(priority=1,groups= {"regression"})
  public void createEntityTest() {
	  System.out.println("Anotations_testOne");
  }
  
  @Test(priority=2,groups= {"regression","smoke"})
  public void updateEntityTest() {
	  System.out.println("Annotations_testTwo");
  }
  
  @Test(priority=3,groups= {"smoke"})
  public void deleteEntityTest() {
	  System.out.println("Annotations_testThree");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations_beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations_afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations_beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations_afterClass");
  }

}


// before suite, before test, before class, before method, testOne, after method, after class, after test, after suite
//before suite, before test, before class, before method, testOne, after method, before method, testTwo, after method, after class, after test, after suite
