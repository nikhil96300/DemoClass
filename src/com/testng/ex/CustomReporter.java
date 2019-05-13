package com.testng.ex;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) 
	{
		//iterating over each suite including in the test
		for(ISuite suite : suites)
		{
			String suiteName = suite.getName();
			//getting the results for the said suits
			Map<String, ISuiteResult> suiteResult = suite.getResults();
			for(ISuiteResult sr : suiteResult.values())
			{
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed tests for Suite "+ suiteName + "is :" + tc.getPassedTests().getAllResults().size());
				
				System.out.println("Failed tests for Suite "+ suiteName + "is :" + tc.getFailedTests().getAllResults().size());
				
				System.out.println("Skipped tests for Suite "+ suiteName + "is :" + tc.getFailedTests().getAllResults().size());
				
			}
		}
		
		
	}

}
