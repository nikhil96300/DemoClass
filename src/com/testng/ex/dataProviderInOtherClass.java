package com.testng.ex;

import org.testng.annotations.Test;

public class dataProviderInOtherClass 
{
	@Test(dataProvider ="data-provider", dataProviderClass=DataProviderClass.class)
	public void SecondMethod(String param)
	{
		System.out.println(param);
	}
}
