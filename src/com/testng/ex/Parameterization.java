package com.testng.ex;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization
{
	@Parameters({"suite-level-peram"})
	@Test
	public void FirstTest(String param)
	{
		System.out.println(param);
	}
	
	@Parameters({"test-level-peram"})
	@Test
	public void SecondTest(String param)
	{
		System.out.println(param);
	}
	
	@Parameters({"suite-level-peram","test-level-peram1"})
	@Test
	public void ThirdTest(String suiteparam, String testparam)
	{
		System.out.println(suiteparam +" ***** "+testparam);
	}
}
