package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void verifyLoginTest()
	{
		LoginPage login = new LoginPage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
	}

}
