package com.testng.ex;

import org.testng.annotations.Test;

public class TestWithInvocationCount 
{
	@Test
	  public void test1() 
	  {
		  System.out.println("TestNG 1 Example..");
	  }
	  @Test(invocationCount=4,invocationTimeOut=3000)
	  public void test2() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  System.out.println("TestNG 2 Example..");
	  }
	  @Test
	  public void test3() 
	  {
		  System.out.println("TestNG 3 Example..");
	  }
	  @Test
	  public void test4() 
	  {
		  System.out.println("TestNG 4 Example..");
	  }
	  @Test
	  public void test5() 
	  {
		  System.out.println("TestNG 5 Example..");
	  }
  
}
