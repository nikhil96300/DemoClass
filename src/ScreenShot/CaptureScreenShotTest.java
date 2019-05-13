package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenShotTest
{
	@Test
	public void captureScreenShot()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Nikhil_imp_Software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.automationtesting.in/");
		String str =  driver.getTitle();
		Assert.assertEquals("Home", str);
		driver.close();
	}
}
