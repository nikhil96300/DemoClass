package com.testng.ex;

import org.testng.annotations.Test;

public class TestWithPriority 
{
  @Test()
  public void signUp() 
  {
	  System.out.println("IN SIGNIN METHOD...");
  }
  
  @Test(priority=1)
  public void logIn() 
  {
	  System.out.println("IN logIn METHOD...");
  }
  
  @Test(priority=2)
  public void viewBanner() 
  {
	  System.out.println("IN viewBanner METHOD...\n");
  }
}
