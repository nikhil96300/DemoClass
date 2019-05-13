package RunningTestNGProgrammatically;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestngUsingCode 
{
	public void testNGXMLSuit()
	{
		System.out.println("In java XML");
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("ProgramSuite");
		
		XmlTest test = new XmlTest();
		test.setName("Program Test");
		
		XmlClass class1 = new XmlClass("RunningTestNGProgrammatically.SampleOne");
		classes.add(class1);
		
		XmlClass class2 = new XmlClass("RunningTestNGProgrammatically.SampleTwo");
		classes.add(class2);
		
		test.setXmlClasses(classes);
		
		suites.add(suite);
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
		System.out.println("END....");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		TestngUsingCode obj = new TestngUsingCode();
		obj.testNGXMLSuit();
		System.out.println("Main Ends...");
	}
}
