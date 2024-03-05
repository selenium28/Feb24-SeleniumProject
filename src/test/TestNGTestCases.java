package test;

import org.testng.annotations.Test;

public class TestNGTestCases {
	
	@Test (enabled = true)
	  public void testCaseOne() {
		  System.out.println("TestCaseOne");
	  }
	
	@Test (enabled = true)
	  public void testCaseTwo() {
		  System.out.println("TestCaseTwo");
	  }
	
	@Test (enabled = true)
	  public void testCaseThree() {
		  System.out.println("TestCaseThree");
	  }
	
	@Test (enabled = false)
	  public void testCaseFour() {
		  System.out.println("TestCaseFour");
	  }
	
	@Test (enabled = false)
	  public void testCaseFive() {
		  System.out.println("TestCaseFive");
	  }
	
	@Test (enabled = false)
	  public void testCaseSix() {
		  System.out.println("TestCaseSix");
	  }

}
