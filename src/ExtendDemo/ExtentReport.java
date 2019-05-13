package ExtendDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
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
       
      extent.setSystemInfo("OS", "Windows 7");
      extent.setSystemInfo("Host Name", "Nikhil");
      extent.setSystemInfo("Environment", "QA");
      extent.setSystemInfo("User Name", "Nikhil Bhalerao");
       
      htmlReporter.config().setChartVisibilityOnOpen(true);
      htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
      htmlReporter.config().setReportName("My Report");
      htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
      htmlReporter.config().setTheme(Theme.DARK);
  }
   
   
  @Test
  public void Test1()
  {
      test = extent.createTest("functionality1Test1", "This is first report for extend --- Pass");
      Assert.assertTrue(true);
  }
  @Test
  public void Test2()
  {
      test = extent.createTest("functionality2Test2", "This is first report for extend --- False");
      Assert.assertTrue(false);
  }
  @Test
  public void Test3()
  {
      test = extent.createTest("functionality3Test3", "This is first report for extend --- Skiped");
      throw new SkipException("This test case is skiped");
  }
  
  @AfterMethod
  public void getResult(ITestResult result)
  {
      if(result.getStatus() == ITestResult.FAILURE)
      {
          test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
          test.fail(result.getThrowable());
      }
      else if(result.getStatus() == ITestResult.SUCCESS)
      {
          test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
      }
      else
      {
          test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.PURPLE));
          test.skip(result.getThrowable());
      }
  }
  
  @AfterSuite
  public void tearDown()
  {
      extent.flush();
  }
}
