package ExtendDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class capturingScreenShot 
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
	  
	  @Test
	  public void captureScreenShot()
	  {
		  test = extent.createTest("Capture Screen Shot");
		  driver = new FirefoxDriver();
		  driver.get("http://automationtesting.in/");
		  String title =  driver.getTitle();
		  
		  Assert.assertEquals("Home-Automation Test", title);
	  }
	  
	  @AfterMethod
	  public void myResult(ITestResult result) throws IOException
	  {
		  if(result.getStatus()==ITestResult.FAILURE)
		  {
			  String screenShotPath = getscreenshot.capture(driver, "SCREENSSHOTNAME");
			  test.fail(MarkupHelper.createLabel(result.getTestName()+"TEST CASE FAIL", ExtentColor.RED));
			  test.fail(result.getThrowable());
			  test.fail("SCREENSHOT BELOW : "+test.addScreenCaptureFromPath(screenShotPath));
		  }
	  }
	  
	  @AfterTest
	  public void testDown()
	  {
		  extent.flush();
	  }
}
