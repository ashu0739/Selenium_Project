package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Execution Completed and TestCase Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Stopped and TestCase Failed");
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		logger.info("Screenshot Taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Execution Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
