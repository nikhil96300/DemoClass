package com.testng.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggingTest 
{
	@Test
	public void TestOne()
	{
		System.out.println("In TestOne");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TestTwo()
	{
		System.out.println("In TestTwo");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"TestTwo"})
	public void TestThree()
	{
		System.out.println("In Test Three");
		Assert.assertTrue(false);
	}
}
