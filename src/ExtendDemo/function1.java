package ExtendDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
public class function1 extends BaseTest
{
    @Test
    public void functionality1Test1()
    {
    	  test = extent.createTest("Capture Screen Shot");
		  driver = new FirefoxDriver();
		  driver.get("http://automationtesting.in/");
		  String title =  driver.getTitle();
		  Assert.assertEquals("Home-Automation Test", title);
		  test.info(MarkupHelper.createLabel("go to take screenshot", ExtentColor.PURPLE));
    }
     
    @Test
    public void functionality1Test2()
    {
        test = extent.createTest("functionality1Test2");
        Assert.assertEquals("Krishna", "Sakinala");
    }
     
    @Test
    public void functionality1Test3()
    {
        test = extent.createTest("functionality1Test3");
        Assert.assertNotEquals("Krishna", "Krishna");
    }
}
