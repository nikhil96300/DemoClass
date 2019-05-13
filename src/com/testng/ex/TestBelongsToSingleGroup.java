package com.testng.ex;
import org.testng.annotations.Test;

public class TestBelongsToSingleGroup 
{
	@Test(groups={"Sanity-Group"})
	public void testOne()
	{
		System.out.println("This Belongs to Sanity Group");
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("This does not Belongs to Any Group");
	}
	
	@Test(groups={"Sanity-Group"})
	public void testThree()
	{
		System.out.println("This Belongs to Sanity Group");
	}
	
	@Test(groups={"Sanity-Group","regression-group"})
	public void testFour()    //Test Coming Under Multiple Group
	{
		System.out.println("This does Belongs to Sanity and Regression Group");
	}
}
