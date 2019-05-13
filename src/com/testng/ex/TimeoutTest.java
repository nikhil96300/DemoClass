package com.testng.ex;

import org.testng.annotations.Test;

public class TimeoutTest 
{
  @Test(timeOut=2500)
  public void Test2()
  {
	  try 
	  {
		Thread.sleep(2000);
	  } 
	  catch (InterruptedException e) 
	  {
		e.printStackTrace();
	  }
  }
}
