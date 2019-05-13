package com.testng.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportDemo 
{
	  @Test
	  public void test1() 
	  {
		  System.out.println("TestNG 1 Example..");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void test11() 
	  {
		  System.out.println("TestNG 11 Example..");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void test12() 
	  {
		  System.out.println("TestNG 12 Example..");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void test2() 
	  {
		  System.out.println("TestNG 2 Example..");
		  Assert.assertTrue(false);
	  }
	  @Test
	  public void test122() 
	  {
		  System.out.println("TestNG 122 Example..");
		  Assert.assertTrue(true);
	  }
	  @Test(dependsOnMethods={"test2"})  // this will skip as it depends on test2 to pass but test 2 fails.
	  public void test3() 
	  {
		  System.out.println("TestNG 3 Example..");
		  Assert.assertTrue(true);
	  }
}
