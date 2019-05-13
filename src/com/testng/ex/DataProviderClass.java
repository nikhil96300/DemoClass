package com.testng.ex;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="data-provider")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][]
		{
			{"First Set of Data --------------"},
			{"Second Set of Data ****************"},
			{"Third Set of Data %%%%%%%%%%%%%%%%%%%%%"}
		};
	}
}
