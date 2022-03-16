package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGTutorials {

	//PreConditions
	@BeforeSuite //1
	public void setupSuite()
	{
		//WebDriver driver = new FirefoxDriver();
		System.out.println("set up Firefox browser");
	}

	@BeforeClass //2
	public void launchBrowser() 
	{

		System.out.println("Launch the browser");
	}

	@BeforeTest() // 3
	public void enterURL()
	{
		System.out.println("enter URL on the address bar");
	}


	@BeforeMethod() //4
	public void login()
	{
		System.out.println("Login to yahoo.com");
	}


	//Testcases
	//5
	@Test(priority=1, description = "This testcase is used to Sign in to yahoo.com")
	public void verifyPageTitle()
	{
		System.out.println("verify title");
		//driver.findElement(arg0)
		//Assert.assertEquals(10, 12);

	}
//7
	@Test(priority=3, description = "This testcase is used to click on mail link")
	public void clickItems()
	{
		System.out.println("Click on Email link");
	}
//6
	@Test(priority=2, description = "This testcase is used to logout of Yahoo.com")
	public void logut()
	{
		System.out.println("logout of Yahoo application");
	}

//8
	//Postconditions
	@AfterTest
	public void logout()
	{
		System.out.println("-----logout------");
	}

	@AfterClass  //9
	public void closeBrowser()
	{
		System.out.println("-----Close Browser------");
	}

	@AfterSuite //10
	public void generateReport()
	{
		System.out.println("-----Generate Report------");
	}

}


/*enter URL on the address bar
Launch the browser
Login to yahoo.com
Login to yahoo.com
logout of Yahoo application
Login to yahoo.com
Click on Email link
-----Close Browser------
-----logout------*/
