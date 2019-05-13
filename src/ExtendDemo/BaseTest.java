package ExtendDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest 
{
	  public static ExtentHtmlReporter htmlReporter;
	  public static ExtentReports extent;
	  public static ExtentTest test;
	  WebDriver driver;
	   
	  @BeforeSuite
	  public void setUp()
	  {
	      htmlReporter = new ExtentHtmlReporter("F:\\Nikhil_imp_Software\\Demo_Report\\MyOwnReport.html");
	      extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	  }

	  
	  @AfterMethod
	  public void getResult(ITestResult result) throws IOException
	  {
		  if(result.getStatus()==ITestResult.FAILURE)
		  {
			  String screenShotPath = getscreenshot.capture(driver, "SCREENSSHOTNAME");
			  test.fail(MarkupHelper.createLabel(result.getTestName()+"TEST CASE FAIL", ExtentColor.RED));
			  test.fail(result.getThrowable());
			  test.fail("SCREENSHOT BELOW : "+test.addScreenCaptureFromPath(screenShotPath));
		  }
		  else if(result.getStatus()==ITestResult.SUCCESS)
		  {
			  test.pass(MarkupHelper.createLabel(result.getName()+"Test Pass", ExtentColor.GREEN));
		  }
		  if(result.getStatus()==ITestResult.SKIP)
		  {
			  test.skip(MarkupHelper.createLabel(result.getName()+"Test Case Skipped", ExtentColor.ORANGE));
			  test.skip(result.getThrowable());
		  }
	  }
	  
	  @AfterSuite
	  public void tearDown()
	  {
		  extent.flush();
	  }
}
