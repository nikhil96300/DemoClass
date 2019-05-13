package ExtendDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class logGenerations 
{
	public static ExtentHtmlReporter htmlReporter;
	  public static ExtentReports extent;
	  public static ExtentTest test;
	   
	  @BeforeSuite
	  public void setUp()
	  {
	      htmlReporter = new ExtentHtmlReporter("F:\\Nikhil_imp_Software\\Demo_Report\\MyOwnReport.html");
	      extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	  }
	

  @Test
  public void generateLog() 
  {
	  test = extent.createTest("Log Generation");
	  test.log(Status.INFO, "Create log");
	  test.log(Status.INFO, "I am in actual test case");
	  test.log(Status.INFO, "Wc can write the actusl test logic in this test");
	  
	  //USING LABEL
	  
	  test.info(MarkupHelper.createLabel("This is Test Logger", ExtentColor.AMBER));
	  test.info(MarkupHelper.createLabel("This is Test Logger", ExtentColor.CYAN));
	  test.info(MarkupHelper.createLabel("This is Test Logger", ExtentColor.CYAN));
	  test.info(MarkupHelper.createLabel("This is Test Logger", ExtentColor.PURPLE));
	  test.info(MarkupHelper.createLabel("This is Test Logger", ExtentColor.TEAL));  
  }
  @AfterTest
  public void afterTest()
  {
	  extent.flush();
  }
}
