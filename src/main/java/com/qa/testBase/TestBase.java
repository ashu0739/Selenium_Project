package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dash;
	public ExchangePage buy;

	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("16 April EB Auto");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Automation Started");
	}

	@AfterClass
	public void end()
	{
		logger.info("Automation Stopped");
	}

	@BeforeMethod
	public void setUp()
	{
		logger.info("Browser Opened");
		String br = "chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.navigate().to("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		login = new LoginPage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		dash = new DashboardPage();
		buy = new ExchangePage();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Browser Closed");
	}
}
