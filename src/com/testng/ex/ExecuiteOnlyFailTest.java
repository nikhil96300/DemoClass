package com.testng.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuiteOnlyFailTest
{
	@Test
	public void TestOne()
	{
		Assert.assertTrue(true);
		System.out.println("Test One Pass as The Assert is True..");
	}
	
	@Test
	public void TestTwo()
	{
		Assert.assertTrue(1>0);
		System.out.println("Test Two Pass as The Assert is True..");
	}
	
	@Test
	public void TestThree()
	{
		Assert.assertTrue(1>0);
		System.out.println("Test three Fail as The Assert is 1 is not lessthan zero..");
	}
	
	@Test
	public void TestFour()
	{
		Assert.assertTrue(false);
		System.out.println("Test four Fail as The Assert is False..");
	}
}
