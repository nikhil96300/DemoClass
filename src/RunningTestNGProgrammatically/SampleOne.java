package RunningTestNGProgrammatically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleOne 
{
	@BeforeSuite
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Nikhil_imp_Software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	@AfterSuite
	public void closeDriver()
	{
		getDriver().close();
	}
	
	
	@Test
	public void testOne()
	{
		getDriver().get("");
		getDriver().findElement(By.xpath("")).sendKeys("");
		Assert.assertTrue(true);
		System.out.println("Pass Test Case One");
	}
	
	@Test
	public void testTwo()
	{
		Assert.assertEquals("Automation", "Automations");
		System.out.println("Pass Test Case One");
	}
	@Test
	public void testThree()
	{
		Assert.assertTrue(false);
	}
}
