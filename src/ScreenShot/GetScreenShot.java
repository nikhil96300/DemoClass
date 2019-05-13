package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenShot extends MainTest
{	
	public static String capture(String ScreenName) throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"ErrorScreenShot/"+ScreenName+ ".png";
		File destination = new File(dest);
		FileUtils.copyFile(src, destination);
		
		return dest;
		
		
	}

	
}
