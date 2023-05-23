package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

public class TradingTest extends TestBase {

	@Test
	public void buyShareWipro() throws InterruptedException
	{
		dash.searchCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		buy.clickOnBuyButton1();
		Thread.sleep(2000);
		buy.clickOnLongTermButton1();
		Thread.sleep(2000);
		buy.clickOnMarketButton1();
		Thread.sleep(2000);
		buy.stockQuantity1(2);
		Thread.sleep(2000);
		buy.clickOnBuyButton2();
		Thread.sleep(2000);
		String actual_Output = buy.getbuyStatus1();
		System.out.println(actual_Output);
		String expected_Output = "Order Created successfully";
		Assert.assertEquals(actual_Output,expected_Output);
	}

	@Test
	public void buyShareAxis() throws InterruptedException
	{
		dash.searchCompanyName("AXIS");
		Thread.sleep(2000);
		dash.clickOnCompanyNameAxis();
		Thread.sleep(2000);
		buy.clickOnBuyButton1();
		Thread.sleep(2000);
		buy.clickOnLongTermButton1();
		Thread.sleep(2000);
		buy.clickOnMarketButton1();
		Thread.sleep(2000);
		buy.stockQuantity1(2);
		Thread.sleep(2000);
		buy.clickOnBuyButton2();
		Thread.sleep(2000);
		String actual_Output = buy.getbuyStatus1();
		System.out.println(actual_Output);
		String expected_Output = "Order Created ccessfully";
		Assert.assertEquals(actual_Output,expected_Output);
	}

	@Test
	public void sellShareWipro() throws InterruptedException
	{
		dash.searchCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		buy.clickOnSellButton1();
		Thread.sleep(2000);
		buy.clickOnLongTermButton2();
		Thread.sleep(2000);
		buy.clickOnMarketButton2();
		Thread.sleep(2000);
		buy.stockSellQuantity(5);
		Thread.sleep(2000);
		buy.clickOnSellButton2();
		Thread.sleep(2000);
		String actual_Output = buy.getSellStatus();
		System.out.println(actual_Output);
		String expected_Output = "Order Created successfully";
		Assert.assertEquals(actual_Output,expected_Output);
	}

	@Test
	public void buyShareGail() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.searchCompanyName("GAIL");
		Thread.sleep(2000);
		dash.clickOnCompanyNameGail();
		Thread.sleep(2000);
		buy.clickOnBuyButton3();
		Thread.sleep(2000);
		buy.clickOnLongTermButton3();
		Thread.sleep(2000);
		buy.clickOnMarketButton3();
		Thread.sleep(2000);
		buy.stockQuantity2(5);
		Thread.sleep(2000);
		buy.clickOnBuyButton4();
		Thread.sleep(2000);
		String actual_Output = buy.getBuyStatus3();
		System.out.println(actual_Output);
		String expected_Output = "Order Created successfully";
		Assert.assertEquals(actual_Output,expected_Output);
	}

	@Test
	public void sellShareGail() throws InterruptedException
	{
		dash.searchCompanyName("GAIL");
		Thread.sleep(2000);
		dash.clickOnCompanyNameGail();
		Thread.sleep(2000);
		buy.clickOnSellButton1();
		Thread.sleep(2000);
		buy.clickOnLongTermButton2();
		Thread.sleep(2000);
		buy.clickOnMarketButton2();
		Thread.sleep(2000);
		buy.stockSellQuantity(10);
		Thread.sleep(2000);
		buy.clickOnSellButton2();
		Thread.sleep(2000);
		String actual_Output = buy.getSellStatus();
		System.out.println(actual_Output);
		String expected_Output = "Order Created successfully";
		Assert.assertEquals(actual_Output,expected_Output);
	}
}
