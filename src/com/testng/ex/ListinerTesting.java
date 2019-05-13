package com.testng.ex;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListinerTesting implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test in onTestStart " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test in onTestSuccess " + result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test in onTestFailure " + result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test in onTestSkipped " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Test in onTestFailedButWithinSuccessPercentage " + result.getName());	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test in Suite Started " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("Test in Suite Fails " + context.getName());	
	}
	
}
