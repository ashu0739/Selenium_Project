package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase {

	public ExchangePage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[@class='active nav-link']")
	private WebElement buybtn1;

	public void clickOnBuyButton1()
	{
		buybtn1.click();
	}

	@FindBy(xpath = "(//label[text()='Long-term'])[1]")
	private WebElement longTermbtn1;

	public void clickOnLongTermButton1()
	{
		longTermbtn1.click();
	}

	@FindBy(xpath = "(//label[text()='Market'])[1]")
	private WebElement marketbtn1;

	public void clickOnMarketButton1()
	{
		marketbtn1.click();
	}

	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement stockqty1;

	public void stockQuantity1(int qty)
	{
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 300).perform();
		stockqty1.click();
		stockqty1.sendKeys(String.valueOf(qty));
	}

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement buybtn2;

	public void clickOnBuyButton2()
	{
		buybtn2.click();
	}

	@FindBy(xpath = "//div[text()='Order Created successfully']")
	private WebElement status1;

	public String getbuyStatus1()
	{
		String result = status1.getText();
		return result;
	}

	@FindBy(xpath = "//a[contains(text(),'Sell')]")
	private WebElement sellbtn1;

	public void clickOnSellButton1()
	{
		sellbtn1.click();
	}

	@FindBy(xpath = "(//label[text()='Long-term'])[2]")
	private WebElement longtermbtn2;

	public void clickOnLongTermButton2()
	{
		longtermbtn2.click();
	}

	@FindBy(xpath = "(//label[text()='Market'])[2]")
	private WebElement marketbtn2;

	public void clickOnMarketButton2()
	{
		marketbtn2.click();
	}

	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement sellquantity;

	public void stockSellQuantity(int qty)
	{
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 300).perform();
		sellquantity.click();
		sellquantity.sendKeys(String.valueOf(qty));
	}

	@FindBy(xpath = "//button[contains(text(),'Sell')]")
	private WebElement sellbtn2;

	public void clickOnSellButton2()
	{
		sellbtn2.click();
	}

	@FindBy(xpath = "//div[text()='Order Created successfully']")
	private WebElement status2;

	public String getSellStatus()
	{
		String result = status2.getText();
		return result;
	}

	@FindBy(xpath="//a[contains(text(),'Buy')]")
	public WebElement buybtn3;

	public void clickOnBuyButton3()
	{
		buybtn3.click();
	}

	@FindBy(xpath="(//label[text()='Long-term'])[1]")
	public WebElement long_term_btn3;

	public void clickOnLongTermButton3()
	{
		long_term_btn3.click();
	}

	@FindBy(xpath = "(//label[text()='Market'])[1]")
	private WebElement marketbtn3;

	public void clickOnMarketButton3()
	{
		marketbtn3.click();
	}

	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement stockqty2;

	public void stockQuantity2(int qty)
	{
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 300).perform();
		stockqty2.click();
		stockqty2.sendKeys(String.valueOf(qty));
	}

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement buybtn4;

	public void clickOnBuyButton4()
	{
		buybtn4.click();
	}

	@FindBy(xpath = "//div[text()='Order Created successfully']")
	private WebElement status3;

	public String getBuyStatus3()
	{
		String result = status3.getText();
		return result;
	}
}
