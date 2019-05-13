package com.testng.ex;

import org.testng.annotations.Test;

public class childClass extends parentClass
{
	@Test(dependsOnMethods = {"parentAbc"} )
	public void abc()
	{
		System.out.println("abc");
	}
	
	@Test
	public void efg()
	{
		System.out.println("efg");
	}
}
