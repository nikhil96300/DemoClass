package RunningTestNGProgrammatically;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTwo 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I am in Before Method");
	}
	@Test
	public void testOne()
	{
		System.out.println("I am in Simple Test Two");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am in Before Method");
	}
}
