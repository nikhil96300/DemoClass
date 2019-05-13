package ExtendDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class getscreenshot
{
	public static String capture(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = new String("F://Nikhil_imp_Software//ErrorScreenshots//"+screenshotName+".png");
		File destination = new File(dest);
		FileUtils.copyFile(src, destination);
		
		return dest;
	}
}
