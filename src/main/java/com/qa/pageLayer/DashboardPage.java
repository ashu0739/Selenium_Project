package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//input[@placeholder='Search for any Cryptocurrency or NSE listed company...'])[1]")
	public WebElement serachBox;

	public void searchCompanyName(String company_Name)
	{
		serachBox.sendKeys(company_Name);
	}

	@FindBy(linkText = "WIPRO")
	private WebElement wiproShare;

	public void clickOnCompanyNameWipro()
	{
		wiproShare.click();
	}

	@FindBy(partialLinkText = "AXIS")
	private WebElement axisShare;

	public void clickOnCompanyNameAxis()
	{
		axisShare.click();
	}
	
	@FindBy(partialLinkText = "GAIL")
	private WebElement gailShare;

	public void clickOnCompanyNameGail()
	{
		gailShare.click();
	}

}
