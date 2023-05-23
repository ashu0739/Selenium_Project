package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {

	public static void takeSS(String name) 
	{
		try 
		{
			TakesScreenshot ts = ((TakesScreenshot)driver);
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = "C:\\VelocityTraining\\Setup\\Eclipse_IDE_2022_03\\Eclipse_WorkSpace_2022_03\\16AprilEBDalalstreet\\screenshots\\";

			File des = new File(path+name+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e)
		{
			logger.info("Please provide correct path");
		}
	}

}
