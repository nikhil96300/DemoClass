package com.testng.ex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass 
{
	@Test(dataProvider="data-provider")
	public void firstTest(String param)
	{
		System.out.println(param);
	}
	
	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod()
	{
		return new Object[][]
		{
			{"First Set of Data"},
			{"Second Set of Data"}
		};
	}
}
