package test;

import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority = 1)
	public void testCaseOne() {
		System.out.println("testCaseOne");
	}
	
	@Test (priority = 0)
	public void testCaseTwo() {
		System.out.println("testCaseTwo");
	}
	
	@Test (priority = -3)
	public void testCaseThree() {
		System.out.println("testCaseThree");
	}
	
	@Test (priority = -4)
	public void testCaseFour() {
		System.out.println("testCaseFour");
	}
	
}
