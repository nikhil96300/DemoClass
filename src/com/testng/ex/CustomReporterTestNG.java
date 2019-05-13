package com.testng.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomReporterTestNG
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
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"TestTwo"})
	public void TestThree()
	{
		System.out.println("In TestTwo");
		Assert.assertTrue(false);
	}
}
