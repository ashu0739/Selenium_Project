package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailbox;

	public void enterEmailAddress()
	{
		emailbox.sendKeys("ashishramane1996@gmail.com");
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordbox;

	public void enterPassword()
	{
		passwordbox.sendKeys("aashish1996");
	}

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	private WebElement loginbtn;

	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
}
