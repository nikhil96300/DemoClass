package com.testng.ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void assertion(){
		System.setProperty("webdriver.gecko.driver", "F:\\Nikhil_imp_Software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.softwaretestingmaterial.com");
		
		
		String Title = "Software Testing Material";
		
		String GetTitle = driver.getTitle();
		System.out.println(GetTitle);
		
		System.out.println("Assertion starts here...");
		
		Assert.assertEquals(Title, GetTitle);
		
		System.out.println("A blog for Software Testers");
        driver.quit();		
	}
}
